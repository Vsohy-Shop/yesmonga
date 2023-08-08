package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.presentation.models.CouponModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCouponsFlowRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsFlowRow.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponsFlowRowKt$CouponsFlowRow$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1855#2,2:47\n*S KotlinDebug\n*F\n+ 1 CouponsFlowRow.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/CouponsFlowRowKt$CouponsFlowRow$1\n*L\n35#1:47,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsFlowRowKt$CouponsFlowRow$1 */
public final class CouponsFlowRowKt$CouponsFlowRow$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<CouponModel> $coupons;
    final /* synthetic */ boolean $isOnStore;
    final /* synthetic */ List<String> $loadingButtonIds;
    final /* synthetic */ C11304p<CouponModel, Boolean, C11079d2> $onAddToCartClicked;
    final /* synthetic */ C11300l<CouponModel, C11079d2> $onCouponClicked;
    final /* synthetic */ C11300l<CouponModel, C11079d2> $onScanClicked;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsFlowRowKt$CouponsFlowRow$1(List<CouponModel> list, List<String> list2, boolean z, int i, C11300l<? super CouponModel, C11079d2> lVar, C11300l<? super CouponModel, C11079d2> lVar2, C11304p<? super CouponModel, ? super Boolean, C11079d2> pVar) {
        super(2);
        this.$coupons = list;
        this.$loadingButtonIds = list2;
        this.$isOnStore = z;
        this.$$dirty = i;
        this.$onCouponClicked = lVar;
        this.$onScanClicked = lVar2;
        this.$onAddToCartClicked = pVar;
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
                ComposerKt.m29845w0(2126626212, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsFlowRow.<anonymous> (CouponsFlowRow.kt:33)");
            }
            List<String> list = this.$loadingButtonIds;
            boolean z = this.$isOnStore;
            int i3 = this.$$dirty;
            C11300l<CouponModel, C11079d2> lVar = this.$onCouponClicked;
            C11300l<CouponModel, C11079d2> lVar2 = this.$onScanClicked;
            C11304p<CouponModel, Boolean, C11079d2> pVar = this.$onAddToCartClicked;
            for (CouponModel couponModel : this.$coupons) {
                boolean z2 = z;
                CouponItemKt.m105621b(couponModel, list.contains(couponModel.mo121396L()), z2, new CouponsFlowRowKt$CouponsFlowRow$1$1$1(lVar, couponModel), new CouponsFlowRowKt$CouponsFlowRow$1$1$2(lVar2, couponModel), new CouponsFlowRowKt$CouponsFlowRow$1$1$3(pVar, couponModel), oVar, ((i3 >> 3) & 896) | 8);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
