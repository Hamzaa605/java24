package classesAndObjects;

public class Order {
  int orderNo;
  String cName;
  
  
  void setOrderDetails(int orderNo,String cName) {
  this.orderNo=orderNo;
  this.cName=cName;
  
  System.out.println(this.orderNo+"  "+this.cName);
  }
}

