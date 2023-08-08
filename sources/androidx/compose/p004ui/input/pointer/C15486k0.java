package androidx.compose.p004ui.input.pointer;

import kotlin.jvm.C11288f;

@C11288f
/* renamed from: androidx.compose.ui.input.pointer.k0 */
public final class C15486k0 {

    /* renamed from: a */
    public final int f38508a;

    public /* synthetic */ C15486k0(int i) {
        this.f38508a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C15486k0 m68633a(int i) {
        return new C15486k0(i);
    }

    /* renamed from: b */
    public static int m68634b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m68635c(int i, Object obj) {
        return (obj instanceof C15486k0) && i == ((C15486k0) obj).mo44082i();
    }

    /* renamed from: d */
    public static final boolean m68636d(int i, int i2) {
        return i == i2;
    }

    /* renamed from: e */
    public static final boolean m68637e(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: f */
    public static final boolean m68638f(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: g */
    public static int m68639g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m68640h(int i) {
        return "ProcessResult(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m68635c(this.f38508a, obj);
    }

    public int hashCode() {
        return m68639g(this.f38508a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo44082i() {
        return this.f38508a;
    }

    public String toString() {
        return m68640h(this.f38508a);
    }
}
