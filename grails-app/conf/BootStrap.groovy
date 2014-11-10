import javax.sql.DataSource
import java.sql.Statement

class BootStrap {

    DataSource dataSource

    def init = { servletContext ->

        Statement statement = dataSource.getConnection().createStatement()

        statement.execute("CREATE TABLE Item (id INTEGER NOT NULL, label VARCHAR(255))")
        statement.execute("INSERT INTO Item (id, label) VALUES (1, 'Sample')")

        statement.close()
    }

    def destroy = {
    }
}
