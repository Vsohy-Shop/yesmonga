package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.m4 */
public final class C15268m4 {
    @C12579k

    /* renamed from: b */
    public static final C15269a f37596b = new C15269a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37597c = m66275f(0);

    /* renamed from: d */
    public static final int f37598d = m66275f(1);

    /* renamed from: e */
    public static final int f37599e = m66275f(2);

    /* renamed from: f */
    public static final int f37600f = m66275f(3);

    /* renamed from: a */
    public final int f37601a;

    /* renamed from: androidx.compose.ui.graphics.m4$a */
    public static final class C15269a {
        public /* synthetic */ C15269a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42908a() {
            return C15268m4.f37597c;
        }

        /* renamed from: b */
        public final int mo42909b() {
            return C15268m4.f37600f;
        }

        /* renamed from: c */
        public final int mo42910c() {
            return C15268m4.f37599e;
        }

        /* renamed from: d */
        public final int mo42911d() {
            return C15268m4.f37598d;
        }

        public C15269a() {
        }
    }

    public /* synthetic */ C15268m4(int i) {
        this.f37601a = i;
    }

    /* renamed from: e */
    public static final /* synthetic */ C15268m4 m66274e(int i) {
        return new C15268m4(i);
    }

    /* renamed from: f */
    public static int m66275f(int i) {
        return i;
    }

    /* renamed from: g */
    public static boolean m66276g(int i, Object obj) {
        return (obj instanceof C15268m4) && i == ((C15268m4) obj).mo42906k();
    }

    /* renamed from: h */
    public static final boolean m66277h(int i, int i2) {
        return i == i2;
    }

    /* renamed from: i */
    public static int m66278i(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: j */
    public static String m66279j(int i) {
        if (m66277h(i, f37597c)) {
            return "Clamp";
        }
        if (m66277h(i, f37598d)) {
            return "Repeated";
        }
        if (m66277h(i, f37599e)) {
            return "Mirror";
        }
        if (m66277h(i, f37600f)) {
            return "Decal";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m66276g(this.f37601a, obj);
    }

    public int hashCode() {
        return m66278i(this.f37601a);
    }

    /* renamed from: k */
    public final /* synthetic */ int mo42906k() {
        return this.f37601a;
    }

    @C12579k
    public String toString() {
        return m66279j(this.f37601a);
    }
}
