public class Music {
    String title="Heaven's on Fire", artist="KISS";
    int yearRelease=1984, quantityOfRatings =0;
    double rating =0, sumOfRatings =0, avarageOfRatings =0;

    //criar funções aqui, e o switch case dentro do main
    void showsDatasheet(){
        if(quantityOfRatings > 0) {
            avarageOfRatings = sumOfRatings / quantityOfRatings;}
        System.out.println(String.format("""
                Título: %s
                Artista: %s
                Ano de lançamento: %d
                Nº de reviews: %d
                Sua review: %.1f
                Média das avaliações: %.1f
                """, title, artist, yearRelease, quantityOfRatings, rating, avarageOfRatings));
    }

    void insertRating(double newRating){
        rating = newRating;
        sumOfRatings += newRating;
        quantityOfRatings++;
    }
}
