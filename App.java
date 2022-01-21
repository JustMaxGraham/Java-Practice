public class App {
    public static void main(String[] args) {
        Movie movieOne = new Movie("The One", 120, 90);
        Movie movieTwo = new Movie("The Two", 100, 95);
        Movie movieThree = new Movie("The Three", 90, 50);

        User firstUser = new User("first@gmail.com");
        User secondUser = new User("second@gmail.com");
        User thirdUser = new User("third@gmail.ccom");

        firstUser.addFavourite(movieOne);
        firstUser.addFavourite(movieTwo);

        secondUser.addFavourite(movieTwo);
        secondUser.addFavourite(movieOne);

        thirdUser.addFavourite(movieOne);
        thirdUser.addFavourite(movieThree);
        thirdUser.addFavourite(movieTwo);



//        System.out.println(movieOne.toString());
//        System.out.println(movieTwo.toString());
//        System.out.println(firstUser.toString());
//        System.out.println(secondUser.toString());

//        System.out.println(Movie.favorited);
        Movie.mostFavorite();
    }
}