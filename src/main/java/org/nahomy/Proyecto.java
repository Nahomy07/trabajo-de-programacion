package org.nahomy;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Proyecto extends JFrame
{
    private JDesktopPane desktopPane;

    public Proyecto()
    {
        super("Venta de Ropa");

        desktopPane = new JDesktopPane();
        getContentPane().add(desktopPane, BorderLayout.CENTER);


        Cliente cliente = new Cliente();
        Producto producto = new Producto();
        Proveedor proveedor = new Proveedor();
        Vendedor vendedor = new Vendedor();


        desktopPane.add(producto);
        desktopPane.add(cliente);
        desktopPane.add(proveedor);
        desktopPane.add(vendedor);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void  main(String[] args)
    {
        SwingUtilities.invokeLater(Proyecto::new);
    }
}

class Cliente extends JInternalFrame
{
    public Cliente()
    {
        super("Cliente", true, true, true, true);
        inicializarCliente();
    }

    private void inicializarCliente()
    {
        setSize(300, 300);

       /*
        setOpaque(true);
        setBorder(new LineBorder(new Color(0, 0, 0)));
        setIconifiable(false);
       */

        JMenuBar menuBar = new JMenuBar();
        JMenu menuDatos = new JMenu("Datos");

        JMenuItem nombre = new JMenuItem("Nombre");
        JMenuItem apellido = new JMenuItem("Apellido");
        JMenuItem telefomo = new JMenuItem("Telefono");

        nombre.setBackground(Color.blue);
        apellido.setBackground(Color.BLUE);
        telefomo.setBackground(Color.BLUE);

        menuDatos.add(nombre);
        menuDatos.add(apellido);
        menuDatos.add(telefomo);

        menuBar.add(menuDatos);

        setJMenuBar(menuBar);

        setVisible(true);


        /*
        JLabel text = new JLabel("Clientes");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        panel.setBorder(BorderFactory.createTitledBorder(null, "Clientes", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.black));
        panel.setAlignmentX(LEFT_ALIGNMENT);
        panel.add(text);

        setName("Clientes");
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().setPreferredSize(new Dimension(800, 400));
        pack();
        */

    }
}

class Producto extends JInternalFrame
{
    public Producto()
    {
        super("Producto", true, true, true, true);
        inicializarProducto();
    }

    private void inicializarProducto()
    {
        setSize(300,300);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuDatos = new JMenu("Datos");

        JMenuItem nombre = new JMenuItem("Nombre");
        JMenuItem descripcion = new JMenuItem("Descripcion");
        JMenuItem precio = new JMenuItem("Precio");

        nombre.setBackground(Color.BLUE);
        descripcion.setBackground(Color.BLUE);
        precio.setBackground(Color.BLUE);

        menuDatos.add(nombre);
        menuDatos.add(descripcion);
        menuDatos.add(precio);

        menuBar.add(menuDatos);
        setJMenuBar(menuBar);

        setVisible(true);
    }
}

class Proveedor extends JInternalFrame
{
    public Proveedor ()
    {
        super("Proveedor", true, true, true, true);
        inicializarProveedor();
    }

    private void inicializarProveedor()
    {
        setSize(300,300);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuDatos = new JMenu("Datos");

        JMenuItem nombre = new JMenuItem("Nombre");
        JMenuItem apellido = new JMenuItem("Apellido");
        JMenuItem telefono = new JMenuItem("Telefono");
        JMenuItem direccion = new JMenuItem("Direccion");

        nombre.setBackground(Color.BLUE);
        apellido.setBackground(Color.BLUE);
        telefono.setBackground(Color.BLUE);
        direccion.setBackground(Color.BLUE);

        menuDatos.add(nombre);
        menuDatos.add(apellido);
        menuDatos.add(telefono);
        menuDatos.add(direccion);

        menuBar.add(menuDatos);
        setJMenuBar(menuBar);

        setVisible(true);
    }
}

class Vendedor extends JInternalFrame
{
    public Vendedor()
    {
        super("Vendedor", true, true, true, true);
        inicializarVendedor();
    }

    private void inicializarVendedor()
    {
        setSize(300,300);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuDatos = new JMenu("Datos");

        JMenuItem nombre = new JMenuItem("Nombre");
        JMenuItem apellido = new JMenuItem("Apellido");
        JMenuItem telefono = new JMenuItem("Telefono");
        JMenuItem direccion = new JMenuItem("Direccion");

        nombre.setBackground(Color.BLUE);
        apellido.setBackground(Color.BLUE);
        telefono.setBackground(Color.BLUE);
        direccion.setBackground(Color.BLUE);

        menuDatos.add(nombre);
        menuDatos.add(apellido);
        menuDatos.add(telefono);
        menuDatos.add(direccion);

        menuBar.add(menuDatos);
        setJMenuBar(menuBar);

        setVisible(true);
    }
}
