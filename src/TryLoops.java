public class TryLoops extends World {

    public void go(){
        rowsSquares();
    }

    public void rowsSquares(){

        plane.setPos(0,7);
        plane.pausetime = 0;
        plane.trailWidth = 1;

        for (int x=0; x<100; x=x+1 ){
            plane.isTrail = false;
            plane.teleport(10, 7*(x+1));
            for (int y=0; y<100; y=y+1){
                plane.setColor(170, 50+2*x, 50+2*y);
                square(1);
                plane.isTrail = false;
                plane.startingAngle(0);
                plane.move(8);
            }
        }

    }

    public void manySquares(){
        for (int x=0; x<4; x=x+1){
            square(1);
            plane.isTrail = false;
            plane.startingAngle(0);
            plane.move(150);
        }

    }

    public void square(int size){
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(size);
        plane.turn(90);
        plane.trailWidth = 10;
        plane.move(size);
        plane.turn(90);
        plane.trailWidth = 10;
        plane.move(size);
        plane.turn(90);
        plane.trailWidth = 10;
        plane.move(size);
    }


}
