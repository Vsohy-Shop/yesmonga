package com.carrefour.fid.android.shared.databinding;

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
import com.carrefour.fid.android.shared.C28444b;

/* renamed from: com.carrefour.fid.android.shared.databinding.c */
public final class C28652c implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f70255a;
    @C0359n0

    /* renamed from: b */
    public final LinearLayout f70256b;
    @C0359n0

    /* renamed from: c */
    public final TextView f70257c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f70258d;

    public C28652c(@C0359n0 LinearLayout linearLayout, @C0359n0 LinearLayout linearLayout2, @C0359n0 TextView textView, @C0359n0 ImageView imageView) {
        this.f70255a = linearLayout;
        this.f70256b = linearLayout2;
        this.f70257c = textView;
        this.f70258d = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C28652c m118628a(@C0359n0 View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C28444b.C28454j.mainText;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C28444b.C28454j.pictoBanner;
            ImageView imageView = (ImageView) C20753c.m96463a(view, i);
            if (imageView != null) {
                return new C28652c(linearLayout, linearLayout, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C28652c m118629c(@C0359n0 LayoutInflater layoutInflater) {
        return m118630d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C28652c m118630d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28444b.C28457m.banner_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m118628a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f70255a;
    }
}
