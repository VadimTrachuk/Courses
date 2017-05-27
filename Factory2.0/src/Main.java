import java.io.IOException;

/**
 * Created by fur1k on 26.05.2017.
 */
public class Main   {


    public static void main(String[] args) throws IOException, CloneNotSupportedException {
     Worker worker1, worker2, worker3;
     Detail detailLol;

     detailLol = new Detail("China", "Bolt");


        worker1 = new Worker("Egor",  9 );

        System.out.println("worker1: ");
        System.out.println(worker1);

        System.out.println("1-------------");
        try{
            worker3 = worker1.clone();
           // worker3.setSkill(new Worker());
            System.out.println("worker1: ");

            System.out.println(worker1);
            System.out.println("worker3: ");
            System.out.println(worker3);

            if (worker1.equals(worker3))
                System.out.println("worker1 equals worker3");
            if (worker1.equals(worker3))
                System.out.println("worker1 equals worker3");
            if (worker1.getSkill() == worker3.getSkill());
                System.out.println("worker1.Detail equals worker3.Detail");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
