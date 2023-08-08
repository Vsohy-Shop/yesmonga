package androidx.compose.foundation.lazy;

import kotlin.jvm.C11288f;

@C11288f
/* renamed from: androidx.compose.foundation.lazy.b */
public final class C2452b {

    /* renamed from: a */
    public final int f6457a;

    public /* synthetic */ C2452b(int i) {
        this.f6457a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C2452b m10904a(int i) {
        return new C2452b(i);
    }

    /* renamed from: b */
    public static final int m10905b(int i, int i2) {
        return i - i2;
    }

    /* renamed from: c */
    public static int m10906c(int i) {
        return i;
    }

    /* renamed from: d */
    public static final int m10907d(int i) {
        return m10906c(i - 1);
    }

    /* renamed from: e */
    public static boolean m10908e(int i, Object obj) {
        return (obj instanceof C2452b) && i == ((C2452b) obj).mo8368n();
    }

    /* renamed from: f */
    public static final boolean m10909f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m10910h(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: i */
    public static final int m10911i(int i) {
        return m10906c(i + 1);
    }

    /* renamed from: j */
    public static final int m10912j(int i, int i2) {
        return m10906c(i - i2);
    }

    /* renamed from: k */
    public static final int m10913k(int i, int i2) {
        return m10906c(i - i2);
    }

    /* renamed from: l */
    public static final int m10914l(int i, int i2) {
        return m10906c(i + i2);
    }

    /* renamed from: m */
    public static String m10915m(int i) {
        return "DataIndex(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m10908e(this.f6457a, obj);
    }

    /* renamed from: g */
    public final int mo8366g() {
        return this.f6457a;
    }

    public int hashCode() {
        return m10910h(this.f6457a);
    }

    /* renamed from: n */
    public final /* synthetic */ int mo8368n() {
        return this.f6457a;
    }

    public String toString() {
        return m10915m(this.f6457a);
    }
}
