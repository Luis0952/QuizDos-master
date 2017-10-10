package com.jonmid.quizdos.Parser;

import com.jonmid.quizdos.Models.CommentModelRosalesLuis;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis Eduardo on 10/10/2017.
 */

public class CommentJsonRosalesLuis {

    public static List<CommentModelRosalesLuis> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<CommentModelRosalesLuis> commentList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
           // JSONObject item = jsonArray.getJSONObject(i);
            JSONObject comments = jsonArray.getJSONObject(0);

            CommentModelRosalesLuis comment = new CommentModelRosalesLuis();
            comment.setName(comments.getString("name"));
            comment.setEmail(comments.getString("email"));
            comment.setBody(comments.getString("body"));

            commentList.add(comment);
        }
        return commentList;
    }
}
