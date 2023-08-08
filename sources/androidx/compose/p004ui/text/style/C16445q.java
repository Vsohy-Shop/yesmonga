package androidx.compose.p004ui.text.style;

import androidx.compose.p004ui.text.C16259h;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C16259h
@C8585m0
/* renamed from: androidx.compose.ui.text.style.q */
public final class C16445q {
    @C12579k

    /* renamed from: c */
    public static final C16446a f40749c = new C16446a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f40750d = 0;
    @C12579k

    /* renamed from: e */
    public static final C16445q f40751e;
    @C12579k

    /* renamed from: f */
    public static final C16445q f40752f;

    /* renamed from: a */
    public final int f40753a;

    /* renamed from: b */
    public final boolean f40754b;

    /* renamed from: androidx.compose.ui.text.style.q$a */
    public static final class C16446a {
        public /* synthetic */ C16446a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C16445q mo47713a() {
            return C16445q.f40752f;
        }

        @C12579k
        /* renamed from: b */
        public final C16445q mo47714b() {
            return C16445q.f40751e;
        }

        public C16446a() {
        }
    }

    @C11288f
    /* renamed from: androidx.compose.ui.text.style.q$b */
    public static final class C16447b {
        @C12579k

        /* renamed from: b */
        public static final C16448a f40755b = new C16448a((DefaultConstructorMarker) null);

        /* renamed from: c */
        public static final int f40756c = m74248e(1);

        /* renamed from: d */
        public static final int f40757d = m74248e(2);

        /* renamed from: e */
        public static final int f40758e = m74248e(3);

        /* renamed from: a */
        public final int f40759a;

        /* renamed from: androidx.compose.ui.text.style.q$b$a */
        public static final class C16448a {
            public /* synthetic */ C16448a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final int mo47719a() {
                return C16447b.f40757d;
            }

            /* renamed from: b */
            public final int mo47720b() {
                return C16447b.f40756c;
            }

            /* renamed from: c */
            public final int mo47721c() {
                return C16447b.f40758e;
            }

            public C16448a() {
            }
        }

        public /* synthetic */ C16447b(int i) {
            this.f40759a = i;
        }

        /* renamed from: d */
        public static final /* synthetic */ C16447b m74247d(int i) {
            return new C16447b(i);
        }

        /* renamed from: e */
        public static int m74248e(int i) {
            return i;
        }

        /* renamed from: f */
        public static boolean m74249f(int i, Object obj) {
            return (obj instanceof C16447b) && i == ((C16447b) obj).mo47717j();
        }

        /* renamed from: g */
        public static final boolean m74250g(int i, int i2) {
            return i == i2;
        }

        /* renamed from: h */
        public static int m74251h(int i) {
            return Integer.hashCode(i);
        }

        @C12579k
        /* renamed from: i */
        public static String m74252i(int i) {
            if (m74250g(i, f40756c)) {
                return "Linearity.Linear";
            }
            if (m74250g(i, f40757d)) {
                return "Linearity.FontHinting";
            }
            if (m74250g(i, f40758e)) {
                return "Linearity.None";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m74249f(this.f40759a, obj);
        }

        public int hashCode() {
            return m74251h(this.f40759a);
        }

        /* renamed from: j */
        public final /* synthetic */ int mo47717j() {
            return this.f40759a;
        }

        @C12579k
        public String toString() {
            return m74252i(this.f40759a);
        }
    }

    static {
        C16447b.C16448a aVar = C16447b.f40755b;
        f40751e = new C16445q(aVar.mo47719a(), false, (DefaultConstructorMarker) null);
        f40752f = new C16445q(aVar.mo47720b(), true, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ C16445q(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    /* renamed from: d */
    public static /* synthetic */ C16445q m74238d(C16445q qVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = qVar.f40753a;
        }
        if ((i2 & 2) != 0) {
            z = qVar.f40754b;
        }
        return qVar.mo47707c(i, z);
    }

    @C12579k
    /* renamed from: c */
    public final C16445q mo47707c(int i, boolean z) {
        return new C16445q(i, z, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public final int mo47708e() {
        return this.f40753a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16445q)) {
            return false;
        }
        C16445q qVar = (C16445q) obj;
        if (C16447b.m74250g(this.f40753a, qVar.f40753a) && this.f40754b == qVar.f40754b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo47710f() {
        return this.f40754b;
    }

    public int hashCode() {
        return (C16447b.m74251h(this.f40753a) * 31) + Boolean.hashCode(this.f40754b);
    }

    @C12579k
    public String toString() {
        if (Intrinsics.areEqual((Object) this, (Object) f40751e)) {
            return "TextMotion.Static";
        }
        if (Intrinsics.areEqual((Object) this, (Object) f40752f)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }

    public C16445q(int i, boolean z) {
        this.f40753a = i;
        this.f40754b = z;
    }
}
