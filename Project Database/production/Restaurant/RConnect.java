package sqlproject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RConnect {
    
    Connection con;
    private String url;
    private String root;
    private String pw;

    public RConnect(String url, String root, String pw) {
        this.url = url;
        this.root = root;
        this.pw = pw;
    }

    public boolean connection() {
        try {
            String timeZoneFixer = "?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            this.con = DriverManager.getConnection(this.url + timeZoneFixer, this.root, this.pw);
            return true;
        } catch (Exception var2) {
            var2.printStackTrace();
            return false;
        }
    }


}
