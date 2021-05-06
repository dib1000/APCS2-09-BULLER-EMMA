public class Cow {
  float x, y, dx, dy, radius;
  color c;
  boolean colliding = false;
  boolean selected = false;

  Cow(float rad, float x, float y, float dx, float dy) {
    radius = rad;
    this.x = x;
    this.y = y;
    this.dx = (int)(dx*100)/100.0;
    this.dy = (int)(dy*100)/100.0;
    c = color(random(255),random(255),random(255));

  }
  Cow() {
    this(20+(int)(Math.random()*30), width/2, height/2, 
    random(6)-3,
    random(6)-3);
  }
  
  void move() {
    x += dx;
    y += dy;
    if (x >= width - radius || x <= radius) dx *= -1;
    if (y >= height - radius || y <= radius) dy *= -1;
  }
  void display() {
    stroke(0);
    fill(c);
    ellipse(x, y, radius*2, radius*2);
    if(selected) {
      fill(255);
      ellipse(x-radius/5,y-radius/5,radius/5,radius/5);
      ellipse(x+radius/5,y-radius/5,radius/5,radius/5);
      fill(0);
      textSize(15);
      text("DX: " + dx,x+radius,y);
      text("DY: " + dy,x+radius,y+15);
    }
  }

  void click(){
   if(dist(x,y,mouseX,mouseY)<=radius) {
       selected = !selected;
   }
  }

}
