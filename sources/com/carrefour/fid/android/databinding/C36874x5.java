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

/* renamed from: com.carrefour.fid.android.databinding.x5 */
public final class C36874x5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91907a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91908b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91909c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91910d;

    public C36874x5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91907a = constraintLayout;
        this.f91908b = imageView;
        this.f91909c = textView;
        this.f91910d = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36874x5 m151211a(@C0359n0 View view) {
        int i = R.id.image_home_customer_service_card;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_home_customer_service_card);
        if (imageView != null) {
            i = R.id.text_home_customer_service_card_subtitle;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_home_customer_service_card_subtitle);
            if (textView != null) {
                i = R.id.text_home_customer_service_card_title;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_home_customer_service_card_title);
                if (textView2 != null) {
                    return new C36874x5((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36874x5 m151212c(@C0359n0 LayoutInflater layoutInflater) {
        return m151213d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36874x5 m151213d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.home_customer_service_card_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151211a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91907a;
    }
}
