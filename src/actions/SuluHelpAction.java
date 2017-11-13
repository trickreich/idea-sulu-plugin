package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.ide.BrowserUtil;

public class SuluHelpAction extends AnAction {
    private static final String HELP_URL
            = "http://docs.sulu.io";

    @Override
    public void actionPerformed(AnActionEvent e) {
        BrowserUtil.open(HELP_URL);
    }
}