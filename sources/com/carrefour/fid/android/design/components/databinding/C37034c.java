package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.c */
public final class C37034c implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f92580a;
    @C0359n0

    /* renamed from: b */
    public final FrameLayout f92581b;
    @C0359n0

    /* renamed from: c */
    public final View f92582c;

    public C37034c(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 FrameLayout frameLayout, @C0359n0 View view) {
        this.f92580a = constraintLayout;
        this.f92581b = frameLayout;
        this.f92582c = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.backdrop_handle;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.design.components.databinding.C37034c m151941a(@androidx.annotation.C0359n0 android.view.View r3) {
        /*
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.backdrop_fragment_container
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r3, r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            if (r1 == 0) goto L_0x001a
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.backdrop_handle
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r3, r0)
            if (r2 == 0) goto L_0x001a
            com.carrefour.fid.android.design.components.databinding.c r0 = new com.carrefour.fid.android.design.components.databinding.c
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r0.<init>(r3, r1, r2)
            return r0
        L_0x001a:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.databinding.C37034c.m151941a(android.view.View):com.carrefour.fid.android.design.components.databinding.c");
    }

    @C0359n0
    /* renamed from: c */
    public static C37034c m151942c(@C0359n0 LayoutInflater layoutInflater) {
        return m151943d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37034c m151943d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_backdrop, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151941a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92580a;
    }
}
