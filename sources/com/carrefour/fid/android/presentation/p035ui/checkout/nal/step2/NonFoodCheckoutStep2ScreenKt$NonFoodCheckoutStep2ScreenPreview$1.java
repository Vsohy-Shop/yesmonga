package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.C3036d1;
import androidx.compose.material.DrawerState;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2ScreenPreview$1 */
public final class NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2ScreenPreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ BasketAmounts $basketAmounts;
    final /* synthetic */ BasketPromotionCode $basketPromoCode;
    final /* synthetic */ Address $billingAddress;
    final /* synthetic */ C26191b.C26192a $cardFid;
    final /* synthetic */ Address $deliveryAddress;
    final /* synthetic */ List<C26191b.C26193b> $selectableDeliveryModes;
    final /* synthetic */ String $telephone;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2ScreenPreview$1(List<C26191b.C26193b> list, Address address, Address address2, String str, BasketAmounts basketAmounts, BasketPromotionCode basketPromotionCode, C26191b.C26192a aVar) {
        super(2);
        this.$selectableDeliveryModes = list;
        this.$deliveryAddress = address;
        this.$billingAddress = address2;
        this.$telephone = str;
        this.$basketAmounts = basketAmounts;
        this.$basketPromoCode = basketPromotionCode;
        this.$cardFid = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1850842236, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenPreview.<anonymous> (NonFoodCheckoutStep2Screen.kt:903)");
            }
            C28892e.C28896d dVar = C28892e.C28896d.f70785b;
            C3036d1 f = ScaffoldKt.m13752f((DrawerState) null, (SnackbarHostState) null, oVar2, 0, 3);
            LazyListState a = LazyListStateKt.m10895a(0, 0, oVar2, 0, 3);
            NonFoodCheckoutStep2ScreenKt.m104879h(this.$selectableDeliveryModes, (C38080a) null, this.$deliveryAddress, this.$billingAddress, this.$telephone, this.$basketAmounts, this.$basketPromoCode, 11, false, dVar, true, this.$cardFid, f, a, false, C236061.f59561f, oVar, (C28892e.C28896d.f70786c << 27) | 115634744, 221190, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
