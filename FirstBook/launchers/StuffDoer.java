import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 13.12.9
 * Time: 19:23
 * To change this template use File | Settings | File Templates.
 */
public class StuffDoer
{
    public static void main(String[] args) {
        StuffDoer stuffDoer = new StuffDoer();
        stuffDoer.run();
    }

    private void run() {

        ArrayList<Integer> ListZXC  = new ArrayList<Integer>();

        int s = 0;
        int r = 0;

         for (int i =999; i > 0 ; i-- )
        {
            for (int t = i; t > 0 ; t--)
            {

                s = i * t ;

                String p = String.valueOf(s);

                int n;
                int m;
                n = p.charAt(0);
                m = p.length();
                while n<m
                {

                }

                if (s > r)
                        {
                            r = s;
                        }


            }

        }
        System.out.println(s);
    }
}
