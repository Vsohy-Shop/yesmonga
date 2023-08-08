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

/* renamed from: com.carrefour.fid.android.databinding.f4 */
public final class C36693f4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90808a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f90809b;

    public C36693f4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView) {
        this.f90808a = constraintLayout;
        this.f90809b = composeView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36693f4 m150499a(@C0359n0 View view) {
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.button_empty_basket);
        if (composeView != null) {
            return new C36693f4((ConstraintLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.button_empty_basket)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36693f4 m150500c(@C0359n0 LayoutInflater layoutInflater) {
        return m150501d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36693f4 m150501d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_offer_basket_clear, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150499a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90808a;
    }
}
