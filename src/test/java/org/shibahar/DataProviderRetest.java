package org.shibahar;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderRetest {


    @Test(dataProvider = "login")

    public void testing(String Username,String password)
    {

        System.out.println(Username);
        System.out.println(password);

    }


    @DataProvider(name = "login")
    public Object[][] data_provider()
    {

        Object[][] data={{"xyz","123"},{"abc","134"}};
        return data;
    }
}
