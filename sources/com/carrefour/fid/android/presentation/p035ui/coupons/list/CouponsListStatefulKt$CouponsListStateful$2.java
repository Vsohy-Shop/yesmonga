package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.domain.interactors.coupons.C37643a;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.presentation.models.CouponModel;
import com.carrefour.fid.android.presentation.models.CouponsFilter;
import com.carrefour.fid.android.presentation.p035ui.coupons.analytics.C23787a;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.C23843c;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.components.TabPage;
import com.carrefour.fid.android.presentation.viewmodels.coupons.C26221d;
import com.carrefour.fid.android.presentation.viewmodels.coupons.CouponsListViewModel;
import com.carrefour.fid.android.shared.type.C28897f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCouponsListStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/CouponsListStatefulKt$CouponsListStateful$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,661:1\n766#2:662\n857#2,2:663\n*S KotlinDebug\n*F\n+ 1 CouponsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/CouponsListStatefulKt$CouponsListStateful$2\n*L\n110#1:662\n110#1:663,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$CouponsListStateful$2 */
public final class CouponsListStatefulKt$CouponsListStateful$2 extends Lambda implements C11300l<C23843c, C11079d2> {
    final /* synthetic */ C23787a $analytics;
    final /* synthetic */ C11289a<C11079d2> $navigateToBack;
    final /* synthetic */ C11289a<C11079d2> $navigateToBarCode;
    final /* synthetic */ C11305q<CouponModel, Boolean, Integer, C11079d2> $navigateToCouponDetails;
    final /* synthetic */ C11289a<C11079d2> $navigateToFidCard;
    final /* synthetic */ C11305q<List<CouponModel>, List<CouponsFilter>, Boolean, C11079d2> $navigateToFilters;
    final /* synthetic */ C11300l<CouponModel, C11079d2> $navigateToScanBarCode;
    final /* synthetic */ C8700z0<Integer> $numberActivateCoupon;
    final /* synthetic */ C8700z0<Boolean> $openBurnedCacheDialog;
    final /* synthetic */ C38326b $performance;
    final /* synthetic */ C8700z0<TabPage> $selectedTab;
    final /* synthetic */ C8578k2<C26221d> $state;
    final /* synthetic */ CouponsListViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$CouponsListStateful$2(C8700z0<TabPage> z0Var, C23787a aVar, C8700z0<Boolean> z0Var2, CouponsListViewModel couponsListViewModel, C8578k2<C26221d> k2Var, C8700z0<Integer> z0Var3, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11300l<? super CouponModel, C11079d2> lVar, C11305q<? super CouponModel, ? super Boolean, ? super Integer, C11079d2> qVar, C38326b bVar, C11289a<C11079d2> aVar4, C11305q<? super List<CouponModel>, ? super List<CouponsFilter>, ? super Boolean, C11079d2> qVar2) {
        super(1);
        this.$selectedTab = z0Var;
        this.$analytics = aVar;
        this.$openBurnedCacheDialog = z0Var2;
        this.$viewModel = couponsListViewModel;
        this.$state = k2Var;
        this.$numberActivateCoupon = z0Var3;
        this.$navigateToBack = aVar2;
        this.$navigateToFidCard = aVar3;
        this.$navigateToScanBarCode = lVar;
        this.$navigateToCouponDetails = qVar;
        this.$performance = bVar;
        this.$navigateToBarCode = aVar4;
        this.$navigateToFilters = qVar2;
    }

    /* renamed from: a */
    public final void mo69775a(@C12579k C23843c cVar) {
        List<CouponModel> list;
        List list2;
        List<CouponModel> i;
        Intrinsics.checkNotNullParameter(cVar, "action");
        if (Intrinsics.areEqual((Object) cVar, (Object) C23843c.C23855d.f59976a)) {
            if (this.$selectedTab.getValue() == TabPage.IN_STORE) {
                this.$analytics.mo69674c();
            } else {
                this.$analytics.mo69681j();
            }
            this.$openBurnedCacheDialog.setValue(Boolean.FALSE);
            CouponsListViewModel couponsListViewModel = this.$viewModel;
            C37643a aVar = (C37643a) C28897f.m119478b(this.$state.getValue().mo76283f());
            if (aVar == null || (i = aVar.mo114618i()) == null) {
                list2 = CollectionsKt__CollectionsKt.m40441E();
            } else {
                list2 = new ArrayList();
                for (Object next : i) {
                    if (((CouponModel) next).isSelected()) {
                        list2.add(next);
                    }
                }
            }
            couponsListViewModel.mo76258k0(list2);
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C23843c.C23854c.f59974a)) {
            if (this.$selectedTab.getValue() == TabPage.IN_STORE) {
                this.$analytics.mo69688q();
            } else {
                this.$analytics.mo69686o();
            }
            this.$openBurnedCacheDialog.setValue(Boolean.FALSE);
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C23843c.C23857f.f59980a)) {
            this.$openBurnedCacheDialog.setValue(Boolean.TRUE);
            this.$numberActivateCoupon.setValue(Integer.valueOf(this.$viewModel.mo76261n0()));
            this.$analytics.mo69682k();
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C23843c.C23858g.f59982a)) {
            this.$viewModel.mo76260m0();
        } else if (cVar instanceof C23843c.C23849b) {
            C23787a aVar2 = this.$analytics;
            final C8700z0<TabPage> z0Var = this.$selectedTab;
            C11289a<C11079d2> aVar3 = this.$navigateToBack;
            final C8578k2<C26221d> k2Var = this.$state;
            final C11305q<List<CouponModel>, List<CouponsFilter>, Boolean, C11079d2> qVar = this.$navigateToFilters;
            CouponsListStatefulKt.m105549p((C23843c.C23849b) cVar, aVar2, z0Var, aVar3, new C11289a<C11079d2>() {
                public final void invoke() {
                    C37643a aVar = (C37643a) C28897f.m119478b(k2Var.getValue().mo76283f());
                    if (aVar != null) {
                        qVar.invoke(CollectionsKt___CollectionsKt.m40718y4(aVar.mo114618i(), aVar.mo114619j()), aVar.mo114616h(), Boolean.valueOf(z0Var.getValue() == TabPage.IN_STORE && !k2Var.getValue().mo76285h()));
                    }
                }
            }, this.$navigateToFidCard);
        } else if (cVar instanceof C23843c.C23844a) {
            C23843c.C23844a aVar4 = (C23843c.C23844a) cVar;
            C23787a aVar5 = this.$analytics;
            CouponsListViewModel couponsListViewModel2 = this.$viewModel;
            C11300l<CouponModel, C11079d2> lVar = this.$navigateToScanBarCode;
            C37643a aVar6 = (C37643a) C28897f.m119478b(this.$state.getValue().mo76283f());
            if (aVar6 == null || (list = aVar6.mo114618i()) == null) {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            CouponsListStatefulKt.m105547n(aVar4, aVar5, couponsListViewModel2, lVar, list, this.$navigateToCouponDetails);
        } else if (cVar instanceof C23843c.C23859h) {
            CouponsListStatefulKt.m105548o((C23843c.C23859h) cVar, this.$performance);
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C23843c.C23856e.f59978a)) {
            if (this.$selectedTab.getValue() == TabPage.IN_STORE) {
                this.$analytics.mo69687p();
            } else {
                this.$analytics.mo69685n();
            }
            this.$navigateToBarCode.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo69775a((C23843c) obj);
        return C11079d2.f28267a;
    }
}
