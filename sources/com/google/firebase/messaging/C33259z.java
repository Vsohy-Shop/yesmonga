package com.google.firebase.messaging;

import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.firebase.messaging.z */
public final /* synthetic */ class C33259z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging f80871a;

    /* renamed from: b */
    public final /* synthetic */ C31049l f80872b;

    public /* synthetic */ C33259z(FirebaseMessaging firebaseMessaging, C31049l lVar) {
        this.f80871a = firebaseMessaging;
        this.f80872b = lVar;
    }

    public final void run() {
        this.f80871a.m133658H(this.f80872b);
    }
}
