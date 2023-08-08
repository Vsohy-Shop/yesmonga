package com.contentsquare.android.sdk;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.contentsquare.android.api.C14086a;
import com.google.firebase.crashlytics.internal.persistence.C32920e;

/* renamed from: com.contentsquare.android.sdk.k */
public class C14454k {

    /* renamed from: a */
    public final Application f35704a;

    /* renamed from: b */
    public final C14413i3 f35705b;

    /* renamed from: c */
    public final C14453jf f35706c = new C14453jf("PathGenerator");

    public C14454k(Application application, C14413i3 i3Var) {
        this.f35704a = application;
        this.f35705b = i3Var;
    }

    /* renamed from: a */
    public final Uri.Builder mo35682a(Uri uri, ViewGroup viewGroup, Activity activity) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendPath(activity.getClass().getSimpleName().replace("Activity", ""));
        if (viewGroup != null) {
            View g = this.f35705b.mo35517g(viewGroup);
            buildUpon.appendPath(C14493l4.m62465b(g, "id_" + g.getClass().getSimpleName()));
        }
        return buildUpon;
    }

    /* renamed from: b */
    public final Uri mo35683b() {
        String packageName = this.f35704a.getPackageName();
        return Uri.parse("app-and://" + packageName);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo35684c(android.app.Activity r3) {
        /*
            r2 = this;
            android.app.ActionBar r0 = r3.getActionBar()
            boolean r1 = r3 instanceof androidx.appcompat.app.C0475e
            if (r1 == 0) goto L_0x0016
            r0 = r3
            androidx.appcompat.app.e r0 = (androidx.appcompat.app.C0475e) r0
            androidx.appcompat.app.a r0 = r0.mo1473B0()
            if (r0 == 0) goto L_0x001d
            java.lang.CharSequence r0 = r0.mo1242B()
            goto L_0x001e
        L_0x0016:
            if (r0 == 0) goto L_0x001d
            java.lang.CharSequence r0 = r0.getTitle()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            boolean r1 = com.contentsquare.android.sdk.C14358g3.m61808b(r0)
            if (r1 != 0) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            java.lang.CharSequence r0 = r3.getTitle()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14454k.mo35684c(android.app.Activity):java.lang.CharSequence");
    }

    /* renamed from: d */
    public final CharSequence mo35685d(Object obj) {
        if (obj instanceof C14086a) {
            return ((C14086a) obj).mo34338a();
        }
        return null;
    }

    /* renamed from: e */
    public String mo35686e(Activity activity, ViewGroup viewGroup) {
        Uri.Builder a = mo35682a(mo35683b(), viewGroup, activity);
        mo35690i(a, activity);
        String builder = a.toString();
        this.f35706c.mo35674c("Complete Path: %s", builder);
        return builder;
    }

    /* renamed from: f */
    public String mo35687f(Activity activity, ViewGroup viewGroup, String str) {
        Uri.Builder a = mo35682a(mo35683b(), viewGroup, activity);
        mo35691j(a, str);
        String builder = a.toString();
        this.f35706c.mo35674c("Complete Path: %s", builder);
        return builder;
    }

    /* renamed from: g */
    public String mo35688g(Activity activity, Fragment fragment, ViewGroup viewGroup) {
        return mo35689h(mo35683b(), activity, fragment, viewGroup);
    }

    /* renamed from: h */
    public final String mo35689h(Uri uri, Activity activity, Fragment fragment, ViewGroup viewGroup) {
        String replace = activity.getClass().getSimpleName().replace("Activity", "");
        String replace2 = fragment.getClass().getSimpleName().replace("Fragment", "");
        Uri.Builder buildUpon = uri.buildUpon();
        if (viewGroup != null) {
            View g = this.f35705b.mo35517g(viewGroup);
            String b = C14493l4.m62465b(g, "id_" + g.getClass().getSimpleName());
            Uri.Builder appendPath = buildUpon.appendPath(replace);
            appendPath.appendPath(replace2 + C32920e.f79928l + b);
        } else {
            buildUpon.appendPath(replace).appendPath(replace2);
        }
        mo35690i(buildUpon, activity);
        return buildUpon.toString();
    }

    /* renamed from: i */
    public final void mo35690i(Uri.Builder builder, Activity activity) {
        CharSequence k = mo35692k(activity);
        if (k != null) {
            mo35691j(builder, k.toString());
        }
    }

    /* renamed from: j */
    public final void mo35691j(Uri.Builder builder, String str) {
        if (str != null && str.length() > 0) {
            builder.appendQueryParameter("title", str);
        }
    }

    /* renamed from: k */
    public CharSequence mo35692k(Activity activity) {
        CharSequence d = mo35685d(activity);
        if (d == null) {
            return mo35684c(activity);
        }
        if (d.length() == 0) {
            return null;
        }
        return d;
    }
}
