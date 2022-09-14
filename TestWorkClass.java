public class TestWorkClass {

	public static void main(String[] args) {
		//TownCell testC = new TownCell();
		Town my_town = new Town(4, 4);
		System.out.println(my_town.toString());
		
		Empty e1 = new Empty(my_town, 0, 0);
		System.out.println(e1.who());
	}

}
