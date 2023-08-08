package com.carrefour.fid.android.domain.interactors.checkout;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.p057io.RedirectionPaymentThrowable;
import com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway;
import com.carrefour.fid.android.data.entities.InitPaymentResponse;
import com.carrefour.fid.android.data.entities.mapper.C36459a1;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.presentation.models.PaymentConfirmationModel;
import com.carrefour.fid.android.shared.constant.C28561l1;
import javax.inject.Inject;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nNonFoodValidatePaymentUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodValidatePaymentUseCase.kt\ncom/carrefour/fid/android/domain/interactors/checkout/NonFoodValidatePaymentUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1747#2,3:170\n1747#2,3:173\n*S KotlinDebug\n*F\n+ 1 NonFoodValidatePaymentUseCase.kt\ncom/carrefour/fid/android/domain/interactors/checkout/NonFoodValidatePaymentUseCase\n*L\n114#1:170,3\n121#1:173,3\n*E\n"})
public final class NonFoodValidatePaymentUseCase implements C37679f<C37622a, PaymentConfirmationModel> {

    /* renamed from: c */
    public static final int f94379c = 8;
    @C12579k

    /* renamed from: a */
    public final NonFoodPaymentGateway f94380a;
    @C12579k

    /* renamed from: b */
    public final C36459a1 f94381b;

    @Inject
    public NonFoodValidatePaymentUseCase(@C12579k NonFoodPaymentGateway nonFoodPaymentGateway, @C12579k C36459a1 a1Var) {
        Intrinsics.checkNotNullParameter(nonFoodPaymentGateway, "paymentGateway");
        Intrinsics.checkNotNullParameter(a1Var, "paymentConfirmationMapper");
        this.f94380a = nonFoodPaymentGateway;
        this.f94381b = a1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ea, code lost:
        if (r2 == true) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable mo114472a(java.lang.Throwable r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase.mo114472a(java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: b */
    public final Object mo114473b(RedirectionPaymentThrowable redirectionPaymentThrowable, C37622a aVar, StoreService storeService) {
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
            C36459a1 a1Var = this.f94381b;
            InitPaymentResponse a2 = redirectionPaymentThrowable.mo108375a();
            BasketDomain j = aVar.mo114485j();
            if (storeService != null) {
                str2 = storeService.mo119170N();
            }
            return Result.m38702b(a1Var.mo72340a(new C36459a1.C36460a.C36462b(a2, j, str2, redirectionPaymentThrowable.mo108376b(), aVar.mo114490o(), aVar.mo114491p())));
        }
        Result.C10852a aVar3 = Result.f28060a;
        return Result.m38702b(C11661u0.m45734a(redirectionPaymentThrowable));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172946invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase.C37622a r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends com.carrefour.fid.android.presentation.models.PaymentConfirmationModel>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$invoke$1
            r0.<init>(r10, r12)
        L_0x0018:
            r9 = r0
            java.lang.Object r12 = r9.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 != r2) goto L_0x0038
            java.lang.Object r11 = r9.L$1
            com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$a r11 = (com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase.C37622a) r11
            java.lang.Object r0 = r9.L$0
            com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase r0 = (com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase) r0
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x0070
        L_0x0038:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0040:
            kotlin.C11661u0.m45747n(r12)
            com.carrefour.fid.android.data.datasource.NonFoodPaymentGateway r1 = r10.f94380a
            java.lang.String r12 = r11.mo114489n()
            com.carrefour.fid.android.domain.models.BasketDomain r3 = r11.mo114485j()
            boolean r4 = r11.mo114490o()
            boolean r5 = r11.mo114491p()
            com.carrefour.fid.android.domain.models.service.models.StoreService r6 = r11.mo114487l()
            java.lang.String r7 = r11.mo114486k()
            com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$a$a r8 = r11.mo114488m()
            r9.L$0 = r10
            r9.L$1 = r11
            r9.label = r2
            r2 = r12
            java.lang.Object r12 = r1.mo108672e(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L_0x006f
            return r0
        L_0x006f:
            r0 = r10
        L_0x0070:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r12)
            if (r1 != 0) goto L_0x00a8
            r3 = r12
            com.carrefour.fid.android.data.entities.OrderV3 r3 = (com.carrefour.fid.android.data.entities.OrderV3) r3
            com.carrefour.fid.android.data.entities.mapper.a1 r12 = r0.f94381b     // Catch:{ Exception -> 0x009c }
            com.carrefour.fid.android.data.entities.mapper.a1$a$a r0 = new com.carrefour.fid.android.data.entities.mapper.a1$a$a     // Catch:{ Exception -> 0x009c }
            com.carrefour.fid.android.domain.models.BasketDomain r4 = r11.mo114485j()     // Catch:{ Exception -> 0x009c }
            com.carrefour.fid.android.domain.models.service.models.StoreService r5 = r11.mo114487l()     // Catch:{ Exception -> 0x009c }
            boolean r6 = r11.mo114490o()     // Catch:{ Exception -> 0x009c }
            boolean r7 = r11.mo114491p()     // Catch:{ Exception -> 0x009c }
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x009c }
            com.carrefour.fid.android.presentation.models.PaymentConfirmationModel r11 = r12.mo72340a(r0)     // Catch:{ Exception -> 0x009c }
            kotlin.Result$a r12 = kotlin.Result.f28060a     // Catch:{ Exception -> 0x009c }
            java.lang.Object r11 = kotlin.Result.m38702b(r11)     // Catch:{ Exception -> 0x009c }
            goto L_0x00c5
        L_0x009c:
            r11 = move-exception
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r11)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
            goto L_0x00c5
        L_0x00a8:
            boolean r12 = r1 instanceof com.carrefour.fid.android.core.p057io.RedirectionPaymentThrowable
            if (r12 == 0) goto L_0x00b7
            com.carrefour.fid.android.core.io.RedirectionPaymentThrowable r1 = (com.carrefour.fid.android.core.p057io.RedirectionPaymentThrowable) r1
            com.carrefour.fid.android.domain.models.service.models.StoreService r12 = r11.mo114487l()
            java.lang.Object r11 = r0.mo114473b(r1, r11, r12)
            goto L_0x00c5
        L_0x00b7:
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.lang.Throwable r11 = r0.mo114472a(r1)
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r11)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
        L_0x00c5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase.m172946invokegIAlus(com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$a */
    public static final class C37622a {

        /* renamed from: h */
        public static final int f94382h = 8;
        @C12579k

        /* renamed from: a */
        public final String f94383a;
        @C12580l

        /* renamed from: b */
        public final BasketDomain f94384b;

        /* renamed from: c */
        public final boolean f94385c;

        /* renamed from: d */
        public final boolean f94386d;
        @C12580l

        /* renamed from: e */
        public final StoreService f94387e;
        @C12580l

        /* renamed from: f */
        public final String f94388f;
        @C12580l

        /* renamed from: g */
        public final C37623a f94389g;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.domain.interactors.checkout.NonFoodValidatePaymentUseCase$a$a */
        public static final class C37623a {

            /* renamed from: d */
            public static final int f94390d = 8;
            @C12580l

            /* renamed from: a */
            public final Address f94391a;
            @C12580l

            /* renamed from: b */
            public final Address f94392b;
            @C12580l

            /* renamed from: c */
            public final String f94393c;

            public C37623a(@C12580l Address address, @C12580l Address address2, @C12580l String str) {
                this.f94391a = address;
                this.f94392b = address2;
                this.f94393c = str;
            }

            /* renamed from: e */
            public static /* synthetic */ C37623a m154217e(C37623a aVar, Address address, Address address2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    address = aVar.f94391a;
                }
                if ((i & 2) != 0) {
                    address2 = aVar.f94392b;
                }
                if ((i & 4) != 0) {
                    str = aVar.f94393c;
                }
                return aVar.mo114496d(address, address2, str);
            }

            @C12580l
            /* renamed from: a */
            public final Address mo114493a() {
                return this.f94391a;
            }

            @C12580l
            /* renamed from: b */
            public final Address mo114494b() {
                return this.f94392b;
            }

            @C12580l
            /* renamed from: c */
            public final String mo114495c() {
                return this.f94393c;
            }

            @C12579k
            /* renamed from: d */
            public final C37623a mo114496d(@C12580l Address address, @C12580l Address address2, @C12580l String str) {
                return new C37623a(address, address2, str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C37623a)) {
                    return false;
                }
                C37623a aVar = (C37623a) obj;
                return Intrinsics.areEqual((Object) this.f94391a, (Object) aVar.f94391a) && Intrinsics.areEqual((Object) this.f94392b, (Object) aVar.f94392b) && Intrinsics.areEqual((Object) this.f94393c, (Object) aVar.f94393c);
            }

            @C12580l
            /* renamed from: f */
            public final Address mo114498f() {
                return this.f94391a;
            }

            @C12580l
            /* renamed from: g */
            public final String mo114499g() {
                return this.f94393c;
            }

            @C12580l
            /* renamed from: h */
            public final Address mo114500h() {
                return this.f94392b;
            }

            public int hashCode() {
                Address address = this.f94391a;
                int i = 0;
                int hashCode = (address == null ? 0 : address.hashCode()) * 31;
                Address address2 = this.f94392b;
                int hashCode2 = (hashCode + (address2 == null ? 0 : address2.hashCode())) * 31;
                String str = this.f94393c;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode2 + i;
            }

            /* renamed from: i */
            public final boolean mo114502i() {
                boolean z;
                Address address = this.f94391a;
                if (address != null && (!C11622t.isBlank(address.mo116722w()))) {
                    return true;
                }
                Address address2 = this.f94392b;
                if (address2 != null && (!C11622t.isBlank(address2.mo116722w()))) {
                    return true;
                }
                String str = this.f94393c;
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return true;
                }
                return false;
            }

            @C12579k
            public String toString() {
                Address address = this.f94391a;
                Address address2 = this.f94392b;
                String str = this.f94393c;
                return "UpdatedAddress(billingAddress=" + address + ", deliveryAddress=" + address2 + ", contactNumber=" + str + ")";
            }
        }

        public C37622a(@C12579k String str, @C12580l BasketDomain basketDomain, boolean z, boolean z2, @C12580l StoreService storeService, @C12580l String str2, @C12580l C37623a aVar) {
            Intrinsics.checkNotNullParameter(str, "userLoyaltyAmount");
            this.f94383a = str;
            this.f94384b = basketDomain;
            this.f94385c = z;
            this.f94386d = z2;
            this.f94387e = storeService;
            this.f94388f = str2;
            this.f94389g = aVar;
        }

        /* renamed from: i */
        public static /* synthetic */ C37622a m154201i(C37622a aVar, String str, BasketDomain basketDomain, boolean z, boolean z2, StoreService storeService, String str2, C37623a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94383a;
            }
            if ((i & 2) != 0) {
                basketDomain = aVar.f94384b;
            }
            BasketDomain basketDomain2 = basketDomain;
            if ((i & 4) != 0) {
                z = aVar.f94385c;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = aVar.f94386d;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                storeService = aVar.f94387e;
            }
            StoreService storeService2 = storeService;
            if ((i & 32) != 0) {
                str2 = aVar.f94388f;
            }
            String str3 = str2;
            if ((i & 64) != 0) {
                aVar2 = aVar.f94389g;
            }
            return aVar.mo114483h(str, basketDomain2, z3, z4, storeService2, str3, aVar2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo114475a() {
            return this.f94383a;
        }

        @C12580l
        /* renamed from: b */
        public final BasketDomain mo114476b() {
            return this.f94384b;
        }

        /* renamed from: c */
        public final boolean mo114477c() {
            return this.f94385c;
        }

        /* renamed from: d */
        public final boolean mo114478d() {
            return this.f94386d;
        }

        @C12580l
        /* renamed from: e */
        public final StoreService mo114479e() {
            return this.f94387e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37622a)) {
                return false;
            }
            C37622a aVar = (C37622a) obj;
            return Intrinsics.areEqual((Object) this.f94383a, (Object) aVar.f94383a) && Intrinsics.areEqual((Object) this.f94384b, (Object) aVar.f94384b) && this.f94385c == aVar.f94385c && this.f94386d == aVar.f94386d && Intrinsics.areEqual((Object) this.f94387e, (Object) aVar.f94387e) && Intrinsics.areEqual((Object) this.f94388f, (Object) aVar.f94388f) && Intrinsics.areEqual((Object) this.f94389g, (Object) aVar.f94389g);
        }

        @C12580l
        /* renamed from: f */
        public final String mo114481f() {
            return this.f94388f;
        }

        @C12580l
        /* renamed from: g */
        public final C37623a mo114482g() {
            return this.f94389g;
        }

        @C12579k
        /* renamed from: h */
        public final C37622a mo114483h(@C12579k String str, @C12580l BasketDomain basketDomain, boolean z, boolean z2, @C12580l StoreService storeService, @C12580l String str2, @C12580l C37623a aVar) {
            Intrinsics.checkNotNullParameter(str, "userLoyaltyAmount");
            return new C37622a(str, basketDomain, z, z2, storeService, str2, aVar);
        }

        public int hashCode() {
            int hashCode = this.f94383a.hashCode() * 31;
            BasketDomain basketDomain = this.f94384b;
            int i = 0;
            int hashCode2 = (hashCode + (basketDomain == null ? 0 : basketDomain.hashCode())) * 31;
            boolean z = this.f94385c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f94386d;
            if (!z3) {
                z2 = z3;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            StoreService storeService = this.f94387e;
            int hashCode3 = (i3 + (storeService == null ? 0 : storeService.hashCode())) * 31;
            String str = this.f94388f;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            C37623a aVar = this.f94389g;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode4 + i;
        }

        @C12580l
        /* renamed from: j */
        public final BasketDomain mo114485j() {
            return this.f94384b;
        }

        @C12580l
        /* renamed from: k */
        public final String mo114486k() {
            return this.f94388f;
        }

        @C12580l
        /* renamed from: l */
        public final StoreService mo114487l() {
            return this.f94387e;
        }

        @C12580l
        /* renamed from: m */
        public final C37623a mo114488m() {
            return this.f94389g;
        }

        @C12579k
        /* renamed from: n */
        public final String mo114489n() {
            return this.f94383a;
        }

        /* renamed from: o */
        public final boolean mo114490o() {
            return this.f94385c;
        }

        /* renamed from: p */
        public final boolean mo114491p() {
            return this.f94386d;
        }

        @C12579k
        public String toString() {
            String str = this.f94383a;
            BasketDomain basketDomain = this.f94384b;
            boolean z = this.f94385c;
            boolean z2 = this.f94386d;
            StoreService storeService = this.f94387e;
            String str2 = this.f94388f;
            C37623a aVar = this.f94389g;
            return "Param(userLoyaltyAmount=" + str + ", basket=" + basketDomain + ", isExpressPickup=" + z + ", isPostOrderSubstitutionEnabled=" + z2 + ", storeService=" + storeService + ", oneOrderId=" + str2 + ", updatedAddress=" + aVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37622a(String str, BasketDomain basketDomain, boolean z, boolean z2, StoreService storeService, String str2, C37623a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, basketDomain, z, z2, (i & 16) != 0 ? null : storeService, (i & 32) != 0 ? null : str2, aVar);
        }
    }
}
