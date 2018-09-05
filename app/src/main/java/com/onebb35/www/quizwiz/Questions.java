package com.onebb35.www.quizwiz;

/**
 * Created by Bhawesh on 01-12-2017.
 */

public class Questions {

public String mQuestion[]= {
        "What is the home ground for Real madrid?",
        "When did real madrid formed?",
        "Current Manager of Real Madrid? ",
        "Number of UEFA trophies won by Real Madrid? ",
        "Current Captain of Real Madrid?",
        "Who holds the record for most overall appearances for RMA?",
        "Who is the all-time top scorer of the club?",
        "Who Have won the FIFA Ballon d'Or 4 times ?",
        "How many LA Liga titles won by Real Madrid?",
        "Who plays as a striker for real Madrid?",
        "Kit manufacturer for real Madrid?",
        "Who is the club's record signing, costing €100 million in 2013?",
        "Who have never played for Real Madrid?",
        "Who is the current president of Real Madrid?",
        "Which team was beaten by real Madrid in 2017 Supercopa de España",
        "Which team hold the maximum number of UEFA titels after Real Madrid",
};
    private String mChoice[][]={
            {"Santiago Bernabéu Stadium","Signal Iduna Park","Camp Nou","allianz stadium"},
            {"6 March 1902","7 March 1902","6 March 1920","8 March 1902"},
            {"Zinedine Zidane","Florentino Pérez","Carlo Ancelotti","José Mourinho"},
            {"10","12","13","14"},
            {"Cristiano Ronaldo","Sergio Ramos"," Iker Casillas","raul"},
            {"Sergio Ramos"," Iker Casillas","raul","Cristiano Ronaldo"},
            {"Cristiano Ronaldo", "Iker Casillas","Raul","Sergio Ramos"},
            {"Cristiano Ronaldo", "Iker Casillas","raul","Sergio Ramos"},
            {"30","32","33","34"},
            {"Cristiano Ronaldo", "Iker Casillas","pepe","Sergio Ramos"},
            {"nike","adidas","puma","reebok"},
            {"Cristiano Ronaldo","Iker Casillas","Gareth Bale","Sergio Ramos"},
            {"Angel di maria","Mesut Özil","Lionel Messi","Kaká"},
            {"Zinedine Zidane","Florentino Pérez","Carlo Ancelotti","José Mourinho"},
            {"Atlético Madrid","Sevilla","Barcelona","Valencia"},
            {"Atlético Madrid","Bayern Munich","Barcelona FC","AC Milan"}
    };
    private String mCorrectAnswer[]={"Santiago Bernabéu Stadium",
                                    "6 March 1902",
                                    "Zinedine Zidane",
                                    "12",
                                    "Sergio Ramos",
                                    "Raul",
                                    "Cristiano Ronaldo",
                                    "Cristiano Ronaldo",
                                    "33",
                                    "Cristiano Ronaldo",
                                     "adidas",
                                    "Gareth Bale",
                                    "Lionel Messi",
                                    "Florentino Pérez",
                                        "Barcelona FC",
                                     "AC Milan"};
    public String getQuestion(int a)
    {
        String question=mQuestion[a];
        return question;
    }
    public String getChoice1(int a)
    {
        String choice=mChoice[a][0];
        return choice;
    }
    public String getChoice2(int a)
    {
        String choice=mChoice[a][1];
        return choice;
    }
    public String getChoice3(int a)
    {
        String choice=mChoice[a][2];
        return choice;
    }
    public String getChoice4(int a)
    {
        String choice=mChoice[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a)
    {
        String answer=mCorrectAnswer[a];
        return answer;
    }
}
