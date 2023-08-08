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

/* renamed from: com.carrefour.fid.android.databinding.z0 */
public final class C36887z0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91994a;
    @C0359n0

    /* renamed from: b */
    public final Button f91995b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91996c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91997d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91998e;

    public C36887z0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91994a = constraintLayout;
        this.f91995b = button;
        this.f91996c = imageView;
        this.f91997d = textView;
        this.f91998e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36887z0 m151261a(@C0359n0 View view) {
        int i = R.id.button_empty_view;
        Button button = (Button) C20753c.m96463a(view, R.id.button_empty_view);
        if (button != null) {
            i = R.id.image_view_empty_icon;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_view_empty_icon);
            if (imageView != null) {
                i = R.id.text_view_empty_message;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_view_empty_message);
                if (textView != null) {
                    i = R.id.text_view_empty_title;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_view_empty_title);
                    if (textView2 != null) {
                        return new C36887z0((ConstraintLayout) view, button, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36887z0 m151262c(@C0359n0 LayoutInflater layoutInflater) {
        return m151263d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36887z0 m151263d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basket_builder_recommended_products_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151261a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91994a;
    }
}
