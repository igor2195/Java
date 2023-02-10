import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/skillbox";
        String user = "root";
        String pass = "rootroot";
        String SqlRequest = "SELECT course_name, COUNT(course_name)/(MAX(MONTH(subscription_date)) - MIN(MONTH(subscription_date))) AS average_quantity FROM PurchaseList GROUP BY course_name";

        try {
            Connection connection = DriverManager.getConnection(url, user, pass);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(SqlRequest);
            while (resultSet.next()){
                String res = resultSet.getString("course_name") +
                        " / среднее количество покупок в месяц: " +
                        resultSet.getString("average_quantity");
                System.out.println(res);
            }

            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
