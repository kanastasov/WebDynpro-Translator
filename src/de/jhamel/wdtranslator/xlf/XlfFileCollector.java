package de.jhamel.wdtranslator.xlf;

import de.jhamel.file.filters.ContainsFilenameFilter;
import de.jhamel.file.filters.EndsWithFilenameFilter;
import de.jhamel.file.FileProcessor;
import de.jhamel.file.TraverseDirectory;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.*;

public class XlfFileCollector implements FileProcessor {

    private static Logger log = Logger.getLogger(XlfFileCollector.class);

    private List<Word> words = new ArrayList<Word>();
    private HashMap<File, List<Word>> xlfWordsByFile = new HashMap<File, List<Word>>();
    private HashMap<Locale, List<Word>> xlfWordsByLocale = new HashMap<Locale, List<Word>>();
    private HashMap<String, List<Word>> xlfWordsByWord = new HashMap<String, List<Word>>();
    private HashMap<String, Word> xlfWordByLanguagePlusKey = new HashMap<String, Word>();
    private String basedir;

    public XlfFileCollector() {
    }

    public XlfFileCollector(String basedir) {
        this.basedir = basedir;
    }

    public void replaceTranslationsForGivenDefaultWord(String defaultWordText, Locale locale, String translation) {
        List<Word> words = getWordByDefaultText(defaultWordText);
        for (Word word : words) {
            Word wordEn = word.getTranslationByLocale(locale);
            if (wordEn == null) {
                continue;
            }
            wordEn.setText(translation);
            wordEn.store();
        }
    }

    private List<Word> getWordByDefaultText(String defaultWordText) {
        List<Word> wordsDefault = new ArrayList<Word>();
        for (Word word : words()) {
            if (word.getText().equals(defaultWordText)) {
                wordsDefault.add(word);
            }
        }
        return wordsDefault;
    }


    public void scanXlfFiles() {
        TraverseDirectory traverseDirectory = new TraverseDirectory(basedir, this);
        traverseDirectory.addFilenameFilter(new EndsWithFilenameFilter(".xlf"));
        traverseDirectory.addFilenameFilter(new ContainsFilenameFilter(File.separator+"bin"+File.separator));
        traverseDirectory.processFiles();
    }

    public void processFile(File file) {
        log.trace("Processing file '" + file.getName() + "'");
        addByFile(file);  // must be first add, because others depend on it
        addByLocale(file);
        addByWord(file);
        addByUniqueId(file);
    }

    private void addByUniqueId(File file) {
        for (Word word : wordsInFile(file)) {
            xlfWordByLanguagePlusKey.put(word.getUniqueId(), word);
        }
    }

    public List<Word> words() {
        if (words.size() > 0) return words;
        words = getWordsByLocale(Locale.getDefault());

        for (Locale locale : translationLanguages()) {
            for (Word word : words) {
                Word translatedWord = xlfWordByLanguagePlusKey.get(Word.generateUniqueIdentifier(locale, word.getKey()));
                if (translatedWord != null) word.addTranslation(translatedWord);
            }
        }
        return words;
    }

    private Set<Locale> translationLanguages() {
        Set<Locale> translationLanguages = xlfWordsByLocale.keySet();
        translationLanguages.remove(Locale.getDefault());
        return translationLanguages;
    }

    public List<Word> getWordsByLocale(Locale locale) {
        List<Word> wordsList = xlfWordsByLocale.get(locale);
        if (wordsList == null) {
            wordsList = new ArrayList<Word>();
        }
        xlfWordsByLocale.put(locale, wordsList);
        return wordsList;
    }

    public List<Word> wordsInFile(File file) {
        List<Word> wordsList = xlfWordsByFile.get(file);
        if (wordsList == null) {
            wordsList = new ArrayList<Word>();
        }
        xlfWordsByFile.put(file, wordsList);
        return wordsList;
    }

    public List<Word> getWordsByWord(String word) {
        List<Word> wordsList = xlfWordsByWord.get(word);
        if (wordsList == null) {
            wordsList = new ArrayList<Word>();
        }
        xlfWordsByWord.put(word, wordsList);
        return wordsList;
    }

    private List<Word> retrieveWordsOfFile(File file) {
        return new TransUnitToWordConverter(file).convertTransUnitsToWords();
    }

    private void addByFile(File file) {
        List<Word> wordsList = wordsInFile(file);
        wordsList.addAll(retrieveWordsOfFile(file));
    }

    private void addByLocale(File file) {
        Locale localeOfFile = LocaleUtil.localeOfFile(file);
        List<Word> wordsList = getWordsByLocale(localeOfFile);
        wordsList.addAll(wordsInFile(file));
    }

    private void addByWord(File file) {
        List<Word> words = wordsInFile(file);
        for (Word word : words) {
            List<Word> wordsList = getWordsByWord(word.getText());
            wordsList.add(word);
            xlfWordsByWord.put(word.getText(), wordsList);
        }
    }

}
