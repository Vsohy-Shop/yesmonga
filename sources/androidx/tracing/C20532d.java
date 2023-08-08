package androidx.tracing;

import android.os.Trace;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(29)
/* renamed from: androidx.tracing.d */
public final class C20532d {
    /* renamed from: a */
    public static void m95663a(@C0359n0 String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    /* renamed from: b */
    public static void m95664b(@C0359n0 String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    /* renamed from: c */
    public static void m95665c(@C0359n0 String str, int i) {
        Trace.setCounter(str, (long) i);
    }
}
