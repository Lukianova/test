
import java.util.ArrayList;
import java.util.Iterator;
/**
 * This class describes Canada
 *
 * @author Nataliia Lukianova
 * @version 1.0
 */
public class Canada
{
    private ArrayList<ProvinceTerritory> provinces;
    public static final int NO_SUCH_PROVINCE = -1;
    
    public Canada()
    {
        provinces = new ArrayList<>();
        
        provinces.add(new ProvinceTerritory("quebec", 7903001));
        provinces.add(new ProvinceTerritory("ontario", 12851821));
        provinces.add(new ProvinceTerritory("british columbia", 4400057));
        provinces.add(new ProvinceTerritory("alberta", 3645257));
        provinces.add(new ProvinceTerritory("manitoba", 1208268));
        provinces.add(new ProvinceTerritory("saskatchewan", 1033381));
        provinces.add(new ProvinceTerritory("nova scotia", 921727));
        provinces.add(new ProvinceTerritory("new brunswick", 751171));
        provinces.add(new ProvinceTerritory("newfoundland and labrador", 514536));
        provinces.add(new ProvinceTerritory("prince edward island", 140204));
        provinces.add(new ProvinceTerritory("northwest territories", 41462));
        provinces.add(new ProvinceTerritory("yukon", 33897));
        provinces.add(new ProvinceTerritory("nunavut", 31906));
    }
    
    
    /**
     * @return Canada's total population
     */
    public int getTotalPopulation()
    {
        int sum = 0;
        if(provinces != null)
        {
            Iterator<ProvinceTerritory> provIT = provinces.iterator();
            ProvinceTerritory currentProv = null;
            
            while(provIT.hasNext())
            {
                currentProv = provIT.next();
                if(currentProv != null)
                {
                     sum += currentProv.getPopulation();
                }
            }
        }
        return sum;
    }
    
    /**
     * @return the name of the province that has the lowest population
     */
    public String getLowestPopulation()
    {
        if (provinces == null)
        {
            throw new IllegalArgumentException("'provinces' can not be null");
        }
        
        ProvinceTerritory currentProv = null;
        ProvinceTerritory provinceWithLowestPopulation = null;
            
        Iterator<ProvinceTerritory> provIT = provinces.iterator();
        while(provIT.hasNext())
        {
       
            currentProv = provIT.next();
            
            if(currentProv == null)
            {
                continue;
            }
     
            if(provinceWithLowestPopulation == null)
            {
                provinceWithLowestPopulation = currentProv;   
            }
            
            else if(currentProv.getPopulation() < provinceWithLowestPopulation.getPopulation())
            {
                provinceWithLowestPopulation = currentProv;
            }
        }
        
        return provinceWithLowestPopulation.getName();
    }
    
    /**
     * @return the population of the province
     * @param 'province'can not be null or empty
     */
    public int getPopulation(String province)
    {
        if(province == null || province.equals(""))
        {
            throw new IllegalArgumentException("'province' can not be null or empty");
        }
        
        if (provinces == null)
        {
            throw new IllegalArgumentException("'provinces' can not be null");
        }
        
        ProvinceTerritory theProvince = null;
        String provinceLowerCase = province.toLowerCase();
        Iterator<ProvinceTerritory> provIT = provinces.iterator();
        
        while(provIT.hasNext())
        {
            theProvince = provIT.next();
            
            if(theProvince == null)
            {
                continue;
            }
            
            String theProvinceName = theProvince.getName().toLowerCase();
            if(theProvinceName.equals(provinceLowerCase))
            {
                theProvince = theProvince;
                break;
            }
        }
        
        if(theProvince == null){
            throw new IllegalArgumentException("There is no such a province");
        }
        
        return theProvince.getPopulation();
    }
}    