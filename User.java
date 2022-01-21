import java.util.ArrayList;
import java.util.HashSet;

public class User {
    String userId;
    String email;
    ArrayList<Integer> friends;
    HashSet<Movie> favourites;
    static int totalUsers = 0;

    public User(String email){
      this.email = email;
      totalUsers += 1;
      this.userId = "userId" + totalUsers;
      this.favourites = new HashSet<Movie>();
    }

    public void addFriend(int userId){
        this.friends.add(userId);
    }

    public void addFavourite(Movie movie){
        this.favourites.add(movie);
        movie.addFavourite(this.userId);
    }

    public static void totalUsers(){
        System.out.println("Total number of users is: " + totalUsers);
    }

    @Override
    public String toString(){
        return "Email: " + this.email + "\nuserId: " + this.userId + "\nFavourites: " + this.favourites + '\n';
    }

}
