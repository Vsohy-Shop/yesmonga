package androidx.compose.p004ui.text;

import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
/* renamed from: androidx.compose.ui.text.g */
public final class C16256g {
    @C12579k

    /* renamed from: b */
    public static final C16257a f40358b = new C16257a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f40359c = m73210d(0);

    /* renamed from: d */
    public static final int f40360d = m73210d(1);

    /* renamed from: a */
    public final int f40361a;

    /* renamed from: androidx.compose.ui.text.g$a */
    public static final class C16257a {
        public /* synthetic */ C16257a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo47025a() {
            return C16256g.f40359c;
        }

        /* renamed from: b */
        public final int mo47026b() {
            return C16256g.f40360d;
        }

        public C16257a() {
        }
    }

    public /* synthetic */ C16256g(int i) {
        this.f40361a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C16256g m73209c(int i) {
        return new C16256g(i);
    }

    /* renamed from: d */
    public static int m73210d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m73211e(int i, Object obj) {
        return (obj instanceof C16256g) && i == ((C16256g) obj).mo47023i();
    }

    /* renamed from: f */
    public static final boolean m73212f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m73213g(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: h */
    public static String m73214h(int i) {
        if (i == f40359c) {
            return "EmojiSupportMatch.Default";
        }
        if (i == f40360d) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m73211e(this.f40361a, obj);
    }

    public int hashCode() {
        return m73213g(this.f40361a);
    }

    /* renamed from: i */
    public final /* synthetic */ int mo47023i() {
        return this.f40361a;
    }

    @C12579k
    public String toString() {
        return m73214h(this.f40361a);
    }
}
