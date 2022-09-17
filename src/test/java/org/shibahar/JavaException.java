package org.shibahar;

public class JavaException {

    public static void main(String[] args) {

        try {
            System.out.println("step 1");

            int i = 4 / 0;
        }

        catch (Exception e)
        {   e.getMessage();
            e.getCause();
            e.printStackTrace();
        }

        System.out.println("Step 2");
    }
}
