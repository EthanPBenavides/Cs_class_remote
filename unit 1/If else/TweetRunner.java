/**
 * TweetRunner.java 11/10/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 * @author - I received help from ...
 */
public class TweetRunner
{
    /**
     * Makes One tweet and tests tweets methods
     * 
     * @param args
     */
    public static void main(String args[])
    {
        // make tweet with name sample
        Tweet sample = new Tweet("aplus", 0, 0);

        // add 3 likes and 28 re-tweets to sample
        sample.addLikes(3);
        sample.addRetweets(28);

        // tell the user if it is not liked and kind of liked
        System.out.println(sample.notLiked());
        System.out.println(sample.kindaLiked());

        // adds 35 likes
        sample.addLikes(35);

        // tells the user if it is kind of liked and trending
        System.out.println(sample.kindaLiked());
        System.out.println(sample.isTrending());

        // adds 13 likes and 47 re-tweets
        sample.addLikes(13);
        sample.addRetweets(47);

        /*
         * tells the user if sample is not liked, kind of liked, or is trending. then
         * gives the user the message, likes, and re-tweets
         */
        System.out.println(sample.notLiked());
        System.out.println(sample.kindaLiked());
        System.out.println(sample.isTrending());
        System.out.println(sample);
    }
}
