package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.loyalty.data.repositories.LoyaltyRepository;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/CreateLoyaltyCardFidUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/loyalty/domain/interactors/CreateLoyaltyCardFidUseCase$Param;", "Lkotlin/d2;", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/CreateLoyaltyCardFidUseCase$Param;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "repository", "Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;", "<init>", "(Lcom/carrefour/fid/android/loyalty/data/repositories/LoyaltyRepository;)V", "Param", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class CreateLoyaltyCardFidUseCase implements C37679f<Param, C11079d2> {
    @C12579k
    private LoyaltyRepository repository;

    @C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/CreateLoyaltyCardFidUseCase$Param;", "", "createOrAttachCardBody", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;)V", "getCreateOrAttachCardBody", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCreateOrAttachCardBody;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Param {
        @C12580l
        private final BffCreateOrAttachCardBody createOrAttachCardBody;

        public Param(@C12580l BffCreateOrAttachCardBody bffCreateOrAttachCardBody) {
            this.createOrAttachCardBody = bffCreateOrAttachCardBody;
        }

        public static /* synthetic */ Param copy$default(Param param, BffCreateOrAttachCardBody bffCreateOrAttachCardBody, int i, Object obj) {
            if ((i & 1) != 0) {
                bffCreateOrAttachCardBody = param.createOrAttachCardBody;
            }
            return param.copy(bffCreateOrAttachCardBody);
        }

        @C12580l
        public final BffCreateOrAttachCardBody component1() {
            return this.createOrAttachCardBody;
        }

        @C12579k
        public final Param copy(@C12580l BffCreateOrAttachCardBody bffCreateOrAttachCardBody) {
            return new Param(bffCreateOrAttachCardBody);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Param) && Intrinsics.areEqual((Object) this.createOrAttachCardBody, (Object) ((Param) obj).createOrAttachCardBody);
        }

        @C12580l
        public final BffCreateOrAttachCardBody getCreateOrAttachCardBody() {
            return this.createOrAttachCardBody;
        }

        public int hashCode() {
            BffCreateOrAttachCardBody bffCreateOrAttachCardBody = this.createOrAttachCardBody;
            if (bffCreateOrAttachCardBody == null) {
                return 0;
            }
            return bffCreateOrAttachCardBody.hashCode();
        }

        @C12579k
        public String toString() {
            BffCreateOrAttachCardBody bffCreateOrAttachCardBody = this.createOrAttachCardBody;
            return "Param(createOrAttachCardBody=" + bffCreateOrAttachCardBody + ")";
        }
    }

    @Inject
    public CreateLoyaltyCardFidUseCase(@C12579k LoyaltyRepository loyaltyRepository) {
        Intrinsics.checkNotNullParameter(loyaltyRepository, "repository");
        this.repository = loyaltyRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173035invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase.Param r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase$invoke$1
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
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCreateOrAttachCardBody r5 = r5.getCreateOrAttachCardBody()
            r0.label = r3
            java.lang.Object r5 = r6.m173019createLoyaltyCardgIAlus(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase.m173035invokegIAlus(com.carrefour.fid.android.loyalty.domain.interactors.CreateLoyaltyCardFidUseCase$Param, kotlin.coroutines.c):java.lang.Object");
    }
}
