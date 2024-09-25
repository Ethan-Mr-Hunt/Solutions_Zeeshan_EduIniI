import java.util.*;
public class Main {
    public static void main(String[] args) {

        Grid grid = new Grid(10, 10);

        // Initialize the rover
        Rover rover = new Rover(0, 0, Direction.NORTH, grid);

        // Commands to execute
        List<Command> commands = Arrays.asList(
                new MoveCommand(rover),
                new MoveCommand(rover),
                new TurnRightCommand(rover),
                new MoveCommand(rover),
                new TurnLeftCommand(rover),
                new MoveCommand(rover),
                new MoveCommand(rover)
        );

        // Execute commands
        for (Command command : commands) {
            command.execute();
        }


        System.out.println(rover.getStatus());
    }
}
