package com.carrefour.fid.android.service.presentation.p044ui.delivery.screen;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.service.C28330R;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.screen.ComposableSingletons$ItemDeliveryFeePriceKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$ItemDeliveryFeePriceKt$lambda2$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    public static final ComposableSingletons$ItemDeliveryFeePriceKt$lambda2$1 INSTANCE = new ComposableSingletons$ItemDeliveryFeePriceKt$lambda2$1();

    public ComposableSingletons$ItemDeliveryFeePriceKt$lambda2$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-414165790, i, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.screen.ComposableSingletons$ItemDeliveryFeePriceKt.lambda-2.<anonymous> (ItemDeliveryFeePrice.kt:99)");
            }
            ItemDeliveryFeePriceKt.ItemDeliveryFeePrice((C8767m) null, C16018i.m71859e(C28330R.string.delivery_summary_pregnant_women, new Object[]{20, 793}, oVar, 64), 0.0d, oVar, C22132b.f56831b, 1);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
