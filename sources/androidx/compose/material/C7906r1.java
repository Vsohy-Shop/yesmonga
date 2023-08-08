package androidx.compose.material;

import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,517:1\n51#2:518\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n*L\n328#1:518\n*E\n"})
/* renamed from: androidx.compose.material.r1 */
public final class C7906r1 {

    /* renamed from: c */
    public static final int f18972c = 0;

    /* renamed from: a */
    public final float f18973a;

    /* renamed from: b */
    public final float f18974b;

    public /* synthetic */ C7906r1(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    /* renamed from: a */
    public final float mo10996a() {
        return this.f18973a;
    }

    /* renamed from: b */
    public final float mo10997b() {
        return C16483g.m74435M(this.f18973a + this.f18974b);
    }

    /* renamed from: c */
    public final float mo10998c() {
        return this.f18974b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7906r1)) {
            return false;
        }
        C7906r1 r1Var = (C7906r1) obj;
        if (C16483g.m74440e0(this.f18973a, r1Var.f18973a) && C16483g.m74440e0(this.f18974b, r1Var.f18974b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C16483g.m74442h0(this.f18973a) * 31) + C16483g.m74442h0(this.f18974b);
    }

    @C12579k
    public String toString() {
        return "TabPosition(left=" + C16483g.m74447o0(this.f18973a) + ", right=" + C16483g.m74447o0(mo10997b()) + ", width=" + C16483g.m74447o0(this.f18974b) + ')';
    }

    public C7906r1(float f, float f2) {
        this.f18973a = f;
        this.f18974b = f2;
    }
}
