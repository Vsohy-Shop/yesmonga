package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.annotation.C0323b0;
import com.google.android.gms.common.util.C40996v;
import com.google.firebase.C33033f;
import com.google.firebase.installations.C33124s;
import java.util.List;

/* renamed from: com.google.firebase.messaging.k0 */
public class C33206k0 {

    /* renamed from: f */
    public static final String f80725f = "com.google.android.c2dm.permission.SEND";

    /* renamed from: g */
    public static final String f80726g = "com.google.android.gms";

    /* renamed from: h */
    public static final String f80727h = "com.google.iid.TOKEN_REQUEST";

    /* renamed from: i */
    public static final String f80728i = "com.google.android.c2dm.intent.REGISTER";

    /* renamed from: j */
    public static final int f80729j = 0;

    /* renamed from: k */
    public static final int f80730k = 1;

    /* renamed from: l */
    public static final int f80731l = 2;

    /* renamed from: a */
    public final Context f80732a;
    @C0323b0("this")

    /* renamed from: b */
    public String f80733b;
    @C0323b0("this")

    /* renamed from: c */
    public String f80734c;
    @C0323b0("this")

    /* renamed from: d */
    public int f80735d;
    @C0323b0("this")

    /* renamed from: e */
    public int f80736e = 0;

    public C33206k0(Context context) {
        this.f80732a = context;
    }

    /* renamed from: c */
    public static String m133948c(C33033f fVar) {
        String m = fVar.mo95723s().mo96251m();
        if (m != null) {
            return m;
        }
        String j = fVar.mo95723s().mo96248j();
        if (!j.startsWith("1:")) {
            return j;
        }
        String[] split = j.split(C33124s.f80355c);
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized String mo96104a() {
        if (this.f80733b == null) {
            mo96110h();
        }
        return this.f80733b;
    }

    /* renamed from: b */
    public synchronized String mo96105b() {
        if (this.f80734c == null) {
            mo96110h();
        }
        return this.f80734c;
    }

    /* renamed from: d */
    public synchronized int mo96106d() {
        PackageInfo f;
        if (this.f80735d == 0 && (f = mo96108f("com.google.android.gms")) != null) {
            this.f80735d = f.versionCode;
        }
        return this.f80735d;
    }

    /* renamed from: e */
    public synchronized int mo96107e() {
        int i = this.f80736e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f80732a.getPackageManager();
        if (packageManager.checkPermission(f80725f, "com.google.android.gms") == -1) {
            return 0;
        }
        if (!C40996v.m166689n()) {
            Intent intent = new Intent(f80728i);
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f80736e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent(f80727h);
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (C40996v.m166689n()) {
                this.f80736e = 2;
            } else {
                this.f80736e = 1;
            }
            return this.f80736e;
        }
        this.f80736e = 2;
        return 2;
    }

    /* renamed from: f */
    public final PackageInfo mo96108f(String str) {
        try {
            return this.f80732a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find package ");
            sb.append(e);
            return null;
        }
    }

    /* renamed from: g */
    public boolean mo96109g() {
        return mo96107e() != 0;
    }

    /* renamed from: h */
    public final synchronized void mo96110h() {
        PackageInfo f = mo96108f(this.f80732a.getPackageName());
        if (f != null) {
            this.f80733b = Integer.toString(f.versionCode);
            this.f80734c = f.versionName;
        }
    }
}
