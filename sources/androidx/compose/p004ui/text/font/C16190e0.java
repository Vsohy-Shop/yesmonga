package androidx.compose.p004ui.text.font;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.text.font.e0 */
public final class C16190e0 {
    @C12579k

    /* renamed from: b */
    public static final C16191a f40252b = new C16191a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40253c = m72949d(0);

    /* renamed from: d */
    public static final int f40254d = m72949d(1);

    /* renamed from: a */
    public final int f40255a;

    /* renamed from: androidx.compose.ui.text.font.e0$a */
    public static final class C16191a {
        public /* synthetic */ C16191a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo46882a() {
            return C16190e0.f40254d;
        }

        /* renamed from: b */
        public final int mo46883b() {
            return C16190e0.f40253c;
        }

        @C12579k
        /* renamed from: c */
        public final List<C16190e0> mo46884c() {
            return CollectionsKt__CollectionsKt.m40448L(C16190e0.m72948c(mo46883b()), C16190e0.m72948c(mo46882a()));
        }

        public C16191a() {
        }
    }

    public /* synthetic */ C16190e0(int i) {
        this.f40255a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C16190e0 m72948c(int i) {
        return new C16190e0(i);
    }

    /* renamed from: d */
    public static int m72949d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m72950e(int i, Object obj) {
        return (obj instanceof C16190e0) && i == ((C16190e0) obj).mo46880j();
    }

    /* renamed from: f */
    public static final boolean m72951f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m72952h(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: i */
    public static String m72953i(int i) {
        if (m72951f(i, f40253c)) {
            return "Normal";
        }
        if (m72951f(i, f40254d)) {
            return "Italic";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m72950e(this.f40255a, obj);
    }

    /* renamed from: g */
    public final int mo46878g() {
        return this.f40255a;
    }

    public int hashCode() {
        return m72952h(this.f40255a);
    }

    /* renamed from: j */
    public final /* synthetic */ int mo46880j() {
        return this.f40255a;
    }

    @C12579k
    public String toString() {
        return m72953i(this.f40255a);
    }
}
