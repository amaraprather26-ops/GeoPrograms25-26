public class ExitTicket extends World{

    int distance;

    public void go(){
        for (int x=1; x<5; x=x+1) {
            plane.isTrail = true;
            distance = plane.random(1, 250);
            plane.move(distance);
            plane.turn(90);
        }
    }

}
