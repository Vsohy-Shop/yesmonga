package androidx.compose.material3;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8251n0
@C8585m0
/* renamed from: androidx.compose.material3.j3 */
public final class C8230j3 {
    @C12579k

    /* renamed from: b */
    public static final C8231a f20250b = new C8231a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f20251c = m27217d(0);

    /* renamed from: d */
    public static final int f20252d = m27217d(1);

    /* renamed from: a */
    public final int f20253a;

    /* renamed from: androidx.compose.material3.j3$a */
    public static final class C8231a {
        public /* synthetic */ C8231a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo12727a() {
            return C8230j3.f20251c;
        }

        /* renamed from: b */
        public final int mo12728b() {
            return C8230j3.f20252d;
        }

        public C8231a() {
        }
    }

    public /* synthetic */ C8230j3(int i) {
        this.f20253a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C8230j3 m27216c(int i) {
        return new C8230j3(i);
    }

    /* renamed from: d */
    public static int m27217d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m27218e(int i, Object obj) {
        return (obj instanceof C8230j3) && i == ((C8230j3) obj).mo12725i();
    }

    /* renamed from: f */
    public static final boolean m27219f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m27220g(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: h */
    public static String m27221h(int i) {
        if (m27219f(i, f20251c)) {
            return "Horizontal";
        }
        if (m27219f(i, f20252d)) {
            return "Vertical";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m27218e(this.f20253a, obj);
    }

    public int hashCode() {
        return m27220g(this.f20253a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo12725i() {
        return this.f20253a;
    }

    @C12579k
    public String toString() {
        return m27221h(this.f20253a);
    }
}
