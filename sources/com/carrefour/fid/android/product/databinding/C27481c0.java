package com.carrefour.fid.android.product.databinding;

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
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.c0 */
public final class C27481c0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66627a;
    @C0359n0

    /* renamed from: b */
    public final Button f66628b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f66629c;
    @C0359n0

    /* renamed from: d */
    public final TextView f66630d;

    public C27481c0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView) {
        this.f66627a = constraintLayout;
        this.f66628b = button;
        this.f66629c = imageView;
        this.f66630d = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C27481c0 m115649a(@C0359n0 View view) {
        int i = C27609f.C27619j.button_empty_view;
        Button button = (Button) C20753c.m96463a(view, i);
        if (button != null) {
            i = C27609f.C27619j.image_view_empty;
            ImageView imageView = (ImageView) C20753c.m96463a(view, i);
            if (imageView != null) {
                i = C27609f.C27619j.text_view_empty_message;
                TextView textView = (TextView) C20753c.m96463a(view, i);
                if (textView != null) {
                    return new C27481c0((ConstraintLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27481c0 m115650c(@C0359n0 LayoutInflater layoutInflater) {
        return m115651d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27481c0 m115651d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.plp_list_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115649a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66627a;
    }
}
