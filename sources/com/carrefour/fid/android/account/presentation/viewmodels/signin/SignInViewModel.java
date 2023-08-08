package com.carrefour.fid.android.account.presentation.viewmodels.signin;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13302o;
import com.carrefour.fid.android.account.presentation.analytics.SignInAnalyticsInterfaceDelegate;
import com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.C13706a;
import com.carrefour.fid.android.domain.interactors.basket.C37587n;
import com.carrefour.fid.android.domain.interactors.consent.C37629a;
import com.carrefour.fid.android.domain.interactors.loyalty.C37701e;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.tracking.C28994a;
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
@C11076d0(mo22515d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004BA\b\u0007\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00108\u001a\u000206¢\u0006\u0004\b;\u0010<J\t\u0010\u0006\u001a\u00020\u0005H\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0001J\t\u0010\b\u001a\u00020\u0005H\u0001J\t\u0010\t\u001a\u00020\u0005H\u0001J\u0011\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0001J\u0011\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0001J#\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nHAø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0002R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u00107\u0002\u0004\n\u0002\b\u0019¨\u0006="}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/viewmodels/signin/SignInViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/signin/mvi/a$b;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/signin/mvi/a$d;", "Lcom/carrefour/fid/android/account/presentation/analytics/o;", "Lkotlin/d2;", "sendScreenView", "D", "f", "Y", "", "hasFidCard", "x", "", "errorType", "n", "userProfiling", "userProfilingPartner", "M", "(ZZLkotlin/coroutines/c;)Ljava/lang/Object;", "intent", "g0", "(Lcom/carrefour/fid/android/account/presentation/viewmodels/signin/mvi/a$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "email", "password", "i0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/account/domain/models/LoginDomain;", "loginDomain", "f0", "(Lcom/carrefour/fid/android/account/domain/models/LoginDomain;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/signin/mvi/a$a;", "partialState", "h0", "Lcom/carrefour/fid/android/account/domain/interactors/login/GetLoginUseCase;", "a", "Lcom/carrefour/fid/android/account/domain/interactors/login/GetLoginUseCase;", "loginUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "b", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "userInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/consent/a;", "c", "Lcom/carrefour/fid/android/domain/interactors/consent/a;", "getConsentsUseCase", "Lcom/carrefour/fid/android/domain/interactors/basket/n;", "d", "Lcom/carrefour/fid/android/domain/interactors/basket/n;", "getBasketsListUseCase", "Lcom/carrefour/fid/android/tracking/a;", "e", "Lcom/carrefour/fid/android/tracking/a;", "audienceTracking", "Lcom/carrefour/fid/android/domain/interactors/loyalty/e;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/e;", "hasValidFidCardFromUserInfo", "Lcom/carrefour/fid/android/account/presentation/analytics/SignInAnalyticsInterfaceDelegate;", "analytics", "<init>", "(Lcom/carrefour/fid/android/account/domain/interactors/login/GetLoginUseCase;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/domain/interactors/consent/a;Lcom/carrefour/fid/android/domain/interactors/basket/n;Lcom/carrefour/fid/android/account/presentation/analytics/SignInAnalyticsInterfaceDelegate;Lcom/carrefour/fid/android/tracking/a;Lcom/carrefour/fid/android/domain/interactors/loyalty/e;)V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSignInViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignInViewModel.kt\ncom/carrefour/fid/android/account/presentation/viewmodels/signin/SignInViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n1747#2,3:144\n1747#2,3:147\n*S KotlinDebug\n*F\n+ 1 SignInViewModel.kt\ncom/carrefour/fid/android/account/presentation/viewmodels/signin/SignInViewModel\n*L\n127#1:144,3\n131#1:147,3\n*E\n"})
public final class SignInViewModel extends BaseMVIViewModel<C13706a.C13711b, C13706a.C13715d> implements C13302o {
    @C12579k

    /* renamed from: a */
    public final GetLoginUseCase f33306a;
    @C12579k

    /* renamed from: b */
    public final C37878e f33307b;
    @C12579k

    /* renamed from: c */
    public final C37629a f33308c;
    @C12579k

    /* renamed from: d */
    public final C37587n f33309d;
    @C12579k

    /* renamed from: e */
    public final C28994a f33310e;
    @C12579k

    /* renamed from: f */
    public final C37701e f33311f;

    /* renamed from: g */
    public final /* synthetic */ SignInAnalyticsInterfaceDelegate f33312g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public SignInViewModel(@C12579k GetLoginUseCase getLoginUseCase, @C12579k C37878e eVar, @C12579k C37629a aVar, @C12579k C37587n nVar, @C12579k SignInAnalyticsInterfaceDelegate signInAnalyticsInterfaceDelegate, @C12579k C28994a aVar2, @C12579k C37701e eVar2) {
        super(new C13706a.C13711b(false, false, false, 7, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getLoginUseCase, "loginUseCase");
        Intrinsics.checkNotNullParameter(eVar, "userInfoUseCase");
        Intrinsics.checkNotNullParameter(aVar, "getConsentsUseCase");
        Intrinsics.checkNotNullParameter(nVar, "getBasketsListUseCase");
        Intrinsics.checkNotNullParameter(signInAnalyticsInterfaceDelegate, "analytics");
        Intrinsics.checkNotNullParameter(aVar2, "audienceTracking");
        Intrinsics.checkNotNullParameter(eVar2, "hasValidFidCardFromUserInfo");
        this.f33306a = getLoginUseCase;
        this.f33307b = eVar;
        this.f33308c = aVar;
        this.f33309d = nVar;
        this.f33310e = aVar2;
        this.f33311f = eVar2;
        this.f33312g = signInAnalyticsInterfaceDelegate;
    }

    /* renamed from: D */
    public void mo31577D() {
        this.f33312g.mo31577D();
    }

    @C12580l
    /* renamed from: M */
    public Object mo31578M(boolean z, boolean z2, @C12579k C11045c<? super C11079d2> cVar) {
        return this.f33312g.mo31578M(z, z2, cVar);
    }

    /* renamed from: Y */
    public void mo31579Y() {
        this.f33312g.mo31579Y();
    }

    /* renamed from: f */
    public void mo31580f() {
        this.f33312g.mo31580f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01d9  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32603f0(com.carrefour.fid.android.account.domain.models.LoginDomain r18, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel$getUserInfo$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel$getUserInfo$1 r2 = (com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel$getUserInfo$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel$getUserInfo$1 r2 = new com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel$getUserInfo$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r4 == 0) goto L_0x0076
            if (r4 == r9) goto L_0x0063
            if (r4 == r7) goto L_0x0052
            if (r4 != r6) goto L_0x004a
            int r3 = r2.I$0
            java.lang.Object r4 = r2.L$2
            kotlin.jvm.internal.Ref$BooleanRef r4 = (kotlin.jvm.internal.Ref.BooleanRef) r4
            java.lang.Object r5 = r2.L$1
            kotlin.jvm.internal.Ref$BooleanRef r5 = (kotlin.jvm.internal.Ref.BooleanRef) r5
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel r2 = (com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x0148
        L_0x004a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0052:
            java.lang.Object r4 = r2.L$1
            java.lang.Object r7 = r2.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel r7 = (com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel) r7
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00ee
        L_0x0063:
            java.lang.Object r4 = r2.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel r4 = (com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel) r4
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            r16 = r4
            r4 = r1
            r1 = r16
            goto L_0x009e
        L_0x0076:
            kotlin.C11661u0.m45747n(r1)
            com.carrefour.fid.android.domain.interactors.user.e r1 = r0.f33307b
            com.carrefour.fid.android.domain.interactors.user.e$d r4 = new com.carrefour.fid.android.domain.interactors.user.e$d
            java.lang.String r10 = r18.mo31563k()
            java.lang.Long r11 = r18.mo31567o()
            if (r11 == 0) goto L_0x008c
            long r11 = r11.longValue()
            goto L_0x008e
        L_0x008c:
            r11 = 0
        L_0x008e:
            r4.<init>(r10, r11)
            r2.L$0 = r0
            r2.label = r9
            java.lang.Object r1 = r1.m172966invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x009c
            return r3
        L_0x009c:
            r4 = r1
            r1 = r0
        L_0x009e:
            java.lang.Throwable r10 = kotlin.Result.m38705e(r4)
            if (r10 == 0) goto L_0x00c2
            com.carrefour.fid.android.shared.base.u$d r2 = r1.getCurrentState()
            r3 = r2
            com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$b r3 = (com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.C13706a.C13711b) r3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$b r2 = com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.C13706a.C13711b.m58578i(r3, r4, r5, r6, r7, r8)
            r1.publishState(r2)
            com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$c$b r2 = new com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$c$b
            r2.<init>(r10)
            r1.emitEvent(r2)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x00c2:
            boolean r10 = kotlin.Result.m38709i(r4)
            if (r10 == 0) goto L_0x00ca
            r10 = r5
            goto L_0x00cb
        L_0x00ca:
            r10 = r4
        L_0x00cb:
            com.carrefour.fid.android.domain.models.account.AccountInfo r10 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r10
            if (r10 == 0) goto L_0x0108
            java.util.List r10 = r10.mo116669w()
            if (r10 == 0) goto L_0x0108
            com.carrefour.fid.android.domain.interactors.loyalty.e r11 = r1.f33311f
            com.carrefour.fid.android.domain.interactors.loyalty.e$a r12 = new com.carrefour.fid.android.domain.interactors.loyalty.e$a
            r12.<init>(r10)
            r2.L$0 = r1
            r2.L$1 = r4
            r2.label = r7
            java.lang.Object r7 = r11.m172966invokegIAlus(r12, r2)
            if (r7 != r3) goto L_0x00e9
            return r3
        L_0x00e9:
            r16 = r7
            r7 = r1
            r1 = r16
        L_0x00ee:
            boolean r10 = kotlin.Result.m38710j(r1)
            if (r10 == 0) goto L_0x0104
            r10 = r1
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0104
            com.carrefour.fid.android.tracking.a r10 = r7.f33310e
            com.carrefour.fid.android.tracking.UserTag r11 = com.carrefour.fid.android.tracking.UserTag.LoyaltyCard
            r10.mo32666a(r11)
        L_0x0104:
            kotlin.Result.m38701a(r1)
            r1 = r7
        L_0x0108:
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            kotlin.jvm.internal.Ref$BooleanRef r10 = new kotlin.jvm.internal.Ref$BooleanRef
            r10.<init>()
            boolean r11 = kotlin.Result.m38709i(r4)
            if (r11 == 0) goto L_0x0119
            goto L_0x011a
        L_0x0119:
            r5 = r4
        L_0x011a:
            com.carrefour.fid.android.domain.models.account.AccountInfo r5 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r5
            if (r5 == 0) goto L_0x012c
            java.util.List r4 = r5.mo116669w()
            if (r4 == 0) goto L_0x012c
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r9
            goto L_0x012d
        L_0x012c:
            r4 = r8
        L_0x012d:
            com.carrefour.fid.android.domain.interactors.consent.a r5 = r1.f33308c
            r2.L$0 = r1
            r2.L$1 = r7
            r2.L$2 = r10
            r2.I$0 = r4
            r2.label = r6
            java.lang.Object r2 = r5.m172965invokeIoAF18A(r2)
            if (r2 != r3) goto L_0x0140
            return r3
        L_0x0140:
            r3 = r4
            r5 = r7
            r4 = r10
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x0148:
            boolean r6 = kotlin.Result.m38710j(r1)
            if (r6 == 0) goto L_0x01be
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r6 = r1 instanceof java.util.Collection
            if (r6 == 0) goto L_0x0161
            r7 = r1
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0161
        L_0x015f:
            r7 = r8
            goto L_0x0187
        L_0x0161:
            java.util.Iterator r7 = r1.iterator()
        L_0x0165:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x015f
            java.lang.Object r10 = r7.next()
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r10 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r10
            com.carrefour.fid.android.domain.models.consent.ConsentName r11 = r10.mo117326h()
            com.carrefour.fid.android.domain.models.consent.ConsentName r12 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING
            if (r11 != r12) goto L_0x0183
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r10 = r10.mo117324f()
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r11 = com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.ACCEPTED
            if (r10 != r11) goto L_0x0183
            r10 = r9
            goto L_0x0184
        L_0x0183:
            r10 = r8
        L_0x0184:
            if (r10 == 0) goto L_0x0165
            r7 = r9
        L_0x0187:
            r5.element = r7
            if (r6 == 0) goto L_0x0196
            r6 = r1
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0196
        L_0x0194:
            r1 = r8
            goto L_0x01bc
        L_0x0196:
            java.util.Iterator r1 = r1.iterator()
        L_0x019a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0194
            java.lang.Object r6 = r1.next()
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r6 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r6
            com.carrefour.fid.android.domain.models.consent.ConsentName r7 = r6.mo117326h()
            com.carrefour.fid.android.domain.models.consent.ConsentName r10 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING
            if (r7 != r10) goto L_0x01b8
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r6 = r6.mo117324f()
            com.carrefour.fid.android.domain.models.consent.ChoiceOptIn r7 = com.carrefour.fid.android.domain.models.consent.ChoiceOptIn.ACCEPTED
            if (r6 != r7) goto L_0x01b8
            r6 = r9
            goto L_0x01b9
        L_0x01b8:
            r6 = r8
        L_0x01b9:
            if (r6 == 0) goto L_0x019a
            r1 = r9
        L_0x01bc:
            r4.element = r1
        L_0x01be:
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r10 = r1
            com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$b r10 = (com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.C13706a.C13711b) r10
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$b r1 = com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.C13706a.C13711b.m58578i(r10, r11, r12, r13, r14, r15)
            r2.publishState(r1)
            com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$c$a r1 = new com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$c$a
            boolean r5 = r5.element
            boolean r4 = r4.element
            if (r3 == 0) goto L_0x01da
            r8 = r9
        L_0x01da:
            r1.<init>(r5, r4, r8)
            r2.emitEvent(r1)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel.mo32603f0(com.carrefour.fid.android.account.domain.models.LoginDomain, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: g0 */
    public Object processIntent(@C12579k C13706a.C13715d dVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (!(dVar instanceof C13706a.C13715d.C13716a)) {
            return C11079d2.f28267a;
        }
        C13706a.C13715d.C13716a aVar = (C13706a.C13715d.C13716a) dVar;
        Object i0 = mo32606i0(aVar.mo32660f(), aVar.mo32658e(), cVar);
        if (i0 == C11063b.m42612h()) {
            return i0;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: h0 */
    public final void mo32605h0(C13706a.C13707a aVar) {
        reduceAndPublishState(C13706a.f33321a.mo32610a(), aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32606i0(java.lang.String r11, java.lang.String r12, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel$signInUser$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel$signInUser$1 r0 = (com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel$signInUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel$signInUser$1 r0 = new com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel$signInUser$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r5) goto L_0x0046
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            r13.mo21858l()
            goto L_0x00da
        L_0x0035:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003d:
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel r11 = (com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel) r11
            kotlin.C11661u0.m45747n(r13)
            goto L_0x00cc
        L_0x0046:
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel r11 = (com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel) r11
            kotlin.C11661u0.m45747n(r13)
            kotlin.Result r13 = (kotlin.Result) r13
            java.lang.Object r12 = r13.mo21858l()
            goto L_0x009e
        L_0x0054:
            kotlin.C11661u0.m45747n(r13)
            boolean r13 = com.carrefour.fid.android.shared.extension.StringKt.m118925e(r11)
            if (r13 != 0) goto L_0x0068
            com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$a$b r11 = new com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$a$b
            r11.<init>(r13, r5)
            r10.mo32605h0(r11)
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        L_0x0068:
            int r13 = r12.length()
            r2 = 0
            if (r13 != 0) goto L_0x0071
            r13 = r5
            goto L_0x0072
        L_0x0071:
            r13 = r2
        L_0x0072:
            if (r13 == 0) goto L_0x007f
            com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$a$b r11 = new com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$a$b
            r11.<init>(r5, r2)
            r10.mo32605h0(r11)
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        L_0x007f:
            com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$a$c r13 = new com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$a$c
            r13.<init>(r5, r5, r5)
            r10.mo32605h0(r13)
            com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase r13 = r10.f33306a
            com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase$a r2 = new com.carrefour.fid.android.account.domain.interactors.login.GetLoginUseCase$a
            java.lang.String r11 = com.carrefour.fid.android.shared.extension.StringKt.m118930j(r11)
            r2.<init>(r11, r12)
            r0.L$0 = r10
            r0.label = r5
            java.lang.Object r12 = r13.m172734invokegIAlus(r2, r0)
            if (r12 != r1) goto L_0x009d
            return r1
        L_0x009d:
            r11 = r10
        L_0x009e:
            java.lang.Throwable r13 = kotlin.Result.m38705e(r12)
            if (r13 != 0) goto L_0x00b1
            com.carrefour.fid.android.account.domain.models.LoginDomain r12 = (com.carrefour.fid.android.account.domain.models.LoginDomain) r12
            r0.L$0 = r11
            r0.label = r4
            java.lang.Object r12 = r11.mo32603f0(r12, r0)
            if (r12 != r1) goto L_0x00cc
            return r1
        L_0x00b1:
            com.carrefour.fid.android.shared.base.u$d r12 = r11.getCurrentState()
            r4 = r12
            com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$b r4 = (com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.C13706a.C13711b) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$b r12 = com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.C13706a.C13711b.m58578i(r4, r5, r6, r7, r8, r9)
            r11.publishState(r12)
            com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$c$b r12 = new com.carrefour.fid.android.account.presentation.viewmodels.signin.mvi.a$c$b
            r12.<init>(r13)
            r11.emitEvent(r12)
        L_0x00cc:
            com.carrefour.fid.android.domain.interactors.basket.n r11 = r11.f33309d
            r12 = 0
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r11 = r11.m172965invokeIoAF18A(r0)
            if (r11 != r1) goto L_0x00da
            return r1
        L_0x00da:
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.signin.SignInViewModel.mo32606i0(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: n */
    public void mo31581n(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "errorType");
        this.f33312g.mo31581n(str);
    }

    public void sendScreenView() {
        this.f33312g.sendScreenView();
    }

    /* renamed from: x */
    public void mo31583x(boolean z) {
        this.f33312g.mo31583x(z);
    }
}
