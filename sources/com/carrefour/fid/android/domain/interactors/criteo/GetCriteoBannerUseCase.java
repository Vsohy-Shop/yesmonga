package com.carrefour.fid.android.domain.interactors.criteo;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.CriteoRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.criteo.C37999a;
import com.carrefour.fid.android.domain.models.criteo.C38006h;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetCriteoBannerUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCriteoBannerUseCase.kt\ncom/carrefour/fid/android/domain/interactors/criteo/GetCriteoBannerUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
public final class GetCriteoBannerUseCase implements C37679f<C37659a, List<? extends C37999a>> {

    /* renamed from: c */
    public static final int f94506c = 8;
    @C12579k

    /* renamed from: a */
    public final CriteoRepository f94507a;
    @C12579k

    /* renamed from: b */
    public final C37807b f94508b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$a */
    public static final class C37659a {

        /* renamed from: b */
        public static final int f94509b = 8;
        @C12579k

        /* renamed from: a */
        public final C38006h f94510a;

        public C37659a(@C12579k C38006h hVar) {
            Intrinsics.checkNotNullParameter(hVar, "criteoParameters");
            this.f94510a = hVar;
        }

        /* renamed from: c */
        public static /* synthetic */ C37659a m154389c(C37659a aVar, C38006h hVar, int i, Object obj) {
            if ((i & 1) != 0) {
                hVar = aVar.f94510a;
            }
            return aVar.mo114651b(hVar);
        }

        @C12579k
        /* renamed from: a */
        public final C38006h mo114650a() {
            return this.f94510a;
        }

        @C12579k
        /* renamed from: b */
        public final C37659a mo114651b(@C12579k C38006h hVar) {
            Intrinsics.checkNotNullParameter(hVar, "criteoParameters");
            return new C37659a(hVar);
        }

        @C12579k
        /* renamed from: d */
        public final C38006h mo114652d() {
            return this.f94510a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37659a) && Intrinsics.areEqual((Object) this.f94510a, (Object) ((C37659a) obj).f94510a);
        }

        public int hashCode() {
            return this.f94510a.hashCode();
        }

        @C12579k
        public String toString() {
            C38006h hVar = this.f94510a;
            return "Param(criteoParameters=" + hVar + ")";
        }
    }

    @Inject
    public GetCriteoBannerUseCase(@C12579k CriteoRepository criteoRepository, @C12579k C37807b bVar) {
        Intrinsics.checkNotNullParameter(criteoRepository, "criteoRepository");
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        this.f94507a = criteoRepository;
        this.f94508b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f A[SYNTHETIC, Splitter:B:17:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114648b(com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase.C37659a r5, kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.criteo.C37999a>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$fetchCriteoBanner$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$fetchCriteoBanner$1 r0 = (com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$fetchCriteoBanner$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$fetchCriteoBanner$1 r0 = new com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$fetchCriteoBanner$1
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
            com.carrefour.fid.android.data.repositories.CriteoRepository r6 = r4.f94507a
            com.carrefour.fid.android.domain.models.criteo.h r5 = r5.mo114652d()
            r0.label = r3
            java.lang.Object r5 = r6.mo111492i(r5, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            boolean r6 = kotlin.Result.m38710j(r5)
            if (r6 == 0) goto L_0x0080
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0079 }
            com.carrefour.fid.android.domain.models.criteo.p r5 = (com.carrefour.fid.android.domain.models.criteo.C38014p) r5     // Catch:{ all -> 0x0079 }
            java.util.List r6 = r5.mo117569g()     // Catch:{ all -> 0x0079 }
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x0079 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0079 }
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0069
            java.util.List r5 = r5.mo117569g()     // Catch:{ all -> 0x0079 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0079 }
            goto L_0x0078
        L_0x0069:
            java.lang.Throwable r5 = new java.lang.Throwable     // Catch:{ all -> 0x0079 }
            java.lang.String r6 = "Criteo banner not found"
            r5.<init>(r6)     // Catch:{ all -> 0x0079 }
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)     // Catch:{ all -> 0x0079 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0079 }
        L_0x0078:
            return r5
        L_0x0079:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
        L_0x0080:
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase.mo114648b(com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e A[SYNTHETIC, Splitter:B:22:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172963invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase.C37659a r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.criteo.C37999a>>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$invoke$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            kotlin.C11661u0.m45747n(r8)     // Catch:{ all -> 0x0032 }
            kotlin.Result r8 = (kotlin.Result) r8     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = r8.mo21858l()     // Catch:{ all -> 0x0032 }
            goto L_0x0083
        L_0x0032:
            r7 = move-exception
            goto L_0x008d
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            java.lang.Object r7 = r0.L$1
            com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$a r7 = (com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase.C37659a) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase r2 = (com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0068
        L_0x004e:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r8 = r6.f94508b
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.Criteo
            r2.<init>(r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m172966invokegIAlus(r2, r0)
            if (r8 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r2 = r6
        L_0x0068:
            boolean r4 = kotlin.Result.m38710j(r8)
            if (r4 == 0) goto L_0x0098
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x0032 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0032 }
            r8.booleanValue()     // Catch:{ all -> 0x0032 }
            r8 = 0
            r0.L$0 = r8     // Catch:{ all -> 0x0032 }
            r0.L$1 = r8     // Catch:{ all -> 0x0032 }
            r0.label = r3     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = r2.mo114648b(r7, r0)     // Catch:{ all -> 0x0032 }
            if (r7 != r1) goto L_0x0083
            return r1
        L_0x0083:
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0032 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = kotlin.Result.m38702b(r7)     // Catch:{ all -> 0x0032 }
            goto L_0x009c
        L_0x008d:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            goto L_0x009c
        L_0x0098:
            java.lang.Object r7 = kotlin.Result.m38702b(r8)
        L_0x009c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase.m172963invokegIAlus(com.carrefour.fid.android.domain.interactors.criteo.GetCriteoBannerUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
