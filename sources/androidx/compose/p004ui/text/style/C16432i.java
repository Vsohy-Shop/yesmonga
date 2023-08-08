package androidx.compose.p004ui.text.style;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.text.style.i */
public final class C16432i {
    @C12579k

    /* renamed from: b */
    public static final C16433a f40718b = new C16433a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40719c = m74173h(1);

    /* renamed from: d */
    public static final int f40720d = m74173h(2);

    /* renamed from: e */
    public static final int f40721e = m74173h(3);

    /* renamed from: f */
    public static final int f40722f = m74173h(4);

    /* renamed from: g */
    public static final int f40723g = m74173h(5);

    /* renamed from: h */
    public static final int f40724h = m74173h(6);

    /* renamed from: a */
    public final int f40725a;

    /* renamed from: androidx.compose.ui.text.style.i$a */
    public static final class C16433a {
        public /* synthetic */ C16433a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo47667a() {
            return C16432i.f40721e;
        }

        /* renamed from: b */
        public final int mo47668b() {
            return C16432i.f40724h;
        }

        /* renamed from: c */
        public final int mo47669c() {
            return C16432i.f40722f;
        }

        /* renamed from: d */
        public final int mo47670d() {
            return C16432i.f40719c;
        }

        /* renamed from: e */
        public final int mo47671e() {
            return C16432i.f40720d;
        }

        /* renamed from: f */
        public final int mo47672f() {
            return C16432i.f40723g;
        }

        @C12579k
        /* renamed from: g */
        public final List<C16432i> mo47673g() {
            return CollectionsKt__CollectionsKt.m40448L(C16432i.m74172g(mo47670d()), C16432i.m74172g(mo47671e()), C16432i.m74172g(mo47667a()), C16432i.m74172g(mo47669c()), C16432i.m74172g(mo47672f()), C16432i.m74172g(mo47668b()));
        }

        public C16433a() {
        }
    }

    public /* synthetic */ C16432i(int i) {
        this.f40725a = i;
    }

    /* renamed from: g */
    public static final /* synthetic */ C16432i m74172g(int i) {
        return new C16432i(i);
    }

    /* renamed from: h */
    public static int m74173h(int i) {
        return i;
    }

    /* renamed from: i */
    public static boolean m74174i(int i, Object obj) {
        return (obj instanceof C16432i) && i == ((C16432i) obj).mo47665m();
    }

    /* renamed from: j */
    public static final boolean m74175j(int i, int i2) {
        return i == i2;
    }

    /* renamed from: k */
    public static int m74176k(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: l */
    public static String m74177l(int i) {
        if (m74175j(i, f40719c)) {
            return "Left";
        }
        if (m74175j(i, f40720d)) {
            return "Right";
        }
        if (m74175j(i, f40721e)) {
            return "Center";
        }
        if (m74175j(i, f40722f)) {
            return "Justify";
        }
        if (m74175j(i, f40723g)) {
            return "Start";
        }
        if (m74175j(i, f40724h)) {
            return "End";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m74174i(this.f40725a, obj);
    }

    public int hashCode() {
        return m74176k(this.f40725a);
    }

    /* renamed from: m */
    public final /* synthetic */ int mo47665m() {
        return this.f40725a;
    }

    @C12579k
    public String toString() {
        return m74177l(this.f40725a);
    }
}
