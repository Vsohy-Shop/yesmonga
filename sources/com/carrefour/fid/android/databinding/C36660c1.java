package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.c1 */
public final class C36660c1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ScrollView f90626a;
    @C0359n0

    /* renamed from: b */
    public final C36748l f90627b;
    @C0359n0

    /* renamed from: c */
    public final ConstraintLayout f90628c;
    @C0359n0

    /* renamed from: d */
    public final ShimmerFrameLayout f90629d;
    @C0359n0

    /* renamed from: e */
    public final TextView f90630e;
    @C0359n0

    /* renamed from: f */
    public final TextView f90631f;
    @C0359n0

    /* renamed from: g */
    public final ImageView f90632g;
    @C0359n0

    /* renamed from: h */
    public final GridLayout f90633h;
    @C0359n0

    /* renamed from: i */
    public final TextView f90634i;

    public C36660c1(@C0359n0 ScrollView scrollView, @C0359n0 C36748l lVar, @C0359n0 ConstraintLayout constraintLayout, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 ImageView imageView, @C0359n0 GridLayout gridLayout, @C0359n0 TextView textView3) {
        this.f90626a = scrollView;
        this.f90627b = lVar;
        this.f90628c = constraintLayout;
        this.f90629d = shimmerFrameLayout;
        this.f90630e = textView;
        this.f90631f = textView2;
        this.f90632g = imageView;
        this.f90633h = gridLayout;
        this.f90634i = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36660c1 m150369a(@C0359n0 View view) {
        int i = R.id.channelErrorLayout;
        View a = C20753c.m96463a(view, R.id.channelErrorLayout);
        if (a != null) {
            C36748l a2 = C36748l.m150719a(a);
            i = R.id.channelLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) C20753c.m96463a(view, R.id.channelLayout);
            if (constraintLayout != null) {
                i = R.id.channelShimmerLayout;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.channelShimmerLayout);
                if (shimmerFrameLayout != null) {
                    i = R.id.channelSubTitle;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.channelSubTitle);
                    if (textView != null) {
                        i = R.id.channelTitle;
                        TextView textView2 = (TextView) C20753c.m96463a(view, R.id.channelTitle);
                        if (textView2 != null) {
                            i = R.id.imgCallServiceClient;
                            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.imgCallServiceClient);
                            if (imageView != null) {
                                i = R.id.lytChannels;
                                GridLayout gridLayout = (GridLayout) C20753c.m96463a(view, R.id.lytChannels);
                                if (gridLayout != null) {
                                    i = R.id.textView18;
                                    TextView textView3 = (TextView) C20753c.m96463a(view, R.id.textView18);
                                    if (textView3 != null) {
                                        return new C36660c1((ScrollView) view, a2, constraintLayout, shimmerFrameLayout, textView, textView2, imageView, gridLayout, textView3);
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
    public static C36660c1 m150370c(@C0359n0 LayoutInflater layoutInflater) {
        return m150371d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36660c1 m150371d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_channels_fid, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150369a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f90626a;
    }
}
