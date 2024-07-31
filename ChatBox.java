import javax.swing.*;
import java.awt.*;

class ChatBox {

    public static void main(String args[]) {
        //Create the Frame

        JFrame jframe = new JFrame("Chat Screen");

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.setSize(400, 400);


        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("FILE");
        JMenu editMenu = new JMenu("EDIT");
        JMenu viewMenu = new JMenu("VIEW");
        JMenu helpMenu = new JMenu("HELP");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);


        JMenuItem fileMenu1 = new JMenuItem("New file");

        JMenuItem fileMenu2 = new JMenuItem("Open");

        JMenuItem fileMenu3 = new JMenuItem("Save as");

        JMenuItem fileMenu4 = new JMenuItem("Save All");
        JMenuItem fileMenu5 = new JMenuItem("Print");

        fileMenu.add(fileMenu1);
        fileMenu.add(fileMenu2);
        fileMenu.add(fileMenu3);
        fileMenu.add(fileMenu4);
        fileMenu.add(fileMenu5);

        JMenuItem editMenu1 = new JMenuItem("Copy");

        JMenuItem editMenu2 = new JMenuItem("Cut");

        JMenuItem editMenu3 = new JMenuItem("Paste");

        JMenuItem editMenu4 = new JMenuItem("Undo");

        editMenu.add(editMenu1);
        editMenu.add(editMenu2);
        editMenu.add(editMenu3);
        editMenu.add(editMenu4);

        JMenuItem viewMenu1 = new JMenuItem("Tool Windows");

        JMenuItem viewMenu2 = new JMenuItem("Appearance");

        JMenuItem viewMenu3 = new JMenuItem("Type Info");

        JMenuItem viewMenu4 = new JMenuItem("Recent Files");

        editMenu.add(viewMenu1);
        editMenu.add(viewMenu2);
        editMenu.add(viewMenu3);
        editMenu.add(viewMenu4);

        JMenuItem helpMenu1 = new JMenuItem("Help?");

        JMenuItem helpMenu3 = new JMenuItem("Contact Support");

        JMenuItem helpMenu2 = new JMenuItem("About");

        helpMenu.add(helpMenu1);
        helpMenu.add(helpMenu2);
        helpMenu.add(helpMenu3);



        JTextArea textArea = new JTextArea();


        JPanel panel = new JPanel();


        JLabel label = new JLabel("Please Enter Text");


        JTextField textField = new JTextField(15); // accepts upto 15 characters


        JButton btn_send = new JButton("Send");

        JButton btn_reset = new JButton("Reset");
        
        panel.add(label);

        panel.add(textField);

        panel.add(btn_send);

        panel.add(btn_reset);

        jframe.getContentPane().add(BorderLayout.SOUTH, panel);
        jframe.getContentPane().add(BorderLayout.NORTH, menuBar);
        jframe.getContentPane().add(BorderLayout.CENTER, textArea);

        jframe.setVisible(true);
    }
}
