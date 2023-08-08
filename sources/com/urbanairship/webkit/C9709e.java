package com.urbanairship.webkit;

import java.util.Map;

/* renamed from: com.urbanairship.webkit.e */
public final /* synthetic */ class C9709e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AirshipWebView f26613a;

    /* renamed from: b */
    public final /* synthetic */ String f26614b;

    /* renamed from: c */
    public final /* synthetic */ Map f26615c;

    public /* synthetic */ C9709e(AirshipWebView airshipWebView, String str, Map map) {
        this.f26613a = airshipWebView;
        this.f26614b = str;
        this.f26615c = map;
    }

    public final void run() {
        this.f26613a.m36340p(this.f26614b, this.f26615c);
    }
}
