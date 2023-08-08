package com.carrefour.fid.android.shared.extension;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.C11300l;
import kotlinx.coroutines.C12074o0;

/* renamed from: com.carrefour.fid.android.shared.extension.q0 */
public final /* synthetic */ class C28776q0 implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C12074o0 f70438a;

    /* renamed from: b */
    public final /* synthetic */ C11300l f70439b;

    /* renamed from: c */
    public final /* synthetic */ C11300l f70440c;

    public /* synthetic */ C28776q0(C12074o0 o0Var, C11300l lVar, C11300l lVar2) {
        this.f70438a = o0Var;
        this.f70439b = lVar;
        this.f70440c = lVar2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return ViewKt.m118978C(this.f70438a, this.f70439b, this.f70440c, view, motionEvent);
    }
}
