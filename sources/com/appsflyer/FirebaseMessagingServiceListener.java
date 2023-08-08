package com.appsflyer;

import com.appsflyer.internal.C21935bt;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    public void onNewToken(String str) {
        new C21935bt(getApplicationContext()).values(str);
    }
}
