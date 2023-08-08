package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14220bb;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.contentsquare.android.sdk.ab */
public final /* synthetic */ class C14183ab implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f35056a;

    public /* synthetic */ C14183ab(String str) {
        this.f35056a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return C14220bb.C14221a.m61049b(this.f35056a, runnable);
    }
}
