package com.carrefour.fid.android.utils;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19428i0;
import androidx.lifecycle.C19475v;
import androidx.lifecycle.Lifecycle;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.domain.interactors.logm.C37695b;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37806a;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.google.android.gms.common.internal.C40852x;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11702a0;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b.\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0003H\u0007J\u0014\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\u0013\u0010\n\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002@\u0002X.¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0002\u0004\n\u0002\b\u0019¨\u00060"}, mo22516d2 = {"Lcom/carrefour/fid/android/utils/ForegroundBackgroundApplicationListener;", "Landroidx/lifecycle/v;", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "onResume", "onPause", "onDestroy", "Lkotlin/Function0;", "listener", "k", "e", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "h", "l", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "a", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "accountRepository", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "b", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/domain/interactors/logm/b;", "c", "Lcom/carrefour/fid/android/domain/interactors/logm/b;", "sendAllRemoteLogsUseCase", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "d", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "appPreferencesStorage", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/a;", "Lcom/carrefour/fid/android/domain/interactors/remoteconfig/a;", "checkAppMessageUseCase", "Lkotlinx/coroutines/a0;", "f", "Lkotlin/z;", "j", "()Lkotlinx/coroutines/a0;", "supervisorJob", "g", "Lkotlin/jvm/functions/a;", "navigationListener", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;Lcom/carrefour/fid/android/domain/interactors/logm/b;Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;Lcom/carrefour/fid/android/domain/interactors/remoteconfig/a;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ForegroundBackgroundApplicationListener implements C19475v, C12074o0 {

    /* renamed from: v */
    public static final int f58136v = 8;
    @C12579k

    /* renamed from: a */
    public final AccountRepository f58137a;
    @C12579k

    /* renamed from: b */
    public final LoyaltyPreferencesStorage f58138b;
    @C12579k

    /* renamed from: c */
    public final C37695b f58139c;
    @C12579k

    /* renamed from: d */
    public final AppPreferencesStorage f58140d;
    @C12579k

    /* renamed from: e */
    public final C37806a f58141e;
    @C12579k

    /* renamed from: f */
    public final C11677z f58142f = C10864b0.m38748c(ForegroundBackgroundApplicationListener$supervisorJob$2.f58144f);

    /* renamed from: g */
    public C11289a<C11079d2> f58143g;

    @Inject
    public ForegroundBackgroundApplicationListener(@C12579k AccountRepository accountRepository, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage, @C12579k C37695b bVar, @C12579k AppPreferencesStorage appPreferencesStorage, @C12579k C37806a aVar) {
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        Intrinsics.checkNotNullParameter(bVar, "sendAllRemoteLogsUseCase");
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "appPreferencesStorage");
        Intrinsics.checkNotNullParameter(aVar, "checkAppMessageUseCase");
        this.f58137a = accountRepository;
        this.f58138b = loyaltyPreferencesStorage;
        this.f58139c = bVar;
        this.f58140d = appPreferencesStorage;
        this.f58141e = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67058e(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.utils.C22696x1ab98191
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$checkAndClearNotSecuredLoyalTyCards$1 r0 = (com.carrefour.fid.android.utils.C22696x1ab98191) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$checkAndClearNotSecuredLoyalTyCards$1 r0 = new com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$checkAndClearNotSecuredLoyalTyCards$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0071
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener r2 = (com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener) r2
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004d
        L_0x003c:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.account.data.repositories.AccountRepository r6 = r5.f58137a
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.mo31329n(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            com.carrefour.fid.android.domain.models.account.AccountInfo r6 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r6
            r4 = 0
            if (r6 == 0) goto L_0x0057
            java.util.List r6 = r6.mo116669w()
            goto L_0x0058
        L_0x0057:
            r6 = r4
        L_0x0058:
            com.carrefour.fid.android.domain.models.account.UserCards r6 = com.carrefour.fid.android.account.domain.extension.C13242a.m57372b(r6)
            if (r6 == 0) goto L_0x0071
            boolean r6 = r6.mo116764l()
            if (r6 != 0) goto L_0x0071
            com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage r6 = r2.f58138b
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.clearLoyaltyCard(r0)
            if (r6 != r1) goto L_0x0071
            return r1
        L_0x0071:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener.mo67058e(kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    public CoroutineContext getCoroutineContext() {
        return C11768d1.m46783e().mo23706a0().mo7443Q(mo67060j());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67059h(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.utils.C22697xf4bd59c6
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$checkAppVersionNotification$1 r0 = (com.carrefour.fid.android.utils.C22697xf4bd59c6) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$checkAppVersionNotification$1 r0 = new com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$checkAppVersionNotification$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener r0 = (com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener) r0
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
            com.carrefour.fid.android.domain.interactors.remoteconfig.a r5 = r4.f58141e
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            boolean r1 = kotlin.Result.m38710j(r5)
            if (r1 == 0) goto L_0x0063
            kotlin.d2 r5 = (kotlin.C11079d2) r5
            kotlin.jvm.functions.a<kotlin.d2> r5 = r0.f58143g
            if (r5 == 0) goto L_0x0063
            if (r5 != 0) goto L_0x0060
            java.lang.String r5 = "navigationListener"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r5 = 0
        L_0x0060:
            r5.invoke()
        L_0x0063:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener.mo67059h(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: j */
    public final C11702a0 mo67060j() {
        return (C11702a0) this.f58142f.getValue();
    }

    /* renamed from: k */
    public final void mo67061k(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40852x.C40853a.f103958a);
        this.f58143g = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67062l(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$updateSession$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$updateSession$1 r0 = (com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$updateSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$updateSession$1 r0 = new com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener$updateSession$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0062
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener r2 = (com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener) r2
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004d
        L_0x003c:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r6 = r5.f58140d
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.mo108080c(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            com.carrefour.fid.android.core.datastore.a r6 = (com.carrefour.fid.android.core.datastore.C36193a) r6
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r2 = r2.f58140d
            int r6 = r6.mo108116C()
            int r6 = r6 + r4
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r2.mo108091n(r6, r0)
            if (r6 != r1) goto L_0x0062
            return r1
        L_0x0062:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utils.ForegroundBackgroundApplicationListener.mo67062l(kotlin.coroutines.c):java.lang.Object");
    }

    @C19428i0(Lifecycle.C19372Event.ON_DESTROY)
    public final void onDestroy() {
        C11723c2.C11724a.m46184b(mo67060j(), (CancellationException) null, 1, (Object) null);
    }

    @C19428i0(Lifecycle.C19372Event.ON_PAUSE)
    public final void onPause() {
        C11723c2 unused = C12038j.m48061f(this, (CoroutineContext) null, (CoroutineStart) null, new ForegroundBackgroundApplicationListener$onPause$1(this, (C11045c<? super ForegroundBackgroundApplicationListener$onPause$1>) null), 3, (Object) null);
    }

    @C19428i0(Lifecycle.C19372Event.ON_RESUME)
    public final void onResume() {
        C11723c2 unused = C12038j.m48061f(this, (CoroutineContext) null, (CoroutineStart) null, new ForegroundBackgroundApplicationListener$onResume$1(this, (C11045c<? super ForegroundBackgroundApplicationListener$onResume$1>) null), 3, (Object) null);
    }
}
