package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.n0 */
public final class C36769n0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91348a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91349b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91350c;

    public C36769n0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 TextView textView) {
        this.f91348a = constraintLayout;
        this.f91349b = imageView;
        this.f91350c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36769n0 m150803a(@C0359n0 View view) {
        int i = R.id.image_view_empty_icon;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_view_empty_icon);
        if (imageView != null) {
            i = R.id.text_view_empty_title;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_view_empty_title);
            if (textView != null) {
                return new C36769n0((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36769n0 m150804c(@C0359n0 LayoutInflater layoutInflater) {
        return m150805d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36769n0 m150805d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_additional_order_search_result_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150803a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91348a;
    }
}
