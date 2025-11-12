import java.util.ArrayList;

public class PictureProject extends World {
    //add varibles for red, green, blue, and x & y coordinates for
    int vred;
    int vgreen;
    int vblue;
    int xcoord;
    int ycoord;

    public void go() {
       // gradient background from nested for loop
        plane.pausetime = 0;
        plane.setPos(0,0);
        //covers every x coord
        for (int x=0; x<1000; x=x+1) {
            //covers every y coord for the upper half of the screen
            for (int y = 0; y < 500; y = y + 1) {
                plane.setPos(x,y);
                plane.setPixelColor(y/5, y/4, 30+y/4); //y fractions make gradient
            }
        }
        //stars
        int ransize;//random size
        int ranx;//random x position
        int rany;//random y position
        for (int x=0; x<30; x=x+1){//loops to make 30 stars, in 30 random sizes, at 30 random positions
            ransize = plane.random(20,40);
            ranx = plane.random(0, 1000);
            rany = plane.random(0, 450);
            if (ranx<ranx+50 && ranx>ranx-50) {
                plane.setPos(ranx+50, rany);
            }
            else {
                plane.setPos(ranx, rany);
            }
            star(ransize);//calls start method to make a star with a random side length
        }
        //add picture of the moon
        plane.loadBackGround("moon.jpg");
        //make picture smaller
        for (int x=0; x < 300; x=x+1) {
            for (int y = 0; y < 250; y = y + 1){
                xcoord = x*10/3;
                ycoord = y*80/25;
                plane.teleport(xcoord, ycoord);
                vred = plane.howMuchRed();
                vblue = plane.howMuchBlue();
                vgreen = plane.howMuchGreen();
                plane.teleport(x,y);
                //ignores the black background on the moon photo-- only adds the picture where it's gray
                if (vred>0 && vgreen>0 && vblue>0) {
                    plane.setPixelColor(vred, vgreen, vblue);
                }
            }

        }
        //calls land method to add green part
        land();
    }
    //method to make stars with a parameter for size/side length
    public void star(int size){
        plane.setColor(250, 250, 255);
        plane.isTrail = true;
        plane.turn(-54);
        for (int x = 0; x < 5; x = x + 1) {
            plane.turn(-144);
            plane.move(size);
        }

    }

    //method to make land--a green rectangle on the lower half of the screen
    public void land () {
        plane.setPos(0, 500);
        //covers x direction
        for (int x = 0; x < 1000; x = x + 1) {
            //covers the y direction
            for (int y = 500; y < 800; y = y + 1) {
                //sets plain to green color
                plane.teleport(x, y);
                plane.setPixelColor(1, 74, 20);
            }


        }
    }
}
