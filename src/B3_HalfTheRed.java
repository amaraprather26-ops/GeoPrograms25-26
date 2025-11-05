public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;
    int xcoord;
    int ycoord;
    public void go() {
        plane.loadBackGround("PrincessCarolyn.jpeg");
        //plane.showBackGround();


       for (int y = 1; y < 575; y = y + 1) {
            for (int x = 1; x < 400; x = x + 1) {
                xcoord = x* 5/2;
                ycoord = y*800/575;
                plane.teleport(xcoord, ycoord);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.teleport(x, y);
                plane.setPixelColor(red, green, blue);

               /*if (x<500 && y<280){
                    plane.setPixelColor(red, blue, green);
                    //plane.setPixelColor(y/3, x/4, blue);
                }
                if (x>500 && y<280) {
                    plane.setPixelColor(red, blue, blue);
                }

                if (x>500 && y>280){
                    plane.setPixelColor(red, blue, red);
                }
                if (x<500 && y>280){
                    plane.setPixelColor(red, red, blue);
                }*/



                }
            }

        }
  }