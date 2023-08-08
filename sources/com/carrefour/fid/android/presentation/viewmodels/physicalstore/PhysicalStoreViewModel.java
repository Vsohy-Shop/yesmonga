package com.carrefour.fid.android.presentation.viewmodels.physicalstore;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.catalog.C37610b;
import com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase;
import com.carrefour.fid.android.domain.interactors.service.C37816e;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37833d;
import com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.interactors.utilities.C37888b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001Bi\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?¢\u0006\u0004\bU\u0010VJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0005J\u0013\u0010\f\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020D0H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010T\u001a\b\u0012\u0004\u0012\u00020O0N8\u0000X\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/physicalstore/PhysicalStoreViewModel;", "Landroidx/lifecycle/v0;", "Lkotlin/d2;", "s0", "x0", "Lkotlinx/coroutines/c2;", "u0", "", "stickersTitle", "stickersUrl", "z0", "y0", "t0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "loyaltyCardNumber", "r0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "v0", "q0", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "a", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "getFavoritePhysicalStoreUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "b", "Lcom/carrefour/fid/android/domain/interactors/service/e;", "fetchFacilityDetailsByAnabelKeyUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/d;", "c", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/d;", "setFavoritePhysicalStoreUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "d", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "e", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "f", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;", "getLoyaltyBalanceUseCase", "Lcom/carrefour/fid/android/domain/interactors/coupons/FetchCouponsUseCase;", "g", "Lcom/carrefour/fid/android/domain/interactors/coupons/FetchCouponsUseCase;", "fetchCouponsUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "h", "Lcom/carrefour/fid/android/domain/interactors/service/k;", "getServiceSelectedUseCase", "Lcom/carrefour/fid/android/domain/interactors/stickers/GetStickersContentUseCase;", "i", "Lcom/carrefour/fid/android/domain/interactors/stickers/GetStickersContentUseCase;", "getStickersContentUseCase", "Lcom/carrefour/fid/android/domain/interactors/utilities/b;", "j", "Lcom/carrefour/fid/android/domain/interactors/utilities/b;", "getSecureTokenUseCase", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "k", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "Lcom/carrefour/fid/android/domain/interactors/catalog/b;", "l", "Lcom/carrefour/fid/android/domain/interactors/catalog/b;", "getCatalogActionUseCase", "Lkotlinx/coroutines/channels/g;", "Lcom/carrefour/fid/android/presentation/viewmodels/physicalstore/d;", "m", "Lkotlinx/coroutines/channels/g;", "_sideEffect", "Lkotlinx/coroutines/flow/e;", "n", "Lkotlinx/coroutines/flow/e;", "getSideEffect", "()Lkotlinx/coroutines/flow/e;", "sideEffect", "Lkotlinx/coroutines/flow/j;", "Lcom/carrefour/fid/android/presentation/viewmodels/physicalstore/e;", "o", "Lkotlinx/coroutines/flow/j;", "w0", "()Lkotlinx/coroutines/flow/j;", "state", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;Lcom/carrefour/fid/android/domain/interactors/service/e;Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/d;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyBalanceUseCase;Lcom/carrefour/fid/android/domain/interactors/coupons/FetchCouponsUseCase;Lcom/carrefour/fid/android/domain/interactors/service/k;Lcom/carrefour/fid/android/domain/interactors/stickers/GetStickersContentUseCase;Lcom/carrefour/fid/android/domain/interactors/utilities/b;Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;Lcom/carrefour/fid/android/domain/interactors/catalog/b;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nPhysicalStoreViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/physicalstore/PhysicalStoreViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,334:1\n230#2,5:335\n230#2,5:340\n230#2,5:345\n230#2,5:350\n230#2,5:355\n230#2,5:360\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/physicalstore/PhysicalStoreViewModel\n*L\n257#1:335,5\n265#1:340,5\n277#1:345,5\n294#1:350,5\n307#1:355,5\n323#1:360,5\n*E\n"})
public final class PhysicalStoreViewModel extends C19476v0 {

    /* renamed from: p */
    public static final int f65904p = 8;
    @C12579k

    /* renamed from: a */
    public final C37832c f65905a;
    @C12579k

    /* renamed from: b */
    public final C37816e f65906b;
    @C12579k

    /* renamed from: c */
    public final C37833d f65907c;
    @C12579k

    /* renamed from: d */
    public final C37878e f65908d;
    @C12579k

    /* renamed from: e */
    public final LoyaltyPreferencesStorage f65909e;
    @C12579k

    /* renamed from: f */
    public final GetLoyaltyBalanceUseCase f65910f;
    @C12579k

    /* renamed from: g */
    public final FetchCouponsUseCase f65911g;
    @C12579k

    /* renamed from: h */
    public final C37823k f65912h;
    @C12579k

    /* renamed from: i */
    public final GetStickersContentUseCase f65913i;
    @C12579k

    /* renamed from: j */
    public final C37888b f65914j;
    @C12579k

    /* renamed from: k */
    public final LoginRepository f65915k;
    @C12579k

    /* renamed from: l */
    public final C37610b f65916l;
    @C12579k

    /* renamed from: m */
    public final C11744g<C27121d> f65917m;
    @C12579k

    /* renamed from: n */
    public final C11907e<C27121d> f65918n;
    @C12579k

    /* renamed from: o */
    public final C11940j<C27127e> f65919o = C11953v.m47628a(new C27127e((C27116c) null, (C27115b) null, 3, (DefaultConstructorMarker) null));

    @Inject
    public PhysicalStoreViewModel(@C12579k C37832c cVar, @C12579k C37816e eVar, @C12579k C37833d dVar, @C12579k C37878e eVar2, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k GetLoyaltyBalanceUseCase getLoyaltyBalanceUseCase, @C12579k FetchCouponsUseCase fetchCouponsUseCase, @C12579k C37823k kVar, @C12579k GetStickersContentUseCase getStickersContentUseCase, @C12579k C37888b bVar, @C12579k LoginRepository loginRepository, @C12579k C37610b bVar2) {
        Intrinsics.checkNotNullParameter(cVar, "getFavoritePhysicalStoreUseCase");
        Intrinsics.checkNotNullParameter(eVar, "fetchFacilityDetailsByAnabelKeyUseCase");
        Intrinsics.checkNotNullParameter(dVar, "setFavoritePhysicalStoreUseCase");
        Intrinsics.checkNotNullParameter(eVar2, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(getLoyaltyBalanceUseCase, "getLoyaltyBalanceUseCase");
        Intrinsics.checkNotNullParameter(fetchCouponsUseCase, "fetchCouponsUseCase");
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectedUseCase");
        Intrinsics.checkNotNullParameter(getStickersContentUseCase, "getStickersContentUseCase");
        Intrinsics.checkNotNullParameter(bVar, "getSecureTokenUseCase");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(bVar2, "getCatalogActionUseCase");
        this.f65905a = cVar;
        this.f65906b = eVar;
        this.f65907c = dVar;
        this.f65908d = eVar2;
        this.f65909e = loyaltyPreferencesStorage;
        this.f65910f = getLoyaltyBalanceUseCase;
        this.f65911g = fetchCouponsUseCase;
        this.f65912h = kVar;
        this.f65913i = getStickersContentUseCase;
        this.f65914j = bVar;
        this.f65915k = loginRepository;
        this.f65916l = bVar2;
        C11744g<C27121d> d = C11748i.m46625d(-2, (BufferOverflow) null, (C11300l) null, 6, (Object) null);
        this.f65917m = d;
        this.f65918n = C11909g.m47490s1(d);
    }

    @C12579k
    public final C11907e<C27121d> getSideEffect() {
        return this.f65918n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo78798q0(java.lang.String r18, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchBalance$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchBalance$1 r2 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchBalance$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchBalance$1 r2 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchBalance$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003f
            if (r4 != r5) goto L_0x0037
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r2 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0057
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase r1 = r0.f65910f
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params r4 = new com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase$Params
            r6 = r18
            r4.<init>(r6)
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = r1.m173041invokegIAlus((com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyBalanceUseCase.Params) r4, (kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Double>>) r2)
            if (r1 != r3) goto L_0x0056
            return r3
        L_0x0056:
            r2 = r0
        L_0x0057:
            boolean r3 = kotlin.Result.m38710j(r1)
            r4 = 0
            if (r3 == 0) goto L_0x008c
            r3 = r1
            java.lang.Number r3 = (java.lang.Number) r3
            double r6 = r3.doubleValue()
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.physicalstore.e> r3 = r2.f65919o
        L_0x0067:
            java.lang.Object r8 = r3.getValue()
            r9 = r8
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r9 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r9
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r10 = r9.mo78876e()
            r11 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.state.f$b r12 = new com.carrefour.fid.android.presentation.viewmodels.home.state.f$b
            r12.<init>(r6)
            r13 = 0
            r14 = 0
            r15 = 13
            r16 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r10 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27115b.m114624f(r10, r11, r12, r13, r14, r15, r16)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r9 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r9, r4, r10, r5, r4)
            boolean r8 = r3.mo24216e(r8, r9)
            if (r8 == 0) goto L_0x0067
        L_0x008c:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r1)
            if (r1 == 0) goto L_0x00d4
            com.carrefour.fid.android.shared.util.i r6 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r3 = r1.getMessage()
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = ""
        L_0x009c:
            r7 = r3
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r6, r7, r8, r9, r10, r11)
            boolean r1 = r1 instanceof com.carrefour.fid.android.loyalty.core.p061io.CheckoutNotAcceptedCardFidThrowable
            if (r1 == 0) goto L_0x00b0
            com.carrefour.fid.android.presentation.viewmodels.home.state.f$b r1 = new com.carrefour.fid.android.presentation.viewmodels.home.state.f$b
            r6 = 0
            r1.<init>(r6)
            goto L_0x00b2
        L_0x00b0:
            com.carrefour.fid.android.presentation.viewmodels.home.state.f$a r1 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26497f.C26498a.f64767a
        L_0x00b2:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.physicalstore.e> r2 = r2.f65919o
        L_0x00b4:
            java.lang.Object r3 = r2.getValue()
            r13 = r3
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r13 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r13
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r6 = r13.mo78876e()
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 13
            r12 = 0
            r8 = r1
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r6 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27115b.m114624f(r6, r7, r8, r9, r10, r11, r12)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r6 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r13, r4, r6, r5, r4)
            boolean r3 = r2.mo24216e(r3, r6)
            if (r3 == 0) goto L_0x00b4
        L_0x00d4:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel.mo78798q0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo78799r0(java.lang.String r13, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchCoupons$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchCoupons$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchCoupons$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchCoupons$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchCoupons$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r13 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r13 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel) r13
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x0051
        L_0x0033:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003b:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase r14 = r12.f65911g
            com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase$a r2 = new com.carrefour.fid.android.domain.interactors.coupons.FetchCouponsUseCase$a
            r2.<init>(r13)
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r14 = r14.m172950invokegIAlus(r2, r0)
            if (r14 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r13 = r12
        L_0x0051:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r14)
            r1 = 0
            if (r0 == 0) goto L_0x0091
            com.carrefour.fid.android.shared.util.i r4 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            com.carrefour.fid.android.core.io.CouponsThrowable r0 = com.carrefour.fid.android.presentation.models.extension.C38469e.m159628a(r0)
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = ""
        L_0x0066:
            r5 = r0
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r4, r5, r6, r7, r8, r9)
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.physicalstore.e> r0 = r13.f65919o
        L_0x0070:
            java.lang.Object r2 = r0.getValue()
            r4 = r2
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r4 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r4
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r5 = r4.mo78876e()
            r6 = 0
            r7 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.state.c$a r8 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26487c.C26488a.f64752a
            r9 = 0
            r10 = 11
            r11 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r5 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27115b.m114624f(r5, r6, r7, r8, r9, r10, r11)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r4 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r4, r1, r5, r3, r1)
            boolean r2 = r0.mo24216e(r2, r4)
            if (r2 == 0) goto L_0x0070
        L_0x0091:
            boolean r0 = kotlin.Result.m38710j(r14)
            if (r0 == 0) goto L_0x00bf
            com.carrefour.fid.android.domain.models.c r14 = (com.carrefour.fid.android.domain.models.C37974c) r14
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.physicalstore.e> r13 = r13.f65919o
        L_0x009b:
            java.lang.Object r0 = r13.getValue()
            r2 = r0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r2 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r2
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r4 = r2.mo78876e()
            r5 = 0
            r6 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.state.c$b r7 = new com.carrefour.fid.android.presentation.viewmodels.home.state.c$b
            r7.<init>(r14)
            r8 = 0
            r9 = 11
            r10 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r4 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27115b.m114624f(r4, r5, r6, r7, r8, r9, r10)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r2 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r2, r1, r4, r3, r1)
            boolean r0 = r13.mo24216e(r0, r2)
            if (r0 == 0) goto L_0x009b
        L_0x00bf:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel.mo78799r0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: s0 */
    public final void mo78800s0() {
        mo78802u0();
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new PhysicalStoreViewModel$fetchInfo$1(this, (C11045c<? super PhysicalStoreViewModel$fetchInfo$1>) null), 3, (Object) null);
    }

    /* renamed from: t0 */
    public final Object mo78801t0(C11045c<? super C11079d2> cVar) {
        Object g = C12079p0.m48266g(new PhysicalStoreViewModel$fetchLoyalty$2(this, (C11045c<? super PhysicalStoreViewModel$fetchLoyalty$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: u0 */
    public final C11723c2 mo78802u0() {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new PhysicalStoreViewModel$fetchPhysicalStore$1(this, (C11045c<? super PhysicalStoreViewModel$fetchPhysicalStore$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo78803v0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchStickers$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchStickers$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchStickers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchStickers$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel$fetchStickers$1
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel r0 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel) r0
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r14 = r14.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x003b:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.domain.interactors.stickers.GetStickersContentUseCase r14 = r13.f65913i
            r0.L$0 = r13
            r0.label = r3
            java.lang.Object r14 = r14.m173010invokeIoAF18A(r0)
            if (r14 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r13
        L_0x004c:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r14)
            r2 = 0
            if (r1 == 0) goto L_0x0075
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.physicalstore.e> r1 = r0.f65919o
        L_0x0055:
            java.lang.Object r4 = r1.getValue()
            r5 = r4
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r5 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r5
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r6 = r5.mo78876e()
            r7 = 0
            r8 = 0
            r9 = 0
            com.carrefour.fid.android.presentation.viewmodels.home.state.h$b r10 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h.C26507b.f64783a
            r11 = 7
            r12 = 0
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r6 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27115b.m114624f(r6, r7, r8, r9, r10, r11, r12)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r5 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r5, r2, r6, r3, r2)
            boolean r4 = r1.mo24216e(r4, r5)
            if (r4 == 0) goto L_0x0055
        L_0x0075:
            boolean r1 = kotlin.Result.m38710j(r14)
            if (r1 == 0) goto L_0x00bd
            com.carrefour.fid.android.domain.models.StickersDomain r14 = (com.carrefour.fid.android.domain.models.StickersDomain) r14
            java.lang.String r1 = r14.getStickersUrl()
            boolean r1 = kotlin.text.C11622t.isBlank(r1)
            if (r1 == 0) goto L_0x008a
            com.carrefour.fid.android.presentation.viewmodels.home.state.h$b r14 = com.carrefour.fid.android.presentation.viewmodels.home.state.C26505h.C26507b.f64783a
            goto L_0x009c
        L_0x008a:
            com.carrefour.fid.android.presentation.viewmodels.home.state.h$a r1 = new com.carrefour.fid.android.presentation.viewmodels.home.state.h$a
            java.lang.String r4 = r14.getTitle()
            java.lang.String r5 = r14.getStickersUrl()
            java.lang.String r14 = r14.getStickersImageUrl()
            r1.<init>(r4, r5, r14)
            r14 = r1
        L_0x009c:
            kotlinx.coroutines.flow.j<com.carrefour.fid.android.presentation.viewmodels.physicalstore.e> r0 = r0.f65919o
        L_0x009e:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r4 = (com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e) r4
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r6 = r4.mo78876e()
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 7
            r12 = 0
            r10 = r14
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.b r5 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27115b.m114624f(r6, r7, r8, r9, r10, r11, r12)
            com.carrefour.fid.android.presentation.viewmodels.physicalstore.e r4 = com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27127e.m114656d(r4, r2, r5, r3, r2)
            boolean r1 = r0.mo24216e(r1, r4)
            if (r1 == 0) goto L_0x009e
        L_0x00bd:
            kotlin.d2 r14 = kotlin.C11079d2.f28267a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel.mo78803v0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: w0 */
    public final C11940j<C27127e> mo78804w0() {
        return this.f65919o;
    }

    /* renamed from: x0 */
    public final void mo78805x0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new PhysicalStoreViewModel$handleCatalogClick$1(this, (C11045c<? super PhysicalStoreViewModel$handleCatalogClick$1>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: y0 */
    public final C11723c2 mo78806y0() {
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new PhysicalStoreViewModel$handleCouponBlockClick$1(this, (C11045c<? super PhysicalStoreViewModel$handleCouponBlockClick$1>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: z0 */
    public final C11723c2 mo78807z0(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "stickersTitle");
        Intrinsics.checkNotNullParameter(str2, "stickersUrl");
        return C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new PhysicalStoreViewModel$handleMyStickersClick$1(this, str2, str, (C11045c<? super PhysicalStoreViewModel$handleMyStickersClick$1>) null), 3, (Object) null);
    }
}
