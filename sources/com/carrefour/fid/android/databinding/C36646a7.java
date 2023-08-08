package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;

/* renamed from: com.carrefour.fid.android.databinding.a7 */
public final class C36646a7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90576a;
    @C0359n0

    /* renamed from: b */
    public final TextView f90577b;
    @C0359n0

    /* renamed from: c */
    public final TextView f90578c;
    @C0359n0

    /* renamed from: d */
    public final TextView f90579d;
    @C0359n0

    /* renamed from: e */
    public final ImageComponent f90580e;

    public C36646a7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 ImageComponent imageComponent) {
        this.f90576a = constraintLayout;
        this.f90577b = textView;
        this.f90578c = textView2;
        this.f90579d = textView3;
        this.f90580e = imageComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C36646a7 m150313a(@C0359n0 View view) {
        int i = R.id.product_button_atc;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.product_button_atc);
        if (textView != null) {
            i = R.id.product_content;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.product_content);
            if (textView2 != null) {
                i = R.id.product_group_fav;
                TextView textView3 = (TextView) C20753c.m96463a(view, R.id.product_group_fav);
                if (textView3 != null) {
                    i = R.id.product_image;
                    ImageComponent imageComponent = (ImageComponent) C20753c.m96463a(view, R.id.product_image);
                    if (imageComponent != null) {
                        return new C36646a7((ConstraintLayout) view, textView, textView2, textView3, imageComponent);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36646a7 m150314c(@C0359n0 LayoutInflater layoutInflater) {
        return m150315d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36646a7 m150315d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.plp_cell_placeholder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150313a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90576a;
    }
}
