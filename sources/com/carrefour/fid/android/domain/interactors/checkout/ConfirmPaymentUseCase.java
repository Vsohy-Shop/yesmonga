package com.carrefour.fid.android.domain.interactors.checkout;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.p057io.CheckoutPaymentResponseThrowable;
import com.carrefour.fid.android.core.p057io.CheckoutResponseThrowable;
import com.carrefour.fid.android.core.type.PaymentErrorType;
import com.carrefour.fid.android.data.datasource.PaymentGateway;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.models.OrderConfirmationDomain;
import com.carrefour.fid.android.shared.constant.C28561l1;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class ConfirmPaymentUseCase implements C37679f<C37621a, OrderConfirmationDomain> {

    /* renamed from: b */
    public static final int f94373b = 8;
    @C12579k

    /* renamed from: a */
    public final PaymentGateway f94374a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase$a */
    public static final class C37621a {

        /* renamed from: d */
        public static final int f94375d = 0;
        @C12579k

        /* renamed from: a */
        public final String f94376a;
        @C12579k

        /* renamed from: b */
        public final String f94377b;
        @C12580l

        /* renamed from: c */
        public final String f94378c;

        public C37621a(@C12579k String str, @C12579k String str2, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, "data");
            Intrinsics.checkNotNullParameter(str2, "token");
            this.f94376a = str;
            this.f94377b = str2;
            this.f94378c = str3;
        }

        @C12579k
        /* renamed from: a */
        public final String mo114469a() {
            return this.f94376a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo114470b() {
            return this.f94377b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo114471c() {
            return this.f94378c;
        }
    }

    @Inject
    public ConfirmPaymentUseCase(@C12579k PaymentGateway paymentGateway) {
        Intrinsics.checkNotNullParameter(paymentGateway, "confirmPayment");
        this.f94374a = paymentGateway;
    }

    /* renamed from: a */
    public final Throwable mo114467a(Throwable th) {
        CheckoutResponseThrowable checkoutResponseThrowable;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        if (th instanceof CheckoutResponseThrowable) {
            checkoutResponseThrowable = (CheckoutResponseThrowable) th;
        } else {
            checkoutResponseThrowable = null;
        }
        if (checkoutResponseThrowable != null) {
            str = checkoutResponseThrowable.mo108361c();
        } else {
            str = null;
        }
        if (checkoutResponseThrowable != null) {
            str2 = checkoutResponseThrowable.mo108359a();
        } else {
            str2 = null;
        }
        boolean z4 = false;
        if (C11622t.equals$default(str2, C28561l1.f69528u, false, 2, (Object) null) || C11622t.equals$default(str2, C28561l1.f69524q, false, 2, (Object) null) || C11622t.equals$default(str2, C28561l1.f69526s, false, 2, (Object) null) || C11622t.equals$default(str2, C28561l1.f69525r, false, 2, (Object) null) || C11622t.equals$default(str2, C28561l1.f69527t, false, 2, (Object) null)) {
            return new CheckoutPaymentResponseThrowable(PaymentErrorType.PAYMENT_CANCELED, str2, str);
        }
        if (C11622t.equals$default(str2, C28561l1.f69530w, false, 2, (Object) null) || C11622t.equals$default(str2, C28561l1.f69531x, false, 2, (Object) null)) {
            return new CheckoutPaymentResponseThrowable(PaymentErrorType.CARD_EXPIRED, str2, str);
        }
        if (C11622t.equals$default(str2, C28561l1.f69529v, false, 2, (Object) null)) {
            return new CheckoutPaymentResponseThrowable(PaymentErrorType.AMOUNT_LIMIT_EXCEEDED, str2, str);
        }
        if (C11622t.equals$default(str2, C28561l1.f69505E, false, 2, (Object) null) || C11622t.equals$default(str2, C28561l1.f69502B, false, 2, (Object) null) || C11622t.equals$default(str2, C28561l1.f69504D, false, 2, (Object) null) || C11622t.equals$default(str2, C28561l1.f69503C, false, 2, (Object) null) || C11622t.equals$default(str2, C28561l1.f69506F, false, 2, (Object) null) || C11622t.equals$default(str2, C28561l1.f69507G, false, 2, (Object) null)) {
            return new CheckoutPaymentResponseThrowable(PaymentErrorType.TECHNICAL_ERROR, str2, str);
        }
        if (!C11622t.equals$default(str2, C28561l1.f69532y, false, 2, (Object) null) && !C11622t.equals$default(str2, C28561l1.f69533z, false, 2, (Object) null)) {
            if (str2 == null || !C11622t.startsWith$default(str2, C28561l1.f69521n, false, 2, (Object) null)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (str2 == null || !C11622t.startsWith$default(str2, C28561l1.f69522o, false, 2, (Object) null)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    if (!C11622t.equals$default(str2, C28561l1.f69501A, false, 2, (Object) null)) {
                        if (str2 == null || !C11622t.startsWith$default(str2, C28561l1.f69520m, false, 2, (Object) null)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            if (str2 != null && C11622t.startsWith$default(str2, C28561l1.f69523p, false, 2, (Object) null)) {
                                z4 = true;
                            }
                            if (z4) {
                                return new CheckoutPaymentResponseThrowable(PaymentErrorType.PAYMENT_GENERIC_ERROR, str2, str);
                            }
                            return th;
                        }
                    }
                    return new CheckoutPaymentResponseThrowable(PaymentErrorType.PAYMENT_REFUSED, str2, str);
                }
            }
        }
        return new CheckoutPaymentResponseThrowable(PaymentErrorType.REJECTED_TRANSACTION, str2, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172945invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase.C37621a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.OrderConfirmationDomain>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase$a r6 = (com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase.C37621a) r6
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase r0 = (com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase) r0
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x005a
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.datasource.PaymentGateway r7 = r5.f94374a
            java.lang.String r2 = r6.mo114469a()
            java.lang.String r4 = r6.mo114470b()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.mo108674g(r2, r4, r0)
            if (r7 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r5
        L_0x005a:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r7)
            if (r1 != 0) goto L_0x0070
            com.carrefour.fid.android.domain.models.OrderConfirmationDomain r7 = (com.carrefour.fid.android.domain.models.OrderConfirmationDomain) r7
            java.lang.String r6 = r6.mo114471c()
            com.carrefour.fid.android.core.extension.C36305d.m148948a(r7, r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
            goto L_0x007e
        L_0x0070:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Throwable r6 = r0.mo114467a(r1)
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x007e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase.m172945invokegIAlus(com.carrefour.fid.android.domain.interactors.checkout.ConfirmPaymentUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
