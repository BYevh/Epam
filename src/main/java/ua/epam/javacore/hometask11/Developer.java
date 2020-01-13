package ua.epam.javacore.hometask11;

import java.sql.*;

public class Developer {
    private static final String URL = "jdbc:mysql://localhost:3306/HT10?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
    private static final String USER = "root";
    private static final String PASSWORD = "1111";

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        String query = "SELECT * FROM ht10.developers";

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String fn = resultSet.getString(2);
                String sn = resultSet.getString(3);
                int salary = resultSet.getInt(4);

                System.out.printf("id: %d, first name: %s, second name: %s, salary: %d %n", id, fn, sn, salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }

    }

}
