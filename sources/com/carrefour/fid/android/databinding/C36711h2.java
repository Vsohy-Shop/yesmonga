package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import androidx.viewpager.widget.ViewPager;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.h2 */
public final class C36711h2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90939a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f90940b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f90941c;
    @C0359n0

    /* renamed from: d */
    public final ViewPager f90942d;
    @C0359n0

    /* renamed from: e */
    public final ImageView f90943e;
    @C0359n0

    /* renamed from: f */
    public final ImageView f90944f;
    @C0359n0

    /* renamed from: g */
    public final ImageView f90945g;
    @C0359n0

    /* renamed from: h */
    public final TextView f90946h;
    @C0359n0

    /* renamed from: i */
    public final LinearLayout f90947i;
    @C0359n0

    /* renamed from: j */
    public final LinearLayout f90948j;

    public C36711h2(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 ViewPager viewPager, @C0359n0 ImageView imageView3, @C0359n0 ImageView imageView4, @C0359n0 ImageView imageView5, @C0359n0 TextView textView, @C0359n0 LinearLayout linearLayout, @C0359n0 LinearLayout linearLayout2) {
        this.f90939a = constraintLayout;
        this.f90940b = imageView;
        this.f90941c = imageView2;
        this.f90942d = viewPager;
        this.f90943e = imageView3;
        this.f90944f = imageView4;
        this.f90945g = imageView5;
        this.f90946h = textView;
        this.f90947i = linearLayout;
        this.f90948j = linearLayout2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36711h2 m150571a(@C0359n0 View view) {
        int i = R.id.dot1;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.dot1);
        if (imageView != null) {
            i = R.id.dot2;
            ImageView imageView2 = (ImageView) C20753c.m96463a(view, R.id.dot2);
            if (imageView2 != null) {
                i = R.id.homeLoyaltyPager;
                ViewPager viewPager = (ViewPager) C20753c.m96463a(view, R.id.homeLoyaltyPager);
                if (viewPager != null) {
                    i = R.id.iconFid;
                    ImageView imageView3 = (ImageView) C20753c.m96463a(view, R.id.iconFid);
                    if (imageView3 != null) {
                        i = R.id.iconPass;
                        ImageView imageView4 = (ImageView) C20753c.m96463a(view, R.id.iconPass);
                        if (imageView4 != null) {
                            i = R.id.imgClose;
                            ImageView imageView5 = (ImageView) C20753c.m96463a(view, R.id.imgClose);
                            if (imageView5 != null) {
                                i = R.id.textView12;
                                TextView textView = (TextView) C20753c.m96463a(view, R.id.textView12);
                                if (textView != null) {
                                    i = R.id.viewpagerDots;
                                    LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.viewpagerDots);
                                    if (linearLayout != null) {
                                        i = R.id.viewpagerIcon;
                                        LinearLayout linearLayout2 = (LinearLayout) C20753c.m96463a(view, R.id.viewpagerIcon);
                                        if (linearLayout2 != null) {
                                            return new C36711h2((ConstraintLayout) view, imageView, imageView2, viewPager, imageView3, imageView4, imageView5, textView, linearLayout, linearLayout2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36711h2 m150572c(@C0359n0 LayoutInflater layoutInflater) {
        return m150573d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36711h2 m150573d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home_card_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150571a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90939a;
    }
}
