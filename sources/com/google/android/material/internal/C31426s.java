package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(18)
/* renamed from: com.google.android.material.internal.s */
public class C31426s implements C31427t {

    /* renamed from: a */
    public final ViewGroupOverlay f75965a;

    public C31426s(@C0359n0 ViewGroup viewGroup) {
        this.f75965a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo90180a(@C0359n0 Drawable drawable) {
        this.f75965a.add(drawable);
    }

    /* renamed from: b */
    public void mo90181b(@C0359n0 Drawable drawable) {
        this.f75965a.remove(drawable);
    }

    /* renamed from: c */
    public void mo90178c(@C0359n0 View view) {
        this.f75965a.add(view);
    }

    /* renamed from: d */
    public void mo90179d(@C0359n0 View view) {
        this.f75965a.remove(view);
    }
}
