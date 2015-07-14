package main.java.com.yeahliving.datatypes;

/**
 * Created by xingfeiy on 7/14/15.
 */
public enum YLDBPermission {
    SUPER(0x01111111),

    READ_ONLY(0x0000000);

    private final int permission;

    private YLDBPermission(int permission) {
        this.permission = permission;
    }
}
