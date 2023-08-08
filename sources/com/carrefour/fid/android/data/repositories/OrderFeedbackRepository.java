package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.datasource.C36388a;
import com.carrefour.fid.android.data.entities.mapper.C36488g0;
import com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class OrderFeedbackRepository {

    /* renamed from: f */
    public static final int f90401f = 8;
    @C12579k

    /* renamed from: a */
    public final LoginRepository f90402a;
    @C12579k

    /* renamed from: b */
    public final AccountRepository f90403b;
    @C12579k

    /* renamed from: c */
    public final OrderGetCustomerStatusUseCase f90404c;
    @C12579k

    /* renamed from: d */
    public final C36488g0 f90405d;
    @C12579k

    /* renamed from: e */
    public final C36388a f90406e;

    @Inject
    public OrderFeedbackRepository(@C12579k LoginRepository loginRepository, @C12579k AccountRepository accountRepository, @C12579k OrderGetCustomerStatusUseCase orderGetCustomerStatusUseCase, @C12579k C36488g0 g0Var, @C12579k C36388a aVar) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(orderGetCustomerStatusUseCase, "getCustomerStatusUseCase");
        Intrinsics.checkNotNullParameter(g0Var, "feedbackDomainMapper");
        Intrinsics.checkNotNullParameter(aVar, "base64Gateway");
        this.f90402a = loginRepository;
        this.f90403b = accountRepository;
        this.f90404c = orderGetCustomerStatusUseCase;
        this.f90405d = g0Var;
        this.f90406e = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111526a(@org.jetbrains.annotations.C12580l java.lang.String r8, @org.jetbrains.annotations.C12579k java.lang.String r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.C38042l>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.data.repositories.OrderFeedbackRepository$getFeedbackUserData$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.data.repositories.OrderFeedbackRepository$getFeedbackUserData$1 r0 = (com.carrefour.fid.android.data.repositories.OrderFeedbackRepository$getFeedbackUserData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.OrderFeedbackRepository$getFeedbackUserData$1 r0 = new com.carrefour.fid.android.data.repositories.OrderFeedbackRepository$getFeedbackUserData$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0066
            if (r2 == r4) goto L_0x004e
            if (r2 != r3) goto L_0x0046
            java.lang.Object r8 = r0.L$4
            com.carrefour.fid.android.domain.models.account.AccountInfo r8 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r8
            java.lang.Object r9 = r0.L$3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = r0.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.data.repositories.OrderFeedbackRepository r0 = (com.carrefour.fid.android.data.repositories.OrderFeedbackRepository) r0
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x00a1
        L_0x0046:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004e:
            java.lang.Object r8 = r0.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$0
            com.carrefour.fid.android.data.repositories.OrderFeedbackRepository r4 = (com.carrefour.fid.android.data.repositories.OrderFeedbackRepository) r4
            kotlin.C11661u0.m45747n(r10)
            r6 = r10
            r10 = r8
            r8 = r2
            r2 = r6
            goto L_0x0083
        L_0x0066:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.account.data.repositories.LoginRepository r10 = r7.f90402a
            java.lang.String r10 = r10.mo31352d()
            com.carrefour.fid.android.account.data.repositories.AccountRepository r2 = r7.f90403b
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.label = r4
            java.lang.Object r2 = r2.mo31329n(r0)
            if (r2 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r4 = r7
        L_0x0083:
            com.carrefour.fid.android.domain.models.account.AccountInfo r2 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r2
            com.carrefour.fid.android.domain.interactors.order.OrderGetCustomerStatusUseCase r5 = r4.f90404c
            r0.L$0 = r4
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r3
            java.lang.Object r0 = r5.m172983invokeIoAF18A(r0)
            if (r0 != r1) goto L_0x009a
            return r1
        L_0x009a:
            r1 = r9
            r9 = r10
            r10 = r0
            r0 = r4
            r6 = r2
            r2 = r8
            r8 = r6
        L_0x00a1:
            boolean r3 = kotlin.Result.m38709i(r10)
            if (r3 == 0) goto L_0x00a8
            r10 = 0
        L_0x00a8:
            com.carrefour.fid.android.domain.models.order.CustomerStatus r10 = (com.carrefour.fid.android.domain.models.order.CustomerStatus) r10
            if (r10 == 0) goto L_0x00b2
            java.lang.String r10 = r10.mo118208q()
            if (r10 != 0) goto L_0x00b4
        L_0x00b2:
            java.lang.String r10 = "0"
        L_0x00b4:
            com.carrefour.fid.android.data.datasource.a r3 = r0.f90406e
            java.lang.String r8 = r3.mo108696a(r8, r9, r1)
            kotlin.Result$a r9 = kotlin.Result.f28060a
            com.carrefour.fid.android.data.entities.mapper.g0 r9 = r0.f90405d
            com.carrefour.fid.android.data.entities.mapper.g0$a r0 = new com.carrefour.fid.android.data.entities.mapper.g0$a
            r0.<init>(r8, r10, r2)
            com.carrefour.fid.android.domain.models.l r8 = r9.mo72340a(r0)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.OrderFeedbackRepository.mo111526a(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
