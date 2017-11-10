package Advanced;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;

/*Sample Input

2
1
3
4
5

Sample Output

2
2
2 3
2 3 5
*/

public class PrimeChecker {
    static class Prime {
        public void checkPrime(int ...inputs) {
            StringBuilder str = new StringBuilder("");
            for (int i = 0; i < inputs.length; i++) {
                if(isPrime(inputs[i]))
                    str.append(inputs[i] + " ");
            }
            System.out.println(str.toString().trim());
        }

        private boolean isPrime(int input) {
            if(input<2)
                return false;
            for (int i = 2; i*i <= input; i++) {
                if (input%i==0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
