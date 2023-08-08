package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$handleCouponBlockClick$1", mo22502f = "PhysicalStoreViewModel.kt", mo22503i = {}, mo22504l = {175, 184}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PhysicalStoreViewModel$handleCouponBlockClick$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ PhysicalStoreViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreViewModel$handleCouponBlockClick$1(PhysicalStoreViewModel physicalStoreViewModel, C11045c<? super PhysicalStoreViewModel$handleCouponBlockClick$1> cVar) {
        super(2, cVar);
        this.this$0 = physicalStoreViewModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PhysicalStoreViewModel$handleCouponBlockClick$1(this.this$0, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r6) == false) goto L_0x0069;
     */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            kotlin.C11661u0.m45747n(r8)
            goto L_0x007e
        L_0x0013:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001b:
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0037
        L_0x0025:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r8 = r7.this$0
            com.carrefour.fid.android.domain.interactors.service.k r8 = r8.f65912h
            r7.label = r3
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r7)
            if (r8 != r0) goto L_0x0037
            return r0
        L_0x0037:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r8)
            r4 = 0
            if (r1 != 0) goto L_0x006a
            com.carrefour.fid.android.domain.models.service.models.k r8 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r8
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Drive r1 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Drive.INSTANCE
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r8.mo119354f()
            r6 = 0
            if (r5 == 0) goto L_0x004e
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r5 = r5.mo119176T()
            goto L_0x004f
        L_0x004e:
            r5 = r6
        L_0x004f:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)
            if (r1 != 0) goto L_0x0068
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType$Clcv r1 = com.carrefour.fid.android.domain.models.service.models.StoreServiceType.Clcv.INSTANCE
            com.carrefour.fid.android.domain.models.service.models.StoreService r8 = r8.mo119354f()
            if (r8 == 0) goto L_0x0061
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r6 = r8.mo119176T()
        L_0x0061:
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r6)
            if (r8 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r3 = r4
        L_0x0069:
            r4 = r3
        L_0x006a:
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r8 = r7.this$0
            kotlinx.coroutines.channels.g r8 = r8.f65917m
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.d$a r1 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.d$a
            r1.<init>(r4)
            r7.label = r2
            java.lang.Object r8 = r8.mo23757h0(r1, r7)
            if (r8 != r0) goto L_0x007e
            return r0
        L_0x007e:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$handleCouponBlockClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PhysicalStoreViewModel$handleCouponBlockClick$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
