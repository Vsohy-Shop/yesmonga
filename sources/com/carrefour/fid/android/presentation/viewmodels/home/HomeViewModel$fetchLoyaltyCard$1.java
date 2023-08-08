package com.carrefour.fid.android.presentation.viewmodels.home;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$fetchLoyaltyCard$1", mo22502f = "HomeViewModel.kt", mo22503i = {}, mo22504l = {115, 121}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class HomeViewModel$fetchLoyaltyCard$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ boolean $navigateToHome;
    Object L$0;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel$fetchLoyaltyCard$1(HomeViewModel homeViewModel, boolean z, C11045c<? super HomeViewModel$fetchLoyaltyCard$1> cVar) {
        super(2, cVar);
        this.this$0 = homeViewModel;
        this.$navigateToHome = z;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new HomeViewModel$fetchLoyaltyCard$1(this.this$0, this.$navigateToHome, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r13.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0098
        L_0x0013:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001b:
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0039
        L_0x0025:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel r14 = r13.this$0
            com.carrefour.fid.android.domain.interactors.user.e r14 = r14.f64495e
            com.carrefour.fid.android.domain.interactors.user.e$a r1 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r13.label = r3
            java.lang.Object r14 = r14.m172966invokegIAlus(r1, r13)
            if (r14 != r0) goto L_0x0039
            return r0
        L_0x0039:
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel r1 = r13.this$0
            boolean r4 = kotlin.Result.m38710j(r14)
            if (r4 == 0) goto L_0x0098
            r4 = r14
            com.carrefour.fid.android.domain.models.account.AccountInfo r4 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r4
            java.util.List r5 = r4.mo116669w()
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x0054
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            if (r3 != 0) goto L_0x008d
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r3 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            java.util.List r4 = r4.mo116669w()
            com.carrefour.fid.android.domain.models.account.UserCards r4 = r3.getMostRecentAndSecuredLoyaltyCard(r4)
            if (r4 == 0) goto L_0x0081
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r1 = r1.f64496f
            java.lang.String r5 = r4.mo116763k()
            java.lang.String r4 = r4.mo116763k()
            int r4 = r3.getTypeCard(r4)
            java.lang.String r3 = r3.buildCardNumberWithPrefix(r5, r4)
            r13.L$0 = r14
            r13.label = r2
            java.lang.Object r14 = r1.setLoyaltyCardNumber(r3, r13)
            if (r14 != r0) goto L_0x0098
            return r0
        L_0x0081:
            com.carrefour.fid.android.shared.util.i r1 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r2 = "User doesn't have loyalty card"
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r1, r2, r3, r4, r5, r6)
            goto L_0x0098
        L_0x008d:
            com.carrefour.fid.android.shared.util.i r7 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r8 = "User doesn't have any card"
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r7, r8, r9, r10, r11, r12)
        L_0x0098:
            boolean r14 = r13.$navigateToHome
            if (r14 == 0) goto L_0x00a7
            com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel r14 = r13.this$0
            com.carrefour.fid.android.shared.util.q r14 = r14.f64507q
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            r14.mo57496r(r0)
        L_0x00a7:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomeViewModel$fetchLoyaltyCard$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((HomeViewModel$fetchLoyaltyCard$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
