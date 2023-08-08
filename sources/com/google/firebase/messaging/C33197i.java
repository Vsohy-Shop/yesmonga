package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.C31035e;
import com.google.android.gms.tasks.C31047k;

/* renamed from: com.google.firebase.messaging.i */
public final /* synthetic */ class C33197i implements C31035e {

    /* renamed from: a */
    public final /* synthetic */ C33200j f80713a;

    /* renamed from: b */
    public final /* synthetic */ Intent f80714b;

    public /* synthetic */ C33197i(C33200j jVar, Intent intent) {
        this.f80713a = jVar;
        this.f80714b = intent;
    }

    public final void onComplete(C31047k kVar) {
        this.f80713a.m133907d(this.f80714b, kVar);
    }
}
