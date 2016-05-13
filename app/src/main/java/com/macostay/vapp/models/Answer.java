package com.macostay.vapp.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by macostay on 06/05/2016.
 */
public class Answer implements Parcelable {

    private String question_id;
    private String answer_type;
    private String answer_text;

    public Answer() {
    }

    public Answer(String question_id, String answer_type, String answer_text) {
        this.question_id = question_id;
        this.answer_type = answer_type;
        this.answer_text = answer_text;
    }

    public String getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(String question_id) {
        this.question_id = question_id;
    }

    public String getAnswer_type() {
        return answer_type;
    }

    public void setAnswer_type(String answer_type) {
        this.answer_type = answer_type;
    }

    public String getAnswer_text() {
        return answer_text;
    }

    public void setAnswer_text(String answer_text) {
        this.answer_text = answer_text;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "question_id='" + question_id + '\'' +
                ", answer_type='" + answer_type + '\'' +
                ", answer_text='" + answer_text + '\'' +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.question_id);
        dest.writeString(this.answer_type);
        dest.writeString(this.answer_text);
    }

    protected Answer(Parcel in) {
        this.question_id = in.readString();
        this.answer_type = in.readString();
        this.answer_text = in.readString();
    }

    public static final Creator<Answer> CREATOR = new Creator<Answer>() {
        @Override
        public Answer createFromParcel(Parcel source) {
            return new Answer(source);
        }

        @Override
        public Answer[] newArray(int size) {
            return new Answer[size];
        }
    };
}
