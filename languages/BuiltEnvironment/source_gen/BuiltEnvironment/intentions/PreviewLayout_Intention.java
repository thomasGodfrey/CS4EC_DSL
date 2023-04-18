package BuiltEnvironment.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.openapi.intentions.IntentionExecutable;
import jetbrains.mps.openapi.intentions.Kind;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import java.util.Collections;
import jetbrains.mps.intentions.AbstractIntentionExecutable;
import BuiltEnvironment.behavior.Area__BehaviorDescriptor;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;

public final class PreviewLayout_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;

  public PreviewLayout_Intention() {
    super(Kind.NORMAL, false, new SNodePointer("r:d94b79e6-f75d-4500-a732-17f3ce4e1ec8(BuiltEnvironment.intentions)", "459701219695732780"));
  }

  @Override
  public String getPresentation() {
    return "PreviewLayout";
  }

  @Override
  public boolean isSurroundWith() {
    return false;
  }

  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }

    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Preview Layout";
    }

    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      Area__BehaviorDescriptor.interpret_idpxbXbuLMVX.invoke(node);
    }

    @Override
    public boolean isApplicable(final SNode node, final EditorContext editorContext) {
      return true;
    }



    @Override
    public IntentionDescriptor getDescriptor() {
      return PreviewLayout_Intention.this;
    }

  }
}