/**
 * Created by fur1k on 26.05.2017.
 */
import java.io.Serializable;
public class Worker implements Cloneable, Serializable {
     String name;
     int skill;



    public Worker(String name, int skill ) {
        this.setName(name);
        this.setSkill(skill);

    }

    public Worker(Worker otherWorker) {
        this.setName(otherWorker.getName());
        this.setSkill(otherWorker.getSkill());


    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + this.getName() + ". His skill is "
                + this.getSkill()//.getContry() + ", "
                + this.getSkill();//.getContry();
    }

    public Worker clone() throws CloneNotSupportedException {
        Worker cloned = (Worker) super.clone();

     //  cloned.doingDetail = (Worker) doingDetail.clone();
        return cloned;

    }


    public void setSkill(Worker worker2) {

    }
}


