package com.contentsquare.android.sdk;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: com.contentsquare.android.sdk.zd */
public final class C14932zd {

    /* renamed from: a */
    public static final HashSet<Class<? extends Activity>> f37013a = new HashSet<>();

    /* renamed from: b */
    public static final HashSet<Class<? extends View>> f37014b = new HashSet<>();

    /* renamed from: c */
    public static final HashSet<String> f37015c;

    /* renamed from: d */
    public static final C14663r3<Activity> f37016d = new C14933a();

    /* renamed from: e */
    public static final C14663r3<View> f37017e = new C14934b();

    /* renamed from: f */
    public static Boolean f37018f = true;

    /* renamed from: com.contentsquare.android.sdk.zd$a */
    public class C14933a implements C14663r3<Activity> {
        /* renamed from: a */
        public boolean mo34386b(Activity activity) {
            return C14932zd.f37013a.contains(activity.getClass());
        }
    }

    /* renamed from: com.contentsquare.android.sdk.zd$b */
    public class C14934b implements C14663r3<View> {
        /* renamed from: a */
        public boolean mo34386b(View view) {
            if (C14932zd.f37014b.contains(view.getClass())) {
                return true;
            }
            if (C14932zd.f37018f.booleanValue()) {
                return view.getId() == 16908336;
            }
            return C14932zd.f37015c.contains(C14493l4.m62465b(view, "unknown"));
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f37015c = hashSet;
        hashSet.add("navigationBarBackground");
    }

    /* renamed from: a */
    public static C14663r3<Activity> m64244a() {
        return f37016d;
    }

    @SafeVarargs
    /* renamed from: b */
    public static void m64245b(Class<? extends Activity>... clsArr) {
        Collections.addAll(f37013a, clsArr);
    }

    /* renamed from: c */
    public static C14663r3<View> m64246c() {
        return f37017e;
    }

    @SafeVarargs
    /* renamed from: d */
    public static void m64247d(Class<? extends View>... clsArr) {
        Collections.addAll(f37014b, clsArr);
    }
}
