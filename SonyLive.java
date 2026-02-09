class SonyLive {
    public static void main(String[] args){
        String movies[] ={"U Turn","Ulidavaru Kandanthe","RangiTaranga","Godhi Banna Sadharana Mykattu","Kantara Chapter 1","Charlie","Lucia","Dia","Avane Srimannarayana","Bell Bottom","Thithi","Ondu Motteya Kathe","Mugulu Nage","Kirik Party","Mayabazar 2016","Rama Rama Re","Tagaru","Gultoo","Sarkari Hiriya Prathamika Shale","Garuda Gamana Vrishabha Vahana"};
        String series[] ={"Scam 1992","Rocket Boys","Gullak","Cubicles","Aspirants","College Romance","Pitchers","Permanent Roommates","TVF Tripling","Yeh Meri Family","Jamnapaar","Paatal Lok","Delhi Crime","Inside Edge","Aranyak","Jubilee","Breathe","City of Dreams","Maharani","Human"};
        String documentaries[] ={"The Social Dilemma","India 2020","Planet Earth","Blue Planet","Our Planet","The Elephant Whisperers","India from Above","Monsoon Mysteries","Life on Earth","Frozen Planet","Inside the Human Body","Secrets of the Ocean","Wild Karnataka","Wild Assam","India Untamed","Journey of Yoga","Science of Sleep","Mind Explained","History of India","Space Explorers"};
        String anime[] = {"Steins Gate","Erased","Your Name","Weathering With You","A Silent Voice","Cowboy Bebop","Samurai Champloo","Akira","Neon Genesis Evangelion","Code Geass","Monster","Berserk","Paranoia Agent","Perfect Blue","Devilman Crybaby","Odd Taxi","Ping Pong the Animation","Psycho Pass","Trigun","Serial Experiments Lain"};
        String realityShows[] ={"Indian Idol","Super Dancer Chapter","Dance Plus Junior","MTV Unplugged","MTV Ace of Space","India’s Best Dancer","Comedy Circus","The Kapil Sharma Show","India’s Raw Star","Voice of Karnataka","Big Celebrity Challenge","Cook with Comali Junior","Ultimate Kho Kho","Road to Olympics","Campus Diaries Reality","Young Chef India","Fashion Showdown","Battle of Bands","Startup Stars","Street Dancers League"};
        System.out.println("The no of SonyLiv Movies :"+movies.length);
        for(String movie : movies){
        System.out.println(movie);
        }
        System.out.println("\nThe no of SonyLiv Series :"+series.length);
        for(String show : series){
        System.out.println(show);
        }
        System.out.println("\nThe no of SonyLiv Documentaries: "+documentaries.length);
        for(String doc : documentaries){
        System.out.println(doc);
        }
        System.out.println("\nThe no of SonyLiv Anime :"+anime.length);
        for(String ani : anime){
        System.out.println(ani);
        }
        System.out.println("\nThe no of SonyLiv Reality Shows :"+realityShows.length);
        for(String reality : realityShows){
        System.out.println(reality);
        }
    }
}
