package com.google.samples.quickstart.signin;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by maidulislam on 24/08/16.
 */
public class Constants {
    private static FirebaseAuth mAuth=null;

    public static FirebaseAuth getInstance(){
        if(mAuth==null){
            mAuth=FirebaseAuth.getInstance();
        }

        return mAuth;
    }
}
