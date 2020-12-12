
void setup() {
 
  // set the size of your sketch
  size(500, 500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i = 10; i >= 1; i--){
  ellipse(100, 100, (i * 10), (i * 10));
   if (i % 2 == 0){
    fill(#FF0303);
  }
  else{
   fill(#000000); 
  }
  }
  //Use an if statement and modulo to alternate the color of your rings.
 
  
}
