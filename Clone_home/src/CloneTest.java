public class CloneTest{
    
    

    public static void main(String[] args) throws CloneNotSupportedException {
        Worker worker = new Worker("John");
        Details finDetail = new Details(worker,1,"detail1");
       
        worker.brain = worker.new Experince();
        worker.brain.ph = worker.brain.new Physic();
       
        Worker worker1 = new Worker("Vova"); 
       
       
        Details clone = (Details) finDetail.clone();
        System.out.println(finDetail);
        System.out.println(clone);
        
        clone.detail = new String("detail2");
        //clone.worker.workerName="Ivan";
        
        System.out.println(finDetail);
        System.out.println(clone);
        
        
    }
}
