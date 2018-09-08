package com.xapps.nexos.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.HashMap;

public class Messages {
    @Id
    public ObjectId _id;

    public String date;
    public HashMap<String, String> input;

    public Messages() {
    }

    public Messages(ObjectId _id, String date, HashMap<String, String> input) {
        this._id = _id;
        this.date = date;
        this.input = input;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public HashMap<String, String> getInput() {
        return input;
    }

    public void setInput(HashMap<String, String> input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "_id=" + _id +
                ", date=" + date +
                ", input=" + input +
                '}';
    }
}
