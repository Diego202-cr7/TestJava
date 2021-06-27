package com.platzi.javatest;

import org.junit.Test;


import static com.platzi.javatest.PasswordUtil.SecurityLevel.WEAK;
import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public  void weak_when_has_less_than_8_letters(){

        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }

}