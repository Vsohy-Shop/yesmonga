package com.urbanairship.webkit;

/* renamed from: com.urbanairship.webkit.d */
public final /* synthetic */ class C9708d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AirshipWebView f26609a;

    /* renamed from: b */
    public final /* synthetic */ String f26610b;

    /* renamed from: c */
    public final /* synthetic */ String f26611c;

    /* renamed from: d */
    public final /* synthetic */ String f26612d;

    public /* synthetic */ C9708d(AirshipWebView airshipWebView, String str, String str2, String str3) {
        this.f26609a = airshipWebView;
        this.f26610b = str;
        this.f26611c = str2;
        this.f26612d = str3;
    }

    public final void run() {
        this.f26609a.m36337m(this.f26610b, this.f26611c, this.f26612d);
    }
}
