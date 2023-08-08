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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$onRequestSlotSelection$1", mo22502f = "HomePageViewModel.kt", mo22503i = {1, 1, 2, 2, 2}, mo22504l = {344, 350, 351, 353}, mo22505m = "invokeSuspend", mo22506n = {"selectedService", "serviceType", "selectedService", "serviceType", "basket"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class HomePageViewModel$onRequestSlotSelection$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HomePageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomePageViewModel$onRequestSlotSelection$1(HomePageViewModel homePageViewModel, C11045c<? super HomePageViewModel$onRequestSlotSelection$1> cVar) {
        super(2, cVar);
        this.this$0 = homePageViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new HomePageViewModel$onRequestSlotSelection$1(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013f  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r14.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0049
            if (r1 == r5) goto L_0x0045
            if (r1 == r4) goto L_0x0033
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            kotlin.C11661u0.m45747n(r15)
            goto L_0x013c
        L_0x001a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0022:
            java.lang.Object r1 = r14.L$2
            com.carrefour.fid.android.domain.models.basket.Basket r1 = (com.carrefour.fid.android.domain.models.basket.Basket) r1
            java.lang.Object r3 = r14.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r3 = (com.carrefour.fid.android.domain.models.service.models.StoreServiceType) r3
            java.lang.Object r4 = r14.L$0
            com.carrefour.fid.android.domain.models.service.models.StoreService r4 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r4
            kotlin.C11661u0.m45747n(r15)
            goto L_0x00cf
        L_0x0033:
            java.lang.Object r1 = r14.L$1
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r1 = (com.carrefour.fid.android.domain.models.service.models.StoreServiceType) r1
            java.lang.Object r4 = r14.L$0
            com.carrefour.fid.android.domain.models.service.models.StoreService r4 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r4
            kotlin.C11661u0.m45747n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.mo21858l()
            goto L_0x00ad
        L_0x0045:
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0082
        L_0x0049:
            kotlin.C11661u0.m45747n(r15)
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r15 = r14.this$0
            kotlinx.coroutines.flow.j r15 = r15.f64415B0
            java.lang.Object r15 = r15.getValue()
            com.carrefour.fid.android.domain.models.service.models.k r15 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r15
            if (r15 == 0) goto L_0x0142
            com.carrefour.fid.android.domain.models.service.models.StoreService r15 = r15.mo119354f()
            if (r15 != 0) goto L_0x0062
            goto L_0x0142
        L_0x0062:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r1 = r15.mo119176T()
            if (r1 != 0) goto L_0x006b
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        L_0x006b:
            boolean r7 = com.carrefour.fid.android.service.domain.extension.StoreServiceKt.isH1h3(r15)
            if (r7 == 0) goto L_0x008e
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r15 = r14.this$0
            kotlinx.coroutines.channels.g r15 = r15.f64487x0
            com.carrefour.fid.android.presentation.viewmodels.home.event.a$a r1 = com.carrefour.fid.android.presentation.viewmodels.home.event.C26385a.C26386a.f64525a
            r14.label = r5
            java.lang.Object r15 = r15.mo23757h0(r1, r14)
            if (r15 != r0) goto L_0x0082
            return r0
        L_0x0082:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r15 = r14.this$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r15 = r15.f64417D
            r15.mo76681B()
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        L_0x008e:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r7 = r14.this$0
            com.carrefour.fid.android.presentation.viewmodels.home.HomeAnalyticsViewModel r7 = r7.f64417D
            r7.mo76682C()
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r7 = r14.this$0
            com.carrefour.fid.android.domain.interactors.basket.e0 r7 = r7.f64425L
            r14.L$0 = r15
            r14.L$1 = r1
            r14.label = r4
            java.lang.Object r4 = r7.m172965invokeIoAF18A(r14)
            if (r4 != r0) goto L_0x00aa
            return r0
        L_0x00aa:
            r13 = r4
            r4 = r15
            r15 = r13
        L_0x00ad:
            boolean r7 = kotlin.Result.m38709i(r15)
            if (r7 == 0) goto L_0x00b4
            r15 = r6
        L_0x00b4:
            com.carrefour.fid.android.domain.models.basket.Basket r15 = (com.carrefour.fid.android.domain.models.basket.Basket) r15
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r7 = r14.this$0
            com.carrefour.fid.android.account.data.repositories.AccountRepository r7 = r7.f64472q
            r14.L$0 = r4
            r14.L$1 = r1
            r14.L$2 = r15
            r14.label = r3
            java.lang.Object r3 = r7.mo31329n(r14)
            if (r3 != r0) goto L_0x00cb
            return r0
        L_0x00cb:
            r13 = r1
            r1 = r15
            r15 = r3
            r3 = r13
        L_0x00cf:
            com.carrefour.fid.android.domain.models.account.AccountInfo r15 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r15
            if (r15 == 0) goto L_0x013f
            com.carrefour.fid.android.domain.models.account.Address r15 = com.carrefour.fid.android.account.presentation.models.extension.C13315a.m57643b(r15)
            if (r15 != 0) goto L_0x00da
            goto L_0x013f
        L_0x00da:
            com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel r7 = r14.this$0
            kotlinx.coroutines.channels.g r7 = r7.f64487x0
            if (r1 == 0) goto L_0x010d
            java.util.List r8 = r1.mo116817B()
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r5 = r5 ^ r8
            if (r5 == 0) goto L_0x010d
            boolean r5 = r4.mo119183a0()
            if (r5 != 0) goto L_0x00fb
            boolean r5 = r4.mo119187c0()
            if (r5 == 0) goto L_0x010d
        L_0x00fb:
            com.carrefour.fid.android.presentation.viewmodels.home.event.a$b r15 = new com.carrefour.fid.android.presentation.viewmodels.home.event.a$b
            java.lang.String r3 = r4.mo119163G()
            java.lang.String r3 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r3)
            com.carrefour.fid.android.domain.models.basket.BasketSlot r1 = r1.mo116826K()
            r15.<init>(r3, r1, r6)
            goto L_0x012d
        L_0x010d:
            com.carrefour.fid.android.presentation.viewmodels.home.event.a$c r4 = new com.carrefour.fid.android.presentation.viewmodels.home.event.a$c
            com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome r5 = new com.carrefour.fid.android.checkout.presentation.viewmodels.slot.mvi.SlotArgsHome
            com.carrefour.fid.android.domain.models.LatLon r8 = new com.carrefour.fid.android.domain.models.LatLon
            double r9 = r15.mo116691P()
            double r11 = r15.mo116693R()
            r8.<init>(r9, r11)
            r5.<init>(r8, r3)
            if (r1 == 0) goto L_0x0128
            com.carrefour.fid.android.domain.models.basket.BasketSlot r15 = r1.mo116826K()
            goto L_0x0129
        L_0x0128:
            r15 = r6
        L_0x0129:
            r4.<init>(r5, r15)
            r15 = r4
        L_0x012d:
            r14.L$0 = r6
            r14.L$1 = r6
            r14.L$2 = r6
            r14.label = r2
            java.lang.Object r15 = r7.mo23757h0(r15, r14)
            if (r15 != r0) goto L_0x013c
            return r0
        L_0x013c:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        L_0x013f:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        L_0x0142:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel$onRequestSlotSelection$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((HomePageViewModel$onRequestSlotSelection$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
