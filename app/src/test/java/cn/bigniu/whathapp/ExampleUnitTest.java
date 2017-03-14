package cn.bigniu.whathapp;

import org.junit.Test;

import cn.bigniu.whathapp.api.Account;
import cn.bigniu.whathapp.api.Result;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Result result = Account.login("18616023612", "pwd");
        assertEquals(0,result.errcode);
    }
}