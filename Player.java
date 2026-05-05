public class Player extends Person {
    String position;
    int number;
    int goals;
    int matchplayed;
    static int currentRow = 1;
    static String[][] med = new String[6][12];

    public Player(String name,String position, int number, int goals, int matchplayed) {
        super(name);
        this.position = position;
        this.number = number;
        this.goals = goals;
        this.matchplayed = matchplayed;
    }
    public void playMatch(){
        matchplayed++;
        System.out.println("The Player "+name+" Plays a New Match.");
    }
    public void scoreGoal(){
        goals++;
        System.out.println("Goal !!!!!!!!!!! , "+name+" Scored a Goal.");
    }
    public static void addPlayer(Player p){
        for(int i=1;i>=allplayers.length;i++)
           if(allplayers[i]==null){
               allplayers[i]=p;
               System.out.println( "Player "+p.name+" added successfully to the squad.");
              return;}
            else
                System.out.println("The squad is full! Cannot add more players.");
    }
    
}
