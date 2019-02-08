public class WeatherConditionals
{
    private int temperature;
    private int description;
    private int windchill;
    private int humidity;
    
    public static String getWeatherAdvice(int temperature, String description){
        //return (temperature + " degrees and" + description);
        boolean windy = false;
        //if ((description == "snow") && (temperature < 30))
           // return ("Snow angels time.");
        //else 
        //if ((description == "snow") && (temperature > 100))
        //    return ("The laws of physics have been rewritten");
            
        //if ((description == "sunny") && (temperature > 70))
            //return ("You should probably go outsite");
            
        //if ((description != "windy") && (temperature > 30))
            //return ("Yeet, and dab outside");
        //else
        //if (description == "windy") windy = true;
        //return "Too windy or cold! Enjoy playing CSGO while warm.";
        return (" ");
       
    }
    
    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description){
      if (temperature < 40 || temperature > 80) return ("Don't hike you dummy");
      else if (windchill <=0) return ("Don't hike the wind will kill you");
      else if (humidity <= 25 || humidity >= 60) return (" Don't hike it's hot fam");
      else if (description.indexOf("Snow") != -1 || description.indexOf("Showers") != -1 || description.indexOf("Cloudy") != -1 || description.indexOf ("Sunny") != -1);
      else return ("Have fun not dying");
      return (" ");  
    }
}