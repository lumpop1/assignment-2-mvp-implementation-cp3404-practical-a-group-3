package com.jianjian.jc486415.mysocialapp.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class Movie extends PostListFragment {

    public Movie() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        return databaseReference.child("user-posts")
                .child(getUid());
    }
}
