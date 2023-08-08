package com.journeyapps.barcodescanner;

import android.os.Looper;

/* renamed from: com.journeyapps.barcodescanner.w */
public class C34961w {
    /* renamed from: a */
    public static void m142988a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
