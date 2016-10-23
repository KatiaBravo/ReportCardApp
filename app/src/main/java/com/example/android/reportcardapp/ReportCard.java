package com.example.android.reportcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ReportCard extends AppCompatActivity {

    private String math;
    private String mathGrade;
    private String science;
    private String scienceGrade;
    private String socialScience;
    private String socialScienceGrade;
    private String languageArts;
    private String languageArtsGrade;
    private String elective;
    private String electiveGrade;

    public ReportCard(String m, String s, String ss, String la, String e, String mGrade, String sGrade, String ssGrade, String laGrade, String eGrade){
        math = m;
        science = s;
        socialScience = ss;
        languageArts = la;
        elective = e;
        mathGrade = mGrade;
        scienceGrade = sGrade;
        socialScienceGrade = ssGrade;
        languageArtsGrade = laGrade;
        electiveGrade = eGrade;
    }

    public String toString(){
        String result = "";
        ArrayList<String> grades = new ArrayList<String>();
        grades.add(math + ": " + mathGrade);
        grades.add(science + ": " + scienceGrade);
        grades.add(socialScience + ": " + socialScienceGrade);
        grades.add(languageArts + ": " + languageArtsGrade);
        grades.add(elective + ": " + electiveGrade);
        for (int i = 0; i < grades.size(); i++){
            result += grades.get(i) + "/n";
        }
        return result;
    }

    public String getMath(){return math;}
    public void setMath(String math){this.math = math;}
    public String getMathGrade(){return mathGrade;}
    public void setMathGrade(String mathGrade){this.mathGrade = mathGrade;}
    public String getScience(){return science;}
    public void setScience(String science){this.science = science;}
    public String getScienceGrade(){return scienceGrade;}
    public void setScienceGrade(String scienceGrade){this.scienceGrade = scienceGrade;}
    public String getSocialScience(){return socialScience;}
    public void setSocialScience(String socialScience){this.socialScience = socialScience;}
    public String getSocialScienceGrade(){return socialScienceGrade;}
    public void setSocialScienceGrade(String socialScienceGrade){this.socialScienceGrade = socialScienceGrade;}
    public String getLanguageArts(){return languageArts;}
    public void setLanguageArts(String languageArts){this.languageArts = languageArts;}
    public String getLanguageArtsGrade(){return languageArtsGrade;}
    public void setLanguageArtsGrade(String languageArtsGrade){this.languageArtsGrade = languageArtsGrade;}
    public String getElective(){return elective;}
    public void setElective(String elective){this.elective = elective;}
    public String getElectiveGrade(){return electiveGrade;}
    public void setElectiveGrade(String electiveGrade){this.electiveGrade = electiveGrade;}
}
