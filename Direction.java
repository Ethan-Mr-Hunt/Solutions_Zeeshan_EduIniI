 enum Direction {
     NORTH {
         @Override
         public Direction left() { return WEST; }
         @Override
         public Direction right() { return EAST; }
         @Override
         public Position move(Position position) { return new Position(position.getX(), position.getY() + 1); }
     },
     EAST {
         @Override
         public Direction left() { return NORTH; }
         @Override
         public Direction right() { return SOUTH; }
         @Override
         public Position move(Position position) { return new Position(position.getX() + 1, position.getY()); }
     },
     SOUTH {
         @Override
         public Direction left() { return EAST; }
         @Override
         public Direction right() { return WEST; }
         @Override
         public Position move(Position position) { return new Position(position.getX(), position.getY() - 1); }
     },
     WEST {
         @Override
         public Direction left() { return SOUTH; }
         @Override
         public Direction right() { return NORTH; }
         @Override
         public Position move(Position position) { return new Position(position.getX() - 1, position.getY()); }
     };

     public abstract Direction left();
     public abstract Direction right();
     public abstract Position move(Position position);
}
