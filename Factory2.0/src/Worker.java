/**
 * Created by fur1k on 26.05.2017.
 */
import java.io.Serializable;
public class Worker implements Cloneable, Serializable {
     String name;
     Detail doingDetail;


    public Worker(String name, Detail doingDetail ) {
        this.setName(name);
        this.setDoingDetail(doingDetail);

    }

    public Worker(Worker otherWorker) {
        this.setName(otherWorker.getName());
        this.setDoingDetail(otherWorker.getDoingDetail());


    }

    public Detail getDoingDetail() {
        return doingDetail;
    }

    public void setDoingDetail(Detail doingDetail) {
        this.doingDetail = doingDetail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + this.getName() + ". Made in "
                + this.getDoingDetail().getContry() + ", "
                + this.getDoingDetail().getContry();
    }

    public Worker clone() throws CloneNotSupportedException {
        Worker cloned = (Worker) super.clone();

     //  cloned.doingDetail = (Worker) doingDetail.clone();
        return cloned;

    }

    }


