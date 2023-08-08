package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.d5 */
public final class C36674d5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90721a;
    @C0359n0

    /* renamed from: b */
    public final Button f90722b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f90723c;
    @C0359n0

    /* renamed from: d */
    public final TextView f90724d;

    public C36674d5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView) {
        this.f90721a = constraintLayout;
        this.f90722b = button;
        this.f90723c = imageView;
        this.f90724d = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36674d5 m150425a(@C0359n0 View view) {
        int i = R.id.button_holder_order_details_online_replacement_info;
        Button button = (Button) C20753c.m96463a(view, R.id.button_holder_order_details_online_replacement_info);
        if (button != null) {
            i = R.id.image_holder_order_details_online_replacement_info;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_holder_order_details_online_replacement_info);
            if (imageView != null) {
                i = R.id.text_holder_order_details_online_replacement_info;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_online_replacement_info);
                if (textView != null) {
                    return new C36674d5((ConstraintLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36674d5 m150426c(@C0359n0 LayoutInflater layoutInflater) {
        return m150427d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36674d5 m150427d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_online_replacement_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150425a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90721a;
    }
}
