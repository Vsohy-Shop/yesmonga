package com.carrefour.fid.android.presentation.components.toolbar;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.C0475e;

/* renamed from: com.carrefour.fid.android.presentation.components.toolbar.d */
public final /* synthetic */ class C38410d implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0475e f97260a;

    /* renamed from: b */
    public final /* synthetic */ EditText f97261b;

    /* renamed from: c */
    public final /* synthetic */ ToolBarDefaultView f97262c;

    public /* synthetic */ C38410d(C0475e eVar, EditText editText, ToolBarDefaultView toolBarDefaultView) {
        this.f97260a = eVar;
        this.f97261b = editText;
        this.f97262c = toolBarDefaultView;
    }

    public final void onFocusChange(View view, boolean z) {
        ToolBarDefaultView.m158939i0(this.f97260a, this.f97261b, this.f97262c, view, z);
    }
}
