import java.util.ArrayList;

public class PictureProject extends World {
    // Night sky with stars (use & loops params for diff sized starts) animated??
    // gradient night sky (maybe two way from the moon)

    public int vred;
    public int vgreen;
    public int vblue;
    int xcoord;
    int ycoord;

    public void go() {
       // gradient background from nested for loop
        plane.pausetime = 0;
        plane.setPos(0,0);
        //cover every x coord
        for (int x=0; x<1000; x=x+1) {
            //covers every y coord
            for (int y = 0; y < 800; y = y + 1) {
                plane.setPos(x,y);
                plane.setPixelColor(y/5, y/4, 30+y/4);
               /* if (y<200) {
                    plane.setPixelColor(y / 5, y / 4, 30 + y /10);
                }
                else {
                    plane.setPixelColor(y/5, y/4, 30+y/4);
                }
                int blue = 2^(y/101);
                plane.setPixelColor(0,0, blue);
                System.out.println (blue);
                0,0,0
                 190, 190, 255*/
            }
        }
        //stars
        int ransize;
        int ranx;
        int rany;
        for (int x=0; x<30; x=x+1){
            ransize = plane.random(20,40);
            ranx = plane.random(0, 1000);
            rany = plane.random(0, 450);
            if (ranx<ranx+50 && ranx>ranx-50) {
                plane.setPos(ranx+50, rany);
            }
            else {
                plane.setPos(ranx, rany);
            }
            star(ransize);
        }
        //moon
        plane.loadBackGround("PrincessCarolyn.jpeg");
        //plane.showBackGround();
        //change size


        for (int x=0; x < 300; x=x+1) {
            for (int y = 0; y < 250; y = y + 1){
                xcoord = x*10/3;
                ycoord = y*67/25;
                plane.teleport(xcoord, ycoord);
                vred = plane.howMuchRed();
                vblue = plane.howMuchBlue();
                vgreen = plane.howMuchGreen();
                plane.teleport(x,y);
                plane.setPixelColor(vred, vgreen, vblue);
            }

        }

        //filter out black part

        /*if (vred>10 && vblue>10 && vgreen>10){
            plane.setpixel color (
        }
         */

        /*plane.setPos(250,150);
        plane.circle(50);*/

    }

    public void star(int size){
        plane.setColor(250, 250, 255);
        plane.isTrail = true;
        plane.turn(-54);
        for (int x = 0; x < 5; x = x + 1) {
            plane.turn(-144);
            plane.move(size);
        }

    }

    public void person (){

    }
}
