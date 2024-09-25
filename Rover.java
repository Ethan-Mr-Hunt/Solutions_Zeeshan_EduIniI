 class Rover {
     private int x, y;
     private Direction direction;
     private Grid grid;

     public Rover(int x, int y, Direction direction, Grid grid) {
         this.x = x;
         this.y = y;
         this.direction = direction;
         this.grid = grid;
     }

     public void move() {
         Position newPosition = direction.move(new Position(x, y));
         if ( grid.isWithinBounds(newPosition)) {
             this.x = newPosition.getX();
             this.y = newPosition.getY();
         }
     }

     public void turnLeft() {
         direction = direction.left();
     }

     public void turnRight() {
         direction = direction.right();
     }

     public String getStatus() {
         return "Rover is at (" + x + ", " + y + ") facing " + direction + ".";
     }
}
