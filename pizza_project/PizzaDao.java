package pizza;

import java.util.Scanner;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.*;

public class PizzaDao {
	private Scanner scanner;

	{
		scanner = new Scanner(System.in);
	}
	
	private Document readPizzaDetails() {
		System.out.print("Enter Pizza name: ");
		String name = scanner.next();
		System.out.print("Enter Pizza size in inches: ");
		byte size = scanner.nextByte();
		System.out.print("Enter Pizza price: ");
		float price = scanner.nextFloat();	
		Document pizza = new Document("name", name).append("size", size).append("price", price);
		return pizza;
	}

	private MongoDatabase connectDb() {
        String url = "mongodb://localhost:27017";
        MongoDatabase database = null;
        try { 
        MongoClient mongoClient = MongoClients.create(url);
        	database = mongoClient.getDatabase("nithin_db");
            
            System.out.println("DB connection successful");
            return database;
	}
    catch(Exception e) {
    	System.out.println("Error in connecting to DB");
    	}
        return database;
	}

	private void disConnectDb(MongoDatabase db) {
		db.drop();
		System.out.println("DB disconnected");
	}

	public void insertPizza() {
		MongoDatabase db = connectDb();
		Document pizza = readPizzaDetails();
		MongoCollection<Document> collection = db.getCollection("pizzas");
		collection.insertOne(pizza);
		disConnectDb(db);
	}

	public void deletePizza() {

	}

	public void updatePizza() {

	}

	public void searchPizza() {

	}

	public void listAllPizza() {

	}

}
