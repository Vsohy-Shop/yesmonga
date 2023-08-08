package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.C41091f;

/* renamed from: com.google.android.gms.cloudmessaging.f */
public final class C40446f extends C41091f {

    /* renamed from: a */
    public final /* synthetic */ C40444d f103073a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40446f(C40444d dVar, Looper looper) {
        super(looper);
        this.f103073a = dVar;
    }

    public final void handleMessage(Message message) {
        C40444d.m164604d(this.f103073a, message);
    }
}
