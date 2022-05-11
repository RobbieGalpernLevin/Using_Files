import java.util.Scanner;

public class Movie
{
    public String title;
    public double grossEarnings;
    public int releaseYear;
    public String starActor;
    public Scanner scan;

    public Movie(String t, double g, int y, String s)
    {
        title = t;
        grossEarnings = g;
        releaseYear = y;
        starActor = s;
        scan = new Scanner(System.in);
    }

    public Movie()
    {
        title = "";
        grossEarnings = 0;
        releaseYear = 0000;
        starActor = "";
        scan = new Scanner(System.in);
    }

    public String getTitle()
    {
        return title;
    }

    public double getGrossEarnings()
    {
        return grossEarnings;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }

    public String getStarActor()
    {
        return starActor;
    }

    public void setTitle(String t)
    {
        title = t;
    }

    public void setGrossEarnings(double g)
    {
         grossEarnings = g;
    }

    public void setReleaseYear(int y)
    {
         releaseYear = y;
    }

    public void setStarActor(String s)
    {
        starActor = s;
    }

    public String printInfo()
    {
        return "Title: " + title + " Gross Earnings: " + grossEarnings + " Release Year: " + releaseYear + " Star Actor: " + starActor;
    }

    public void fillOutInfo()
    {
        System.out.println("Enter Title of Movie: ");
        setTitle(scan.nextLine());
        System.out.println("Enter Gross Earnings of Movie: ");
        setGrossEarnings(scan.nextDouble());
        scan.nextLine();
        System.out.println("Enter Release Year of Movie: ");
        setReleaseYear(scan.nextInt());
        scan.nextLine();
        System.out.println("Enter the Movie's Star Actor: ");
        setStarActor(scan.nextLine());
    }
}
