package com.carrefour.fid.android.shared.presentation.components.shape;

import androidx.compose.p004ui.geometry.C15090b;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15100j;
import androidx.compose.p004ui.geometry.C15103l;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15174d3;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15266m3;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nRoundedCutoutShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCutoutShape.kt\ncom/carrefour/fid/android/shared/presentation/components/shape/RoundedCutoutShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.presentation.components.shape.b */
public final class C28854b implements C15218g4 {

    /* renamed from: c */
    public static final int f70679c = 0;
    @C12580l

    /* renamed from: a */
    public final Float f70680a;

    /* renamed from: b */
    public final float f70681b;

    public /* synthetic */ C28854b(Float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    @C12579k
    /* renamed from: b */
    public C15174d3.C15175a mo7615a(long j, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(dVar, "density");
        float g5 = dVar.mo7425g5(this.f70681b);
        C15098i c = C15100j.m64956c(C15094f.f37256b.mo42248e(), j);
        C15231i3 a = C15318t0.m66550a();
        a.mo42817r(C15103l.m64990f(c, C15090b.m64846b(g5, 0.0f, 2, (Object) null)));
        if (this.f70680a != null) {
            C15231i3 a2 = C15318t0.m66550a();
            long w = C15104m.m65026w(C15106n.m65033a(g5, g5), 2.0f);
            float f = (float) 15;
            float f2 = (float) 2;
            C15098i c2 = C15100j.m64956c(C15096g.m64898a((((float) 0) - (C15104m.m65023t(w) * (((float) 1) - 0.25f))) + f, this.f70680a.floatValue() - (C15104m.m65016m(w) / f2)), w);
            C15098i c3 = C15100j.m64956c(C15096g.m64898a((c.mo42253G() - (C15104m.m65023t(w) * 0.25f)) - f, this.f70680a.floatValue() - (C15104m.m65016m(w) / f2)), w);
            a2.mo42808h(c2);
            a2.mo42808h(c3);
            C15231i3 a3 = C15318t0.m66550a();
            a3.mo42819s(a, a2, C15266m3.f37589b.mo42899a());
            a = a3;
        }
        return new C15174d3.C15175a(a);
    }

    public C28854b(Float f, float f2) {
        this.f70680a = f;
        this.f70681b = f2;
    }
}
