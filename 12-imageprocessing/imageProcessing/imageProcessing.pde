void setup(){
  size(1450,500);
  PImage car = loadImage("racecar.jpg");
  PImage output = car.copy();
  Kernel k = new Kernel( new float[][]    { {0.0625, .125, 0.0625},
     {0.125, 0.25, 0.125},
   {0.0625, 0.125, 0.0625} } );
  k.apply(car,output);
  image(car,0,0);
  image(output,car.width,0);
}
