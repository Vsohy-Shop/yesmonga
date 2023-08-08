package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.t6 */
public final class C36835t6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91704a;
    @C0359n0

    /* renamed from: b */
    public final Button f91705b;
    @C0359n0

    /* renamed from: c */
    public final Button f91706c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91707d;

    public C36835t6(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 Button button2, @C0359n0 TextView textView) {
        this.f91704a = constraintLayout;
        this.f91705b = button;
        this.f91706c = button2;
        this.f91707d = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36835t6 m151061a(@C0359n0 View view) {
        int i = R.id.offer_product_negative_button;
        Button button = (Button) C20753c.m96463a(view, R.id.offer_product_negative_button);
        if (button != null) {
            i = R.id.offer_product_positive_button;
            Button button2 = (Button) C20753c.m96463a(view, R.id.offer_product_positive_button);
            if (button2 != null) {
                i = R.id.offer_product_title_text;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.offer_product_title_text);
                if (textView != null) {
                    return new C36835t6((ConstraintLayout) view, button, button2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36835t6 m151062c(@C0359n0 LayoutInflater layoutInflater) {
        return m151063d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36835t6 m151063d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.offer_product_overlay_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151061a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91704a;
    }
}
