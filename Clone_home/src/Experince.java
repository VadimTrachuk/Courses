
public class Experince implements Cloneable{
String mainKnowledge;
String physicsKnowledge;
Worker worker;

Experince(Worker worker, String mainKnowledge, String physicsKnowledge ){
	this.worker = worker;
	this.mainKnowledge = mainKnowledge;
	this.physicsKnowledge = physicsKnowledge;
}

protected Object clone() throws CloneNotSupportedException {
    return super.clone();
}

@Override
public String toString() {
	return "Experince [mainKnowledge=" + mainKnowledge + ", physicsKnowledge=" + physicsKnowledge + ", worker=" + worker
			+ "]";
}


}
