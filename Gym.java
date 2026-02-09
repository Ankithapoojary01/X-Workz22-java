class Gym{
    public static void main(String[] args){
        String gymName="PowerFlex Fitness";
        String gymOwner="Arjun Kumar";
        String location="JP Nagar, Bangalore";
        String facilitiesAvailable[]={"Cardio Zone","Weight Training","Yoga Hall","Zumba Studio","CrossFit Area"};
        String trainers[]={"Rahul","Sneha","Vikram","Anita","Kiran"};
        System.out.println("Gym Name:"+gymName);
        System.out.println("Owner:"+gymOwner);
        System.out.println("Location:"+location);
        System.out.println("Number of Facilities Available:"+facilitiesAvailable.length);
        System.out.println("List of Facilities:");
        for(String facility:facilitiesAvailable){
        System.out.println(facility);
        }
        System.out.println("Trainers:");
        for(String trainer:trainers){
        System.out.println(trainer);
        }
    }
}
