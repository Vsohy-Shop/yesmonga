package com.urbanairship.webkit;

import android.webkit.ValueCallback;

/* renamed from: com.urbanairship.webkit.f */
public final /* synthetic */ class C9710f implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ AirshipWebView f26616a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f26617b;

    public /* synthetic */ C9710f(AirshipWebView airshipWebView, Runnable runnable) {
        this.f26616a = airshipWebView;
        this.f26617b = runnable;
    }

    public final void onReceiveValue(Object obj) {
        this.f26616a.m36341q(this.f26617b, (Boolean) obj);
    }
}
