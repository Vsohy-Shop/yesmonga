package androidx.compose.material3;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.material3.l2 */
public final class C8241l2 {
    @C12579k

    /* renamed from: b */
    public static final C8242a f20286b = new C8242a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f20287c = m27282d(0);

    /* renamed from: d */
    public static final int f20288d = m27282d(1);

    /* renamed from: a */
    public final int f20289a;

    /* renamed from: androidx.compose.material3.l2$a */
    public static final class C8242a {
        public /* synthetic */ C8242a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo12784a() {
            return C8241l2.f20287c;
        }

        /* renamed from: b */
        public final int mo12785b() {
            return C8241l2.f20288d;
        }

        public C8242a() {
        }
    }

    public /* synthetic */ C8241l2(int i) {
        this.f20289a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C8241l2 m27281c(int i) {
        return new C8241l2(i);
    }

    /* renamed from: d */
    public static int m27282d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m27283e(int i, Object obj) {
        return (obj instanceof C8241l2) && i == ((C8241l2) obj).mo12782j();
    }

    /* renamed from: f */
    public static final boolean m27284f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m27285h(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: i */
    public static String m27286i(int i) {
        return "Selection(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m27283e(this.f20289a, obj);
    }

    /* renamed from: g */
    public final int mo12780g() {
        return this.f20289a;
    }

    public int hashCode() {
        return m27285h(this.f20289a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo12782j() {
        return this.f20289a;
    }

    public String toString() {
        return m27286i(this.f20289a);
    }
}
