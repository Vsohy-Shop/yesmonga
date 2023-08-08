package androidx.compose.p004ui.input;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.input.a */
public final class C15430a {
    @C12579k

    /* renamed from: b */
    public static final C15431a f38121b = new C15431a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f38122c = m67352d(1);

    /* renamed from: d */
    public static final int f38123d = m67352d(2);

    /* renamed from: a */
    public final int f38124a;

    /* renamed from: androidx.compose.ui.input.a$a */
    public static final class C15431a {
        public /* synthetic */ C15431a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo43611a() {
            return C15430a.f38123d;
        }

        /* renamed from: b */
        public final int mo43612b() {
            return C15430a.f38122c;
        }

        public C15431a() {
        }
    }

    public /* synthetic */ C15430a(int i) {
        this.f38124a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C15430a m67351c(int i) {
        return new C15430a(i);
    }

    /* renamed from: d */
    public static int m67352d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m67353e(int i, Object obj) {
        return (obj instanceof C15430a) && i == ((C15430a) obj).mo43609i();
    }

    /* renamed from: f */
    public static final boolean m67354f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m67355g(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: h */
    public static String m67356h(int i) {
        if (m67354f(i, f38122c)) {
            return "Touch";
        }
        if (m67354f(i, f38123d)) {
            return "Keyboard";
        }
        return "Error";
    }

    public boolean equals(Object obj) {
        return m67353e(this.f38124a, obj);
    }

    public int hashCode() {
        return m67355g(this.f38124a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo43609i() {
        return this.f38124a;
    }

    @C12579k
    public String toString() {
        return m67356h(this.f38124a);
    }
}
