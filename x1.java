//////// Emmett Woytovich  (CST 112; 9/11/2015)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;
int sizx,sizy;
int rectx, recty;
int counter;
//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  sizx = 640;
  sizy = 480;
  size( sizx,sizy);
  horizon=  height-50;
  x=  width/2;
  y=  height-50;
  dx=  3;
  dy=  0;
  rectx = 30;
  recty = 50;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,150,200 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  fill(100,0,0);
  rect(145,horizon-75, 10,75);  // tree
  fill(0);
  text( "This is a good tree!", 155,horizon );
  fill(0,255,0);
  triangle( 150,horizon-100, 120,horizon-50, 180,horizon-50  );
  
                                            // house

  fill(0);
  text( "My name is Bupkis", 10,height-20 );   
   
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */

  fill(255,0,0); rect( x-rectx,y-recty,  rectx,recty );  
  fill(150,0,0); ellipse(x ,y, rectx , recty/2 );
  fill(0,100,100); ellipse(x-rectx,y, rectx , recty/2 );
  fill(150,0,200); triangle(x+15,y, x,y-75, x-rectx, y);
  fill(0);text( "Bupkis", x-rectx,y-recty );
                                            
  //// ACTION:  move (x,y) coordinates.
  
  x= (x + dx)%(sizx+rectx);
  y= (y + dy)%(sizy+recty);
  if(x < 0){x = width;}
  if(y < 0){y = height;}
}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -10, +10 );                  // random speed.
  dy=  random( -10, +10 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
   
   
