
package military;

import java.io.*;
import java.util.Random;

public class Randomno {
    public int otp()throws IOException
    {
       Random rand=new Random(); 
       int x;
       x=100000+rand.nextInt(900000);
       return(x);
    }
}
