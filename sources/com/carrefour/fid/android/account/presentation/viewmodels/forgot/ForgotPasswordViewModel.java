package com.carrefour.fid.android.account.presentation.viewmodels.forgot;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.domain.interactors.forgot.ForgotPasswordUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13297j;
import com.carrefour.fid.android.account.presentation.analytics.C13298k;
import com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.C13693a;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0006\u001a\u00020\u0005H\u0001J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001J\u001b\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/viewmodels/forgot/ForgotPasswordViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/forgot/mvi/a$a;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/forgot/mvi/a$c;", "Lcom/carrefour/fid/android/account/presentation/analytics/j;", "Lkotlin/d2;", "sendScreenView", "", "valueEventLabel", "R", "intent", "f0", "(Lcom/carrefour/fid/android/account/presentation/viewmodels/forgot/mvi/a$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "email", "e0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/account/domain/interactors/forgot/ForgotPasswordUseCase;", "a", "Lcom/carrefour/fid/android/account/domain/interactors/forgot/ForgotPasswordUseCase;", "forgotPasswordUseCase", "Lcom/carrefour/fid/android/account/presentation/analytics/k;", "analytics", "<init>", "(Lcom/carrefour/fid/android/account/domain/interactors/forgot/ForgotPasswordUseCase;Lcom/carrefour/fid/android/account/presentation/analytics/k;)V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
public final class ForgotPasswordViewModel extends BaseMVIViewModel<C13693a.C13694a, C13693a.C13698c> implements C13297j {
    @C12579k

    /* renamed from: a */
    public final ForgotPasswordUseCase f33290a;

    /* renamed from: b */
    public final /* synthetic */ C13298k f33291b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public ForgotPasswordViewModel(@C12579k ForgotPasswordUseCase forgotPasswordUseCase, @C12579k C13298k kVar) {
        super(new C13693a.C13694a(false, 1, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(forgotPasswordUseCase, "forgotPasswordUseCase");
        Intrinsics.checkNotNullParameter(kVar, "analytics");
        this.f33290a = forgotPasswordUseCase;
        this.f33291b = kVar;
    }

    /* renamed from: R */
    public void mo31599R(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "valueEventLabel");
        this.f33291b.mo31599R(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32580e0(java.lang.String r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.presentation.viewmodels.forgot.ForgotPasswordViewModel$forgotPassword$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.presentation.viewmodels.forgot.ForgotPasswordViewModel$forgotPassword$1 r0 = (com.carrefour.fid.android.account.presentation.viewmodels.forgot.ForgotPasswordViewModel$forgotPassword$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.presentation.viewmodels.forgot.ForgotPasswordViewModel$forgotPassword$1 r0 = new com.carrefour.fid.android.account.presentation.viewmodels.forgot.ForgotPasswordViewModel$forgotPassword$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.forgot.ForgotPasswordViewModel r5 = (com.carrefour.fid.android.account.presentation.viewmodels.forgot.ForgotPasswordViewModel) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x005d
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.shared.base.u$d r6 = r4.getCurrentState()
            com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$a r6 = (com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.C13693a.C13694a) r6
            com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$a r6 = r6.mo32587f(r3)
            r4.publishState(r6)
            com.carrefour.fid.android.account.domain.interactors.forgot.ForgotPasswordUseCase r6 = r4.f33290a
            java.lang.String r5 = com.carrefour.fid.android.account.domain.interactors.forgot.ForgotPasswordUseCase.C13259a.m57440b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.mo31458a(r5, r0)
            if (r6 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r5 = r4
        L_0x005d:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r6)
            r1 = 0
            if (r0 != 0) goto L_0x007c
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            com.carrefour.fid.android.shared.base.u$d r6 = r5.getCurrentState()
            com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$a r6 = (com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.C13693a.C13694a) r6
            com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$a r6 = r6.mo32587f(r1)
            r5.publishState(r6)
            com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$b$b r6 = com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.C13693a.C13695b.C13697b.f33301a
            r5.emitEvent(r6)
            goto L_0x0091
        L_0x007c:
            com.carrefour.fid.android.shared.base.u$d r6 = r5.getCurrentState()
            com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$a r6 = (com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.C13693a.C13694a) r6
            com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$a r6 = r6.mo32587f(r1)
            r5.publishState(r6)
            com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$b$a r6 = new com.carrefour.fid.android.account.presentation.viewmodels.forgot.mvi.a$b$a
            r6.<init>(r0)
            r5.emitEvent(r6)
        L_0x0091:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.forgot.ForgotPasswordViewModel.mo32580e0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: f0 */
    public Object processIntent(@C12579k C13693a.C13698c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (!(cVar instanceof C13693a.C13698c.C13699a)) {
            return C11079d2.f28267a;
        }
        Object e0 = mo32580e0(((C13693a.C13698c.C13699a) cVar).mo32599d(), cVar2);
        if (e0 == C11063b.m42612h()) {
            return e0;
        }
        return C11079d2.f28267a;
    }

    public void sendScreenView() {
        this.f33291b.sendScreenView();
    }
}
