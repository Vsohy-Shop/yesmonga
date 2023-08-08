package com.google.android.gms.cloudmessaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.cloudmessaging.i */
public final /* synthetic */ class C40449i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40434a f103074a;

    /* renamed from: b */
    public final /* synthetic */ Intent f103075b;

    /* renamed from: c */
    public final /* synthetic */ Context f103076c;

    /* renamed from: d */
    public final /* synthetic */ boolean f103077d;

    /* renamed from: e */
    public final /* synthetic */ BroadcastReceiver.PendingResult f103078e;

    public /* synthetic */ C40449i(C40434a aVar, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f103074a = aVar;
        this.f103075b = intent;
        this.f103076c = context;
        this.f103077d = z;
        this.f103078e = pendingResult;
    }

    public final void run() {
        this.f103074a.zza(this.f103075b, this.f103076c, this.f103077d, this.f103078e);
    }
}
