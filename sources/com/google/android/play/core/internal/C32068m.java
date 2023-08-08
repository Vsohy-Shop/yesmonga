package com.google.android.play.core.internal;

import android.os.IBinder;

/* renamed from: com.google.android.play.core.internal.m */
public final /* synthetic */ class C32068m implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final C32092u f78278a;

    public C32068m(C32092u uVar) {
        this.f78278a = uVar;
    }

    public final void binderDied() {
        this.f78278a.mo92832n();
    }
}
