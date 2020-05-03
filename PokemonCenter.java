package pokemon;


public class pokemonCenter {
    private int restore;
    public pokemonCenter(){
    }
    public int getRestore(){
        return restore;
    }
    public void Restore(int MaxHp){
        this.restore = MaxHp;
    }
}
