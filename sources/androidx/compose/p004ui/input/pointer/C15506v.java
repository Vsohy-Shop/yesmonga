package androidx.compose.p004ui.input.pointer;

import kotlin.jvm.C11288f;

@C11288f
/* renamed from: androidx.compose.ui.input.pointer.v */
public final class C15506v {

    /* renamed from: a */
    public final long f38568a;

    public /* synthetic */ C15506v(long j) {
        this.f38568a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C15506v m68786a(long j) {
        return new C15506v(j);
    }

    /* renamed from: b */
    public static long m68787b(long j) {
        return j;
    }

    /* renamed from: c */
    public static boolean m68788c(long j, Object obj) {
        return (obj instanceof C15506v) && j == ((C15506v) obj).mo44164h();
    }

    /* renamed from: d */
    public static final boolean m68789d(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static int m68790f(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: g */
    public static String m68791g(long j) {
        return "PointerId(value=" + j + ')';
    }

    /* renamed from: e */
    public final long mo44162e() {
        return this.f38568a;
    }

    public boolean equals(Object obj) {
        return m68788c(this.f38568a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ long mo44164h() {
        return this.f38568a;
    }

    public int hashCode() {
        return m68790f(this.f38568a);
    }

    public String toString() {
        return m68791g(this.f38568a);
    }
}
