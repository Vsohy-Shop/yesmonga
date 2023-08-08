package com.carrefour.fid.android.account.presentation.analytics;

import android.content.Context;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.tracking.C28994a;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class SignInAnalyticsInterfaceDelegate implements C13302o {
    @C12579k

    /* renamed from: a */
    public final Context f32676a;
    @C12579k

    /* renamed from: b */
    public final C28994a f32677b;
    @C12579k

    /* renamed from: c */
    public final C13814a f32678c;
    @C12579k

    /* renamed from: d */
    public final C13783a f32679d;
    @C12579k

    /* renamed from: e */
    public final LoginRepository f32680e;
    @C12579k

    /* renamed from: f */
    public final AccountRepository f32681f;

    @Inject
    public SignInAnalyticsInterfaceDelegate(@C10255b @C12579k Context context, @C12579k C28994a aVar, @C12579k C13814a aVar2, @C12579k C13783a aVar3, @C12579k LoginRepository loginRepository, @C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "audienceTrackingAdapter");
        Intrinsics.checkNotNullParameter(aVar2, "appsFlyerTrackingManager");
        Intrinsics.checkNotNullParameter(aVar3, "analyticManager");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        this.f32676a = context;
        this.f32677b = aVar;
        this.f32678c = aVar2;
        this.f32679d = aVar3;
        this.f32680e = loginRepository;
        this.f32681f = accountRepository;
    }

    /* renamed from: D */
    public void mo31577D() {
        C28994a aVar = this.f32677b;
        aVar.mo32670e(C10975r0.m41401k(C11078d1.m42659a(C13758b.f33443e0, this.f32680e.mo31353e())));
        aVar.mo32668c(this.f32680e.mo31352d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo31578M(boolean r11, boolean r12, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.carrefour.fid.android.account.presentation.analytics.SignInAnalyticsInterfaceDelegate$tagSignInSuccess$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.carrefour.fid.android.account.presentation.analytics.SignInAnalyticsInterfaceDelegate$tagSignInSuccess$1 r0 = (com.carrefour.fid.android.account.presentation.analytics.SignInAnalyticsInterfaceDelegate$tagSignInSuccess$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.account.presentation.analytics.SignInAnalyticsInterfaceDelegate$tagSignInSuccess$1 r0 = new com.carrefour.fid.android.account.presentation.analytics.SignInAnalyticsInterfaceDelegate$tagSignInSuccess$1
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r11 = r0.L$0
            com.carrefour.fid.android.analytics.data.analytics.a r11 = (com.carrefour.fid.android.analytics.data.analytics.C13783a) r11
            kotlin.C11661u0.m45747n(r13)
            goto L_0x00d3
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            kotlin.C11661u0.m45747n(r13)
            com.carrefour.fid.android.analytics.data.analytics.a r13 = r10.f32679d
            r2 = 5
            kotlin.Pair[] r5 = new kotlin.Pair[r2]
            java.lang.String r6 = "user_login"
            java.lang.String r7 = "1"
            kotlin.Pair r6 = kotlin.C11078d1.m42659a(r6, r7)
            r5[r3] = r6
            com.carrefour.fid.android.account.data.repositories.LoginRepository r6 = r10.f32680e
            java.lang.String r6 = r6.mo31352d()
            java.lang.String r8 = "user_ID"
            kotlin.Pair r6 = kotlin.C11078d1.m42659a(r8, r6)
            r5[r4] = r6
            com.carrefour.fid.android.account.data.repositories.LoginRepository r6 = r10.f32680e
            java.lang.String r6 = r6.mo31353e()
            java.lang.String r8 = "user_wlecID"
            kotlin.Pair r6 = kotlin.C11078d1.m42659a(r8, r6)
            r8 = 2
            r5[r8] = r6
            java.lang.String r6 = "0"
            if (r11 == 0) goto L_0x006c
            r11 = r7
            goto L_0x006d
        L_0x006c:
            r11 = r6
        L_0x006d:
            java.lang.String r9 = "user_profilage"
            kotlin.Pair r11 = kotlin.C11078d1.m42659a(r9, r11)
            r9 = 3
            r5[r9] = r11
            if (r12 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r7 = r6
        L_0x007a:
            java.lang.String r11 = "user_profilagePartenaire"
            kotlin.Pair r11 = kotlin.C11078d1.m42659a(r11, r7)
            r12 = 4
            r5[r12] = r11
            java.util.Map r11 = kotlin.collections.C10977s0.m41456W(r5)
            r13.mo32708k(r11)
            com.carrefour.fid.android.analytics.data.analytics.a r11 = r10.f32679d
            kotlin.Pair[] r13 = new kotlin.Pair[r2]
            java.lang.String r2 = "hit_type"
            java.lang.String r5 = "event"
            kotlin.Pair r2 = kotlin.C11078d1.m42659a(r2, r5)
            r13[r3] = r2
            java.lang.String r2 = "screen_name"
            java.lang.String r5 = "connexion"
            kotlin.Pair r2 = kotlin.C11078d1.m42659a(r2, r5)
            r13[r4] = r2
            java.lang.String r2 = "screen_template"
            kotlin.Pair r2 = kotlin.C11078d1.m42659a(r2, r5)
            r13[r8] = r2
            java.lang.String r2 = "event_category"
            kotlin.Pair r2 = kotlin.C11078d1.m42659a(r2, r5)
            r13[r9] = r2
            java.lang.String r2 = "event_action"
            java.lang.String r5 = "ok"
            kotlin.Pair r2 = kotlin.C11078d1.m42659a(r2, r5)
            r13[r12] = r2
            java.util.Map r12 = kotlin.collections.C10977s0.m41456W(r13)
            r13 = 0
            com.carrefour.fid.android.analytics.data.analytics.C13783a.m58668o(r11, r12, r3, r8, r13)
            com.carrefour.fid.android.analytics.data.analytics.a r11 = r10.f32679d
            com.carrefour.fid.android.account.data.repositories.AccountRepository r12 = r10.f32681f
            r0.L$0 = r11
            r0.label = r4
            java.lang.Object r13 = r12.mo31328m(r0)
            if (r13 != r1) goto L_0x00d3
            return r1
        L_0x00d3:
            if (r13 == 0) goto L_0x00d6
            r3 = r4
        L_0x00d6:
            r11.mo32707j(r3)
            kotlin.d2 r11 = kotlin.C11079d2.f28267a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.presentation.analytics.SignInAnalyticsInterfaceDelegate.mo31578M(boolean, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: Y */
    public void mo31579Y() {
        C13783a.m58668o(this.f32679d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "connexion"), C11078d1.m42659a(C28526d.f68906d, "connexion"), C11078d1.m42659a(C28526d.f68933j, "me-connecter"), C11078d1.m42659a(C28526d.f68929i, "connexion")), false, 2, (Object) null);
    }

    /* renamed from: f */
    public void mo31580f() {
        C13783a.m58668o(this.f32679d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "connexion"), C11078d1.m42659a(C28526d.f68906d, "connexion"), C11078d1.m42659a(C28526d.f68933j, "creer-un-compte"), C11078d1.m42659a(C28526d.f68929i, "connexion")), false, 2, (Object) null);
    }

    /* renamed from: n */
    public void mo31581n(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "errorType");
        C13783a.m58668o(this.f32679d, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "connexion"), C11078d1.m42659a(C28526d.f68906d, "connexion"), C11078d1.m42659a(C28526d.f68933j, "ko"), C11078d1.m42659a(C28526d.f68929i, "connexion"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f32679d, "connexion", "connexion", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: x */
    public void mo31583x(boolean z) {
        C13814a aVar = this.f32678c;
        Context context = this.f32676a;
        Map j0 = C10977s0.m41469j0(C11078d1.m42659a("af_login", "Oui"));
        if (z) {
            j0.put(C13814a.f33683F0, "1");
        } else {
            j0.put(C13814a.f33683F0, "0");
        }
        C11079d2 d2Var = C11079d2.f28267a;
        aVar.mo32735i(context, "af_login", j0);
    }
}
