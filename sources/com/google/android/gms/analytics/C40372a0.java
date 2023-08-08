package com.google.android.gms.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.gtm.C41606u;
import com.google.android.gms.internal.gtm.C41611u4;
import com.google.android.gms.internal.gtm.C41726z;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

@SuppressLint({"StaticFieldLeak"})
@C40974d0
/* renamed from: com.google.android.gms.analytics.a0 */
public final class C40372a0 {

    /* renamed from: g */
    public static volatile C40372a0 f102900g;

    /* renamed from: a */
    public final Context f102901a;

    /* renamed from: b */
    public final List<C40374b0> f102902b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final C40404p f102903c = new C40404p();

    /* renamed from: d */
    public final C40411w f102904d = new C40411w(this);

    /* renamed from: e */
    public volatile C41606u f102905e;

    /* renamed from: f */
    public Thread.UncaughtExceptionHandler f102906f;

    @C40974d0
    public C40372a0(Context context) {
        Context applicationContext = context.getApplicationContext();
        C40843u.m166202l(applicationContext);
        this.f102901a = applicationContext;
    }

    /* renamed from: b */
    public static C40372a0 m164212b(Context context) {
        C40843u.m166202l(context);
        if (f102900g == null) {
            synchronized (C40372a0.class) {
                if (f102900g == null) {
                    f102900g = new C40372a0(context);
                }
            }
        }
        return f102900g;
    }

    /* renamed from: h */
    public static void m164215h() {
        if (!(Thread.currentThread() instanceof C40414z)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: a */
    public final Context mo133258a() {
        return this.f102901a;
    }

    /* renamed from: c */
    public final C41606u mo133259c() {
        if (this.f102905e == null) {
            synchronized (this) {
                if (this.f102905e == null) {
                    C41606u uVar = new C41606u();
                    PackageManager packageManager = this.f102901a.getPackageManager();
                    String packageName = this.f102901a.getPackageName();
                    uVar.mo135886j(packageName);
                    uVar.mo135887k(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.f102901a.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        String valueOf = String.valueOf(packageName);
                        if (valueOf.length() != 0) {
                            "Error retrieving package info: appName set to ".concat(valueOf);
                        }
                    }
                    uVar.mo135888l(packageName);
                    uVar.mo135889m(str);
                    this.f102905e = uVar;
                }
            }
        }
        return this.f102905e;
    }

    /* renamed from: d */
    public final C41726z mo133260d() {
        DisplayMetrics displayMetrics = this.f102901a.getResources().getDisplayMetrics();
        C41726z zVar = new C41726z();
        zVar.mo136116f(C41611u4.m168468d(Locale.getDefault()));
        zVar.f105316b = displayMetrics.widthPixels;
        zVar.f105317c = displayMetrics.heightPixels;
        return zVar;
    }

    /* renamed from: g */
    public final <V> Future<V> mo133261g(Callable<V> callable) {
        C40843u.m166202l(callable);
        if (!(Thread.currentThread() instanceof C40414z)) {
            return this.f102904d.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    /* renamed from: i */
    public final void mo133262i(Runnable runnable) {
        C40843u.m166202l(runnable);
        this.f102904d.submit(runnable);
    }

    /* renamed from: j */
    public final void mo133263j(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f102906f = uncaughtExceptionHandler;
    }

    /* renamed from: k */
    public final void mo133264k(C40405q qVar) {
        if (qVar.mo133441l()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (!qVar.mo133442m()) {
            C40405q qVar2 = new C40405q(qVar);
            qVar2.mo133438i();
            this.f102904d.execute(new C40409u(this, qVar2));
        } else {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
    }
}
