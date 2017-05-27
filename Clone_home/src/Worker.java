
public class Worker{
        public String workerName;
        public Experince brain;
        
        
        Worker(String workerName) {
            this.workerName = workerName;
           
        }

		

		public class Experince implements Cloneable{
			String mainKnowledge;
           public 	Physic ph;
           
			
			public class Physic implements Cloneable{
				String physicKnowledge;
			}

			protected Object clone() throws CloneNotSupportedException {
			    return super.clone();
			}

			@Override
			public String toString() {
				return "Experince [mainKnowledge=" + mainKnowledge + ", ph=" + ph + "]";
			}

			
		}
			
		protected Object clone() throws CloneNotSupportedException {
		    return super.clone();
		}

		@Override
		public String toString() {
			return "Worker [workerName=" + workerName + ", brain=" + brain + "]";
		}
		
        }
    

