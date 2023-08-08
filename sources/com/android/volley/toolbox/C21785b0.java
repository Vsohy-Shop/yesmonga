package com.android.volley.toolbox;

import android.os.Looper;

/* renamed from: com.android.volley.toolbox.b0 */
public final class C21785b0 {
    /* renamed from: a */
    public static void m100130a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
    }
}
