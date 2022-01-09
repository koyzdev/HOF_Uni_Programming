//
// Called "Objektorientierung - Aufgaben.pdf" on Moodle
//

package com.company;

public class Main
{
    public static void main(String[] args)
    {
        var a = new time();
        var b = new time(555550000);
        var c = new time(5, 23, 55);

        try
        {
            Thread.sleep(50000000);
        }
        catch(Exception e)
        {

        }
    }
}
