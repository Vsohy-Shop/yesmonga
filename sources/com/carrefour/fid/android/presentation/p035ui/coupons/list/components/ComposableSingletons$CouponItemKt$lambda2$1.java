package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.data.entities.coupons.CouponType;
import com.carrefour.fid.android.domain.models.DiscountType;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.Facility;
import com.carrefour.fid.android.presentation.models.Image;
import com.carrefour.fid.android.presentation.p035ui.coupons.helpers.C23815a;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.google.firebase.installations.local.C33093b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.ComposableSingletons$CouponItemKt$lambda-2$1  reason: invalid class name */
public final class ComposableSingletons$CouponItemKt$lambda2$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$CouponItemKt$lambda2$1 f59998f = new ComposableSingletons$CouponItemKt$lambda2$1();

    public ComposableSingletons$CouponItemKt$lambda2$1() {
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
                ComposerKt.m29845w0(1183534110, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.ComposableSingletons$CouponItemKt.lambda-2.<anonymous> (CouponItem.kt:425)");
            }
            DiscountType discountType = DiscountType.AMOUNT;
            CouponType couponType = CouponType.OMNICOUPON;
            List E = CollectionsKt__CollectionsKt.m40441E();
            CouponStatus couponStatus = CouponStatus.EMITTED;
            Image image = r0;
            Image image2 = new Image(C28547h2.f69315c, "1edbd795802131daa479be9803e00aed", "00311085-psd-DOPrint-400.jpg");
            CouponItemKt.m105621b(new CouponModel(7894518948L, "Description", "Description field", "epiceriesucree", couponType, "2022-12-01", "2023-04-25", 509777758, "0", E, C23815a.C23817b.f59931b, Double.valueOf(95.0d), discountType, C33093b.f80279g, couponStatus, image, CollectionsKt__CollectionsKt.m40441E(), "1 acheté = 0,40€ de remise", (Facility) null, "CAISSE", (CouponModel.State) null, (String) null, 3145728, (DefaultConstructorMarker) null), false, true, C238671.f59999f, C238682.f60000f, C238693.f60001f, oVar, 224696);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
