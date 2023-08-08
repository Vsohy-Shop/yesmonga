package androidx.compose.p004ui.text.style;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.text.style.e */
public final class C16415e {
    @C12579k

    /* renamed from: b */
    public static final C16416a f40675b = new C16416a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40676c = m74052d(1);

    /* renamed from: d */
    public static final int f40677d = m74052d(2);

    /* renamed from: a */
    public final int f40678a;

    /* renamed from: androidx.compose.ui.text.style.e$a */
    public static final class C16416a {
        public /* synthetic */ C16416a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo47611a() {
            return C16415e.f40677d;
        }

        /* renamed from: b */
        public final int mo47612b() {
            return C16415e.f40676c;
        }

        public C16416a() {
        }
    }

    public /* synthetic */ C16415e(int i) {
        this.f40678a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C16415e m74051c(int i) {
        return new C16415e(i);
    }

    /* renamed from: d */
    public static int m74052d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m74053e(int i, Object obj) {
        return (obj instanceof C16415e) && i == ((C16415e) obj).mo47609i();
    }

    /* renamed from: f */
    public static final boolean m74054f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m74055g(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: h */
    public static String m74056h(int i) {
        if (m74054f(i, f40676c)) {
            return "Hyphens.None";
        }
        if (m74054f(i, f40677d)) {
            return "Hyphens.Auto";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m74053e(this.f40678a, obj);
    }

    public int hashCode() {
        return m74055g(this.f40678a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo47609i() {
        return this.f40678a;
    }

    @C12579k
    public String toString() {
        return m74056h(this.f40678a);
    }
}
