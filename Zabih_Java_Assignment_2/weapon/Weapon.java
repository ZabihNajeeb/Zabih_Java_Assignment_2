package weapon;

import java.util.Random;

public abstract class Weapon {
  private int damageAmount;
  private int dexterityCost;
  protected Random randNum = new Random();
  private String weaponType;  //  Add weaponType

  public Weapon() {
    //do nothing
  } // contructor

  //===============>>
  // GETTERS
  public int getDamageAmount() {
    return this.damageAmount;
  }
  public int getDexterityCost() {
    return this.dexterityCost;
  }
  public String getWeaponType(){   // add getWeeaponType
    return this.weaponType;        
  }

  //===============>>
  // SETTERS
  public void setDamageAmount(int damageAmount) {
    this.damageAmount = damageAmount;
  }
  public void setDexterityCost(int dexterityCost) {
    this.dexterityCost = dexterityCost;
  }
  public void setWeaponType(String weaponType){  // add setWeaponType
    this.weaponType = weaponType;
  }
  // makes it polymorphic!
  public abstract int strike(int weatherIntensity, int attackType, int strength, int dexterity);
} // class
