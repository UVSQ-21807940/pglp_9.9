package main;
import java.io.IOException;
import java.sql.SQLException;

public interface Commande {
	void execute() throws IOException, SQLException;
}
