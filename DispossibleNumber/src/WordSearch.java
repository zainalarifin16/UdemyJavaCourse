import java.util.Scanner;

class DataPolyndrome{
    private int manyWord = 0;
    private int lengthWord = 0;
    private String contentWord[];
    private String keyWord;

    public int getManyWord(){
        return this.manyWord;
    }

    public void setManyWord(int manyWord){
        this.contentWord = new String[ manyWord ];
        this.manyWord = manyWord;
    }

    public int getLengthWord(){
        return this.lengthWord;
    }

    public void setLengthWord(int lengthWord){
        this.lengthWord = lengthWord;
    }

    public String getContentWord(int index){
        return this.contentWord[index];
    }

    public void setContentWord(int index, String contentWord){
        this.contentWord[index] = contentWord;
    }

    public String getKeyWord(){
        return this.keyWord;
    }

    public void setKeyWord(String keyWord){
        this.keyWord = keyWord;
    }

}

public class WordSearch {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int loopCase = s.nextInt();

        DataPolyndrome data[] = new DataPolyndrome[loopCase];
        int printResult = 0;

        while( printResult < loopCase ){
            data[ printResult ] = new DataPolyndrome();
            data[printResult].setManyWord( s.nextInt() );
            data[printResult].setLengthWord( s.nextInt() );

            int loopWord = 0;
            while( loopWord < data[printResult].getManyWord() ){
                data[printResult].setContentWord(loopWord, s.next());
                loopWord++;

            }
            data[printResult].setKeyWord(s.next());
            printResult++;
        }

        printResult = 0;
        while( printResult < loopCase ){
            System.out.println("Case "+(printResult+1)+": "+searchKeyword(data[ printResult ], data[printResult].getKeyWord()));
            printResult++;

        }

    }

    public static int searchKeyword(DataPolyndrome data, String keyword){

        int loopWord = 0;
        int foundWord = 0;
        int lengthKeyword = keyword.length()-1;
        String combineWord = "";
        while(loopWord < data.getManyWord()){
            char wordToSearch[] = data.getContentWord(loopWord).toCharArray();
            for(int col = 0; col < data.getLengthWord(); col++){
                //check forward
                if( (col + (lengthKeyword+1)) <= data.getLengthWord() ){

                    combineWord = "";
                    for( int loopKeyword = col; loopKeyword < col+(lengthKeyword+1);loopKeyword++ ){
                        combineWord += wordToSearch[loopKeyword];
                    }

                    if(combineWord.equals(keyword)){
                        foundWord++;
                    }

                    //horizonal top right
                    if( loopWord >= lengthKeyword ) {

                        combineWord = "";
                        int loopWordDecrement = loopWord;

                        for( int loopKeyword = col; loopKeyword < col+(lengthKeyword+1);loopKeyword++ ){
                            combineWord += data.getContentWord(loopWordDecrement).toCharArray()[loopKeyword];
                            loopWordDecrement--;
                        }

                        if(combineWord.equals(keyword)){
//                            System.out.println( "HTR: " + combineWord + " : " + keyword );
                            foundWord++;
                        }

                    }

                    //horizontal bottom right
                    if( loopWord+lengthKeyword < data.getManyWord() ){

                        combineWord = "";
                        int loopWordIncrement = loopWord;

                        for( int loopKeyword = col; loopKeyword < col+(lengthKeyword+1);loopKeyword++ ){
                            combineWord += data.getContentWord(loopWordIncrement).toCharArray()[loopKeyword];
                            loopWordIncrement++;
                        }

                        if(combineWord.equals(keyword)){
                            foundWord++;
                        }

                    }

                }
                //check backward
                if( col - lengthKeyword >= 0 ){
                    combineWord = "";

                    for( int loopKeyword = col; loopKeyword >= col-lengthKeyword;loopKeyword-- ){
                        combineWord = combineWord+wordToSearch[loopKeyword];
                    }

                    if(combineWord.equals(keyword)){
                        foundWord++;
                    }

                    //horizontal top left
                    if( loopWord - lengthKeyword >= 0 ) {

                        combineWord = "";
                        int loopWordDecrement = loopWord;

                        for( int loopKeyword = col; loopKeyword >= col-lengthKeyword;loopKeyword-- ){
                            combineWord += data.getContentWord(loopWordDecrement).toCharArray()[loopKeyword];
                            loopWordDecrement--;
                        }

                        if(combineWord.equals(keyword)){
                            foundWord++;
                        }

                    }

                    //horizontal bottom left
                    if( loopWord+lengthKeyword < data.getManyWord() ) {

                        combineWord = "";
                        int loopWordIncrement = loopWord;

                        for( int loopKeyword = col; loopKeyword >= col-lengthKeyword;loopKeyword-- ){
                            combineWord += data.getContentWord(loopWordIncrement).toCharArray()[loopKeyword];
                            loopWordIncrement++;
                        }

                        if(combineWord.equals(keyword)){
                            foundWord++;
                        }

                    }

                    }
                //check bottom
                if( loopWord + lengthKeyword < data.getManyWord() ){
                    combineWord = "";

                    for( int loopKeyWord = loopWord; loopKeyWord <= loopWord+lengthKeyword; loopKeyWord++ ) {
                        combineWord += data.getContentWord(loopKeyWord).toCharArray()[col];
                    }

                    if(combineWord.equals(keyword)){
                        foundWord++;
                    }
                }

                //check upper
                if( loopWord - lengthKeyword >= 0 ){
                    combineWord = "";

                    for( int loopKeyWord = loopWord; loopKeyWord >= loopWord-lengthKeyword; loopKeyWord-- ) {
                        combineWord += data.getContentWord(loopKeyWord).toCharArray()[col];
                    }

                    if(combineWord.equals(keyword)){
                        foundWord++;
                    }
                }

            }

            loopWord++;
        }

        return foundWord;
    }



}
