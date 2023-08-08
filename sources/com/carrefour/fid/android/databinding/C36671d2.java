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

/* renamed from: com.carrefour.fid.android.databinding.d2 */
public final class C36671d2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f90715a;
    @C0359n0

    /* renamed from: b */
    public final MessageComponent f90716b;

    public C36671d2(@C0359n0 FrameLayout frameLayout, @C0359n0 MessageComponent messageComponent) {
        this.f90715a = frameLayout;
        this.f90716b = messageComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C36671d2 m150413a(@C0359n0 View view) {
        MessageComponent messageComponent = (MessageComponent) C20753c.m96463a(view, R.id.additional_order_cancel_view);
        if (messageComponent != null) {
            return new C36671d2((FrameLayout) view, messageComponent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.additional_order_cancel_view)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36671d2 m150414c(@C0359n0 LayoutInflater layoutInflater) {
        return m150415d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36671d2 m150415d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_exit_additional_order_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150413a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f90715a;
    }
}
