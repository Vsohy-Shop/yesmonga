package com.carrefour.fid.android.data.datasource;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.ValidatePaymentType;
import com.carrefour.fid.android.data.entities.mapper.C36531u0;
import com.carrefour.fid.android.data.repositories.PaymentRepository;
import com.carrefour.fid.android.domain.interactors.basket.C37566e0;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPaymentGateway.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentGateway.kt\ncom/carrefour/fid/android/data/datasource/PaymentGateway\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,248:1\n1#2:249\n288#3,2:250\n*S KotlinDebug\n*F\n+ 1 PaymentGateway.kt\ncom/carrefour/fid/android/data/datasource/PaymentGateway\n*L\n240#1:250,2\n*E\n"})
public final class PaymentGateway {

    /* renamed from: f */
    public static final int f90019f = 8;
    @C12579k

    /* renamed from: a */
    public final PaymentRepository f90020a;
    @C12579k

    /* renamed from: b */
    public final C36531u0 f90021b;
    @C12579k

    /* renamed from: c */
    public final C37566e0 f90022c;
    @C12579k

    /* renamed from: d */
    public final C37823k f90023d;
    @C12579k

    /* renamed from: e */
    public final C37816e f90024e;

    @Inject
    public PaymentGateway(@C12579k PaymentRepository paymentRepository, @C12579k C36531u0 u0Var, @C12579k C37566e0 e0Var, @C12579k C37823k kVar, @C12579k C37816e eVar) {
        Intrinsics.checkNotNullParameter(paymentRepository, "repository");
        Intrinsics.checkNotNullParameter(u0Var, "orderConfirmationCheckoutV3Mapper");
        Intrinsics.checkNotNullParameter(e0Var, "retrieveBasketFromCacheUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getFacilityDetailsByAnabelKeyUseCase");
        this.f90020a = paymentRepository;
        this.f90021b = u0Var;
        this.f90022c = e0Var;
        this.f90023d = kVar;
        this.f90024e = eVar;
    }

    /* renamed from: i */
    public static /* synthetic */ Object m149280i(PaymentGateway paymentGateway, String str, BasketDomain basketDomain, boolean z, boolean z2, StoreService storeService, String str2, C11045c cVar, int i, Object obj) {
        return paymentGateway.mo108675h(str, basketDomain, z, z2, (i & 16) != 0 ? null : storeService, (i & 32) != 0 ? null : str2, cVar);
    }

    /* renamed from: o */
    public static /* synthetic */ Object m149281o(PaymentGateway paymentGateway, ValidatePaymentType validatePaymentType, BasketDomain basketDomain, boolean z, boolean z2, StoreService storeService, String str, C11045c cVar, int i, Object obj) {
        return paymentGateway.mo108680n(validatePaymentType, basketDomain, z, z2, (i & 16) != 0 ? null : storeService, (i & 32) != 0 ? null : str, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108674g(@org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.OrderConfirmationDomain>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.data.datasource.PaymentGateway$confirmPayment$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.data.datasource.PaymentGateway$confirmPayment$1 r0 = (com.carrefour.fid.android.data.datasource.PaymentGateway$confirmPayment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.PaymentGateway$confirmPayment$1 r0 = new com.carrefour.fid.android.data.datasource.PaymentGateway$confirmPayment$1
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r0.label
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L_0x0049
            if (r1 == r10) goto L_0x003b
            if (r1 != r9) goto L_0x0033
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r12 = r14.mo21858l()
            goto L_0x009e
        L_0x0033:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003b:
            java.lang.Object r12 = r0.L$0
            com.carrefour.fid.android.data.datasource.PaymentGateway r12 = (com.carrefour.fid.android.data.datasource.PaymentGateway) r12
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r13 = r14.mo21858l()
            goto L_0x0060
        L_0x0049:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.data.repositories.PaymentRepository r1 = r11.f90020a
            r4 = 0
            r6 = 4
            r7 = 0
            r0.L$0 = r11
            r0.label = r10
            r2 = r12
            r3 = r13
            r5 = r0
            java.lang.Object r13 = com.carrefour.fid.android.data.repositories.PaymentRepository.m150085h(r1, r2, r3, r4, r5, r6, r7)
            if (r13 != r8) goto L_0x005f
            return r8
        L_0x005f:
            r12 = r11
        L_0x0060:
            java.lang.Throwable r14 = kotlin.Result.m38705e(r13)
            if (r14 != 0) goto L_0x0094
            com.carrefour.fid.android.data.entities.ConfirmPaymentResponse r13 = (com.carrefour.fid.android.data.entities.ConfirmPaymentResponse) r13
            java.lang.String r13 = r13.getOneOrderId()
            if (r13 == 0) goto L_0x0076
            boolean r14 = kotlin.text.C11622t.isBlank(r13)
            if (r14 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r10 = 0
        L_0x0076:
            if (r10 == 0) goto L_0x0088
            kotlin.Result$a r12 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.RequireOrderIdThrowable r12 = new com.carrefour.fid.android.core.io.RequireOrderIdThrowable
            r12.<init>()
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            goto L_0x009e
        L_0x0088:
            r14 = 0
            r0.L$0 = r14
            r0.label = r9
            java.lang.Object r12 = r12.mo108676j(r13, r0)
            if (r12 != r8) goto L_0x009e
            return r8
        L_0x0094:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r14)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
        L_0x009e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.PaymentGateway.mo108674g(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v15, types: [int] */
    /* JADX WARNING: type inference failed for: r7v7, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0150 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015a A[SYNTHETIC, Splitter:B:60:0x015a] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108675h(java.lang.String r18, com.carrefour.fid.android.domain.models.BasketDomain r19, boolean r20, boolean r21, com.carrefour.fid.android.domain.models.service.models.StoreService r22, java.lang.String r23, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.OrderV3>> r24) {
        /*
            r17 = this;
            r1 = r17
            r0 = r24
            boolean r2 = r0 instanceof com.carrefour.fid.android.data.datasource.PaymentGateway$createOrderForPayment$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.data.datasource.PaymentGateway$createOrderForPayment$1 r2 = (com.carrefour.fid.android.data.datasource.PaymentGateway$createOrderForPayment$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.data.datasource.PaymentGateway$createOrderForPayment$1 r2 = new com.carrefour.fid.android.data.datasource.PaymentGateway$createOrderForPayment$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r11 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r12 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r13 = 0
            if (r3 == 0) goto L_0x0088
            if (r3 == r6) goto L_0x005a
            if (r3 == r4) goto L_0x0047
            if (r3 != r12) goto L_0x003f
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x003c }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x003c }
            goto L_0x0170
        L_0x003c:
            r0 = move-exception
            goto L_0x017a
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0047:
            java.lang.Object r3 = r2.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.data.datasource.PaymentGateway r4 = (com.carrefour.fid.android.data.datasource.PaymentGateway) r4
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x0154
        L_0x005a:
            int r3 = r2.I$1
            int r7 = r2.I$0
            java.lang.Object r8 = r2.L$5
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.L$4
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r2.L$3
            com.carrefour.fid.android.data.repositories.PaymentRepository r10 = (com.carrefour.fid.android.data.repositories.PaymentRepository) r10
            java.lang.Object r14 = r2.L$2
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r2.L$1
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r12 = r2.L$0
            com.carrefour.fid.android.data.datasource.PaymentGateway r12 = (com.carrefour.fid.android.data.datasource.PaymentGateway) r12
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            r16 = r14
            r14 = r3
            r3 = r12
            r12 = r7
            r7 = r16
            goto L_0x0104
        L_0x0088:
            kotlin.C11661u0.m45747n(r0)
            boolean r0 = kotlin.text.C11622t.isBlank(r18)
            if (r0 == 0) goto L_0x00a2
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.RequireLoyaltyAmountThrowable r0 = new com.carrefour.fid.android.core.io.RequireLoyaltyAmountThrowable
            r0.<init>()
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            goto L_0x0184
        L_0x00a2:
            if (r19 == 0) goto L_0x00a9
            java.lang.String r0 = r19.mo115464G()
            goto L_0x00aa
        L_0x00a9:
            r0 = r13
        L_0x00aa:
            if (r0 == 0) goto L_0x00b5
            boolean r0 = kotlin.text.C11622t.isBlank(r0)
            if (r0 == 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r0 = r5
            goto L_0x00b6
        L_0x00b5:
            r0 = r6
        L_0x00b6:
            if (r0 == 0) goto L_0x00c9
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.RequireBasketRefThrowable r0 = new com.carrefour.fid.android.core.io.RequireBasketRefThrowable
            r0.<init>()
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            goto L_0x0184
        L_0x00c9:
            com.carrefour.fid.android.data.repositories.PaymentRepository r10 = r1.f90020a
            java.lang.String[] r0 = new java.lang.String[r6]
            if (r19 == 0) goto L_0x00d4
            java.lang.String r3 = r19.mo115464G()
            goto L_0x00d5
        L_0x00d4:
            r3 = r13
        L_0x00d5:
            r0[r5] = r3
            java.util.ArrayList r9 = kotlin.collections.CollectionsKt__CollectionsKt.m40463r(r0)
            java.lang.String r8 = "erreurs-init-paiement"
            if (r22 != 0) goto L_0x0129
            com.carrefour.fid.android.domain.interactors.service.k r0 = r1.f90023d
            r2.L$0 = r1
            r3 = r18
            r2.L$1 = r3
            r7 = r23
            r2.L$2 = r7
            r2.L$3 = r10
            r2.L$4 = r9
            r2.L$5 = r8
            r12 = r20
            r2.I$0 = r12
            r14 = r21
            r2.I$1 = r14
            r2.label = r6
            java.lang.Object r0 = r0.m172965invokeIoAF18A(r2)
            if (r0 != r11) goto L_0x0102
            return r11
        L_0x0102:
            r15 = r3
            r3 = r1
        L_0x0104:
            if (r12 == 0) goto L_0x0108
            r12 = r6
            goto L_0x0109
        L_0x0108:
            r12 = r5
        L_0x0109:
            if (r14 == 0) goto L_0x010c
            r5 = r6
        L_0x010c:
            boolean r6 = kotlin.Result.m38709i(r0)
            if (r6 == 0) goto L_0x0113
            r0 = r13
        L_0x0113:
            com.carrefour.fid.android.domain.models.service.models.k r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0
            if (r0 == 0) goto L_0x0122
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r0.mo119354f()
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r0
            r0 = r3
            r3 = r10
            goto L_0x013a
        L_0x0122:
            r0 = r3
            r6 = r9
            r3 = r10
            r9 = r7
            r7 = r8
            r8 = r13
            goto L_0x013a
        L_0x0129:
            r3 = r18
            r12 = r20
            r14 = r21
            r7 = r23
            r0 = r1
            r15 = r3
            r6 = r9
            r3 = r10
            r5 = r14
            r9 = r7
            r7 = r8
            r8 = r22
        L_0x013a:
            r2.L$0 = r0
            r2.L$1 = r15
            r2.L$2 = r13
            r2.L$3 = r13
            r2.L$4 = r13
            r2.L$5 = r13
            r2.label = r4
            r4 = r12
            r10 = r2
            java.lang.Object r3 = r3.mo111546k(r4, r5, r6, r7, r8, r9, r10)
            if (r3 != r11) goto L_0x0151
            return r11
        L_0x0151:
            r4 = r0
            r0 = r3
            r3 = r15
        L_0x0154:
            boolean r5 = kotlin.Result.m38710j(r0)
            if (r5 == 0) goto L_0x0180
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x003c }
            com.carrefour.fid.android.data.entities.OrdersResponse r0 = (com.carrefour.fid.android.data.entities.OrdersResponse) r0     // Catch:{ all -> 0x003c }
            java.lang.String r0 = r0.getOneOrderId()     // Catch:{ all -> 0x003c }
            r2.L$0 = r13     // Catch:{ all -> 0x003c }
            r2.L$1 = r13     // Catch:{ all -> 0x003c }
            r5 = 3
            r2.label = r5     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r4.mo108678l(r0, r3, r2)     // Catch:{ all -> 0x003c }
            if (r0 != r11) goto L_0x0170
            return r11
        L_0x0170:
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x003c }
            com.carrefour.fid.android.data.entities.OrderV3 r0 = (com.carrefour.fid.android.data.entities.OrderV3) r0     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x003c }
            goto L_0x0184
        L_0x017a:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
        L_0x0180:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0184:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.PaymentGateway.mo108675h(java.lang.String, com.carrefour.fid.android.domain.models.BasketDomain, boolean, boolean, com.carrefour.fid.android.domain.models.service.models.StoreService, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e A[SYNTHETIC, Splitter:B:31:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb A[Catch:{ all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2 A[Catch:{ all -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108676j(java.lang.String r12, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.OrderConfirmationDomain>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.data.datasource.PaymentGateway$getOrderById$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.data.datasource.PaymentGateway$getOrderById$1 r0 = (com.carrefour.fid.android.data.datasource.PaymentGateway$getOrderById$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.PaymentGateway$getOrderById$1 r0 = new com.carrefour.fid.android.data.datasource.PaymentGateway$getOrderById$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r0.label
            r8 = 3
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0068
            if (r1 == r2) goto L_0x0059
            if (r1 == r9) goto L_0x0047
            if (r1 != r8) goto L_0x003f
            java.lang.Object r12 = r0.L$2
            com.carrefour.fid.android.data.entities.mapper.u0 r12 = (com.carrefour.fid.android.data.entities.mapper.C36531u0) r12
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.data.entities.OrderV3 r1 = (com.carrefour.fid.android.data.entities.OrderV3) r1
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.models.BasketDomain r0 = (com.carrefour.fid.android.domain.models.BasketDomain) r0
            kotlin.C11661u0.m45747n(r13)     // Catch:{ all -> 0x003c }
            goto L_0x00be
        L_0x003c:
            r12 = move-exception
            goto L_0x00e4
        L_0x003f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0047:
            java.lang.Object r12 = r0.L$1
            com.carrefour.fid.android.data.entities.OrderV3 r12 = (com.carrefour.fid.android.data.entities.OrderV3) r12
            java.lang.Object r1 = r0.L$0
            com.carrefour.fid.android.data.datasource.PaymentGateway r1 = (com.carrefour.fid.android.data.datasource.PaymentGateway) r1
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            goto L_0x0098
        L_0x0059:
            java.lang.Object r12 = r0.L$0
            com.carrefour.fid.android.data.datasource.PaymentGateway r12 = (com.carrefour.fid.android.data.datasource.PaymentGateway) r12
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r13 = r13.mo21858l()
            r1 = r12
            goto L_0x007e
        L_0x0068:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.data.repositories.PaymentRepository r1 = r11.f90020a
            r3 = 0
            r5 = 2
            r6 = 0
            r0.L$0 = r11
            r0.label = r2
            r2 = r12
            r4 = r0
            java.lang.Object r13 = com.carrefour.fid.android.data.repositories.PaymentRepository.m150088n(r1, r2, r3, r4, r5, r6)
            if (r13 != r7) goto L_0x007d
            return r7
        L_0x007d:
            r1 = r11
        L_0x007e:
            java.lang.Throwable r12 = kotlin.Result.m38705e(r13)
            if (r12 != 0) goto L_0x00f4
            com.carrefour.fid.android.data.entities.OrderV3 r13 = (com.carrefour.fid.android.data.entities.OrderV3) r13
            com.carrefour.fid.android.domain.interactors.basket.e0 r12 = r1.f90022c
            r0.L$0 = r1
            r0.L$1 = r13
            r0.label = r9
            java.lang.Object r12 = r12.m172965invokeIoAF18A(r0)
            if (r12 != r7) goto L_0x0095
            return r7
        L_0x0095:
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x0098:
            boolean r2 = kotlin.Result.m38710j(r13)
            if (r2 == 0) goto L_0x00ef
            kotlin.Result$a r2 = kotlin.Result.f28060a     // Catch:{ all -> 0x003c }
            com.carrefour.fid.android.domain.models.basket.Basket r13 = (com.carrefour.fid.android.domain.models.basket.Basket) r13     // Catch:{ all -> 0x003c }
            com.carrefour.fid.android.data.entities.mapper.u0 r2 = r1.f90021b     // Catch:{ all -> 0x003c }
            if (r13 == 0) goto L_0x00ab
            com.carrefour.fid.android.domain.models.BasketDomain r3 = com.carrefour.fid.android.domain.extension.C37498a.m153932b(r13)     // Catch:{ all -> 0x003c }
            goto L_0x00ac
        L_0x00ab:
            r3 = 0
        L_0x00ac:
            r0.L$0 = r3     // Catch:{ all -> 0x003c }
            r0.L$1 = r12     // Catch:{ all -> 0x003c }
            r0.L$2 = r2     // Catch:{ all -> 0x003c }
            r0.label = r8     // Catch:{ all -> 0x003c }
            java.lang.Object r13 = r1.mo108677k(r13, r0)     // Catch:{ all -> 0x003c }
            if (r13 != r7) goto L_0x00bb
            return r7
        L_0x00bb:
            r1 = r12
            r12 = r2
            r0 = r3
        L_0x00be:
            com.carrefour.fid.android.domain.models.service.models.StoreService r13 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r13     // Catch:{ all -> 0x003c }
            com.carrefour.fid.android.data.entities.mapper.u0$a r2 = new com.carrefour.fid.android.data.entities.mapper.u0$a     // Catch:{ all -> 0x003c }
            r2.<init>(r1, r0, r13)     // Catch:{ all -> 0x003c }
            com.carrefour.fid.android.domain.models.OrderConfirmationDomain r12 = r12.mo72340a(r2)     // Catch:{ all -> 0x003c }
            if (r12 == 0) goto L_0x00d2
            kotlin.Result$a r13 = kotlin.Result.f28060a     // Catch:{ all -> 0x003c }
            java.lang.Object r12 = kotlin.Result.m38702b(r12)     // Catch:{ all -> 0x003c }
            goto L_0x00e3
        L_0x00d2:
            kotlin.Result$a r12 = kotlin.Result.f28060a     // Catch:{ all -> 0x003c }
            com.carrefour.fid.android.core.io.OrderThrowable r12 = new com.carrefour.fid.android.core.io.OrderThrowable     // Catch:{ all -> 0x003c }
            java.lang.String r13 = "could not map order"
            r12.<init>(r13)     // Catch:{ all -> 0x003c }
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)     // Catch:{ all -> 0x003c }
            java.lang.Object r12 = kotlin.Result.m38702b(r12)     // Catch:{ all -> 0x003c }
        L_0x00e3:
            return r12
        L_0x00e4:
            kotlin.Result$a r13 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            goto L_0x00fe
        L_0x00ef:
            java.lang.Object r12 = kotlin.Result.m38702b(r13)
            goto L_0x00fe
        L_0x00f4:
            kotlin.Result$a r13 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
        L_0x00fe:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.PaymentGateway.mo108676j(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.carrefour.fid.android.domain.models.service.models.StoreService} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108677k(com.carrefour.fid.android.domain.models.basket.Basket r7, kotlin.coroutines.C11045c<? super com.carrefour.fid.android.domain.models.service.models.StoreService> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.data.datasource.PaymentGateway$getStoreService$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.data.datasource.PaymentGateway$getStoreService$1 r0 = (com.carrefour.fid.android.data.datasource.PaymentGateway$getStoreService$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.PaymentGateway$getStoreService$1 r0 = new com.carrefour.fid.android.data.datasource.PaymentGateway$getStoreService$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.mo21858l()
            goto L_0x00b8
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.domain.models.basket.Basket r7 = (com.carrefour.fid.android.domain.models.basket.Basket) r7
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0076
        L_0x004a:
            kotlin.C11661u0.m45747n(r8)
            if (r7 == 0) goto L_0x0054
            com.carrefour.fid.android.domain.models.basket.BasketType r8 = r7.mo116829N()
            goto L_0x0055
        L_0x0054:
            r8 = r5
        L_0x0055:
            com.carrefour.fid.android.domain.models.basket.BasketType r2 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_ADDITIONAL_ORDER
            if (r8 != r2) goto L_0x00ad
            com.carrefour.fid.android.domain.interactors.service.e r8 = r6.f90024e
            java.lang.String r2 = r7.mo116859z()
            java.lang.String r2 = com.carrefour.fid.android.shared.extension.StringKt.m118931k(r2)
            java.lang.String r2 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158072b(r2)
            com.carrefour.fid.android.domain.models.service.models.a r2 = com.carrefour.fid.android.domain.models.service.models.C38146a.m158071a(r2)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m172966invokegIAlus(r2, r0)
            if (r8 != r1) goto L_0x0076
            return r1
        L_0x0076:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r8)
            if (r0 != 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r8 = r5
        L_0x007e:
            com.carrefour.fid.android.domain.models.service.models.l r8 = (com.carrefour.fid.android.domain.models.service.models.C38163l) r8
            if (r8 == 0) goto L_0x00c7
            java.util.List r8 = r8.mo119367K()
            if (r8 == 0) goto L_0x00c7
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x008e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r0 = r8.next()
            r1 = r0
            com.carrefour.fid.android.domain.models.service.models.StoreService r1 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r1
            java.lang.String r1 = r1.mo119167K()
            java.lang.String r2 = r7.mo116828M()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x008e
            r5 = r0
        L_0x00aa:
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = (com.carrefour.fid.android.domain.models.service.models.StoreService) r5
            goto L_0x00c7
        L_0x00ad:
            com.carrefour.fid.android.domain.interactors.service.k r7 = r6.f90023d
            r0.label = r3
            java.lang.Object r7 = r7.m172965invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            boolean r8 = kotlin.Result.m38709i(r7)
            if (r8 == 0) goto L_0x00bf
            r7 = r5
        L_0x00bf:
            com.carrefour.fid.android.domain.models.service.models.k r7 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r7
            if (r7 == 0) goto L_0x00c7
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r7.mo119354f()
        L_0x00c7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.PaymentGateway.mo108677k(com.carrefour.fid.android.domain.models.basket.Basket, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108678l(java.lang.String r6, java.lang.String r7, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.OrderV3>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.data.datasource.PaymentGateway$initPayment$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.data.datasource.PaymentGateway$initPayment$1 r0 = (com.carrefour.fid.android.data.datasource.PaymentGateway$initPayment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.PaymentGateway$initPayment$1 r0 = new com.carrefour.fid.android.data.datasource.PaymentGateway$initPayment$1
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
            com.carrefour.fid.android.data.datasource.PaymentGateway r6 = (com.carrefour.fid.android.data.datasource.PaymentGateway) r6
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0063
        L_0x004e:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.data.repositories.PaymentRepository r8 = r5.f90020a
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
            boolean r2 = r6.mo108679m(r2)
            if (r2 == 0) goto L_0x008f
            java.lang.String r7 = r8.getOneOrderId()
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r6 = r6.mo108681p(r7, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.PaymentGateway.mo108678l(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: m */
    public final boolean mo108679m(Integer num) {
        return num != null && num.intValue() <= 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108680n(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.core.type.ValidatePaymentType r11, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.BasketDomain r12, boolean r13, boolean r14, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.service.models.StoreService r15, @org.jetbrains.annotations.C12580l java.lang.String r16, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.OrderV3>> r17) {
        /*
            r10 = this;
            r8 = r10
            r0 = r11
            r1 = r17
            boolean r2 = r1 instanceof com.carrefour.fid.android.data.datasource.PaymentGateway$validatePayment$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.data.datasource.PaymentGateway$validatePayment$1 r2 = (com.carrefour.fid.android.data.datasource.PaymentGateway$validatePayment$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.data.datasource.PaymentGateway$validatePayment$1 r2 = new com.carrefour.fid.android.data.datasource.PaymentGateway$validatePayment$1
            r2.<init>(r10, r1)
        L_0x001c:
            r7 = r2
            java.lang.Object r1 = r7.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r7.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r0 = r1.mo21858l()
            goto L_0x0077
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r0 = r1.mo21858l()
            goto L_0x0066
        L_0x0049:
            kotlin.C11661u0.m45747n(r1)
            boolean r1 = r0 instanceof com.carrefour.fid.android.core.type.ValidatePaymentType.InitPayment
            if (r1 == 0) goto L_0x0067
            com.carrefour.fid.android.core.type.ValidatePaymentType$InitPayment r0 = (com.carrefour.fid.android.core.type.ValidatePaymentType.InitPayment) r0
            java.lang.String r1 = r0.mo108597d()
            r7.label = r4
            r0 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            java.lang.Object r0 = r0.mo108675h(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r9) goto L_0x0066
            return r9
        L_0x0066:
            return r0
        L_0x0067:
            boolean r0 = r0 instanceof com.carrefour.fid.android.core.type.ValidatePaymentType.IsOnSite
            if (r0 == 0) goto L_0x0078
            r7.label = r3
            r0 = r12
            r1 = r13
            r2 = r14
            java.lang.Object r0 = r10.mo108682q(r12, r13, r14, r7)
            if (r0 != r9) goto L_0x0077
            return r9
        L_0x0077:
            return r0
        L_0x0078:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.PaymentGateway.mo108680n(com.carrefour.fid.android.core.type.ValidatePaymentType, com.carrefour.fid.android.domain.models.BasketDomain, boolean, boolean, com.carrefour.fid.android.domain.models.service.models.StoreService, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108681p(java.lang.String r7, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.OrderV3>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.data.datasource.PaymentGateway$validatePaymentByLoyalty$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.data.datasource.PaymentGateway$validatePaymentByLoyalty$1 r0 = (com.carrefour.fid.android.data.datasource.PaymentGateway$validatePaymentByLoyalty$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.PaymentGateway$validatePaymentByLoyalty$1 r0 = new com.carrefour.fid.android.data.datasource.PaymentGateway$validatePaymentByLoyalty$1
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
            com.carrefour.fid.android.data.datasource.PaymentGateway r2 = (com.carrefour.fid.android.data.datasource.PaymentGateway) r2
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
            com.carrefour.fid.android.data.repositories.PaymentRepository r8 = r6.f90020a
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
            com.carrefour.fid.android.data.repositories.PaymentRepository r8 = r2.f90020a
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.PaymentGateway.mo108681p(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0133 A[SYNTHETIC, Splitter:B:56:0x0133] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0152 A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0165 A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108682q(com.carrefour.fid.android.domain.models.BasketDomain r22, boolean r23, boolean r24, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.OrderV3>> r25) {
        /*
            r21 = this;
            r1 = r21
            r0 = r25
            boolean r2 = r0 instanceof com.carrefour.fid.android.data.datasource.PaymentGateway$validatePaymentOnSite$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.carrefour.fid.android.data.datasource.PaymentGateway$validatePaymentOnSite$1 r2 = (com.carrefour.fid.android.data.datasource.PaymentGateway$validatePaymentOnSite$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.data.datasource.PaymentGateway$validatePaymentOnSite$1 r2 = new com.carrefour.fid.android.data.datasource.PaymentGateway$validatePaymentOnSite$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r13 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r3 = r2.label
            r14 = 4
            r15 = 3
            r4 = 2
            java.lang.String r12 = "erreurs-init-paiement"
            r11 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0098
            if (r3 == r11) goto L_0x0072
            if (r3 == r4) goto L_0x005f
            if (r3 == r15) goto L_0x0048
            if (r3 != r14) goto L_0x0040
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x005c }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x005c }
            goto L_0x016f
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0048:
            java.lang.Object r3 = r2.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.data.datasource.PaymentGateway r4 = (com.carrefour.fid.android.data.datasource.PaymentGateway) r4
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x005c }
            kotlin.Result r0 = (kotlin.Result) r0     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.mo21858l()     // Catch:{ all -> 0x005c }
            r5 = r12
            goto L_0x014c
        L_0x005c:
            r0 = move-exception
            goto L_0x0179
        L_0x005f:
            java.lang.Object r3 = r2.L$0
            com.carrefour.fid.android.data.datasource.PaymentGateway r3 = (com.carrefour.fid.android.data.datasource.PaymentGateway) r3
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            r4 = r3
            r14 = r11
            r19 = r12
            goto L_0x012d
        L_0x0072:
            boolean r3 = r2.Z$1
            boolean r5 = r2.Z$0
            java.lang.Object r6 = r2.L$3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r2.L$1
            com.carrefour.fid.android.data.repositories.PaymentRepository r8 = (com.carrefour.fid.android.data.repositories.PaymentRepository) r8
            java.lang.Object r9 = r2.L$0
            com.carrefour.fid.android.data.datasource.PaymentGateway r9 = (com.carrefour.fid.android.data.datasource.PaymentGateway) r9
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            r20 = r7
            r7 = r3
            r3 = r8
            r8 = r6
        L_0x0094:
            r6 = r20
            goto L_0x00f3
        L_0x0098:
            kotlin.C11661u0.m45747n(r0)
            if (r22 == 0) goto L_0x00a2
            java.lang.String r0 = r22.mo115464G()
            goto L_0x00a3
        L_0x00a2:
            r0 = r10
        L_0x00a3:
            if (r0 == 0) goto L_0x00ae
            boolean r0 = kotlin.text.C11622t.isBlank(r0)
            if (r0 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r0 = 0
            goto L_0x00af
        L_0x00ae:
            r0 = r11
        L_0x00af:
            if (r0 == 0) goto L_0x00c2
            kotlin.Result$a r0 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.RequireBasketRefThrowable r0 = new com.carrefour.fid.android.core.io.RequireBasketRefThrowable
            r0.<init>()
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            goto L_0x0183
        L_0x00c2:
            com.carrefour.fid.android.data.repositories.PaymentRepository r0 = r1.f90020a
            if (r22 == 0) goto L_0x00cb
            java.lang.String r3 = r22.mo115464G()
            goto L_0x00cc
        L_0x00cb:
            r3 = r10
        L_0x00cc:
            java.util.List r3 = kotlin.collections.C10976s.m41419k(r3)
            com.carrefour.fid.android.domain.interactors.service.k r5 = r1.f90023d
            r2.L$0 = r1
            r2.L$1 = r0
            r2.L$2 = r3
            r2.L$3 = r12
            r6 = r23
            r2.Z$0 = r6
            r7 = r24
            r2.Z$1 = r7
            r2.label = r11
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r2)
            if (r5 != r13) goto L_0x00eb
            return r13
        L_0x00eb:
            r9 = r1
            r8 = r12
            r20 = r3
            r3 = r0
            r0 = r5
            r5 = r6
            goto L_0x0094
        L_0x00f3:
            boolean r16 = kotlin.Result.m38709i(r0)
            if (r16 == 0) goto L_0x00fa
            r0 = r10
        L_0x00fa:
            com.carrefour.fid.android.domain.models.service.models.k r0 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r0
            if (r0 == 0) goto L_0x0103
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = r0.mo119354f()
            goto L_0x0104
        L_0x0103:
            r0 = r10
        L_0x0104:
            r16 = 0
            r17 = 32
            r18 = 0
            r2.L$0 = r9
            r2.L$1 = r10
            r2.L$2 = r10
            r2.L$3 = r10
            r2.label = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r0
            r0 = r9
            r9 = r16
            r14 = r10
            r10 = r2
            r14 = r11
            r11 = r17
            r19 = r12
            r12 = r18
            java.lang.Object r3 = com.carrefour.fid.android.data.repositories.PaymentRepository.m150087l(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r13) goto L_0x012b
            return r13
        L_0x012b:
            r4 = r0
            r0 = r3
        L_0x012d:
            boolean r3 = kotlin.Result.m38710j(r0)
            if (r3 == 0) goto L_0x017f
            kotlin.Result$a r3 = kotlin.Result.f28060a     // Catch:{ all -> 0x005c }
            com.carrefour.fid.android.data.entities.OrdersResponse r0 = (com.carrefour.fid.android.data.entities.OrdersResponse) r0     // Catch:{ all -> 0x005c }
            java.lang.String r3 = r0.getOneOrderId()     // Catch:{ all -> 0x005c }
            com.carrefour.fid.android.data.repositories.PaymentRepository r0 = r4.f90020a     // Catch:{ all -> 0x005c }
            r2.L$0 = r4     // Catch:{ all -> 0x005c }
            r2.L$1 = r3     // Catch:{ all -> 0x005c }
            r2.label = r15     // Catch:{ all -> 0x005c }
            r5 = r19
            java.lang.Object r0 = r0.mo111545i(r3, r14, r5, r2)     // Catch:{ all -> 0x005c }
            if (r0 != r13) goto L_0x014c
            return r13
        L_0x014c:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r0)     // Catch:{ all -> 0x005c }
            if (r6 != 0) goto L_0x0165
            com.carrefour.fid.android.data.entities.ConfirmPaymentResponse r0 = (com.carrefour.fid.android.data.entities.ConfirmPaymentResponse) r0     // Catch:{ all -> 0x005c }
            com.carrefour.fid.android.data.repositories.PaymentRepository r0 = r4.f90020a     // Catch:{ all -> 0x005c }
            r4 = 0
            r2.L$0 = r4     // Catch:{ all -> 0x005c }
            r2.L$1 = r4     // Catch:{ all -> 0x005c }
            r4 = 4
            r2.label = r4     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.mo111547m(r3, r5, r2)     // Catch:{ all -> 0x005c }
            if (r0 != r13) goto L_0x016f
            return r13
        L_0x0165:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r6)     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x005c }
        L_0x016f:
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x005c }
            com.carrefour.fid.android.data.entities.OrderV3 r0 = (com.carrefour.fid.android.data.entities.OrderV3) r0     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x005c }
            goto L_0x0183
        L_0x0179:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
        L_0x017f:
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0183:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.PaymentGateway.mo108682q(com.carrefour.fid.android.domain.models.BasketDomain, boolean, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
