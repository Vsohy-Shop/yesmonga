package com.carrefour.fid.android.data.repositories;

import com.carrefour.fid.android.domain.models.C38120r;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderDetail$2", mo22502f = "OrderOnlineRepository.kt", mo22503i = {2}, mo22504l = {33, 43, 50}, mo22505m = "invokeSuspend", mo22506n = {"domain"}, mo22507s = {"L$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/r;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class OrderOnlineRepository$getOrderDetail$2 extends SuspendLambda implements C11300l<C11045c<? super Result<? extends C38120r>>, Object> {
    final /* synthetic */ String $orderId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OrderOnlineRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderOnlineRepository$getOrderDetail$2(OrderOnlineRepository orderOnlineRepository, String str, C11045c<? super OrderOnlineRepository$getOrderDetail$2> cVar) {
        super(1, cVar);
        this.this$0 = orderOnlineRepository;
        this.$orderId = str;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        return new OrderOnlineRepository$getOrderDetail$2(this.this$0, this.$orderId, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r0 = e;
        r2 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7 A[Catch:{ Exception -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d9 A[Catch:{ Exception -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0117  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r34) {
        /*
            r33 = this;
            r1 = r33
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            java.lang.String r3 = "Error during fetching online order detail for "
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r6) goto L_0x0041
            if (r2 == r5) goto L_0x002d
            if (r2 != r4) goto L_0x0025
            java.lang.Object r0 = r1.L$1
            com.carrefour.fid.android.domain.models.r r0 = (com.carrefour.fid.android.domain.models.C38120r) r0
            java.lang.Object r2 = r1.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.C11661u0.m45747n(r34)     // Catch:{ Exception -> 0x0022 }
            goto L_0x00ec
        L_0x0022:
            r0 = move-exception
            goto L_0x010f
        L_0x0025:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x002d:
            java.lang.Object r2 = r1.L$1
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository r2 = (com.carrefour.fid.android.data.repositories.OrderOnlineRepository) r2
            java.lang.Object r5 = r1.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.C11661u0.m45747n(r34)     // Catch:{ Exception -> 0x003d }
            r8 = r2
            r2 = r34
            goto L_0x00d3
        L_0x003d:
            r0 = move-exception
            r2 = r5
            goto L_0x010f
        L_0x0041:
            kotlin.C11661u0.m45747n(r34)
            r2 = r34
            goto L_0x0065
        L_0x0047:
            kotlin.C11661u0.m45747n(r34)
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository r2 = r1.this$0
            com.carrefour.fid.android.data.service.l r2 = r2.f90417a
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository r7 = r1.this$0
            com.carrefour.fid.android.data.provider.headers.m r7 = r7.f90420d
            java.util.HashMap r7 = r7.mo111440a()
            java.lang.String r8 = r1.$orderId
            r1.label = r6
            java.lang.Object r2 = r2.mo111653c(r7, r8, r1)
            if (r2 != r0) goto L_0x0065
            return r0
        L_0x0065:
            java.lang.String r12 = r1.$orderId
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository r6 = r1.this$0
            retrofit2.w r2 = (retrofit2.C13091w) r2
            boolean r7 = r2.mo30576g()
            if (r7 == 0) goto L_0x014b
            java.lang.Object r2 = r2.mo30572a()     // Catch:{ Exception -> 0x010c }
            com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsEntity r2 = (com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsEntity) r2     // Catch:{ Exception -> 0x010c }
            if (r2 == 0) goto L_0x00f6
            com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsDataEntity r2 = r2.getData()     // Catch:{ Exception -> 0x010c }
            if (r2 == 0) goto L_0x00f6
            java.lang.String r7 = r2.getOrderId()     // Catch:{ Exception -> 0x010c }
            if (r7 != 0) goto L_0x00bc
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
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
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 8388575(0x7fffdf, float:1.1754897E-38)
            r31 = 0
            r34 = r6
            r6 = r2
            r2 = r12
            com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsDataEntity r6 = com.carrefour.fid.android.data.entities.OHMOrdersOnlineDetailsDataEntity.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0022 }
            r32 = r6
            r6 = r2
            r2 = r32
            goto L_0x00bf
        L_0x00bc:
            r34 = r6
            r6 = r12
        L_0x00bf:
            com.carrefour.fid.android.data.entities.mapper.OHMOrdersOnlineDetailsEntityDataMapper r7 = r34.f90419c     // Catch:{ Exception -> 0x00f4 }
            r1.L$0 = r6     // Catch:{ Exception -> 0x00f4 }
            r8 = r34
            r1.L$1 = r8     // Catch:{ Exception -> 0x00f4 }
            r1.label = r5     // Catch:{ Exception -> 0x00f4 }
            java.lang.Object r2 = r7.mo111175d(r2, r1)     // Catch:{ Exception -> 0x00f4 }
            if (r2 != r0) goto L_0x00d2
            return r0
        L_0x00d2:
            r5 = r6
        L_0x00d3:
            com.carrefour.fid.android.domain.models.r r2 = (com.carrefour.fid.android.domain.models.C38120r) r2     // Catch:{ Exception -> 0x003d }
            if (r2 != 0) goto L_0x00d9
            r2 = r5
            goto L_0x00f8
        L_0x00d9:
            kotlinx.coroutines.flow.j r6 = r8.f90422f     // Catch:{ Exception -> 0x003d }
            r1.L$0 = r5     // Catch:{ Exception -> 0x003d }
            r1.L$1 = r2     // Catch:{ Exception -> 0x003d }
            r1.label = r4     // Catch:{ Exception -> 0x003d }
            java.lang.Object r4 = r6.emit(r2, r1)     // Catch:{ Exception -> 0x003d }
            if (r4 != r0) goto L_0x00ea
            return r0
        L_0x00ea:
            r0 = r2
            r2 = r5
        L_0x00ec:
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x0022 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0169
        L_0x00f4:
            r0 = move-exception
            goto L_0x010e
        L_0x00f6:
            r6 = r12
            r2 = r6
        L_0x00f8:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x0022 }
            com.carrefour.fid.android.core.io.OrderNotFoundException r0 = new com.carrefour.fid.android.core.io.OrderNotFoundException     // Catch:{ Exception -> 0x0022 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0022 }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)     // Catch:{ Exception -> 0x0022 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ Exception -> 0x0022 }
            kotlin.Result r0 = kotlin.Result.m38701a(r0)     // Catch:{ Exception -> 0x0022 }
            return r0
        L_0x010c:
            r0 = move-exception
            r6 = r12
        L_0x010e:
            r2 = r6
        L_0x010f:
            com.carrefour.fid.android.shared.util.i r4 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r5 = r0.getMessage()
            if (r5 != 0) goto L_0x0119
            java.lang.String r5 = ""
        L_0x0119:
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r4, r5, r6, r7, r8, r9)
            kotlin.Result$a r4 = kotlin.Result.f28060a
            java.lang.Throwable r4 = new java.lang.Throwable
            java.lang.String r5 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = " - "
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            r4.<init>(r2, r0)
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            goto L_0x0169
        L_0x014b:
            r6 = r12
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.carrefour.fid.android.shared.io.ResponseThrowable r0 = com.carrefour.fid.android.core.extension.C36311i.m148971g(r2, r0)
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0169:
            kotlin.Result r0 = kotlin.Result.m38701a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OrderOnlineRepository$getOrderDetail$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12580l C11045c<? super Result<C38120r>> cVar) {
        return ((OrderOnlineRepository$getOrderDetail$2) create(cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
