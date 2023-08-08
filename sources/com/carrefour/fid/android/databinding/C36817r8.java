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

/* renamed from: com.carrefour.fid.android.databinding.r8 */
public final class C36817r8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91594a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91595b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91596c;
    @C0359n0

    /* renamed from: d */
    public final ConstraintLayout f91597d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91598e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91599f;

    public C36817r8(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 ConstraintLayout constraintLayout2, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91594a = constraintLayout;
        this.f91595b = imageView;
        this.f91596c = imageView2;
        this.f91597d = constraintLayout2;
        this.f91598e = textView;
        this.f91599f = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36817r8 m150991a(@C0359n0 View view) {
        int i = R.id.image_allergobox_icon;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_allergobox_icon);
        if (imageView != null) {
            i = R.id.image_consotrust_icon;
            ImageView imageView2 = (ImageView) C20753c.m96463a(view, R.id.image_consotrust_icon);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.text_allergobox_link;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_allergobox_link);
                if (textView != null) {
                    i = R.id.text_certified_by;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_certified_by);
                    if (textView2 != null) {
                        return new C36817r8(constraintLayout, imageView, imageView2, constraintLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36817r8 m150992c(@C0359n0 LayoutInflater layoutInflater) {
        return m150993d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36817r8 m150993d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_allergobox_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150991a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91594a;
    }
}
