package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.play.core.internal.C32062k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.t0 */
public final class C32199t0 {

    /* renamed from: c */
    public static final C32062k f78499c = new C32062k("SplitInstallInfoProvider");

    /* renamed from: a */
    public final Context f78500a;

    /* renamed from: b */
    public final String f78501b;

    public C32199t0(Context context) {
        this.f78500a = context;
        this.f78501b = context.getPackageName();
    }

    /* renamed from: d */
    public static boolean m130251d(String str) {
        return str.startsWith("config.");
    }

    /* renamed from: e */
    public static boolean m130252e(String str) {
        return m130251d(str) || str.contains(".config.");
    }

    /* renamed from: a */
    public final Set<String> mo92983a() {
        HashSet hashSet = new HashSet();
        for (String next : mo92986f()) {
            if (!m130252e(next)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    @Nullable
    /* renamed from: b */
    public final Set<String> mo92984b() {
        C32182m0 c = mo92985c();
        if (c == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set<String> f = mo92986f();
        f.add("");
        Set<String> a = mo92983a();
        a.add("");
        for (Map.Entry next : c.mo92981a(a).entrySet()) {
            if (f.containsAll((Collection) next.getValue())) {
                hashSet.add((String) next.getKey());
            }
        }
        return hashSet;
    }

    @Nullable
    /* renamed from: c */
    public final C32182m0 mo92985c() {
        Bundle g = mo92987g();
        if (g == null) {
            f78499c.mo92779e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = g.getInt("com.android.vending.splits");
        if (i == 0) {
            f78499c.mo92779e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            C32182m0 b = C32191p0.m130239b(this.f78500a.getResources().getXml(i), new C32180l0());
            if (b == null) {
                f78499c.mo92779e("Can't parse languages metadata.", new Object[0]);
            }
            return b;
        } catch (Resources.NotFoundException unused) {
            f78499c.mo92779e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    /* renamed from: f */
    public final Set<String> mo92986f() {
        HashSet hashSet = new HashSet();
        Bundle g = mo92987g();
        if (g != null) {
            String string = g.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f78499c.mo92775a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = null;
        try {
            PackageInfo packageInfo = this.f78500a.getPackageManager().getPackageInfo(this.f78501b, 0);
            if (packageInfo != null) {
                strArr = packageInfo.splitNames;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            f78499c.mo92779e("App is not found in PackageManager", new Object[0]);
        }
        if (strArr != null) {
            f78499c.mo92775a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            f78499c.mo92775a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        C32195r0 a = C32197s0.m130248a();
        if (a != null) {
            hashSet.addAll(a.mo92910a());
        }
        return hashSet;
    }

    @Nullable
    /* renamed from: g */
    public final Bundle mo92987g() {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = this.f78500a.getPackageManager().getApplicationInfo(this.f78501b, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle;
            }
            f78499c.mo92775a("App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f78499c.mo92779e("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    public C32199t0(Context context, String str) {
        this.f78500a = context;
        this.f78501b = str;
    }
}
