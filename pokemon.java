
package pokemon;

public class Pokemon {

    private String Name;
    private int maxHp;
    private int curHp;
    private int maxPp;
    private int curPp;
    private int Atk;

    
    
    public Pokemon(String Name){
        
        this.Name=Name;
          
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getCurHp() {
        return curHp;
    }

    public void setCurHp(int curHp) {
        this.curHp = curHp;
    }

    public int getMaxPp() {
        return maxPp;
    }

    public void setMaxPp(int maxPp) {
        this.maxPp = maxPp;
    }

    public int getCurPp() {
        return curPp;
    }

    public void setCurPp(int curPp) {
        this.curPp = curPp;
    }

    public int getAtk() {
        return Atk;
    }

    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    void displayPokemon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int Attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
