package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.google.android.gms.dynamic.l */
public final class C41025l implements C41029p {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f104306a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflater f104307b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f104308c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f104309d;

    /* renamed from: e */
    public final /* synthetic */ C41012a f104310e;

    public C41025l(C41012a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f104310e = aVar;
        this.f104306a = frameLayout;
        this.f104307b = layoutInflater;
        this.f104308c = viewGroup;
        this.f104309d = bundle;
    }

    /* renamed from: a */
    public final void mo134838a(C41018e eVar) {
        this.f104306a.removeAllViews();
        this.f104306a.addView(this.f104310e.f104292a.mo85960N(this.f104307b, this.f104308c, this.f104309d));
    }

    /* renamed from: i */
    public final int mo134839i() {
        return 2;
    }
}
