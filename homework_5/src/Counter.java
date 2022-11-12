/**
 * E3.1/ E3.2
 *
 * Add a button to the tally counter that allows an operator to undo an accidental button click.
 * Provide a method public void undo(). As an added precaution, make sure that clicking the
 * undo button more often than the click button has no effect.


 */

public class Counter
{
    private int value;
    private int limit;


    public Counter()
    {
        value = 0;
    }

    public Counter(int count)
    {
        value = count;
    }


    public int getValue()
    {
        return value;
    }


    public void click()
    {
        value++;
        value = Math.min(value, limit);
    }


    public void reset()
    {
        value = 0;
    }


    public void undo()
    {
        value--;
        value = Math.max(value, 0);
    }

    public void setLimit(int maximum)
    {
        limit = maximum;
    }


}



