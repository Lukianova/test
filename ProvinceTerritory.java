
/**
 * This class describes ProvinceTerritory.
 *
 * @author Nataliia Lukianova
 * @version 1.0
 */
public class ProvinceTerritory
{
    private String name;
    private int population;
    public static final int MIN_LENGTH = 1;
    
    /**
     * Main constractor
     * @param name can NOT be null an must be at least {@value #MIN_LENGTH} charachters long
     * @param population
     */
    public ProvinceTerritory(String name, int population)
    {
        setName(name);
        setPopulation(population);
    }
    
    /**
     * Mutator
     * @param name can NOT be null an must be at least {@value #MIN_LENGTH} charachters long
     */
    public void setName(String name)
    {
        if(name != null && name.length() >= MIN_LENGTH)
        {
            this.name = name;
        }
        else
        {
            throw new IllegalArgumentException("name can NOT be null an must be at least " + MIN_LENGTH + " charachters long");
        }
    }
    
    /**
     * Accessor
     * @return province name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Mutator
     * @param population can not be negative
     */
    public void setPopulation(int population)
    {
        if(population >= 0)
        {
            this.population = population;
        }
        else
        {
            throw new IllegalArgumentException("population can not be negative");
        }
    }
    
    /**
     * Accessor
     * @return province population 
     */
    public int getPopulation()
    {
        return population;
    }   
}
