package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by macostay on 11/05/2016.
 */
public class Questions implements Parcelable {

    private ArrayList<Question> questions;

    public Questions() {
    }

    public Questions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "questions=" + questions +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(questions);
    }

    protected Questions(Parcel in) {
        this.questions = in.createTypedArrayList(Question.CREATOR);
    }

    public static final Creator<Questions> CREATOR = new Creator<Questions>() {
        @Override
        public Questions createFromParcel(Parcel source) {
            return new Questions(source);
        }

        @Override
        public Questions[] newArray(int size) {
            return new Questions[size];
        }
    };
}
