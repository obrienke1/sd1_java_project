public class TryCatch{
  public static void main(String[] args){
    int[] x = {7, 6 , 11, 15, 19};

    try{
      System.out.println("Value stored in index 5 is: "+x[5]);
    }
    catch(ArrayIndexOutOfBoundsException e){
	  System.out.println("There was a ArrayIndexOutOfBoundsException");
	}
    catch(Exception e){ // use this for general exception or if you are not sure what kind of exception may occur
       System.out.println("Warning: Some Other exception");
    }
    //mention using a finally block
	System.out.println("End of Program");
	Index.main(null);
  }
}

