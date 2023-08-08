package com.urbanairship.push.fcm;

import androidx.annotation.C0359n0;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class AirshipFirebaseMessagingService extends FirebaseMessagingService {
    public void onMessageReceived(@C0359n0 RemoteMessage remoteMessage) {
        C9466a.m35574c(getApplicationContext(), remoteMessage);
    }

    public void onNewToken(@C0359n0 String str) {
        C9466a.m35576e(getApplicationContext(), str);
    }
}
