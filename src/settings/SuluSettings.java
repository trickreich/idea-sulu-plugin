package settings;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiManager;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SuluSettings implements Configurable {
    protected Project project;
    private JPanel panel;

    @Nullable
    @Override
    public JComponent createComponent() {
        return panel;
    }

    @Nls
    @Override
    public String getDisplayName() {
        return "Sulu";
    }

    @Override
    public void apply() throws ConfigurationException {
        PsiManager.getInstance(project).dropResolveCaches();
    }

    @Override
    public boolean isModified() {
        return false;
    }
}
