/**
 * Tweet.java 11/10/2021
 *
 * @author - Ethan Benavides
 * @author - Period 4
 * @author - Id 957502
 * @author - I received help from ...
 */
class Tweet
{

    private String message;
    private int    retweets;
    private int    likes;

    /**
     * Creates a tweet with the following
     * 
     * @param m  message
     * @param r  re-tweets
     * @param lk likes
     */
    public Tweet(String m, int r, int lk)
    {
        message  = m;
        retweets = r;
        likes    = lk;
    }

    /**
     * Adds n likes
     * 
     * @param n number of likes
     */
    public void addLikes(int n)
    {
        likes += n;
    }

    /**
     * Adds n re-tweets
     * 
     * @param n number of re-tweets
     */
    public void addRetweets(int n)
    {
        retweets += n;
    }

    /**
     * checks if the tweet is liked
     * 
     * @return True if likes is less than ten <br>
     *         False if likes is greater than ten
     */
    public boolean notLiked()
    {
        if ( likes < 10 )
        {
            return true;
        }
        return false;
    }

    /**
     * checks if the tweet is kinda liked
     * 
     * @return True if likes is greater than re-tweets <br>
     *         False if likes is less than re-tweets
     */
    public boolean kindaLiked()
    {
        if ( likes > retweets )
        {
            return true;
        }
        return false;
    }

    /**
     * Checks if the tweet is trending
     * 
     * @return True if total re-tweets and likes is greater than 75 <br>
     *         False if total re-tweets and likes is less than 75
     */
    public boolean isTrending()
    {
        if ( (retweets + likes) > 75 )
        {
            return true;
        }
        return false;
    }

    /**
     * @return the message, number of re-tweets, and the number of likes
     */
    public String toString()
    {
        return "msg " + message + " retweets " + retweets + " likes " + likes;
    }
}