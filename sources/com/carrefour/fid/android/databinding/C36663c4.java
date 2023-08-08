package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.CurrentOfferComponent;

/* renamed from: com.carrefour.fid.android.databinding.c4 */
public final class C36663c4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CurrentOfferComponent f90646a;
    @C0359n0

    /* renamed from: b */
    public final CurrentOfferComponent f90647b;

    public C36663c4(@C0359n0 CurrentOfferComponent currentOfferComponent, @C0359n0 CurrentOfferComponent currentOfferComponent2) {
        this.f90646a = currentOfferComponent;
        this.f90647b = currentOfferComponent2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36663c4 m150381a(@C0359n0 View view) {
        if (view != null) {
            CurrentOfferComponent currentOfferComponent = (CurrentOfferComponent) view;
            return new C36663c4(currentOfferComponent, currentOfferComponent);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36663c4 m150382c(@C0359n0 LayoutInflater layoutInflater) {
        return m150383d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36663c4 m150383d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_home_cms_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150381a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CurrentOfferComponent getRoot() {
        return this.f90646a;
    }
}
