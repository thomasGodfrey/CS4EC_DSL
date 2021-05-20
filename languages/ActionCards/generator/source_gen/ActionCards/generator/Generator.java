package ActionCards.generator;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateModuleInterpreted2;
import jetbrains.mps.smodel.language.LanguageRegistry;
import jetbrains.mps.smodel.language.LanguageRuntime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.module.SModuleReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import ActionCards.generator.templates.QueriesGenerated;
import java.util.Collection;
import org.jetbrains.mps.openapi.language.SLanguage;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Arrays;
import jetbrains.mps.generator.runtime.TemplateMappingPriorityRule;
import jetbrains.mps.generator.runtime.TemplateUtil;

public class Generator extends TemplateModuleInterpreted2 {

  public Generator(LanguageRegistry languageRegistry, LanguageRuntime sourceLanguage, jetbrains.mps.smodel.Generator generator) {
    super(languageRegistry, sourceLanguage, generator);
  }

  @NotNull
  @Override
  public SModuleReference getModuleReference() {
    return PersistenceFacade.getInstance().createModuleReference("18e9a695-d274-436f-9223-400c64c57517(ActionCards.generator)");
  }

  @Override
  protected void fillTemplateModels(TemplateModuleInterpreted2.TemplateModels models) {
    models.templates("r:2b34b262-70b8-44fb-abbb-589788150497", QueriesGenerated.class);
  }


  @Override
  public Collection<SLanguage> getTargetLanguages() {
    SLanguage[] rv = new SLanguage[1];
    rv[0] = MetaAdapterFactory.getLanguage(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, "EDLanguage");
    return Arrays.asList(rv);
  }

  @Override
  public Collection<TemplateMappingPriorityRule> getPriorities() {
    return TemplateUtil.asCollection(TemplateUtil.createStrictlyBeforeRule(TemplateUtil.createRefExternal("18e9a695-d274-436f-9223-400c64c57517(ActionCards.generator)", TemplateUtil.createRefNormal("r:2b34b262-70b8-44fb-abbb-589788150497(ActionCards.generator.templates@generator)", "5402567240274677796", "5402567240274677796")), TemplateUtil.createRefExternal("18e9a695-d274-436f-9223-400c64c57517(ActionCards.generator)", TemplateUtil.createRefNormal("r:2b34b262-70b8-44fb-abbb-589788150497(ActionCards.generator.templates@generator)", "3383707102503528444", "main"))));
  }
}
