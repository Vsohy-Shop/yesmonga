package androidx.compose.p004ui.layout;

import kotlin.jvm.C11288f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.layout.b */
public interface C15535b {

    /* renamed from: androidx.compose.ui.layout.b$a */
    public interface C15536a {
        /* renamed from: a */
        boolean mo8737a();
    }

    @C11288f
    /* renamed from: androidx.compose.ui.layout.b$b */
    public static final class C15537b {
        @C12579k

        /* renamed from: b */
        public static final C15538a f38688b = new C15538a((DefaultConstructorMarker) null);

        /* renamed from: c */
        public static final int f38689c = m69059h(1);

        /* renamed from: d */
        public static final int f38690d = m69059h(2);

        /* renamed from: e */
        public static final int f38691e = m69059h(3);

        /* renamed from: f */
        public static final int f38692f = m69059h(4);

        /* renamed from: g */
        public static final int f38693g = m69059h(5);

        /* renamed from: h */
        public static final int f38694h = m69059h(6);

        /* renamed from: a */
        public final int f38695a;

        /* renamed from: androidx.compose.ui.layout.b$b$a */
        public static final class C15538a {
            public /* synthetic */ C15538a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final int mo44361a() {
                return C15537b.f38693g;
            }

            /* renamed from: b */
            public final int mo44362b() {
                return C15537b.f38690d;
            }

            /* renamed from: c */
            public final int mo44363c() {
                return C15537b.f38689c;
            }

            /* renamed from: d */
            public final int mo44364d() {
                return C15537b.f38694h;
            }

            /* renamed from: e */
            public final int mo44365e() {
                return C15537b.f38691e;
            }

            /* renamed from: f */
            public final int mo44366f() {
                return C15537b.f38692f;
            }

            public C15538a() {
            }
        }

        public /* synthetic */ C15537b(int i) {
            this.f38695a = i;
        }

        /* renamed from: g */
        public static final /* synthetic */ C15537b m69058g(int i) {
            return new C15537b(i);
        }

        /* renamed from: h */
        public static int m69059h(int i) {
            return i;
        }

        /* renamed from: i */
        public static boolean m69060i(int i, Object obj) {
            return (obj instanceof C15537b) && i == ((C15537b) obj).mo44359m();
        }

        /* renamed from: j */
        public static final boolean m69061j(int i, int i2) {
            return i == i2;
        }

        /* renamed from: k */
        public static int m69062k(int i) {
            return Integer.hashCode(i);
        }

        @C12579k
        /* renamed from: l */
        public static String m69063l(int i) {
            if (m69061j(i, f38689c)) {
                return "Before";
            }
            if (m69061j(i, f38690d)) {
                return "After";
            }
            if (m69061j(i, f38691e)) {
                return "Left";
            }
            if (m69061j(i, f38692f)) {
                return "Right";
            }
            if (m69061j(i, f38693g)) {
                return "Above";
            }
            if (m69061j(i, f38694h)) {
                return "Below";
            }
            return "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m69060i(this.f38695a, obj);
        }

        public int hashCode() {
            return m69062k(this.f38695a);
        }

        /* renamed from: m */
        public final /* synthetic */ int mo44359m() {
            return this.f38695a;
        }

        @C12579k
        public String toString() {
            return m69063l(this.f38695a);
        }
    }

    @C12580l
    /* renamed from: a */
    <T> T mo8732a(int i, @C12579k C11300l<? super C15536a, ? extends T> lVar);
}
