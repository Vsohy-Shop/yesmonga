package com.carrefour.fid.android.shared.extension;

import android.view.View;
import kotlin.jvm.functions.C11300l;
import kotlinx.coroutines.C12074o0;

/* renamed from: com.carrefour.fid.android.shared.extension.o0 */
public final /* synthetic */ class C28772o0 implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C12074o0 f70434a;

    /* renamed from: b */
    public final /* synthetic */ C11300l f70435b;

    public /* synthetic */ C28772o0(C12074o0 o0Var, C11300l lVar) {
        this.f70434a = o0Var;
        this.f70435b = lVar;
    }

    public final void onFocusChange(View view, boolean z) {
        ViewKt.m119009v(this.f70434a, this.f70435b, view, z);
    }
}
