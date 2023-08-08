package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.C31049l;

/* renamed from: com.google.firebase.messaging.h */
public final /* synthetic */ class C33194h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C33200j f80702a;

    /* renamed from: b */
    public final /* synthetic */ Intent f80703b;

    /* renamed from: c */
    public final /* synthetic */ C31049l f80704c;

    public /* synthetic */ C33194h(C33200j jVar, Intent intent, C31049l lVar) {
        this.f80702a = jVar;
        this.f80703b = intent;
        this.f80704c = lVar;
    }

    public final void run() {
        this.f80702a.m133908e(this.f80703b, this.f80704c);
    }
}
