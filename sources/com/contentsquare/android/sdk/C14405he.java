package com.contentsquare.android.sdk;

import android.view.ViewGroup;

/* renamed from: com.contentsquare.android.sdk.he */
public class C14405he implements C14550nb<String, ViewGroup> {

    /* renamed from: a */
    public final boolean f35608a;

    /* renamed from: b */
    public final String f35609b;

    /* renamed from: c */
    public final C14550nb<String, ViewGroup> f35610c;

    public C14405he(boolean z, String str, C14550nb<String, ViewGroup> nbVar) {
        this.f35608a = z;
        this.f35609b = str;
        this.f35610c = nbVar;
    }

    /* renamed from: a */
    public String mo34909b(ViewGroup viewGroup) {
        String b = this.f35610c.mo34909b(viewGroup);
        if (this.f35608a) {
            String str = this.f35609b;
            return str != null ? str : b;
        } else if (!b.equals(this.f35609b)) {
            return b;
        } else {
            return null;
        }
    }
}
