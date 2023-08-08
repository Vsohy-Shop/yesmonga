package com.carrefour.fid.android.domain.interactors.luckycart;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.datasource.LuckyCartGateway;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners;
import com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType;
import com.carrefour.fid.android.domain.repositories.C38195d;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nLuckyCartGetLuckyCartBannerDetailsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuckyCartGetLuckyCartBannerDetailsUseCase.kt\ncom/carrefour/fid/android/domain/interactors/luckycart/LuckyCartGetLuckyCartBannerDetailsUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
public final class LuckyCartGetLuckyCartBannerDetailsUseCase implements C37706a {

    /* renamed from: d */
    public static final int f94576d = 8;
    @C12579k

    /* renamed from: a */
    public final C38195d f94577a;
    @C12579k

    /* renamed from: b */
    public final LuckyCartGateway f94578b;
    @C12579k

    /* renamed from: c */
    public final C37807b f94579c;

    /* renamed from: com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase$a */
    public /* synthetic */ class C37705a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType[] r0 = com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType r1 = com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType r1 = com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType.PROMOTIONS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType r1 = com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType.CATEGORIES     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase.C37705a.<clinit>():void");
        }
    }

    @Inject
    public LuckyCartGetLuckyCartBannerDetailsUseCase(@C12579k C38195d dVar, @C12579k LuckyCartGateway luckyCartGateway, @C12579k C37807b bVar) {
        Intrinsics.checkNotNullParameter(dVar, "luckyCartBannerRepository");
        Intrinsics.checkNotNullParameter(luckyCartGateway, "luckyCartGateway");
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        this.f94577a = dVar;
        this.f94578b = luckyCartGateway;
        this.f94579c = bVar;
    }

    /* renamed from: b */
    public final List<String> mo114755b(LuckyCartBanners luckyCartBanners, LuckyCartPageType luckyCartPageType) {
        int i = C37705a.$EnumSwitchMapping$0[luckyCartPageType.ordinal()];
        if (i == 1) {
            return luckyCartBanners.getHomePage();
        }
        if (i == 2) {
            return luckyCartBanners.getPromotions();
        }
        if (i == 3) {
            return luckyCartBanners.getCategories();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072 A[SYNTHETIC, Splitter:B:22:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114756c(com.carrefour.fid.android.domain.interactors.luckycart.C37706a.C37707a r8, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.luckycart.C38047a>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase$getLuckyCartBanner$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase$getLuckyCartBanner$1 r0 = (com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase$getLuckyCartBanner$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase$getLuckyCartBanner$1 r0 = new com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase$getLuckyCartBanner$1
            r0.<init>(r7, r9)
        L_0x0018:
            r6 = r0
            java.lang.Object r9 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0051
            if (r1 == r3) goto L_0x003f
            if (r1 != r2) goto L_0x0037
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x0034 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ all -> 0x0034 }
            java.lang.Object r8 = r9.mo21858l()     // Catch:{ all -> 0x0034 }
            goto L_0x00b8
        L_0x0034:
            r8 = move-exception
            goto L_0x00b9
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003f:
            java.lang.Object r8 = r6.L$1
            com.carrefour.fid.android.domain.interactors.luckycart.a$a r8 = (com.carrefour.fid.android.domain.interactors.luckycart.C37706a.C37707a) r8
            java.lang.Object r1 = r6.L$0
            com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase r1 = (com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase) r1
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x006c
        L_0x0051:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.data.datasource.LuckyCartGateway r9 = r7.f94578b
            java.lang.String r1 = r8.mo114767i()
            java.lang.String r4 = r8.mo114768j()
            r6.L$0 = r7
            r6.L$1 = r8
            r6.label = r3
            java.lang.Object r9 = r9.mo108667c(r1, r4, r6)
            if (r9 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r1 = r7
        L_0x006c:
            boolean r4 = kotlin.Result.m38710j(r9)
            if (r4 == 0) goto L_0x00c4
            kotlin.Result$a r4 = kotlin.Result.f28060a     // Catch:{ all -> 0x0034 }
            com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners r9 = (com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners) r9     // Catch:{ all -> 0x0034 }
            com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType r4 = r8.mo114765h()     // Catch:{ all -> 0x0034 }
            java.util.List r9 = r1.mo114755b(r9, r4)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = r8.mo114764g()     // Catch:{ all -> 0x0034 }
            boolean r9 = r9.contains(r4)     // Catch:{ all -> 0x0034 }
            r4 = 0
            if (r9 == 0) goto L_0x00ab
            com.carrefour.fid.android.domain.repositories.d r1 = r1.f94577a     // Catch:{ all -> 0x0034 }
            com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType r9 = r8.mo114765h()     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = r8.mo114764g()     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = r8.mo114767i()     // Catch:{ all -> 0x0034 }
            java.lang.String r8 = r8.mo114768j()     // Catch:{ all -> 0x0034 }
            r6.L$0 = r4     // Catch:{ all -> 0x0034 }
            r6.L$1 = r4     // Catch:{ all -> 0x0034 }
            r6.label = r2     // Catch:{ all -> 0x0034 }
            r2 = r9
            r4 = r5
            r5 = r8
            java.lang.Object r8 = r1.mo111506d(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0034 }
            if (r8 != r0) goto L_0x00b8
            return r0
        L_0x00ab:
            com.carrefour.fid.android.shared.io.LuckyCartThrowable r8 = new com.carrefour.fid.android.shared.io.LuckyCartThrowable     // Catch:{ all -> 0x0034 }
            r8.<init>(r4, r3, r4)     // Catch:{ all -> 0x0034 }
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)     // Catch:{ all -> 0x0034 }
            java.lang.Object r8 = kotlin.Result.m38702b(r8)     // Catch:{ all -> 0x0034 }
        L_0x00b8:
            return r8
        L_0x00b9:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r8)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x00c8
        L_0x00c4:
            java.lang.Object r8 = kotlin.Result.m38702b(r9)
        L_0x00c8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase.mo114756c(com.carrefour.fid.android.domain.interactors.luckycart.a$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e A[SYNTHETIC, Splitter:B:22:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172973invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.luckycart.C37706a.C37707a r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.luckycart.C38047a>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase$invoke$1
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
            com.carrefour.fid.android.domain.interactors.luckycart.a$a r7 = (com.carrefour.fid.android.domain.interactors.luckycart.C37706a.C37707a) r7
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase r2 = (com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0068
        L_0x004e:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r8 = r6.f94579c
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.LuckyCartProducts
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
            java.lang.Object r7 = r2.mo114756c(r7, r0)     // Catch:{ all -> 0x0032 }
            if (r7 != r1) goto L_0x0083
            return r1
        L_0x0083:
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0032 }
            com.carrefour.fid.android.domain.models.luckycart.a r7 = (com.carrefour.fid.android.domain.models.luckycart.C38047a) r7     // Catch:{ all -> 0x0032 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannerDetailsUseCase.m172973invokegIAlus(com.carrefour.fid.android.domain.interactors.luckycart.a$a, kotlin.coroutines.c):java.lang.Object");
    }
}
