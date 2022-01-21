import java.sql.Array;
import java.util.*;
import java.util.stream.Stream;

public class Movie {
    String title;
    int duration;
    int rating;
    HashSet<String> favoriteByUsers;

    static HashSet<Movie> favorited = new HashSet<Movie>();

    public Movie(String title, int duration, int rating){
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        this.favoriteByUsers = new HashSet<String>();
    }

    public void addFavourite(String userId){
        this.favoriteByUsers.add(userId);
        favorited.add(this);
    }

    public int getFavorites(){
        return this.favoriteByUsers.size();
    }

    public int getRating(){
        return this.rating;
    }

    public static void mostFavorite(){
        if (!favorited.isEmpty()){
            Movie[] unordered = new Movie[favorited.size()];

            int i = 0;
            for (Movie movie : favorited){
                unordered[i] = movie;
                i ++;
            }
            System.out.println("Favorited Array unordered: " + Arrays.toString(unordered));

            Arrays.sort(unordered, Comparator.comparing(Movie::getFavorites).thenComparing(Movie::getRating).reversed());

            System.out.println("Favorited Array ordered??: " + Arrays.toString(unordered));

            String[] orderedTitles = new String[unordered.length];

            int j = 0;
            for (Movie movie : unordered){
                orderedTitles[j] = movie.title;
                j++;
            }

            System.out.println("Most Favourited Movie Title: " + Arrays.toString(orderedTitles));

        } else {
            System.out.println("No movies favorited");
        }


    }

//    public static ArrayList<String> getFavoriteMovies(){
//        ArrayList<String> favorites = new ArrayList<String>();
//
////        Arrays.sort(bookArray, Comparator.comparing(Book::getName)
////                        .thenComparing(Book::getAuthor))
////                .thenComparingInt(Book::getId));
//
//
//        return favorites;
//    }

    @Override
    public String toString(){
        return "Movie Title: " + this.title + "\nDuration: " + this.duration + "\nFavorited By: " + this.favoriteByUsers + '\n';
    }
}
