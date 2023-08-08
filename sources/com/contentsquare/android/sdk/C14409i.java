package com.contentsquare.android.sdk;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.util.Locale;

/* renamed from: com.contentsquare.android.sdk.i */
public class C14409i implements C14801va<String> {

    /* renamed from: a */
    public final Activity f35615a;

    /* renamed from: b */
    public final Fragment f35616b;

    /* renamed from: c */
    public final String f35617c;

    public C14409i(Activity activity) {
        this(activity, (Fragment) null, (String) null);
    }

    /* renamed from: b */
    public String mo35511a() {
        Fragment fragment = this.f35616b;
        if (fragment != null) {
            return String.format(Locale.ENGLISH, "[OnScreenChanged]: Was called for activity: [%s] and fragment [%s]", new Object[]{this.f35615a, fragment});
        }
        String str = this.f35617c;
        if (str != null) {
            return String.format(Locale.ENGLISH, "[OnScreenChanged]: Was called for activity: [%s] and page title [%s]", new Object[]{this.f35615a, str});
        }
        return String.format(Locale.ENGLISH, "[OnScreenChanged]: Was called for activity: [%s] ", new Object[]{this.f35615a});
    }

    public C14409i(Activity activity, Fragment fragment) {
        this(activity, fragment, (String) null);
    }

    public C14409i(Activity activity, Fragment fragment, String str) {
        this.f35615a = activity;
        this.f35616b = fragment;
        this.f35617c = str;
    }

    public C14409i(Activity activity, String str) {
        this(activity, (Fragment) null, str);
    }
}
