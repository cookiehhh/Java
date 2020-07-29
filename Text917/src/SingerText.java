
public class SingerText {
	public static void main(String[] args) {
		Singer singer1 = new Rocker("摇滚歌手", "摇滚");
		Singer singer2 = new FolkSinger("民族歌手", "民族");
		
		textSinger(singer1);
		textSinger(singer2);
		
	}
	public static void textSinger(Singer singer) {
		singer.sing();
	}
}
