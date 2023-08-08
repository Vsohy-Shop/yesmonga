package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.C8761g;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.focus.d */
public final class C15059d {
    @C12579k

    /* renamed from: b */
    public static final C15060a f37228b = new C15060a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37229c = m64707l(1);

    /* renamed from: d */
    public static final int f37230d = m64707l(2);

    /* renamed from: e */
    public static final int f37231e = m64707l(3);

    /* renamed from: f */
    public static final int f37232f = m64707l(4);

    /* renamed from: g */
    public static final int f37233g = m64707l(5);

    /* renamed from: h */
    public static final int f37234h = m64707l(6);

    /* renamed from: i */
    public static final int f37235i;

    /* renamed from: j */
    public static final int f37236j;

    /* renamed from: k */
    public static final int f37237k;

    /* renamed from: l */
    public static final int f37238l;

    /* renamed from: a */
    public final int f37239a;

    /* renamed from: androidx.compose.ui.focus.d$a */
    public static final class C15060a {
        public /* synthetic */ C15060a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8761g
        /* renamed from: c */
        public static /* synthetic */ void m64713c() {
        }

        @C8761g
        /* renamed from: e */
        public static /* synthetic */ void m64714e() {
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "Use FocusDirection.Enter instead.", replaceWith = @C11587t0(expression = "Enter", imports = {"androidx.compose.ui.focus.FocusDirection.Companion.Enter"}))
        @C8761g
        /* renamed from: g */
        public static /* synthetic */ void m64715g() {
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "Use FocusDirection.Exit instead.", replaceWith = @C11587t0(expression = "Exit", imports = {"androidx.compose.ui.focus.FocusDirection.Companion.Exit"}))
        @C8761g
        /* renamed from: k */
        public static /* synthetic */ void m64716k() {
        }

        /* renamed from: a */
        public final int mo42184a() {
            return C15059d.f37234h;
        }

        @C8761g
        /* renamed from: b */
        public final int mo42185b() {
            return C15059d.f37235i;
        }

        @C8761g
        /* renamed from: d */
        public final int mo42186d() {
            return C15059d.f37236j;
        }

        @C8761g
        /* renamed from: f */
        public final int mo42187f() {
            return C15059d.f37237k;
        }

        /* renamed from: h */
        public final int mo42188h() {
            return C15059d.f37231e;
        }

        /* renamed from: i */
        public final int mo42189i() {
            return C15059d.f37229c;
        }

        @C8761g
        /* renamed from: j */
        public final int mo42190j() {
            return C15059d.f37238l;
        }

        /* renamed from: l */
        public final int mo42191l() {
            return C15059d.f37230d;
        }

        /* renamed from: m */
        public final int mo42192m() {
            return C15059d.f37232f;
        }

        /* renamed from: n */
        public final int mo42193n() {
            return C15059d.f37233g;
        }

        public C15060a() {
        }
    }

    static {
        int l = m64707l(7);
        f37235i = l;
        int l2 = m64707l(8);
        f37236j = l2;
        f37237k = l;
        f37238l = l2;
    }

    public /* synthetic */ C15059d(int i) {
        this.f37239a = i;
    }

    /* renamed from: k */
    public static final /* synthetic */ C15059d m64706k(int i) {
        return new C15059d(i);
    }

    /* renamed from: l */
    public static int m64707l(int i) {
        return i;
    }

    /* renamed from: m */
    public static boolean m64708m(int i, Object obj) {
        return (obj instanceof C15059d) && i == ((C15059d) obj).mo42182q();
    }

    /* renamed from: n */
    public static final boolean m64709n(int i, int i2) {
        return i == i2;
    }

    /* renamed from: o */
    public static int m64710o(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: p */
    public static String m64711p(int i) {
        if (m64709n(i, f37229c)) {
            return "Next";
        }
        if (m64709n(i, f37230d)) {
            return "Previous";
        }
        if (m64709n(i, f37231e)) {
            return "Left";
        }
        if (m64709n(i, f37232f)) {
            return "Right";
        }
        if (m64709n(i, f37233g)) {
            return "Up";
        }
        if (m64709n(i, f37234h)) {
            return "Down";
        }
        if (m64709n(i, f37235i)) {
            return "Enter";
        }
        if (m64709n(i, f37236j)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m64708m(this.f37239a, obj);
    }

    public int hashCode() {
        return m64710o(this.f37239a);
    }

    /* renamed from: q */
    public final /* synthetic */ int mo42182q() {
        return this.f37239a;
    }

    @C12579k
    public String toString() {
        return m64711p(this.f37239a);
    }
}
