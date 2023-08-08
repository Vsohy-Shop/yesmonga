package androidx.compose.p004ui.graphics.colorspace;

import androidx.compose.runtime.C8585m0;
import androidx.exifinterface.media.C19135a;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
/* renamed from: androidx.compose.ui.graphics.colorspace.m */
public final class C15155m {
    @C12579k

    /* renamed from: b */
    public static final C15156a f37466b = new C15156a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f37467c = m65535f(0);

    /* renamed from: d */
    public static final int f37468d = m65535f(1);

    /* renamed from: e */
    public static final int f37469e = m65535f(2);

    /* renamed from: f */
    public static final int f37470f = m65535f(3);

    /* renamed from: a */
    public final int f37471a;

    /* renamed from: androidx.compose.ui.graphics.colorspace.m$a */
    public static final class C15156a {
        public /* synthetic */ C15156a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo42641a() {
            return C15155m.f37470f;
        }

        /* renamed from: b */
        public final int mo42642b() {
            return C15155m.f37467c;
        }

        /* renamed from: c */
        public final int mo42643c() {
            return C15155m.f37468d;
        }

        /* renamed from: d */
        public final int mo42644d() {
            return C15155m.f37469e;
        }

        public C15156a() {
        }
    }

    public /* synthetic */ C15155m(int i) {
        this.f37471a = i;
    }

    /* renamed from: e */
    public static final /* synthetic */ C15155m m65534e(int i) {
        return new C15155m(i);
    }

    /* renamed from: f */
    public static int m65535f(int i) {
        return i;
    }

    /* renamed from: g */
    public static boolean m65536g(int i, Object obj) {
        return (obj instanceof C15155m) && i == ((C15155m) obj).mo42639k();
    }

    /* renamed from: h */
    public static final boolean m65537h(int i, int i2) {
        return i == i2;
    }

    /* renamed from: i */
    public static int m65538i(int i) {
        return Integer.hashCode(i);
    }

    @C12579k
    /* renamed from: j */
    public static String m65539j(int i) {
        if (m65537h(i, f37467c)) {
            return "Perceptual";
        }
        if (m65537h(i, f37468d)) {
            return "Relative";
        }
        if (m65537h(i, f37469e)) {
            return C19135a.f48988l1;
        }
        if (m65537h(i, f37470f)) {
            return "Absolute";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m65536g(this.f37471a, obj);
    }

    public int hashCode() {
        return m65538i(this.f37471a);
    }

    /* renamed from: k */
    public final /* synthetic */ int mo42639k() {
        return this.f37471a;
    }

    @C12579k
    public String toString() {
        return m65539j(this.f37471a);
    }
}
