package androidx.compose.foundation.layout;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.foundation.layout.q1 */
public final class C2401q1 {
    @C12579k

    /* renamed from: b */
    public static final C2402a f6318b = new C2402a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f6319c;

    /* renamed from: d */
    public static final int f6320d;

    /* renamed from: e */
    public static final int f6321e;

    /* renamed from: f */
    public static final int f6322f;

    /* renamed from: g */
    public static final int f6323g;

    /* renamed from: h */
    public static final int f6324h;

    /* renamed from: i */
    public static final int f6325i;

    /* renamed from: j */
    public static final int f6326j;

    /* renamed from: k */
    public static final int f6327k;

    /* renamed from: l */
    public static final int f6328l;

    /* renamed from: m */
    public static final int f6329m;

    /* renamed from: n */
    public static final int f6330n;

    /* renamed from: a */
    public final int f6331a;

    /* renamed from: androidx.compose.foundation.layout.q1$a */
    public static final class C2402a {
        public /* synthetic */ C2402a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo8140a() {
            return C2401q1.f6319c;
        }

        /* renamed from: b */
        public final int mo8141b() {
            return C2401q1.f6321e;
        }

        /* renamed from: c */
        public final int mo8142c() {
            return C2401q1.f6320d;
        }

        /* renamed from: d */
        public final int mo8143d() {
            return C2401q1.f6322f;
        }

        /* renamed from: e */
        public final int mo8144e() {
            return C2401q1.f6326j;
        }

        /* renamed from: f */
        public final int mo8145f() {
            return C2401q1.f6324h;
        }

        /* renamed from: g */
        public final int mo8146g() {
            return C2401q1.f6329m;
        }

        /* renamed from: h */
        public final int mo8147h() {
            return C2401q1.f6327k;
        }

        /* renamed from: i */
        public final int mo8148i() {
            return C2401q1.f6328l;
        }

        /* renamed from: j */
        public final int mo8149j() {
            return C2401q1.f6323g;
        }

        /* renamed from: k */
        public final int mo8150k() {
            return C2401q1.f6325i;
        }

        /* renamed from: l */
        public final int mo8151l() {
            return C2401q1.f6330n;
        }

        public C2402a() {
        }
    }

    static {
        int n = m10550n(8);
        f6319c = n;
        int n2 = m10550n(4);
        f6320d = n2;
        int n3 = m10550n(2);
        f6321e = n3;
        int n4 = m10550n(1);
        f6322f = n4;
        f6323g = m10555s(n, n4);
        f6324h = m10555s(n2, n3);
        int n5 = m10550n(16);
        f6325i = n5;
        int n6 = m10550n(32);
        f6326j = n6;
        int s = m10555s(n, n3);
        f6327k = s;
        int s2 = m10555s(n2, n4);
        f6328l = s2;
        f6329m = m10555s(s, s2);
        f6330n = m10555s(n5, n6);
    }

    public /* synthetic */ C2401q1(int i) {
        this.f6331a = i;
    }

    /* renamed from: m */
    public static final /* synthetic */ C2401q1 m10549m(int i) {
        return new C2401q1(i);
    }

    /* renamed from: n */
    public static int m10550n(int i) {
        return i;
    }

    /* renamed from: o */
    public static boolean m10551o(int i, Object obj) {
        return (obj instanceof C2401q1) && i == ((C2401q1) obj).mo8139u();
    }

    /* renamed from: p */
    public static final boolean m10552p(int i, int i2) {
        return i == i2;
    }

    /* renamed from: q */
    public static final boolean m10553q(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: r */
    public static int m10554r(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: s */
    public static final int m10555s(int i, int i2) {
        return m10550n(i | i2);
    }

    @C12579k
    /* renamed from: t */
    public static String m10556t(int i) {
        return "WindowInsetsSides(" + m10557v(i) + ')';
    }

    /* renamed from: v */
    public static final String m10557v(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = f6323g;
        if ((i & i2) == i2) {
            m10558w(sb, "Start");
        }
        int i3 = f6327k;
        if ((i & i3) == i3) {
            m10558w(sb, "Left");
        }
        int i4 = f6325i;
        if ((i & i4) == i4) {
            m10558w(sb, "Top");
        }
        int i5 = f6324h;
        if ((i & i5) == i5) {
            m10558w(sb, "End");
        }
        int i6 = f6328l;
        if ((i & i6) == i6) {
            m10558w(sb, "Right");
        }
        int i7 = f6326j;
        if ((i & i7) == i7) {
            m10558w(sb, "Bottom");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: w */
    public static final void m10558w(StringBuilder sb, String str) {
        boolean z;
        if (sb.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append('+');
        }
        sb.append(str);
    }

    public boolean equals(Object obj) {
        return m10551o(this.f6331a, obj);
    }

    public int hashCode() {
        return m10554r(this.f6331a);
    }

    @C12579k
    public String toString() {
        return m10556t(this.f6331a);
    }

    /* renamed from: u */
    public final /* synthetic */ int mo8139u() {
        return this.f6331a;
    }
}
