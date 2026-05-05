
public  class Player extends Person {
    String position;
    int number;
    int goals;
    int matchplayed;
    static int currentRow = 1;
    static String[][] pl = new String[6][8];

    public Player(String name,String nationality, int salary, int age,String position, int number, int goals, int matchplayed) {
        super(name,nationality,salary,age);
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
    // fill array
    public void fillArray() {

        if (currentRow == 1) {
            pl[0][0] = "Name";
            pl[0][1] = "Age";
            pl[0][2] = "Nationality";
            pl[0][3] = "Salary";
            pl[0][4] = "Position";
            pl[0][5] = "Number";
            pl[0][6] = "Goals";
            pl[0][7] = "Match played";
        }

        pl[currentRow][0] = name;
        pl[currentRow][1] = String.valueOf(age);
        pl[currentRow][2] = nationality;
        pl[currentRow][3] = String.valueOf(salary);
        pl[currentRow][4] = position;
        pl[currentRow][5] = String.valueOf(number);
        pl[currentRow][6] = String.valueOf(goals);
        pl[currentRow][7] = String.valueOf(matchplayed);}
        
     
    @Override
    public void print_info() {

        fillArray();

        System.out.println("Player Schedule:");

        for (String[] pl1 : pl) {
            if (pl1[0] != null) {
                for (int j = 0; j < pl1.length; j++) {
                    System.out.print(pl1[j] + "\t");
                }
                System.out.println();
            }
        }

       
    }
    
}
