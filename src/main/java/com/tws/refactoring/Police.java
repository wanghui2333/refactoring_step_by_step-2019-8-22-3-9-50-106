package com.tws.refactoring;

/**
 * 功能描述 : Police类
 * @Author : 王辉
 * @Email : wanghui16@zybank.com.cn
 * @Date : 2019-08-27 10:48
 */
public class Police {
    public boolean checkDriver(Driver driver) {
        return driver.getAge() >= 18;
    }
}
