package androidx.compose.material;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.material.k1 */
public final class C7875k1 {
    @C12579k

    /* renamed from: b */
    public static final C7876a f18863b = new C7876a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f18864c = m25041i(0);

    /* renamed from: d */
    public static final int f18865d = m25041i(1);

    /* renamed from: e */
    public static final int f18866e = m25041i(2);

    /* renamed from: f */
    public static final int f18867f = m25041i(3);

    /* renamed from: g */
    public static final int f18868g = m25041i(4);

    /* renamed from: h */
    public static final int f18869h = m25041i(5);

    /* renamed from: i */
    public static final int f18870i = m25041i(6);

    /* renamed from: a */
    public final int f18871a;

    /* renamed from: androidx.compose.material.k1$a */
    public static final class C7876a {
        public /* synthetic */ C7876a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo10861a() {
            return C7875k1.f18865d;
        }

        /* renamed from: b */
        public final int mo10862b() {
            return C7875k1.f18866e;
        }

        /* renamed from: c */
        public final int mo10863c() {
            return C7875k1.f18867f;
        }

        /* renamed from: d */
        public final int mo10864d() {
            return C7875k1.f18868g;
        }

        /* renamed from: e */
        public final int mo10865e() {
            return C7875k1.f18864c;
        }

        /* renamed from: f */
        public final int mo10866f() {
            return C7875k1.f18870i;
        }

        /* renamed from: g */
        public final int mo10867g() {
            return C7875k1.f18869h;
        }

        public C7876a() {
        }
    }

    public /* synthetic */ C7875k1(int i) {
        this.f18871a = i;
    }

    /* renamed from: h */
    public static final /* synthetic */ C7875k1 m25040h(int i) {
        return new C7875k1(i);
    }

    /* renamed from: i */
    public static int m25041i(int i) {
        return i;
    }

    /* renamed from: j */
    public static boolean m25042j(int i, Object obj) {
        return (obj instanceof C7875k1) && i == ((C7875k1) obj).mo10859n();
    }

    /* renamed from: k */
    public static final boolean m25043k(int i, int i2) {
        return i == i2;
    }

    /* renamed from: l */
    public static int m25044l(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: m */
    public static String m25045m(int i) {
        return "Strings(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m25042j(this.f18871a, obj);
    }

    public int hashCode() {
        return m25044l(this.f18871a);
    }

    /* renamed from: n */
    public final /* synthetic */ int mo10859n() {
        return this.f18871a;
    }

    public String toString() {
        return m25045m(this.f18871a);
    }
}
