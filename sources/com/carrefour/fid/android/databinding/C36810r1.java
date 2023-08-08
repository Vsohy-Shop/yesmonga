package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.r1 */
public final class C36810r1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91560a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f91561b;
    @C0359n0

    /* renamed from: c */
    public final ConstraintLayout f91562c;

    public C36810r1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView, @C0359n0 ConstraintLayout constraintLayout2) {
        this.f91560a = constraintLayout;
        this.f91561b = composeView;
        this.f91562c = constraintLayout2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36810r1 m150963a(@C0359n0 View view) {
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.bottom_sheet_backdrop);
        if (composeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new C36810r1(constraintLayout, composeView, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.bottom_sheet_backdrop)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36810r1 m150964c(@C0359n0 LayoutInflater layoutInflater) {
        return m150965d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36810r1 m150965d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_step_one_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150963a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91560a;
    }
}
