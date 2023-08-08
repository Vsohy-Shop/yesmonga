package com.carrefour.fid.android.checkout.data.api.datasources;

import com.carrefour.fid.android.checkout.data.api.services.C39837a;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class PaymentDataSource {
    @C12579k

    /* renamed from: b */
    public static final C39828a f101592b = new C39828a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final String f101593c = "22";
    @C12579k

    /* renamed from: d */
    public static final String f101594d = "DESKTOP_V2";
    @C12579k

    /* renamed from: e */
    public static final String f101595e = "COMPUTER";
    @C12579k

    /* renamed from: a */
    public final C39837a f101596a;

    /* renamed from: com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource$a */
    public static final class C39828a {
        public /* synthetic */ C39828a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C39828a() {
        }
    }

    @Inject
    public PaymentDataSource(@C12579k C39837a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "api");
        this.f101596a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131223b(@org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource$getPspToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource$getPspToken$1 r0 = (com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource$getPspToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource$getPspToken$1 r0 = new com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource$getPspToken$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.mo21858l()
            goto L_0x004e
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource$getPspToken$2 r14 = new com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource$getPspToken$2
            r9 = 0
            r4 = r14
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r14, r0)
            if (r11 != r1) goto L_0x004e
            return r1
        L_0x004e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource.mo131223b(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
