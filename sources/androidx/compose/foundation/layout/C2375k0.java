package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n305#1:437\n307#1:438\n309#1:439\n311#1:440\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.k0 */
public final class C2375k0 implements C2366i0 {

    /* renamed from: a */
    public final float f6286a;

    /* renamed from: b */
    public final float f6287b;

    /* renamed from: c */
    public final float f6288c;

    /* renamed from: d */
    public final float f6289d;

    public /* synthetic */ C2375k0(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    @C8547h2
    /* renamed from: f */
    public static /* synthetic */ void m10467f() {
    }

    @C8547h2
    /* renamed from: h */
    public static /* synthetic */ void m10468h() {
    }

    @C8547h2
    /* renamed from: j */
    public static /* synthetic */ void m10469j() {
    }

    @C8547h2
    /* renamed from: l */
    public static /* synthetic */ void m10470l() {
    }

    /* renamed from: a */
    public float mo8090a() {
        return this.f6289d;
    }

    /* renamed from: b */
    public float mo8091b(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return this.f6286a;
        }
        return this.f6288c;
    }

    /* renamed from: c */
    public float mo8092c(@C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return this.f6288c;
        }
        return this.f6286a;
    }

    /* renamed from: d */
    public float mo8093d() {
        return this.f6287b;
    }

    /* renamed from: e */
    public final float mo8105e() {
        return this.f6289d;
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof C2375k0)) {
            return false;
        }
        C2375k0 k0Var = (C2375k0) obj;
        if (!C16483g.m74440e0(this.f6286a, k0Var.f6286a) || !C16483g.m74440e0(this.f6287b, k0Var.f6287b) || !C16483g.m74440e0(this.f6288c, k0Var.f6288c) || !C16483g.m74440e0(this.f6289d, k0Var.f6289d)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final float mo8107g() {
        return this.f6288c;
    }

    public int hashCode() {
        return (((((C16483g.m74442h0(this.f6286a) * 31) + C16483g.m74442h0(this.f6287b)) * 31) + C16483g.m74442h0(this.f6288c)) * 31) + C16483g.m74442h0(this.f6289d);
    }

    /* renamed from: i */
    public final float mo8109i() {
        return this.f6286a;
    }

    /* renamed from: k */
    public final float mo8110k() {
        return this.f6287b;
    }

    @C12579k
    public String toString() {
        return "PaddingValues(start=" + C16483g.m74447o0(this.f6286a) + ", top=" + C16483g.m74447o0(this.f6287b) + ", end=" + C16483g.m74447o0(this.f6288c) + ", bottom=" + C16483g.m74447o0(this.f6289d) + ')';
    }

    public C2375k0(float f, float f2, float f3, float f4) {
        this.f6286a = f;
        this.f6287b = f2;
        this.f6288c = f3;
        this.f6289d = f4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2375k0(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C16483g.m74435M((float) 0) : f, (i & 2) != 0 ? C16483g.m74435M((float) 0) : f2, (i & 4) != 0 ? C16483g.m74435M((float) 0) : f3, (i & 8) != 0 ? C16483g.m74435M((float) 0) : f4, (DefaultConstructorMarker) null);
    }
}
