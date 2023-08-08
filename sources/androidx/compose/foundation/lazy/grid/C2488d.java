package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.C2855v;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;

@C11288f
@C8585m0
/* renamed from: androidx.compose.foundation.lazy.grid.d */
public final class C2488d {

    /* renamed from: a */
    public final long f6590a;

    public /* synthetic */ C2488d(long j) {
        this.f6590a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C2488d m11156a(long j) {
        return new C2488d(j);
    }

    /* renamed from: b */
    public static long m11157b(long j) {
        return j;
    }

    /* renamed from: c */
    public static boolean m11158c(long j, Object obj) {
        return (obj instanceof C2488d) && j == ((C2488d) obj).mo8563i();
    }

    /* renamed from: d */
    public static final boolean m11159d(long j, long j2) {
        return j == j2;
    }

    @C2855v
    /* renamed from: e */
    public static /* synthetic */ void m11160e() {
    }

    /* renamed from: f */
    public static final int m11161f(long j) {
        return (int) j;
    }

    /* renamed from: g */
    public static int m11162g(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: h */
    public static String m11163h(long j) {
        return "GridItemSpan(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m11158c(this.f6590a, obj);
    }

    public int hashCode() {
        return m11162g(this.f6590a);
    }

    /* renamed from: i */
    public final /* synthetic */ long mo8563i() {
        return this.f6590a;
    }

    public String toString() {
        return m11163h(this.f6590a);
    }
}
