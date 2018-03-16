public class Shadow{
  int x = 1;
  
  public static void main(String[] args){
    Shadow s = new Shadow();
	System.out.println("Local x = "+s.localVar());
	System.out.println("Global x from method is: "+s.globalVar());
	System.out.println("Global x from attribute is: "+s.x);
	Index.main(null);
  }
  int globalVar(){
    return this.x;
  }
  
  int localVar(){
    int x = 2;
	return x;
  }

}