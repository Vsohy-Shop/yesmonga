package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,505:1\n51#2:506\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabPosition\n*L\n339#1:506\n*E\n"})
/* renamed from: androidx.compose.material3.c3 */
public final class C8184c3 {

    /* renamed from: c */
    public static final int f20039c = 0;

    /* renamed from: a */
    public final float f20040a;

    /* renamed from: b */
    public final float f20041b;

    public /* synthetic */ C8184c3(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    /* renamed from: a */
    public final float mo12511a() {
        return this.f20040a;
    }

    /* renamed from: b */
    public final float mo12512b() {
        return C16483g.m74435M(this.f20040a + this.f20041b);
    }

    /* renamed from: c */
    public final float mo12513c() {
        return this.f20041b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8184c3)) {
            return false;
        }
        C8184c3 c3Var = (C8184c3) obj;
        if (C16483g.m74440e0(this.f20040a, c3Var.f20040a) && C16483g.m74440e0(this.f20041b, c3Var.f20041b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C16483g.m74442h0(this.f20040a) * 31) + C16483g.m74442h0(this.f20041b);
    }

    @C12579k
    public String toString() {
        return "TabPosition(left=" + C16483g.m74447o0(this.f20040a) + ", right=" + C16483g.m74447o0(mo12512b()) + ", width=" + C16483g.m74447o0(this.f20041b) + ')';
    }

    public C8184c3(float f, float f2) {
        this.f20040a = f;
        this.f20041b = f2;
    }
}
