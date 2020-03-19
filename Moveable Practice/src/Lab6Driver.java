import java.util.ArrayList;
import java.util.Scanner;
import  java.awt.Point;
public class Lab6Driver {
    public static void main(String[] args) {
        //TODO: Implement your own Shape class according to the Lab3 description
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        /** GRAPHICS:
         * The next line will be removed or commented out before submission to Moodle,
         * we will provide and talk about the DrawingTool class during lab hours to
         * introduce graphics support
         **/

        //DrawingTool window = new DrawingTool(shapes);

        Scanner sc = new Scanner(System.in);
        String userCommand;
        do {
            userCommand = sc.nextLine();

            String [] parameters = userCommand.split(" ");
            String command = parameters[0].toLowerCase();

            switch (command) {
                case "addr":
               
                	shapes.add(new Rectangle(Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2]),Integer.parseInt(parameters[3]),Integer.parseInt(parameters[4])));
                	
                    //TODO: Print the object
                    break;
                case "adds":
                	shapes.add(new Square(Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2]),Integer.parseInt(parameters[3])));
                    //TODO: Add the object to the shapes list

                    //TODO: Print the object
                    break;
                case "addc":
                	shapes.add(new Circle(Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2]),Integer.parseInt(parameters[3])));

                    //TODO: Add the object to the shapes list

                    //TODO: Print the object
                	break;
                case "move" :
                		shapes.get(Integer.parseInt(parameters[1])-1).move(Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]));
                		
                    break;
                case "bound":
                	int x=Integer.parseInt(parameters[1]);
                	int y=Integer.parseInt(parameters[2]);
                	for(int i=0; i<shapes.size(); i++) {
                	
                		if(shapes.get(i).isBounded(x, y)) {
                			
                			System.out.println(shapes.get(i).toString());
                		}
                	}
            }
            //GRAPHICS: The next line will be removed or commented out before submission to Moodle
            //window.repaint();
        } while (!userCommand.equalsIgnoreCase("exit"));
        sc.close();
        System.exit(0);
    }
}