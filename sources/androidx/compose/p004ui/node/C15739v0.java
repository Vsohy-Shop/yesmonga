package androidx.compose.p004ui.node;

import kotlin.jvm.C11288f;

@C11288f
/* renamed from: androidx.compose.ui.node.v0 */
public final class C15739v0<T> {

    /* renamed from: a */
    public final int f39084a;

    public /* synthetic */ C15739v0(int i) {
        this.f39084a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C15739v0 m70596a(int i) {
        return new C15739v0(i);
    }

    /* renamed from: b */
    public static <T> int m70597b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m70598c(int i, Object obj) {
        return (obj instanceof C15739v0) && i == ((C15739v0) obj).mo45265j();
    }

    /* renamed from: d */
    public static final boolean m70599d(int i, int i2) {
        return i == i2;
    }

    /* renamed from: f */
    public static int m70600f(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: g */
    public static final int m70601g(int i, int i2) {
        return i | i2;
    }

    /* renamed from: h */
    public static final int m70602h(int i, int i2) {
        return i | i2;
    }

    /* renamed from: i */
    public static String m70603i(int i) {
        return "NodeKind(mask=" + i + ')';
    }

    /* renamed from: e */
    public final int mo45262e() {
        return this.f39084a;
    }

    public boolean equals(Object obj) {
        return m70598c(this.f39084a, obj);
    }

    public int hashCode() {
        return m70600f(this.f39084a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo45265j() {
        return this.f39084a;
    }

    public String toString() {
        return m70603i(this.f39084a);
    }
}
