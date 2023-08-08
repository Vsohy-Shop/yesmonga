package com.carrefour.fid.android.checkout.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.checkout.C39805b;

/* renamed from: com.carrefour.fid.android.checkout.databinding.d */
public final class C39844d implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f101637a;

    public C39844d(@C0359n0 FrameLayout frameLayout) {
        this.f101637a = frameLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C39844d m162441a(@C0359n0 View view) {
        if (view != null) {
            return new C39844d((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C39844d m162442c(@C0359n0 LayoutInflater layoutInflater) {
        return m162443d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39844d m162443d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39805b.C39818m.holder_service_slot_bottom, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m162441a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f101637a;
    }
}
