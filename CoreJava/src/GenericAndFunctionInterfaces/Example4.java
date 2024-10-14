package GenericAndFunctionInterfaces;

import java.util.function.Consumer;

public class Example4 {
public static void main(String[] args) {
	
	Consumer<Integer> square=new Consumer<Integer>() {
		
		@Override
		public void accept(Integer t) {
			
			System.out.println(t*t);
		}
	};
	 square.accept(78);
}
}
