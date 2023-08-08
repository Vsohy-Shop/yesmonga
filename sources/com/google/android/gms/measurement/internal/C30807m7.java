package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.C0353k0;
import com.google.android.gms.common.util.C40974d0;

@C0353k0
@TargetApi(14)
@C40974d0
/* renamed from: com.google.android.gms.measurement.internal.m7 */
public final class C30807m7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ C30819n7 f73750a;

    public C30807m7(C30819n7 n7Var) {
        this.f73750a = n7Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065 A[Catch:{ RuntimeException -> 0x00c4, all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0 A[Catch:{ RuntimeException -> 0x00c4, all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2 A[Catch:{ RuntimeException -> 0x00c4, all -> 0x00c2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.app.Activity r9, android.os.Bundle r10) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.n7 r0 = r8.f73750a     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.u3 r0 = r0.mo86903d()     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.s3 r0 = r0.mo87493v()     // Catch:{ RuntimeException -> 0x00c4 }
            java.lang.String r1 = "onActivityCreated"
            r0.mo87463a(r1)     // Catch:{ RuntimeException -> 0x00c4 }
            android.content.Intent r0 = r9.getIntent()     // Catch:{ RuntimeException -> 0x00c4 }
            if (r0 != 0) goto L_0x0023
            com.google.android.gms.measurement.internal.n7 r0 = r8.f73750a
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a
        L_0x001b:
            com.google.android.gms.measurement.internal.c8 r0 = r0.mo87107K()
            r0.mo86924y(r9, r10)
            return
        L_0x0023:
            com.google.android.gms.internal.measurement.C42043kd.m170472b()     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.n7 r1 = r8.f73750a     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.g5 r1 = r1.f74136a     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.g r1 = r1.mo87130z()     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.g3 r2 = com.google.android.gms.measurement.internal.C30742h3.f73501H0     // Catch:{ RuntimeException -> 0x00c4 }
            r3 = 0
            boolean r1 = r1.mo87070B(r3, r2)     // Catch:{ RuntimeException -> 0x00c4 }
            if (r1 != 0) goto L_0x003d
            android.net.Uri r3 = r0.getData()     // Catch:{ RuntimeException -> 0x00c4 }
        L_0x003b:
            r4 = r3
            goto L_0x0063
        L_0x003d:
            android.net.Uri r1 = r0.getData()     // Catch:{ RuntimeException -> 0x00c4 }
            if (r1 == 0) goto L_0x004c
            boolean r2 = r1.isHierarchical()     // Catch:{ RuntimeException -> 0x00c4 }
            if (r2 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r4 = r1
            goto L_0x0063
        L_0x004c:
            android.os.Bundle r1 = r0.getExtras()     // Catch:{ RuntimeException -> 0x00c4 }
            if (r1 == 0) goto L_0x003b
            java.lang.String r2 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ RuntimeException -> 0x00c4 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RuntimeException -> 0x00c4 }
            if (r2 != 0) goto L_0x003b
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x00c4 }
            goto L_0x003b
        L_0x0063:
            if (r4 == 0) goto L_0x00bc
            boolean r1 = r4.isHierarchical()     // Catch:{ RuntimeException -> 0x00c4 }
            if (r1 != 0) goto L_0x006c
            goto L_0x00bc
        L_0x006c:
            com.google.android.gms.measurement.internal.n7 r1 = r8.f73750a     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.g5 r1 = r1.f74136a     // Catch:{ RuntimeException -> 0x00c4 }
            r1.mo87110N()     // Catch:{ RuntimeException -> 0x00c4 }
            java.lang.String r1 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ RuntimeException -> 0x00c4 }
            java.lang.String r1 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r1 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00c4 }
            if (r1 != 0) goto L_0x0095
            java.lang.String r1 = "https://www.google.com"
            boolean r1 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00c4 }
            if (r1 != 0) goto L_0x0095
            java.lang.String r1 = "android-app://com.google.appcrawler"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00c4 }
            if (r0 == 0) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            java.lang.String r0 = "auto"
            goto L_0x0097
        L_0x0095:
            java.lang.String r0 = "gs"
        L_0x0097:
            r5 = r0
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch:{ RuntimeException -> 0x00c4 }
            if (r10 != 0) goto L_0x00a2
            r0 = 1
            goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            r3 = r0
            com.google.android.gms.measurement.internal.n7 r0 = r8.f73750a     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.d5 r0 = r0.mo86904f()     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.l7 r7 = new com.google.android.gms.measurement.internal.l7     // Catch:{ RuntimeException -> 0x00c4 }
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ RuntimeException -> 0x00c4 }
            r0.mo86950z(r7)     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.n7 r0 = r8.f73750a
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a
            goto L_0x001b
        L_0x00bc:
            com.google.android.gms.measurement.internal.n7 r0 = r8.f73750a
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a
            goto L_0x001b
        L_0x00c2:
            r0 = move-exception
            goto L_0x00dc
        L_0x00c4:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n7 r1 = r8.f73750a     // Catch:{ all -> 0x00c2 }
            com.google.android.gms.measurement.internal.g5 r1 = r1.f74136a     // Catch:{ all -> 0x00c2 }
            com.google.android.gms.measurement.internal.u3 r1 = r1.mo86903d()     // Catch:{ all -> 0x00c2 }
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87489r()     // Catch:{ all -> 0x00c2 }
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.mo87464b(r2, r0)     // Catch:{ all -> 0x00c2 }
            com.google.android.gms.measurement.internal.n7 r0 = r8.f73750a
            com.google.android.gms.measurement.internal.g5 r0 = r0.f74136a
            goto L_0x001b
        L_0x00dc:
            com.google.android.gms.measurement.internal.n7 r1 = r8.f73750a
            com.google.android.gms.measurement.internal.g5 r1 = r1.f74136a
            com.google.android.gms.measurement.internal.c8 r1 = r1.mo87107K()
            r1.mo86924y(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30807m7.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f73750a.f74136a.mo87107K().mo86925z(activity);
    }

    @C0353k0
    public final void onActivityPaused(Activity activity) {
        this.f73750a.f74136a.mo87107K().mo86912A(activity);
        C30905u9 M = this.f73750a.f74136a.mo87109M();
        M.f74136a.mo86904f().mo86950z(new C30821n9(M, M.f74136a.mo86900a().mo134770c()));
    }

    @C0353k0
    public final void onActivityResumed(Activity activity) {
        C30905u9 M = this.f73750a.f74136a.mo87109M();
        M.f74136a.mo86904f().mo86950z(new C30809m9(M, M.f74136a.mo86900a().mo134770c()));
        this.f73750a.f74136a.mo87107K().mo86913B(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f73750a.f74136a.mo87107K().mo86914C(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
