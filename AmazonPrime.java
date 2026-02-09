class AmazonPrime {
    public static void main(String[] ott) {
        String primeMovies[] = {"KGF","Jai Bhim","Sardar Udham","Drishyam 2","Shershaah","The Tomorrow War","Sound of Metal","The Big Sick","Air","Coming 2 America","Borat Subsequent Moviefilm","Manchester by the Sea","Licorice Pizza","Cinderella","The Green Knight","Annette","Without Remorse","Saltburn","Reacher Movie","Being the Ricardos"};
        String primeSeries[] = {"The Family Man","Mirzapur","Panchayat","Farzi","Reacher","Jack Ryan","The Boys","Citadel","Made in Heaven","Asur","Upload","Fleabag","Hunters","The Marvelous Mrs Maisel","Rings of Power","Gen V","Night Sky","Daisy Jones","Cross","The Terminal List"};
        String primeDocumentaries[] = {"All or Nothing","One Child Nation","LuLaRich","Good Night Oppy","Val","Time","Justin Bieber Our World","Shiny Flakes","P!nk All I Know So Far","The Grand Tour","Clarkson’s Farm","Wild Sri Lanka","Ocean Souls","Burning","The Last Movie Stars","We Are the Champions","Generation Wealth","Truth or Consequences","Good Rivals","McMillions"};
        String primeAnime[] = {"Dororo","Vinland Saga","Attack on Titan","Naruto","One Punch Man","Made in Abyss","Re Creators","Inuyashiki","Banana Fish","Jujutsu Kaisen","Hunter x Hunter","Chainsaw Man","Bleach","Demon Slayer","Tokyo Revengers","Black Clover","Dragon Ball Super","Death Note","Mob Psycho 100","Parasyte"};
        String primeRealityShows[] = {"LOL Last One Laughing","Comicstaan","Four More Shots Please","The Grand Tour","MasterChef Australia","Bigg Boss OTT","The Apprentice","Shark Tank US","Fear Factor","Eco Challenge","Making the Cut","Take One","Dance Plus Pro","India’s Got Talent","American Ninja Warrior","Survivor","Top Gear","Amazing Race","Hell’s Kitchen","Project Runway"};
        System.out.println("The no of Amazon Prime Movies :"+primeMovies.length);
        for(String movie : primeMovies){
        System.out.println(movie);
        }
        System.out.println("\nThe no of Amazon Prime Series :"+primeSeries.length);
        for(String series : primeSeries){
        System.out.println(series);
        }
        System.out.println("\nThe no of Amazon Prime Documentaries :"+primeDocumentaries.length);
        for(String doc : primeDocumentaries){
        System.out.println(doc);
        }
        System.out.println("\nThe no of Amazon Prime Anime :"+primeAnime.length);
        for(String anime : primeAnime){
        System.out.println(anime);
        }
        System.out.println("\nThe no of Amazon Prime Reality Shows :"+primeRealityShows.length);
        for(String show : primeRealityShows){
        System.out.println(show);
        }
	}
}
