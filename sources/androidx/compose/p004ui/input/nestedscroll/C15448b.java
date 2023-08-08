package androidx.compose.p004ui.input.nestedscroll;

import androidx.compose.p004ui.C8761g;
import kotlin.C11395k;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.input.nestedscroll.b */
public final class C15448b {
    @C12579k

    /* renamed from: b */
    public static final C15449a f38435b = new C15449a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f38436c = m68341e(1);

    /* renamed from: d */
    public static final int f38437d = m68341e(2);

    /* renamed from: e */
    public static final int f38438e = m68341e(3);

    /* renamed from: a */
    public final int f38439a;

    /* renamed from: androidx.compose.ui.input.nestedscroll.b$a */
    public static final class C15449a {
        public /* synthetic */ C15449a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11395k(message = "Do not use. Will be removed in the future.")
        @C8761g
        /* renamed from: d */
        public static /* synthetic */ void m68347d() {
        }

        /* renamed from: a */
        public final int mo43964a() {
            return C15448b.f38436c;
        }

        /* renamed from: b */
        public final int mo43965b() {
            return C15448b.f38437d;
        }

        /* renamed from: c */
        public final int mo43966c() {
            return C15448b.f38438e;
        }

        public C15449a() {
        }
    }

    public /* synthetic */ C15448b(int i) {
        this.f38439a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C15448b m68340d(int i) {
        return new C15448b(i);
    }

    /* renamed from: e */
    public static int m68341e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m68342f(int i, Object obj) {
        return (obj instanceof C15448b) && i == ((C15448b) obj).mo43962j();
    }

    /* renamed from: g */
    public static final boolean m68343g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m68344h(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: i */
    public static String m68345i(int i) {
        if (m68343g(i, f38436c)) {
            return "Drag";
        }
        if (m68343g(i, f38437d)) {
            return "Fling";
        }
        if (m68343g(i, f38438e)) {
            return "Relocate";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m68342f(this.f38439a, obj);
    }

    public int hashCode() {
        return m68344h(this.f38439a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo43962j() {
        return this.f38439a;
    }

    @C12579k
    public String toString() {
        return m68345i(this.f38439a);
    }
}
