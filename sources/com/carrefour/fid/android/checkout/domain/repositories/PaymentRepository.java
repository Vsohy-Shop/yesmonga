package com.carrefour.fid.android.checkout.domain.repositories;

import com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class PaymentRepository {
    @C12579k

    /* renamed from: a */
    public final PaymentDataSource f101688a;

    @Inject
    public PaymentRepository(@C12579k PaymentDataSource paymentDataSource) {
        Intrinsics.checkNotNullParameter(paymentDataSource, "dataSource");
        this.f101688a = paymentDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131427a(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.checkout.domain.repositories.PaymentRepository$getPspToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.checkout.domain.repositories.PaymentRepository$getPspToken$1 r0 = (com.carrefour.fid.android.checkout.domain.repositories.PaymentRepository$getPspToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.repositories.PaymentRepository$getPspToken$1 r0 = new com.carrefour.fid.android.checkout.domain.repositories.PaymentRepository$getPspToken$1
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r5 = r8.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource r8 = r4.f101688a
            r0.label = r3
            java.lang.Object r5 = r8.mo131223b(r5, r6, r7, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.repositories.PaymentRepository.mo131427a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
