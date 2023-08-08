package androidx.compose.material3;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8251n0
@C8585m0
/* renamed from: androidx.compose.material3.h0 */
public final class C8208h0 {
    @C12579k

    /* renamed from: b */
    public static final C8209a f20150b = new C8209a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f20151c = m27130d(0);

    /* renamed from: d */
    public static final int f20152d = m27130d(1);

    /* renamed from: a */
    public final int f20153a;

    /* renamed from: androidx.compose.material3.h0$a */
    public static final class C8209a {
        public /* synthetic */ C8209a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo12626a() {
            return C8208h0.f20152d;
        }

        /* renamed from: b */
        public final int mo12627b() {
            return C8208h0.f20151c;
        }

        public C8209a() {
        }
    }

    public /* synthetic */ C8208h0(int i) {
        this.f20153a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C8208h0 m27129c(int i) {
        return new C8208h0(i);
    }

    /* renamed from: d */
    public static int m27130d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m27131e(int i, Object obj) {
        return (obj instanceof C8208h0) && i == ((C8208h0) obj).mo12624i();
    }

    /* renamed from: f */
    public static final boolean m27132f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m27133g(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: h */
    public static String m27134h(int i) {
        if (m27132f(i, f20151c)) {
            return "Picker";
        }
        if (m27132f(i, f20152d)) {
            return "Input";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m27131e(this.f20153a, obj);
    }

    public int hashCode() {
        return m27133g(this.f20153a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo12624i() {
        return this.f20153a;
    }

    @C12579k
    public String toString() {
        return m27134h(this.f20153a);
    }
}
