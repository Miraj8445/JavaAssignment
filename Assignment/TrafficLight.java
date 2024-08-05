public class TrafficLight {
   
    private String color;
    private int duration; 

   
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    
    public String getColor() {
        return color;
    }

    
    public int getDuration() {
        return duration;
    }

    
    public void setTrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
        System.out.println("Traffic light changed to " + color + " for " + duration + " seconds.");
    }


    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    
    public static void main(String[] args) {
        
        TrafficLight trafficLight = new TrafficLight("Red", 30);

        System.out.println("Current color: " + trafficLight.getColor());
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());

        trafficLight.setTrafficLight("Green", 45);

        
        System.out.println("Current color: " + trafficLight.getColor());
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());
    }
}
