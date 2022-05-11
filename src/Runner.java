public class Runner
{
    public static void main(String[] args)
    {
         Movie movie1 = new Movie();
        Movie movie2 = new Movie("Avatar", 123978213.123, 2000, "Hans");
         MovieList list = new MovieList();
         movie1.fillOutInfo();
         list.addMovie(movie1);
        list.addMovie(movie2);
         list.file();
    }
}
