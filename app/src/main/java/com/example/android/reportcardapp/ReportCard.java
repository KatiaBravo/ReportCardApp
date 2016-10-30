package com.example.android.reportcardapp;

import java.util.ArrayList;

public class ReportCard {

    private String mMath;
    private String mMathGrade;
    private String mScience;
    private String mScienceGrade;
    private String mSocialScience;
    private String mSocialScienceGrade;
    private String mLanguageArts;
    private String mLanguageArtsGrade;
    private String mElective;
    private String mElectiveGrade;

    public ReportCard(String m, String s, String ss, String la, String e, String mGrade, String sGrade, String ssGrade, String laGrade, String eGrade){
        mMath = m;
        mScience = s;
        mSocialScience = ss;
        mLanguageArts = la;
        mElective = e;
        mMathGrade = mGrade;
        mScienceGrade = sGrade;
        mSocialScienceGrade = ssGrade;
        mLanguageArtsGrade = laGrade;
        mElectiveGrade = eGrade;
    }

    @Override
    public String toString(){
        String result = "";
        ArrayList<String> grades = new ArrayList<String>();
        grades.add(mMath + ": " + mMathGrade);
        grades.add(mScience + ": " + mScienceGrade);
        grades.add(mSocialScience + ": " + mSocialScienceGrade);
        grades.add(mLanguageArts + ": " + mLanguageArtsGrade);
        grades.add(mElective + ": " + mElectiveGrade);
        for (int i = 0; i < grades.size(); i++){
            result += grades.get(i) + "/n";
        }
        return result;
    }

    public String getMath(){return mMath;}
    public void setMath(String mMath){this.mMath = mMath;}
    public String getMathGrade(){return mMathGrade;}
    public void setMathGrade(String mMathGrade){this.mMathGrade = mMathGrade;}
    public String getScience(){return mScience;}
    public void setScience(String mScience){this.mScience = mScience;}
    public String getScienceGrade(){return mScienceGrade;}
    public void setScienceGrade(String mScienceGrade){this.mScienceGrade = mScienceGrade;}
    public String getSocialScience(){return mSocialScience;}
    public void setSocialScience(String mSocialScience){this.mSocialScience = mSocialScience;}
    public String getSocialScienceGrade(){return mSocialScienceGrade;}
    public void setSocialScienceGrade(String mSocialScienceGrade){this.mSocialScienceGrade = mSocialScienceGrade;}
    public String getLanguageArts(){return mLanguageArts;}
    public void setLanguageArts(String mLanguageArts){this.mLanguageArts = mLanguageArts;}
    public String getLanguageArtsGrade(){return mLanguageArtsGrade;}
    public void setLanguageArtsGrade(String mLanguageArtsGrade){this.mLanguageArtsGrade = mLanguageArtsGrade;}
    public String getElective(){return mElective;}
    public void setElective(String mElective){this.mElective = mElective;}
    public String getElectiveGrade(){return mElectiveGrade;}
    public void setElectiveGrade(String mElectiveGrade){this.mElectiveGrade = mElectiveGrade;}
}
