package actions;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class SuluRepoAction extends AnAction {
    private static final String HELP_URL
            = "https://github.com/sulu/sulu";

    @Override
    public void actionPerformed(AnActionEvent e) {
        BrowserUtil.open(HELP_URL);
    }
}
