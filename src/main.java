import com.sun.jdi.IntegerValue;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;

public class main {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(str == "Hello world");
        System.out.println(str.equals("Hello world"));
        System.out.println(str.toUpperCase());
        str = str.replace("w","W"); // ini cuma ngegganti yang pertama
        str  = str.replace('l','7'); // ini ngegganti semua
        System.out.println(str);
        System.out.println("We l co me".trim());
        int a  = Integer.parseInt("123456789");
        int b = Integer.valueOf("123456789");
        System.out.println(a + 11);
        System.out.println(b+211);
        int c = -123;
        System.out.println(Math.abs(c));
        System.out.println(Math.round(Math.random() * 100));
    }
}
