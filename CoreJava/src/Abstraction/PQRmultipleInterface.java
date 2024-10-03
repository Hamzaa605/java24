package Abstraction;

public class PQRmultipleInterface {
   public static void main(String[] args) {
	
	   R r=new R();
	   r.add(45, 65);
	   r.sub(34, 65);
	   int ans=r.square(77);
	   
	   System.out.println(ans);
}
}
