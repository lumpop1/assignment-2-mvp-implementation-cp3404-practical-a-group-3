package com.jianjian.jc486415.mysocialapp.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class Game extends PostListFragment {

    public Game() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        return databaseReference.child("user-posts")
                .child(getUid());
    }
}
