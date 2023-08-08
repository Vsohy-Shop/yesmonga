package com.bumptech.glide.manager;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(26)
/* renamed from: com.bumptech.glide.manager.i */
public final class C22512i implements C22514k, ComponentCallbacks2 {
    /* renamed from: a */
    public void mo66579a(Activity activity) {
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
    }

    public void onLowMemory() {
        onTrimMemory(20);
    }

    public void onTrimMemory(int i) {
    }
}
