package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.e */
public final class C36678e implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90746a;
    @C0359n0

    /* renamed from: b */
    public final LinearLayout f90747b;
    @C0359n0

    /* renamed from: c */
    public final TextView f90748c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f90749d;

    public C36678e(@C0359n0 LinearLayout linearLayout, @C0359n0 LinearLayout linearLayout2, @C0359n0 TextView textView, @C0359n0 ImageView imageView) {
        this.f90746a = linearLayout;
        this.f90747b = linearLayout2;
        this.f90748c = textView;
        this.f90749d = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36678e m150441a(@C0359n0 View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.mainText;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.mainText);
        if (textView != null) {
            i = R.id.pictoBanner;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.pictoBanner);
            if (imageView != null) {
                return new C36678e(linearLayout, linearLayout, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36678e m150442c(@C0359n0 LayoutInflater layoutInflater) {
        return m150443d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36678e m150443d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.banner_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150441a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90746a;
    }
}
