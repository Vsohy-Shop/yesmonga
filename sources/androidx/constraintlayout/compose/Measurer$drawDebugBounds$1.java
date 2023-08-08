package androidx.constraintlayout.compose;

import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class Measurer$drawDebugBounds$1 extends Lambda implements C11300l<C15187e, C11079d2> {
    final /* synthetic */ float $forcedScaleFactor;
    final /* synthetic */ Measurer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Measurer$drawDebugBounds$1(Measurer measurer, float f) {
        super(1);
        this.this$0 = measurer;
        this.$forcedScaleFactor = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C15187e) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C15187e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$Canvas");
        float p = ((float) this.this$0.mo48400p()) * this.$forcedScaleFactor;
        float o = ((float) this.this$0.mo48399o()) * this.$forcedScaleFactor;
        float t = (C15104m.m65023t(eVar.mo42718b()) - p) / 2.0f;
        float m = (C15104m.m65016m(eVar.mo42718b()) - o) / 2.0f;
        C15240j2.C15241a aVar = C15240j2.f37547b;
        float f = t + p;
        C15187e eVar2 = eVar;
        long w = aVar.mo42852w();
        float f2 = t;
        C15187e.m65695K2(eVar2, w, C15096g.m64898a(t, m), C15096g.m64898a(f, m), 0.0f, 0, (C15242j3) null, 0.0f, (C15249k2) null, 0, 504, (Object) null);
        float f3 = f;
        float f4 = m;
        float f5 = f4 + o;
        float f6 = f4;
        C15187e.m65695K2(eVar2, w, C15096g.m64898a(f3, f4), C15096g.m64898a(f3, f5), 0.0f, 0, (C15242j3) null, 0.0f, (C15249k2) null, 0, 504, (Object) null);
        float f7 = f5;
        long a = C15096g.m64898a(f3, f7);
        float f8 = f2;
        float f9 = f7;
        C15187e.m65695K2(eVar2, w, a, C15096g.m64898a(f8, f7), 0.0f, 0, (C15242j3) null, 0.0f, (C15249k2) null, 0, 504, (Object) null);
        float f10 = f8;
        float f11 = f6;
        C15187e.m65695K2(eVar2, w, C15096g.m64898a(f10, f9), C15096g.m64898a(f10, f11), 0.0f, 0, (C15242j3) null, 0.0f, (C15249k2) null, 0, 504, (Object) null);
        float f12 = (float) 1;
        float f13 = f10 + f12;
        float f14 = f11 + f12;
        float f15 = p + f13;
        C15187e eVar3 = eVar;
        long a2 = aVar.mo42841a();
        float f16 = f13;
        C15187e.m65695K2(eVar3, a2, C15096g.m64898a(f13, f14), C15096g.m64898a(f15, f14), 0.0f, 0, (C15242j3) null, 0.0f, (C15249k2) null, 0, 504, (Object) null);
        float f17 = f14;
        float f18 = f17 + o;
        float f19 = f17;
        C15187e.m65695K2(eVar3, a2, C15096g.m64898a(f15, f17), C15096g.m64898a(f15, f18), 0.0f, 0, (C15242j3) null, 0.0f, (C15249k2) null, 0, 504, (Object) null);
        float f20 = f18;
        long a3 = C15096g.m64898a(f15, f20);
        float f21 = f16;
        C15187e.m65695K2(eVar3, a2, a3, C15096g.m64898a(f21, f20), 0.0f, 0, (C15242j3) null, 0.0f, (C15249k2) null, 0, 504, (Object) null);
        C15187e.m65695K2(eVar3, a2, C15096g.m64898a(f21, f20), C15096g.m64898a(f21, f19), 0.0f, 0, (C15242j3) null, 0.0f, (C15249k2) null, 0, 504, (Object) null);
    }
}
