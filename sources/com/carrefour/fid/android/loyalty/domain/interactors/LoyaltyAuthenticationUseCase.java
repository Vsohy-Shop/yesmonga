package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.loyalty.data.repositories.LoyaltyAuthRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase$Param;", "", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase$Param;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyAuthRepository;", "repository", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyAuthRepository;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyAuthRepository;)V", "Param", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLoyaltyAuthenticationUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyAuthenticationUseCase.kt\ncom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
public final class LoyaltyAuthenticationUseCase implements C37679f<Param, String> {
    @C12579k
    private LoyaltyAuthRepository repository;

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyAuthenticationUseCase$Param;", "", "cardFidNumber", "", "secretCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardFidNumber", "()Ljava/lang/String;", "getSecretCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Param {
        @C12579k
        private final String cardFidNumber;
        @C12579k
        private final String secretCode;

        public Param(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "cardFidNumber");
            Intrinsics.checkNotNullParameter(str2, "secretCode");
            this.cardFidNumber = str;
            this.secretCode = str2;
        }

        public static /* synthetic */ Param copy$default(Param param, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = param.cardFidNumber;
            }
            if ((i & 2) != 0) {
                str2 = param.secretCode;
            }
            return param.copy(str, str2);
        }

        @C12579k
        public final String component1() {
            return this.cardFidNumber;
        }

        @C12579k
        public final String component2() {
            return this.secretCode;
        }

        @C12579k
        public final Param copy(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "cardFidNumber");
            Intrinsics.checkNotNullParameter(str2, "secretCode");
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
            return Intrinsics.areEqual((Object) this.cardFidNumber, (Object) param.cardFidNumber) && Intrinsics.areEqual((Object) this.secretCode, (Object) param.secretCode);
        }

        @C12579k
        public final String getCardFidNumber() {
            return this.cardFidNumber;
        }

        @C12579k
        public final String getSecretCode() {
            return this.secretCode;
        }

        public int hashCode() {
            return (this.cardFidNumber.hashCode() * 31) + this.secretCode.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.cardFidNumber;
            String str2 = this.secretCode;
            return "Param(cardFidNumber=" + str + ", secretCode=" + str2 + ")";
        }
    }

    @Inject
    public LoyaltyAuthenticationUseCase(@C12579k LoyaltyAuthRepository loyaltyAuthRepository) {
        Intrinsics.checkNotNullParameter(loyaltyAuthRepository, "repository");
        this.repository = loyaltyAuthRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173058invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase.Param r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$invoke$1
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
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyAuthRepository r6 = r4.repository
            java.lang.String r2 = r5.getCardFidNumber()
            java.lang.String r5 = r5.getSecretCode()
            r0.label = r3
            java.lang.Object r5 = r6.m173017loyaltyAuthentication0E7RQCE(r2, r5, r0)
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            boolean r6 = kotlin.Result.m38710j(r5)
            if (r6 == 0) goto L_0x0063
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.loyalty.data.models.entities.LoginIamLoyaltyResponse r5 = (com.carrefour.fid.android.loyalty.data.models.entities.LoginIamLoyaltyResponse) r5
            if (r5 == 0) goto L_0x005e
            java.lang.String r5 = r5.getIdTokenLoyalty()
            goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            if (r5 != 0) goto L_0x0063
            java.lang.String r5 = ""
        L_0x0063:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase.m173058invokegIAlus(com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyAuthenticationUseCase$Param, kotlin.coroutines.c):java.lang.Object");
    }
}
