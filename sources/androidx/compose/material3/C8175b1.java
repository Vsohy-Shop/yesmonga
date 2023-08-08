package androidx.compose.material3;

import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.material3.b1 */
public final class C8175b1 {
    @C12579k

    /* renamed from: b */
    public static final C8176a f20002b = new C8176a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f20003c = m26949e(0);

    /* renamed from: d */
    public static final int f20004d = m26949e(1);

    /* renamed from: e */
    public static final int f20005e = m26949e(2);

    /* renamed from: a */
    public final int f20006a;

    /* renamed from: androidx.compose.material3.b1$a */
    public static final class C8176a {
        public /* synthetic */ C8176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo12462a() {
            return C8175b1.f20005e;
        }

        /* renamed from: b */
        public final int mo12463b() {
            return C8175b1.f20003c;
        }

        /* renamed from: c */
        public final int mo12464c() {
            return C8175b1.f20004d;
        }

        public C8176a() {
        }
    }

    public /* synthetic */ C8175b1(int i) {
        this.f20006a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C8175b1 m26948d(int i) {
        return new C8175b1(i);
    }

    /* renamed from: e */
    public static int m26949e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m26950f(int i, Object obj) {
        return (obj instanceof C8175b1) && i == ((C8175b1) obj).mo12460j();
    }

    /* renamed from: g */
    public static final boolean m26951g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m26952h(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: i */
    public static String m26953i(int i) {
        if (m26951g(i, f20003c)) {
            return "SingleDateInput";
        }
        if (m26951g(i, f20004d)) {
            return "StartDateInput";
        }
        if (m26951g(i, f20005e)) {
            return "EndDateInput";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m26950f(this.f20006a, obj);
    }

    public int hashCode() {
        return m26952h(this.f20006a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo12460j() {
        return this.f20006a;
    }

    @C12579k
    public String toString() {
        return m26953i(this.f20006a);
    }
}
