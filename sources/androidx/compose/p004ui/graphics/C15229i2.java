package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.i2 */
public final class C15229i2 {
    @C12579k

    /* renamed from: b */
    public static final C15230a f37536b = new C15230a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37537c = m65996d(0);

    /* renamed from: d */
    public static final int f37538d = m65996d(1);

    /* renamed from: a */
    public final int f37539a;

    /* renamed from: androidx.compose.ui.graphics.i2$a */
    public static final class C15230a {
        public /* synthetic */ C15230a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42797a() {
            return C15229i2.f37537c;
        }

        /* renamed from: b */
        public final int mo42798b() {
            return C15229i2.f37538d;
        }

        public C15230a() {
        }
    }

    public /* synthetic */ C15229i2(int i) {
        this.f37539a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C15229i2 m65995c(int i) {
        return new C15229i2(i);
    }

    /* renamed from: d */
    public static int m65996d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m65997e(int i, Object obj) {
        return (obj instanceof C15229i2) && i == ((C15229i2) obj).mo42795i();
    }

    /* renamed from: f */
    public static final boolean m65998f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m65999g(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: h */
    public static String m66000h(int i) {
        if (m65998f(i, f37537c)) {
            return "Difference";
        }
        if (m65998f(i, f37538d)) {
            return "Intersect";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m65997e(this.f37539a, obj);
    }

    public int hashCode() {
        return m65999g(this.f37539a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo42795i() {
        return this.f37539a;
    }

    @C12579k
    public String toString() {
        return m66000h(this.f37539a);
    }
}
