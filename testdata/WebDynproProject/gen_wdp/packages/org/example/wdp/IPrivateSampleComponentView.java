// ---------------------------------------------------------------------------
// This file has been generated by the Web Dynpro Code Generator.
// DO NOT MODIFY! CHANGES WILL BE LOST IF THE FILE IS REGENERATED.
// ---------------------------------------------------------------------------
package org.example.wdp;

import com.sap.tc.webdynpro.progmodel.api.*;
import com.sap.tc.webdynpro.progmodel.context.*;
import com.sap.tc.webdynpro.progmodel.gci.*;

/** Interface that is provided to application class. */

public interface IPrivateSampleComponentView {

  /**
   * Provides access to the generic API of this controller.
   */
  IWDViewController wdGetAPI();


  /**
   * Interface for the node 'Context'.
   *
   * singleton = true, cardinality = _1_1, selection = _1_1
   */
  public static class IContextNode extends Node
  {
    private InternalSampleComponentView gen_delegate;

    IContextNode(InternalSampleComponentView delegate, IGCINodeInfo nodeInfo, Node parent) {
      super(nodeInfo, parent);
      gen_delegate = delegate;
    }

    protected com.sap.tc.webdynpro.progmodel.context.Node createNode(IGCINodeInfo nodeInfo, com.sap.tc.webdynpro.progmodel.context.Node parentNode, com.sap.tc.webdynpro.progmodel.context.NodeElement parentElement) {
      if (nodeInfo == gen_delegate.infoContext)
        return new IPrivateSampleComponentView.IContextNode(gen_delegate, nodeInfo, parentNode);
      return super.createNode(nodeInfo, parentNode, parentElement);
    }

    protected com.sap.tc.webdynpro.progmodel.context.NodeElement doCreateElement(IGCINodeInfo nodeInfo, Object reference) {
      if (nodeInfo == gen_delegate.infoContext) {
        return new IPrivateSampleComponentView.IContextElement(gen_delegate, nodeInfo);
      }
      return super.doCreateElement(nodeInfo, reference);
    }

    // ---- typed accessors --------------------------------------------------

    /**
     * Provides access to the generic context API as described by IWDContext.
     */
    public IWDContext wdGetAPI() {
      return getContext();
    }

    /**
     * Creates a new element for this node. The element is <b>not</b> bound 
     * to the node. Use {@link #bind(IContextElement)} or 
     * {@link IWDNode#bind(Collection)} to bind it or {@link IWDNode#addElement(IWDNodeElement)}
     * to add it to the node.
     * @return an element for this node
     */
    public IPrivateSampleComponentView.IContextElement createContextElement() {
      return (IPrivateSampleComponentView.IContextElement)createElement();
    }

    /**
     * Binds a single IContextElement to the node.
     * @param element a node element for this node
     */
    public void bind(IPrivateSampleComponentView.IContextElement element) {
      bind(element == null ? java.util.Collections.EMPTY_LIST : java.util.Collections.singletonList(element));
    }

    /** 
     * Returns the element at the lead selection.
     * @return the element at the lead selection or <code>null</code> if the
     *         lead selection is not set
     */
    public IPrivateSampleComponentView.IContextElement currentContextElement() {
      return (IPrivateSampleComponentView.IContextElement) getCurrentElement();
    }

    // ---- hooks ------------------------------------------------------------

    // ---- child nodes ------------------------------------------------------------

  }

  /**
   * Interface for the elements of the node Context.
   */
  public static class IContextElement extends com.sap.tc.webdynpro.progmodel.context.NodeElement
  {
    private InternalSampleComponentView gen_delegate;

    public IContextElement(InternalSampleComponentView delegate, com.sap.tc.webdynpro.progmodel.gci.IGCINodeInfo info) {
      super(info);
      gen_delegate = delegate;
    }

  }

  /**
   * Returns the context root node.
   * @return the context root node.
   */
  IContextNode wdGetContext();

  /** Enumeration of all available action event handlers. */
  public final class WDActionEventHandler extends com.sap.tc.webdynpro.progmodel.gci.GCIActionEventHandlerEnum
  {

    private WDActionEventHandler(String value, boolean isValidating, Object[] declaredParameters) {
      super(value, isValidating, declaredParameters);
    }
  }

  /**
   * Creates a new action for this controller.
   * @param eventHandler is the action's event handler with an appropriate signature
   * @param text is the text displayed in the UI element triggering this action
   */
  IWDAction wdCreateAction(WDActionEventHandler eventHandler, String text);

  /**
   * Creates a new action with the given name for this controller.
   * @param eventHandler is the action's event handler with an appropriate signature
   * @param name is the action's name
   * @param text is the text displayed in the UI element triggering this action
   */
  IWDAction wdCreateNamedAction(WDActionEventHandler eventHandler, String name, String text);

}
