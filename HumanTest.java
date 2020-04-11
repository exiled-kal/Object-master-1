
public class HumanTest {
    public static void main(String[] args){
        Human runData = new Human ("kalden");
        Human tesRun = new Human ("tashi");
        runData.attack(tesRun);
        tesRun.attack(runData);

    }
}