package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import androidx.compose.material.C3036d1;
import androidx.compose.material.DrawerState;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.design.components.compose.Variant;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state.C26102a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.state.C26105b;
import com.carrefour.fid.android.shared.type.C28892e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$DrivePreview$1 */
public final class CheckoutStep2ScreenKt$DrivePreview$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ Basket $basket;
    final /* synthetic */ BasketPromotionCode $basketPromoCode;
    final /* synthetic */ Address $billingAddress;
    final /* synthetic */ C26102a.C26104b $serviceState;
    final /* synthetic */ C26105b.C26107b $slotSectionState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ScreenKt$DrivePreview$1(Basket basket, C26102a.C26104b bVar, Address address, C26105b.C26107b bVar2, BasketPromotionCode basketPromotionCode) {
        super(2);
        this.$basket = basket;
        this.$serviceState = bVar;
        this.$billingAddress = address;
        this.$slotSectionState = bVar2;
        this.$basketPromoCode = basketPromotionCode;
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
                ComposerKt.m29845w0(-1919795562, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.DrivePreview.<anonymous> (CheckoutStep2Screen.kt:715)");
            }
            C3036d1 f = ScaffoldKt.m13752f((DrawerState) null, (SnackbarHostState) null, oVar, 0, 3);
            Variant variant = Variant.Success;
            Basket basket = this.$basket;
            C26102a.C26104b bVar = this.$serviceState;
            Address address = this.$billingAddress;
            C26105b.C26107b bVar2 = this.$slotSectionState;
            C28892e.C28895c cVar = r1;
            C28892e.C28895c cVar2 = new C28892e.C28895c(this.$basketPromoCode.mo116939f());
            CheckoutStep2ScreenKt.m104364a(f, variant, basket, false, bVar, address, bVar2, cVar, true, true, C233961.f59216f, C233972.f59217f, C233983.f59218f, C233994.f59219f, C234005.f59220f, C234016.f59221f, C234027.f59222f, oVar, ((C28892e.C28895c.f70783c | 0) << 21) | 908365360, 1797558);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
