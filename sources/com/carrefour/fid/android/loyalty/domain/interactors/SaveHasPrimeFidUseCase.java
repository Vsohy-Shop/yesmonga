package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/SaveHasPrimeFidUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/SaveHasPrimeFidUseCase$Params;", "Lkotlin/d2;", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/SaveHasPrimeFidUseCase$Params;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "<init>", "(Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;)V", "Params", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class SaveHasPrimeFidUseCase implements C37679f<Params, C11079d2> {
    @C12579k
    private final LoyaltyPreferencesStorage loyaltyPreferencesStorage;

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/SaveHasPrimeFidUseCase$Params;", "", "hasPrimeFid", "", "(Z)V", "getHasPrimeFid", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Params {
        private final boolean hasPrimeFid;

        public Params(boolean z) {
            this.hasPrimeFid = z;
        }

        public static /* synthetic */ Params copy$default(Params params, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = params.hasPrimeFid;
            }
            return params.copy(z);
        }

        public final boolean component1() {
            return this.hasPrimeFid;
        }

        @C12579k
        public final Params copy(boolean z) {
            return new Params(z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && this.hasPrimeFid == ((Params) obj).hasPrimeFid;
        }

        public final boolean getHasPrimeFid() {
            return this.hasPrimeFid;
        }

        public int hashCode() {
            boolean z = this.hasPrimeFid;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.hasPrimeFid;
            return "Params(hasPrimeFid=" + z + ")";
        }
    }

    @Inject
    public SaveHasPrimeFidUseCase(@C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage2) {
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage2, "loyaltyPreferencesStorage");
        this.loyaltyPreferencesStorage = loyaltyPreferencesStorage2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173064invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase.Params r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r6 = r4.loyaltyPreferencesStorage
            boolean r5 = r5.getHasPrimeFid()
            r0.label = r3
            java.lang.Object r5 = r6.setHasPrimeFid(r5, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase.m173064invokegIAlus(com.carrefour.fid.android.loyalty.domain.interactors.SaveHasPrimeFidUseCase$Params, kotlin.coroutines.c):java.lang.Object");
    }
}
