import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<PlayableCard> list = new ArrayList<PlayableCard>();
		list.add(new Magic(2, 5, 3, "magique"));
		list.add(new Magic(3, 5, 5, "magique"));
		list.add(new Magic(5, 5, 8, "magique"));
		list.add(new Magic(10, 5, 9, "magique"));
		ArrayList<PlayableCard> liste = new ArrayList<PlayableCard>();
		liste.add(new Magic(2, 5, 3, "magique"));
		liste.add(new Magic(3, 5, 5, "magique"));
		liste.add(new Magic(5, 5, 8, "magique"));
		liste.add(new Magic(10, 5, 9, "magique"));
		Deck d = new Deck("lel",list); 
		Deck e = new Deck("lel",liste);
		Summoner s1= new Summoner(20, 20,d);
		Summoner s2 = new Summoner(20, 20, e);
		new BunkaGamu(s1, s2).play();

	}

}
