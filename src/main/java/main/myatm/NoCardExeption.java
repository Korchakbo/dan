package main.myatm;


public class NoCardExeption extends Throwable {
        @Override
        public void printStackTrace() {
            super.printStackTrace();
            System.err.println("No Card Is Inserted");
        }

}
