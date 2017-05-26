import java.io.IOException;

/**
 * Created by fur1k on 26.05.2017.
 */
public class Main {
    //jjhhjkj
    //kjkkkjhj


    public static void main(String[] args) throws IOException, CloneNotSupportedException {
     Worker worker1, worker2, worker3;
     Detail detailLol;

     detailLol = new Detail("China", "Bolt");


        worker1 = new Worker("Egor",  detailLol );

        System.out.println("worker1: ");
        System.out.println(worker1);

        System.out.println("1-------------");
        try{
            worker3 = worker1.clone();
            worker3.setDoingDetail(new Detail("Ukr", "Gayka"));
            System.out.println("worker1: ");
            System.out.println(worker1);
            System.out.println("worker3: ");
            System.out.println(worker3);

            if (worker1.equals(worker3))
                System.out.println("worker1 equals worker3");
            if (worker1.equals(worker3))
                System.out.println("student1 equals student3");
            if (worker1.getDoingDetail().equals(worker3.getDoingDetail()));
                System.out.println("student1.Address equals student3.Address");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
