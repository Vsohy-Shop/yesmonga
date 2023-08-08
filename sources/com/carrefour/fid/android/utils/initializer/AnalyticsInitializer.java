package com.carrefour.fid.android.utils.initializer;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.app.C17180n4;
import androidx.startup.C20496b;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.core.p056di.providers.C36293a;
import com.carrefour.fid.android.domain.interactors.service.physicalstore.C37832c;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.shared.constant.C28564m1;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.carrefour.fid.android.shared.p045di.annotation.C28659c;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bL\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00070\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0002J\u0013\u0010\u000b\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002R2\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011`\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u001f\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010'\u001a\u00020 8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u0002078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b2\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010K\u001a\u00020E8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b@\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, mo22516d2 = {"Lcom/carrefour/fid/android/utils/initializer/AnalyticsInitializer;", "Landroidx/startup/b;", "Lkotlin/d2;", "Landroid/content/Context;", "context", "e", "", "Ljava/lang/Class;", "dependencies", "Lkotlinx/coroutines/c2;", "n", "p", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/domain/models/service/models/l;", "store", "o", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "mapPermanentData", "Lkotlinx/coroutines/o0;", "b", "Lkotlinx/coroutines/o0;", "i", "()Lkotlinx/coroutines/o0;", "t", "(Lkotlinx/coroutines/o0;)V", "getAppScope$annotations", "()V", "appScope", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "c", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "g", "()Lcom/carrefour/fid/android/analytics/data/analytics/a;", "r", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "analyticManager", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "d", "Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "k", "()Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;", "u", "(Lcom/carrefour/fid/android/domain/interactors/service/physicalstore/c;)V", "getFavoritePhysicalStoreUseCase", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "f", "()Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "q", "(Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;)V", "accountRepository", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "l", "()Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;", "v", "(Lcom/carrefour/fid/android/account/data/repositories/LoginRepository;)V", "loginRepository", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "h", "()Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;", "s", "(Lcom/carrefour/fid/android/shared/util/environment/AppEnvironment;)V", "appEnvironment", "Landroidx/core/app/n4;", "Landroidx/core/app/n4;", "m", "()Landroidx/core/app/n4;", "w", "(Landroidx/core/app/n4;)V", "notificationManager", "<init>", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class AnalyticsInitializer implements C20496b<C11079d2> {

    /* renamed from: i */
    public static final int f58166i = 8;
    @C12579k

    /* renamed from: a */
    public HashMap<String, String> f58167a = new HashMap<>();
    @Inject

    /* renamed from: b */
    public C12074o0 f58168b;
    @Inject

    /* renamed from: c */
    public C13783a f58169c;
    @Inject

    /* renamed from: d */
    public C37832c f58170d;
    @Inject

    /* renamed from: e */
    public AccountRepository f58171e;
    @Inject

    /* renamed from: f */
    public LoginRepository f58172f;
    @Inject

    /* renamed from: g */
    public AppEnvironment f58173g;
    @Inject

    /* renamed from: h */
    public C17180n4 f58174h;

    @C28659c
    /* renamed from: j */
    public static /* synthetic */ void m102810j() {
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo55933a(Context context) {
        mo67084e(context);
        return C11079d2.f28267a;
    }

    @C12579k
    public List<Class<? extends C20496b<?>>> dependencies() {
        return new ArrayList();
    }

    /* renamed from: e */
    public void mo67084e(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C36293a.f89629a.mo108299a(context).mo33967e(this);
        mo67092n();
    }

    @C12579k
    /* renamed from: f */
    public final AccountRepository mo67085f() {
        AccountRepository accountRepository = this.f58171e;
        if (accountRepository != null) {
            return accountRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountRepository");
        return null;
    }

    @C12579k
    /* renamed from: g */
    public final C13783a mo67086g() {
        C13783a aVar = this.f58169c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticManager");
        return null;
    }

    @C12579k
    /* renamed from: h */
    public final AppEnvironment mo67087h() {
        AppEnvironment appEnvironment = this.f58173g;
        if (appEnvironment != null) {
            return appEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appEnvironment");
        return null;
    }

    @C12579k
    /* renamed from: i */
    public final C12074o0 mo67088i() {
        C12074o0 o0Var = this.f58168b;
        if (o0Var != null) {
            return o0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appScope");
        return null;
    }

    @C12579k
    /* renamed from: k */
    public final C37832c mo67089k() {
        C37832c cVar = this.f58170d;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getFavoritePhysicalStoreUseCase");
        return null;
    }

    @C12579k
    /* renamed from: l */
    public final LoginRepository mo67090l() {
        LoginRepository loginRepository = this.f58172f;
        if (loginRepository != null) {
            return loginRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginRepository");
        return null;
    }

    @C12579k
    /* renamed from: m */
    public final C17180n4 mo67091m() {
        C17180n4 n4Var = this.f58174h;
        if (n4Var != null) {
            return n4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
        return null;
    }

    /* renamed from: n */
    public final C11723c2 mo67092n() {
        return C12038j.m48061f(mo67088i(), (CoroutineContext) null, (CoroutineStart) null, new AnalyticsInitializer$initPermanentData$1(this, (C11045c<? super AnalyticsInitializer$initPermanentData$1>) null), 3, (Object) null);
    }

    /* renamed from: o */
    public final void mo67093o(C38163l lVar) {
        this.f58167a.put(C28564m1.f69579m, StringKt.m118908Q(lVar.mo119357A()));
        this.f58167a.put(C28564m1.f69577k, lVar.mo119393w());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67094p(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.utils.initializer.AnalyticsInitializer$initPermanentDataUserLogged$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.utils.initializer.AnalyticsInitializer$initPermanentDataUserLogged$1 r0 = (com.carrefour.fid.android.utils.initializer.AnalyticsInitializer$initPermanentDataUserLogged$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utils.initializer.AnalyticsInitializer$initPermanentDataUserLogged$1 r0 = new com.carrefour.fid.android.utils.initializer.AnalyticsInitializer$initPermanentDataUserLogged$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            java.lang.String r3 = "1"
            java.lang.String r4 = "0"
            r5 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r5) goto L_0x0031
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.utils.initializer.AnalyticsInitializer r0 = (com.carrefour.fid.android.utils.initializer.AnalyticsInitializer) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x007f
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.account.data.repositories.LoginRepository r8 = r7.mo67090l()
            com.carrefour.fid.android.account.data.entities.AuthStateResponse r8 = r8.mo31354f()
            boolean r8 = com.carrefour.fid.android.account.data.entities.extentions.C13181d.m57146e(r8)
            java.lang.String r2 = "user_login"
            if (r8 == 0) goto L_0x00a0
            java.util.HashMap<java.lang.String, java.lang.String> r8 = r7.f58167a
            r8.put(r2, r3)
            java.util.HashMap<java.lang.String, java.lang.String> r8 = r7.f58167a
            com.carrefour.fid.android.account.data.repositories.LoginRepository r2 = r7.mo67090l()
            java.lang.String r2 = r2.mo31352d()
            java.lang.String r6 = "user_ID"
            r8.put(r6, r2)
            java.util.HashMap<java.lang.String, java.lang.String> r8 = r7.f58167a
            com.carrefour.fid.android.account.data.repositories.LoginRepository r2 = r7.mo67090l()
            java.lang.String r2 = r2.mo31353e()
            java.lang.String r6 = "user_wlecID"
            r8.put(r6, r2)
            com.carrefour.fid.android.account.data.repositories.AccountRepository r8 = r7.mo67085f()
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.mo31329n(r0)
            if (r8 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r0 = r7
        L_0x007f:
            com.carrefour.fid.android.domain.models.account.AccountInfo r8 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r8
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f58167a
            if (r8 == 0) goto L_0x008a
            java.util.List r8 = r8.mo116669w()
            goto L_0x008b
        L_0x008a:
            r8 = 0
        L_0x008b:
            java.util.Collection r8 = (java.util.Collection) r8
            if (r8 == 0) goto L_0x0097
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r5 = 0
        L_0x0097:
            if (r5 == 0) goto L_0x009a
            r3 = r4
        L_0x009a:
            java.lang.String r8 = "user_fid"
            r0.put(r8, r3)
            goto L_0x00a5
        L_0x00a0:
            java.util.HashMap<java.lang.String, java.lang.String> r8 = r7.f58167a
            r8.put(r2, r4)
        L_0x00a5:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utils.initializer.AnalyticsInitializer.mo67094p(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: q */
    public final void mo67095q(@C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(accountRepository, "<set-?>");
        this.f58171e = accountRepository;
    }

    /* renamed from: r */
    public final void mo67096r(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f58169c = aVar;
    }

    /* renamed from: s */
    public final void mo67097s(@C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(appEnvironment, "<set-?>");
        this.f58173g = appEnvironment;
    }

    /* renamed from: t */
    public final void mo67098t(@C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<set-?>");
        this.f58168b = o0Var;
    }

    /* renamed from: u */
    public final void mo67099u(@C12579k C37832c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f58170d = cVar;
    }

    /* renamed from: v */
    public final void mo67100v(@C12579k LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "<set-?>");
        this.f58172f = loginRepository;
    }

    /* renamed from: w */
    public final void mo67101w(@C12579k C17180n4 n4Var) {
        Intrinsics.checkNotNullParameter(n4Var, "<set-?>");
        this.f58174h = n4Var;
    }
}
