package by.mitr.backendeducation.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest(classes =
        Config.class)
@ActiveProfiles("DEV")
public class ConfigTest {
    @Autowired
    private DataSource dataSource;

    @Test
    void dataSourceDEVTest() throws SQLException {
       var userName =  dataSource.getConnection().getMetaData().getUserName();
        Assertions.assertEquals("TESTUSERNAME",userName);
    }

}
