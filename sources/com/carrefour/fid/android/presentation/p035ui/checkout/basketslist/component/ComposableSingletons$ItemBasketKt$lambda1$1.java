package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.component;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketLoyaltyCard;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import com.carrefour.fid.android.domain.models.basket.BasketServiceType;
import com.carrefour.fid.android.domain.models.basket.BasketSlot;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.contentsquare.android.api.C14092c;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ComposableSingletons$ItemBasketKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$ItemBasketKt$lambda1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$ItemBasketKt$lambda1$1 f59332f = new ComposableSingletons$ItemBasketKt$lambda1$1();

    public ComposableSingletons$ItemBasketKt$lambda1$1() {
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
                ComposerKt.m29845w0(-1147755422, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ComposableSingletons$ItemBasketKt.lambda-1.<anonymous> (ItemBasket.kt:213)");
            }
            ItemBasketKt.m104560a(new Basket((BasketAmounts) null, (List) null, (List) null, (String) null, false, (BasketLoyaltyCard) null, (List) null, (String) null, 23, (BasketPromotionCode) null, (Map) null, (String) null, (BasketServiceType) null, (BasketSlot) null, (String) null, BasketType.BASKET_V4_DRIVE, (Integer) null, (List) null, (BasketReturnableBags) null, 491263, (DefaultConstructorMarker) null), false, C234671.f59333f, oVar, C14092c.f34507C0, 2);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
