package main.java.com.yeahliving.datatypes.records;

/**
 * Created by xingfeiy on 7/14/15.
 */
public abstract class AbstractYLRecord implements YLRecord {

    private int recordID = Integer.MIN_VALUE;

    public AbstractYLRecord(int recordID) {
        this.recordID = recordID;
    }

    public int getRecordID() {
        return recordID;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }
}
