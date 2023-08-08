package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.catalogs.C39364b;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.h */
public final class C39417h implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f100823a;
    @C0359n0

    /* renamed from: b */
    public final TabLayout f100824b;
    @C0359n0

    /* renamed from: c */
    public final FrameLayout f100825c;
    @C0359n0

    /* renamed from: d */
    public final TextView f100826d;
    @C0359n0

    /* renamed from: e */
    public final TextView f100827e;
    @C0359n0

    /* renamed from: f */
    public final ImageView f100828f;

    public C39417h(@C0359n0 LinearLayout linearLayout, @C0359n0 TabLayout tabLayout, @C0359n0 FrameLayout frameLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 ImageView imageView) {
        this.f100823a = linearLayout;
        this.f100824b = tabLayout;
        this.f100825c = frameLayout;
        this.f100826d = textView;
        this.f100827e = textView2;
        this.f100828f = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C39417h m161557a(@C0359n0 View view) {
        int i = C39364b.C39374j.catalog_details_tabLayout;
        TabLayout tabLayout = (TabLayout) C20753c.m96463a(view, i);
        if (tabLayout != null) {
            i = C39364b.C39374j.details_frame_container;
            FrameLayout frameLayout = (FrameLayout) C20753c.m96463a(view, i);
            if (frameLayout != null) {
                i = C39364b.C39374j.toolbar_description_text;
                TextView textView = (TextView) C20753c.m96463a(view, i);
                if (textView != null) {
                    i = C39364b.C39374j.toolbar_label_text;
                    TextView textView2 = (TextView) C20753c.m96463a(view, i);
                    if (textView2 != null) {
                        i = C39364b.C39374j.toolbar_left_icon;
                        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
                        if (imageView != null) {
                            return new C39417h((LinearLayout) view, tabLayout, frameLayout, textView, textView2, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39417h m161558c(@C0359n0 LayoutInflater layoutInflater) {
        return m161559d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39417h m161559d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.fragment_catalog_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161557a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f100823a;
    }
}
