package com.carrefour.fid.android.presentation.p035ui.gazStation;

import android.view.View;

/* renamed from: com.carrefour.fid.android.presentation.ui.gazStation.w */
public final /* synthetic */ class C24050w implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ boolean f60296a;

    /* renamed from: b */
    public final /* synthetic */ boolean f60297b;

    /* renamed from: c */
    public final /* synthetic */ ServiceStationsResultFragment f60298c;

    /* renamed from: d */
    public final /* synthetic */ boolean f60299d;

    public /* synthetic */ C24050w(boolean z, boolean z2, ServiceStationsResultFragment serviceStationsResultFragment, boolean z3) {
        this.f60296a = z;
        this.f60297b = z2;
        this.f60298c = serviceStationsResultFragment;
        this.f60299d = z3;
    }

    public final void onClick(View view) {
        ServiceStationsResultFragment.m106011z1(this.f60296a, this.f60297b, this.f60298c, this.f60299d, view);
    }
}
