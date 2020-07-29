
public class Mangement {
	private static int maxLen = 100;
	private static int len = 0;
	private static Student[] data = new Student[maxLen];
	
	public static int getMaxlen() {
		return maxLen;
	}

	public static int getLen() {
		return len;
	}

	public static Student getData(int index) {
		return data[index];
	}

	public static int addData(Student newData){
		if (len < maxLen) {			
			data[len] = newData;
			len++;
			return 0;
		} 
		else{
			return -1;
		}
	}
	
	public static void sortData(){
		for (int i = 0; i < len -1; i++){
			int minIndex = i;
			for (int j = i+1; j < len; j++){
				if (data[minIndex].getAverage() < data[j].getAverage()){
					minIndex = j;
				}
			}
			if (minIndex != i){
				Student temp = data[i];
				data[i] = data[minIndex];
				data[minIndex] = temp;
			}
		}
	}
	
	public static int search(int number){
		for(int i = 0; i < len; i++){
			if (data[i].getNumber() == number){
				return i;
			}
		}
		return -1;
	}
	
	public static void rewrite(int choice, int i, int score){
		switch(choice){
			case 1:{
				Mangement.getData(i).setEnglish(score);
				break;
			}
			case 2:{		
				Mangement.getData(i).setMath(score);
				break;
			}
			case 3:{
				Mangement.getData(i).setJava(score);
				break;
			}
			default:{
				System.out.println("没有这个选项！");
				break;
			}					
		}
	}
	
	public static int delete(int number){
		for (int i = 0; i < len; i++){
			if (data[i].getNumber() == number){
				for (int j = i + 1; j < len; j++){
					data[j-1] = data[j];
				}
				len--;
				return 0;
			}
		}
		return -1;
	}
}
