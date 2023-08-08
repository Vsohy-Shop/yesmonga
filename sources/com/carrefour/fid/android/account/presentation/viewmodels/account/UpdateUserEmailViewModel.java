package com.carrefour.fid.android.account.presentation.viewmodels.account;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13304q;
import com.carrefour.fid.android.account.presentation.analytics.C13305r;
import com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.C13623a;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.extension.StringKt;
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

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0006\u001a\u00020\u0005H\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0001J\u001b\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/viewmodels/account/UpdateUserEmailViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/a$a;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/a$c;", "Lcom/carrefour/fid/android/account/presentation/analytics/q;", "Lkotlin/d2;", "sendScreenView", "a", "intent", "f0", "(Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/a$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "email", "e0", "g0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/account/domain/interactors/user/UpdateUserEmailUseCase;", "Lcom/carrefour/fid/android/account/domain/interactors/user/UpdateUserEmailUseCase;", "updateUserEmailUseCase", "Lcom/carrefour/fid/android/account/presentation/analytics/r;", "analytics", "<init>", "(Lcom/carrefour/fid/android/account/domain/interactors/user/UpdateUserEmailUseCase;Lcom/carrefour/fid/android/account/presentation/analytics/r;)V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10245a
public final class UpdateUserEmailViewModel extends BaseMVIViewModel<C13623a.C13624a, C13623a.C13628c> implements C13304q {
    @C12579k

    /* renamed from: a */
    public final UpdateUserEmailUseCase f33077a;

    /* renamed from: b */
    public final /* synthetic */ C13305r f33078b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public UpdateUserEmailViewModel(@C12579k UpdateUserEmailUseCase updateUserEmailUseCase, @C12579k C13305r rVar) {
        super(new C13623a.C13624a(false, false, 3, (DefaultConstructorMarker) null), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(updateUserEmailUseCase, "updateUserEmailUseCase");
        Intrinsics.checkNotNullParameter(rVar, "analytics");
        this.f33077a = updateUserEmailUseCase;
        this.f33078b = rVar;
    }

    /* renamed from: a */
    public void mo31608a() {
        this.f33078b.mo31608a();
    }

    /* renamed from: e0 */
    public final void mo32223e0(String str) {
        publishState(C13623a.C13624a.m58298h((C13623a.C13624a) getCurrentState(), StringKt.m118925e(str), false, 2, (Object) null));
    }

    @C12580l
    /* renamed from: f0 */
    public Object processIntent(@C12579k C13623a.C13628c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (cVar instanceof C13623a.C13628c.C13629a) {
            mo32223e0(((C13623a.C13628c.C13629a) cVar).mo32369d());
        } else if (cVar instanceof C13623a.C13628c.C13630b) {
            Object g0 = mo32225g0(((C13623a.C13628c.C13630b) cVar).mo32375d(), cVar2);
            if (g0 == C11063b.m42612h()) {
                return g0;
            }
            return C11079d2.f28267a;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32225g0(java.lang.String r7, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserEmailViewModel$saveEmail$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserEmailViewModel$saveEmail$1 r0 = (com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserEmailViewModel$saveEmail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserEmailViewModel$saveEmail$1 r0 = new com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserEmailViewModel$saveEmail$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r5) goto L_0x0039
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserEmailViewModel r0 = (com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserEmailViewModel) r0
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0072
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            kotlin.C11661u0.m45747n(r8)
            r6.mo31608a()
            boolean r8 = com.carrefour.fid.android.shared.extension.StringKt.m118925e(r7)
            if (r8 != 0) goto L_0x0050
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0050:
            com.carrefour.fid.android.shared.base.u$d r8 = r6.getCurrentState()
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$a r8 = (com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.C13623a.C13624a) r8
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$a r8 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.C13623a.C13624a.m58298h(r8, r4, r5, r5, r3)
            r6.publishState(r8)
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase r8 = r6.f33077a
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase$a r2 = new com.carrefour.fid.android.account.domain.interactors.user.UpdateUserEmailUseCase$a
            r2.<init>(r7)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r8 = r8.m172742invokegIAlus(r2, r0)
            if (r8 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r0 = r6
        L_0x0072:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r8)
            if (r1 != 0) goto L_0x0083
            kotlin.d2 r8 = (kotlin.C11079d2) r8
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$b$a r8 = new com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$b$a
            r8.<init>(r7)
            r0.emitEvent(r8)
            goto L_0x0098
        L_0x0083:
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$b$b r7 = new com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$b$b
            r7.<init>(r1)
            r0.emitEvent(r7)
            com.carrefour.fid.android.shared.base.u$d r7 = r0.getCurrentState()
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$a r7 = (com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.C13623a.C13624a) r7
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.a$a r7 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.C13623a.C13624a.m58298h(r7, r4, r4, r5, r3)
            r0.publishState(r7)
        L_0x0098:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserEmailViewModel.mo32225g0(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public void sendScreenView() {
        this.f33078b.sendScreenView();
    }
}
