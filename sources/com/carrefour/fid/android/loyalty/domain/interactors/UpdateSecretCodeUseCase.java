package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateSecretCodeUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateSecretCodeUseCase$Param;", "", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateSecretCodeUseCase$Param;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "repository", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;)V", "Param", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class UpdateSecretCodeUseCase implements C37679f<Param, String> {
    @C12579k
    private final LoyaltyRepository repository;

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/UpdateSecretCodeUseCase$Param;", "", "loyaltyCardId", "", "otpCode", "newSecretCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLoyaltyCardId", "()Ljava/lang/String;", "getNewSecretCode", "getOtpCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Param {
        @C12579k
        private final String loyaltyCardId;
        @C12579k
        private final String newSecretCode;
        @C12579k
        private final String otpCode;

        public Param(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "loyaltyCardId");
            Intrinsics.checkNotNullParameter(str2, "otpCode");
            Intrinsics.checkNotNullParameter(str3, "newSecretCode");
            this.loyaltyCardId = str;
            this.otpCode = str2;
            this.newSecretCode = str3;
        }

        public static /* synthetic */ Param copy$default(Param param, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = param.loyaltyCardId;
            }
            if ((i & 2) != 0) {
                str2 = param.otpCode;
            }
            if ((i & 4) != 0) {
                str3 = param.newSecretCode;
            }
            return param.copy(str, str2, str3);
        }

        @C12579k
        public final String component1() {
            return this.loyaltyCardId;
        }

        @C12579k
        public final String component2() {
            return this.otpCode;
        }

        @C12579k
        public final String component3() {
            return this.newSecretCode;
        }

        @C12579k
        public final Param copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
            Intrinsics.checkNotNullParameter(str, "loyaltyCardId");
            Intrinsics.checkNotNullParameter(str2, "otpCode");
            Intrinsics.checkNotNullParameter(str3, "newSecretCode");
            return new Param(str, str2, str3);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Param)) {
                return false;
            }
            Param param = (Param) obj;
            return Intrinsics.areEqual((Object) this.loyaltyCardId, (Object) param.loyaltyCardId) && Intrinsics.areEqual((Object) this.otpCode, (Object) param.otpCode) && Intrinsics.areEqual((Object) this.newSecretCode, (Object) param.newSecretCode);
        }

        @C12579k
        public final String getLoyaltyCardId() {
            return this.loyaltyCardId;
        }

        @C12579k
        public final String getNewSecretCode() {
            return this.newSecretCode;
        }

        @C12579k
        public final String getOtpCode() {
            return this.otpCode;
        }

        public int hashCode() {
            return (((this.loyaltyCardId.hashCode() * 31) + this.otpCode.hashCode()) * 31) + this.newSecretCode.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.loyaltyCardId;
            String str2 = this.otpCode;
            String str3 = this.newSecretCode;
            return "Param(loyaltyCardId=" + str + ", otpCode=" + str2 + ", newSecretCode=" + str3 + ")";
        }
    }

    @Inject
    public UpdateSecretCodeUseCase(@C12579k LoyaltyRepository loyaltyRepository) {
        Intrinsics.checkNotNullParameter(loyaltyRepository, "repository");
        this.repository = loyaltyRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173070invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase.Param r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0051
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository r7 = r5.repository
            java.lang.String r2 = r6.getLoyaltyCardId()
            java.lang.String r4 = r6.getOtpCode()
            java.lang.String r6 = r6.getNewSecretCode()
            r0.label = r3
            java.lang.Object r6 = r7.m173027updateSecretCodeBWLJW6A(r2, r4, r6, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase.m173070invokegIAlus(com.carrefour.fid.android.loyalty.domain.interactors.UpdateSecretCodeUseCase$Param, kotlin.coroutines.c):java.lang.Object");
    }
}
