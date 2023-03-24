package poins_one_one;
//
//  different package
//  can access class
//  by import <name package>.<name method>
public class Database {
    final private String host = "127.0.0.1";
    final private String user = "thitikorn";
    final private String pass = "Architecture.890.098";
    final private String databaseName = "Student";
    final private String port = "3307";

    public String getHost () {
        return this.host;
    }

    public String getUser () {
        return this.user;
    }

    public String getPass () {
        return this.pass;
    }

    public String getDatabaseName () {
        return this.databaseName;
    }

    public String getPort () {
        return this.port;
    }


}


