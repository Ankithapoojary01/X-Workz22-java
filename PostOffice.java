class PostOffice{
    public static void main(String[] args){
        String postOfficeName="Central Post Office";
        String postOfficeCode="560001";
        String location="MG Road,Bangalore";
        String servicesAvailable[]={"Mail Delivery","Parcel Service","Speed Post","Money Transfer","PO Savings Bank"};
        String staffMembers[]={"Ramesh","Anita","Suresh","Deepa","Kiran"};
        System.out.println("Post Office Name:"+postOfficeName);
        System.out.println("Post Office Code:"+postOfficeCode);
        System.out.println("Location:"+location);
        System.out.println("The number of Services Available:"+servicesAvailable.length);
        System.out.println("The list of Services are:");
        for(String service:servicesAvailable){
        System.out.println(service);
        }
        System.out.println("The staff Members are:");
        for(String staff:staffMembers){
        System.out.println(staff);
        }
    }
}
