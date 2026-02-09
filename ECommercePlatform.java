class ECommercePlatform{
    public static void main(String[] args){
        String platformName="ShopEase";
        String ceoName="Rahul Sharma";
        String headquarters="Koramangala, Bangalore";
        String categoriesAvailable[]={"Electronics","Fashion","Home & Kitchen","Books","Toys","Cosmetics"};
        String keyManagers[]={"Priya","Vikram","Anita","Suresh","Rohit"};
        System.out.println("E-commerce Platform Name:"+platformName);
        System.out.println("CEO:"+ceoName);
        System.out.println("Headquarters:"+headquarters);
        System.out.println("The number of Categories Available:"+categoriesAvailable.length);
        System.out.println("The list of Categories are:");
        for(String category:categoriesAvailable){
        System.out.println(category);
        }
        System.out.println("The Key Managers are:");
        for (String manager:keyManagers){
        System.out.println(manager);
        }
    }
}
