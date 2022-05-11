import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MovieList
{
    private ArrayList<Movie> movies;

    public MovieList()
    {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie)
    {
        movies.add(movie);
    }

    public void file()
    {
        File f = new File("src/Movies.txt");


        // WRITING TO FILE
        try {
            f.createNewFile(); // this method will create the file if it does not exist;
            //if it does exist, it does nothing
            FileWriter fw = new FileWriter("src/Movies.txt");
            for(int i = 0; i < movies.size(); i++)
            {
                fw.write(movies.get(i).printInfo());
                fw.write("\n");
            }
            fw.close();

        } catch (IOException e) {
            System.out.println("ERROR! + " + e.getMessage());
        }

        try{
            Scanner s = new Scanner(f);
            while (s.hasNextLine())
            {
                String data = s.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR! + " + e.getMessage());
        }



    }



}
