package AgentLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import jetbrains.mps.scope.Scope;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.scopes.runtime.ScopeUtils;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.scopes.runtime.NamedElementsScope;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.baseLanguage.logging.runtime.model.LoggingRuntime;
import org.apache.log4j.Level;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SReferenceLink;

public final class Actor__BehaviorDescriptor extends BaseBHDescriptor {
  private static final Logger LOG = LogManager.getLogger(Actor__BehaviorDescriptor.class);
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce2f6271L, "AgentLanguage.structure.Actor");

  public static final SMethod<String> getFormattedName_id52K8EjkEtU = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getFormattedName").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("52K8EjkEtU").build();
  public static final SMethod<Scope> getScope_id52_Geb4QDV$ = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getScope").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("52_Geb4QDV$").build(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));
  public static final SMethod<List<SNode>> GetInheritedBehaviourElement_id29F2V$jvuup = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("GetInheritedBehaviourElement").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("29F2V$jvuup").build();
  public static final SMethod<List<SNode>> GetInheritedAttributes_id6tNT_P6mjyK = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("GetInheritedAttributes").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6tNT_P6mjyK").build();
  public static final SMethod<List<SNode>> GetConstructBehaviourElement_id7IDz3VlgFrn = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("GetConstructBehaviourElement").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("7IDz3VlgFrn").build();
  public static final SMethod<List<SNode>> GetAllBehaviours_id4BMD7YivWul = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("GetAllBehaviours").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4BMD7YivWul").build();
  public static final SMethod<List<SNode>> searhBehaviourSequence_id4BMD7YiwBKD = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("searhBehaviourSequence").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4BMD7YiwBKD").build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<List<SNode>>) ((Class) Object.class), ""));
  public static final SMethod<List<SNode>> GetAllInheritanceList_id29F2V$jrHY3 = new SMethodBuilder<List<SNode>>(new SJavaCompoundTypeImpl((Class<List<SNode>>) ((Class) Object.class))).name("GetAllInheritanceList").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("29F2V$jrHY3").build();
  public static final SMethod<Boolean> BehaviourSignalIsIn_id4EinDJV_e0e = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("BehaviourSignalIsIn").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4EinDJV_e0e").build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<List<SNode>>) ((Class) Object.class), ""));
  public static final SMethod<Boolean> AttributeIsIn_id4aMsku86oa7 = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.TYPE)).name("AttributeIsIn").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4aMsku86oa7").build(SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<List<SNode>>) ((Class) Object.class), ""));
  public static final SMethod<String> GetSuperTypeName_idJ03_IHVUJg = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("GetSuperTypeName").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("J03_IHVUJg").build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getFormattedName_id52K8EjkEtU, getScope_id52_Geb4QDV$, GetInheritedBehaviourElement_id29F2V$jvuup, GetInheritedAttributes_id6tNT_P6mjyK, GetConstructBehaviourElement_id7IDz3VlgFrn, GetAllBehaviours_id4BMD7YivWul, searhBehaviourSequence_id4BMD7YiwBKD, GetAllInheritanceList_id29F2V$jrHY3, BehaviourSignalIsIn_id4EinDJV_e0e, AttributeIsIn_id4aMsku86oa7, GetSuperTypeName_idJ03_IHVUJg);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String getFormattedName_id52K8EjkEtU(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getString(__thisNode__, PROPS.name$MnvL).replaceAll("\\s+", "");
  }
  /*package*/ static Scope getScope_id52_Geb4QDV$(@NotNull SNode __thisNode__, SAbstractConcept kind, SNode child) {
    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(kind), CONCEPTS.BehaviourElement$lp) && ScopeUtils.comeFrom(LINKS.behaviours$zTMQ, __thisNode__, child)) {
      {
        final SNode be = child;
        if (SNodeOperations.isInstanceOf(be, CONCEPTS.BehaviourElement$lp)) {
          List<SNode> nli = new ArrayList<SNode>();
          List<SNode> allbehaviours = Actor__BehaviorDescriptor.GetInheritedBehaviourElement_id29F2V$jvuup.invoke(__thisNode__);

          for (SNode allBehaviour : ListSequence.fromList(allbehaviours)) {
            if (allBehaviour != be && (SLinkOperations.getTarget(allBehaviour, LINKS.signal$k9aw) == null)) {
              ListSequence.fromList(nli).addElement(allBehaviour);
            }
          }
          return new NamedElementsScope(nli);
        }
      }

    }


    if (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(kind), CONCEPTS.Attribute$w0)) {
      SNode actorBase = __thisNode__;
      List<SNode> nli = new ArrayList<SNode>();
      ListSequence.fromList(nli).addSequence(ListSequence.fromList(SLinkOperations.getChildren(actorBase, LINKS.attributes$f_y3)));
      while ((SLinkOperations.getTarget(actorBase, LINKS.superType$2Qmm) != null)) {
        actorBase = SLinkOperations.getTarget(actorBase, LINKS.superType$2Qmm);
        ListSequence.fromList(nli).addSequence(ListSequence.fromList(SLinkOperations.getChildren(actorBase, LINKS.attributes$f_y3)));
      }
      return new NamedElementsScope(nli);
    }

    return ScopeUtils.lazyParentScope(__thisNode__, kind);
  }
  /*package*/ static List<SNode> GetInheritedBehaviourElement_id29F2V$jvuup(@NotNull SNode __thisNode__) {
    List<SNode> nli = new ArrayList<SNode>();
    SNode actorBase = __thisNode__;
    ListSequence.fromList(nli).addSequence(ListSequence.fromList(SLinkOperations.getChildren(actorBase, LINKS.behaviours$zTMQ)));
    while ((SLinkOperations.getTarget(actorBase, LINKS.superType$2Qmm) != null)) {
      actorBase = SLinkOperations.getTarget(actorBase, LINKS.superType$2Qmm);

      for (SNode parentBehaviour : ListSequence.fromList(SLinkOperations.getChildren(actorBase, LINKS.behaviours$zTMQ))) {

        if ((SLinkOperations.getTarget(parentBehaviour, LINKS.signal$k9aw) == null)) {
          ListSequence.fromList(nli).addElement(parentBehaviour);
        } else {
          if (!(((boolean) Actor__BehaviorDescriptor.BehaviourSignalIsIn_id4EinDJV_e0e.invoke(__thisNode__, parentBehaviour, nli)))) {
            ListSequence.fromList(nli).addElement(parentBehaviour);
          }
        }



      }

    }

    return nli;
  }
  /*package*/ static List<SNode> GetInheritedAttributes_id6tNT_P6mjyK(@NotNull SNode __thisNode__) {
    List<SNode> nli = new ArrayList<SNode>();
    SNode actorBase = __thisNode__;
    ListSequence.fromList(nli).addSequence(ListSequence.fromList(SLinkOperations.getChildren(actorBase, LINKS.attributes$f_y3)));

    while ((SLinkOperations.getTarget(actorBase, LINKS.superType$2Qmm) != null)) {
      actorBase = SLinkOperations.getTarget(actorBase, LINKS.superType$2Qmm);

      for (SNode listAttribute : ListSequence.fromList(SLinkOperations.getChildren(actorBase, LINKS.attributes$f_y3))) {
        if (((boolean) Actor__BehaviorDescriptor.AttributeIsIn_id4aMsku86oa7.invoke(__thisNode__, listAttribute, nli))) {
          continue;
        }
        ListSequence.fromList(nli).addElement(listAttribute);
      }
    }

    return nli;
  }
  /*package*/ static List<SNode> GetConstructBehaviourElement_id7IDz3VlgFrn(@NotNull SNode __thisNode__) {
    List<SNode> nli = new ArrayList<SNode>();
    List<SNode> allBehaviours = Actor__BehaviorDescriptor.GetInheritedBehaviourElement_id29F2V$jvuup.invoke(__thisNode__);
    for (int i = 0; i < allBehaviours.size(); i++) {
      if ((SLinkOperations.getTarget(ListSequence.fromList(allBehaviours).getElement(i), LINKS.signal$k9aw) != null) && !(nli.contains(ListSequence.fromList(allBehaviours).getElement(i)))) {
        ListSequence.fromList(nli).addElement(ListSequence.fromList(allBehaviours).getElement(i));
      }
    }

    return nli;
  }
  /*package*/ static List<SNode> GetAllBehaviours_id4BMD7YivWul(@NotNull SNode __thisNode__) {
    List<SNode> nli = new ArrayList<SNode>();
    SNode actorBase = __thisNode__;


    final List<SNode> myBehaviours = Actor__BehaviorDescriptor.GetInheritedBehaviourElement_id29F2V$jvuup.invoke(actorBase);
    List<SNode> cleanedElements = new ArrayList<SNode>();

    for (final Wrappers._int i = new Wrappers._int(0); i.value < myBehaviours.size(); i.value++) {
      if (!(ListSequence.fromList(cleanedElements).any(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SPropertyOperations.getString(it, PROPS.name$MnvL) == myBehaviours.get(i.value).getName();
        }
      }))) {
        ListSequence.fromList(cleanedElements).addElement(ListSequence.fromList(myBehaviours).getElement(i.value));
      }

    }


    for (int i = 0; i < ListSequence.fromList(cleanedElements).count(); i++) {
      List<SNode> allContainedBehaviours = ListSequence.fromList(SNodeOperations.getNodeDescendants(ListSequence.fromList(cleanedElements).getElement(i), CONCEPTS.Behaviour$OO, false, new SAbstractConcept[]{})).distinct().toListSequence();
      for (int k = 0; k < ListSequence.fromList(allContainedBehaviours).count(); k++) {
        if (SPropertyOperations.getString(SLinkOperations.getTarget(ListSequence.fromList(allContainedBehaviours).getElement(k), LINKS.description$Kute), PROPS.description$WNUv) != null) {
          ListSequence.fromList(nli).addElement(ListSequence.fromList(allContainedBehaviours).getElement(k));
        }
        LoggingRuntime.logMsgView(Level.INFO, SPropertyOperations.getString(SLinkOperations.getTarget(ListSequence.fromList(allContainedBehaviours).getElement(k), LINKS.description$Kute), PROPS.description$WNUv) + "", Actor__BehaviorDescriptor.class, null, null);
      }

    }

    // This is the 'get all' that doesnt really work propery ---- remove when come to cleaning 
    nli = SNodeOperations.getNodeDescendants(actorBase, CONCEPTS.Behaviour$OO, false, new SAbstractConcept[]{});

    return nli;
  }
  /*package*/ static List<SNode> searhBehaviourSequence_id4BMD7YiwBKD(@NotNull SNode __thisNode__, SNode sequence, List<SNode> behaviours) {

    for (int i = 0; i < ListSequence.fromList(SLinkOperations.getChildren(sequence, LINKS.steps$BnuP)).count(); i++) {
      if (SLinkOperations.getChildren(sequence, LINKS.steps$BnuP).get(i) instanceof SNode) {
        behaviours.addAll(Actor__BehaviorDescriptor.searhBehaviourSequence_id4BMD7YiwBKD.invoke(__thisNode__, ((SNode) SLinkOperations.getChildren(sequence, LINKS.steps$BnuP).get(i)), behaviours));
      } else {
        ListSequence.fromList(behaviours).addElement((SNode) SLinkOperations.getChildren(sequence, LINKS.steps$BnuP).get(i));
      }

    }

    return behaviours;
  }
  /*package*/ static List<SNode> GetAllInheritanceList_id29F2V$jrHY3(@NotNull SNode __thisNode__) {
    List<SNode> nli = new ArrayList<SNode>();
    SNode actorBase = __thisNode__;
    ListSequence.fromList(nli).addElement(actorBase);
    while ((SLinkOperations.getTarget(actorBase, LINKS.superType$2Qmm) != null)) {
      actorBase = SLinkOperations.getTarget(actorBase, LINKS.superType$2Qmm);
      ListSequence.fromList(nli).addElement(actorBase);
    }
    return nli;
  }
  /*package*/ static boolean BehaviourSignalIsIn_id4EinDJV_e0e(@NotNull SNode __thisNode__, SNode parentehaviour, List<SNode> curList) {
    for (SNode currentBehaviour : ListSequence.fromList(curList)) {
      if ((SLinkOperations.getTarget(currentBehaviour, LINKS.signal$k9aw) != null)) {
        if (BehaviourElement__BehaviorDescriptor.GetSignalName_id2YIKz$5l9Hf.invoke(currentBehaviour).equals(BehaviourElement__BehaviorDescriptor.GetSignalName_id2YIKz$5l9Hf.invoke(parentehaviour))) {
          return true;
        }
      }
    }
    return false;
  }
  /*package*/ static boolean AttributeIsIn_id4aMsku86oa7(@NotNull SNode __thisNode__, SNode attr, List<SNode> list) {
    for (SNode listAttribute : ListSequence.fromList(list)) {
      if (SPropertyOperations.getString(attr, PROPS.name$MnvL).equals(SPropertyOperations.getString(listAttribute, PROPS.name$MnvL))) {
        return true;
      }
    }

    return false;
  }
  /*package*/ static String GetSuperTypeName_idJ03_IHVUJg(@NotNull SNode __thisNode__) {

    if ((SLinkOperations.getTarget(__thisNode__, LINKS.superType$2Qmm) == null)) {
      return "Actor";
    }
    return SPropertyOperations.getString(SLinkOperations.getTarget(__thisNode__, LINKS.superType$2Qmm), PROPS.name$MnvL);

  }

  /*package*/ Actor__BehaviorDescriptor() {
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((String) getFormattedName_id52K8EjkEtU(node));
      case 1:
        return (T) ((Scope) getScope_id52_Geb4QDV$(node, (SAbstractConcept) parameters[0], (SNode) parameters[1]));
      case 2:
        return (T) ((List<SNode>) GetInheritedBehaviourElement_id29F2V$jvuup(node));
      case 3:
        return (T) ((List<SNode>) GetInheritedAttributes_id6tNT_P6mjyK(node));
      case 4:
        return (T) ((List<SNode>) GetConstructBehaviourElement_id7IDz3VlgFrn(node));
      case 5:
        return (T) ((List<SNode>) GetAllBehaviours_id4BMD7YivWul(node));
      case 6:
        return (T) ((List<SNode>) searhBehaviourSequence_id4BMD7YiwBKD(node, (SNode) parameters[0], (List<SNode>) parameters[1]));
      case 7:
        return (T) ((List<SNode>) GetAllInheritanceList_id29F2V$jrHY3(node));
      case 8:
        return (T) ((Boolean) BehaviourSignalIsIn_id4EinDJV_e0e(node, (SNode) parameters[0], (List<SNode>) parameters[1]));
      case 9:
        return (T) ((Boolean) AttributeIsIn_id4aMsku86oa7(node, (SNode) parameters[0], (List<SNode>) parameters[1]));
      case 10:
        return (T) ((String) GetSuperTypeName_idJ03_IHVUJg(node));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
    /*package*/ static final SProperty description$WNUv = MetaAdapterFactory.getProperty(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7ba98c3ed5361882L, 0x7ba98c3ed5361883L, "description");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept BehaviourElement$lp = MetaAdapterFactory.getConcept(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce306b7aL, "AgentLanguage.structure.BehaviourElement");
    /*package*/ static final SConcept Attribute$w0 = MetaAdapterFactory.getConcept(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f125516L, "AgentLanguage.structure.Attribute");
    /*package*/ static final SConcept Behaviour$OO = MetaAdapterFactory.getConcept(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce308547L, "AgentLanguage.structure.Behaviour");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink signal$k9aw = MetaAdapterFactory.getContainmentLink(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce306b7aL, 0x71ffe5bd0133e89L, "signal");
    /*package*/ static final SContainmentLink behaviours$zTMQ = MetaAdapterFactory.getContainmentLink(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce2f6271L, 0x270efea19372e41eL, "behaviours");
    /*package*/ static final SContainmentLink attributes$f_y3 = MetaAdapterFactory.getContainmentLink(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce2f6271L, 0x257e995deb85de00L, "attributes");
    /*package*/ static final SReferenceLink superType$2Qmm = MetaAdapterFactory.getReferenceLink(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce2f6271L, 0x35463334ce306ba8L, "superType");
    /*package*/ static final SContainmentLink description$Kute = MetaAdapterFactory.getContainmentLink(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce308547L, 0x7ba98c3ed53618a0L, "description");
    /*package*/ static final SContainmentLink steps$BnuP = MetaAdapterFactory.getContainmentLink(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce308546L, 0x35463334ce308548L, "steps");
  }
}