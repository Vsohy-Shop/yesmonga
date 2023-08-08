package androidx.compose.p004ui.input.pointer;

import kotlin.jvm.C11288f;

@C11288f
/* renamed from: androidx.compose.ui.input.pointer.n */
public final class C15490n {

    /* renamed from: a */
    public final int f38520a;

    public /* synthetic */ C15490n(int i) {
        this.f38520a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C15490n m68664a(int i) {
        return new C15490n(i);
    }

    /* renamed from: b */
    public static int m68665b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m68666c(int i, Object obj) {
        return (obj instanceof C15490n) && i == ((C15490n) obj).mo44103g();
    }

    /* renamed from: d */
    public static final boolean m68667d(int i, int i2) {
        return i == i2;
    }

    /* renamed from: e */
    public static int m68668e(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: f */
    public static String m68669f(int i) {
        return "PointerButtons(packedValue=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m68666c(this.f38520a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ int mo44103g() {
        return this.f38520a;
    }

    public int hashCode() {
        return m68668e(this.f38520a);
    }

    public String toString() {
        return m68669f(this.f38520a);
    }
}
