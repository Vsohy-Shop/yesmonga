package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;

/* renamed from: com.carrefour.fid.android.databinding.g */
public final class C36698g implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final MessageComponent f90852a;

    public C36698g(@C0359n0 MessageComponent messageComponent) {
        this.f90852a = messageComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C36698g m150519a(@C0359n0 View view) {
        if (view != null) {
            return new C36698g((MessageComponent) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36698g m150520c(@C0359n0 LayoutInflater layoutInflater) {
        return m150521d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36698g m150521d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.basket_builder_sign_in_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150519a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public MessageComponent getRoot() {
        return this.f90852a;
    }
}
