package onlineQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Question {
    private String questionText;
    private String[] options;
    private int correctOption;

    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public boolean checkAnswer(int option) {
        return option == correctOption;
    }

    @Override
    public String toString() {
        return questionText;
    }
}


class Quiz {
    private List<Question> questions = new ArrayList<>();
    private int score = 0;

    
    public void addQuestion(Question question) {
        questions.add(question);
    }

   
    public void takeQuiz(User user) {
        Scanner scanner = new Scanner(System.in);
        score = 0;  

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            System.out.println((i + 1) + ". " + question.getQuestionText());

            String[] options = question.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            System.out.print("Your answer (1-" + options.length + "): ");
            int userAnswer = scanner.nextInt();

            if (question.checkAnswer(userAnswer)) {
                score++;
            }
        }

        System.out.println(user.getName() + ", your score is: " + score + " out of " + questions.size());
    }

    public int getScore() {
        return score;
    }

    public int getTotalQuestions() {
        return questions.size();
    }
}


class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class OnlineQuizSystem {
    public static void main(String[] args) {

    	String[] options1 = {"Modi", "Rahul", "mamata", "jagan"};
        Question q1 = new Question("What is the Prime Minister of INDIA?", options1, 1);

        String[] options2 = {"Java", "Python", "C++", "Ruby"};
        Question q2 = new Question("Which programming language is known for its simplicity?", options2, 2);

        String[] options3 = {"5", "7", "9", "11"};
        Question q3 = new Question("What is 2 + 3?", options3, 1);


        Quiz quiz = new Quiz();
        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);

       
        User user = new User("Chaitanya");

        
        quiz.takeQuiz(user);
    }
}
