package com.carrefour.fid.android.domain.interactors.stickers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.repositories.StickersRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.StickersDomain;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class GetStickersContentUseCase implements C37678e<StickersDomain> {

    /* renamed from: d */
    public static final int f94960d = 8;
    @C12579k

    /* renamed from: a */
    public final C37807b f94961a;
    @C12579k

    /* renamed from: b */
    public final StickersRepository f94962b;
    @C12579k

    /* renamed from: c */
    public final LoginRepository f94963c;

    @Inject
    public GetStickersContentUseCase(@C12579k C37807b bVar, @C12579k StickersRepository stickersRepository, @C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        Intrinsics.checkNotNullParameter(stickersRepository, "stickersRepository");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.f94961a = bVar;
        this.f94962b = stickersRepository;
        this.f94963c = loginRepository;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173010invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.StickersDomain>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase$invoke$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0081
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003a:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase r2 = (com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0068
        L_0x0048:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.account.data.repositories.LoginRepository r7 = r6.f94963c
            boolean r7 = com.carrefour.fid.android.account.data.extension.C13195a.m57177a(r7)
            if (r7 == 0) goto L_0x00b9
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r7 = r6.f94961a
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r5 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.Stickers
            r2.<init>(r5)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.m172966invokegIAlus(r2, r0)
            if (r7 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r2 = r6
        L_0x0068:
            boolean r4 = kotlin.Result.m38710j(r7)
            if (r4 == 0) goto L_0x00b9
            r4 = r7
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            com.carrefour.fid.android.data.repositories.StickersRepository r2 = r2.f94962b
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.mo111570b(r0)
            if (r7 != r1) goto L_0x0081
            return r1
        L_0x0081:
            boolean r0 = kotlin.Result.m38710j(r7)
            if (r0 == 0) goto L_0x00a1
            com.carrefour.fid.android.data.entities.StickersResponse r7 = (com.carrefour.fid.android.data.entities.StickersResponse) r7
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.String r0 = r7.getGameUrl()
            java.lang.String r1 = r7.getOpName()
            java.lang.String r7 = r7.getBannerUrl()
            com.carrefour.fid.android.domain.models.StickersDomain r2 = new com.carrefour.fid.android.domain.models.StickersDomain
            r2.<init>(r1, r0, r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r2)
            return r7
        L_0x00a1:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r7)
            if (r7 == 0) goto L_0x00b9
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Throwable r7 = new java.lang.Throwable
            java.lang.String r0 = "Could not fetch stickers info"
            r7.<init>(r0)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        L_0x00b9:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            java.lang.Throwable r7 = new java.lang.Throwable
            java.lang.String r0 = "Stickers available only after login"
            r7.<init>(r0)
            java.lang.Object r7 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase.m173010invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
