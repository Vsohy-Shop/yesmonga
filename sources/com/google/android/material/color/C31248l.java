package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.C0327c1;
import androidx.annotation.C0352k;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31255m;
import com.google.android.material.internal.C31395g;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.material.color.l */
public class C31248l {

    /* renamed from: a */
    public static final int[] f75231a = {C31076a.C31079c.dynamicColorThemeOverlay};

    /* renamed from: b */
    public static final C31251c f75232b;
    @SuppressLint({"PrivateApi"})

    /* renamed from: c */
    public static final C31251c f75233c;

    /* renamed from: d */
    public static final Map<String, C31251c> f75234d;

    /* renamed from: e */
    public static final Map<String, C31251c> f75235e;

    /* renamed from: f */
    public static final int f75236f = 0;

    /* renamed from: com.google.android.material.color.l$a */
    public class C31249a implements C31251c {
        public boolean isSupported() {
            return true;
        }
    }

    /* renamed from: com.google.android.material.color.l$b */
    public class C31250b implements C31251c {

        /* renamed from: a */
        public Long f75237a;

        public boolean isSupported() {
            if (this.f75237a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", new Class[]{String.class});
                    declaredMethod.setAccessible(true);
                    this.f75237a = Long.valueOf(((Long) declaredMethod.invoke((Object) null, new Object[]{"ro.build.version.oneui"})).longValue());
                } catch (Exception unused) {
                    this.f75237a = -1L;
                }
            }
            if (this.f75237a.longValue() >= 40100) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.color.l$c */
    public interface C31251c {
        boolean isSupported();
    }

    /* renamed from: com.google.android.material.color.l$d */
    public static class C31252d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public final C31255m f75238a;

        public C31252d(@C0359n0 C31255m mVar) {
            this.f75238a = mVar;
        }

        public void onActivityCreated(@C0359n0 Activity activity, @C0363p0 Bundle bundle) {
        }

        public void onActivityDestroyed(@C0359n0 Activity activity) {
        }

        public void onActivityPaused(@C0359n0 Activity activity) {
        }

        public void onActivityPreCreated(@C0359n0 Activity activity, @C0363p0 Bundle bundle) {
            C31248l.m125890k(activity, this.f75238a.mo89218e(), this.f75238a.mo89217d(), this.f75238a.mo89216c());
        }

        public void onActivityResumed(@C0359n0 Activity activity) {
        }

        public void onActivitySaveInstanceState(@C0359n0 Activity activity, @C0359n0 Bundle bundle) {
        }

        public void onActivityStarted(@C0359n0 Activity activity) {
        }

        public void onActivityStopped(@C0359n0 Activity activity) {
        }
    }

    /* renamed from: com.google.android.material.color.l$e */
    public interface C31253e {
        /* renamed from: a */
        void mo89214a(@C0359n0 Activity activity);
    }

    /* renamed from: com.google.android.material.color.l$f */
    public interface C31254f {
        /* renamed from: a */
        boolean mo89215a(@C0359n0 Activity activity, @C0327c1 int i);
    }

    static {
        C31249a aVar = new C31249a();
        f75232b = aVar;
        C31250b bVar = new C31250b();
        f75233c = bVar;
        HashMap hashMap = new HashMap();
        hashMap.put(OTVendorListMode.GOOGLE, aVar);
        hashMap.put("hmd global", aVar);
        hashMap.put("infinix", aVar);
        hashMap.put("infinix mobility limited", aVar);
        hashMap.put("itel", aVar);
        hashMap.put("kyocera", aVar);
        hashMap.put("lenovo", aVar);
        hashMap.put(C31395g.f75891a, aVar);
        hashMap.put("motorola", aVar);
        hashMap.put("nothing", aVar);
        hashMap.put("oneplus", aVar);
        hashMap.put("oppo", aVar);
        hashMap.put("realme", aVar);
        hashMap.put("robolectric", aVar);
        hashMap.put(C31395g.f75892b, bVar);
        hashMap.put("sharp", aVar);
        hashMap.put("sony", aVar);
        hashMap.put("tcl", aVar);
        hashMap.put("tecno", aVar);
        hashMap.put("tecno mobile limited", aVar);
        hashMap.put("vivo", aVar);
        hashMap.put("xiaomi", aVar);
        f75234d = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", aVar);
        hashMap2.put("jio", aVar);
        f75235e = Collections.unmodifiableMap(hashMap2);
    }

    @Deprecated
    /* renamed from: b */
    public static void m125881b(@C0359n0 Activity activity) {
        m125889j(activity);
    }

    @Deprecated
    /* renamed from: c */
    public static void m125882c(@C0359n0 Activity activity, @C0327c1 int i) {
        m125891l(activity, new C31255m.C31258c().mo89222g(i).mo89219d());
    }

    @Deprecated
    /* renamed from: d */
    public static void m125883d(@C0359n0 Activity activity, @C0359n0 C31254f fVar) {
        m125891l(activity, new C31255m.C31258c().mo89221f(fVar).mo89219d());
    }

    /* renamed from: e */
    public static void m125884e(@C0359n0 Application application) {
        m125888i(application, new C31255m.C31258c().mo89219d());
    }

    @Deprecated
    /* renamed from: f */
    public static void m125885f(@C0359n0 Application application, @C0327c1 int i) {
        m125888i(application, new C31255m.C31258c().mo89222g(i).mo89219d());
    }

    @Deprecated
    /* renamed from: g */
    public static void m125886g(@C0359n0 Application application, @C0327c1 int i, @C0359n0 C31254f fVar) {
        m125888i(application, new C31255m.C31258c().mo89222g(i).mo89221f(fVar).mo89219d());
    }

    @Deprecated
    /* renamed from: h */
    public static void m125887h(@C0359n0 Application application, @C0359n0 C31254f fVar) {
        m125888i(application, new C31255m.C31258c().mo89221f(fVar).mo89219d());
    }

    /* renamed from: i */
    public static void m125888i(@C0359n0 Application application, @C0359n0 C31255m mVar) {
        application.registerActivityLifecycleCallbacks(new C31252d(mVar));
    }

    /* renamed from: j */
    public static void m125889j(@C0359n0 Activity activity) {
        m125891l(activity, new C31255m.C31258c().mo89219d());
    }

    /* renamed from: k */
    public static void m125890k(@C0359n0 Activity activity, @C0327c1 int i, @C0359n0 C31254f fVar, @C0359n0 C31253e eVar) {
        if (m125893n()) {
            if (i == 0) {
                i = m125892m(activity);
            }
            if (i != 0 && fVar.mo89215a(activity, i)) {
                C31268u.m125972a(activity, i);
                eVar.mo89214a(activity);
            }
        }
    }

    /* renamed from: l */
    public static void m125891l(@C0359n0 Activity activity, @C0359n0 C31255m mVar) {
        m125890k(activity, mVar.mo89218e(), mVar.mo89217d(), mVar.mo89216c());
    }

    /* renamed from: m */
    public static int m125892m(@C0359n0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f75231a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @C0352k(api = 31)
    @SuppressLint({"DefaultLocale"})
    /* renamed from: n */
    public static boolean m125893n() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        C31251c cVar = f75234d.get(Build.MANUFACTURER.toLowerCase());
        if (cVar == null) {
            cVar = f75235e.get(Build.BRAND.toLowerCase());
        }
        if (cVar == null || !cVar.isSupported()) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: o */
    public static Context m125894o(@C0359n0 Context context) {
        return m125895p(context, 0);
    }

    @C0359n0
    /* renamed from: p */
    public static Context m125895p(@C0359n0 Context context, @C0327c1 int i) {
        if (!m125893n()) {
            return context;
        }
        if (i == 0) {
            i = m125892m(context);
        }
        if (i == 0) {
            return context;
        }
        return new ContextThemeWrapper(context, i);
    }
}
