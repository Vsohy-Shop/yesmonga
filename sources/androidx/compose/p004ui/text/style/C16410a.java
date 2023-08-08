package androidx.compose.p004ui.text.style;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.text.style.a */
public final class C16410a {
    @C12579k

    /* renamed from: b */
    public static final C16411a f40667b = new C16411a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final float f40668c = m74022e(0.5f);

    /* renamed from: d */
    public static final float f40669d = m74022e(-0.5f);

    /* renamed from: e */
    public static final float f40670e = m74022e(0.0f);

    /* renamed from: a */
    public final float f40671a;

    /* renamed from: androidx.compose.ui.text.style.a$a */
    public static final class C16411a {
        public /* synthetic */ C16411a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m74029b() {
        }

        @C8547h2
        /* renamed from: d */
        public static /* synthetic */ void m74030d() {
        }

        @C8547h2
        /* renamed from: f */
        public static /* synthetic */ void m74031f() {
        }

        /* renamed from: a */
        public final float mo47591a() {
            return C16410a.f40670e;
        }

        /* renamed from: c */
        public final float mo47592c() {
            return C16410a.f40669d;
        }

        /* renamed from: e */
        public final float mo47593e() {
            return C16410a.f40668c;
        }

        public C16411a() {
        }
    }

    public /* synthetic */ C16410a(float f) {
        this.f40671a = f;
    }

    /* renamed from: d */
    public static final /* synthetic */ C16410a m74021d(float f) {
        return new C16410a(f);
    }

    /* renamed from: e */
    public static float m74022e(float f) {
        return f;
    }

    /* renamed from: f */
    public static boolean m74023f(float f, Object obj) {
        return (obj instanceof C16410a) && Float.compare(f, ((C16410a) obj).mo47589k()) == 0;
    }

    /* renamed from: g */
    public static final boolean m74024g(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: i */
    public static int m74025i(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: j */
    public static String m74026j(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return m74023f(this.f40671a, obj);
    }

    /* renamed from: h */
    public final float mo47587h() {
        return this.f40671a;
    }

    public int hashCode() {
        return m74025i(this.f40671a);
    }

    /* renamed from: k */
    public final /* synthetic */ float mo47589k() {
        return this.f40671a;
    }

    public String toString() {
        return m74026j(this.f40671a);
    }
}
