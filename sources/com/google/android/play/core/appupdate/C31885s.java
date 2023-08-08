package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.play.core.common.C32015b;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.internal.C32079p1;
import com.google.android.play.core.internal.C32084r0;
import com.google.android.play.core.internal.C32092u;
import com.google.android.play.core.splitcompat.C32150r;
import com.google.android.play.core.tasks.C32227d;
import com.google.android.play.core.tasks.C32229f;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.appupdate.s */
public final class C31885s {

    /* renamed from: e */
    public static final C32062k f77743e = new C32062k("AppUpdateService");

    /* renamed from: f */
    public static final Intent f77744f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    @Nullable

    /* renamed from: a */
    public C32092u<C32079p1> f77745a;

    /* renamed from: b */
    public final String f77746b;

    /* renamed from: c */
    public final Context f77747c;

    /* renamed from: d */
    public final C31888u f77748d;

    public C31885s(Context context, C31888u uVar) {
        this.f77746b = context.getPackageName();
        this.f77747c = context;
        this.f77748d = uVar;
        if (C32084r0.m129917a(context)) {
            this.f77745a = new C32092u(C32150r.m130103c(context), f77743e, "AppUpdateService", f77744f, C31879m.f77731a);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ Bundle m129311d(C31885s sVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(m129317j());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(sVar.f77747c.getPackageManager().getPackageInfo(sVar.f77747c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f77743e.mo92776b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: h */
    public static /* synthetic */ C31865a m129315h(C31885s sVar, Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        return C31865a.m129249a(str, bundle2.getInt("version.code", -1), bundle2.getInt("update.availability"), bundle2.getInt("install.status", 0), bundle2.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle2.getInt("client.version.staleness")), bundle2.getInt("in.app.update.priority", 0), bundle2.getLong("bytes.downloaded"), bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), sVar.f77748d.mo92448a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"));
    }

    /* renamed from: i */
    public static <T> C32227d<T> m129316i() {
        f77743e.mo92776b("onError(%d)", -9);
        return C32229f.m130361d(new InstallException(-9));
    }

    /* renamed from: j */
    public static Bundle m129317j() {
        Bundle bundle = new Bundle();
        bundle.putAll(C32015b.m129740c("app_update"));
        bundle.putInt("playcore.version.code", 11000);
        return bundle;
    }

    /* renamed from: a */
    public final C32227d<C31865a> mo92423a(String str) {
        if (this.f77745a == null) {
            return m129316i();
        }
        f77743e.mo92778d("requestUpdateInfo(%s)", str);
        C32239p pVar = new C32239p();
        this.f77745a.mo92829a(new C31880n(this, pVar, str, pVar));
        return pVar.mo93032c();
    }

    /* renamed from: b */
    public final C32227d<Void> mo92424b(String str) {
        if (this.f77745a == null) {
            return m129316i();
        }
        f77743e.mo92778d("completeUpdate(%s)", str);
        C32239p pVar = new C32239p();
        this.f77745a.mo92829a(new C31881o(this, pVar, pVar, str));
        return pVar.mo93032c();
    }
}
