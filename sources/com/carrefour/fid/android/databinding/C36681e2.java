package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;

/* renamed from: com.carrefour.fid.android.databinding.e2 */
public final class C36681e2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f90757a;
    @C0359n0

    /* renamed from: b */
    public final MessageComponent f90758b;

    public C36681e2(@C0359n0 FrameLayout frameLayout, @C0359n0 MessageComponent messageComponent) {
        this.f90757a = frameLayout;
        this.f90758b = messageComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C36681e2 m150453a(@C0359n0 View view) {
        MessageComponent messageComponent = (MessageComponent) C20753c.m96463a(view, R.id.additional_order_expired_view);
        if (messageComponent != null) {
            return new C36681e2((FrameLayout) view, messageComponent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.additional_order_expired_view)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36681e2 m150454c(@C0359n0 LayoutInflater layoutInflater) {
        return m150455d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36681e2 m150455d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_expired_additional_order_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150453a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f90757a;
    }
}
