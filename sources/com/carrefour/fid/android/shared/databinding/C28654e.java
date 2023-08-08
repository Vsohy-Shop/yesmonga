package com.carrefour.fid.android.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.shared.C28444b;

/* renamed from: com.carrefour.fid.android.shared.databinding.e */
public final class C28654e implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f70262a;
    @C0359n0

    /* renamed from: b */
    public final MessageComponent f70263b;

    public C28654e(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MessageComponent messageComponent) {
        this.f70262a = constraintLayout;
        this.f70263b = messageComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C28654e m118636a(@C0359n0 View view) {
        int i = C28444b.C28454j.message_component;
        MessageComponent messageComponent = (MessageComponent) C20753c.m96463a(view, i);
        if (messageComponent != null) {
            return new C28654e((ConstraintLayout) view, messageComponent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C28654e m118637c(@C0359n0 LayoutInflater layoutInflater) {
        return m118638d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C28654e m118638d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28444b.C28457m.fragment_message_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m118636a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f70262a;
    }
}
