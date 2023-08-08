package com.carrefour.fid.android.checkout.domain.interactors;

import com.carrefour.fid.android.checkout.domain.repositories.PaymentRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.login.C37693a;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nGetPspTokenUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetPspTokenUseCase.kt\ncom/carrefour/fid/android/checkout/domain/interactors/GetPspTokenUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class GetPspTokenUseCase implements C37678e<String> {
    @C12579k

    /* renamed from: a */
    public final PaymentRepository f101669a;
    @C12579k

    /* renamed from: b */
    public final C37878e f101670b;
    @C12579k

    /* renamed from: c */
    public final C37693a f101671c;

    @Inject
    public GetPspTokenUseCase(@C12579k PaymentRepository paymentRepository, @C12579k C37878e eVar, @C12579k C37693a aVar) {
        Intrinsics.checkNotNullParameter(paymentRepository, "repository");
        Intrinsics.checkNotNullParameter(eVar, "getUserInfo");
        Intrinsics.checkNotNullParameter(aVar, "getCustomerRef");
        this.f101669a = paymentRepository;
        this.f101670b = eVar;
        this.f101671c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173116invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase$invoke$1 r0 = (com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase$invoke$1 r0 = new com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase$invoke$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r5) goto L_0x004e
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x00cd
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003e:
            java.lang.Object r2 = r0.L$1
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase r4 = (com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase) r4
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0096
        L_0x004e:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase r2 = (com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            r7 = r2
            r2 = r9
            r9 = r7
            goto L_0x0073
        L_0x005f:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.user.e r9 = r8.f101670b
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r9.m172966invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r2 = r9
            r9 = r8
        L_0x0073:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r2)
            if (r5 == 0) goto L_0x0084
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        L_0x0084:
            com.carrefour.fid.android.domain.interactors.login.a r5 = r9.f101671c
            r0.L$0 = r9
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r4 = r5.m172965invokeIoAF18A(r0)
            if (r4 != r1) goto L_0x0093
            return r1
        L_0x0093:
            r7 = r4
            r4 = r9
            r9 = r7
        L_0x0096:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r9)
            if (r5 == 0) goto L_0x00a7
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        L_0x00a7:
            com.carrefour.fid.android.checkout.domain.repositories.PaymentRepository r4 = r4.f101669a
            kotlin.C11661u0.m45747n(r2)
            r5 = r2
            com.carrefour.fid.android.domain.models.account.AccountInfo r5 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r5
            java.lang.String r6 = r5.mo116664s()
            kotlin.C11661u0.m45747n(r2)
            java.lang.String r2 = r5.mo116667u()
            kotlin.C11661u0.m45747n(r9)
            java.lang.String r9 = (java.lang.String) r9
            r5 = 0
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r4.mo131427a(r6, r2, r9, r0)
            if (r9 != r1) goto L_0x00cd
            return r1
        L_0x00cd:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase.m173116invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
