package androidx.compose.animation.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C11288f
/* renamed from: androidx.compose.animation.core.w0 */
public final class C2016w0 {

    /* renamed from: a */
    public final long f5638a;

    public /* synthetic */ C2016w0(long j) {
        this.f5638a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C2016w0 m8643a(long j) {
        return new C2016w0(j);
    }

    /* renamed from: b */
    public static long m8644b(int i, int i2) {
        return m8645c((long) (i * i2));
    }

    /* renamed from: c */
    public static long m8645c(long j) {
        return j;
    }

    /* renamed from: d */
    public static /* synthetic */ long m8646d(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            i2 = C2018x0.f5639b.mo7005a();
        }
        return m8644b(i, i2);
    }

    /* renamed from: e */
    public static boolean m8647e(long j, Object obj) {
        return (obj instanceof C2016w0) && j == ((C2016w0) obj).mo6999k();
    }

    /* renamed from: f */
    public static final boolean m8648f(long j, long j2) {
        return j == j2;
    }

    /* renamed from: g */
    public static final int m8649g(long j) {
        return Math.abs((int) j);
    }

    /* renamed from: h */
    public static final int m8650h(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C2018x0.f5639b.mo7006b();
        }
        if (!z) {
            return C2018x0.f5639b.mo7005a();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: i */
    public static int m8651i(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: j */
    public static String m8652j(long j) {
        return "StartOffset(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m8647e(this.f5638a, obj);
    }

    public int hashCode() {
        return m8651i(this.f5638a);
    }

    /* renamed from: k */
    public final /* synthetic */ long mo6999k() {
        return this.f5638a;
    }

    public String toString() {
        return m8652j(this.f5638a);
    }
}
