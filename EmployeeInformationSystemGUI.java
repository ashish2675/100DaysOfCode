package advJava;
import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.sql.*;



public class EmployeeInformationSystemGUI extends JFrame implements ActionListener {



    private JTextField idField, firstNameField, lastNameField, emailField, phoneNumberField;

    private JButton addButton;



    private Connection connection;

    private Statement statement;



    public EmployeeInformationSystemGUI() {

        super("Employee Information System");



        // Create GUI components

        JLabel idLabel = new JLabel("ID:");

        idField = new JTextField(10);

        JLabel firstNameLabel = new JLabel("First Name:");

        firstNameField = new JTextField(20);

        JLabel lastNameLabel = new JLabel("Last Name:");

        lastNameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");

        emailField = new JTextField(20);

        JLabel phoneNumberLabel = new JLabel("Phone Number:");

        phoneNumberField = new JTextField(10);

        addButton = new JButton("Add Employee");

        //retrieveButton = new JButton("Retrieve Employees");



        // Add components to content pane

        JPanel contentPane = new JPanel();

        contentPane.setLayout(new GridLayout(3, 2));

        contentPane.add(idLabel);

        contentPane.add(idField);

        contentPane.add(firstNameLabel);

        contentPane.add(firstNameField);

        contentPane.add(lastNameLabel);

        contentPane.add(lastNameField);

        contentPane.add(emailLabel);

        contentPane.add(emailField);

        contentPane.add(phoneNumberLabel);

        contentPane.add(phoneNumberField);

        contentPane.add(addButton);

        getContentPane().add(contentPane, BorderLayout.CENTER);



        // Add action listeners

        addButton.addActionListener(this);



        // Connect to database

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String jdbcUrl = "jdbc:mysql://localhost:3306/mydb";

            String username = "root";

            String password = "root";

            connection = DriverManager.getConnection(jdbcUrl, username, password);

            statement = connection.createStatement();

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();

        }



        // Set window properties

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 200);

        setLocationRelativeTo(null);

        setVisible(true);

    }



    public static void main(String[] args) {

        new EmployeeInformationSystemGUI();

    }



    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addButton) {

            addEmployee();

        }

    }



    private void addEmployee() {

        int id = Integer.parseInt(idField.getText());

        String firstName = firstNameField.getText();

        String lastName = lastNameField.getText();

        String email = emailField.getText();

        String phoneNumber = phoneNumberField.getText();

        String sql = "INSERT INTO employees VALUES (" + id + ", '" + firstName + "', '" + lastName + "', '" + email + "', '" + phoneNumber + "')";

        try {

            statement.executeUpdate(sql);

            JOptionPane.showMessageDialog(this, "Employee added successfully");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }



}