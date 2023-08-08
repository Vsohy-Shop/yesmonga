package com.carrefour.fid.android.presentation.viewmodels.gazStation;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$handlePostTicketError$1", mo22502f = "ServiceStationsResultViewModel.kt", mo22503i = {1}, mo22504l = {92, 94, 97}, mo22505m = "invokeSuspend", mo22506n = {"launchCount"}, mo22507s = {"I$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ServiceStationsResultViewModel$handlePostTicketError$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Throwable $throwable;
    int I$0;
    int label;
    final /* synthetic */ ServiceStationsResultViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceStationsResultViewModel$handlePostTicketError$1(ServiceStationsResultViewModel serviceStationsResultViewModel, Throwable th, C11045c<? super ServiceStationsResultViewModel$handlePostTicketError$1> cVar) {
        super(2, cVar);
        this.this$0 = serviceStationsResultViewModel;
        this.$throwable = th;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ServiceStationsResultViewModel$handlePostTicketError$1(this.this$0, this.$throwable, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 == r4) goto L_0x0023
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0057
        L_0x0015:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001d:
            int r1 = r6.I$0
            kotlin.C11661u0.m45747n(r7)
            goto L_0x004a
        L_0x0023:
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0035
        L_0x0027:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel r7 = r6.this$0
            r6.label = r4
            java.lang.Object r7 = r7.mo76643l0(r6)
            if (r7 != r0) goto L_0x0035
            return r0
        L_0x0035:
            java.lang.Number r7 = (java.lang.Number) r7
            int r1 = r7.intValue()
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel r7 = r6.this$0
            int r5 = r1 + 1
            r6.I$0 = r1
            r6.label = r3
            java.lang.Object r7 = r7.mo76653w0(r5, r6)
            if (r7 != r0) goto L_0x004a
            return r0
        L_0x004a:
            if (r1 <= r4) goto L_0x0066
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel r7 = r6.this$0
            r6.label = r2
            java.lang.Object r7 = r7.mo76652v0(r6)
            if (r7 != r0) goto L_0x0057
            return r0
        L_0x0057:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel r7 = r6.this$0
            com.carrefour.fid.android.shared.util.q r7 = r7.mo83420e0()
            com.carrefour.fid.android.shared.io.GazStationLimitExceedThrowable r0 = new com.carrefour.fid.android.shared.io.GazStationLimitExceedThrowable
            r0.<init>()
            r7.mo57493o(r0)
            goto L_0x0098
        L_0x0066:
            java.lang.Throwable r7 = r6.$throwable
            if (r7 == 0) goto L_0x0089
            boolean r7 = r7 instanceof com.carrefour.fid.android.shared.p046io.GazStationResponseThrowable
            if (r7 == 0) goto L_0x0089
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel r7 = r6.this$0
            com.carrefour.fid.android.shared.util.q r7 = r7.mo83420e0()
            com.carrefour.fid.android.shared.io.GazStationPostTicketThrowable r0 = new com.carrefour.fid.android.shared.io.GazStationPostTicketThrowable
            java.lang.Throwable r1 = r6.$throwable
            com.carrefour.fid.android.shared.io.GazStationResponseThrowable r1 = (com.carrefour.fid.android.shared.p046io.GazStationResponseThrowable) r1
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L_0x0082
            java.lang.String r1 = ""
        L_0x0082:
            r0.<init>(r1)
            r7.mo57493o(r0)
            goto L_0x0098
        L_0x0089:
            com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel r7 = r6.this$0
            com.carrefour.fid.android.shared.util.q r7 = r7.mo83420e0()
            com.carrefour.fid.android.shared.io.GazStationPostTicketThrowable r0 = new com.carrefour.fid.android.shared.io.GazStationPostTicketThrowable
            r1 = 0
            r0.<init>(r1, r4, r1)
            r7.mo57493o(r0)
        L_0x0098:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.gazStation.ServiceStationsResultViewModel$handlePostTicketError$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ServiceStationsResultViewModel$handlePostTicketError$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
