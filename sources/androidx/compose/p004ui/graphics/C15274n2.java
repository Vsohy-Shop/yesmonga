package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.n2 */
public final class C15274n2 {
    @C12579k

    /* renamed from: b */
    public static final C15275a f37602b = new C15275a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37603c = m66316e(0);

    /* renamed from: d */
    public static final int f37604d = m66316e(1);

    /* renamed from: e */
    public static final int f37605e = m66316e(2);

    /* renamed from: a */
    public final int f37606a;

    /* renamed from: androidx.compose.ui.graphics.n2$a */
    public static final class C15275a {
        public /* synthetic */ C15275a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42916a() {
            return C15274n2.f37603c;
        }

        /* renamed from: b */
        public final int mo42917b() {
            return C15274n2.f37605e;
        }

        /* renamed from: c */
        public final int mo42918c() {
            return C15274n2.f37604d;
        }

        public C15275a() {
        }
    }

    public /* synthetic */ C15274n2(int i) {
        this.f37606a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C15274n2 m66315d(int i) {
        return new C15274n2(i);
    }

    /* renamed from: e */
    public static int m66316e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m66317f(int i, Object obj) {
        return (obj instanceof C15274n2) && i == ((C15274n2) obj).mo42914j();
    }

    /* renamed from: g */
    public static final boolean m66318g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m66319h(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: i */
    public static String m66320i(int i) {
        return "CompositingStrategy(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m66317f(this.f37606a, obj);
    }

    public int hashCode() {
        return m66319h(this.f37606a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo42914j() {
        return this.f37606a;
    }

    public String toString() {
        return m66320i(this.f37606a);
    }
}
