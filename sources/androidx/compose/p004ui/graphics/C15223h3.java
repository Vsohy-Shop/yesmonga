package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.h3 */
public final class C15223h3 {
    @C12579k

    /* renamed from: b */
    public static final C15224a f37530b = new C15224a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37531c = m65975d(0);

    /* renamed from: d */
    public static final int f37532d = m65975d(1);

    /* renamed from: a */
    public final int f37533a;

    /* renamed from: androidx.compose.ui.graphics.h3$a */
    public static final class C15224a {
        public /* synthetic */ C15224a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42779a() {
            return C15223h3.f37531c;
        }

        /* renamed from: b */
        public final int mo42780b() {
            return C15223h3.f37532d;
        }

        public C15224a() {
        }
    }

    public /* synthetic */ C15223h3(int i) {
        this.f37533a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C15223h3 m65974c(int i) {
        return new C15223h3(i);
    }

    /* renamed from: d */
    public static int m65975d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m65976e(int i, Object obj) {
        return (obj instanceof C15223h3) && i == ((C15223h3) obj).mo42777i();
    }

    /* renamed from: f */
    public static final boolean m65977f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m65978g(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: h */
    public static String m65979h(int i) {
        if (m65977f(i, f37531c)) {
            return "Fill";
        }
        if (m65977f(i, f37532d)) {
            return "Stroke";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m65976e(this.f37533a, obj);
    }

    public int hashCode() {
        return m65978g(this.f37533a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo42777i() {
        return this.f37533a;
    }

    @C12579k
    public String toString() {
        return m65979h(this.f37533a);
    }
}
