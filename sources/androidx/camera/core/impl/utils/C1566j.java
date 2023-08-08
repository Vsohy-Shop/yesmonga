package androidx.camera.core.impl.utils;

import android.os.Looper;
import androidx.core.util.C18001r;

/* renamed from: androidx.camera.core.impl.utils.j */
public final class C1566j {
    /* renamed from: a */
    public static void m6505a() {
        C18001r.m81778o(m6507c(), "In application's main thread");
    }

    /* renamed from: b */
    public static void m6506b() {
        C18001r.m81778o(m6508d(), "Not in application's main thread");
    }

    /* renamed from: c */
    public static boolean m6507c() {
        return !m6508d();
    }

    /* renamed from: d */
    public static boolean m6508d() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
