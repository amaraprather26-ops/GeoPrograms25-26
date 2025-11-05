public class A1_HowToMove extends World {

    int width;
    // int = takes integers
    // width = name

    int redColor;
    int greenColor;
    int blueColor;

    public void go() {

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 2;
        width = plane.random(10, 20);
        // width will be a random # between 1  and 10
        plane.trailWidth = width;
            redColor = plane.random(1, 255);
            greenColor = plane.random(1, 255);
            blueColor = plane.random(1, 255);
            plane.setColor(redColor, greenColor, blueColor);
            plane.setPos(500, 400);
            diffSqr(200);
            plane.isTrail = false;
            plane.move(150);
            diffSqr(100);

        }

    public void sqr(){
        plane.startingAngle(0);
        plane.setColor(100, 20, 200);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(200);
        plane.turn(90);
        plane.setColor(10, 200, 200);
        plane.trailWidth = 15;
        plane.move(200);
        plane.turn(90);
        plane.setColor(200, 200, 100);
        plane.trailWidth = 7;
        plane.move(200);
        plane.turn(90);
        plane.setColor(150, 20, 200);
        plane.trailWidth = 20;
        plane.move(200);
    }

    public void diffSqr(int size){
        plane.startingAngle(0);
        plane.setColor(100, 20, 200);
        plane.isTrail = true;
        plane.move(size);
        plane.turn(90);
        plane.setColor(10, 200, 200);
        plane.move(size);
        plane.turn(90);
        plane.setColor(200, 200, 100);
        plane.move(size);
        plane.turn(90);
        plane.setColor(150, 20, 200);
        plane.move(size);
    }
    public void triangle(){
        plane.startingAngle(0);
        plane.setColor(150,204,255);
        plane.isTrail = true;
        plane.move(200);
        plane.pausetime = 2;
        plane.turn(120);
        plane.pausetime = 2;
        plane.move(200);
        plane.pausetime = 2;
        plane.turn(120);
        plane.move(200);
    }
    public void diffTri(int size){
        /* (int size) sets parameters for the method "diftri"
        * 1. make the variable for plane.move = size,
        * 2. when calling the method, put the desired size in parentheses
        * ex. diftri(200) */
        plane.startingAngle(0);
        plane.setColor(150,204,255);
        plane.isTrail = true;
        plane.move(size);
        plane.pausetime = 2;
        plane.turn(120);
        plane.pausetime = 2;
        plane.move(size);
        plane.pausetime = 2;
        plane.turn(120);
        plane.move(size);
    }
    public void house(){
// i am creating a method called "house"
        plane.setPos(500,400);
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(-120);
        plane.move(200);
        plane.turn(-120);
        plane.move(200);
// alt, call "triangle" and "sqr" (if they line up)
    }
    public void colorHouse() {

        for(int x=1; x<10; x=x+1) {
            redColor = plane.random(1, 255);
            greenColor = plane.random(1, 255);
            blueColor = plane.random(1, 255);
            plane.setColor(redColor, greenColor, blueColor);
            plane.setPos(500, 400);
            house();
        }
    }
}

