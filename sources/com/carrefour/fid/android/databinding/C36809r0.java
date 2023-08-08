package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.r0 */
public final class C36809r0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f91559a;

    public C36809r0(@C0359n0 FrameLayout frameLayout) {
        this.f91559a = frameLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C36809r0 m150959a(@C0359n0 View view) {
        if (view != null) {
            return new C36809r0((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36809r0 m150960c(@C0359n0 LayoutInflater layoutInflater) {
        return m150961d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36809r0 m150961d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_base_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150959a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f91559a;
    }
}
