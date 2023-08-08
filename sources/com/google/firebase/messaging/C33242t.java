package com.google.firebase.messaging;

import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;

/* renamed from: com.google.firebase.messaging.t */
public final /* synthetic */ class C33242t implements FirebaseInstanceIdInternal.NewTokenListener {

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging f80831a;

    public /* synthetic */ C33242t(FirebaseMessaging firebaseMessaging) {
        this.f80831a = firebaseMessaging;
    }

    public final void onNewToken(String str) {
        this.f80831a.m133661K(str);
    }
}
