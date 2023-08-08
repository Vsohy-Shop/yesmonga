package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.ComposableSingletons$CheckoutStep1FooterStatefulKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$CheckoutStep1FooterStatefulKt$lambda1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$CheckoutStep1FooterStatefulKt$lambda1$1 f59047f = new ComposableSingletons$CheckoutStep1FooterStatefulKt$lambda1$1();

    public ComposableSingletons$CheckoutStep1FooterStatefulKt$lambda1$1() {
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
                ComposerKt.m29845w0(1383389224, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.ComposableSingletons$CheckoutStep1FooterStatefulKt.lambda-1.<anonymous> (CheckoutStep1FooterStateful.kt:331)");
            }
            CheckoutStep1FooterStatefulKt.m103946b(new BasketAmounts(0, 2.0d, 6.0d, 4.0d, 8.0d, 10.0d, 12.0d, 13.0d, 15.0d, 17.0d, 19.0d, 24.01d, 20.0d, 22.0d, 1, (DefaultConstructorMarker) null), new BasketPromotionCode(22.4d, "NOEL10"), new BasketReturnableBags(3, 0.35d), 17, 5, true, false, (C11289a<C11079d2>) null, oVar, 1797704, 128);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
