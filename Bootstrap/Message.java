/**
 * Stores data to be used when an event is triggered
 * 
 * @author Christian Wang 
 * @version 1.0
 */
public class Message  
{
    private Object data;
    
    /**
     * Sets the given object to data
     */
    public Message(Object data)
    {
        this.data = data;
    }
    
    /**
     * Return data as a given object
     */
    public Object returnData() {
        return this.data;
    }
    
    /**
     * Sets the given object to data
     */
    public void setData(Object data) {
        this.data = data;
    }
}
