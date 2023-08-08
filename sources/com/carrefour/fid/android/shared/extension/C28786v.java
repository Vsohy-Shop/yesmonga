package com.carrefour.fid.android.shared.extension;

import android.view.View;
import android.widget.EditText;

/* renamed from: com.carrefour.fid.android.shared.extension.v */
public final /* synthetic */ class C28786v implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f70451a;

    public /* synthetic */ C28786v(EditText editText) {
        this.f70451a = editText;
    }

    public final void onFocusChange(View view, boolean z) {
        EditTextKt.m118805o(this.f70451a, view, z);
    }
}
