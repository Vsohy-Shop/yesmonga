package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;

@SuppressLint({"AppCompatCustomView"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: a */
    public int f75802a;

    public VisibilityAwareImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    public final void mo89988c(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f75802a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f75802a;
    }

    public void setVisibility(int i) {
        mo89988c(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75802a = getVisibility();
    }
}
