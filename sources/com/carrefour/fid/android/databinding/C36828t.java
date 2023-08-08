package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.t */
public final class C36828t implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final RelativeLayout f91653a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91654b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91655c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91656d;

    public C36828t(@C0359n0 RelativeLayout relativeLayout, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91653a = relativeLayout;
        this.f91654b = imageView;
        this.f91655c = textView;
        this.f91656d = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36828t m151033a(@C0359n0 View view) {
        int i = R.id.appLogo;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.appLogo);
        if (imageView != null) {
            i = R.id.appName;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.appName);
            if (textView != null) {
                i = R.id.isInstalledText;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.isInstalledText);
                if (textView2 != null) {
                    return new C36828t((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36828t m151034c(@C0359n0 LayoutInflater layoutInflater) {
        return m151035d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36828t m151035d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.eco_app_cell, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151033a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f91653a;
    }
}
