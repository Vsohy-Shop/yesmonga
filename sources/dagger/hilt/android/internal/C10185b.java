package dagger.hilt.android.internal;

import android.os.Looper;

/* renamed from: dagger.hilt.android.internal.b */
public final class C10185b {

    /* renamed from: a */
    public static Thread f27911a;

    /* renamed from: a */
    public static void m38403a() {
        if (!m38404b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* renamed from: b */
    public static boolean m38404b() {
        if (f27911a == null) {
            f27911a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == f27911a) {
            return true;
        }
        return false;
    }
}
