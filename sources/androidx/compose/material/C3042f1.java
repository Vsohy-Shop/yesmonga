package androidx.compose.material;

import androidx.compose.foundation.shape.C2683e;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n154#2:102\n154#2:103\n154#2:104\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n*L\n50#1:102\n54#1:103\n58#1:104\n*E\n"})
/* renamed from: androidx.compose.material.f1 */
public final class C3042f1 {

    /* renamed from: d */
    public static final int f8114d = 0;
    @C12579k

    /* renamed from: a */
    public final C2683e f8115a;
    @C12579k

    /* renamed from: b */
    public final C2683e f8116b;
    @C12579k

    /* renamed from: c */
    public final C2683e f8117c;

    public C3042f1() {
        this((C2683e) null, (C2683e) null, (C2683e) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static /* synthetic */ C3042f1 m14276b(C3042f1 f1Var, C2683e eVar, C2683e eVar2, C2683e eVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = f1Var.f8115a;
        }
        if ((i & 2) != 0) {
            eVar2 = f1Var.f8116b;
        }
        if ((i & 4) != 0) {
            eVar3 = f1Var.f8117c;
        }
        return f1Var.mo10755a(eVar, eVar2, eVar3);
    }

    @C12579k
    /* renamed from: a */
    public final C3042f1 mo10755a(@C12579k C2683e eVar, @C12579k C2683e eVar2, @C12579k C2683e eVar3) {
        Intrinsics.checkNotNullParameter(eVar, "small");
        Intrinsics.checkNotNullParameter(eVar2, "medium");
        Intrinsics.checkNotNullParameter(eVar3, "large");
        return new C3042f1(eVar, eVar2, eVar3);
    }

    @C12579k
    /* renamed from: c */
    public final C2683e mo10756c() {
        return this.f8117c;
    }

    @C12579k
    /* renamed from: d */
    public final C2683e mo10757d() {
        return this.f8116b;
    }

    @C12579k
    /* renamed from: e */
    public final C2683e mo10758e() {
        return this.f8115a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3042f1)) {
            return false;
        }
        C3042f1 f1Var = (C3042f1) obj;
        if (Intrinsics.areEqual((Object) this.f8115a, (Object) f1Var.f8115a) && Intrinsics.areEqual((Object) this.f8116b, (Object) f1Var.f8116b) && Intrinsics.areEqual((Object) this.f8117c, (Object) f1Var.f8117c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f8115a.hashCode() * 31) + this.f8116b.hashCode()) * 31) + this.f8117c.hashCode();
    }

    @C12579k
    public String toString() {
        return "Shapes(small=" + this.f8115a + ", medium=" + this.f8116b + ", large=" + this.f8117c + ')';
    }

    public C3042f1(@C12579k C2683e eVar, @C12579k C2683e eVar2, @C12579k C2683e eVar3) {
        Intrinsics.checkNotNullParameter(eVar, "small");
        Intrinsics.checkNotNullParameter(eVar2, "medium");
        Intrinsics.checkNotNullParameter(eVar3, "large");
        this.f8115a = eVar;
        this.f8116b = eVar2;
        this.f8117c = eVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3042f1(C2683e eVar, C2683e eVar2, C2683e eVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2694o.m12166h(C16483g.m74435M((float) 4)) : eVar, (i & 2) != 0 ? C2694o.m12166h(C16483g.m74435M((float) 4)) : eVar2, (i & 4) != 0 ? C2694o.m12166h(C16483g.m74435M((float) 0)) : eVar3);
    }
}
