package com.carrefour.fid.android.domain.interactors.luckycart;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import com.carrefour.fid.android.domain.models.LuckyCartGameBannerDomain;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class GetLuckyCartGameBannerUseCase implements C37678e<LuckyCartGameBannerDomain> {

    /* renamed from: f */
    public static final int f94563f = 8;
    @C12579k

    /* renamed from: a */
    public final Context f94564a;
    @C12579k

    /* renamed from: b */
    public final C37807b f94565b;
    @C12579k

    /* renamed from: c */
    public final LuckyCartBannerRepository f94566c;
    @C12579k

    /* renamed from: d */
    public final LoginRepository f94567d;
    @C12579k

    /* renamed from: e */
    public final AppEnvironment f94568e;

    @Inject
    public GetLuckyCartGameBannerUseCase(@C10255b @C12579k Context context, @C12579k C37807b bVar, @C12579k LuckyCartBannerRepository luckyCartBannerRepository, @C12579k LoginRepository loginRepository, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        Intrinsics.checkNotNullParameter(luckyCartBannerRepository, "luckyCartBannerRepository");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        this.f94564a = context;
        this.f94565b = bVar;
        this.f94566c = luckyCartBannerRepository;
        this.f94567d = loginRepository;
        this.f94568e = appEnvironment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172971invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.LuckyCartGameBannerDomain>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartGameBannerUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartGameBannerUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartGameBannerUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartGameBannerUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartGameBannerUseCase$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartGameBannerUseCase r0 = (com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartGameBannerUseCase) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x005b
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.account.data.repositories.LoginRepository r6 = r5.f94567d
            boolean r6 = com.carrefour.fid.android.account.data.extension.C13195a.m57177a(r6)
            if (r6 == 0) goto L_0x00a9
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r6 = r5.f94565b
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r4 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.LuckyCartGame
            r2.<init>(r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m172966invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r0 = r5
        L_0x005b:
            boolean r1 = kotlin.Result.m38710j(r6)
            if (r1 == 0) goto L_0x00a9
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository r6 = r0.f94566c
            android.content.Context r1 = r0.f94564a
            boolean r6 = r6.mo32689f(r1)
            if (r6 == 0) goto L_0x0097
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.models.LuckyCartGameBannerDomain r6 = new com.carrefour.fid.android.domain.models.LuckyCartGameBannerDomain
            com.carrefour.fid.android.shared.util.environment.AppEnvironment r1 = r0.f94568e
            java.lang.String r1 = r1.mo84185y()
            com.carrefour.fid.android.account.data.repositories.LoginRepository r0 = r0.f94567d
            java.lang.String r0 = r0.mo31352d()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.<init>(r0)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x00a8
        L_0x0097:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Throwable r6 = new java.lang.Throwable
            java.lang.String r0 = "Lucky cart is not enabled in oneTrust"
            r6.<init>(r0)
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x00a8:
            return r6
        L_0x00a9:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Throwable r6 = new java.lang.Throwable
            java.lang.String r0 = "No Lucky cart game available"
            r6.<init>(r0)
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.luckycart.GetLuckyCartGameBannerUseCase.m172971invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}
