import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MainWithDao {

    public static void main(String[] args) throws SQLException {
        Connection connection =
                DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                        "postgres", "1496"); //сделали соединение с БД

        CarDAO carDAO = new CarDAO(connection); //Создали DAO

        List<Car> cars = carDAO.getAllCars(); //получили все машины

        Car car = new Car(10, "qwerty", "Germany");
        carDAO.insertNewCar(car);
    }
}