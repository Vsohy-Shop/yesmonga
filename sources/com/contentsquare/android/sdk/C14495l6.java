package com.contentsquare.android.sdk;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: com.contentsquare.android.sdk.l6 */
public class C14495l6 implements C14550nb<String, ViewGroup> {

    /* renamed from: a */
    public final Activity f35848a;

    /* renamed from: b */
    public final Fragment f35849b;

    /* renamed from: c */
    public final C14454k f35850c;

    public C14495l6(Activity activity, Fragment fragment, C14454k kVar) {
        this.f35848a = activity;
        this.f35849b = fragment;
        this.f35850c = kVar;
    }

    /* renamed from: a */
    public String mo34909b(ViewGroup viewGroup) {
        return this.f35850c.mo35688g(this.f35848a, this.f35849b, viewGroup);
    }
}
