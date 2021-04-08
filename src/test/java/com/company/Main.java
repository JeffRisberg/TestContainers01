package com.company;

// import lombok.extern.slf4j.Slf4j;

//import static org.testcontainers.MySQLTestImages.MYSQL_IMAGE;

import java.sql.*;
import org.junit.Assert;
import org.junit.Test;
import org.testcontainers.containers.MySQLContainer;

// @Slf4j
public class Main {

  @Test
  public void sampleTestMethod() throws SQLException {
    MySQLContainer<?> mysql = new MySQLContainer<>();

    mysql.start();

    try (Connection conn = mysql.createConnection("")) {
      Statement stmt = conn.createStatement();

      // create sql table
      String sql =
          "CREATE TABLE registration "
              + "(id INTEGER NOT NULL, "
              + " first VARCHAR(255), "
              + " last VARCHAR(255), "
              + " age INTEGER, "
              + " PRIMARY KEY (id))";

      stmt.executeUpdate(sql);

      // insert records in table 'registration'
      String insertSQL = "INSERT INTO registration " + "values (100, 'Luke', 'Skywalker', 18)";
      stmt.executeUpdate(insertSQL);

      // fetching and asserting the record
      ResultSet result = stmt.executeQuery("select id from registration");
      result.next();
      Assert.assertEquals(100, result.getInt(1));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
