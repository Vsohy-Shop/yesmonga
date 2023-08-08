package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.C11288f;

@C11288f
/* renamed from: androidx.compose.foundation.lazy.grid.e */
public final class C2489e {

    /* renamed from: a */
    public final int f6591a;

    public /* synthetic */ C2489e(int i) {
        this.f6591a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C2489e m11165a(int i) {
        return new C2489e(i);
    }

    /* renamed from: b */
    public static final int m11166b(int i, int i2) {
        return i - i2;
    }

    /* renamed from: c */
    public static int m11167c(int i) {
        return i;
    }

    /* renamed from: d */
    public static final int m11168d(int i) {
        return m11167c(i - 1);
    }

    /* renamed from: e */
    public static boolean m11169e(int i, Object obj) {
        return (obj instanceof C2489e) && i == ((C2489e) obj).mo8568n();
    }

    /* renamed from: f */
    public static final boolean m11170f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m11171h(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: i */
    public static final int m11172i(int i) {
        return m11167c(i + 1);
    }

    /* renamed from: j */
    public static final int m11173j(int i, int i2) {
        return m11167c(i - i2);
    }

    /* renamed from: k */
    public static final int m11174k(int i, int i2) {
        return m11167c(i - i2);
    }

    /* renamed from: l */
    public static final int m11175l(int i, int i2) {
        return m11167c(i + i2);
    }

    /* renamed from: m */
    public static String m11176m(int i) {
        return "ItemIndex(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m11169e(this.f6591a, obj);
    }

    /* renamed from: g */
    public final int mo8566g() {
        return this.f6591a;
    }

    public int hashCode() {
        return m11171h(this.f6591a);
    }

    /* renamed from: n */
    public final /* synthetic */ int mo8568n() {
        return this.f6591a;
    }

    public String toString() {
        return m11176m(this.f6591a);
    }
}
