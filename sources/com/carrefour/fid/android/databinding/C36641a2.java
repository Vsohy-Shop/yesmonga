package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.BasicToolbarComponent;
import com.carrefour.fid.android.widget.StepBarView;

/* renamed from: com.carrefour.fid.android.databinding.a2 */
public final class C36641a2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90549a;
    @C0359n0

    /* renamed from: b */
    public final StepBarView f90550b;
    @C0359n0

    /* renamed from: c */
    public final BasicToolbarComponent f90551c;

    public C36641a2(@C0359n0 LinearLayout linearLayout, @C0359n0 StepBarView stepBarView, @C0359n0 BasicToolbarComponent basicToolbarComponent) {
        this.f90549a = linearLayout;
        this.f90550b = stepBarView;
        this.f90551c = basicToolbarComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C36641a2 m150293a(@C0359n0 View view) {
        int i = R.id.step_indicator;
        StepBarView stepBarView = (StepBarView) C20753c.m96463a(view, R.id.step_indicator);
        if (stepBarView != null) {
            i = R.id.toolbar_create_loyalty;
            BasicToolbarComponent basicToolbarComponent = (BasicToolbarComponent) C20753c.m96463a(view, R.id.toolbar_create_loyalty);
            if (basicToolbarComponent != null) {
                return new C36641a2((LinearLayout) view, stepBarView, basicToolbarComponent);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36641a2 m150294c(@C0359n0 LayoutInflater layoutInflater) {
        return m150295d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36641a2 m150295d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_create_secret_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150293a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90549a;
    }
}
