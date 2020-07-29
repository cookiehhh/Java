import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(true){
			
			Display.list();
			int choice = input.nextInt();
			
			switch(choice){
			
				case 1:{
					Display.input();
					break;
				}
				case 2:{
					Display.output();
					break;
				}
				case 3:{
					Display.sort();
					break;
				}
				case 4:{
					Display.search();
					break;
				}
				case 5:{
					Display.rewrite();
					break;
				}
				case 6:{
					Display.delete();
					break;
				}
				case 0:{
					System.exit(0);
					break;
				}
				default:{
					System.out.println("没有这个选项！");
					break;
				}			
			}
		}
	}
}
