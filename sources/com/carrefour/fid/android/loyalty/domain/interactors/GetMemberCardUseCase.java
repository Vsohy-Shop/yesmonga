package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository;
import com.carrefour.fid.android.loyalty.domain.models.LoyaltyMemberCardDomain;
import com.carrefour.fid.android.shared.data.datastore.pref.C28633g;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/GetMemberCardUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetMemberCardUseCase$Param;", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyMemberCardDomain;", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/GetMemberCardUseCase$Param;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/loyalty/data/repositories/MemberCardRepository;", "memberCardRepository", "Lcom/carrefour/fid/android/loyalty/data/repositories/MemberCardRepository;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/repositories/MemberCardRepository;)V", "Param", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public class GetMemberCardUseCase implements C37679f<Param, LoyaltyMemberCardDomain> {
    @C12579k
    private final MemberCardRepository memberCardRepository;

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/GetMemberCardUseCase$Param;", "", "cardNumber", "", "(Ljava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Param {
        @C12579k
        private final String cardNumber;

        public Param(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
            this.cardNumber = str;
        }

        public static /* synthetic */ Param copy$default(Param param, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = param.cardNumber;
            }
            return param.copy(str);
        }

        @C12579k
        public final String component1() {
            return this.cardNumber;
        }

        @C12579k
        public final Param copy(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C28633g.f70218b);
            return new Param(str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Param) && Intrinsics.areEqual((Object) this.cardNumber, (Object) ((Param) obj).cardNumber);
        }

        @C12579k
        public final String getCardNumber() {
            return this.cardNumber;
        }

        public int hashCode() {
            return this.cardNumber.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.cardNumber;
            return "Param(cardNumber=" + str + ")";
        }
    }

    @Inject
    public GetMemberCardUseCase(@C12579k MemberCardRepository memberCardRepository2) {
        Intrinsics.checkNotNullParameter(memberCardRepository2, "memberCardRepository");
        this.memberCardRepository = memberCardRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m158608a(com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase r7, com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase.Param r8, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.loyalty.domain.models.LoyaltyMemberCardDomain>> r9) {
        /*
            boolean r0 = r9 instanceof com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r7 = r9.mo21858l()
            goto L_0x00c6
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r7 = r9.mo21858l()
            goto L_0x009a
        L_0x0048:
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r7 = r9.mo21858l()
            goto L_0x0076
        L_0x0052:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils r9 = com.carrefour.fid.android.loyalty.core.util.LoyaltyUtils.INSTANCE
            java.lang.String r2 = r8.getCardNumber()
            int r2 = r9.getTypeCard(r2)
            com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType r6 = com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType.CZAM
            int r6 = r6.getType()
            if (r2 != r6) goto L_0x0077
            com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository r7 = r7.memberCardRepository
            java.lang.String r8 = r8.getCardNumber()
            r0.label = r5
            java.lang.Object r7 = r7.m173030getMemberCardgIAlus(r8, r0)
            if (r7 != r1) goto L_0x0076
            return r1
        L_0x0076:
            return r7
        L_0x0077:
            com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType r5 = com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType.FID
            int r5 = r5.getType()
            java.lang.String r6 = "Invalid Card"
            if (r2 != r5) goto L_0x00ab
            java.lang.String r2 = r8.getCardNumber()
            boolean r9 = r9.luhn(r2)
            if (r9 == 0) goto L_0x009b
            com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository r7 = r7.memberCardRepository
            java.lang.String r8 = r8.getCardNumber()
            r0.label = r4
            java.lang.Object r7 = r7.m173030getMemberCardgIAlus(r8, r0)
            if (r7 != r1) goto L_0x009a
            return r1
        L_0x009a:
            return r7
        L_0x009b:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.loyalty.core.io.InvalidCardError r7 = new com.carrefour.fid.android.loyalty.core.io.InvalidCardError
            r7.<init>(r6)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x00d6
        L_0x00ab:
            com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType r4 = com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType.PASS
            int r4 = r4.getType()
            if (r2 != r4) goto L_0x00c7
            java.lang.String r8 = r8.getCardNumber()
            java.lang.String r8 = r9.getPassCardNumber(r8)
            com.carrefour.fid.android.loyalty.data.repositories.MemberCardRepository r7 = r7.memberCardRepository
            r0.label = r3
            java.lang.Object r7 = r7.m173030getMemberCardgIAlus(r8, r0)
            if (r7 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            return r7
        L_0x00c7:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            com.carrefour.fid.android.loyalty.core.io.InvalidCardError r7 = new com.carrefour.fid.android.loyalty.core.io.InvalidCardError
            r7.<init>(r6)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
        L_0x00d6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase.m158608a(com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase, com.carrefour.fid.android.loyalty.domain.interactors.GetMemberCardUseCase$Param, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public Object m173048invokegIAlus(@C12579k Param param, @C12579k C11045c<? super Result<LoyaltyMemberCardDomain>> cVar) {
        return m158608a(this, param, cVar);
    }
}
