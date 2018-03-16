public class EnhancedFor{
  public static void main(String[] args){
    int[] x = {7, 6 , 11, 15, 19};
    int total = 0;

    //Rewrite FourthArray.java using Enhanced For
    for(int i: x){
	  total += i;
	}

    System.out.println("Enhanced For. Sum of array values is: "+total);
    Index.main(null);
  }
}

