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

/* renamed from: com.carrefour.fid.android.databinding.j5 */
public final class C36734j5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91070a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91071b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91072c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91073d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91074e;

    public C36734j5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91070a = constraintLayout;
        this.f91071b = imageView;
        this.f91072c = imageView2;
        this.f91073d = textView;
        this.f91074e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36734j5 m150663a(@C0359n0 View view) {
        int i = R.id.loyalty_card_arrow_image;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.loyalty_card_arrow_image);
        if (imageView != null) {
            i = R.id.loyalty_card_image;
            ImageView imageView2 = (ImageView) C20753c.m96463a(view, R.id.loyalty_card_image);
            if (imageView2 != null) {
                i = R.id.loyalty_card_number;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.loyalty_card_number);
                if (textView != null) {
                    i = R.id.loyalty_card_type;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.loyalty_card_type);
                    if (textView2 != null) {
                        return new C36734j5((ConstraintLayout) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36734j5 m150664c(@C0359n0 LayoutInflater layoutInflater) {
        return m150665d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36734j5 m150665d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_loyalty_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150663a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91070a;
    }
}
