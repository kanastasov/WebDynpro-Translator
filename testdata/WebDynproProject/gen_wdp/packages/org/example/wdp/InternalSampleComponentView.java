// ---------------------------------------------------------------------------
// This file has been generated by the Web Dynpro Code Generator
// DON'T MODIFY!!! CHANGES WILL BE LOST WHENEVER THE FILE GETS GENERATED AGAIN
// ---------------------------------------------------------------------------
package org.example.wdp;

import com.sap.tc.logging.Location;
import com.sap.tc.webdynpro.progmodel.api.*;
import com.sap.tc.webdynpro.progmodel.context.*;
import com.sap.tc.webdynpro.progmodel.gci.*;

public class InternalSampleComponentView
  implements IPrivateSampleComponentView, com.sap.tc.webdynpro.progmodel.gci.IGCIViewDelegate
{

  /**
   * Location for this controller.
   */
  private static final Location logger = Location.getLocation(InternalSampleComponentView.class);

  /**
   * Framework implementation of Controller that delegates to this.
   */
  private final com.sap.tc.webdynpro.progmodel.gci.IGCIView wdAlterEgo;

  /**
   * Delegate that implements application defined logic
   */
  private final org.example.SampleComponentView delegate;


  // ---- Context --------------------------------------------------------------

  IGCINodeInfo infoContext;

  {

    infoContext = GCIContext.createNode("Context", null, true, true, false, true, false, true, null,
      (IGCIAttributeInfo[])null, // no attributes
      (IGCINodeInfo[])null // no child nodes
    );

  }
  
  private IContextNode contextNode;

  private void wdInitContextNode() {
    contextNode = new IContextNode(this, infoContext, (Node)null);
  }

  public IWDNode wdGetRootNode() {
    return contextNode;
  }

  public IContextNode wdGetContext() {
    return contextNode;
  }


  // ---- Actions --------------------------------------------------------------

  /**
   * Create a new action for this controller. A unique name for the action is generated automatially.
   * @param eventHandler is the action's eventhandler with proper signature
   * @param text is the text displayed in the UI element triggering this action
   */
  public IWDAction wdCreateAction(WDActionEventHandler eventHandler, String text) {
    return wdAlterEgo.createAction(null, eventHandler, text, null);
  }

  /**
   * Create a new action with the given name for this controller
   * @param eventHandler is the action's eventhandler with proper signature
   * @param name is the action's name
   * @param text is the text displayed in the UI element triggering this action
   */
  public IWDAction wdCreateNamedAction(WDActionEventHandler eventHandler, String name, String text) {
    return wdAlterEgo.createAction(name, eventHandler, text, null);
  }

  // ---- Controller part ------------------------------------------------------

  /**
   * Creates a new instance of this controller.
   */
  public InternalSampleComponentView(com.sap.tc.webdynpro.progmodel.gci.IGCIView alterEgo) {
    this.wdAlterEgo = alterEgo;
    wdInitContextNode();
    this.delegate = new org.example.SampleComponentView((IPrivateSampleComponentView) this);
  }

  /**
   * Returns the public API for this controller instance.
   */
  public com.sap.tc.webdynpro.progmodel.api.IWDViewController wdGetAPI() {
    return (com.sap.tc.webdynpro.progmodel.api.IWDViewController) wdAlterEgo;
  }

  /**
   * Hook method called to initialize view controller.
   */
  public void wdDoInit() {
    logger.pathT("entering: wdDoInit");
    delegate.wdDoInit();
    logger.pathT("exiting: wdDoInit"); 
  }

  /**
   * Hook method called to clean up view controller.
   */
  public void wdDoExit() {
    logger.pathT("entering: wdDoExit");
    delegate.wdDoExit();
    logger.pathT("exiting: wdDoExit"); 
  }

  public Object wdInvokeEventHandler(String handlerName, IWDCustomEvent event)
    throws NoSuchMethodException {
    
    logger.pathT("entering: wdInvokeEventHandler", new Object[] { handlerName } );
    try {
      throw new NoSuchMethodException("Eventhandler " + handlerName + " not found for event " + event.getName());
    } finally {
      logger.pathT("exiting: wdInvokeEventHandler"); 
    }
  }


  // ---- UI Tree ---------------------------------------------------------

  // create UI tree
  public com.sap.tc.webdynpro.progmodel.api.IWDViewElement wdCreateUITree()
  {

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTransparentContainer _RootUIElementContainer
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTransparentContainer)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTransparentContainer.class,
          "RootUIElementContainer");  
    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowLayout _RootUIElementContainer__Layout
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowLayout)
        _RootUIElementContainer.createLayout(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowLayout.class);

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTextView _DefaultTextView
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTextView)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTextView.class,
          "DefaultTextView");  
    _DefaultTextView.setText(wdAlterEgo.getLocalizedText("view.SampleComponentView.DefaultTextView.text"));
    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData _DefaultTextView__LayoutData
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData)
        _DefaultTextView.createLayoutData(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData.class);
    _RootUIElementContainer.addChild(_DefaultTextView);
    _RootUIElementContainer.addChild(wdCreateUITreeForTransparentContainer());
    return (_RootUIElementContainer);
  }

  // create UI tree for TransparentContainer
  private com.sap.tc.webdynpro.progmodel.api.IWDUIElement wdCreateUITreeForTransparentContainer()
  {

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTransparentContainer _TransparentContainer
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTransparentContainer)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTransparentContainer.class,
          "TransparentContainer");  
    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData _TransparentContainer__LayoutData
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData)
        _TransparentContainer.createLayoutData(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData.class);
    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowLayout _TransparentContainer__Layout
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowLayout)
        _TransparentContainer.createLayout(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowLayout.class);

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDButton _Button
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDButton)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDButton.class,
          "Button");  
    _Button.setText(wdAlterEgo.getLocalizedText("view.SampleComponentView.TransparentContainer.Button.text"));
    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData _Button__LayoutData
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData)
        _Button.createLayoutData(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData.class);
    _TransparentContainer.addChild(_Button);

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTextView _TextView
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTextView)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTextView.class,
          "TextView");  
    _TextView.setText(wdAlterEgo.getLocalizedText("view.SampleComponentView.TransparentContainer.TextView.text"));
    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData _TextView__LayoutData
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData)
        _TextView.createLayoutData(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData.class);
    _TransparentContainer.addChild(_TextView);
    return (_TransparentContainer);
  }
  

  /**
   * Hook method called to modify view before rendering. Access to UI elements
   * is via the given view API only!
   * 
   * @param firstTime indicates whether the hook is called for the first time
   * during the lifetime of this view
   */
  public void wdDoModifyView(IWDView view, boolean firstTime) {
    logger.pathT("entering: doModifyView");
    org.example.SampleComponentView.wdDoModifyView((IPrivateSampleComponentView) this, (IPrivateSampleComponentView.IContextNode) this.wdGetContext(), view, firstTime);
    logger.pathT("exiting: doModifyView"); 
  }


}
