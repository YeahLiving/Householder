package com.yeahliving.services;

import com.yeahliving.datatypes.objs.Employee;
import org.apache.commons.lang.StringUtils;

/**
 * Created by xingfeiy on 8/18/15.
 */
public class IdentityService {
    public Employee login(String usr, String pwd) {
        if(StringUtils.isBlank(usr) || StringUtils.isBlank(pwd)) {
            return null;
        }

        Employee employee = new Employee();

        return employee;
    }
}
