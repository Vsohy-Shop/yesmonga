package com.google.firebase.messaging;

import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.firebase.messaging.a0 */
public final /* synthetic */ class C33163a0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging f80496a;

    /* renamed from: b */
    public final /* synthetic */ C31049l f80497b;

    public /* synthetic */ C33163a0(FirebaseMessaging firebaseMessaging, C31049l lVar) {
        this.f80496a = firebaseMessaging;
        this.f80497b = lVar;
    }

    public final void run() {
        this.f80496a.m133659I(this.f80497b);
    }
}
