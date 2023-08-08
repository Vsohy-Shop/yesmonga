package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import androidx.lifecycle.C19423g0;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.presentation.models.CouponDetailsResult;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.CouponsFilter;
import com.carrefour.fid.android.presentation.models.FilterResult;
import com.carrefour.fid.android.presentation.p035ui.coupons.analytics.C23787a;
import com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$9 */
public final class CouponsListStatefulKt$CouponsListStateful$9 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ C23787a $analytics;
    final /* synthetic */ C11304p<Boolean, Pair<String, String>, C11079d2> $displaySnackbar;
    final /* synthetic */ FilterResult $filterResults;
    final /* synthetic */ C11289a<C11079d2> $navigateToBack;
    final /* synthetic */ C11289a<C11079d2> $navigateToBarCode;
    final /* synthetic */ C11305q<CouponModel, Boolean, Integer, C11079d2> $navigateToCouponDetails;
    final /* synthetic */ C11289a<C11079d2> $navigateToFidCard;
    final /* synthetic */ C11305q<List<CouponModel>, List<CouponsFilter>, Boolean, C11079d2> $navigateToFilters;
    final /* synthetic */ C11300l<CouponModel, C11079d2> $navigateToScanBarCode;
    final /* synthetic */ C38326b $performance;
    final /* synthetic */ C19423g0<CouponDetailsResult> $updatedCouponResult;
    final /* synthetic */ CouponsListViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$CouponsListStateful$9(CouponsListViewModel couponsListViewModel, C23787a aVar, C38326b bVar, FilterResult filterResult, C19423g0<CouponDetailsResult> g0Var, C11289a<C11079d2> aVar2, C11305q<? super List<CouponModel>, ? super List<CouponsFilter>, ? super Boolean, C11079d2> qVar, C11289a<C11079d2> aVar3, C11305q<? super CouponModel, ? super Boolean, ? super Integer, C11079d2> qVar2, C11300l<? super CouponModel, C11079d2> lVar, C11289a<C11079d2> aVar4, C11304p<? super Boolean, ? super Pair<String, String>, C11079d2> pVar, int i, int i2, int i3) {
        super(2);
        this.$viewModel = couponsListViewModel;
        this.$analytics = aVar;
        this.$performance = bVar;
        this.$filterResults = filterResult;
        this.$updatedCouponResult = g0Var;
        this.$navigateToBack = aVar2;
        this.$navigateToFilters = qVar;
        this.$navigateToFidCard = aVar3;
        this.$navigateToCouponDetails = qVar2;
        this.$navigateToScanBarCode = lVar;
        this.$navigateToBarCode = aVar4;
        this.$displaySnackbar = pVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CouponsListStatefulKt.m105534a(this.$viewModel, this.$analytics, this.$performance, this.$filterResults, this.$updatedCouponResult, this.$navigateToBack, this.$navigateToFilters, this.$navigateToFidCard, this.$navigateToCouponDetails, this.$navigateToScanBarCode, this.$navigateToBarCode, this.$displaySnackbar, oVar, C8590n1.m31123a(this.$$changed | 1), C8590n1.m31123a(this.$$changed1), this.$$default);
    }
}
