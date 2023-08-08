package com.google.firebase.messaging;

import com.google.android.gms.tasks.C31047k;
import com.google.firebase.messaging.C33251v0;
import com.google.firebase.messaging.C33260z0;

/* renamed from: com.google.firebase.messaging.y */
public final /* synthetic */ class C33257y implements C33251v0.C33252a {

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging f80862a;

    /* renamed from: b */
    public final /* synthetic */ String f80863b;

    /* renamed from: c */
    public final /* synthetic */ C33260z0.C33261a f80864c;

    public /* synthetic */ C33257y(FirebaseMessaging firebaseMessaging, String str, C33260z0.C33261a aVar) {
        this.f80862a = firebaseMessaging;
        this.f80863b = str;
        this.f80864c = aVar;
    }

    public final C31047k start() {
        return this.f80862a.m133656F(this.f80863b, this.f80864c);
    }
}
