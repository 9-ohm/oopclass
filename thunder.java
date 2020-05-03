package pokemon;

public class thunder extends Pokemon{
    private String types="thunder";
    private int curHp,curPp;
    public thunder(String Name){
        super(Name);
        setMaxHp(100);
        curHp = getMaxHp();
        setCurHp(curHp);
        
        setMaxPp(100);
        curPp = getMaxPp();
        setCurPp(curPp);
        
        setAtk(50);
    }
    public void displayPokemon(){
        System.out.println("Name = "+ getName());
        System.out.println("Hp = "+ getCurHp());
        System.out.println("Pp = "+ getCurPp());
        System.out.println("Types = "+ types);
        System.out.println("Atk = "+ getAtk());
    }
    
    public int Attack(){
        curPp--;
        setCurPp(curPp);
        return getAtk();
    }    
}
