package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.Status;
import com.google.firebase.perf.metrics.resource.C33383a;

/* renamed from: com.google.android.gms.internal.gtm.df */
public final class C41213df implements C40669r {

    /* renamed from: a */
    public final Status f104532a;

    /* renamed from: b */
    public final int f104533b;

    /* renamed from: c */
    public final C41189cf f104534c;

    /* renamed from: d */
    public final C41142ag f104535d;

    public C41213df(Status status, int i, C41189cf cfVar, C41142ag agVar) {
        this.f104532a = status;
        this.f104533b = i;
        this.f104534c = cfVar;
        this.f104535d = agVar;
    }

    /* renamed from: a */
    public final int mo135226a() {
        return this.f104533b;
    }

    /* renamed from: b */
    public final C41189cf mo135227b() {
        return this.f104534c;
    }

    /* renamed from: c */
    public final C41142ag mo135228c() {
        return this.f104535d;
    }

    /* renamed from: d */
    public final String mo135229d() {
        int i = this.f104533b;
        if (i == 0) {
            return C33383a.f81127j3;
        }
        if (i == 1) {
            return "Saved file on disk";
        }
        if (i == 2) {
            return "Default resource";
        }
        throw new IllegalStateException("Resource source is unknown.");
    }

    public final Status getStatus() {
        return this.f104532a;
    }
}
