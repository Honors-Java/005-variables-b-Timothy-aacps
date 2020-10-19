int xPosition = 250;
int yPosition = 250;
int circleWidth = 20;
int circleLength = 20;

void setup() {
	size(500, 500);
}

void draw() {

 int rando = random(-25, 25);
 int rY = random(-25, 25);
 int r = random(0, 255);
 int g = random(0, 255);
 int b = random(0, 255);

  stroke(0);
  fill(r, g, b);
  ellipse(mouseX + rando,mouseY + rY,circleLength,circleWidth);

}
void mousePressed(){
  int randoX = random(0,400);
  int randoY = random(0,400);
  int randoW = random(0,400);
  int randoL = random(0,400);
  background(255);
  rect(randoX,randoY,randoW,randoL);
}