package com.carrefour.fid.android.account.presentation.viewmodels.account;

import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase;
import com.carrefour.fid.android.account.presentation.analytics.C13307t;
import com.carrefour.fid.android.account.presentation.analytics.C13308u;
import com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.models.account.AccountInfo;
import com.carrefour.fid.android.domain.models.account.CivilityTitle;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import dagger.hilt.android.lifecycle.C10245a;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B!\b\u0007\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\t\u0010\u0006\u001a\u00020\u0005H\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0001J\u001b\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/account/presentation/viewmodels/account/UpdateUserInfoViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserInfo$b;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserInfo$d;", "Lcom/carrefour/fid/android/account/presentation/analytics/t;", "Lkotlin/d2;", "sendScreenView", "a", "intent", "k0", "(Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserInfo$d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "j0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserInfo$d$e;", "m0", "(Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserInfo$d$e;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "firstName", "f0", "lastName", "g0", "", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserInfo$FieldError;", "name", "fieldError", "h0", "error", "i0", "Lcom/carrefour/fid/android/account/presentation/viewmodels/account/mvi/UpdateUserInfo$a;", "partialState", "l0", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/account/domain/interactors/user/UpdateUserInfoUseCase;", "b", "Lcom/carrefour/fid/android/account/domain/interactors/user/UpdateUserInfoUseCase;", "updateUserInfoUseCase", "Lcom/carrefour/fid/android/account/presentation/analytics/u;", "analytics", "<init>", "(Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/account/domain/interactors/user/UpdateUserInfoUseCase;Lcom/carrefour/fid/android/account/presentation/analytics/u;)V", "d", "account_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nUpdateUserInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateUserInfoViewModel.kt\ncom/carrefour/fid/android/account/presentation/viewmodels/account/UpdateUserInfoViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"})
public final class UpdateUserInfoViewModel extends BaseMVIViewModel<UpdateUserInfo.C13600b, UpdateUserInfo.C13605d> implements C13307t {
    @C12579k

    /* renamed from: d */
    public static final C13570a f33079d = new C13570a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f33080e = 2;
    @C12579k

    /* renamed from: a */
    public final C37878e f33081a;
    @C12579k

    /* renamed from: b */
    public final UpdateUserInfoUseCase f33082b;

    /* renamed from: c */
    public final /* synthetic */ C13308u f33083c;

    /* renamed from: com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel$a */
    public static final class C13570a {
        public /* synthetic */ C13570a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C13570a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public UpdateUserInfoViewModel(@C12579k C37878e eVar, @C12579k UpdateUserInfoUseCase updateUserInfoUseCase, @C12579k C13308u uVar) {
        super(UpdateUserInfo.C13600b.f33109e.mo32278a(), (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(updateUserInfoUseCase, "updateUserInfoUseCase");
        Intrinsics.checkNotNullParameter(uVar, "analytics");
        this.f33081a = eVar;
        this.f33082b = updateUserInfoUseCase;
        this.f33083c = uVar;
    }

    /* renamed from: a */
    public void mo31611a() {
        this.f33083c.mo31611a();
    }

    /* renamed from: f0 */
    public final void mo32226f0(String str) {
        AccountInfo k = ((UpdateUserInfo.C13600b) getCurrentState()).mo32275k();
        if (k != null) {
            mo32232l0(new UpdateUserInfo.C13596a.C13598b(AccountInfo.m155841m(k, (String) null, str, (String) null, (String) null, (CivilityTitle) null, (String) null, (List) null, (List) null, (List) null, 0, (String) null, 2045, (Object) null)));
        }
        mo32229i0(str, UpdateUserInfo.FieldError.FIRSTNAME);
    }

    /* renamed from: g0 */
    public final void mo32227g0(String str) {
        AccountInfo k = ((UpdateUserInfo.C13600b) getCurrentState()).mo32275k();
        if (k != null) {
            mo32232l0(new UpdateUserInfo.C13596a.C13598b(AccountInfo.m155841m(k, (String) null, (String) null, str, (String) null, (CivilityTitle) null, (String) null, (List) null, (List) null, (List) null, 0, (String) null, 2043, (Object) null)));
        }
        mo32229i0(str, UpdateUserInfo.FieldError.LASTNAME);
    }

    /* renamed from: h0 */
    public final Set<UpdateUserInfo.FieldError> mo32228h0(Set<? extends UpdateUserInfo.FieldError> set, String str, UpdateUserInfo.FieldError fieldError) {
        Set U5 = CollectionsKt___CollectionsKt.m40577U5(set);
        if (str.length() > 2) {
            U5.remove(fieldError);
        } else {
            U5.add(fieldError);
        }
        return CollectionsKt___CollectionsKt.m40582V5(U5);
    }

    /* renamed from: i0 */
    public final void mo32229i0(String str, UpdateUserInfo.FieldError fieldError) {
        mo32232l0(new UpdateUserInfo.C13596a.C13599c(mo32228h0(((UpdateUserInfo.C13600b) getCurrentState()).mo32276l(), str, fieldError)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32230j0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel$fetchUserInfo$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel$fetchUserInfo$1 r0 = (com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel$fetchUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel$fetchUserInfo$1 r0 = new com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel$fetchUserInfo$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel r0 = (com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel) r0
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x004e
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.user.e r5 = r4.f33081a
            com.carrefour.fid.android.domain.interactors.user.e$a r2 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.m172966invokegIAlus(r2, r0)
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r0 = r4
        L_0x004e:
            boolean r1 = kotlin.Result.m38710j(r5)
            if (r1 == 0) goto L_0x005f
            r1 = r5
            com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$a$b r2 = new com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$a$b
            r2.<init>(r1)
            r0.mo32232l0(r2)
        L_0x005f:
            java.lang.Throwable r5 = kotlin.Result.m38705e(r5)
            if (r5 == 0) goto L_0x006a
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$c$a r5 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo.C13602c.C13603a.f33115a
            r0.emitEvent(r5)
        L_0x006a:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel.mo32230j0(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: k0 */
    public Object processIntent(@C12579k UpdateUserInfo.C13605d dVar, @C12579k C11045c<? super C11079d2> cVar) {
        AccountInfo m;
        UpdateUserInfo.C13605d dVar2 = dVar;
        C11045c<? super C11079d2> cVar2 = cVar;
        if (dVar2 instanceof UpdateUserInfo.C13605d.C13606a) {
            mo32226f0(((UpdateUserInfo.C13605d.C13606a) dVar2).mo32281d());
        } else if (dVar2 instanceof UpdateUserInfo.C13605d.C13607b) {
            mo32227g0(((UpdateUserInfo.C13605d.C13607b) dVar2).mo32287d());
        } else if (Intrinsics.areEqual((Object) dVar2, (Object) UpdateUserInfo.C13605d.C13608c.f33123a)) {
            Object j0 = mo32230j0(cVar2);
            if (j0 == C11063b.m42612h()) {
                return j0;
            }
            return C11079d2.f28267a;
        } else if (dVar2 instanceof UpdateUserInfo.C13605d.C13609d) {
            AccountInfo k = ((UpdateUserInfo.C13600b) getCurrentState()).mo32275k();
            if (!(k == null || (m = AccountInfo.m155841m(k, (String) null, (String) null, (String) null, (String) null, ((UpdateUserInfo.C13605d.C13609d) dVar2).mo32293d(), (String) null, (List) null, (List) null, (List) null, 0, (String) null, 2031, (Object) null)) == null)) {
                mo32232l0(new UpdateUserInfo.C13596a.C13598b(m));
            }
        } else if (dVar2 instanceof UpdateUserInfo.C13605d.C13610e) {
            Object m0 = mo32233m0((UpdateUserInfo.C13605d.C13610e) dVar2, cVar2);
            if (m0 == C11063b.m42612h()) {
                return m0;
            }
            return C11079d2.f28267a;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: l0 */
    public final void mo32232l0(UpdateUserInfo.C13596a aVar) {
        reduceAndPublishState(UpdateUserInfo.f33100a.mo32255a(), aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo32233m0(com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo.C13605d.C13610e r22, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel$saveUser$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel$saveUser$1 r2 = (com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel$saveUser$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel$saveUser$1 r2 = new com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel$saveUser$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x0040
            if (r4 != r5) goto L_0x0038
            java.lang.Object r2 = r2.L$0
            com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel r2 = (com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel) r2
            kotlin.C11661u0.m45747n(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.mo21858l()
            goto L_0x00dd
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0040:
            kotlin.C11661u0.m45747n(r1)
            r21.mo31611a()
            com.carrefour.fid.android.shared.base.u$d r1 = r21.getCurrentState()
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$b r1 = (com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo.C13600b) r1
            com.carrefour.fid.android.domain.models.account.AccountInfo r6 = r1.mo32275k()
            if (r6 == 0) goto L_0x0078
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$a$b r1 = new com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$a$b
            r7 = 0
            java.lang.String r8 = r22.mo32303g()
            java.lang.String r9 = r22.mo32304h()
            r10 = 0
            com.carrefour.fid.android.domain.models.account.CivilityTitle r11 = r22.mo32302f()
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 2025(0x7e9, float:2.838E-42)
            r20 = 0
            com.carrefour.fid.android.domain.models.account.AccountInfo r4 = com.carrefour.fid.android.domain.models.account.AccountInfo.m155841m(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20)
            r1.<init>(r4)
            r0.mo32232l0(r1)
        L_0x0078:
            com.carrefour.fid.android.shared.base.u$d r1 = r21.getCurrentState()
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$b r1 = (com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo.C13600b) r1
            java.util.Set r1 = r1.mo32276l()
            java.lang.String r4 = r22.mo32304h()
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$FieldError r6 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo.FieldError.LASTNAME
            java.util.Set r1 = r0.mo32228h0(r1, r4, r6)
            java.lang.String r4 = r22.mo32303g()
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$FieldError r6 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo.FieldError.FIRSTNAME
            java.util.Set r1 = r0.mo32228h0(r1, r4, r6)
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x00ab
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$a$c r2 = new com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$a$c
            r2.<init>(r1)
            r0.mo32232l0(r2)
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x00ab:
            com.carrefour.fid.android.shared.base.u$d r1 = r21.getCurrentState()
            r6 = r1
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$b r6 = (com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo.C13600b) r6
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 3
            r11 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$b r1 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo.C13600b.m58239j(r6, r7, r8, r9, r10, r11)
            r0.publishState(r1)
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase r1 = r0.f33082b
            com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase$a r4 = new com.carrefour.fid.android.account.domain.interactors.user.UpdateUserInfoUseCase$a
            java.lang.String r6 = r22.mo32303g()
            java.lang.String r7 = r22.mo32304h()
            com.carrefour.fid.android.domain.models.account.CivilityTitle r8 = r22.mo32302f()
            r4.<init>(r6, r7, r8)
            r2.L$0 = r0
            r2.label = r5
            java.lang.Object r1 = r1.m172743invokegIAlus(r4, r2)
            if (r1 != r3) goto L_0x00dc
            return r3
        L_0x00dc:
            r2 = r0
        L_0x00dd:
            java.lang.Throwable r3 = kotlin.Result.m38705e(r1)
            if (r3 != 0) goto L_0x00f3
            com.carrefour.fid.android.domain.models.account.AccountInfo r1 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r1
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$a$b r3 = new com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$a$b
            r3.<init>(r1)
            r2.mo32232l0(r3)
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$c$b r1 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo.C13602c.C13604b.f33117a
            r2.emitEvent(r1)
            goto L_0x010b
        L_0x00f3:
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$c$a r1 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo.C13602c.C13603a.f33115a
            r2.emitEvent(r1)
            com.carrefour.fid.android.shared.base.u$d r1 = r2.getCurrentState()
            r3 = r1
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$b r3 = (com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo.C13600b) r3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 3
            r8 = 0
            com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$b r1 = com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo.C13600b.m58239j(r3, r4, r5, r6, r7, r8)
            r2.publishState(r1)
        L_0x010b:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.viewmodels.account.UpdateUserInfoViewModel.mo32233m0(com.carrefour.fid.android.account.presentation.viewmodels.account.mvi.UpdateUserInfo$d$e, kotlin.coroutines.c):java.lang.Object");
    }

    public void sendScreenView() {
        this.f33083c.sendScreenView();
    }
}
