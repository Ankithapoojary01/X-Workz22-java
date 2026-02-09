class RailwayStation{
    public static void main(String[] args){
        String stationName="Bangalore City Junction";
        String stationCode="SBC";
        String location="Krishna Rajendra Road, Majestic, Bangalore";
        String platforms[]={"Platform 1","Platform 2","Platform 3","Platform 4","Platform 5"};
        String stationManagers[]={"Ravi","Anita","Suresh","Deepa","Kiran"};
        System.out.println("Station Name:"+stationName);
        System.out.println("Station Code:"+stationCode);
        System.out.println("Location:"+location);
        System.out.println("The number of Platforms are:"+platforms.length);
        System.out.println("The list of Platforms available:");
        for(String platform:platforms){
        System.out.println(platform);
        }
        System.out.println("The Station Managers are:");
        for(String manager:stationManagers){
        System.out.println(manager);
        }
    }
}
