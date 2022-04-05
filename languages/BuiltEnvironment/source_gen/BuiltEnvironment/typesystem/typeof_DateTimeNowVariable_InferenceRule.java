package BuiltEnvironment.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.EquationInfo;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.builder.SNodeBuilder;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class typeof_DateTimeNowVariable_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_DateTimeNowVariable_InferenceRule() {
  }
  public void applyRule(final SNode dateTimeNowVariable, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = dateTimeNowVariable;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:0f45fddf-e43f-480d-8405-fb1a817553ef(BuiltEnvironment.typesystem)", "4321323723391132942", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:0f45fddf-e43f-480d-8405-fb1a817553ef(BuiltEnvironment.typesystem)", "4321323723391132944", true), (SNode) createNumberType_u3tp4f_a1a0c0a0b(), _info_12389875345);
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return CONCEPTS.DateTimeNowVariable$Ch;
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode createNumberType_u3tp4f_a1a0c0a0b() {
    SNodeBuilder n0 = new SNodeBuilder().init(CONCEPTS.NumberType$n);
    return n0.getResult();
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept DateTimeNowVariable$Ch = MetaAdapterFactory.getConcept(0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3bf86d07f43264edL, "BuiltEnvironment.structure.DateTimeNowVariable");
    /*package*/ static final SConcept NumberType$n = MetaAdapterFactory.getConcept(0x6b277d9ad52d416fL, 0xa2091919bd737f50L, 0x7211e50064d40ea8L, "org.iets3.core.expr.simpleTypes.structure.NumberType");
  }
}
