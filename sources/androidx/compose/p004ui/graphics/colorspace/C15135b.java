package androidx.compose.p004ui.graphics.colorspace;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
@C11363r0({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,89:1\n55#2:90\n48#2:91\n48#2:92\n48#2:93\n48#2:94\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n48#1:90\n57#1:91\n64#1:92\n71#1:93\n79#1:94\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.b */
public final class C15135b {
    @C12579k

    /* renamed from: b */
    public static final C15136a f37394b = new C15136a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f37395c;

    /* renamed from: d */
    public static final long f37396d;

    /* renamed from: e */
    public static final long f37397e;

    /* renamed from: f */
    public static final long f37398f;

    /* renamed from: a */
    public final long f37399a;

    /* renamed from: androidx.compose.ui.graphics.colorspace.b$a */
    public static final class C15136a {
        public /* synthetic */ C15136a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo42569a() {
            return C15135b.f37398f;
        }

        /* renamed from: b */
        public final long mo42570b() {
            return C15135b.f37397e;
        }

        /* renamed from: c */
        public final long mo42571c() {
            return C15135b.f37395c;
        }

        /* renamed from: d */
        public final long mo42572d() {
            return C15135b.f37396d;
        }

        public C15136a() {
        }
    }

    static {
        long j = (long) 3;
        long j2 = j << 32;
        f37395c = m65388f((((long) 0) & 4294967295L) | j2);
        f37396d = m65388f((((long) 1) & 4294967295L) | j2);
        f37397e = m65388f(j2 | (((long) 2) & 4294967295L));
        f37398f = m65388f((j & 4294967295L) | (((long) 4) << 32));
    }

    public /* synthetic */ C15135b(long j) {
        this.f37399a = j;
    }

    /* renamed from: e */
    public static final /* synthetic */ C15135b m65387e(long j) {
        return new C15135b(j);
    }

    /* renamed from: f */
    public static long m65388f(long j) {
        return j;
    }

    /* renamed from: g */
    public static boolean m65389g(long j, Object obj) {
        return (obj instanceof C15135b) && j == ((C15135b) obj).mo42567m();
    }

    /* renamed from: h */
    public static final boolean m65390h(long j, long j2) {
        return j == j2;
    }

    @C8547h2
    /* renamed from: i */
    public static /* synthetic */ void m65391i() {
    }

    /* renamed from: j */
    public static final int m65392j(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: k */
    public static int m65393k(long j) {
        return Long.hashCode(j);
    }

    @C12579k
    /* renamed from: l */
    public static String m65394l(long j) {
        if (m65390h(j, f37395c)) {
            return "Rgb";
        }
        if (m65390h(j, f37396d)) {
            return "Xyz";
        }
        if (m65390h(j, f37397e)) {
            return "Lab";
        }
        if (m65390h(j, f37398f)) {
            return "Cmyk";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m65389g(this.f37399a, obj);
    }

    public int hashCode() {
        return m65393k(this.f37399a);
    }

    /* renamed from: m */
    public final /* synthetic */ long mo42567m() {
        return this.f37399a;
    }

    @C12579k
    public String toString() {
        return m65394l(this.f37399a);
    }
}
