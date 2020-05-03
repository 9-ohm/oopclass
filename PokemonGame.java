
package pokemon;

import java.util.Scanner;

public class PokemonGame {
    public static Scanner in1 = new Scanner(System.in);
    public static Scanner in2 = new Scanner(System.in);
    public static thunder raichu;
    public static water magikarp;
    public static Pokemon pokemon;
    public static Trainer t;
    public static void main(String[] arg){

        
        System.out.println("WELCOME TO POKEMON GAME !!!!!");
        System.out.println("Create Trainer");
        System.out.print("Please Enter Your Trainer Name : ");
        t = new Trainer(in1.nextLine());
        System.out.println("========");
        System.out.println("");
        System.out.println("Trainer Name is : "+ t.getName());
        
        
        System.out.println("Choose Pokemon");
        System.out.println("1 : thunder");
        System.out.println("2 : water");
        int choice = in2.nextInt();
        System.out.println("========");
        while(true){
            if(choice == 1){
                System.out.print("Please Enter Your Pokemon Name : ");
                pokemon = new thunder(in1.nextLine());
                break;
            } else if(choice == 2){
                System.out.print("Please Enter Your Pokemon Name : ");
                pokemon = new water(in1.nextLine()); 
                break;
            } else  {
                System.out.println("Out of Data");
            }           
        }
        System.out.println("");
        pokemon.displayPokemon();
        menu();
    }
    
    public static void menu(){
        while(true){
            System.out.println("Choose Adventure or Show Detail Pokemon or Exit");
            System.out.println("1 : Adventure");
            System.out.println("2 : Show Detail Pokemon");
            System.out.println("3 : Pokemon Center");
            System.out.println("4 : Exit"); 
            int choice4 = in2.nextInt();
            System.out.println("========");
            if(choice4 == 1){
                while(true){
                    System.out.println("GO ADVENTURE !!!!");
                    System.out.println("Choose The Location You Want To Go");
                    System.out.println("1 : City");
                    System.out.println("2 : Lagoon");
                    int choice2 = in2.nextInt();                    
                    if(choice2 == 1){
                        raichu = new thunder("raichu");
                        raichu.setAtk(5);                        
                        System.out.println("Found Raichu !!!");
                        while(true){
                            System.out.println("Choose Attack or Run or Berry");
                            System.out.println("1 : Attack");
                            System.out.println("2 : Run");
                            System.out.println("3 : Use Berry");                                                
                            int choice3 = in2.nextInt();                    
                            if(choice3 == 1){
                                System.out.print("Attack !!!");
                                raichu.setCurHp(raichu.getCurHp() - pokemon.Attack());
                                pokemon.setCurHp(pokemon.getCurHp() - raichu.Attack());
                                pokemon.displayPokemon();
                                System.out.println("========");
                                raichu.displayPokemon();
                                if(pokemon.getCurHp() <= 0 || raichu.getCurHp() <= 0) break;
                            } else if(choice3 == 2){
                                System.out.print("Run !!!");
                                break;
                            } else if(choice3 == 3){
                                System.out.println("Use Berry");
                                pokemon.setCurHp(pokemon.getCurHp() + t.UseBerry("potion"));
                                pokemon.setCurHp(pokemon.getCurHp() - raichu.Attack());
                                pokemon.displayPokemon();
                                System.out.println("num Barry : " + t.getBerry("potion"));
                                System.out.println("========");
                            } else  {
                                System.out.println("Out of Data");
                            }           
                        }                
                        break;
                    } else if(choice2 == 2){
                        magikarp = new water("magikarp");
                        magikarp.setAtk(5);                          
                        System.out.println("Found Magikarp !!!");
                        while(true){
                            System.out.println("Choose Attack or Run or Berry");
                            System.out.println("1 : Attack");
                            System.out.println("2 : Run");
                            System.out.println("3 : Use Berry");                      
                            int choice3 = in2.nextInt();      
                            if(choice3 == 1){
                                System.out.print("Attack !!!");
                                magikarp.setCurHp(magikarp.getCurHp() - pokemon.Attack());
                                pokemon.setCurHp(pokemon.getCurHp() - magikarp.Attack());
                                pokemon.displayPokemon();
                                System.out.println("========");
                                magikarp.displayPokemon();                        
                                if(pokemon.getCurHp() <= 0 || magikarp.getCurHp() <= 0) break;
                            } else if(choice3 == 2){
                                System.out.print("Run !!!");
                                break;
                            } else if(choice3 == 3){
                                System.out.println("Use Berry");
                                pokemon.setCurHp(pokemon.getCurHp() + t.UseBerry("potion"));
                                pokemon.setCurHp(pokemon.getCurHp() - magikarp.Attack());                                
                                pokemon.displayPokemon();
                                System.out.println("num Barry : " + t.getBerry("potion"));                                
                                System.out.println("========");
                            } else  {
                                System.out.println("Out of Data");
                            }         
                        }                
                        break;
                    } else  {
                        System.out.println("Out of Data");
                    }
                    break;
                }
                if(pokemon.getCurHp() <= 0) System.out.println("Your Pokemon Die"); 
                else if(raichu.getCurHp() <=0 || magikarp.getCurHp() <= 0) System.out.println("Enemy Pokemon Die");   
                else
                    System.out.println("ho");
                    ;
            } else if(choice4 ==2){
                System.out.println("Detail Your Pokemon !!!");
                pokemon.displayPokemon();
                System.out.println("========");
            } else if(choice4 == 3) {
                System.out.println("Welcome to Pokemon Center !!!");
                PokemonCenter(pokemon);
            } else if(choice4 == 4){
                System.out.println("Good Bye");
                break;
            } else {
                System.out.println("Out of Data");
            }            
        }
    }
    
    public static void PokemonCenter(water pokemon){
        pokemonCenter pc = new pokemonCenter();
        pc.Restore(pokemon.getMaxHp());
        pokemon.setCurHp(pc.getRestore());
        pokemon.displayPokemon();
    }
    
    
    public static void PokemonCenter(thunder pokemon){
        pokemonCenter pc = new pokemonCenter();
        pc.Restore(pokemon.getMaxHp());
        pokemon.setCurHp(pc.getRestore());
        pokemon.displayPokemon();
    }    

    
    public static void PokemonCenter(Pokemon pokemon){
        pokemonCenter pc = new pokemonCenter();
        pc.Restore(pokemon.getMaxHp());
        pokemon.setCurHp(pc.getRestore());
        pokemon.displayPokemon();
    }    
        
    
}
