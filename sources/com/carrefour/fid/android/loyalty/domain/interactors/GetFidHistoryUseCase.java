package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository;
import com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/GetFidHistoryUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetFidHistoryUseCase$Param;", "", "Lcom/carrefour/fid/android/loyalty/domain/models/LoyaltyCardOperationHistoryDomain;", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/GetFidHistoryUseCase$Param;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "repository", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;)V", "Param", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class GetFidHistoryUseCase implements C37679f<Param, List<? extends LoyaltyCardOperationHistoryDomain>> {
    @C12579k
    private LoyaltyRepository repository;

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/GetFidHistoryUseCase$Param;", "", "requestDate", "", "(Ljava/lang/String;)V", "getRequestDate", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Param {
        @C12579k
        private final String requestDate;

        public Param(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "requestDate");
            this.requestDate = str;
        }

        public static /* synthetic */ Param copy$default(Param param, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = param.requestDate;
            }
            return param.copy(str);
        }

        @C12579k
        public final String component1() {
            return this.requestDate;
        }

        @C12579k
        public final Param copy(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "requestDate");
            return new Param(str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Param) && Intrinsics.areEqual((Object) this.requestDate, (Object) ((Param) obj).requestDate);
        }

        @C12579k
        public final String getRequestDate() {
            return this.requestDate;
        }

        public int hashCode() {
            return this.requestDate.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.requestDate;
            return "Param(requestDate=" + str + ")";
        }
    }

    @Inject
    public GetFidHistoryUseCase(@C12579k LoyaltyRepository loyaltyRepository) {
        Intrinsics.checkNotNullParameter(loyaltyRepository, "repository");
        this.repository = loyaltyRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173039invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase.Param r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.loyalty.domain.models.LoyaltyCardOperationHistoryDomain>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase$invoke$1
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
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository r6 = r4.repository
            java.lang.String r5 = r5.getRequestDate()
            r0.label = r3
            java.lang.Object r5 = r6.m173020getFidHistorygIAlus(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase.m173039invokegIAlus(com.carrefour.fid.android.loyalty.domain.interactors.GetFidHistoryUseCase$Param, kotlin.coroutines.c):java.lang.Object");
    }
}
