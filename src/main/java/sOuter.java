import com.google.common.base.CharMatcher;

import java.util.Scanner;

public class sOuter {

    public static void whoIsJenkins(){
        String hejString = CharMatcher.whitespace().trimFrom("          Leeeeeroy JEEEEENKINS    ");
        System.out.println(hejString);
    }
}
