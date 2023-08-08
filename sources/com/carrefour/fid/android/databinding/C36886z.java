package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.z */
public final class C36886z implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FragmentContainerView f91992a;
    @C0359n0

    /* renamed from: b */
    public final FragmentContainerView f91993b;

    public C36886z(@C0359n0 FragmentContainerView fragmentContainerView, @C0359n0 FragmentContainerView fragmentContainerView2) {
        this.f91992a = fragmentContainerView;
        this.f91993b = fragmentContainerView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36886z m151257a(@C0359n0 View view) {
        if (view != null) {
            FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
            return new C36886z(fragmentContainerView, fragmentContainerView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36886z m151258c(@C0359n0 LayoutInflater layoutInflater) {
        return m151259d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36886z m151259d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151257a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FragmentContainerView getRoot() {
        return this.f91992a;
    }
}
