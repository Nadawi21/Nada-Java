package src;

public class Elevator {
    private int level;

    public Elevator(int level) {
        this.level = level;

    }
        public void goTo (int newLevel) {

           if(level<newLevel) {
               System.out.println("Hissen går upp till " + newLevel);
           }
           if(level>newLevel) {
                   System.out.println("Hissen går ner till " + newLevel);
           }
           if(level==newLevel){
                       System.out.println("Du är redan på våning " + newLevel);
           }
           level = newLevel;

        }

        public void where (int level){
        System.out.println ("Hissen står nu på våning " + level);
        }
}

