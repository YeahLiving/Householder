package main.java.com.yeahliving.datatypes.records;

import main.java.com.yeahliving.datatypes.*;
import main.java.com.yeahliving.datatypes.records.AbstractYLRecord;
import org.apache.commons.lang.StringUtils;
import org.json.JSONObject;

/**
 * Created by xingfeiy on 7/14/15.
 */
public class EmployeeRecord extends AbstractYLRecord {
    //the job number of employee in company.
    private int jobNumber = 0;

    private String name = StringUtils.EMPTY;

    private int age = 0;

    private String id = StringUtils.EMPTY;

    private boolean married = false;

    private String phone = StringUtils.EMPTY;

    //cell phone number
    private String mobile = StringUtils.EMPTY;

    private String email = StringUtils.EMPTY;

    private YLAddress address = null;

    private YLContact emergencyContact = null;

    private float seniority = 0.0f;

    private YLDepartment department = YLDepartment.MARKETING;

    //the value is false if this employee is part time.
    private boolean fullTime = true;

    private YLPosition position = YLPosition.UNKNOWN;

    //the job number of supervisor.
    private int supervisor = 0;

    private YLDBPermission permission = YLDBPermission.READ_ONLY;



    public EmployeeRecord(int recordID) {
        super(recordID);
    }

    @Override
    public JSONObject toJson() {
        return null;
    }
}
