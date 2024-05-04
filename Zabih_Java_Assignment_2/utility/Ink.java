package utility;

import warrior.Warrior;

public class Ink {

  public Ink() {
    // do nothing
  } // contructor

  // Welcome Message
  public void welcomeMessage() {
    System.out.println("""
      __        __             _             ____   ___ ____  _  _   
      \\ \\      / /_ _ _ __ ___(_)_ __ ___   |___ \\ / _ \\___ \\| || |  
       \\ \\ /\\ / / _` | '__/ __| | '_ ` _ \\    __) | | | |__) | || |_ 
        \\ V  V / (_| | |  \\__ \\ | | | | | |  / __/| |_| / __/|__   _|
         \\_/\\_/ \\__,_|_|  |___/_|_| |_| |_| |_____|\\___/_____|  |_|  
    """);
  }
  public void printWarriorMenu() {
  
    System.out.println("Select a Warrior:");
    System.out.println("╔════════════════════╗");
    System.out.println("║1: Human            ║");
    System.out.println("║2: Elf              ║");
    System.out.println("║3: Orc              ║");
    System.out.println("╚════════════════════╝");
    System.out.println("╔════╗");
    System.out.println("║    ║");
    System.out.println("╚════╝\n");
    System.out.print("\033[3A\033[1C"); 
}



// Weapon Menu
public void printWeaponMenu() {
    System.out.println("\n╔════════════════════╗");
    System.out.println("║Select a Weapon     ║  ");
    System.out.println("╚════════════════════╝");
    System.out.println("╔════════════════════╗");
    System.out.println("║1: Dagger           ║");
    System.out.println("║2: Sword            ║");
    System.out.println("║3: Axe              ║");
    System.out.println("╚════════════════════╝");
    System.out.println("╔════╗");
    System.out.println("║    ║");
    System.out.println("╚════╝\n");
    System.out.print("\033[3A\033[1C"); 
}

  // Armor Menu
  public void printArmourMenu() {
    System.out.println("\n╔════════════════════╗");
    System.out.println("║Select an Armour    ║  ");
    System.out.println("╚════════════════════╝");
    System.out.println("╔════════════════════╗");
    System.out.println("║1: Leather          ║");
    System.out.println("║2: Chainmail        ║");
    System.out.println("║3: Platemail        ║");
    System.out.println("╚════════════════════╝");
    System.out.println("╔════╗");
    System.out.println("║    ║");
    System.out.println("╚════╝\n");
    System.out.print("\033[3A\033[1C"); 
    
  }

  // Attack Menu
  public void printAttackMenu() {
    System.out.println("\nAttack Type: \n1) Normal\n2) Heavy");

    System.out.println("**************************");
    System.out.println("Go Go Select Attack Type  ");
    System.out.println("**************************");
 
    System.out.println("╔════════════════════╗");
    System.out.println("║1: Normal           ║");
    System.out.println("║2: Heavy            ║");
    System.out.println("╚════════════════════╝");
    System.out.println("╔════╗");
    System.out.println("║    ║");
    System.out.println("╚════╝\n");
    System.out.print("\033[3A\033[1C"); 
  }

  public void printEnemyTurn() {
  }


  // Print Stats
  public void printStats(Warrior pWarrior, Warrior eWarrior) {
    System.out.println("\n________________________________________________");
    System.out.printf("Player has \n", pWarrior.getWarriorType());
    System.out.println("________________________________________________");
    System.out.printf("Health: %-25d\n",pWarrior.getHealth());
    System.out.printf("Strength: %-25d\n",pWarrior.getStrength());
    System.out.printf("Dexterity: %-25d\n",pWarrior.getDexterity());
      System.out.println("________________________________________________");
    System.out.printf("Enemy has\n",eWarrior.getWarriorType());
    System.out.println("________________________________________________");
    System.out.printf("Health: %-25d\n", eWarrior.getHealth());
    System.out.printf("Strength: %-25d\n", eWarrior.getStrength());
    System.out.printf("Dexterity: %-25d\n", eWarrior.getDexterity());
    System.out.println("________________________________________________");
  } // printStats()

  // GameOver Message
  public void printGameOver(String winner) {
    System.out.printf("""
         __ __
      .-',,^,,'.
     / \\(0)(0)/ \\
     )/( ,_"_,)\\(
     `  >-`~(   ' 
   _N\\ |(`\\ |___
   \\' |/ \\ \\/_-,)
    '.(  \\`\\_<
       \\ _\\|
        | |_\\_
        \\_,_>-'
    winner: %s
        """, winner);

        if (winner.equals("Player")) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Sorry, you lost. Good luck next time!");
        }
    
  } // printGameOver()




} // class