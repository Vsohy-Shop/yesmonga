package com.carrefour.fid.android.presentation.viewmodels.account.home;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19500w0;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.consent.domain.interactors.ClearConsentUserCase;
import com.carrefour.fid.android.domain.interactors.account.C37522h;
import com.carrefour.fid.android.domain.interactors.accountmenu.C37539c;
import com.carrefour.fid.android.domain.interactors.airship.C37545b;
import com.carrefour.fid.android.domain.interactors.basket.C37573h;
import com.carrefour.fid.android.domain.interactors.feedback.C37688c;
import com.carrefour.fid.android.domain.interactors.product.C37786s;
import com.carrefour.fid.android.domain.interactors.service.C37811a;
import com.carrefour.fid.android.domain.interactors.slot.C37854a;
import com.carrefour.fid.android.domain.interactors.user.C37883f;
import com.carrefour.fid.android.domain.interactors.user.C37885h;
import com.carrefour.fid.android.domain.models.accountmenu.AccountMenuItem;
import com.carrefour.fid.android.domain.models.accountmenu.C37950a;
import com.carrefour.fid.android.domain.models.accountmenu.C37951b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.shared.type.C28892e;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11948r;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001By\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010=\u001a\u00020:\u0012\u0006\u0010A\u001a\u00020>\u0012\u0006\u0010E\u001a\u00020B¢\u0006\u0004\b`\u0010aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tJ\u0013\u0010\f\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0G0F8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L0F8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010JR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020P0F8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010JR \u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0L0F8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010JR\u001c\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010V0F8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010JR \u0010_\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0000X\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/account/home/AccountMenuViewModel;", "Landroidx/lifecycle/v0;", "Lkotlin/d2;", "A0", "y0", "t0", "x0", "z0", "w0", "Lkotlin/Function0;", "onCleanFinished", "u0", "C0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "a", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "loginRepository", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "b", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "accountRepository", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "c", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/domain/interactors/slot/a;", "d", "Lcom/carrefour/fid/android/domain/interactors/slot/a;", "clearSlotUseCase", "Lcom/carrefour/fid/android/domain/interactors/account/h;", "e", "Lcom/carrefour/fid/android/domain/interactors/account/h;", "revokeTokenUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/f;", "f", "Lcom/carrefour/fid/android/domain/interactors/user/f;", "getUserInfoWithCardTypeUseCase", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "g", "Lcom/carrefour/fid/android/domain/interactors/service/a;", "clearServiceSelectionUseCase", "Lcom/carrefour/fid/android/domain/interactors/feedback/c;", "h", "Lcom/carrefour/fid/android/domain/interactors/feedback/c;", "checkUsabillaUseCase", "Lcom/carrefour/fid/android/domain/interactors/airship/b;", "i", "Lcom/carrefour/fid/android/domain/interactors/airship/b;", "getAirshipInboxUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/h;", "j", "Lcom/carrefour/fid/android/domain/interactors/basket/h;", "clearBasketCacheUseCase", "Lcom/carrefour/fid/android/consent/domain/interactors/ClearConsentUserCase;", "k", "Lcom/carrefour/fid/android/consent/domain/interactors/ClearConsentUserCase;", "clearConsentUserCase", "Lcom/carrefour/fid/android/domain/interactors/accountmenu/c;", "l", "Lcom/carrefour/fid/android/domain/interactors/accountmenu/c;", "getAccountMenuListUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/h;", "m", "Lcom/carrefour/fid/android/domain/interactors/user/h;", "getUserUuidUseCase", "Lcom/carrefour/fid/android/domain/interactors/product/s;", "n", "Lcom/carrefour/fid/android/domain/interactors/product/s;", "shouldClearProductListCacheUseCase", "Lkotlinx/coroutines/flow/j;", "", "Lcom/carrefour/fid/android/domain/models/accountmenu/AccountMenuItem;", "o", "Lkotlinx/coroutines/flow/j;", "_accountMenuList", "Lcom/carrefour/fid/android/shared/type/e;", "Lcom/carrefour/fid/android/domain/models/accountmenu/a;", "p", "_airshipInbox", "", "q", "_displayUsabillaBanner", "Lcom/carrefour/fid/android/domain/models/accountmenu/b;", "r", "_userInfo", "", "s", "_userUuid", "Lkotlinx/coroutines/flow/u;", "Lcom/carrefour/fid/android/presentation/viewmodels/account/home/c;", "t", "Lkotlinx/coroutines/flow/u;", "B0", "()Lkotlinx/coroutines/flow/u;", "state", "<init>", "(Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/domain/interactors/slot/a;Lcom/carrefour/fid/android/domain/interactors/account/h;Lcom/carrefour/fid/android/domain/interactors/user/f;Lcom/carrefour/fid/android/domain/interactors/service/a;Lcom/carrefour/fid/android/domain/interactors/feedback/c;Lcom/carrefour/fid/android/domain/interactors/airship/b;Lcom/carrefour/fid/android/domain/interactors/basket/h;Lcom/carrefour/fid/android/consent/domain/interactors/ClearConsentUserCase;Lcom/carrefour/fid/android/domain/interactors/accountmenu/c;Lcom/carrefour/fid/android/domain/interactors/user/h;Lcom/carrefour/fid/android/domain/interactors/product/s;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountMenuViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMenuViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/home/AccountMenuViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,160:1\n230#2,5:161\n*S KotlinDebug\n*F\n+ 1 AccountMenuViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/home/AccountMenuViewModel\n*L\n79#1:161,5\n*E\n"})
public final class AccountMenuViewModel extends C19476v0 {

    /* renamed from: u */
    public static final int f63159u = 8;
    @C12579k

    /* renamed from: a */
    public final LoginRepository f63160a;
    @C12579k

    /* renamed from: b */
    public final AccountRepository f63161b;
    @C12579k

    /* renamed from: c */
    public final LoyaltyPreferencesStorage f63162c;
    @C12579k

    /* renamed from: d */
    public final C37854a f63163d;
    @C12579k

    /* renamed from: e */
    public final C37522h f63164e;
    @C12579k

    /* renamed from: f */
    public final C37883f f63165f;
    @C12579k

    /* renamed from: g */
    public final C37811a f63166g;
    @C12579k

    /* renamed from: h */
    public final C37688c f63167h;
    @C12579k

    /* renamed from: i */
    public final C37545b f63168i;
    @C12579k

    /* renamed from: j */
    public final C37573h f63169j;
    @C12579k

    /* renamed from: k */
    public final ClearConsentUserCase f63170k;
    @C12579k

    /* renamed from: l */
    public final C37539c f63171l;
    @C12579k

    /* renamed from: m */
    public final C37885h f63172m;
    @C12579k

    /* renamed from: n */
    public final C37786s f63173n;
    @C12579k

    /* renamed from: o */
    public final C11940j<List<AccountMenuItem>> f63174o;
    @C12579k

    /* renamed from: p */
    public final C11940j<C28892e<C37950a>> f63175p;
    @C12579k

    /* renamed from: q */
    public final C11940j<Boolean> f63176q;
    @C12579k

    /* renamed from: r */
    public final C11940j<C28892e<C37951b>> f63177r;
    @C12579k

    /* renamed from: s */
    public final C11940j<String> f63178s;
    @C12579k

    /* renamed from: t */
    public final C11952u<C25798c> f63179t;

    @Inject
    public AccountMenuViewModel(@C12579k LoginRepository loginRepository, @C12579k AccountRepository accountRepository, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k C37854a aVar, @C12579k C37522h hVar, @C12579k C37883f fVar, @C12579k C37811a aVar2, @C12579k C37688c cVar, @C12579k C37545b bVar, @C12579k C37573h hVar2, @C12579k ClearConsentUserCase clearConsentUserCase, @C12579k C37539c cVar2, @C12579k C37885h hVar3, @C12579k C37786s sVar) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(aVar, "clearSlotUseCase");
        Intrinsics.checkNotNullParameter(hVar, "revokeTokenUseCase");
        Intrinsics.checkNotNullParameter(fVar, "getUserInfoWithCardTypeUseCase");
        Intrinsics.checkNotNullParameter(aVar2, "clearServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(cVar, "checkUsabillaUseCase");
        Intrinsics.checkNotNullParameter(bVar, "getAirshipInboxUseCase");
        Intrinsics.checkNotNullParameter(hVar2, "clearBasketCacheUseCase");
        Intrinsics.checkNotNullParameter(clearConsentUserCase, "clearConsentUserCase");
        Intrinsics.checkNotNullParameter(cVar2, "getAccountMenuListUseCase");
        Intrinsics.checkNotNullParameter(hVar3, "getUserUuidUseCase");
        Intrinsics.checkNotNullParameter(sVar, "shouldClearProductListCacheUseCase");
        this.f63160a = loginRepository;
        this.f63161b = accountRepository;
        this.f63162c = loyaltyPreferencesStorage;
        this.f63163d = aVar;
        this.f63164e = hVar;
        this.f63165f = fVar;
        this.f63166g = aVar2;
        this.f63167h = cVar;
        this.f63168i = bVar;
        this.f63169j = hVar2;
        this.f63170k = clearConsentUserCase;
        this.f63171l = cVar2;
        this.f63172m = hVar3;
        this.f63173n = sVar;
        C11940j<List<AccountMenuItem>> a = C11953v.m47628a(CollectionsKt__CollectionsKt.m40441E());
        this.f63174o = a;
        C28892e.C28896d dVar = C28892e.C28896d.f70785b;
        C11940j<C28892e<C37950a>> a2 = C11953v.m47628a(dVar);
        this.f63175p = a2;
        C11940j<Boolean> a3 = C11953v.m47628a(Boolean.FALSE);
        this.f63176q = a3;
        C11940j<C28892e<C37951b>> a4 = C11953v.m47628a(dVar);
        this.f63177r = a4;
        C11940j<String> a5 = C11953v.m47628a(null);
        this.f63178s = a5;
        this.f63179t = C11909g.m47392O1(C11909g.m47366G(a, a2, a3, a4, a5, new AccountMenuViewModel$state$1((C11045c<? super AccountMenuViewModel$state$1>) null)), C19500w0.m90846a(this), C11948r.f29534a.mo24272c(), new C25798c((C28892e) null, (C28892e) null, false, (List) null, (String) null, 31, (DefaultConstructorMarker) null));
        mo74864A0();
        mo74871y0();
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m110631v0(AccountMenuViewModel accountMenuViewModel, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        accountMenuViewModel.mo74868u0(aVar);
    }

    /* renamed from: A0 */
    public final void mo74864A0() {
        List<AccountMenuItem> value;
        C11940j<List<AccountMenuItem>> jVar = this.f63174o;
        do {
            value = jVar.getValue();
            List list = value;
        } while (!jVar.mo24216e(value, this.f63171l.mo114315a()));
    }

    @C12579k
    /* renamed from: B0 */
    public final C11952u<C25798c> mo74865B0() {
        return this.f63179t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74866C0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel$revokeToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel$revokeToken$1 r0 = (com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel$revokeToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel$revokeToken$1 r0 = new com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel$revokeToken$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0037:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.domain.interactors.account.h r8 = r7.f63164e
            r0.label = r3
            java.lang.Object r8 = r8.m172965invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x0045
            return r1
        L_0x0045:
            boolean r0 = kotlin.Result.m38709i(r8)
            if (r0 == 0) goto L_0x0063
            com.carrefour.fid.android.shared.util.i r1 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.Throwable r8 = kotlin.Result.m38705e(r8)
            if (r8 == 0) goto L_0x0059
            java.lang.String r8 = r8.getMessage()
            if (r8 != 0) goto L_0x005b
        L_0x0059:
            java.lang.String r8 = "Error occurred during token revoking"
        L_0x005b:
            r2 = r8
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119706i(r1, r2, r3, r4, r5, r6)
        L_0x0063:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.home.AccountMenuViewModel.mo74866C0(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: t0 */
    public final void mo74867t0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new AccountMenuViewModel$checkUsabillaAvailability$1(this, (C11045c<? super AccountMenuViewModel$checkUsabillaAvailability$1>) null), 3, (Object) null);
    }

    /* renamed from: u0 */
    public final void mo74868u0(@C12580l C11289a<C11079d2> aVar) {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new AccountMenuViewModel$cleanAppCache$1(this, aVar, (C11045c<? super AccountMenuViewModel$cleanAppCache$1>) null), 3, (Object) null);
    }

    /* renamed from: w0 */
    public final void mo74869w0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new AccountMenuViewModel$clearUserUuid$1(this, (C11045c<? super AccountMenuViewModel$clearUserUuid$1>) null), 3, (Object) null);
    }

    /* renamed from: x0 */
    public final void mo74870x0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new AccountMenuViewModel$fetchAccountInbox$1(this, (C11045c<? super AccountMenuViewModel$fetchAccountInbox$1>) null), 3, (Object) null);
    }

    /* renamed from: y0 */
    public final void mo74871y0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new AccountMenuViewModel$fetchUserInfo$1(this, (C11045c<? super AccountMenuViewModel$fetchUserInfo$1>) null), 3, (Object) null);
    }

    /* renamed from: z0 */
    public final void mo74872z0() {
        C11723c2 unused = C12038j.m48061f(C19500w0.m90846a(this), (CoroutineContext) null, (CoroutineStart) null, new AccountMenuViewModel$fetchUserUuid$1(this, (C11045c<? super AccountMenuViewModel$fetchUserUuid$1>) null), 3, (Object) null);
    }
}
