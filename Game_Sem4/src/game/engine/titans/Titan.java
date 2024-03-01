package game.engine.titans;

public abstract class Titan implements Comparable <Titan> {
	
	public Titan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase, int speed, int resourcesValue, int dangerLevel){
	    this.baseHealth = baseHealth;
	    this.currentHealth = baseHealth;
	    this.baseDamage = baseDamage;
	    this.heightInMeters = heightInMeters;
	    this.distanceFromBase = distanceFromBase;
	    this.speed = speed;
	    this.resourcesValue = resourcesValue;
	    this.dangerLevel = dangerLevel;
	}
	public int compareTo(Titan o){
		return this.distanceFromBase-o.distanceFromBase;
	}

	private final int baseHealth;
	private int currentHealth;
	private final int baseDamage;
	private final int heightInMeters;
	private int distanceFromBase;
	private int speed;
	private final int resourcesValue;
	private final int dangerLevel;
	
	public int getDistanceFromBase() {
		return distanceFromBase;
	}
	public void setDistanceFromBase(int distanceFromBase) {
		this.distanceFromBase = distanceFromBase;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getHeightInMeters() {
		return heightInMeters;
	}
	public int getResourcesValue() {
		return resourcesValue;
	}
	public int getDangerLevel() {
		return dangerLevel;
	}

	
	public int getBaseDamage() {
		return baseDamage;
	}
	
	
	public int getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}
	
	
	public int getBaseHealth() {
		return baseHealth;
	}
	


}
