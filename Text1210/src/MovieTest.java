import java.util.*;

public class MovieTest {

	public static void main(String[] args) {
		Movie avatar = new Movie(1, "������", 50);
        Movie twilight = new Movie(2, "ĺ��֮��", 30);
        
        Movie moJing = new Movie(1, "ħ��", 45);
        Movie anathema = new Movie(2, "��Թ", 35);
        
        
        List scienceFictionList = new ArrayList();
        scienceFictionList.add(avatar);
        scienceFictionList.add(twilight);
        
        List draculaMovieList = new ArrayList();
        draculaMovieList.add(moJing );
        draculaMovieList.add(anathema);
        
        Map movies = new HashMap ();
        movies.put("�ƻõ�Ӱ", scienceFictionList);
        movies.put("�ֲ���Ӱ", draculaMovieList);
        
        System.out.println("���ļ��ϣ�" + movies.keySet());
        System.out.println("ֵ�ļ��ϣ�" + movies.values());
        System.out.println("����-ֵ���Լ��ϣ�" + movies);
        
        String key = "�ƻõ�Ӱ";
        if (movies.containsKey(key)) {
            System.out.println("����"+key+"����Ӧ��ֵ��"+movies.get(key));
        }
        movies.remove(key);
        System.out.println("����-ֵ���Լ��ϣ��� + movies");



	}

}
