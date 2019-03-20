/**
 * An abstract superclass intended to create various literature classes.
 */

public abstract class Literature {
    private String title;

    /**
     * Constructor for the abstract class Literature
      * @param title - the title of the current item
     */
    public Literature (String title)
    {
        this.title = title;
    }

    /**
     * An accessor method for the title variable
     * @return The value stored in the title variable
     */
    public String getTitle()
    {
        return this.title;
    }

}
