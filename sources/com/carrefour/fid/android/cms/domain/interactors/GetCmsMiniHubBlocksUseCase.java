package com.carrefour.fid.android.cms.domain.interactors;

import com.carrefour.fid.android.cms.domain.models.MiniHubBlocks;
import com.carrefour.fid.android.cms.domain.repositories.CmsRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsMiniHubBlocksUseCase;", "Lcom/carrefour/fid/android/domain/interactors/f;", "Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsMiniHubBlocksUseCase$Params;", "", "Lcom/carrefour/fid/android/cms/domain/models/MiniHubBlocks;", "param", "Lkotlin/Result;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsMiniHubBlocksUseCase$Params;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "remoteConfigRepository", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;", "Lcom/carrefour/fid/android/cms/domain/repositories/CmsRepository;", "repository", "Lcom/carrefour/fid/android/cms/domain/repositories/CmsRepository;", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/remoteconfig/b;Lcom/carrefour/fid/android/cms/domain/repositories/CmsRepository;)V", "Params", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class GetCmsMiniHubBlocksUseCase implements C37679f<Params, List<? extends MiniHubBlocks>> {
    @C12579k
    private final C37807b remoteConfigRepository;
    @C12579k
    private CmsRepository repository;

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/interactors/GetCmsMiniHubBlocksUseCase$Params;", "", "metiRef", "", "(Ljava/lang/String;)V", "getMetiRef", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Params {
        @C12579k
        private final String metiRef;

        public Params(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "metiRef");
            this.metiRef = str;
        }

        public static /* synthetic */ Params copy$default(Params params, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = params.metiRef;
            }
            return params.copy(str);
        }

        @C12579k
        public final String component1() {
            return this.metiRef;
        }

        @C12579k
        public final Params copy(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "metiRef");
            return new Params(str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && Intrinsics.areEqual((Object) this.metiRef, (Object) ((Params) obj).metiRef);
        }

        @C12579k
        public final String getMetiRef() {
            return this.metiRef;
        }

        public int hashCode() {
            return this.metiRef.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.metiRef;
            return "Params(metiRef=" + str + ")";
        }
    }

    @Inject
    public GetCmsMiniHubBlocksUseCase(@C12579k C37807b bVar, @C12579k CmsRepository cmsRepository) {
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        Intrinsics.checkNotNullParameter(cmsRepository, "repository");
        this.remoteConfigRepository = bVar;
        this.repository = cmsRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173124invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase.Params r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.cms.domain.models.MiniHubBlocks>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase$invoke$1 r0 = (com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase$invoke$1 r0 = new com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004d
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x0085
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase$Params r8 = (com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase.Params) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase r2 = (com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0067
        L_0x004d:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r9 = r7.remoteConfigRepository
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r6 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.HomePageCmsBanner
            r2.<init>(r6)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.m172966invokegIAlus(r2, r0)
            if (r9 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r2 = r7
        L_0x0067:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r9)
            if (r4 != 0) goto L_0x009f
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r9.booleanValue()
            com.carrefour.fid.android.cms.domain.repositories.CmsRepository r9 = r2.repository
            java.lang.String r8 = r8.getMetiRef()
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = r9.m173138getHomePageNalMiniHubBlocksgIAlus(r8, r0)
            if (r8 != r1) goto L_0x0085
            return r1
        L_0x0085:
            boolean r9 = kotlin.Result.m38710j(r8)
            if (r9 == 0) goto L_0x009a
            kotlin.Result$a r9 = kotlin.Result.f28060a
            com.carrefour.fid.android.cms.data.entities.HomeNalCmsResponse r8 = (com.carrefour.fid.android.cms.data.entities.HomeNalCmsResponse) r8
            if (r8 == 0) goto L_0x0095
            java.util.List r5 = com.carrefour.fid.android.cms.domain.extension.MiniHubBlocksKt.toDomain(r8)
        L_0x0095:
            java.lang.Object r8 = kotlin.Result.m38702b(r5)
            goto L_0x00b0
        L_0x009a:
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x00b0
        L_0x009f:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Throwable r8 = new java.lang.Throwable
            java.lang.String r9 = "Could not fetch home page CMS banner"
            r8.<init>(r9)
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00b0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase.m173124invokegIAlus(com.carrefour.fid.android.cms.domain.interactors.GetCmsMiniHubBlocksUseCase$Params, kotlin.coroutines.c):java.lang.Object");
    }
}
