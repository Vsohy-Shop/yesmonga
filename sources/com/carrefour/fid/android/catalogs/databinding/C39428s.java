package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.catalogs.C39364b;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.s */
public final class C39428s implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f100898a;
    @C0359n0

    /* renamed from: b */
    public final Button f100899b;

    public C39428s(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button) {
        this.f100898a = constraintLayout;
        this.f100899b = button;
    }

    @C0359n0
    /* renamed from: a */
    public static C39428s m161601a(@C0359n0 View view) {
        int i = C39364b.C39374j.see_all_catalogs_button;
        Button button = (Button) C20753c.m96463a(view, i);
        if (button != null) {
            return new C39428s((ConstraintLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39428s m161602c(@C0359n0 LayoutInflater layoutInflater) {
        return m161603d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39428s m161603d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.holder_see_all_catalogs_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161601a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100898a;
    }
}
