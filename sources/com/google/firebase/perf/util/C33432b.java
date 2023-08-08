package com.google.firebase.perf.util;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.firebase.perf.util.b */
public final /* synthetic */ class C33432b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ C33433c f81323a;

    /* renamed from: b */
    public final /* synthetic */ View f81324b;

    public /* synthetic */ C33432b(C33433c cVar, View view) {
        this.f81323a = cVar;
        this.f81324b = view;
    }

    public final void onGlobalLayout() {
        this.f81323a.m134818d(this.f81324b);
    }
}
