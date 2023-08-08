package androidx.tracing;

import android.os.Trace;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(18)
/* renamed from: androidx.tracing.c */
public final class C20531c {
    /* renamed from: a */
    public static void m95661a(@C0359n0 String str) {
        Trace.beginSection(str);
    }

    /* renamed from: b */
    public static void m95662b() {
        Trace.endSection();
    }
}
