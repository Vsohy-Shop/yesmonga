package com.contentsquare.android.sdk;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: com.contentsquare.android.sdk.wf */
public class C14842wf implements ComponentCallbacks {

    /* renamed from: a */
    public final C14352g0 f36820a;

    public C14842wf(C14352g0 g0Var) {
        this.f36820a = g0Var;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        this.f36820a.mo35300n();
    }
}
