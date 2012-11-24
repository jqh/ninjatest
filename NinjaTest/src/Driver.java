
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Ninja ninja1 = new Ninja("Bill", "Sword");
		
		System.out.println("Name:" + ninja1.getName());
		System.out.println("Weapon: " + ninja1.getWeapon());
		System.out.println("On Mission: " + ninja1.getOnMission());
		
		ninja1.setWeapon("Bo");
		ninja1.sendOnMission();
		
		System.out.println("Weapon: " + ninja1.getWeapon());
		System.out.println("On Mission: " + ninja1.getOnMission());
		
		ninja1.endMission();
		System.out.println("On Mission: " + ninja1.getOnMission());
		
	}

}
