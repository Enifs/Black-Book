import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 13.3.9
 * Time: 20:42
 * To change this template use File | Settings | File Templates.
 */
public class SelectionSort
        implements Algorithm  {
    @Override
    public void execute() {

        ArrayList<Integer>  list = new ArrayList<Integer>() ;

        ArrayList<Integer> list2 = Utilities.randomIntegerList(10 , 0 , 100) ;

        System.out.println(list2);

        while(!list2.isEmpty()) {

        list.add(FindSmallest(list2));

        }

        System.out.println(list2);

        System.out.println(list);


        //To change body of implemented methods use File | Settings | File Templates.
    }

    private Integer FindSmallest(ArrayList<Integer> list3){

        int r ;

        r = 0 ;

        for ( int i = 0 ; i < list3.size() ; i++ )
            {

                if (list3.get(i) < list3.get(r) )
                {

                 r = i ;

                 }
            }

                int p = list3.get(r) ;

        list3.remove(r);

        return p;

    }

}
