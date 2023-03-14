package book.dao;
import book.dto.UserTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class repo {

    static Connection connection  = db.getConnection();


    public void register(UserTO user) {

        try {

            PreparedStatement statement = connection.prepareStatement("insert into user values(?, ?, ?)");
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getpass());

            statement.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("inside regsiter of UserRepository");
        }
    }
            public static int login(String email,String password) {
                try {

                    PreparedStatement statement = connection.prepareStatement("select * from user where email= ? and password= ?");
                    statement.setString(1, email);
                    statement.setString(2,password);


                    ResultSet resultset =  statement.executeQuery();


                        if (resultset.next() == true) {
                            return 1;
                        }

                }
                catch(Exception e) {

                    System.out.println("inside catch of Login of UserRepo");
                }

                return 0;

            }

    }




