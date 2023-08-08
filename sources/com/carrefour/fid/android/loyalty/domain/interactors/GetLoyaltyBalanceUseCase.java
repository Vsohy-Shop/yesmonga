package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase$Params;", "", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase$Params;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "repository", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;)V", "Params", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class GetLoyaltyBalanceUseCase implements C37679f<Params, Double> {
    @C12579k
    private LoyaltyRepository repository;

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase$Params;", "", "cardFidNumber", "", "(Ljava/lang/String;)V", "getCardFidNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Params {
        @C12579k
        private final String cardFidNumber;

        public Params(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "cardFidNumber");
            this.cardFidNumber = str;
        }

        public static /* synthetic */ Params copy$default(Params params, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = params.cardFidNumber;
            }
            return params.copy(str);
        }

        @C12579k
        public final String component1() {
            return this.cardFidNumber;
        }

        @C12579k
        public final Params copy(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "cardFidNumber");
            return new Params(str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && Intrinsics.areEqual((Object) this.cardFidNumber, (Object) ((Params) obj).cardFidNumber);
        }

        @C12579k
        public final String getCardFidNumber() {
            return this.cardFidNumber;
        }

        public int hashCode() {
            return this.cardFidNumber.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.cardFidNumber;
            return "Params(cardFidNumber=" + str + ")";
        }
    }

    @Inject
    public GetLoyaltyBalanceUseCase(@C12579k LoyaltyRepository loyaltyRepository) {
        Intrinsics.checkNotNullParameter(loyaltyRepository, "repository");
        this.repository = loyaltyRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173041invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase.Params r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Double>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0065
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            java.lang.String r5 = r5.getCardFidNumber()
            int r6 = r5.length()
            if (r6 != 0) goto L_0x0046
            r6 = r3
            goto L_0x0047
        L_0x0046:
            r6 = 0
        L_0x0047:
            if (r6 == 0) goto L_0x005a
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.loyalty.core.io.LoyaltyThrowable r5 = new com.carrefour.fid.android.loyalty.core.io.LoyaltyThrowable
            r6 = 0
            r5.<init>(r6, r3, r6)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x005a:
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository r6 = r4.repository
            r0.label = r3
            java.lang.Object r5 = r6.m173021getLoyaltyBalancegIAlus(r5, r0)
            if (r5 != r1) goto L_0x0065
            return r1
        L_0x0065:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r5)
            if (r6 != 0) goto L_0x007d
            com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyBalanceResponse r5 = (com.carrefour.fid.android.loyalty.data.models.entities.LoyaltyBalanceResponse) r5
            kotlin.Result$a r6 = kotlin.Result.f28060a
            double r5 = r5.getBalance()
            java.lang.Double r5 = kotlin.coroutines.jvm.internal.C11064a.m42618d(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0119
        L_0x007d:
            boolean r5 = r6 instanceof com.carrefour.fid.android.shared.p046io.ResponseThrowable
            if (r5 != 0) goto L_0x008d
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0119
        L_0x008d:
            r5 = r6
            com.carrefour.fid.android.shared.io.ResponseThrowable r5 = (com.carrefour.fid.android.shared.p046io.ResponseThrowable) r5
            int r5 = r5.mo83810a()
            r0 = 3
            if (r5 == r0) goto L_0x010a
            r0 = 6
            if (r5 == r0) goto L_0x00f2
            r0 = 127(0x7f, float:1.78E-43)
            if (r5 == r0) goto L_0x00da
            r0 = 603(0x25b, float:8.45E-43)
            if (r5 == r0) goto L_0x00da
            r0 = 900(0x384, float:1.261E-42)
            if (r5 == r0) goto L_0x00c2
            r0 = 4033(0xfc1, float:5.651E-42)
            if (r5 == r0) goto L_0x010a
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.loyalty.core.io.CheckoutCardFidThrowable r5 = new com.carrefour.fid.android.loyalty.core.io.CheckoutCardFidThrowable
            java.lang.String r0 = r6.getMessage()
            java.lang.Throwable r6 = r6.getCause()
            r5.<init>(r0, r6)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0119
        L_0x00c2:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.loyalty.core.io.CheckoutBalanceFidThrowable r5 = new com.carrefour.fid.android.loyalty.core.io.CheckoutBalanceFidThrowable
            java.lang.String r0 = r6.getMessage()
            java.lang.Throwable r6 = r6.getCause()
            r5.<init>(r0, r6)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0119
        L_0x00da:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.loyalty.core.io.CheckoutBalanceThrowable r5 = new com.carrefour.fid.android.loyalty.core.io.CheckoutBalanceThrowable
            java.lang.String r0 = r6.getMessage()
            java.lang.Throwable r6 = r6.getCause()
            r5.<init>(r0, r6)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0119
        L_0x00f2:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.loyalty.core.io.CheckoutCardFidNotSecuredThrowable r5 = new com.carrefour.fid.android.loyalty.core.io.CheckoutCardFidNotSecuredThrowable
            java.lang.String r0 = r6.getMessage()
            java.lang.Throwable r6 = r6.getCause()
            r5.<init>(r0, r6)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0119
        L_0x010a:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.loyalty.core.io.CheckoutNotAcceptedCardFidThrowable r5 = new com.carrefour.fid.android.loyalty.core.io.CheckoutNotAcceptedCardFidThrowable
            r5.<init>()
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0119:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase.m173041invokegIAlus(com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params, kotlin.coroutines.c):java.lang.Object");
    }
}
