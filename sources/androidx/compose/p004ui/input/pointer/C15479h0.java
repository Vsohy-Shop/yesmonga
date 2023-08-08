package androidx.compose.p004ui.input.pointer;

import kotlin.jvm.C11288f;

@C11288f
/* renamed from: androidx.compose.ui.input.pointer.h0 */
public final class C15479h0 {

    /* renamed from: a */
    public final int f38499a;

    public /* synthetic */ C15479h0(int i) {
        this.f38499a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C15479h0 m68604a(int i) {
        return new C15479h0(i);
    }

    /* renamed from: b */
    public static int m68605b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m68606c(int i, Object obj) {
        return (obj instanceof C15479h0) && i == ((C15479h0) obj).mo44065g();
    }

    /* renamed from: d */
    public static final boolean m68607d(int i, int i2) {
        return i == i2;
    }

    /* renamed from: e */
    public static int m68608e(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: f */
    public static String m68609f(int i) {
        return "PointerKeyboardModifiers(packedValue=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m68606c(this.f38499a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ int mo44065g() {
        return this.f38499a;
    }

    public int hashCode() {
        return m68608e(this.f38499a);
    }

    public String toString() {
        return m68609f(this.f38499a);
    }
}
