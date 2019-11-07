import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File(args[0]));
		int ilosc = Integer.parseInt(input.nextLine());
		
		OneWayCollection list = new OneWayCollection(input.nextLine().split(" "));
		input.close();	
		
		for(int i = 0; i<ilosc;i++) {
			if(list.pointer.value%2==1)
				list.add();
			else
				list.delete();
		}
		
		list.showCollection();		
	}
}