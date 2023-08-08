package androidx.compose.material;

import androidx.compose.foundation.shape.C2694o;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15204e3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15266m3;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n1#1,547:1\n1#2:548\n426#3:549\n400#3:550\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n*L\n350#1:549\n350#1:550\n*E\n"})
/* renamed from: androidx.compose.material.d */
public final class C3034d implements C15218g4 {
    @C12579k

    /* renamed from: a */
    public final C15218g4 f8098a;
    @C12579k

    /* renamed from: b */
    public final C3047h0 f8099b;

    public C3034d(@C12579k C15218g4 g4Var, @C12579k C3047h0 h0Var) {
        Intrinsics.checkNotNullParameter(g4Var, "cutoutShape");
        Intrinsics.checkNotNullParameter(h0Var, "fabPlacement");
        this.f8098a = g4Var;
        this.f8099b = h0Var;
    }

    /* renamed from: g */
    public static /* synthetic */ C3034d m14251g(C3034d dVar, C15218g4 g4Var, C3047h0 h0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            g4Var = dVar.f8098a;
        }
        if ((i & 2) != 0) {
            h0Var = dVar.f8099b;
        }
        return dVar.mo10739f(g4Var, h0Var);
    }

    @C12579k
    /* renamed from: a */
    public C15174d3 mo7615a(long j, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(dVar, "density");
        C15231i3 a = C15318t0.m66550a();
        a.mo42814o(new C15098i(0.0f, 0.0f, C15104m.m65023t(j), C15104m.m65016m(j)));
        C15231i3 a2 = C15318t0.m66550a();
        mo10734b(a2, layoutDirection, dVar);
        a2.mo42819s(a, a2, C15266m3.f37589b.mo42899a());
        return new C15174d3.C15175a(a2);
    }

    /* renamed from: b */
    public final void mo10734b(C15231i3 i3Var, LayoutDirection layoutDirection, C16479d dVar) {
        float g5 = dVar.mo7425g5(AppBarKt.f7507e);
        float f = ((float) 2) * g5;
        long a = C15106n.m65033a(((float) this.f8099b.mo10772c()) + f, ((float) this.f8099b.mo10770a()) + f);
        float b = ((float) this.f8099b.mo10771b()) - g5;
        float t = b + C15104m.m65023t(a);
        float m = C15104m.m65016m(a) / 2.0f;
        C15204e3.m65902b(i3Var, this.f8098a.mo7615a(a, layoutDirection, dVar));
        i3Var.mo42810j(C15096g.m64898a(b, -m));
        if (Intrinsics.areEqual((Object) this.f8098a, (Object) C2694o.m12169k())) {
            mo10735c(i3Var, b, t, m, dVar.mo7425g5(AppBarKt.f7508f), 0.0f);
        }
    }

    /* renamed from: c */
    public final void mo10735c(C15231i3 i3Var, float f, float f2, float f3, float f4, float f5) {
        float f6 = -((float) Math.sqrt((double) ((f3 * f3) - (f5 * f5))));
        float f7 = f3 + f6;
        float f8 = f + f7;
        float f9 = f2 - f7;
        Pair<Float, Float> m = AppBarKt.m13217m(f6 - 1.0f, f5, f3);
        float floatValue = m.mo21846a().floatValue() + f3;
        float floatValue2 = m.mo21847b().floatValue() - f5;
        float f10 = f8 - f4;
        i3Var.mo42815p(f10, 0.0f);
        i3Var.mo42804e(f8 - 1.0f, 0.0f, f + floatValue, floatValue2);
        i3Var.mo42823w(f2 - floatValue, floatValue2);
        i3Var.mo42804e(f9 + 1.0f, 0.0f, f4 + f9, 0.0f);
        i3Var.close();
    }

    @C12579k
    /* renamed from: d */
    public final C15218g4 mo10736d() {
        return this.f8098a;
    }

    @C12579k
    /* renamed from: e */
    public final C3047h0 mo10737e() {
        return this.f8099b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3034d)) {
            return false;
        }
        C3034d dVar = (C3034d) obj;
        return Intrinsics.areEqual((Object) this.f8098a, (Object) dVar.f8098a) && Intrinsics.areEqual((Object) this.f8099b, (Object) dVar.f8099b);
    }

    @C12579k
    /* renamed from: f */
    public final C3034d mo10739f(@C12579k C15218g4 g4Var, @C12579k C3047h0 h0Var) {
        Intrinsics.checkNotNullParameter(g4Var, "cutoutShape");
        Intrinsics.checkNotNullParameter(h0Var, "fabPlacement");
        return new C3034d(g4Var, h0Var);
    }

    @C12579k
    /* renamed from: h */
    public final C15218g4 mo10740h() {
        return this.f8098a;
    }

    public int hashCode() {
        return (this.f8098a.hashCode() * 31) + this.f8099b.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final C3047h0 mo10742i() {
        return this.f8099b;
    }

    @C12579k
    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.f8098a + ", fabPlacement=" + this.f8099b + ')';
    }
}
