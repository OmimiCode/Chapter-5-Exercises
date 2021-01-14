package Chapter5;

import javax.swing.*;

public class Global_Warming_Facts_Quiz {
    private int quizTotal = 0;
    private String q1, q2, q3, q4, q5;

    public void question1() {
        String q1;
        q1 = JOptionPane.showInputDialog(null,
                "1. Globally, which of the following economic sectors emits \n" +
                        "the largest percentage of greenhouse gas emissions? \n" +
                        "(A) Transportation\n" +
                        "(B) Buildings\n" +
                        "(C) Industry\n" +
                        "(D) Electricity and heat production");
        this.q1 = q1.toUpperCase();

    }

    public String getQuestion1_Answer() {
        //question1();
        if (q1.equals("D")) {
            JOptionPane.showMessageDialog(null, "\n" +
                    "CORRECT\n" +
                    "The electricity and heat production sector emits the" +
                    "largest percentage of global greenhouse gas emissions at 25%. " +
                    "Agriculture, forestry, and other land use sector is a close " +
                    "second at 24%.");
        } else {
            JOptionPane.showMessageDialog(null, "\n" +
                    "INCORRECT\n" +
                    "The electricity and heat production sector emits the" +
                    "largest percentage of global greenhouse gas emissions at 25%. " +
                    "Agriculture, forestry, and other land use sector is a close " +
                    "second at 24%.");

        }
        return q1;
    }

    public void question2() {
        String q2 = JOptionPane.showInputDialog(null,
                "2. What is the Greenhouse Effect?\n" +
                        "\n" +
                        "(A) The name of climate change legislation that passed by congress\n" +
                        "(B) When you paint your house green to become an environmentalist\n" +
                        "(C) When the gasses in our atmosphere trap heat and block it from escaping our planet\n" +
                        "(D) When you build a greenhouse");
        this.q2 = q2.toUpperCase();
    }

    public String getQuestion2_Answer() {
        //question2();
        if (q2.equals("C")) {
            JOptionPane.showMessageDialog(null,
                    "CORRECT\n" +
                            "The Earth receives solar radiation from the sun. Passing through the atmosphere,\n " +
                            "some radiation is absorbed by the Earth, while some is reflected back to space.\n " +
                            "When the exchange of incoming and outgoing radiation occurs, some of the radiation\n" +
                            "becomes trapped by gases in the atmosphere.This creates a “greenhouse” effect and \n" +
                            "warms the planet.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "INCORRECT\n" +
                            "The Earth receives solar radiation from the sun. Passing through the atmosphere,\n " +
                            "some radiation is absorbed by the Earth, while some is reflected back to space.\n " +
                            "When the exchange of incoming and outgoing radiation occurs, some of the radiation\n" +
                            "becomes trapped by gases in the atmosphere.This creates a “greenhouse” effect and \n" +
                            "warms the planet.");
        }
        return q2;
    }

    public void question3() {

        String q3 = JOptionPane.showInputDialog(null,
                "3. Which of the following is a greenhouse gas?\n" +
                        "\n" +
                        "(A) CO2\n" +
                        "(B) CH4\n" +
                        "(C) Water vapor\n" +
                        "(D) All of the above");
        this.q3 = q3.toUpperCase();
    }

    public String getQuestion3_Answer() {
        //question3();
        if (q3.equals("D")) {
            JOptionPane.showMessageDialog(null,
                    "CORRECT\n" +
                            "Greenhouse gases may be a result of natural occurrence or human activity. \n" +
                            "These gases include water vapor, carbon dioxide, methane, nitrous oxide, and ozone. \n" +
                            "Fluorinated gases are also considered to be greenhouse gases.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "INCORRECT\n" +
                            "Greenhouse gases may be a result of natural occurrence or human activity. \n" +
                            "These gases include water vapor, carbon dioxide, methane, nitrous oxide, and ozone. \n" +
                            "Fluorinated gases are also considered to be greenhouse gases.");
        }
        return q3;
    }

    public void question4() {
        String q4 = JOptionPane.showInputDialog(null,
                "4. What was agreed to in the “Paris Agreement” that came out of COP-21, held in Paris in 2015?\n" +
                        "\n" +
                        "(A) To protect biodiversity and end the deforestation of the world’s rainforests\n" +
                        "(B) To keep global temperature rise well below 2℃ pre-industrial levels and to pursue a path to limit warming to 1.5℃\n" +
                        "(C) To limit sea level rise to 3 feet above current levels\n" +
                        "(D) To pursue a goal of 100% clean, renewable energy");
        this.q4 = q4.toUpperCase();
    }

    public String getQuestion4_Answer() {
        //question4();
        if (q4.equals("B")) {
            JOptionPane.showMessageDialog(null,
                    "CORRECT\n" +
                            "The Paris Agreement aims to keep the overall increase in global temperatures \n" +
                            "below 2 degrees Celsius, with the hope of limiting it to 1.5 degrees Celsius. \n" +
                            "Scientists believe that these are the largest increases in global temperature \n" +
                            "that we could experience without causing catastrophic change to the Earth’s climate.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "INCORRECT\n" +
                            "The Paris Agreement aims to keep the overall increase in global temperatures \n" +
                            "below 2 degrees Celsius, with the hope of limiting it to 1.5 degrees Celsius. \n" +
                            "Scientists believe that these are the largest increases in global temperature \n" +
                            "that we could experience without causing catastrophic change to the Earth’s climate.");
        }
        return q4;
    }

    public void question5() {
        String q5 = JOptionPane.showInputDialog(null,
                "5. What percentage of the global greenhouse gas emissions does the transportation sector emit?\n" +
                        "\n" +
                        "(A) 14%\n" +
                        "(B) 1%\n" +
                        "(C) 33%\n" +
                        "(D) 70%");
        this.q5 = q5.toUpperCase();
    }

    public String getQuestion5_Answer() {
        //question5();
        if (q5.equals("A")) {
            JOptionPane.showMessageDialog(null,
                    "CORRECT\n" +
                            "The transportation sector emits 14% of global greenhouse gas emissions. \n" +
                            "Most of this involves fossil fuels burned for road, rail, air, and marine \n" +
                            "transportation, since petroleum-based fuels (i.e., gasoline and diesel) \n" +
                            "account for almost all of the world’s transportation energy.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "INCORRECT\n" +
                            "The transportation sector emits 14% of global greenhouse gas emissions. \n" +
                            "Most of this involves fossil fuels burned for road, rail, air, and marine \n" +
                            "transportation, since petroleum-based fuels (i.e., gasoline and diesel) \n" +
                            "account for almost all of the world’s transportation energy.");
        }
        return q5;
    }


    public void TotalIncrement() {
        //question1();
        if (q1.equals("D")) {
            quizTotal++;
        }

       // question2();
        if (q2.equals("C")) {
            quizTotal++;
        }

        //question3();
        if (q3.equals("D")) {
            quizTotal++;
        }

        //question4();
        if (q4.equals("B")) {
            quizTotal++;
        }
       // question5();
        if (q5.equals("A")) {
            quizTotal++;
        }
    }


    public int getQuizTotal() {
        TotalIncrement();
        return JOptionPane.showConfirmDialog(null, "Result: "+ quizTotal);
    }

    public String gradeComment() {
        if (quizTotal==5) {
            JOptionPane.showMessageDialog(null,
                    "Excellent");
        } else {
            if (quizTotal == 4) {
                JOptionPane.showMessageDialog(null,
                        "Very good");
            } else {
                    JOptionPane.showMessageDialog(null,
                            "Time to brush up on your knowledge of global warming");
                }
            }
            return null;
    }

    public static void main(String[] args) {
        Global_Warming_Facts_Quiz quiz = new Global_Warming_Facts_Quiz();
  //set questions and get answers
        quiz.question1();
        quiz.getQuestion1_Answer();
        quiz.question2();
        quiz.getQuestion2_Answer();
        quiz.question3();
        quiz.getQuestion3_Answer();
        quiz.question4();
        quiz.getQuestion4_Answer();
        quiz.question5();
        quiz.getQuestion5_Answer();
        //get result
        quiz.getQuizTotal();
       //get result comment
        quiz.gradeComment();


    }



}

