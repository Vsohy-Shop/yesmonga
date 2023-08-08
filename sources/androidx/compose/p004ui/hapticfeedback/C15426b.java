package androidx.compose.p004ui.hapticfeedback;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.hapticfeedback.b */
public final class C15426b {
    @C12579k

    /* renamed from: b */
    public static final C15427a f38115b = new C15427a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final int f38116a;

    /* renamed from: androidx.compose.ui.hapticfeedback.b$a */
    public static final class C15427a {
        public /* synthetic */ C15427a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo43602a() {
            return C15429d.f38118a.mo43605a();
        }

        /* renamed from: b */
        public final int mo43603b() {
            return C15429d.f38118a.mo43606b();
        }

        @C12579k
        /* renamed from: c */
        public final List<C15426b> mo43604c() {
            return CollectionsKt__CollectionsKt.m40448L(C15426b.m67336a(mo43602a()), C15426b.m67336a(mo43603b()));
        }

        public C15427a() {
        }
    }

    public /* synthetic */ C15426b(int i) {
        this.f38116a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ C15426b m67336a(int i) {
        return new C15426b(i);
    }

    /* renamed from: b */
    public static int m67337b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m67338c(int i, Object obj) {
        return (obj instanceof C15426b) && i == ((C15426b) obj).mo43599g();
    }

    /* renamed from: d */
    public static final boolean m67339d(int i, int i2) {
        return i == i2;
    }

    /* renamed from: e */
    public static int m67340e(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: f */
    public static String m67341f(int i) {
        C15427a aVar = f38115b;
        if (m67339d(i, aVar.mo43602a())) {
            return "LongPress";
        }
        if (m67339d(i, aVar.mo43603b())) {
            return "TextHandleMove";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m67338c(this.f38116a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ int mo43599g() {
        return this.f38116a;
    }

    public int hashCode() {
        return m67340e(this.f38116a);
    }

    @C12579k
    public String toString() {
        return m67341f(this.f38116a);
    }
}
