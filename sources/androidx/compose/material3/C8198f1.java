package androidx.compose.material3;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.material3.f1 */
public final class C8198f1 implements Comparable<C8198f1> {
    @C12579k

    /* renamed from: b */
    public static final C8199a f20129b = new C8199a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f20130c = m27090M(1);

    /* renamed from: d */
    public static final int f20131d = m27090M(2);

    /* renamed from: e */
    public static final int f20132e = m27090M(3);

    /* renamed from: a */
    public final int f20133a;

    /* renamed from: androidx.compose.material3.f1$a */
    public static final class C8199a {
        public /* synthetic */ C8199a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo12596a(boolean z, boolean z2) {
            if (z && z2) {
                return mo12598c();
            }
            if (z || z2) {
                return mo12599d();
            }
            return mo12597b();
        }

        /* renamed from: b */
        public final int mo12597b() {
            return C8198f1.f20130c;
        }

        /* renamed from: c */
        public final int mo12598c() {
            return C8198f1.f20132e;
        }

        /* renamed from: d */
        public final int mo12599d() {
            return C8198f1.f20131d;
        }

        public C8199a() {
        }
    }

    public /* synthetic */ C8198f1(int i) {
        this.f20133a = i;
    }

    /* renamed from: M */
    public static int m27090M(int i) {
        return i;
    }

    /* renamed from: Q */
    public static boolean m27091Q(int i, Object obj) {
        return (obj instanceof C8198f1) && i == ((C8198f1) obj).mo12591e0();
    }

    /* renamed from: W */
    public static final boolean m27092W(int i, int i2) {
        return i == i2;
    }

    /* renamed from: X */
    public static int m27093X(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: Z */
    public static String m27094Z(int i) {
        return "ListItemType(lines=" + i + ')';
    }

    /* renamed from: w */
    public static final /* synthetic */ C8198f1 m27098w(int i) {
        return new C8198f1(i);
    }

    /* renamed from: z */
    public static int m27099z(int i, int i2) {
        return Intrinsics.compare(i, i2);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return mo12595y(((C8198f1) obj).mo12591e0());
    }

    /* renamed from: e0 */
    public final /* synthetic */ int mo12591e0() {
        return this.f20133a;
    }

    public boolean equals(Object obj) {
        return m27091Q(this.f20133a, obj);
    }

    public int hashCode() {
        return m27093X(this.f20133a);
    }

    public String toString() {
        return m27094Z(this.f20133a);
    }

    /* renamed from: y */
    public int mo12595y(int i) {
        return m27099z(this.f20133a, i);
    }
}
