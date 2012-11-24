
public class Ninja {

	
	public Ninja(String name, String weapon) {
		super();
		this.name = name;
		this.weapon = weapon;
		this.onMission = false;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public Boolean getOnMission() {
		return onMission;
	}
	public void sendOnMission() {
		this.onMission = true;
	}
	
	public void endMission() {
		this.onMission = false;
	}
	
	private String name;
	private String weapon;
	private Boolean onMission;
	
	
}
