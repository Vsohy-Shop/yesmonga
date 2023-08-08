package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.core.p027os.C17800k;

/* renamed from: androidx.camera.core.impl.utils.i */
public final class C1565i {

    /* renamed from: a */
    public static volatile Handler f4468a;

    /* renamed from: a */
    public static Handler m6504a() {
        if (f4468a != null) {
            return f4468a;
        }
        synchronized (C1565i.class) {
            if (f4468a == null) {
                f4468a = C17800k.m81188a(Looper.getMainLooper());
            }
        }
        return f4468a;
    }
}
