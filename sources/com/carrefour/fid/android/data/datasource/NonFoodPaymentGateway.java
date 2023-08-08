package com.carrefour.fid.android.data.datasource;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.PaymentRepository;
import com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
public final class NonFoodPaymentGateway {

    /* renamed from: c */
    public static final int f90016c = 8;
    @C12579k

    /* renamed from: a */
    public final PaymentRepository f90017a;
    @C12579k

    /* renamed from: b */
    public final C37823k f90018b;

    @Inject
    public NonFoodPaymentGateway(@C12579k PaymentRepository paymentRepository, @C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(paymentRepository, "repository");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        this.f90017a = paymentRepository;
        this.f90018b = kVar;
    }

    /* renamed from: f */
    public static /* synthetic */ Object m149269f(NonFoodPaymentGateway nonFoodPaymentGateway, String str, BasketDomain basketDomain, boolean z, boolean z2, StoreService storeService, String str2, NonFoodValidatePaymentUseCase.C37622a.C37623a aVar, C11045c cVar, int i, Object obj) {
        return nonFoodPaymentGateway.mo108672e(str, basketDomain, z, z2, (i & 16) != 0 ? null : storeService, (i & 32) != 0 ? null : str2, aVar, cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108670c(java.lang.String r6, java.lang.String r7, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.OrderV3>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$initPayment$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$initPayment$1 r0 = (com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$initPayment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$initPayment$1 r0 = new com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$initPayment$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.mo21858l()
            goto L_0x00a9
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.L$0
            com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway r6 = (com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway) r6
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0063
        L_0x004e:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.data.repositories.PaymentRepository r8 = r5.f90017a
            r0.L$0 = r5
            r0.L$1 = r7
            r0.label = r4
            java.lang.String r2 = "erreurs-init-paiement"
            java.lang.Object r8 = r8.mo111549p(r6, r7, r2, r0)
            if (r8 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r6 = r5
        L_0x0063:
            java.lang.Throwable r2 = kotlin.Result.m38705e(r8)
            if (r2 != 0) goto L_0x009f
            com.carrefour.fid.android.data.entities.InitPaymentResponse r8 = (com.carrefour.fid.android.data.entities.InitPaymentResponse) r8
            com.carrefour.fid.android.data.entities.RemainingAmountToPay r2 = r8.getRemainingAmountToPay()
            int r2 = r2.getUnscaledAmount()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.C11064a.m42620f(r2)
            boolean r2 = r6.mo108671d(r2)
            if (r2 == 0) goto L_0x008f
            java.lang.String r7 = r8.getOneOrderId()
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r6 = r6.mo108673g(r7, r0)
            if (r6 != r1) goto L_0x00a9
            return r1
        L_0x008f:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.RedirectionPaymentThrowable r6 = new com.carrefour.fid.android.core.io.RedirectionPaymentThrowable
            r6.<init>(r8, r7)
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x00a9
        L_0x009f:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r2)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x00a9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway.mo108670c(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: d */
    public final boolean mo108671d(Integer num) {
        return num != null && num.intValue() <= 0;
    }

    /* JADX WARNING: type inference failed for: r4v15, types: [int] */
    /* JADX WARNING: type inference failed for: r11v4, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0186 A[SYNTHETIC, Splitter:B:64:0x0186] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e0 A[Catch:{ all -> 0x005e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Unknown variable types count: 2 */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108672e(@org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.BasketDomain r19, boolean r20, boolean r21, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.service.models.StoreService r22, @org.jetbrains.annotations.C12580l java.lang.String r23, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase.C37622a.C37623a r24, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.OrderV3>> r25) {
        /*
            r17 = this;
            r1 = r17
            r0 = r25
            boolean r2 = r0 instanceof com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$validatePayment$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$validatePayment$1 r2 = (com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$validatePayment$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$validatePayment$1 r2 = new com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$validatePayment$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L_0x00ac
            if (r4 == r9) goto L_0x007a
            if (r4 == r7) goto L_0x0061
            if (r4 == r6) goto L_0x0047
            if (r4 != r5) goto L_0x003f
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x005e }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x005e }
            goto L_0x01e1
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0047:
            java.lang.Object r4 = r2.L$2
            com.carrefour.fid.android.data.entities.OrdersResponse r4 = (com.carrefour.fid.android.data.entities.OrdersResponse) r4
            java.lang.Object r6 = r2.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.L$0
            com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway r7 = (com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway) r7
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x005e }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x005e }
            goto L_0x01c9
        L_0x005e:
            r0 = move-exception
            goto L_0x01eb
        L_0x0061:
            java.lang.Object r4 = r2.L$2
            com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$a$a r4 = (com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase.C37622a.C37623a) r4
            java.lang.Object r7 = r2.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.L$0
            com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway r8 = (com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway) r8
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            r6 = r7
            r7 = r8
            goto L_0x0180
        L_0x007a:
            int r4 = r2.I$1
            int r11 = r2.I$0
            java.lang.Object r12 = r2.L$6
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$5
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r2.L$4
            com.carrefour.fid.android.data.repositories.PaymentRepository r14 = (com.carrefour.fid.android.data.repositories.PaymentRepository) r14
            java.lang.Object r15 = r2.L$3
            com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$a$a r15 = (com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase.C37622a.C37623a) r15
            java.lang.Object r5 = r2.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.L$0
            com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway r7 = (com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway) r7
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            r16 = r11
            r11 = r4
            r4 = r6
            r6 = r7
            r7 = r16
            goto L_0x012c
        L_0x00ac:
            kotlin.C11661u0.m45747n(r0)
            boolean r0 = kotlin.text.C11622t.isBlank(r18)
            if (r0 == 0) goto L_0x00c6
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.RequireLoyaltyAmountThrowable r0 = new com.carrefour.fid.android.core.io.RequireLoyaltyAmountThrowable
            r0.<init>()
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            goto L_0x01f5
        L_0x00c6:
            if (r19 == 0) goto L_0x00cd
            java.lang.String r0 = r19.mo115464G()
            goto L_0x00ce
        L_0x00cd:
            r0 = r10
        L_0x00ce:
            if (r0 == 0) goto L_0x00d9
            boolean r0 = kotlin.text.C11622t.isBlank(r0)
            if (r0 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r0 = r8
            goto L_0x00da
        L_0x00d9:
            r0 = r9
        L_0x00da:
            if (r0 == 0) goto L_0x00ed
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.RequireBasketRefThrowable r0 = new com.carrefour.fid.android.core.io.RequireBasketRefThrowable
            r0.<init>()
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            goto L_0x01f5
        L_0x00ed:
            com.carrefour.fid.android.data.repositories.PaymentRepository r14 = r1.f90017a
            java.lang.String[] r0 = new java.lang.String[r9]
            if (r19 == 0) goto L_0x00f8
            java.lang.String r4 = r19.mo115464G()
            goto L_0x00f9
        L_0x00f8:
            r4 = r10
        L_0x00f9:
            r0[r8] = r4
            java.util.ArrayList r13 = kotlin.collections.CollectionsKt__CollectionsKt.m40463r(r0)
            java.lang.String r12 = "erreurs-init-paiement"
            if (r22 != 0) goto L_0x0146
            com.carrefour.fid.android.domain.interactors.service.k r0 = r1.f90018b
            r2.L$0 = r1
            r4 = r18
            r2.L$1 = r4
            r5 = r23
            r2.L$2 = r5
            r6 = r24
            r2.L$3 = r6
            r2.L$4 = r14
            r2.L$5 = r13
            r2.L$6 = r12
            r7 = r20
            r2.I$0 = r7
            r11 = r21
            r2.I$1 = r11
            r2.label = r9
            java.lang.Object r0 = r0.m172965invokeIoAF18A(r2)
            if (r0 != r3) goto L_0x012a
            return r3
        L_0x012a:
            r15 = r6
            r6 = r1
        L_0x012c:
            if (r7 == 0) goto L_0x0130
            r7 = r9
            goto L_0x0131
        L_0x0130:
            r7 = r8
        L_0x0131:
            if (r11 == 0) goto L_0x0134
            r8 = r9
        L_0x0134:
            boolean r9 = kotlin.Result.m38709i(r0)
            if (r9 == 0) goto L_0x013b
            r0 = r10
        L_0x013b:
            com.carrefour.fid.android.domain.models.service.models.k r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0
            if (r0 == 0) goto L_0x0144
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r0.mo119354f()
            goto L_0x0155
        L_0x0144:
            r0 = r10
            goto L_0x0155
        L_0x0146:
            r4 = r18
            r7 = r20
            r11 = r21
            r5 = r23
            r6 = r24
            r0 = r22
            r15 = r6
            r8 = r11
            r6 = r1
        L_0x0155:
            r2.L$0 = r6
            r2.L$1 = r4
            r2.L$2 = r15
            r2.L$3 = r10
            r2.L$4 = r10
            r2.L$5 = r10
            r2.L$6 = r10
            r9 = 2
            r2.label = r9
            r18 = r14
            r19 = r7
            r20 = r8
            r21 = r13
            r22 = r12
            r23 = r0
            r24 = r5
            r25 = r2
            java.lang.Object r0 = r18.mo111546k(r19, r20, r21, r22, r23, r24, r25)
            if (r0 != r3) goto L_0x017d
            return r3
        L_0x017d:
            r7 = r6
            r6 = r4
            r4 = r15
        L_0x0180:
            boolean r5 = kotlin.Result.m38710j(r0)
            if (r5 == 0) goto L_0x01f1
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x005e }
            com.carrefour.fid.android.data.entities.OrdersResponse r0 = (com.carrefour.fid.android.data.entities.OrdersResponse) r0     // Catch:{ all -> 0x005e }
            if (r4 == 0) goto L_0x01cd
            boolean r5 = r4.mo114502i()     // Catch:{ all -> 0x005e }
            if (r5 == 0) goto L_0x01cd
            com.carrefour.fid.android.data.repositories.PaymentRepository r5 = r7.f90017a     // Catch:{ all -> 0x005e }
            java.lang.String r8 = r0.getOneOrderId()     // Catch:{ all -> 0x005e }
            com.carrefour.fid.android.domain.models.account.Address r9 = r4.mo114498f()     // Catch:{ all -> 0x005e }
            com.carrefour.fid.android.domain.models.account.Address r11 = r4.mo114500h()     // Catch:{ all -> 0x005e }
            java.lang.String r4 = r4.mo114499g()     // Catch:{ all -> 0x005e }
            java.lang.String r12 = "erreurs-update-address"
            r2.L$0 = r7     // Catch:{ all -> 0x005e }
            r2.L$1 = r6     // Catch:{ all -> 0x005e }
            r2.L$2 = r0     // Catch:{ all -> 0x005e }
            r13 = 3
            r2.label = r13     // Catch:{ all -> 0x005e }
            r18 = r5
            r19 = r8
            r20 = r9
            r21 = r11
            r22 = r4
            r23 = r12
            r24 = r2
            java.lang.Object r4 = r18.mo111552t(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x005e }
            if (r4 != r3) goto L_0x01c4
            return r3
        L_0x01c4:
            r16 = r4
            r4 = r0
            r0 = r16
        L_0x01c9:
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x005e }
            r0 = r4
        L_0x01cd:
            java.lang.String r0 = r0.getOneOrderId()     // Catch:{ all -> 0x005e }
            r2.L$0 = r10     // Catch:{ all -> 0x005e }
            r2.L$1 = r10     // Catch:{ all -> 0x005e }
            r2.L$2 = r10     // Catch:{ all -> 0x005e }
            r4 = 4
            r2.label = r4     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r7.mo108670c(r0, r6, r2)     // Catch:{ all -> 0x005e }
            if (r0 != r3) goto L_0x01e1
            return r3
        L_0x01e1:
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x005e }
            com.carrefour.fid.android.data.entities.OrderV3 r0 = (com.carrefour.fid.android.data.entities.OrderV3) r0     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x005e }
            goto L_0x01f5
        L_0x01eb:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
        L_0x01f1:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x01f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway.mo108672e(java.lang.String, com.carrefour.fid.android.domain.models.BasketDomain, boolean, boolean, com.carrefour.fid.android.domain.models.service.models.StoreService, java.lang.String, com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$a$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108673g(java.lang.String r7, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.OrderV3>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$validatePaymentByLoyalty$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$validatePaymentByLoyalty$1 r0 = (com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$validatePaymentByLoyalty$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$validatePaymentByLoyalty$1 r0 = new com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway$validatePaymentByLoyalty$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            java.lang.String r3 = "erreurs-fidelite"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r5) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.mo21858l()
            goto L_0x009a
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway r2 = (com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0078
        L_0x004e:
            kotlin.C11661u0.m45747n(r8)
            boolean r8 = kotlin.text.C11622t.isBlank(r7)
            if (r8 == 0) goto L_0x0067
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.RequireOrderIdThrowable r7 = new com.carrefour.fid.android.core.io.RequireOrderIdThrowable
            r7.<init>()
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x009a
        L_0x0067:
            com.carrefour.fid.android.data.repositories.PaymentRepository r8 = r6.f90017a
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            r2 = 0
            java.lang.Object r8 = r8.mo111545i(r7, r2, r3, r0)
            if (r8 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r2 = r6
        L_0x0078:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r8)
            if (r5 != 0) goto L_0x0090
            com.carrefour.fid.android.data.entities.ConfirmPaymentResponse r8 = (com.carrefour.fid.android.data.entities.ConfirmPaymentResponse) r8
            com.carrefour.fid.android.data.repositories.PaymentRepository r8 = r2.f90017a
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r7 = r8.mo111547m(r7, r3, r0)
            if (r7 != r1) goto L_0x009a
            return r1
        L_0x0090:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x009a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway.mo108673g(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
