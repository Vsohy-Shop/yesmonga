package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.C11288f;

@C11288f
/* renamed from: androidx.compose.foundation.lazy.grid.x */
public final class C2510x {

    /* renamed from: a */
    public final int f6676a;

    public /* synthetic */ C2510x(int i) {
        this.f6676a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C2510x m11276a(int i) {
        return new C2510x(i);
    }

    /* renamed from: b */
    public static final int m11277b(int i, int i2) {
        return i - i2;
    }

    /* renamed from: c */
    public static int m11278c(int i) {
        return i;
    }

    /* renamed from: d */
    public static final int m11279d(int i) {
        return m11278c(i - 1);
    }

    /* renamed from: e */
    public static boolean m11280e(int i, Object obj) {
        return (obj instanceof C2510x) && i == ((C2510x) obj).mo8641n();
    }

    /* renamed from: f */
    public static final boolean m11281f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m11282h(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: i */
    public static final int m11283i(int i) {
        return m11278c(i + 1);
    }

    /* renamed from: j */
    public static final int m11284j(int i, int i2) {
        return m11278c(i - i2);
    }

    /* renamed from: k */
    public static final int m11285k(int i, int i2) {
        return m11278c(i - i2);
    }

    /* renamed from: l */
    public static final int m11286l(int i, int i2) {
        return m11278c(i + i2);
    }

    /* renamed from: m */
    public static String m11287m(int i) {
        return "LineIndex(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m11280e(this.f6676a, obj);
    }

    /* renamed from: g */
    public final int mo8639g() {
        return this.f6676a;
    }

    public int hashCode() {
        return m11282h(this.f6676a);
    }

    /* renamed from: n */
    public final /* synthetic */ int mo8641n() {
        return this.f6676a;
    }

    public String toString() {
        return m11287m(this.f6676a);
    }
}
