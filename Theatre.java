class Theatre{
    public static void main(String[] args){
        String theatreName="Galaxy Cinema";
        String ownerName="Ankitha Rao";
        String location="Brigade Road, Bangalore";
        String screensAvailable[]={"Screen 1","Screen 2","Screen 3","Screen 4","Screen 5"};
        String staffMembers[]={"Ravi","Priya","Suresh","Anita","Kiran"};
        System.out.println("Theatre Name:"+theatreName);
        System.out.println("Owner:"+ownerName);
        System.out.println("Location:"+location);
        System.out.println("Number of Screens Available:"+screensAvailable.length);
        System.out.println("List of Screens:");
        for(String screen:screensAvailable){
        System.out.println(screen);
        }
        System.out.println("Staff Members:");
        for(String staff:staffMembers){
        System.out.println(staff);
        }
    }
}
