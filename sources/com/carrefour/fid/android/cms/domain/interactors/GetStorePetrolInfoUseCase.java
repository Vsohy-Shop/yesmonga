package com.carrefour.fid.android.cms.domain.interactors;

import com.carrefour.fid.android.cms.domain.models.StorePetrolInfo;
import com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/interactors/GetStorePetrolInfoUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/cms/domain/interactors/GetStorePetrolInfoUseCase$Params;", "Lcom/carrefour/fid/android/cms/domain/models/StorePetrolInfo;", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/cms/domain/interactors/GetStorePetrolInfoUseCase$Params;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/cms/domain/repositories/StorePetrolRepository;", "repository", "Lcom/carrefour/fid/android/cms/domain/repositories/StorePetrolRepository;", "<init>", "(Lcom/carrefour/fid/android/cms/domain/repositories/StorePetrolRepository;)V", "Params", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class GetStorePetrolInfoUseCase implements C37679f<Params, StorePetrolInfo> {
    @C12579k
    private final StorePetrolRepository repository;

    @C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/interactors/GetStorePetrolInfoUseCase$Params;", "", "minifiCode", "", "(I)V", "getMinifiCode", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Params {
        private final int minifiCode;

        public Params(int i) {
            this.minifiCode = i;
        }

        public static /* synthetic */ Params copy$default(Params params, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = params.minifiCode;
            }
            return params.copy(i);
        }

        public final int component1() {
            return this.minifiCode;
        }

        @C12579k
        public final Params copy(int i) {
            return new Params(i);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && this.minifiCode == ((Params) obj).minifiCode;
        }

        public final int getMinifiCode() {
            return this.minifiCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.minifiCode);
        }

        @C12579k
        public String toString() {
            int i = this.minifiCode;
            return "Params(minifiCode=" + i + ")";
        }
    }

    @Inject
    public GetStorePetrolInfoUseCase(@C12579k StorePetrolRepository storePetrolRepository) {
        Intrinsics.checkNotNullParameter(storePetrolRepository, "repository");
        this.repository = storePetrolRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173131invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase.Params r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.cms.domain.models.StorePetrolInfo>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase$invoke$1 r0 = (com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase$invoke$1 r0 = new com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.cms.domain.repositories.StorePetrolRepository r6 = r4.repository
            int r5 = r5.getMinifiCode()
            r0.label = r3
            java.lang.Object r6 = r6.fetchPetrolInfo(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            com.carrefour.fid.android.cms.domain.models.StorePetrolInfo r6 = (com.carrefour.fid.android.cms.domain.models.StorePetrolInfo) r6
            if (r6 == 0) goto L_0x004e
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.Result.m38702b(r6)
            goto L_0x005f
        L_0x004e:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r6 = "Error while fetching petrol info"
            r5.<init>(r6)
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x005f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase.m173131invokegIAlus(com.carrefour.fid.android.cms.domain.interactors.GetStorePetrolInfoUseCase$Params, kotlin.coroutines.c):java.lang.Object");
    }
}
