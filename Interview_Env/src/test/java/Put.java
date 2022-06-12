import com.github.dockerjava.transport.DockerHttpClient.Response;

import io.github.bonigarcia.wdm.online.GitHubApi;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;
import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

public class Put {

	public static void main(String[] args) {
		String str = "this is a test string";
        String pat = "tist";
 
        System.out.print("Smallest window is :\n "
                         + findSubString(str, pat));
		
	}
	
    static final int no_of_chars = 256;

    static String findSubString(String str, String pat)
    {
        int len1 = str.length();
        int len2 = pat.length();
 
        if (len1 < len2) {
            System.out.println("No such window exists");
            return "";
        }
 
        int hash_pat[] = new int[no_of_chars];
        int hash_str[] = new int[no_of_chars];
 

        for (int i = 0; i < len2; i++)
            hash_pat[pat.charAt(i)]++;
 
        int start = 0, start_index = -1,
            min_len = Integer.MAX_VALUE;
 
        int count = 0;
        for (int j = 0; j < len1; j++) {
           

            hash_str[str.charAt(j)]++;
 
            if (hash_str[str.charAt(j)]
                <= hash_pat[str.charAt(j)])
                count++;
 
            if (count == len2) {

                while (hash_str[str.charAt(start)]
                           > hash_pat[str.charAt(start)]
                       || hash_pat[str.charAt(start)]
                              == 0) {
 
                    if (hash_str[str.charAt(start)]
                        > hash_pat[str.charAt(start)])
                        hash_str[str.charAt(start)]--;
                    start++;
                }

                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
 
        if (start_index == -1) {
            System.out.println("No such window exists");
            return "";
        }
 
        return str.substring(start_index,
                             start_index + min_len);
    }

}

