package com.carrefour.fid.android.domain.interactors.checkout;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.p057io.RedirectionPaymentThrowable;
import com.carrefour.fid.android.core.type.ValidatePaymentType;
import com.carrefour.fid.android.data.datasource.PaymentGateway;
import com.carrefour.fid.android.data.entities.InitPaymentResponse;
import com.carrefour.fid.android.data.entities.mapper.C36459a1;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.presentation.models.PaymentConfirmationModel;
import com.carrefour.fid.android.shared.constant.C28561l1;
import javax.inject.Inject;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nValidatePaymentUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValidatePaymentUseCase.kt\ncom/carrefour/fid/android/domain/interactors/checkout/ValidatePaymentUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1747#2,3:156\n1747#2,3:159\n*S KotlinDebug\n*F\n+ 1 ValidatePaymentUseCase.kt\ncom/carrefour/fid/android/domain/interactors/checkout/ValidatePaymentUseCase\n*L\n113#1:156,3\n120#1:159,3\n*E\n"})
public final class ValidatePaymentUseCase implements C37679f<C37624a, PaymentConfirmationModel> {

    /* renamed from: c */
    public static final int f94394c = 8;
    @C12579k

    /* renamed from: a */
    public final PaymentGateway f94395a;
    @C12579k

    /* renamed from: b */
    public final C36459a1 f94396b;

    @Inject
    public ValidatePaymentUseCase(@C12579k PaymentGateway paymentGateway, @C12579k C36459a1 a1Var) {
        Intrinsics.checkNotNullParameter(paymentGateway, "paymentGateway");
        Intrinsics.checkNotNullParameter(a1Var, "paymentConfirmationMapper");
        this.f94395a = paymentGateway;
        this.f94396b = a1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ea, code lost:
        if (r2 == true) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable mo114504a(java.lang.Throwable r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.core.p057io.CheckoutResponseThrowable
            r1 = 2131952134(0x7f130206, float:1.9540702E38)
            if (r0 == 0) goto L_0x0110
            r0 = r11
            com.carrefour.fid.android.core.io.CheckoutResponseThrowable r0 = (com.carrefour.fid.android.core.p057io.CheckoutResponseThrowable) r0
            java.lang.String r2 = r0.mo108359a()
            java.lang.String r3 = "BILLING_ADDRESS_MISSING"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0020
            com.carrefour.fid.android.core.io.CheckoutMissingDataThrowable r0 = new com.carrefour.fid.android.core.io.CheckoutMissingDataThrowable
            r1 = 2131952149(0x7f130215, float:1.9540733E38)
            r0.<init>(r1, r3, r11)
            goto L_0x011a
        L_0x0020:
            java.lang.String r2 = r0.mo108359a()
            java.lang.String r3 = "DELIVERY_ADDRESS_MISSING"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0036
            com.carrefour.fid.android.core.io.CheckoutMissingDataThrowable r0 = new com.carrefour.fid.android.core.io.CheckoutMissingDataThrowable
            r1 = 2131952150(0x7f130216, float:1.9540735E38)
            r0.<init>(r1, r3, r11)
            goto L_0x011a
        L_0x0036:
            java.lang.String r2 = r0.mo108359a()
            java.lang.String r3 = "PHONE_NUMBER_MISSING"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x004c
            com.carrefour.fid.android.core.io.CheckoutMissingDataThrowable r0 = new com.carrefour.fid.android.core.io.CheckoutMissingDataThrowable
            r1 = 2131952152(0x7f130218, float:1.9540739E38)
            r0.<init>(r1, r3, r11)
            goto L_0x011a
        L_0x004c:
            java.util.List r2 = r0.mo108362d()
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0084
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r7 = r2 instanceof java.util.Collection
            if (r7 == 0) goto L_0x0067
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0067
        L_0x0065:
            r2 = r6
            goto L_0x0080
        L_0x0067:
            java.util.Iterator r2 = r2.iterator()
        L_0x006b:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0065
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "DELIVERY_ADDRESS_NOT_DESERVED"
            boolean r7 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r7, (java.lang.CharSequence) r8, (boolean) r6, (int) r4, (java.lang.Object) r3)
            if (r7 == 0) goto L_0x006b
            r2 = r5
        L_0x0080:
            if (r2 != r5) goto L_0x0084
            r2 = r5
            goto L_0x0085
        L_0x0084:
            r2 = r6
        L_0x0085:
            java.lang.String r7 = ""
            if (r2 == 0) goto L_0x009c
            com.carrefour.fid.android.core.io.CheckoutDeliveryThrowable r1 = new com.carrefour.fid.android.core.io.CheckoutDeliveryThrowable
            java.lang.String r0 = r0.mo108360b()
            if (r0 != 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r7 = r0
        L_0x0093:
            r0 = 2131952151(0x7f130217, float:1.9540737E38)
            r1.<init>(r0, r11, r7)
        L_0x0099:
            r0 = r1
            goto L_0x011a
        L_0x009c:
            java.util.List r2 = r0.mo108362d()
            if (r2 == 0) goto L_0x00ed
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r8 = r2 instanceof java.util.Collection
            if (r8 == 0) goto L_0x00b3
            r8 = r2
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00b3
        L_0x00b1:
            r2 = r6
            goto L_0x00ea
        L_0x00b3:
            java.util.Iterator r2 = r2.iterator()
        L_0x00b7:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00b1
            java.lang.Object r8 = r2.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "FAILURE_CASE_SLOT_INVALID_DATE"
            boolean r9 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r9, (boolean) r6, (int) r4, (java.lang.Object) r3)
            if (r9 != 0) goto L_0x00e6
            java.lang.String r9 = "FAILURE_CASE_SLOT_FULL"
            boolean r9 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r9, (boolean) r6, (int) r4, (java.lang.Object) r3)
            if (r9 != 0) goto L_0x00e6
            java.lang.String r9 = "FAILURE_CASE_SLOT_CLOSE"
            boolean r9 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r9, (boolean) r6, (int) r4, (java.lang.Object) r3)
            if (r9 != 0) goto L_0x00e6
            java.lang.String r9 = "FAILURE_CASE_NO_SLOT"
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r9, (boolean) r6, (int) r4, (java.lang.Object) r3)
            if (r8 == 0) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r8 = r6
            goto L_0x00e7
        L_0x00e6:
            r8 = r5
        L_0x00e7:
            if (r8 == 0) goto L_0x00b7
            r2 = r5
        L_0x00ea:
            if (r2 != r5) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r5 = r6
        L_0x00ee:
            if (r5 == 0) goto L_0x0101
            com.carrefour.fid.android.core.io.CheckoutAssociateThrowable r1 = new com.carrefour.fid.android.core.io.CheckoutAssociateThrowable
            java.lang.String r0 = r0.mo108360b()
            if (r0 != 0) goto L_0x00f9
            goto L_0x00fa
        L_0x00f9:
            r7 = r0
        L_0x00fa:
            r0 = 2131952091(0x7f1301db, float:1.9540615E38)
            r1.<init>(r0, r11, r7)
            goto L_0x0099
        L_0x0101:
            com.carrefour.fid.android.core.io.CheckoutDefaultThrowable r2 = new com.carrefour.fid.android.core.io.CheckoutDefaultThrowable
            java.lang.String r0 = r0.mo108360b()
            if (r0 != 0) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r7 = r0
        L_0x010b:
            r2.<init>(r1, r11, r7)
            r0 = r2
            goto L_0x011a
        L_0x0110:
            com.carrefour.fid.android.core.io.CheckoutDefaultThrowable r0 = new com.carrefour.fid.android.core.io.CheckoutDefaultThrowable
            java.lang.String r2 = new java.lang.String
            r2.<init>()
            r0.<init>(r1, r11, r2)
        L_0x011a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase.mo114504a(java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: b */
    public final Object mo114505b(RedirectionPaymentThrowable redirectionPaymentThrowable, C37624a aVar, StoreService storeService) {
        String str;
        InitPaymentResponse a = redirectionPaymentThrowable.mo108375a();
        String str2 = null;
        if (a != null) {
            str = a.getPsp();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual((Object) str, (Object) C28561l1.f69518k)) {
            Result.C10852a aVar2 = Result.f28060a;
            C36459a1 a1Var = this.f94396b;
            InitPaymentResponse a2 = redirectionPaymentThrowable.mo108375a();
            BasketDomain i = aVar.mo114516i();
            if (storeService != null) {
                str2 = storeService.mo119170N();
            }
            return Result.m38702b(a1Var.mo72340a(new C36459a1.C36460a.C36462b(a2, i, str2, redirectionPaymentThrowable.mo108376b(), aVar.mo114520m(), aVar.mo114521n())));
        }
        Result.C10852a aVar3 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(redirectionPaymentThrowable));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172947invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase.C37624a r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends com.carrefour.fid.android.presentation.models.PaymentConfirmationModel>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase$invoke$1
            r0.<init>(r9, r11)
        L_0x0018:
            r8 = r0
            java.lang.Object r11 = r8.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 != r2) goto L_0x0038
            java.lang.Object r10 = r8.L$1
            com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase$a r10 = (com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase.C37624a) r10
            java.lang.Object r0 = r8.L$0
            com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase r0 = (com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase) r0
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x006c
        L_0x0038:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0040:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.data.datasource.PaymentGateway r1 = r9.f94395a
            com.carrefour.fid.android.core.type.ValidatePaymentType r11 = r10.mo114519l()
            com.carrefour.fid.android.domain.models.BasketDomain r3 = r10.mo114516i()
            boolean r4 = r10.mo114520m()
            boolean r5 = r10.mo114521n()
            com.carrefour.fid.android.domain.models.service.models.StoreService r6 = r10.mo114518k()
            java.lang.String r7 = r10.mo114517j()
            r8.L$0 = r9
            r8.L$1 = r10
            r8.label = r2
            r2 = r11
            java.lang.Object r11 = r1.mo108680n(r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r0 = r9
        L_0x006c:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r11)
            if (r1 != 0) goto L_0x00a4
            r3 = r11
            com.carrefour.fid.android.data.entities.OrderV3 r3 = (com.carrefour.fid.android.data.entities.OrderV3) r3
            com.carrefour.fid.android.data.entities.mapper.a1 r11 = r0.f94396b     // Catch:{ Exception -> 0x0098 }
            com.carrefour.fid.android.data.entities.mapper.a1$a$a r0 = new com.carrefour.fid.android.data.entities.mapper.a1$a$a     // Catch:{ Exception -> 0x0098 }
            com.carrefour.fid.android.domain.models.BasketDomain r4 = r10.mo114516i()     // Catch:{ Exception -> 0x0098 }
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r10.mo114518k()     // Catch:{ Exception -> 0x0098 }
            boolean r6 = r10.mo114520m()     // Catch:{ Exception -> 0x0098 }
            boolean r7 = r10.mo114521n()     // Catch:{ Exception -> 0x0098 }
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0098 }
            com.carrefour.fid.android.presentation.models.PaymentConfirmationModel r10 = r11.mo72340a(r0)     // Catch:{ Exception -> 0x0098 }
            kotlin.Result$a r11 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r10 = kotlin.Result.m38702b(r10)     // Catch:{ Exception -> 0x0098 }
            goto L_0x00c1
        L_0x0098:
            r10 = move-exception
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            goto L_0x00c1
        L_0x00a4:
            boolean r11 = r1 instanceof com.carrefour.fid.android.core.p057io.RedirectionPaymentThrowable
            if (r11 == 0) goto L_0x00b3
            com.carrefour.fid.android.core.io.RedirectionPaymentThrowable r1 = (com.carrefour.fid.android.core.p057io.RedirectionPaymentThrowable) r1
            com.carrefour.fid.android.domain.models.service.models.StoreService r11 = r10.mo114518k()
            java.lang.Object r10 = r0.mo114505b(r1, r10, r11)
            goto L_0x00c1
        L_0x00b3:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.Throwable r10 = r0.mo114504a(r1)
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
        L_0x00c1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase.m172947invokegIAlus(com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.checkout.ValidatePaymentUseCase$a */
    public static final class C37624a {

        /* renamed from: g */
        public static final int f94397g = 8;
        @C12579k

        /* renamed from: a */
        public final ValidatePaymentType f94398a;
        @C12580l

        /* renamed from: b */
        public final BasketDomain f94399b;

        /* renamed from: c */
        public final boolean f94400c;

        /* renamed from: d */
        public final boolean f94401d;
        @C12580l

        /* renamed from: e */
        public final StoreService f94402e;
        @C12580l

        /* renamed from: f */
        public final String f94403f;

        public C37624a(@C12579k ValidatePaymentType validatePaymentType, @C12580l BasketDomain basketDomain, boolean z, boolean z2, @C12580l StoreService storeService, @C12580l String str) {
            Intrinsics.checkNotNullParameter(validatePaymentType, "validatePaymentType");
            this.f94398a = validatePaymentType;
            this.f94399b = basketDomain;
            this.f94400c = z;
            this.f94401d = z2;
            this.f94402e = storeService;
            this.f94403f = str;
        }

        /* renamed from: h */
        public static /* synthetic */ C37624a m154229h(C37624a aVar, ValidatePaymentType validatePaymentType, BasketDomain basketDomain, boolean z, boolean z2, StoreService storeService, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                validatePaymentType = aVar.f94398a;
            }
            if ((i & 2) != 0) {
                basketDomain = aVar.f94399b;
            }
            BasketDomain basketDomain2 = basketDomain;
            if ((i & 4) != 0) {
                z = aVar.f94400c;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = aVar.f94401d;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                storeService = aVar.f94402e;
            }
            StoreService storeService2 = storeService;
            if ((i & 32) != 0) {
                str = aVar.f94403f;
            }
            return aVar.mo114514g(validatePaymentType, basketDomain2, z3, z4, storeService2, str);
        }

        @C12579k
        /* renamed from: a */
        public final ValidatePaymentType mo114507a() {
            return this.f94398a;
        }

        @C12580l
        /* renamed from: b */
        public final BasketDomain mo114508b() {
            return this.f94399b;
        }

        /* renamed from: c */
        public final boolean mo114509c() {
            return this.f94400c;
        }

        /* renamed from: d */
        public final boolean mo114510d() {
            return this.f94401d;
        }

        @C12580l
        /* renamed from: e */
        public final StoreService mo114511e() {
            return this.f94402e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37624a)) {
                return false;
            }
            C37624a aVar = (C37624a) obj;
            return Intrinsics.areEqual((Object) this.f94398a, (Object) aVar.f94398a) && Intrinsics.areEqual((Object) this.f94399b, (Object) aVar.f94399b) && this.f94400c == aVar.f94400c && this.f94401d == aVar.f94401d && Intrinsics.areEqual((Object) this.f94402e, (Object) aVar.f94402e) && Intrinsics.areEqual((Object) this.f94403f, (Object) aVar.f94403f);
        }

        @C12580l
        /* renamed from: f */
        public final String mo114513f() {
            return this.f94403f;
        }

        @C12579k
        /* renamed from: g */
        public final C37624a mo114514g(@C12579k ValidatePaymentType validatePaymentType, @C12580l BasketDomain basketDomain, boolean z, boolean z2, @C12580l StoreService storeService, @C12580l String str) {
            Intrinsics.checkNotNullParameter(validatePaymentType, "validatePaymentType");
            return new C37624a(validatePaymentType, basketDomain, z, z2, storeService, str);
        }

        public int hashCode() {
            int hashCode = this.f94398a.hashCode() * 31;
            BasketDomain basketDomain = this.f94399b;
            int i = 0;
            int hashCode2 = (hashCode + (basketDomain == null ? 0 : basketDomain.hashCode())) * 31;
            boolean z = this.f94400c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f94401d;
            if (!z3) {
                z2 = z3;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            StoreService storeService = this.f94402e;
            int hashCode3 = (i3 + (storeService == null ? 0 : storeService.hashCode())) * 31;
            String str = this.f94403f;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode3 + i;
        }

        @C12580l
        /* renamed from: i */
        public final BasketDomain mo114516i() {
            return this.f94399b;
        }

        @C12580l
        /* renamed from: j */
        public final String mo114517j() {
            return this.f94403f;
        }

        @C12580l
        /* renamed from: k */
        public final StoreService mo114518k() {
            return this.f94402e;
        }

        @C12579k
        /* renamed from: l */
        public final ValidatePaymentType mo114519l() {
            return this.f94398a;
        }

        /* renamed from: m */
        public final boolean mo114520m() {
            return this.f94400c;
        }

        /* renamed from: n */
        public final boolean mo114521n() {
            return this.f94401d;
        }

        @C12579k
        public String toString() {
            ValidatePaymentType validatePaymentType = this.f94398a;
            BasketDomain basketDomain = this.f94399b;
            boolean z = this.f94400c;
            boolean z2 = this.f94401d;
            StoreService storeService = this.f94402e;
            String str = this.f94403f;
            return "Param(validatePaymentType=" + validatePaymentType + ", basket=" + basketDomain + ", isExpressPickup=" + z + ", isPostOrderSubstitutionEnabled=" + z2 + ", storeService=" + storeService + ", oneOrderId=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37624a(ValidatePaymentType validatePaymentType, BasketDomain basketDomain, boolean z, boolean z2, StoreService storeService, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(validatePaymentType, basketDomain, z, z2, (i & 16) != 0 ? null : storeService, (i & 32) != 0 ? null : str);
        }
    }
}
