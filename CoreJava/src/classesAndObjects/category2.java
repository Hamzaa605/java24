package classesAndObjects;

public class category2 {
  int categoryId;
  String categoryName;
  
  category2()
  {
	  System.out.println("Category");
  }
  
  category2(int categoryId,String categoryName)
  {
	  this.categoryId=categoryId;
	  this.categoryName=categoryName;
  }
  
  category2(String categoryName,int categoryId)
  {
	  this.categoryId=categoryId;
	  this.categoryName=categoryName;
  }
}
