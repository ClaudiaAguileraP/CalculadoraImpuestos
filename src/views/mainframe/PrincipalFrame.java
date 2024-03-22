package views.mainframe;

import components.*;
import constants.DesingConstants;
import model.Empleado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalFrame extends JFrame  {
    private JPanelMod _jpPrincipal, _jpForm, _jpIzquierda, _jpDerecha;
    private JLabelMod _jlTitulo, _jlNombre, _jlSueldo, _jlImpuesto, _jlAfp, _jlSalud, _jlSueldoLiquido, _jlResumen;
    private JTextFieldMod _jtfNombre, _jtfSueldo, _jtfImpuesto, _jtfAfp, _jtfSalud, _jtfSueldoLiquido;
    private JTextArea _jtaResumen;
    private JButtonMod _jbCalcular;

    public PrincipalFrame() {
        inicializarComponentes();
        configurarVentana();
        setVisible(true);
    }

    protected void inicializarComponentes() {
        _jpPrincipal = new JPanelMod();
        _jpForm = new JPanelMod();
        _jpDerecha = new JPanelMod();
        _jpIzquierda = new JPanelMod();

        inicializarEtiquetas();
        inicializarCamposTexto();
        inicializarBoton();
        configurarPaneles();
    }

    private void inicializarEtiquetas() {
        // Inicializa las etiquetas
        _jlTitulo = new JLabelMod(DesingConstants.TITULO);
        _jlNombre = new JLabelMod("Nombre");
        _jlSueldo = new JLabelMod("Sueldo");
        _jlImpuesto = new JLabelMod("Impuesto");
        _jlAfp = new JLabelMod("AFP");
        _jlSalud = new JLabelMod("Salud");
        _jlSueldoLiquido = new JLabelMod("Sueldo líquido");
        _jlResumen = new JLabelMod("Resumen");
        _jtaResumen = new JTextArea();

        // Configura las etiquetas
        _jlTitulo.setFont(new Font("Arial", Font.BOLD, 40));
        _jlTitulo.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void inicializarCamposTexto() {
        // Inicializa los campos de texto
        _jtfNombre = new JTextFieldMod(true, TipoJTextField.Texto , 20);
        _jtfSueldo = new JTextFieldMod(true, TipoJTextField.Numero, 15);
        _jtfImpuesto = new JTextFieldMod(false, TipoJTextField.Numero, 15);
        _jtfAfp = new JTextFieldMod(false, TipoJTextField.Numero, 15);
        _jtfSalud = new JTextFieldMod(false, TipoJTextField.Numero, 15);
        _jtfSueldoLiquido = new JTextFieldMod(false, TipoJTextField.Numero, 15);
    }

    private void inicializarBoton() {
        // Inicializa el botón
        _jbCalcular = new JButtonMod("Calcular");
        _jbCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Calcula los valores
            }
        });
    }

    private void configurarPaneles() {
        // Configura los paneles
        _jpPrincipal.setLayout(new BorderLayout());
        _jpPrincipal.add(_jlTitulo, BorderLayout.NORTH);
        _jpPrincipal.add(_jpForm, BorderLayout.CENTER);
        _jpForm.setLayout(new GridLayout(1, 2));
        _jpForm.add(_jpIzquierda, BorderLayout.WEST);
        _jpForm.add(_jpDerecha);

        configurarPanelIzquierda();
        configurarPanelDerecha();
    }

    private void configurarPanelIzquierda() {
        // Configura el panel izquierda
        _jpIzquierda.setLayout(new GridBagLayout());
        GridBagConstraints _gbc = new GridBagConstraints();
        _gbc.insets = new Insets(10, 10, 10, 10);
        _gbc.fill = GridBagConstraints.HORIZONTAL;
        _gbc.gridx = 0;
        _gbc.gridy = 0;
        _jpIzquierda.add(_jlNombre, _gbc);
        _gbc.gridy = 1;
        _jpIzquierda.add(_jlSueldo, _gbc);

        _gbc.gridy = 3;
        _jpIzquierda.add(_jlImpuesto, _gbc);
        _gbc.gridy = 4;
        _jpIzquierda.add(_jlAfp, _gbc);
        _gbc.gridy = 5;
        _jpIzquierda.add(_jlSalud, _gbc);
        _gbc.gridy = 6;
        _jpIzquierda.add(_jlSueldoLiquido, _gbc);

        _gbc.gridx = 1;
        _gbc.gridy = 0;
        _jpIzquierda.add(_jtfNombre, _gbc);
        _gbc.gridy = 1;
        _jpIzquierda.add(_jtfSueldo, _gbc);
        _gbc.gridy = 3;
        _jpIzquierda.add(_jtfImpuesto, _gbc);
        _gbc.gridy = 4;
        _jpIzquierda.add(_jtfAfp, _gbc);
        _gbc.gridy = 5;
        _jpIzquierda.add(_jtfSalud, _gbc);
        _gbc.gridy = 6;
        _jpIzquierda.add(_jtfSueldoLiquido, _gbc);
        _gbc.gridy = 2;
        _jpIzquierda.add(_jbCalcular, _gbc);

    }

    private void configurarPanelDerecha() {
        // Configura el panel derecha
        _jpDerecha.setLayout(new BorderLayout());
        _jpDerecha.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        _jpDerecha.add(_jlResumen, BorderLayout.NORTH);
        _jlResumen.setHorizontalAlignment(SwingConstants.CENTER);
        _jpDerecha.add(_jtaResumen, BorderLayout.CENTER);
    }

    private void configurarVentana() {
        setTitle(DesingConstants.TITULO);
        setIconImage(null);
        setSize(1100, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(_jpPrincipal);
    }
}