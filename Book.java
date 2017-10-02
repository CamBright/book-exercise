/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    private String getAuthor()

    {
        return author;
    }

    private String getTitle()

    {
        return title;
    }
    
    private void printAuthor()

    {
        System.out.println ("The Author is " + author);
    }
    
    private void printTitle()

    {
        System.out.println ("The Title is " + title);
    }
}
