package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/LinkLoyaltyCardUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/LinkLoyaltyCardUseCase$Param;", "", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/LinkLoyaltyCardUseCase$Param;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/loyalty/data/repositories/LinkLoyaltyCardRepository;", "linkLoyaltyCardRepository", "Lcom/carrefour/fid/android/loyalty/data/repositories/LinkLoyaltyCardRepository;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/repositories/LinkLoyaltyCardRepository;)V", "Param", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class LinkLoyaltyCardUseCase implements C37679f<Param, String> {
    @C12579k
    private final LinkLoyaltyCardRepository linkLoyaltyCardRepository;

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/LinkLoyaltyCardUseCase$Param;", "", "idTokenLoyalty", "", "cardNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "getIdTokenLoyalty", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Param {
        @C12579k
        private final String cardNumber;
        @C12579k
        private final String idTokenLoyalty;

        public Param(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "idTokenLoyalty");
            Intrinsics.checkNotNullParameter(str2, C28633g.f70218b);
            this.idTokenLoyalty = str;
            this.cardNumber = str2;
        }

        public static /* synthetic */ Param copy$default(Param param, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = param.idTokenLoyalty;
            }
            if ((i & 2) != 0) {
                str2 = param.cardNumber;
            }
            return param.copy(str, str2);
        }

        @C12579k
        public final String component1() {
            return this.idTokenLoyalty;
        }

        @C12579k
        public final String component2() {
            return this.cardNumber;
        }

        @C12579k
        public final Param copy(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "idTokenLoyalty");
            Intrinsics.checkNotNullParameter(str2, C28633g.f70218b);
            return new Param(str, str2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Param)) {
                return false;
            }
            Param param = (Param) obj;
            return Intrinsics.areEqual((Object) this.idTokenLoyalty, (Object) param.idTokenLoyalty) && Intrinsics.areEqual((Object) this.cardNumber, (Object) param.cardNumber);
        }

        @C12579k
        public final String getCardNumber() {
            return this.cardNumber;
        }

        @C12579k
        public final String getIdTokenLoyalty() {
            return this.idTokenLoyalty;
        }

        public int hashCode() {
            return (this.idTokenLoyalty.hashCode() * 31) + this.cardNumber.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.idTokenLoyalty;
            String str2 = this.cardNumber;
            return "Param(idTokenLoyalty=" + str + ", cardNumber=" + str2 + ")";
        }
    }

    @Inject
    public LinkLoyaltyCardUseCase(@C12579k LinkLoyaltyCardRepository linkLoyaltyCardRepository2) {
        Intrinsics.checkNotNullParameter(linkLoyaltyCardRepository2, "linkLoyaltyCardRepository");
        this.linkLoyaltyCardRepository = linkLoyaltyCardRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173056invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase.Param r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase$invoke$1
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
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.loyalty.data.repositories.LinkLoyaltyCardRepository r6 = r4.linkLoyaltyCardRepository
            java.lang.String r2 = r5.getIdTokenLoyalty()
            java.lang.String r5 = r5.getCardNumber()
            r0.label = r3
            java.lang.Object r5 = r6.m173016linkLoyaltyCardToAccount0E7RQCE(r2, r5, r0)
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase.m173056invokegIAlus(com.carrefour.fid.android.loyalty.domain.interactors.LinkLoyaltyCardUseCase$Param, kotlin.coroutines.c):java.lang.Object");
    }
}
