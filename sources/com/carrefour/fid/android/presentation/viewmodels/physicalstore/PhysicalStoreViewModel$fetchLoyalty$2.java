package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchLoyalty$2", mo22502f = "PhysicalStoreViewModel.kt", mo22503i = {0, 1, 1, 2, 2}, mo22504l = {196, 205, 236}, mo22505m = "invokeSuspend", mo22506n = {"$this$coroutineScope", "$this$coroutineScope", "loyaltyCard", "$this$coroutineScope", "loyaltyCard"}, mo22507s = {"L$0", "L$0", "L$3", "L$0", "L$3"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPhysicalStoreViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/physicalstore/PhysicalStoreViewModel$fetchLoyalty$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,334:1\n230#2,5:335\n230#2,5:340\n230#2,5:345\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/physicalstore/PhysicalStoreViewModel$fetchLoyalty$2\n*L\n199#1:335,5\n209#1:340,5\n222#1:345,5\n*E\n"})
public final class PhysicalStoreViewModel$fetchLoyalty$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PhysicalStoreViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreViewModel$fetchLoyalty$2(PhysicalStoreViewModel physicalStoreViewModel, C11045c<? super PhysicalStoreViewModel$fetchLoyalty$2> cVar) {
        super(2, cVar);
        this.this$0 = physicalStoreViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PhysicalStoreViewModel$fetchLoyalty$2 physicalStoreViewModel$fetchLoyalty$2 = new PhysicalStoreViewModel$fetchLoyalty$2(this.this$0, cVar);
        physicalStoreViewModel$fetchLoyalty$2.L$0 = obj;
        return physicalStoreViewModel$fetchLoyalty$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0159 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x017b A[LOOP:1: B:33:0x00f0->B:40:0x017b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0132 A[EDGE_INSN: B:49:0x0132->B:35:0x0132 ?: BREAK  , SYNTHETIC] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x002d
            if (r2 != r3) goto L_0x0025
            java.lang.Object r1 = r0.L$3
            com.carrefour.fid.android.domain.models.account.UserCards r1 = (com.carrefour.fid.android.domain.models.account.UserCards) r1
            java.lang.Object r2 = r0.L$2
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel) r2
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.o0 r3 = (kotlinx.coroutines.C12074o0) r3
            kotlin.C11661u0.m45747n(r21)
            goto L_0x015d
        L_0x0025:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002d:
            java.lang.Object r2 = r0.L$3
            com.carrefour.fid.android.domain.models.account.UserCards r2 = (com.carrefour.fid.android.domain.models.account.UserCards) r2
            java.lang.Object r4 = r0.L$2
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r4 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel) r4
            java.lang.Object r7 = r0.L$1
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.o0 r8 = (kotlinx.coroutines.C12074o0) r8
            kotlin.C11661u0.m45747n(r21)
            r3 = r4
            r4 = r21
            goto L_0x00da
        L_0x0043:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.o0 r2 = (kotlinx.coroutines.C12074o0) r2
            kotlin.C11661u0.m45747n(r21)
            r7 = r21
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x006d
        L_0x0053:
            kotlin.C11661u0.m45747n(r21)
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.o0 r2 = (kotlinx.coroutines.C12074o0) r2
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r7 = r0.this$0
            com.carrefour.fid.android.domain.interactors.user.e r7 = r7.f65908d
            com.carrefour.fid.android.domain.interactors.user.e$a r8 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r7 = r7.m172966invokegIAlus(r8, r0)
            if (r7 != r1) goto L_0x006d
            return r1
        L_0x006d:
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r8 = r0.this$0
            java.lang.Throwable r9 = kotlin.Result.m38705e(r7)
            if (r9 == 0) goto L_0x00a4
            kotlinx.coroutines.flow.j r8 = r8.mo78804w0()
        L_0x0079:
            java.lang.Object r9 = r8.getValue()
            r10 = r9
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r10 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r10
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r15 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.b
            com.carrefour.fid.android.presentation.viewmodels.home.state.g$b r12 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g.C26503b.f64775a
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            r11 = r15
            r3 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r3 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r10, r6, r3, r5, r6)
            boolean r3 = r8.mo24216e(r9, r3)
            if (r3 == 0) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r3 = 3
            goto L_0x0079
        L_0x00a4:
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r3 = r0.this$0
            boolean r8 = kotlin.Result.m38710j(r7)
            if (r8 == 0) goto L_0x01a5
            r8 = r7
            com.carrefour.fid.android.domain.models.account.AccountInfo r8 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r8
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r9 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            java.util.List r10 = r8.mo116669w()
            com.carrefour.fid.android.domain.models.account.UserCards r9 = r9.getMostRecentAndSecuredLoyaltyCard(r10)
            java.util.List r8 = r8.mo116669w()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x017e
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r8 = r3.f65909e
            r0.L$0 = r2
            r0.L$1 = r7
            r0.L$2 = r3
            r0.L$3 = r9
            r0.label = r4
            java.lang.Object r4 = r8.hasLoyaltyCard(r0)
            if (r4 != r1) goto L_0x00d8
            return r1
        L_0x00d8:
            r8 = r2
            r2 = r9
        L_0x00da:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x017e
            if (r2 == 0) goto L_0x017e
            boolean r4 = r2.mo116764l()
            if (r4 != 0) goto L_0x00ec
            goto L_0x017e
        L_0x00ec:
            kotlinx.coroutines.flow.j r4 = r3.mo78804w0()
        L_0x00f0:
            java.lang.Object r9 = r4.getValue()
            r10 = r9
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r10 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r10
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r11 = r10.mo78876e()
            com.carrefour.fid.android.presentation.viewmodels.home.state.g$a r12 = new com.carrefour.fid.android.presentation.viewmodels.home.state.g$a
            java.lang.String r13 = r2.mo116763k()
            com.carrefour.fid.android.core.type.LoyaltyCardType$a r14 = com.carrefour.fid.android.core.type.LoyaltyCardType.f89888a
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r15 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            java.lang.String r5 = r2.mo116763k()
            int r5 = r15.getTypeCard(r5)
            com.carrefour.fid.android.core.type.LoyaltyCardType r5 = r14.mo108568a(r5)
            com.carrefour.fid.android.presentation.models.UserCardModel r14 = new com.carrefour.fid.android.presentation.models.UserCardModel
            r14.<init>(r5, r13)
            r12.<init>(r14)
            r13 = 0
            r14 = 0
            r5 = 0
            r16 = 14
            r17 = 0
            r19 = r15
            r15 = r5
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r5 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27115b.m114624f(r11, r12, r13, r14, r15, r16, r17)
            r11 = 1
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r5 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r10, r6, r5, r11, r6)
            boolean r5 = r4.mo24216e(r9, r5)
            if (r5 == 0) goto L_0x017b
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r4 = r3.f65909e
            java.lang.String r5 = r2.mo116763k()
            java.lang.String r9 = r2.mo116763k()
            r10 = r19
            int r9 = r10.getTypeCard(r9)
            java.lang.String r5 = r10.buildCardNumberWithPrefix(r5, r9)
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r3
            r0.L$3 = r2
            r9 = 3
            r0.label = r9
            java.lang.Object r4 = r4.setLoyaltyCardNumber(r5, r0)
            if (r4 != r1) goto L_0x015a
            return r1
        L_0x015a:
            r1 = r2
            r2 = r3
            r3 = r8
        L_0x015d:
            r8 = 0
            r9 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchLoyalty$2$2$3 r10 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchLoyalty$2$2$3
            r10.<init>(r2, r1, r6)
            r11 = 3
            r12 = 0
            r7 = r3
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r7, r8, r9, r10, r11, r12)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchLoyalty$2$2$4 r10 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchLoyalty$2$2$4
            r10.<init>(r2, r1, r6)
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r7, r8, r9, r10, r11, r12)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchLoyalty$2$2$5 r10 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchLoyalty$2$2$5
            r10.<init>(r2, r6)
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r7, r8, r9, r10, r11, r12)
            goto L_0x01a5
        L_0x017b:
            r5 = 1
            goto L_0x00f0
        L_0x017e:
            kotlinx.coroutines.flow.j r1 = r3.mo78804w0()
        L_0x0182:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r3 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r3
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r4 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.b
            com.carrefour.fid.android.presentation.viewmodels.home.state.g$b r8 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26501g.C26503b.f64775a
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 14
            r13 = 0
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r5 = 1
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r3 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r3, r6, r4, r5, r6)
            boolean r2 = r1.mo24216e(r2, r3)
            if (r2 == 0) goto L_0x0182
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x01a5:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchLoyalty$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PhysicalStoreViewModel$fetchLoyalty$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
