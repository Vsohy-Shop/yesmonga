package com.urbanairship.android.layout.view;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.urbanairship.android.layout.view.k */
public final /* synthetic */ class C35988k implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ TextInputView f88943a;

    public /* synthetic */ C35988k(TextInputView textInputView) {
        this.f88943a = textInputView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return TextInputView.m148207h(this.f88943a, view, motionEvent);
    }
}
