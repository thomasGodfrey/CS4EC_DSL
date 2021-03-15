package EDLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_TestResult extends EnumerationDescriptorBase {

  public EnumerationDescriptor_TestResult() {
    super(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x1704b5fa3f80e7e7L, "TestResult", "r:773fb116-fb45-4750-a73a-f0ffaf85115c(EDLanguage.structure)/1658650649191049191");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_true_0 = new EnumerationDescriptor.MemberDescriptor("true", "Positive", 0x1704b5fa3f80e7e8L, "r:773fb116-fb45-4750-a73a-f0ffaf85115c(EDLanguage.structure)/1658650649191049192");
  private final EnumerationDescriptor.MemberDescriptor myMember_false_0 = new EnumerationDescriptor.MemberDescriptor("false", "Negative", 0x1704b5fa3f80e8bcL, "r:773fb116-fb45-4750-a73a-f0ffaf85115c(EDLanguage.structure)/1658650649191049404");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x1704b5fa3f80e7e7L, 0x1704b5fa3f80e7e8L, 0x1704b5fa3f80e8bcL);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_true_0, myMember_false_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return null;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "true":
        return myMember_true_0;
      case "false":
        return myMember_false_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}