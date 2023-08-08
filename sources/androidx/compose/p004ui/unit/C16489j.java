package androidx.compose.p004ui.unit;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n51#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpRect\n*L\n535#1:558\n*E\n"})
/* renamed from: androidx.compose.ui.unit.j */
public final class C16489j {
    @C12579k

    /* renamed from: e */
    public static final C16490a f40880e = new C16490a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f40881f = 0;

    /* renamed from: a */
    public final float f40882a;

    /* renamed from: b */
    public final float f40883b;

    /* renamed from: c */
    public final float f40884c;

    /* renamed from: d */
    public final float f40885d;

    /* renamed from: androidx.compose.ui.unit.j$a */
    public static final class C16490a {
        public /* synthetic */ C16490a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C16490a() {
        }
    }

    public /* synthetic */ C16489j(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    /* renamed from: f */
    public static /* synthetic */ C16489j m74529f(C16489j jVar, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = jVar.f40882a;
        }
        if ((i & 2) != 0) {
            f2 = jVar.f40883b;
        }
        if ((i & 4) != 0) {
            f3 = jVar.f40884c;
        }
        if ((i & 8) != 0) {
            f4 = jVar.f40885d;
        }
        return jVar.mo47839e(f, f2, f3, f4);
    }

    @C8547h2
    /* renamed from: h */
    public static /* synthetic */ void m74530h() {
    }

    @C8547h2
    /* renamed from: j */
    public static /* synthetic */ void m74531j() {
    }

    @C8547h2
    /* renamed from: l */
    public static /* synthetic */ void m74532l() {
    }

    @C8547h2
    /* renamed from: n */
    public static /* synthetic */ void m74533n() {
    }

    /* renamed from: a */
    public final float mo47835a() {
        return this.f40882a;
    }

    /* renamed from: b */
    public final float mo47836b() {
        return this.f40883b;
    }

    /* renamed from: c */
    public final float mo47837c() {
        return this.f40884c;
    }

    /* renamed from: d */
    public final float mo47838d() {
        return this.f40885d;
    }

    @C12579k
    /* renamed from: e */
    public final C16489j mo47839e(float f, float f2, float f3, float f4) {
        return new C16489j(f, f2, f3, f4, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16489j)) {
            return false;
        }
        C16489j jVar = (C16489j) obj;
        return C16483g.m74440e0(this.f40882a, jVar.f40882a) && C16483g.m74440e0(this.f40883b, jVar.f40883b) && C16483g.m74440e0(this.f40884c, jVar.f40884c) && C16483g.m74440e0(this.f40885d, jVar.f40885d);
    }

    /* renamed from: g */
    public final float mo47841g() {
        return this.f40885d;
    }

    public int hashCode() {
        return (((((C16483g.m74442h0(this.f40882a) * 31) + C16483g.m74442h0(this.f40883b)) * 31) + C16483g.m74442h0(this.f40884c)) * 31) + C16483g.m74442h0(this.f40885d);
    }

    /* renamed from: i */
    public final float mo47843i() {
        return this.f40882a;
    }

    /* renamed from: k */
    public final float mo47844k() {
        return this.f40884c;
    }

    /* renamed from: m */
    public final float mo47845m() {
        return this.f40883b;
    }

    @C12579k
    public String toString() {
        return "DpRect(left=" + C16483g.m74447o0(this.f40882a) + ", top=" + C16483g.m74447o0(this.f40883b) + ", right=" + C16483g.m74447o0(this.f40884c) + ", bottom=" + C16483g.m74447o0(this.f40885d) + ')';
    }

    public /* synthetic */ C16489j(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public C16489j(float f, float f2, float f3, float f4) {
        this.f40882a = f;
        this.f40883b = f2;
        this.f40884c = f3;
        this.f40885d = f4;
    }

    public C16489j(long j, long j2) {
        this(C16486i.m74517j(j), C16486i.m74519l(j), C16483g.m74435M(C16486i.m74517j(j) + C16491k.m74558p(j2)), C16483g.m74435M(C16486i.m74519l(j) + C16491k.m74555m(j2)), (DefaultConstructorMarker) null);
    }
}
