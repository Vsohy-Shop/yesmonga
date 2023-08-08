package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.k4 */
public final class C36743k4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f91140a;

    public C36743k4(@C0359n0 FrameLayout frameLayout) {
        this.f91140a = frameLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C36743k4 m150699a(@C0359n0 View view) {
        if (view != null) {
            return new C36743k4((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36743k4 m150700c(@C0359n0 LayoutInflater layoutInflater) {
        return m150701d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36743k4 m150701d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_offer_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150699a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f91140a;
    }
}
