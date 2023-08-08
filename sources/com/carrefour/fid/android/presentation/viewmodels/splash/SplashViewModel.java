package com.carrefour.fid.android.presentation.viewmodels.splash;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.domain.interactors.airship.C37546c;
import com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37809c;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.presentation.viewmodels.splash.C27422c;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.util.C28909d;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BQ\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202¢\u0006\u0004\b6\u00107J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0013\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ\b\u0010\u000e\u001a\u00020\u0005H\u0002J\u0013\u0010\u000f\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\tJ\u0013\u0010\u0011\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104\u0002\u0004\n\u0002\b\u0019¨\u00068"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/splash/SplashViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/presentation/viewmodels/splash/c$b;", "Lcom/carrefour/fid/android/presentation/viewmodels/splash/c$c;", "intent", "Lkotlin/d2;", "s0", "(Lcom/carrefour/fid/android/presentation/viewmodels/splash/c$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "l0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "r0", "p0", "", "q0", "n0", "m0", "k0", "o0", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "a", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "appEnvironment", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "b", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/c;", "c", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/c;", "fetchRemoteConfigUseCase", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "d", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "e", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "f", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "appPreferencesStorage", "Lcom/carrefour/fid/android/shared/util/d;", "g", "Lcom/carrefour/fid/android/shared/util/d;", "applicationBuildInfo", "Lcom/carrefour/fid/android/domain/interactors/luckycart/LuckyCartGetLuckyCartBannersUseCase;", "h", "Lcom/carrefour/fid/android/domain/interactors/luckycart/LuckyCartGetLuckyCartBannersUseCase;", "getLuckyCartBannersUseCase", "Lcom/carrefour/fid/android/domain/interactors/airship/c;", "i", "Lcom/carrefour/fid/android/domain/interactors/airship/c;", "getGaidUseCase", "<init>", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/domain/interactors/remoteconfig/c;Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;Lcom/carrefour/fid/android/shared/util/d;Lcom/carrefour/fid/android/domain/interactors/luckycart/LuckyCartGetLuckyCartBannersUseCase;Lcom/carrefour/fid/android/domain/interactors/airship/c;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nSplashViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/splash/SplashViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n2624#2,3:131\n*S KotlinDebug\n*F\n+ 1 SplashViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/splash/SplashViewModel\n*L\n121#1:131,3\n*E\n"})
public final class SplashViewModel extends BaseMVIViewModel<C27422c.C27430b, C27422c.C27434c> {

    /* renamed from: j */
    public static final int f66510j = 8;
    @C12579k

    /* renamed from: a */
    public final AppEnvironment f66511a;
    @C12579k

    /* renamed from: b */
    public final LoyaltyPreferencesStorage f66512b;
    @C12579k

    /* renamed from: c */
    public final C37809c f66513c;
    @C12579k

    /* renamed from: d */
    public final LoginRepository f66514d;
    @C12579k

    /* renamed from: e */
    public final C37878e f66515e;
    @C12579k

    /* renamed from: f */
    public final AppPreferencesStorage f66516f;
    @C12579k

    /* renamed from: g */
    public final C28909d f66517g;
    @C12579k

    /* renamed from: h */
    public final LuckyCartGetLuckyCartBannersUseCase f66518h;
    @C12579k

    /* renamed from: i */
    public final C37546c f66519i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public SplashViewModel(@C12579k AppEnvironment appEnvironment, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k C37809c cVar, @C12579k LoginRepository loginRepository, @C12579k C37878e eVar, @C12579k AppPreferencesStorage appPreferencesStorage, @C12579k C28909d dVar, @C12579k LuckyCartGetLuckyCartBannersUseCase luckyCartGetLuckyCartBannersUseCase, @C12579k C37546c cVar2) {
        super(C27422c.C27430b.C27433c.f66544b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        AppEnvironment appEnvironment2 = appEnvironment;
        LoyaltyPreferencesStorage loyaltyPreferencesStorage2 = loyaltyPreferencesStorage;
        C37809c cVar3 = cVar;
        LoginRepository loginRepository2 = loginRepository;
        C37878e eVar2 = eVar;
        AppPreferencesStorage appPreferencesStorage2 = appPreferencesStorage;
        C28909d dVar2 = dVar;
        LuckyCartGetLuckyCartBannersUseCase luckyCartGetLuckyCartBannersUseCase2 = luckyCartGetLuckyCartBannersUseCase;
        C37546c cVar4 = cVar2;
        Intrinsics.checkNotNullParameter(appEnvironment2, "appEnvironment");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage2, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(cVar3, "fetchRemoteConfigUseCase");
        Intrinsics.checkNotNullParameter(loginRepository2, "loginRepository");
        Intrinsics.checkNotNullParameter(eVar2, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(appPreferencesStorage2, "appPreferencesStorage");
        Intrinsics.checkNotNullParameter(dVar2, "applicationBuildInfo");
        Intrinsics.checkNotNullParameter(luckyCartGetLuckyCartBannersUseCase2, "getLuckyCartBannersUseCase");
        Intrinsics.checkNotNullParameter(cVar4, "getGaidUseCase");
        this.f66511a = appEnvironment2;
        this.f66512b = loyaltyPreferencesStorage2;
        this.f66513c = cVar3;
        this.f66514d = loginRepository2;
        this.f66515e = eVar2;
        this.f66516f = appPreferencesStorage2;
        this.f66517g = dVar2;
        this.f66518h = luckyCartGetLuckyCartBannersUseCase2;
        this.f66519i = cVar4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79733k0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkConnectedUserLoyalty$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkConnectedUserLoyalty$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkConnectedUserLoyalty$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkConnectedUserLoyalty$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkConnectedUserLoyalty$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0062
            if (r2 == r6) goto L_0x005a
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00f9
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003b:
            java.lang.Object r2 = r0.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r7 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r7
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00dd
        L_0x004c:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0094
        L_0x005a:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r2
            kotlin.C11661u0.m45747n(r9)
            goto L_0x007b
        L_0x0062:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.account.data.repositories.LoginRepository r9 = r8.f66514d
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r9 = r9.mo31354f()
            if (r9 == 0) goto L_0x00ff
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r9 = r8.f66512b
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.hasLoyaltyCard(r0)
            if (r9 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r2 = r8
        L_0x007b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0085
            goto L_0x00ff
        L_0x0085:
            com.carrefour.fid.android.domain.interactors.user.e r9 = r2.f66515e
            com.carrefour.fid.android.domain.interactors.user.e$b r7 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37880b.f94998a
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r9 = r9.m172966invokegIAlus(r7, r0)
            if (r9 != r1) goto L_0x0094
            return r1
        L_0x0094:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r9)
            if (r5 == 0) goto L_0x009d
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x009d:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.models.account.AccountInfo r9 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r9
            java.util.List r9 = r9.mo116669w()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r5 = r9 instanceof java.util.Collection
            if (r5 == 0) goto L_0x00b6
            r5 = r9
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x00b6
            goto L_0x00e5
        L_0x00b6:
            java.util.Iterator r9 = r9.iterator()
            r5 = r9
            r7 = r2
        L_0x00bc:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00e4
            java.lang.Object r9 = r5.next()
            com.carrefour.fid.android.domain.models.account.UserCards r9 = (com.carrefour.fid.android.domain.models.account.UserCards) r9
            java.lang.String r2 = r9.mo116763k()
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r9 = r7.f66512b
            r0.L$0 = r7
            r0.L$1 = r5
            r0.L$2 = r2
            r0.label = r4
            java.lang.Object r9 = r9.getLoyaltyCardNumber(r0)
            if (r9 != r1) goto L_0x00dd
            return r1
        L_0x00dd:
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r9)
            if (r9 == 0) goto L_0x00bc
            r6 = 0
        L_0x00e4:
            r2 = r7
        L_0x00e5:
            if (r6 == 0) goto L_0x00fc
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r9 = r2.f66512b
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r9 = r9.clearLoyaltyCard(r0)
            if (r9 != r1) goto L_0x00f9
            return r1
        L_0x00f9:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x00fc:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        L_0x00ff:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel.mo79733k0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79734l0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkGaid$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkGaid$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkGaid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkGaid$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkGaid$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.airship.c r5 = r4.f66519i
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            boolean r1 = kotlin.Result.m38710j(r5)
            if (r1 == 0) goto L_0x0066
            java.lang.String r5 = (java.lang.String) r5
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 == 0) goto L_0x0066
            com.carrefour.fid.android.presentation.viewmodels.splash.c$a$a r1 = new com.carrefour.fid.android.presentation.viewmodels.splash.c$a$a
            r1.<init>(r5)
            r0.emitEvent(r1)
        L_0x0066:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel.mo79734l0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79735m0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkRemoteConfigFireBase$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkRemoteConfigFireBase$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkRemoteConfigFireBase$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkRemoteConfigFireBase$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$checkRemoteConfigFireBase$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.C11661u0.m45747n(r7)
            goto L_0x00a5
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0038:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r2
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0077
        L_0x0040:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x005f
        L_0x004e:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.domain.interactors.remoteconfig.c r7 = r6.f66513c
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r7.m172965invokeIoAF18A(r0)
            if (r7 != r1) goto L_0x005e
            return r1
        L_0x005e:
            r2 = r6
        L_0x005f:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r7)
            if (r5 != 0) goto L_0x00a0
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.booleanValue()
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r7 = r2.f66516f
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.mo108080c(r0)
            if (r7 != r1) goto L_0x0077
            return r1
        L_0x0077:
            com.carrefour.fid.android.core.datastore.a r7 = (com.carrefour.fid.android.core.datastore.C36193a) r7
            boolean r7 = r7.mo108145x()
            com.carrefour.fid.android.account.data.repositories.LoginRepository r4 = r2.f66514d
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r4 = r4.mo31354f()
            if (r4 != 0) goto L_0x009a
            if (r7 != 0) goto L_0x009a
            com.carrefour.fid.android.presentation.viewmodels.splash.c$a$e r7 = com.carrefour.fid.android.presentation.viewmodels.splash.C27422c.C27423a.C27428e.f66537a
            r2.emitEvent(r7)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r7 = r2.f66516f
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r7.mo108087j(r0)
            if (r7 != r1) goto L_0x00a5
            return r1
        L_0x009a:
            com.carrefour.fid.android.presentation.viewmodels.splash.c$a$d r7 = com.carrefour.fid.android.presentation.viewmodels.splash.C27422c.C27423a.C27427d.f66535a
            r2.emitEvent(r7)
            goto L_0x00a5
        L_0x00a0:
            com.carrefour.fid.android.presentation.viewmodels.splash.c$a$f r7 = com.carrefour.fid.android.presentation.viewmodels.splash.C27422c.C27423a.C27429f.f66539a
            r2.emitEvent(r7)
        L_0x00a5:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel.mo79735m0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: n0 */
    public final void mo79736n0() {
        emitEvent(new C27422c.C27423a.C27425b(this.f66511a.mo84161H(), this.f66517g.mo84152c()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79737o0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$getLuckyCartBannersList$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$getLuckyCartBannersList$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$getLuckyCartBannersList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$getLuckyCartBannersList$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$getLuckyCartBannersList$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            r5.mo21858l()
            goto L_0x0044
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0036:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.luckycart.LuckyCartGetLuckyCartBannersUseCase r5 = r4.f66518h
            r0.label = r3
            java.lang.Object r5 = r5.m172974invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0044
            return r1
        L_0x0044:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel.mo79737o0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79738p0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$handlerLoyaltyCardFid$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$handlerLoyaltyCardFid$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$handlerLoyaltyCardFid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$handlerLoyaltyCardFid$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$handlerLoyaltyCardFid$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0057
            if (r2 == r5) goto L_0x004f
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r1 = r0.L$1
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r1 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r1
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x00be
        L_0x0039:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0041:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0082
        L_0x004f:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x006b
        L_0x0057:
            kotlin.C11661u0.m45747n(r8)
            r7.mo79736n0()
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r8 = r7.f66512b
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.hasLoyaltyCard(r0)
            if (r8 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r2 = r7
        L_0x006b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00c9
            com.carrefour.fid.android.domain.interactors.user.e r8 = r2.f66515e
            com.carrefour.fid.android.domain.interactors.user.e$a r5 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r8 = r8.m172966invokegIAlus(r5, r0)
            if (r8 != r1) goto L_0x0082
            return r1
        L_0x0082:
            boolean r4 = kotlin.Result.m38710j(r8)
            if (r4 == 0) goto L_0x00ad
            kotlin.C11661u0.m45747n(r8)
            r4 = r8
            com.carrefour.fid.android.domain.models.account.AccountInfo r4 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r4
            java.lang.String r5 = r4.mo116664s()
            kotlin.C11661u0.m45747n(r8)
            java.lang.String r8 = r4.mo116667u()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r6 = r4.toString()
        L_0x00ad:
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r8 = r2.f66512b
            r0.L$0 = r6
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r8.getLoyaltyCardNumber(r0)
            if (r8 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            r1 = r2
            r0 = r6
        L_0x00be:
            java.lang.String r8 = (java.lang.String) r8
            com.carrefour.fid.android.presentation.viewmodels.splash.c$b$b r2 = new com.carrefour.fid.android.presentation.viewmodels.splash.c$b$b
            r2.<init>(r8, r0)
            r1.publishState(r2)
            goto L_0x00d1
        L_0x00c9:
            com.carrefour.fid.android.presentation.viewmodels.splash.c$b$b r8 = new com.carrefour.fid.android.presentation.viewmodels.splash.c$b$b
            r8.<init>(r6, r6)
            r2.publishState(r8)
        L_0x00d1:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel.mo79738p0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79739q0(kotlin.coroutines.C11045c<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$isFirstLaunch$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$isFirstLaunch$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$isFirstLaunch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$isFirstLaunch$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$isFirstLaunch$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r6) goto L_0x003c
            if (r2 == r5) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            kotlin.C11661u0.m45747n(r10)
            goto L_0x009a
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0038:
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0077
        L_0x003c:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0055
        L_0x0044:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r10 = r9.f66516f
            r0.L$0 = r9
            r0.label = r6
            java.lang.Object r10 = r10.mo108080c(r0)
            if (r10 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r9
        L_0x0055:
            com.carrefour.fid.android.core.datastore.a r10 = (com.carrefour.fid.android.core.datastore.C36193a) r10
            boolean r7 = r10.mo108138r()
            r8 = 0
            if (r7 != 0) goto L_0x007c
            com.carrefour.fid.android.presentation.viewmodels.splash.c$a$c r3 = new com.carrefour.fid.android.presentation.viewmodels.splash.c$a$c
            int r10 = r10.mo108142u()
            r3.<init>(r6, r10)
            r2.emitEvent(r3)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r10 = r2.f66516f
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r10 = r10.mo108086i(r0)
            if (r10 != r1) goto L_0x0077
            return r1
        L_0x0077:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
            return r10
        L_0x007c:
            com.carrefour.fid.android.presentation.viewmodels.splash.c$a$c r5 = new com.carrefour.fid.android.presentation.viewmodels.splash.c$a$c
            int r7 = r10.mo108142u()
            r5.<init>(r3, r7)
            r2.emitEvent(r5)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r2 = r2.f66516f
            int r10 = r10.mo108146y()
            int r10 = r10 + r6
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r10 = r2.mo108089l(r10, r0)
            if (r10 != r1) goto L_0x009a
            return r1
        L_0x009a:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel.mo79739q0(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo79740r0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$launchConnectedServices$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$launchConnectedServices$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$launchConnectedServices$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$launchConnectedServices$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel$launchConnectedServices$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r6) goto L_0x004a
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0091
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003a:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0085
        L_0x0042:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x006f
        L_0x004a:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0064
        L_0x0052:
            kotlin.C11661u0.m45747n(r8)
            r7.mo79736n0()
            r0.L$0 = r7
            r0.label = r6
            java.lang.Object r8 = r7.mo79735m0(r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r2 = r7
        L_0x0064:
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r8 = r2.mo79739q0(r0)
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x006f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x007a
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        L_0x007a:
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r8 = r2.mo79733k0(r0)
            if (r8 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r8 = r2.mo79737o0(r0)
            if (r8 != r1) goto L_0x0091
            return r1
        L_0x0091:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.splash.SplashViewModel.mo79740r0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: s0 */
    public Object processIntent(@C12579k C27422c.C27434c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (Intrinsics.areEqual((Object) cVar, (Object) C27422c.C27434c.C27438d.f66552a)) {
            Object r0 = mo79740r0(cVar2);
            if (r0 == C11063b.m42612h()) {
                return r0;
            }
            return C11079d2.f28267a;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C27422c.C27434c.C27435a.f66546a)) {
            Object p0 = mo79738p0(cVar2);
            if (p0 == C11063b.m42612h()) {
                return p0;
            }
            return C11079d2.f28267a;
        } else if (Intrinsics.areEqual((Object) cVar, (Object) C27422c.C27434c.C27436b.f66548a)) {
            Object m0 = mo79735m0(cVar2);
            if (m0 == C11063b.m42612h()) {
                return m0;
            }
            return C11079d2.f28267a;
        } else if (!Intrinsics.areEqual((Object) cVar, (Object) C27422c.C27434c.C27437c.f66550a)) {
            return C11079d2.f28267a;
        } else {
            Object l0 = mo79734l0(cVar2);
            if (l0 == C11063b.m42612h()) {
                return l0;
            }
            return C11079d2.f28267a;
        }
    }
}
