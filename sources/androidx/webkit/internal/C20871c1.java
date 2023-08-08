package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.C0344h1;
import androidx.annotation.C0352k;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.webkit.C20977t;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.webkit.internal.c1 */
public abstract class C20871c1 {

    /* renamed from: c */
    public static final Set<C20871c1> f53928c = new HashSet();
    @C0344h1

    /* renamed from: d */
    public static final String f53929d = "org.chromium.android_webview.services.StartupFeatureMetadataHolder";

    /* renamed from: e */
    public static final /* synthetic */ boolean f53930e = false;

    /* renamed from: a */
    public final String f53931a;

    /* renamed from: b */
    public final String f53932b;

    /* renamed from: androidx.webkit.internal.c1$a */
    public static class C20872a extends C20871c1 {
        public C20872a(@C0359n0 String str, @C0359n0 String str2) {
            super(str, str2);
        }

        /* renamed from: e */
        public final boolean mo62631e() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public C20871c1(@C0359n0 String str, @C0359n0 String str2) {
        this.f53931a = str;
        this.f53932b = str2;
        f53928c.add(this);
    }

    @C0363p0
    /* renamed from: a */
    public static Bundle m96827a(@C0359n0 Context context) {
        PackageInfo g = C20977t.m97099g(context);
        if (g == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(g.packageName, f53929d);
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                return C20911p0.m96941a(context.getPackageManager(), componentName, C20911p0.m96942b(640)).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } else {
            try {
                return m96828c(context, componentName, 640).metaData;
            } catch (PackageManager.NameNotFoundException unused2) {
                return null;
            }
        }
    }

    /* renamed from: c */
    public static ServiceInfo m96828c(@C0359n0 Context context, ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(componentName, i);
    }

    @C0359n0
    /* renamed from: g */
    public static Set<C20871c1> m96829g() {
        return Collections.unmodifiableSet(f53928c);
    }

    @C0359n0
    /* renamed from: b */
    public String mo62629b() {
        return this.f53931a;
    }

    /* renamed from: d */
    public boolean mo62630d(@C0359n0 Context context) {
        return mo62631e() || mo62632f(context);
    }

    /* renamed from: e */
    public abstract boolean mo62631e();

    @C0352k(api = 21)
    /* renamed from: f */
    public boolean mo62632f(@C0359n0 Context context) {
        Bundle a = m96827a(context);
        if (a == null) {
            return false;
        }
        return a.containsKey(this.f53932b);
    }
}
