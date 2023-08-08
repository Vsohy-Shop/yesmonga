package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;
import com.ortiz.touchview.TouchImageView;

/* renamed from: com.carrefour.fid.android.design.components.databinding.a */
public final class C37028a implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TouchImageView f92557a;
    @C0359n0

    /* renamed from: b */
    public final TouchImageView f92558b;

    public C37028a(@C0359n0 TouchImageView touchImageView, @C0359n0 TouchImageView touchImageView2) {
        this.f92557a = touchImageView;
        this.f92558b = touchImageView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37028a m151925a(@C0359n0 View view) {
        if (view != null) {
            TouchImageView touchImageView = (TouchImageView) view;
            return new C37028a(touchImageView, touchImageView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C37028a m151926c(@C0359n0 LayoutInflater layoutInflater) {
        return m151927d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37028a m151927d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.carousel_touch_image_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151925a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TouchImageView getRoot() {
        return this.f92557a;
    }
}
