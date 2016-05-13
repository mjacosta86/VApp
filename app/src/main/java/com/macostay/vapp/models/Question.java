package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by macostay on 06/05/2016.
 */
public class Question implements Parcelable {

    private String question_id;
    private String question;
    private String answer_type;
    private ArrayList<Option> options;

    public Question() {
    }

    public Question(String question_id, String question, String answer_type, ArrayList<Option> options) {
        this.question_id = question_id;
        this.question = question;
        this.answer_type = answer_type;
        this.options = options;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer_type() {
        return answer_type;
    }

    public void setAnswer_type(String answer_type) {
        this.answer_type = answer_type;
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Option> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question_id=" + question_id +
                ", question='" + question + '\'' +
                ", answer_type='" + answer_type + '\'' +
                ", options=" + options +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.question_id);
        dest.writeString(this.question);
        dest.writeString(this.answer_type);
        dest.writeTypedList(options);
    }

    protected Question(Parcel in) {
        this.question_id = in.readString();
        this.question = in.readString();
        this.answer_type = in.readString();
        this.options = in.createTypedArrayList(Option.CREATOR);
    }

    public static final Creator<Question> CREATOR = new Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel source) {
            return new Question(source);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };
}
