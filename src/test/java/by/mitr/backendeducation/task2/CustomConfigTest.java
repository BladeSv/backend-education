package by.mitr.backendeducation.task2;

import by.mitr.backendeducation.task1.Config;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ActiveProfiles;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
public class CustomConfigTest {
    @Autowired
    private DataSource dataSource;

    @Test
    void dataSourceTest() throws SQLException {
        var userName =  dataSource.getConnection().getMetaData().getUserName();
        Assertions.assertEquals("TESTUSERNAME2",userName);
    }
}
