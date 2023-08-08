package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.r3 */
public final class C36812r3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f91571a;
    @C0359n0

    /* renamed from: b */
    public final ShimmerFrameLayout f91572b;
    @C0359n0

    /* renamed from: c */
    public final C36746k7 f91573c;

    public C36812r3(@C0359n0 FrameLayout frameLayout, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 C36746k7 k7Var) {
        this.f91571a = frameLayout;
        this.f91572b = shimmerFrameLayout;
        this.f91573c = k7Var;
    }

    @C0359n0
    /* renamed from: a */
    public static C36812r3 m150971a(@C0359n0 View view) {
        int i = R.id.service_result_shimmer_container;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.service_result_shimmer_container);
        if (shimmerFrameLayout != null) {
            i = R.id.service_stations_result;
            View a = C20753c.m96463a(view, R.id.service_stations_result);
            if (a != null) {
                return new C36812r3((FrameLayout) view, shimmerFrameLayout, C36746k7.m150711a(a));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36812r3 m150972c(@C0359n0 LayoutInflater layoutInflater) {
        return m150973d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36812r3 m150973d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_service_stations_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150971a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f91571a;
    }
}
