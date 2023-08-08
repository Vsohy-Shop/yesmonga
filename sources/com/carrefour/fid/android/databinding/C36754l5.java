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

/* renamed from: com.carrefour.fid.android.databinding.l5 */
public final class C36754l5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91217a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f91218b;

    public C36754l5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView) {
        this.f91217a = constraintLayout;
        this.f91218b = composeView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36754l5 m150743a(@C0359n0 View view) {
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.card_holder_order_details_digital_item);
        if (composeView != null) {
            return new C36754l5((ConstraintLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.card_holder_order_details_digital_item)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36754l5 m150744c(@C0359n0 LayoutInflater layoutInflater) {
        return m150745d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36754l5 m150745d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_online_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150743a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91217a;
    }
}
