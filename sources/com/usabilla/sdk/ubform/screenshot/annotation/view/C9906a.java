package com.usabilla.sdk.ubform.screenshot.annotation.view;

import android.view.View;
import android.widget.ImageView;

/* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.view.a */
public final /* synthetic */ class C9906a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ImageView f27217a;

    /* renamed from: b */
    public final /* synthetic */ UbColorPickerView f27218b;

    /* renamed from: c */
    public final /* synthetic */ int f27219c;

    public /* synthetic */ C9906a(ImageView imageView, UbColorPickerView ubColorPickerView, int i) {
        this.f27217a = imageView;
        this.f27218b = ubColorPickerView;
        this.f27219c = i;
    }

    public final void onClick(View view) {
        UbColorPickerView.m37212d(this.f27217a, this.f27218b, this.f27219c, view);
    }
}
