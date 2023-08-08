package com.carrefour.fid.android.domain.interactors.account.order;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.OrderOnlineRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.models.C38120r;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class GetLastOnlineOrderUseCase implements C37678e<C38120r> {

    /* renamed from: b */
    public static final int f94255b = 8;
    @C12579k

    /* renamed from: a */
    public final OrderOnlineRepository f94256a;

    @Inject
    public GetLastOnlineOrderUseCase(@C12579k OrderOnlineRepository orderOnlineRepository) {
        Intrinsics.checkNotNullParameter(orderOnlineRepository, "repository");
        this.f94256a = orderOnlineRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172931invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.C38120r>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.domain.interactors.account.order.GetLastOnlineOrderUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.domain.interactors.account.order.GetLastOnlineOrderUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.account.order.GetLastOnlineOrderUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.account.order.GetLastOnlineOrderUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.account.order.GetLastOnlineOrderUseCase$invoke$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r0.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r2) goto L_0x003a
            if (r1 != r8) goto L_0x0032
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x009d
        L_0x0032:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003a:
            java.lang.Object r1 = r0.L$0
            com.carrefour.fid.android.domain.interactors.account.order.GetLastOnlineOrderUseCase r1 = (com.carrefour.fid.android.domain.interactors.account.order.GetLastOnlineOrderUseCase) r1
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x005f
        L_0x0048:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository r1 = r9.f94256a
            r10 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            r0.L$0 = r9
            r0.label = r2
            r2 = r10
            r4 = r0
            java.lang.Object r10 = com.carrefour.fid.android.data.repositories.OrderOnlineRepository.m150073k(r1, r2, r3, r4, r5, r6)
            if (r10 != r7) goto L_0x005e
            return r7
        L_0x005e:
            r1 = r9
        L_0x005f:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r10)
            if (r2 != 0) goto L_0x009e
            com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain r10 = (com.carrefour.fid.android.domain.models.OrdersOnlineResultDomain) r10
            java.util.List r2 = r10.getOrders()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0081
            kotlin.Result$a r10 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.EmptyListThrowable r10 = new com.carrefour.fid.android.shared.io.EmptyListThrowable
            r10.<init>()
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            goto L_0x009d
        L_0x0081:
            com.carrefour.fid.android.data.repositories.OrderOnlineRepository r1 = r1.f94256a
            java.util.List r10 = r10.getOrders()
            java.lang.Object r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r10)
            com.carrefour.fid.android.domain.models.OrdersOnlineDomain r10 = (com.carrefour.fid.android.domain.models.OrdersOnlineDomain) r10
            java.lang.String r10 = r10.getOrderId()
            r2 = 0
            r0.L$0 = r2
            r0.label = r8
            java.lang.Object r10 = r1.mo111537i(r10, r0)
            if (r10 != r7) goto L_0x009d
            return r7
        L_0x009d:
            return r10
        L_0x009e:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r2)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.account.order.GetLastOnlineOrderUseCase.m172931invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
