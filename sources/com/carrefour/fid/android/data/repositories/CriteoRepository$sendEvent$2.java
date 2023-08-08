package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.domain.models.criteo.C38006h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.CriteoRepository$sendEvent$2", mo22502f = "CriteoRepository.kt", mo22503i = {}, mo22504l = {61, 59}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CriteoRepository$sendEvent$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C11079d2>>, Object> {
    final /* synthetic */ C38006h $parameters;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CriteoRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoRepository$sendEvent$2(C38006h hVar, CriteoRepository criteoRepository, C11045c<? super CriteoRepository$sendEvent$2> cVar) {
        super(1, cVar);
        this.$parameters = hVar;
        this.this$0 = criteoRepository;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new CriteoRepository$sendEvent$2(this.$parameters, this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00db  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r29) {
        /*
            r28 = this;
            r6 = r28
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r6.label
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 == r9) goto L_0x001f
            if (r0 != r8) goto L_0x0017
            kotlin.C11661u0.m45747n(r29)
            r0 = r29
            goto L_0x0095
        L_0x0017:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001f:
            java.lang.Object r0 = r6.L$1
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r6.L$0
            com.carrefour.fid.android.data.service.f r1 = (com.carrefour.fid.android.data.service.C36627f) r1
            kotlin.C11661u0.m45747n(r29)
            r11 = r0
            r0 = r29
            goto L_0x0085
        L_0x002e:
            kotlin.C11661u0.m45747n(r29)
            com.carrefour.fid.android.domain.models.criteo.h r10 = r6.$parameters
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            com.carrefour.fid.android.data.repositories.CriteoRepository r0 = r6.this$0
            android.content.Context r1 = r0.mo111493j()
            boolean r25 = r0.mo32689f(r1)
            r26 = 16383(0x3fff, float:2.2957E-41)
            r27 = 0
            com.carrefour.fid.android.domain.models.criteo.h r1 = com.carrefour.fid.android.domain.models.criteo.C38006h.m156554q(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.carrefour.fid.android.data.repositories.CriteoRepository r0 = r6.this$0
            com.carrefour.fid.android.data.service.f r10 = r0.f90368a
            com.carrefour.fid.android.data.repositories.CriteoRepository r0 = r6.this$0
            com.carrefour.fid.android.data.provider.headers.e r0 = r0.f90370c
            java.util.HashMap r11 = r0.mo111429a()
            com.carrefour.fid.android.data.repositories.CriteoRepository r0 = r6.this$0
            com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider r0 = r0.f90371d
            r2 = 0
            r4 = 2
            r5 = 0
            r6.L$0 = r10
            r6.L$1 = r11
            r6.label = r9
            r3 = r28
            java.lang.Object r0 = com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider.m149972c(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x0084
            return r7
        L_0x0084:
            r1 = r10
        L_0x0085:
            java.util.Map r0 = (java.util.Map) r0
            r2 = 0
            r6.L$0 = r2
            r6.L$1 = r2
            r6.label = r8
            java.lang.Object r0 = r1.mo111639a(r11, r0, r6)
            if (r0 != r7) goto L_0x0095
            return r7
        L_0x0095:
            retrofit2.w r0 = (retrofit2.C13091w) r0
            boolean r1 = r0.mo30576g()
            if (r1 == 0) goto L_0x00db
            java.lang.Object r0 = r0.mo30572a()
            java.lang.String r1 = "null cannot be cast to non-null type com.carrefour.fid.android.data.entities.AdServingCriteoResponse"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            com.carrefour.fid.android.data.entities.AdServingCriteoResponse r0 = (com.carrefour.fid.android.data.entities.AdServingCriteoResponse) r0
            java.util.List r1 = r0.getErrors()
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x00b8
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r9 = 0
        L_0x00b8:
            if (r9 == 0) goto L_0x00c3
            kotlin.Result$a r0 = kotlin.Result.f28060a
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            goto L_0x00eb
        L_0x00c3:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.CriteoResponseThrowable r1 = new com.carrefour.fid.android.shared.io.CriteoResponseThrowable
            java.util.List r2 = r0.getErrors()
            java.lang.String r0 = r0.getStatus()
            r1.<init>(r2, r0)
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            goto L_0x00eb
        L_0x00db:
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.String r1 = "Error sending event"
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.core.extension.C36311i.m148971g(r0, r1)
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x00eb:
            kotlin.Result r0 = kotlin.Result.m38701a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.CriteoRepository$sendEvent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C11079d2>> cVar) {
        return ((CriteoRepository$sendEvent$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
