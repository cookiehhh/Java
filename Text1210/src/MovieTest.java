import java.util.*;

public class MovieTest {

	public static void main(String[] args) {
		Movie avatar = new Movie(1, "阿凡达", 50);
        Movie twilight = new Movie(2, "暮光之城", 30);
        
        Movie moJing = new Movie(1, "魔镜", 45);
        Movie anathema = new Movie(2, "咒怨", 35);
        
        
        List scienceFictionList = new ArrayList();
        scienceFictionList.add(avatar);
        scienceFictionList.add(twilight);
        
        List draculaMovieList = new ArrayList();
        draculaMovieList.add(moJing );
        draculaMovieList.add(anathema);
        
        Map movies = new HashMap ();
        movies.put("科幻电影", scienceFictionList);
        movies.put("恐怖电影", draculaMovieList);
        
        System.out.println("键的集合：" + movies.keySet());
        System.out.println("值的集合：" + movies.values());
        System.out.println("“键-值”对集合：" + movies);
        
        String key = "科幻电影";
        if (movies.containsKey(key)) {
            System.out.println("键“"+key+"”对应的值："+movies.get(key));
        }
        movies.remove(key);
        System.out.println("“键-值”对集合：“ + movies");



	}

}
