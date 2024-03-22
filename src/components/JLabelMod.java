package components;

import constants.DesingConstants;

import javax.swing.*;

public class JLabelMod  extends JLabel {
    public JLabelMod(String text) {
        super(text);
        this.setFont(this.getFont().deriveFont(20f));
        this.setForeground(DesingConstants.LETRA_PRINCIPAL);
    }
}
