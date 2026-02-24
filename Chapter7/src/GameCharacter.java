
public class GameCharacter 
{
  private String name; 
  private int health; 
  
  //constructor method
  public GameCharacter(String charName, int starHealth)
  { 
	  name = charName;
	health = starHealth; 
  }
	//Behaviour: actions the character can do 
	public void attack()
	{
		System.out.println(name + "Attacks! Deals 10 damage.");
	}
} 


public void takeDamage(int damage)
{
	health = health - damage; 
	if(health <0)
		health = 0;
	System.out.println(name + "'s health is now" + health);
} 
