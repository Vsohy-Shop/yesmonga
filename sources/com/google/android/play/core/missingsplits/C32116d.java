package com.google.android.play.core.missingsplits;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import com.google.android.play.core.internal.C32062k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.play.core.missingsplits.d */
public final class C32116d {

    /* renamed from: c */
    public static final C32062k f78331c = new C32062k("MissingSplitsAppComponentsHelper");

    /* renamed from: a */
    public final Context f78332a;

    /* renamed from: b */
    public final PackageManager f78333b;

    public C32116d(Context context, PackageManager packageManager) {
        this.f78332a = context;
        this.f78333b = packageManager;
    }

    /* renamed from: a */
    public final boolean mo92863a() {
        for (ComponentInfo next : mo92867e()) {
            if (this.f78333b.getComponentEnabledSetting(new ComponentName(next.packageName, next.name)) != 2) {
                f78331c.mo92775a("Not all non-activity components are disabled", new Object[0]);
                return false;
            }
        }
        f78331c.mo92775a("All non-activity components are disabled", new Object[0]);
        return true;
    }

    /* renamed from: b */
    public final void mo92864b() {
        f78331c.mo92778d("Disabling all non-activity components", new Object[0]);
        mo92866d(mo92867e(), 2);
    }

    /* renamed from: c */
    public final void mo92865c() {
        f78331c.mo92778d("Resetting enabled state of all non-activity components", new Object[0]);
        mo92866d(mo92867e(), 0);
    }

    /* renamed from: d */
    public final void mo92866d(List<ComponentInfo> list, int i) {
        for (ComponentInfo next : list) {
            this.f78333b.setComponentEnabledSetting(new ComponentName(next.packageName, next.name), i, 1);
        }
    }

    /* renamed from: e */
    public final List<ComponentInfo> mo92867e() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.f78333b.getPackageInfo(this.f78332a.getPackageName(), 526);
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                Collections.addAll(arrayList, providerInfoArr);
            }
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null) {
                Collections.addAll(arrayList, activityInfoArr);
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                Collections.addAll(arrayList, serviceInfoArr);
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            f78331c.mo92779e("Failed to resolve own package : %s", e);
            return Collections.emptyList();
        }
    }
}
