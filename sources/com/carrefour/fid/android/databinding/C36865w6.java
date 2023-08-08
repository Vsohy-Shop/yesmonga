package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;
import com.ortiz.touchview.TouchImageView;

/* renamed from: com.carrefour.fid.android.databinding.w6 */
public final class C36865w6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TouchImageView f91863a;
    @C0359n0

    /* renamed from: b */
    public final TouchImageView f91864b;

    public C36865w6(@C0359n0 TouchImageView touchImageView, @C0359n0 TouchImageView touchImageView2) {
        this.f91863a = touchImageView;
        this.f91864b = touchImageView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36865w6 m151175a(@C0359n0 View view) {
        if (view != null) {
            TouchImageView touchImageView = (TouchImageView) view;
            return new C36865w6(touchImageView, touchImageView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36865w6 m151176c(@C0359n0 LayoutInflater layoutInflater) {
        return m151177d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36865w6 m151177d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pdf_reader_view_holder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151175a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TouchImageView getRoot() {
        return this.f91863a;
    }
}
