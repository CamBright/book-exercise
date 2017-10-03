/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, 
                String refNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
    
    private int getPages()
    {
        return pages;
    }
    private void printDetails()
    {   
        System.out.println ("Title: " + title);
        System.out.println ("Author: " + author);
        System.out.println ("Number of Pages: " + pages);
        System.out.println("Reference number: " + refNumber);
                if (refNumber.length() > 0)
        {
            System.out.println("Reference number: " + refNumber);
        }
        else
        {
            System.out.println("Reference number: ZZZ");
        }
    }
    private void SetRefNumber(String ref)
    {
        if(ref.length()>=3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Error, the Reference number needs to have at least 3 characters.");
        }
    }
    private String getRefNumber()
    {
        return refNumber;
    }
}
