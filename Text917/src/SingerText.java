
public class SingerText {
	public static void main(String[] args) {
		Singer singer1 = new Rocker("ҡ������", "ҡ��");
		Singer singer2 = new FolkSinger("�������", "����");
		
		textSinger(singer1);
		textSinger(singer2);
		
	}
	public static void textSinger(Singer singer) {
		singer.sing();
	}
}
