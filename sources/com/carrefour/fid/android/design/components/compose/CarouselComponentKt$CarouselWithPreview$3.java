package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.libs.pager.PagerState;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class CarouselComponentKt$CarouselWithPreview$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ C11300l<Integer, C11079d2> $onDismiss;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ List<String> $urls;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselComponentKt$CarouselWithPreview$3(List<String> list, PagerState pagerState, C11300l<? super Integer, C11079d2> lVar) {
        super(2);
        this.$urls = list;
        this.$pagerState = pagerState;
        this.$onDismiss = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1697859325, i2, -1, "com.carrefour.fid.android.design.components.compose.CarouselWithPreview.<anonymous> (CarouselComponent.kt:84)");
            }
            C8767m l = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null);
            final List<String> list = this.$urls;
            final PagerState pagerState = this.$pagerState;
            final C11300l<Integer, C11079d2> lVar = this.$onDismiss;
            SurfaceKt.m13879b(l, (C15218g4) null, 0, 0, (C2223i) null, 0.0f, C8553b.m31048b(oVar, -88425665, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-88425665, i, -1, "com.carrefour.fid.android.design.components.compose.CarouselWithPreview.<anonymous>.<anonymous> (CarouselComponent.kt:85)");
                        }
                        CarouselComponentKt.m151352e(list, pagerState.mo114114s(), lVar, oVar, 8, 0);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 1572870, 62);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
