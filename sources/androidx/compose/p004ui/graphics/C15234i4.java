package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.i4 */
public final class C15234i4 {
    @C12579k

    /* renamed from: b */
    public static final C15235a f37542b = new C15235a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37543c = m66034e(0);

    /* renamed from: d */
    public static final int f37544d = m66034e(1);

    /* renamed from: e */
    public static final int f37545e = m66034e(2);

    /* renamed from: a */
    public final int f37546a;

    /* renamed from: androidx.compose.ui.graphics.i4$a */
    public static final class C15235a {
        public /* synthetic */ C15235a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42829a() {
            return C15234i4.f37545e;
        }

        /* renamed from: b */
        public final int mo42830b() {
            return C15234i4.f37544d;
        }

        /* renamed from: c */
        public final int mo42831c() {
            return C15234i4.f37543c;
        }

        public C15235a() {
        }
    }

    public /* synthetic */ C15234i4(int i) {
        this.f37546a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C15234i4 m66033d(int i) {
        return new C15234i4(i);
    }

    /* renamed from: e */
    public static int m66034e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m66035f(int i, Object obj) {
        return (obj instanceof C15234i4) && i == ((C15234i4) obj).mo42827j();
    }

    /* renamed from: g */
    public static final boolean m66036g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m66037h(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: i */
    public static String m66038i(int i) {
        if (m66036g(i, f37543c)) {
            return "Translate";
        }
        if (m66036g(i, f37544d)) {
            return "Rotate";
        }
        if (m66036g(i, f37545e)) {
            return "Morph";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m66035f(this.f37546a, obj);
    }

    public int hashCode() {
        return m66037h(this.f37546a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo42827j() {
        return this.f37546a;
    }

    @C12579k
    public String toString() {
        return m66038i(this.f37546a);
    }
}
