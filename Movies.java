class Movies{

static String movies[]=
{"Terminator","KGF","Pink","Vikranth rona",
  "Kranti","3  idiots","Charlie","Hero","Shershah",
   "Yuvaratna","Robert","pogaru","Kirik Party",
    "Arundanti","Jolly Days","Kotigobba",
    "Arya","Googly","Kirataka","RajKumar",
     "Yajamana","Gandada Gudi","Paa","Chakravrthi","Bangarada Jinke"};


public static void main(String a[]){
 getMovies();

}

public static void getMovies(){
 for(int i=0;i<movies.length;i++){
  System.out.print(movies[i]+ " , ");
}

}

}
