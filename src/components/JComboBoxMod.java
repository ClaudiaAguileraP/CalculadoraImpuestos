package components;

import constants.DesingConstants;

import javax.swing.*;
import java.awt.*;

public class JComboBoxMod extends JComboBox {

    private int _maxWidth = 200;
    private int _maxHeight = 40;
    public JComboBoxMod() {
        super();

        this.setFont(this.getFont().deriveFont(20f));
        this.setForeground(DesingConstants.LETRA_SECUNDARIA);
        this.setPreferredSize(new Dimension(_maxWidth, _maxHeight));
        this.setMaximumSize(new Dimension(_maxWidth, _maxHeight));
        this.setBackground(DesingConstants.FONDO_CAMPOS);

    }
}
