package com.carrefour.fid.android.data.datasource;

import androidx.annotation.C0344h1;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.cache.C36386f;
import com.carrefour.fid.android.domain.repositories.C38195d;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLuckyCartGateway.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuckyCartGateway.kt\ncom/carrefour/fid/android/data/datasource/LuckyCartGateway\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class LuckyCartGateway {

    /* renamed from: c */
    public static final int f90013c = 8;
    @C12579k

    /* renamed from: a */
    public final C38195d f90014a;
    @C12580l

    /* renamed from: b */
    public C36386f f90015b;

    @Inject
    public LuckyCartGateway(@C12579k C38195d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "luckyCartBannerRepository");
        this.f90014a = dVar;
    }

    @C0344h1(otherwise = 2)
    /* renamed from: e */
    public static /* synthetic */ void m149262e() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108666b(java.lang.String r8, java.lang.String r9, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.data.datasource.LuckyCartGateway$fetchLuckyCartBanners$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.data.datasource.LuckyCartGateway$fetchLuckyCartBanners$1 r0 = (com.carrefour.fid.android.data.datasource.LuckyCartGateway$fetchLuckyCartBanners$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.LuckyCartGateway$fetchLuckyCartBanners$1 r0 = new com.carrefour.fid.android.data.datasource.LuckyCartGateway$fetchLuckyCartBanners$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.data.datasource.LuckyCartGateway r8 = (com.carrefour.fid.android.data.datasource.LuckyCartGateway) r8
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r9 = r10.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.domain.repositories.d r10 = r7.f90014a
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r9 = r10.mo111505b(r8, r9, r0)
            if (r9 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r8 = r7
        L_0x004c:
            boolean r10 = kotlin.Result.m38709i(r9)
            r0 = 0
            if (r10 == 0) goto L_0x0055
            r10 = r0
            goto L_0x0056
        L_0x0055:
            r10 = r9
        L_0x0056:
            r2 = r10
            com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners r2 = (com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners) r2
            if (r2 == 0) goto L_0x0065
            com.carrefour.fid.android.data.cache.f r0 = new com.carrefour.fid.android.data.cache.f
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r5, r6)
        L_0x0065:
            r8.f90015b = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.LuckyCartGateway.mo108666b(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108667c(@org.jetbrains.annotations.C12580l java.lang.String r5, @org.jetbrains.annotations.C12580l java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.datasource.LuckyCartGateway$get$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.datasource.LuckyCartGateway$get$1 r0 = (com.carrefour.fid.android.data.datasource.LuckyCartGateway$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.datasource.LuckyCartGateway$get$1 r0 = new com.carrefour.fid.android.data.datasource.LuckyCartGateway$get$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0063
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.cache.f r7 = r4.f90015b
            r2 = 0
            if (r7 == 0) goto L_0x0046
            boolean r7 = r7.mo83405c()
            if (r7 != r3) goto L_0x0046
            r2 = r3
        L_0x0046:
            if (r2 == 0) goto L_0x005a
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.data.cache.f r5 = r4.f90015b
            java.lang.String r6 = "null cannot be cast to non-null type com.carrefour.fid.android.data.cache.LuckyCartBannersCache"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
            java.lang.Object r5 = r5.mo83403a()
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x005a:
            r0.label = r3
            java.lang.Object r5 = r4.mo108666b(r5, r6, r0)
            if (r5 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.datasource.LuckyCartGateway.mo108667c(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: d */
    public final C36386f mo108668d() {
        return this.f90015b;
    }

    /* renamed from: f */
    public final void mo108669f(@C12580l C36386f fVar) {
        this.f90015b = fVar;
    }
}
