package com.google.firebase.messaging;

import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.firebase.messaging.b0 */
public final /* synthetic */ class C33167b0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging f80507a;

    /* renamed from: b */
    public final /* synthetic */ C31049l f80508b;

    public /* synthetic */ C33167b0(FirebaseMessaging firebaseMessaging, C31049l lVar) {
        this.f80507a = firebaseMessaging;
        this.f80508b = lVar;
    }

    public final void run() {
        this.f80507a.m133660J(this.f80508b);
    }
}
