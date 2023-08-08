package androidx.compose.p004ui.input.key;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.input.key.c */
public final class C15437c {
    @C12579k

    /* renamed from: b */
    public static final C15438a f38419b = new C15438a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f38420c = m68264e(0);

    /* renamed from: d */
    public static final int f38421d = m68264e(1);

    /* renamed from: e */
    public static final int f38422e = m68264e(2);

    /* renamed from: a */
    public final int f38423a;

    /* renamed from: androidx.compose.ui.input.key.c$a */
    public static final class C15438a {
        public /* synthetic */ C15438a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo43929a() {
            return C15437c.f38422e;
        }

        /* renamed from: b */
        public final int mo43930b() {
            return C15437c.f38421d;
        }

        /* renamed from: c */
        public final int mo43931c() {
            return C15437c.f38420c;
        }

        public C15438a() {
        }
    }

    public /* synthetic */ C15437c(int i) {
        this.f38423a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C15437c m68263d(int i) {
        return new C15437c(i);
    }

    /* renamed from: e */
    public static int m68264e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m68265f(int i, Object obj) {
        return (obj instanceof C15437c) && i == ((C15437c) obj).mo43927j();
    }

    /* renamed from: g */
    public static final boolean m68266g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m68267h(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: i */
    public static String m68268i(int i) {
        if (m68266g(i, f38421d)) {
            return "KeyUp";
        }
        if (m68266g(i, f38422e)) {
            return "KeyDown";
        }
        if (m68266g(i, f38420c)) {
            return "Unknown";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m68265f(this.f38423a, obj);
    }

    public int hashCode() {
        return m68267h(this.f38423a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo43927j() {
        return this.f38423a;
    }

    @C12579k
    public String toString() {
        return m68268i(this.f38423a);
    }
}
