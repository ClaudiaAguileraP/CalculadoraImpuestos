package components;

import constants.DesingConstants;

import javax.swing.*;
import java.awt.*;

public class JTextFieldMod  extends JTextField{

    private int _maxWidth = 200;
    private int _maxHeight = 40;

    public JTextFieldMod(boolean isEditable, TipoJTextField tipoJTextField, int cantidadCaracteres) {
        this.setFont(this.getFont().deriveFont(20f));
        this.setHorizontalAlignment(JTextField.LEFT);
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        // Fondo transparente
        this.setOpaque(false);
        this.setForeground(DesingConstants.LETRA_JTEXTFIELD);
        this.setPreferredSize(new Dimension(_maxWidth, _maxHeight));
        this.setMaximumSize(new Dimension(_maxWidth, _maxHeight));
        this.setEditable(isEditable);
        // Validación de tipo de campo
        if (tipoJTextField == TipoJTextField.Numero) {
            this.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    // Obtenemos el caracter
                    char c = evt.getKeyChar();
                    // Verificamos si es un número o un punto
                    if (!Character.isDigit(c) && c != '.' || (c == '.' && getText().contains("."))) {
                        evt.consume();
                    }
                }
            });
        }

        // Validación de cantidad de caracteres
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                if (getText().length() >= cantidadCaracteres) {
                    evt.consume();
                }
            }
        });
    }
}
