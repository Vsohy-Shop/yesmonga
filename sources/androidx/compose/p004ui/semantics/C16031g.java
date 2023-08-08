package androidx.compose.p004ui.semantics;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.semantics.g */
public final class C16031g {
    @C12579k

    /* renamed from: b */
    public static final C16032a f39793b = new C16032a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f39794c = m72094i(0);

    /* renamed from: d */
    public static final int f39795d = m72094i(1);

    /* renamed from: e */
    public static final int f39796e = m72094i(2);

    /* renamed from: f */
    public static final int f39797f = m72094i(3);

    /* renamed from: g */
    public static final int f39798g = m72094i(4);

    /* renamed from: h */
    public static final int f39799h = m72094i(5);

    /* renamed from: i */
    public static final int f39800i = m72094i(6);

    /* renamed from: a */
    public final int f39801a;

    /* renamed from: androidx.compose.ui.semantics.g$a */
    public static final class C16032a {
        public /* synthetic */ C16032a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo46121a() {
            return C16031g.f39794c;
        }

        /* renamed from: b */
        public final int mo46122b() {
            return C16031g.f39795d;
        }

        /* renamed from: c */
        public final int mo46123c() {
            return C16031g.f39800i;
        }

        /* renamed from: d */
        public final int mo46124d() {
            return C16031g.f39799h;
        }

        /* renamed from: e */
        public final int mo46125e() {
            return C16031g.f39797f;
        }

        /* renamed from: f */
        public final int mo46126f() {
            return C16031g.f39796e;
        }

        /* renamed from: g */
        public final int mo46127g() {
            return C16031g.f39798g;
        }

        public C16032a() {
        }
    }

    public /* synthetic */ C16031g(int i) {
        this.f39801a = i;
    }

    /* renamed from: h */
    public static final /* synthetic */ C16031g m72093h(int i) {
        return new C16031g(i);
    }

    /* renamed from: i */
    public static int m72094i(int i) {
        return i;
    }

    /* renamed from: j */
    public static boolean m72095j(int i, Object obj) {
        return (obj instanceof C16031g) && i == ((C16031g) obj).mo46119n();
    }

    /* renamed from: k */
    public static final boolean m72096k(int i, int i2) {
        return i == i2;
    }

    /* renamed from: l */
    public static int m72097l(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: m */
    public static String m72098m(int i) {
        if (m72096k(i, f39794c)) {
            return "Button";
        }
        if (m72096k(i, f39795d)) {
            return "Checkbox";
        }
        if (m72096k(i, f39796e)) {
            return "Switch";
        }
        if (m72096k(i, f39797f)) {
            return "RadioButton";
        }
        if (m72096k(i, f39798g)) {
            return "Tab";
        }
        if (m72096k(i, f39799h)) {
            return "Image";
        }
        if (m72096k(i, f39800i)) {
            return "DropdownList";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m72095j(this.f39801a, obj);
    }

    public int hashCode() {
        return m72097l(this.f39801a);
    }

    /* renamed from: n */
    public final /* synthetic */ int mo46119n() {
        return this.f39801a;
    }

    @C12579k
    public String toString() {
        return m72098m(this.f39801a);
    }
}
