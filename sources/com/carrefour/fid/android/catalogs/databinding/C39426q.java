package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.catalogs.C39364b;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.q */
public final class C39426q implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f100894a;
    @C0359n0

    /* renamed from: b */
    public final MessageComponent f100895b;

    public C39426q(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MessageComponent messageComponent) {
        this.f100894a = constraintLayout;
        this.f100895b = messageComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C39426q m161593a(@C0359n0 View view) {
        int i = C39364b.C39374j.message_component;
        MessageComponent messageComponent = (MessageComponent) C20753c.m96463a(view, i);
        if (messageComponent != null) {
            return new C39426q((ConstraintLayout) view, messageComponent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39426q m161594c(@C0359n0 LayoutInflater layoutInflater) {
        return m161595d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39426q m161595d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.holder_message_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161593a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100894a;
    }
}
