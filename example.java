
import java.io.File;

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      // Get username from parameters
String username = request.getParameter("username");
// Create a statement from database connection
Statement statement = connection.createStatement();  
// Create unsafe query by concatenating user defined data with query string
String query = "SELECT secret FROM Users WHERE (username = '" + username + "' AND NOT role = 'admin')";
// ... OR ...
// Insecurely format the query string using user defined data 
String query = String.format("SELECT secret FROM Users WHERE (username = '%s' AND NOT role = 'admin')", username);
// Execute query and return the results
ResultSet result = statement.executeQuery(query);
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}