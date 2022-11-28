package org.example;

import java.util.HashMap;
import java.util.Map;
/**
 * The class stores information about a subdivision
 */
public class Subdivision
{
    /**
     * ID of subdivision depends on title
     */
    private int ID;
    /**
     * title of subdivision
     */
    private String title;
    /**
     * Dictionary of ID of subdivision in the form Map. Each subdivision name has its own ID
     */
    private static Map<String,Integer> IDSubdivision = new HashMap<>();;
    public Subdivision(String title)
    {
        setTitle(title);
    };

    public Subdivision(Subdivision subdivision) {
        if (subdivision != null)
        {
            title = subdivision.title;
            ID = subdivision.ID;
        }
    }
    /**
     * Method for setting title and ID (filled in by title) of subdivision.
     * If the subdivision title has not been encountered before,
     * it enters it into the dictionary and generates a new ID
     * @param title new title of subdivision
     */
    public void setTitle(String title) {
        this.title = title;
        if (IDSubdivision.containsKey(title))
            this.ID = IDSubdivision.get(title);
        else
        {
            int newID =0;
            int j = 1;
            for (char i :title.toCharArray())
            {
                newID = j* (int) i;
                j++;
            }
            IDSubdivision.put(title,newID);
            this.ID = newID;
        }
    }
    /**
     * Method for getting Dictionary of ID
     * @return Dictionary of ID
     */
    public static Map<String, Integer> getIDSubdivision() {
        return IDSubdivision;
    }
    /**
     * Method for getting title of subdivision
     * @return title of subdivision
     */
    public String getTitle() {
        return title;
    }
    /**
     * Method for getting ID of subdivision
     * @return ID of subdivision
     */
    public int getID() {
        return ID;
    }
    /**
     * Method for getting information about subdivision
     * @return Ia string with information about subdivision
     */
    public String printSubdivision() {
        return title + "("+ Integer.toString(ID) + ")";
    }
}
