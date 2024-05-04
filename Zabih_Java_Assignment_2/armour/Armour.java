package armour;

public abstract class Armour {
  private int armourAmount;
  private int dexterityCost;
  private String armorType;  //  add armorTpye property

  public Armour() {
    // do nothing
  }

  //==============>>
  // GETTERS
  public int getArmourAmount() {
    return this.armourAmount;
  }
  public int getDexterityCost() {
    return this.dexterityCost;
  }
  public String getArmorType(){   // Added get Armor Type
    return this.armorType;        
  }
  public abstract int reduceDamage(int damageAmount);

  //==============>>
  // SETTERS
  public void setArmourAmount(int armourAmount) {
    this.armourAmount = armourAmount;
  }
  public void setDexterityCost(int dexterityCost) {
    this.dexterityCost = dexterityCost;
  }
  public void setArmorType(String armorType){   // added Set Armor Type
    this.armorType = armorType;
  }
} // class
