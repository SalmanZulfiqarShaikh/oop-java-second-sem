class Sports{
    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Second{
    public static void main(String args[]){
        // Object of child class
        Soccer soccer1 = new Soccer();
        System.out.println(soccer1.getName());
        soccer1.getNumberOfTeamMembers();

        // Object of parent class
        Sports sports1 = new Sports();
        System.out.println(sports1.getName());
        sports1.getNumberOfTeamMembers();
        
    }
}