package com.contentsquare.android.sdk;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: com.contentsquare.android.sdk.u5 */
public class C14770u5 implements C14550nb<String, ViewGroup> {

    /* renamed from: a */
    public final Activity f36615a;

    /* renamed from: b */
    public final String f36616b;

    /* renamed from: c */
    public final C14454k f36617c;

    public C14770u5(Activity activity, String str, C14454k kVar) {
        this.f36615a = activity;
        this.f36616b = str;
        this.f36617c = kVar;
    }

    /* renamed from: a */
    public String mo34909b(ViewGroup viewGroup) {
        return this.f36617c.mo35687f(this.f36615a, viewGroup, this.f36616b);
    }
}
