package components;

import constants.DesingConstants;

import javax.swing.*;
import java.awt.*;

public class JButtonMod extends JButton {
    private int _maxWidth = 250;
    private int _maxHeight = 50;
    public JButtonMod(String text) {
        super(text);
        this.setFont(this.getFont().deriveFont(20f));
        this.setBackground(DesingConstants.FONDO_BOTONES);
        this.setPreferredSize(new Dimension(_maxWidth, _maxHeight));
        this.setMaximumSize(new Dimension(_maxWidth, _maxHeight));
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        this.setForeground(DesingConstants.LETRA_PRINCIPAL);
    }
}
