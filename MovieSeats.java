public class MovieSeats
{
public static void main(String[] args) 
{
boolean[][] seats = new boolean[5][5];   
seats[0][0] = true;
seats[2][3] = true;
seats[4][1] = true;
System.out.println("Seating Arrangement:");
for (int row = 0; row < seats.length; row++)
{
for (int col = 0; col < seats[row].length; col++)
{
if (seats[row][col])
{
System.out.print("O");
}
else 
{
System.out.print("A"); 
}
}
System.out.println(); 
}
}
}
