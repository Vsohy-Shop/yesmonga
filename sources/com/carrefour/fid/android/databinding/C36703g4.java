package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.g4 */
public final class C36703g4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ComposeView f90892a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f90893b;

    public C36703g4(@C0359n0 ComposeView composeView, @C0359n0 ComposeView composeView2) {
        this.f90892a = composeView;
        this.f90893b = composeView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36703g4 m150539a(@C0359n0 View view) {
        if (view != null) {
            ComposeView composeView = (ComposeView) view;
            return new C36703g4(composeView, composeView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36703g4 m150540c(@C0359n0 LayoutInflater layoutInflater) {
        return m150541d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36703g4 m150541d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_offer_basket_contain_alcohol, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150539a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ComposeView getRoot() {
        return this.f90892a;
    }
}
