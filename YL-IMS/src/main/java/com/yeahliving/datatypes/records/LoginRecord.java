package main.java.com.yeahliving.datatypes.records;

import main.java.com.yeahliving.datatypes.records.AbstractYLRecord;
import org.apache.commons.lang.StringUtils;
import org.json.JSONObject;

import java.util.Date;

/**
 * Created by xingfeiy on 7/14/15.
 */
public class LoginRecord extends AbstractYLRecord {

    private String username = StringUtils.EMPTY;

    private String password = StringUtils.EMPTY;

    private Date lastTimeLogin = null;

    public LoginRecord(int recordID) {
        super(recordID);
    }

    public LoginRecord(int recordID, String username, String password, Date lastTimeLogin) {
        super(recordID);
        this.username = username;
        this.password = password;
        this.lastTimeLogin = lastTimeLogin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Date getLastTimeLogin() {
        return lastTimeLogin;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

}
