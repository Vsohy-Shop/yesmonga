package com.carrefour.fid.android.checkout.presentation.p071ui.basket.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutSummary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutSummary.kt\ncom/carrefour/fid/android/checkout/presentation/ui/basket/component/ComposableSingletons$CheckoutSummaryKt$lambda-3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,327:1\n154#2:328\n*S KotlinDebug\n*F\n+ 1 CheckoutSummary.kt\ncom/carrefour/fid/android/checkout/presentation/ui/basket/component/ComposableSingletons$CheckoutSummaryKt$lambda-3$1\n*L\n303#1:328\n*E\n"})
/* renamed from: com.carrefour.fid.android.checkout.presentation.ui.basket.component.ComposableSingletons$CheckoutSummaryKt$lambda-3$1  reason: invalid class name */
public final class ComposableSingletons$CheckoutSummaryKt$lambda3$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$CheckoutSummaryKt$lambda3$1 f101727f = new ComposableSingletons$CheckoutSummaryKt$lambda3$1();

    public ComposableSingletons$CheckoutSummaryKt$lambda3$1() {
        super(2);
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
                ComposerKt.m29845w0(1561769546, i2, -1, "com.carrefour.fid.android.checkout.presentation.ui.basket.component.ComposableSingletons$CheckoutSummaryKt.lambda-3.<anonymous> (CheckoutSummary.kt:297)");
            }
            CheckoutSummaryKt.m162552a(PaddingKt.m10024k(BackgroundKt.m8825d(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C37475b.f94185a.mo114231a0(), (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 16)), new BasketAmounts(0, 2.0d, 1.51d, 4.0d, 7.9d, 50.74d, 0.62d, 13.0d, 15.0d, 17.0d, 49.23d, 50.73d, 20.0d, 1.51d, 1, (DefaultConstructorMarker) null), new BasketPromotionCode(5.0d, "NOEL10"), new BasketReturnableBags(3, 0.35d), 17, true, 2, oVar, 1798720, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
