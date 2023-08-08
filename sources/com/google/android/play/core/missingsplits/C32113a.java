package com.google.android.play.core.missingsplits;

import android.app.Application;

@Deprecated
/* renamed from: com.google.android.play.core.missingsplits.a */
public class C32113a extends Application {

    /* renamed from: a */
    public boolean f78329a = false;

    @Deprecated
    /* renamed from: a */
    public void mo92859a() {
    }

    public final void onCreate() {
        if (!this.f78329a) {
            this.f78329a = true;
            if (!C32115c.m130020a(this).mo92861a()) {
                super.onCreate();
                mo92859a();
                return;
            }
            return;
        }
        throw new IllegalStateException("The onCreate method must be invoked at most once.");
    }
}
