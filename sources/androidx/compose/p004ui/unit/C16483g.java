package androidx.compose.p004ui.unit;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11288f
@C8585m0
@C11363r0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,557:1\n137#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n101#1:558\n*E\n"})
/* renamed from: androidx.compose.ui.unit.g */
public final class C16483g implements Comparable<C16483g> {
    @C12579k

    /* renamed from: b */
    public static final C16484a f40871b = new C16484a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final float f40872c = m74435M(0.0f);

    /* renamed from: d */
    public static final float f40873d = m74435M(Float.POSITIVE_INFINITY);

    /* renamed from: e */
    public static final float f40874e = m74435M(Float.NaN);

    /* renamed from: a */
    public final float f40875a;

    /* renamed from: androidx.compose.ui.unit.g$a */
    public static final class C16484a {
        public /* synthetic */ C16484a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m74456b() {
        }

        @C8547h2
        /* renamed from: d */
        public static /* synthetic */ void m74457d() {
        }

        @C8547h2
        /* renamed from: f */
        public static /* synthetic */ void m74458f() {
        }

        /* renamed from: a */
        public final float mo47826a() {
            return C16483g.f40872c;
        }

        /* renamed from: c */
        public final float mo47827c() {
            return C16483g.f40873d;
        }

        /* renamed from: e */
        public final float mo47828e() {
            return C16483g.f40874e;
        }

        public C16484a() {
        }
    }

    public /* synthetic */ C16483g(float f) {
        this.f40875a = f;
    }

    /* renamed from: M */
    public static float m74435M(float f) {
        return f;
    }

    @C8547h2
    /* renamed from: Q */
    public static final float m74436Q(float f, float f2) {
        return f / f2;
    }

    @C8547h2
    /* renamed from: W */
    public static final float m74437W(float f, float f2) {
        return m74435M(f / f2);
    }

    @C8547h2
    /* renamed from: X */
    public static final float m74438X(float f, int i) {
        return m74435M(f / ((float) i));
    }

    /* renamed from: Z */
    public static boolean m74439Z(float f, Object obj) {
        return (obj instanceof C16483g) && Float.compare(f, ((C16483g) obj).mo47823t0()) == 0;
    }

    /* renamed from: e0 */
    public static final boolean m74440e0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: h0 */
    public static int m74442h0(float f) {
        return Float.hashCode(f);
    }

    @C8547h2
    /* renamed from: i0 */
    public static final float m74443i0(float f, float f2) {
        return m74435M(f - f2);
    }

    @C8547h2
    /* renamed from: j0 */
    public static final float m74444j0(float f, float f2) {
        return m74435M(f + f2);
    }

    @C8547h2
    /* renamed from: m0 */
    public static final float m74445m0(float f, float f2) {
        return m74435M(f * f2);
    }

    @C8547h2
    /* renamed from: n0 */
    public static final float m74446n0(float f, int i) {
        return m74435M(f * ((float) i));
    }

    @C8547h2
    @C12579k
    /* renamed from: o0 */
    public static String m74447o0(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @C8547h2
    /* renamed from: p0 */
    public static final float m74448p0(float f) {
        return m74435M(-f);
    }

    /* renamed from: w */
    public static final /* synthetic */ C16483g m74451w(float f) {
        return new C16483g(f);
    }

    @C8547h2
    /* renamed from: z */
    public static int m74452z(float f, float f2) {
        return Float.compare(f, f2);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return mo47825y(((C16483g) obj).mo47823t0());
    }

    public boolean equals(Object obj) {
        return m74439Z(this.f40875a, obj);
    }

    /* renamed from: f0 */
    public final float mo47821f0() {
        return this.f40875a;
    }

    public int hashCode() {
        return m74442h0(this.f40875a);
    }

    /* renamed from: t0 */
    public final /* synthetic */ float mo47823t0() {
        return this.f40875a;
    }

    @C8547h2
    @C12579k
    public String toString() {
        return m74447o0(this.f40875a);
    }

    @C8547h2
    /* renamed from: y */
    public int mo47825y(float f) {
        return m74452z(this.f40875a, f);
    }
}
