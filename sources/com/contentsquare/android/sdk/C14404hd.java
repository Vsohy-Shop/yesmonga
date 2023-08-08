package com.contentsquare.android.sdk;

import android.app.Application;
import android.content.Context;

/* renamed from: com.contentsquare.android.sdk.hd */
public class C14404hd {

    /* renamed from: a */
    public final C14643q7 f35607a;

    public C14404hd(Application application) {
        this.f35607a = new C14643q7(application.getApplicationContext());
    }

    /* renamed from: b */
    public static boolean m62056b(Context context) {
        return new C14643q7(context).mo35999f("crash_handler", false);
    }

    /* renamed from: a */
    public void mo35505a(boolean z) {
        this.f35607a.mo36003k("crash_handler", z);
    }
}
