package androidx.compose.p004ui.graphics;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.C11532s0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
@C11363r0({"SMAP\nTransformOrigin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,83:1\n34#2:84\n41#2:85\n*S KotlinDebug\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n*L\n46#1:84\n55#1:85\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.o4 */
public final class C15283o4 {
    @C12579k

    /* renamed from: b */
    public static final C15284a f37618b = new C15284a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final long f37619c = C15291p4.m66401a(0.5f, 0.5f);

    /* renamed from: a */
    public final long f37620a;

    /* renamed from: androidx.compose.ui.graphics.o4$a */
    public static final class C15284a {
        public /* synthetic */ C15284a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo42933a() {
            return C15283o4.f37619c;
        }

        public C15284a() {
        }
    }

    public /* synthetic */ C15283o4(long j) {
        this.f37620a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C15283o4 m66370b(long j) {
        return new C15283o4(j);
    }

    @C8547h2
    /* renamed from: c */
    public static final float m66371c(long j) {
        return m66379k(j);
    }

    @C8547h2
    /* renamed from: d */
    public static final float m66372d(long j) {
        return m66380l(j);
    }

    /* renamed from: e */
    public static long m66373e(long j) {
        return j;
    }

    /* renamed from: f */
    public static final long m66374f(long j, float f, float f2) {
        return C15291p4.m66401a(f, f2);
    }

    /* renamed from: g */
    public static /* synthetic */ long m66375g(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m66379k(j);
        }
        if ((i & 2) != 0) {
            f2 = m66380l(j);
        }
        return m66374f(j, f, f2);
    }

    /* renamed from: h */
    public static boolean m66376h(long j, Object obj) {
        return (obj instanceof C15283o4) && j == ((C15283o4) obj).mo42931o();
    }

    /* renamed from: i */
    public static final boolean m66377i(long j, long j2) {
        return j == j2;
    }

    @C11532s0
    /* renamed from: j */
    public static /* synthetic */ void m66378j() {
    }

    /* renamed from: k */
    public static final float m66379k(long j) {
        C11377x xVar = C11377x.f28521a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: l */
    public static final float m66380l(long j) {
        C11377x xVar = C11377x.f28521a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: m */
    public static int m66381m(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: n */
    public static String m66382n(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m66376h(this.f37620a, obj);
    }

    public int hashCode() {
        return m66381m(this.f37620a);
    }

    /* renamed from: o */
    public final /* synthetic */ long mo42931o() {
        return this.f37620a;
    }

    public String toString() {
        return m66382n(this.f37620a);
    }
}
