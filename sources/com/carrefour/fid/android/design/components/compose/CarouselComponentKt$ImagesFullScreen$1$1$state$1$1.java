package com.carrefour.fid.android.design.components.compose;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CarouselComponentKt$ImagesFullScreen$1$1$state$1$1 extends Lambda implements C11305q<Float, C15094f, Float, C11079d2> {
    final /* synthetic */ C8700z0<C15094f> $offset$delegate;
    final /* synthetic */ C8700z0<Float> $scale$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselComponentKt$ImagesFullScreen$1$1$state$1$1(C8700z0<Float> z0Var, C8700z0<C15094f> z0Var2) {
        super(3);
        this.$scale$delegate = z0Var;
        this.$offset$delegate = z0Var2;
    }

    /* renamed from: a */
    public final void mo111987a(float f, long j, float f2) {
        C8700z0<Float> z0Var = this.$scale$delegate;
        CarouselComponentKt$ImagesFullScreen$1$1.m151365g(z0Var, CarouselComponentKt$ImagesFullScreen$1$1.m151364f(z0Var) * f);
        C8700z0<C15094f> z0Var2 = this.$offset$delegate;
        CarouselComponentKt$ImagesFullScreen$1$1.m151367i(z0Var2, C15094f.m64886v(CarouselComponentKt$ImagesFullScreen$1$1.m151366h(z0Var2), j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo111987a(((Number) obj).floatValue(), ((C15094f) obj2).mo42242A(), ((Number) obj3).floatValue());
        return C11079d2.f28267a;
    }
}
