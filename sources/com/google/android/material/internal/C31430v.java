package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(18)
/* renamed from: com.google.android.material.internal.v */
public class C31430v implements C31431w {

    /* renamed from: a */
    public final ViewOverlay f75973a;

    public C31430v(@C0359n0 View view) {
        this.f75973a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo90180a(@C0359n0 Drawable drawable) {
        this.f75973a.add(drawable);
    }

    /* renamed from: b */
    public void mo90181b(@C0359n0 Drawable drawable) {
        this.f75973a.remove(drawable);
    }
}
