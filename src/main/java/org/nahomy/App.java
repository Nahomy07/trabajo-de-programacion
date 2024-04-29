package org.nahomy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        JFrame frame = new JFrame();
        /*
        frame.setSize(400, 400);
        frame.setTitle("Registro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JLabel label = new JLabel("Nombre");
        label.setBounds(0,0,60,60);
        JTextField nombre = new JTextField(30);
        nombre.setBounds(60,20,300,25);

        JLabel label1 = new JLabel("Correo");
        label1.setBounds(0,40,60,60);
        JTextField correo = new JTextField(30);
        correo.setBounds(60,60,300,25);

        JLabel label2 = new JLabel("Telefono");
        label2.setBounds(0,80,60,60);
        JTextField telefono = new JTextField(30);
        telefono.setBounds(60,100,300,25);

        JLabel label3 = new JLabel("Contraseña");
        label3.setBounds(0,120,80,60);
        JTextField contraseña = new JTextField(30);
        contraseña.setBounds(75,140,300,25);

        JLabel label4 = new JLabel("Confirmar");
        label4.setBounds(0,160,80,60);
        JTextField confimar = new JTextField(30);
        confimar.setBounds(75,180,300,25);

        JButton enviarButton = new JButton("Enviar");
        enviarButton.setBounds(150,220,80,40);

        frame.add(label);
        frame.add(nombre);
        frame.add(label1);
        frame.add(correo);
        frame.add(label2);
        frame.add(telefono);
        frame.add(label3);
        frame.add(contraseña);
        frame.add(label4);
        frame.add(confimar);
        frame.add(enviarButton);


        URL rutaImagen = App.class.getResource("/RiAccountCircleFill.png");
        ImageIcon image = new ImageIcon(rutaImagen);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);
        */

        new Proyecto();


    }
}
