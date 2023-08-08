package com.carrefour.fid.android.account.presentation.viewmodels.account;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.core.util.C13169a;
import com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13310w;
import com.carrefour.fid.android.account.presentation.analytics.C13311x;
import com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11945o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001b\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\t\u0010\u0006\u001a\u00020\u0005H\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0001J\u001b\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000bH\u0002R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/viewmodels/account/UpdateUserPasswordViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserPassword$b;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserPassword$c;", "Lcom/carrefour/fid/android/account/presentation/analytics/w;", "Lkotlin/d2;", "sendScreenView", "a", "intent", "l0", "(Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserPassword$c;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "oldPassword", "newPassword", "m0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "password", "n0", "(Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "o0", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserPassword$b$d;", "vld", "p0", "(Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserPassword$b$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "j0", "k0", "Lcom/carrefour/fid/android/account/domain/interactors/user/UpdateUserPasswordUseCase;", "Lcom/carrefour/fid/android/account/domain/interactors/user/UpdateUserPasswordUseCase;", "i0", "()Lcom/carrefour/fid/android/account/domain/interactors/user/UpdateUserPasswordUseCase;", "updateUserPasswordUseCase", "Lkotlinx/coroutines/flow/i;", "c", "Lkotlinx/coroutines/flow/i;", "_passwordValidation", "h0", "()Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserPassword$b$d;", "passwordValidation", "Lcom/carrefour/fid/android/account/presentation/analytics/x;", "analytics", "<init>", "(Lcom/carrefour/fid/android/account/domain/interactors/user/UpdateUserPasswordUseCase;Lcom/carrefour/fid/android/account/presentation/analytics/x;)V", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class UpdateUserPasswordViewModel extends BaseMVIViewModel<UpdateUserPassword.C13615b, UpdateUserPassword.C13620c> implements C13310w {
    @C12579k

    /* renamed from: a */
    public final UpdateUserPasswordUseCase f33084a;

    /* renamed from: b */
    public final /* synthetic */ C13311x f33085b;
    @C12579k

    /* renamed from: c */
    public final C11911i<UpdateUserPassword.C13615b.C13619d> f33086c = C11945o.m47609a(1, 0, BufferOverflow.DROP_OLDEST);

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel$a */
    public /* synthetic */ class C13571a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$Password[] r0 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword.Password.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$Password r1 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword.Password.NEW     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$Password r1 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword.Password.OLD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel.C13571a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public UpdateUserPasswordViewModel(@C12579k UpdateUserPasswordUseCase updateUserPasswordUseCase, @C12579k C13311x xVar) {
        super(UpdateUserPassword.C13615b.C13617b.f33140b, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(updateUserPasswordUseCase, "updateUserPasswordUseCase");
        Intrinsics.checkNotNullParameter(xVar, "analytics");
        this.f33084a = updateUserPasswordUseCase;
        this.f33085b = xVar;
    }

    /* renamed from: a */
    public void mo31614a() {
        this.f33085b.mo31614a();
    }

    /* renamed from: h0 */
    public final UpdateUserPassword.C13615b.C13619d mo32234h0() {
        return (UpdateUserPassword.C13615b.C13619d) CollectionsKt___CollectionsKt.m40479B2(this.f33086c.mo24203d());
    }

    @C12579k
    /* renamed from: i0 */
    public final UpdateUserPasswordUseCase mo32235i0() {
        return this.f33084a;
    }

    /* renamed from: j0 */
    public final boolean mo32236j0(String str) {
        if (str.length() < 8 || C13169a.m57084e(str) < 3) {
            return false;
        }
        return true;
    }

    /* renamed from: k0 */
    public final boolean mo32237k0(String str) {
        return str.length() >= 4;
    }

    @C12580l
    /* renamed from: l0 */
    public Object processIntent(@C12579k UpdateUserPassword.C13620c cVar, @C12579k C11045c<? super C11079d2> cVar2) {
        if (cVar instanceof UpdateUserPassword.C13620c.C13622b) {
            UpdateUserPassword.C13620c.C13622b bVar = (UpdateUserPassword.C13620c.C13622b) cVar;
            int i = C13571a.$EnumSwitchMapping$0[bVar.mo32344f().ordinal()];
            if (i == 1) {
                Object n0 = mo32240n0(bVar.mo32342e(), cVar2);
                if (n0 == C11063b.m42612h()) {
                    return n0;
                }
                return C11079d2.f28267a;
            } else if (i == 2) {
                Object o0 = mo32241o0(bVar.mo32342e(), cVar2);
                if (o0 == C11063b.m42612h()) {
                    return o0;
                }
                return C11079d2.f28267a;
            }
        } else if (cVar instanceof UpdateUserPassword.C13620c.C13621a) {
            UpdateUserPassword.C13620c.C13621a aVar = (UpdateUserPassword.C13620c.C13621a) cVar;
            Object m0 = mo32239m0(aVar.mo32336f(), aVar.mo32334e(), cVar2);
            if (m0 == C11063b.m42612h()) {
                return m0;
            }
            return C11079d2.f28267a;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32239m0(java.lang.String r5, java.lang.String r6, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel$updatePassword$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel$updatePassword$1 r0 = (com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel$updatePassword$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel$updatePassword$1 r0 = new com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel$updatePassword$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel r5 = (com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel) r5
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x0059
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$b$c r7 = new com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$b$c
            r7.<init>(r3)
            r4.publishState(r7)
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase r7 = r4.f33084a
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase$a r2 = new com.carrefour.fid.android.account.domain.interactors.user.UpdateUserPasswordUseCase$a
            r2.<init>(r5, r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r7.m172744invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r5 = r4
        L_0x0059:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r6)
            if (r7 != 0) goto L_0x006d
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            r5.mo31614a()
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$a$b r6 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword.C13612a.C13614b.f33138a
            r5.emitEvent(r6)
            goto L_0x007e
        L_0x006d:
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$a$a r6 = new com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$a$a
            r6.<init>(r7)
            r5.emitEvent(r6)
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$b$c r6 = new com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$b$c
            r7 = 0
            r6.<init>(r7)
            r5.publishState(r6)
        L_0x007e:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel.mo32239m0(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: n0 */
    public final Object mo32240n0(String str, C11045c<? super C11079d2> cVar) {
        UpdateUserPassword.C13615b.C13619d dVar;
        UpdateUserPassword.C13615b.C13619d h0 = mo32234h0();
        if (h0 == null || (dVar = UpdateUserPassword.C13615b.C13619d.m58278i(h0, mo32236j0(str), false, C13169a.m57085f(str), 2, (Object) null)) == null) {
            dVar = new UpdateUserPassword.C13615b.C13619d(mo32236j0(str), false, C13169a.m57085f(str), 2, (DefaultConstructorMarker) null);
        }
        Object p0 = mo32242p0(dVar, cVar);
        if (p0 == C11063b.m42612h()) {
            return p0;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: o0 */
    public final Object mo32241o0(String str, C11045c<? super C11079d2> cVar) {
        UpdateUserPassword.C13615b.C13619d dVar;
        UpdateUserPassword.C13615b.C13619d h0 = mo32234h0();
        if (h0 == null || (dVar = UpdateUserPassword.C13615b.C13619d.m58278i(h0, false, mo32237k0(str), (Set) null, 5, (Object) null)) == null) {
            dVar = new UpdateUserPassword.C13615b.C13619d(false, mo32237k0(str), (Set) null, 5, (DefaultConstructorMarker) null);
        }
        Object p0 = mo32242p0(dVar, cVar);
        if (p0 == C11063b.m42612h()) {
            return p0;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32242p0(com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword.C13615b.C13619d r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel$validatePassword$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel$validatePassword$1 r0 = (com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel$validatePassword$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel$validatePassword$1 r0 = new com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel$validatePassword$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.L$1
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$b$d r5 = (com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword.C13615b.C13619d) r5
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel r0 = (com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel) r0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            kotlin.C11661u0.m45747n(r6)
            kotlinx.coroutines.flow.i<com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$b$d> r6 = r4.f33086c
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.emit(r5, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            r0.publishState(r5)
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserPasswordViewModel.mo32242p0(com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserPassword$b$d, kotlin.coroutines.c):java.lang.Object");
    }

    public void sendScreenView() {
        this.f33085b.sendScreenView();
    }
}
