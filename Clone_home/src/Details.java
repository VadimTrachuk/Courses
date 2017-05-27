class Details implements Cloneable{
        String detail;
        int number;
        Worker worker;
        Details(Worker worker, int number, String detail) {
            this.worker = worker;
            this.number = number;
            this.detail = detail;
        }

       
        

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

		@Override
		public String toString() {
			return "Details [detail=" + detail + ", number=" + number + ", worker=" + worker + "]";
		}
    }
