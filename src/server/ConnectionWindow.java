package server;

import server.MainWindow;

import javax.swing.*;
import java.awt.GridLayout;

public class ConnectionWindow extends JFrame {
    static private final int WINDOW_HEIGHT = 700;
    static private final int WINDOW_WIDTH = 800;
    static private final int WINDOW_POS_X = 200;
    static private final int WINDOW_POS_Y = 200;
    static private final String WINDOW_NAME = "Подключение к серверу";

    JLabel loginName = new JLabel("Логин: ");
    JTextField loginField = new JTextField();
    JLabel passwordName = new JLabel("Пароль: ");
    JTextField passwordField = new JPasswordField();
    JTextField serverField = new JTextField("Введите адрес сервера: ");
    JButton buttonConnect = new JButton("Подключиться");
    JPanel loginPanel = new JPanel(new GridLayout(1,2));
    JPanel pass = new JPanel(new GridLayout(1,2));
    JPanel grid = new JPanel(new GridLayout(4,1));

    ConnectionWindow(){
        setTitle(WINDOW_NAME);
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        loginPanel.add(loginName);
        loginPanel.add(loginField);
        pass.add(passwordName);
        pass.add(passwordField);
        grid.add(loginPanel);
        grid.add(pass);
        grid.add(serverField);
        grid.add(buttonConnect);

        add(grid);

        buttonConnect.addActionListener(e -> {
            String login = loginField.getText().trim();
            new MainWindow(login);
        });

        setVisible(true);
    }
}
