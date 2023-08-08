package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.entities.AccountAddressResponse;
import com.carrefour.fid.android.core.constants.C36188s;
import com.carrefour.fid.android.data.entities.RemainingAmountToPay;
import com.carrefour.fid.android.data.entities.UpdateAddressBody;
import com.carrefour.fid.android.data.provider.headers.C36558a;
import com.carrefour.fid.android.data.provider.headers.C36569k;
import com.carrefour.fid.android.data.service.C36634m;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import com.carrefour.fid.android.shared.extension.C28746b0;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.util.C28909d;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class PaymentRepository {

    /* renamed from: e */
    public static final int f90424e;
    @C12579k

    /* renamed from: a */
    public final C36634m f90425a;
    @C12579k

    /* renamed from: b */
    public final C36558a f90426b;
    @C12579k

    /* renamed from: c */
    public final C36569k f90427c;
    @C12579k

    /* renamed from: d */
    public final C28909d f90428d;

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/repositories/PaymentRepository$DriveDeliveryLocation;", "", "", "value", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "e", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum DriveDeliveryLocation {
        PICKUP_LOCKERS(C36188s.f89360g),
        PICKUP_STORE(C36188s.f89361h),
        PICKUP_STATION(C36188s.f89362i),
        PICKUP_DRIVE_PEDESTRIAN(C36188s.f89363j);
        
        @C12579k

        /* renamed from: a */
        public static final C36587a f90429a = null;
        @C12579k
        private final String value;

        /* renamed from: com.carrefour.fid.android.data.repositories.PaymentRepository$DriveDeliveryLocation$a */
        public static final class C36587a {
            public /* synthetic */ C36587a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final DriveDeliveryLocation mo111554a(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "id");
                switch (str.hashCode()) {
                    case 50555:
                        if (str.equals("308")) {
                            return DriveDeliveryLocation.PICKUP_LOCKERS;
                        }
                        break;
                    case 50556:
                        if (str.equals("309")) {
                            return DriveDeliveryLocation.PICKUP_STORE;
                        }
                        break;
                    case 50578:
                        if (str.equals("310")) {
                            return DriveDeliveryLocation.PICKUP_STATION;
                        }
                        break;
                }
                return DriveDeliveryLocation.PICKUP_DRIVE_PEDESTRIAN;
            }

            public C36587a() {
            }
        }

        /* access modifiers changed from: public */
        static {
            f90429a = new C36587a((DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: public */
        DriveDeliveryLocation(String str) {
            this.value = str;
        }

        @C12579k
        /* renamed from: q */
        public final String mo111553q() {
            return this.value;
        }
    }

    static {
        int i = C28909d.f70820b;
        int i2 = C28640a.f70232g;
        f90424e = i | i2 | i2;
    }

    @Inject
    public PaymentRepository(@C12579k C36634m mVar, @C12579k C36558a aVar, @C12579k C36569k kVar, @C12579k C28909d dVar) {
        Intrinsics.checkNotNullParameter(mVar, "service");
        Intrinsics.checkNotNullParameter(aVar, "checkoutHeaders");
        Intrinsics.checkNotNullParameter(kVar, "ordersHeaders");
        Intrinsics.checkNotNullParameter(dVar, "applicationBuildInfo");
        this.f90425a = mVar;
        this.f90426b = aVar;
        this.f90427c = kVar;
        this.f90428d = dVar;
    }

    /* renamed from: h */
    public static /* synthetic */ Object m150085h(PaymentRepository paymentRepository, String str, String str2, String str3, C11045c cVar, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = new String();
        }
        return paymentRepository.mo111544g(str, str2, str3, cVar);
    }

    /* renamed from: j */
    public static /* synthetic */ Object m150086j(PaymentRepository paymentRepository, String str, boolean z, String str2, C11045c cVar, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = new String();
        }
        return paymentRepository.mo111545i(str, z, str2, cVar);
    }

    /* renamed from: l */
    public static /* synthetic */ Object m150087l(PaymentRepository paymentRepository, boolean z, boolean z2, List list, String str, StoreService storeService, String str2, C11045c cVar, int i, Object obj) {
        String str3;
        StoreService storeService2;
        String str4;
        if ((i & 8) != 0) {
            str3 = new String();
        } else {
            str3 = str;
        }
        if ((i & 16) != 0) {
            storeService2 = null;
        } else {
            storeService2 = storeService;
        }
        if ((i & 32) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        return paymentRepository.mo111546k(z, z2, list, str3, storeService2, str4, cVar);
    }

    /* renamed from: n */
    public static /* synthetic */ Object m150088n(PaymentRepository paymentRepository, String str, String str2, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = new String();
        }
        return paymentRepository.mo111547m(str, str2, cVar);
    }

    /* renamed from: q */
    public static /* synthetic */ Object m150089q(PaymentRepository paymentRepository, String str, String str2, String str3, C11045c cVar, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = new String();
        }
        return paymentRepository.mo111549p(str, str2, str3, cVar);
    }

    /* renamed from: u */
    public static /* synthetic */ Object m150090u(PaymentRepository paymentRepository, String str, Address address, Address address2, String str2, String str3, C11045c cVar, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = new String();
        }
        return paymentRepository.mo111552t(str, address, address2, str2, str3, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111544g(@org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.ConfirmPaymentResponse>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPayment$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPayment$1 r0 = (com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPayment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPayment$1 r0 = new com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPayment$1
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
            com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPayment$2 r14 = new com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPayment$2
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r14, r0)
            if (r11 != r1) goto L_0x004e
            return r1
        L_0x004e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.PaymentRepository.mo111544g(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111545i(@org.jetbrains.annotations.C12579k java.lang.String r11, boolean r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.ConfirmPaymentResponse>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPaymentByOrderId$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPaymentByOrderId$1 r0 = (com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPaymentByOrderId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPaymentByOrderId$1 r0 = new com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPaymentByOrderId$1
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
            com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPaymentByOrderId$2 r14 = new com.carrefour.fid.android.data.repositories.PaymentRepository$confirmPaymentByOrderId$2
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r14, r0)
            if (r11 != r1) goto L_0x004e
            return r1
        L_0x004e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.PaymentRepository.mo111545i(java.lang.String, boolean, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111546k(boolean r15, boolean r16, @org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.service.models.StoreService r19, @org.jetbrains.annotations.C12580l java.lang.String r20, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.OrdersResponse>> r21) {
        /*
            r14 = this;
            r0 = r21
            boolean r1 = r0 instanceof com.carrefour.fid.android.data.repositories.PaymentRepository$createOrder$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.carrefour.fid.android.data.repositories.PaymentRepository$createOrder$1 r1 = (com.carrefour.fid.android.data.repositories.PaymentRepository$createOrder$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.label = r2
            r11 = r14
            goto L_0x001c
        L_0x0016:
            com.carrefour.fid.android.data.repositories.PaymentRepository$createOrder$1 r1 = new com.carrefour.fid.android.data.repositories.PaymentRepository$createOrder$1
            r11 = r14
            r1.<init>(r14, r0)
        L_0x001c:
            java.lang.Object r0 = r1.result
            java.lang.Object r12 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            r13 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r13) goto L_0x0033
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x005a
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.data.repositories.PaymentRepository$createOrder$2 r0 = new com.carrefour.fid.android.data.repositories.PaymentRepository$createOrder$2
            r10 = 0
            r2 = r0
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r19
            r8 = r20
            r9 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.label = r13
            java.lang.Object r0 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r0, r1)
            if (r0 != r12) goto L_0x005a
            return r12
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.PaymentRepository.mo111546k(boolean, boolean, java.util.List, java.lang.String, com.carrefour.fid.android.domain.models.service.models.StoreService, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111547m(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.OrderV3>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.repositories.PaymentRepository$getOrder$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.repositories.PaymentRepository$getOrder$1 r0 = (com.carrefour.fid.android.data.repositories.PaymentRepository$getOrder$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.PaymentRepository$getOrder$1 r0 = new com.carrefour.fid.android.data.repositories.PaymentRepository$getOrder$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.repositories.PaymentRepository$getOrder$2 r7 = new com.carrefour.fid.android.data.repositories.PaymentRepository$getOrder$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.PaymentRepository.mo111547m(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: o */
    public final RemainingAmountToPay mo111548o(String str) {
        double z = StringKt.m118946z(str, 0.0d, 1, (Object) null);
        if (z > 0.0d) {
            return new RemainingAmountToPay("EUR", 2, C28746b0.m119035f(Double.valueOf(z * ((double) 100)), 0, 1, (Object) null));
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111549p(@org.jetbrains.annotations.C12579k java.lang.String r11, @org.jetbrains.annotations.C12579k java.lang.String r12, @org.jetbrains.annotations.C12579k java.lang.String r13, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.data.entities.InitPaymentResponse>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.data.repositories.PaymentRepository$initPayment$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.data.repositories.PaymentRepository$initPayment$1 r0 = (com.carrefour.fid.android.data.repositories.PaymentRepository$initPayment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.PaymentRepository$initPayment$1 r0 = new com.carrefour.fid.android.data.repositories.PaymentRepository$initPayment$1
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
            com.carrefour.fid.android.data.repositories.PaymentRepository$initPayment$2 r14 = new com.carrefour.fid.android.data.repositories.PaymentRepository$initPayment$2
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.label = r3
            java.lang.Object r11 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r14, r0)
            if (r11 != r1) goto L_0x004e
            return r1
        L_0x004e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.PaymentRepository.mo111549p(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: r */
    public final AccountAddressResponse mo111550r(Address address) {
        boolean z;
        if (address == null) {
            return null;
        }
        String B = address.mo116677B();
        String C = address.mo116678C();
        String D = address.mo116679D();
        String G = address.mo116682G();
        String I = address.mo116684I();
        String S = address.mo116694S();
        String J = address.mo116685J();
        String K = address.mo116686K();
        if (address.mo116689N().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean Q = address.mo116692Q();
        String name = address.mo116683H().name();
        String L = address.mo116687L();
        if (L == null) {
            L = "";
        }
        return new AccountAddressResponse(B, C, D, S, I, J, name, address.mo116688M(), L, K, address.mo116689N(), G, Boolean.valueOf(z), Q);
    }

    /* renamed from: s */
    public final UpdateAddressBody mo111551s(String str, Address address, Address address2, String str2) {
        return new UpdateAddressBody(str, mo111550r(address), mo111550r(address2), str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111552t(@org.jetbrains.annotations.C12579k java.lang.String r14, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.account.Address r15, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.account.Address r16, @org.jetbrains.annotations.C12580l java.lang.String r17, @org.jetbrains.annotations.C12579k java.lang.String r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r19) {
        /*
            r13 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.carrefour.fid.android.data.repositories.PaymentRepository$updateAddress$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.carrefour.fid.android.data.repositories.PaymentRepository$updateAddress$1 r1 = (com.carrefour.fid.android.data.repositories.PaymentRepository$updateAddress$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.label = r2
            r10 = r13
            goto L_0x001c
        L_0x0016:
            com.carrefour.fid.android.data.repositories.PaymentRepository$updateAddress$1 r1 = new com.carrefour.fid.android.data.repositories.PaymentRepository$updateAddress$1
            r10 = r13
            r1.<init>(r13, r0)
        L_0x001c:
            java.lang.Object r0 = r1.result
            java.lang.Object r11 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            r12 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r12) goto L_0x0033
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x0057
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.data.repositories.PaymentRepository$updateAddress$2 r0 = new com.carrefour.fid.android.data.repositories.PaymentRepository$updateAddress$2
            r9 = 0
            r2 = r0
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.label = r12
            java.lang.Object r0 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r0, r1)
            if (r0 != r11) goto L_0x0057
            return r11
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.PaymentRepository.mo111552t(java.lang.String, com.carrefour.fid.android.domain.models.account.Address, com.carrefour.fid.android.domain.models.account.Address, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
