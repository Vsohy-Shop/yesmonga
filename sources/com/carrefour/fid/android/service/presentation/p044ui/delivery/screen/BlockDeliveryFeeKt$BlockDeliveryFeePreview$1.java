package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.foundation.C2223i;
import androidx.compose.material.SurfaceKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.domain.models.service.models.DeliveryFee;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeeKt$BlockDeliveryFeePreview$1 */
public final class BlockDeliveryFeeKt$BlockDeliveryFeePreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ List<DeliveryFee> $fees;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockDeliveryFeeKt$BlockDeliveryFeePreview$1(List<DeliveryFee> list) {
        super(2);
        this.$fees = list;
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
                ComposerKt.m29845w0(-1365379978, i2, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeePreview.<anonymous> (BlockDeliveryFee.kt:81)");
            }
            final List<DeliveryFee> list = this.$fees;
            C8592o oVar2 = oVar;
            SurfaceKt.m13879b((C8767m) null, (C15218g4) null, 0, 0, (C2223i) null, 0.0f, C8553b.m31048b(oVar2, 99610290, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(99610290, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.BlockDeliveryFeePreview.<anonymous>.<anonymous> (BlockDeliveryFee.kt:82)");
                        }
                        BlockDeliveryFeeKt.BlockDeliveryFee(false, list, (C11289a<C11079d2>) null, oVar, 70, 4);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar2, 1572864, 63);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
