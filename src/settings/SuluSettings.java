package settings;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class SuluSettings implements Configurable {
    private JPanel panel;
    private JCheckBox enablePluginCheckBox;
    private List<String> settings = new ArrayList<String>();

    @Nullable
    @Override
    public JComponent createComponent() {
        return panel;
    }

    @Nls
    @Override
    public String getDisplayName() {
        return "Sulu Plugin";
    }

    @Override
    public void apply() throws ConfigurationException {

    }

    @Override
    public boolean isModified() {
        return false;
    }

    public SuluSettings(@NotNull final Project project) {
        enablePluginCheckBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                boolean enabled = event.getStateChange() == ItemEvent.SELECTED;
                enablePluginCheckBox.setEnabled(enabled);
            }
        });
    }
}
