package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.p8 */
public final class C36797p8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final Toolbar f91506a;
    @C0359n0

    /* renamed from: b */
    public final RelativeLayout f91507b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91508c;
    @C0359n0

    /* renamed from: d */
    public final ImageButton f91509d;
    @C0359n0

    /* renamed from: e */
    public final Toolbar f91510e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91511f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91512g;

    public C36797p8(@C0359n0 Toolbar toolbar, @C0359n0 RelativeLayout relativeLayout, @C0359n0 TextView textView, @C0359n0 ImageButton imageButton, @C0359n0 Toolbar toolbar2, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f91506a = toolbar;
        this.f91507b = relativeLayout;
        this.f91508c = textView;
        this.f91509d = imageButton;
        this.f91510e = toolbar2;
        this.f91511f = textView2;
        this.f91512g = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36797p8 m150915a(@C0359n0 View view) {
        int i = R.id.basket;
        RelativeLayout relativeLayout = (RelativeLayout) C20753c.m96463a(view, R.id.basket);
        if (relativeLayout != null) {
            i = R.id.basket_count;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.basket_count);
            if (textView != null) {
                i = R.id.ic_back;
                ImageButton imageButton = (ImageButton) C20753c.m96463a(view, R.id.ic_back);
                if (imageButton != null) {
                    Toolbar toolbar = (Toolbar) view;
                    i = R.id.subtitle_toolbar;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.subtitle_toolbar);
                    if (textView2 != null) {
                        i = R.id.title_toolbar;
                        TextView textView3 = (TextView) C20753c.m96463a(view, R.id.title_toolbar);
                        if (textView3 != null) {
                            return new C36797p8(toolbar, relativeLayout, textView, imageButton, toolbar, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36797p8 m150916c(@C0359n0 LayoutInflater layoutInflater) {
        return m150917d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36797p8 m150917d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.toolbar_with_back, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150915a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public Toolbar getRoot() {
        return this.f91506a;
    }
}
