package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.design.components.databinding.g */
public final class C37046g implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92648a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f92649b;
    @C0359n0

    /* renamed from: c */
    public final View f92650c;
    @C0359n0

    /* renamed from: d */
    public final AppCompatImageView f92651d;
    @C0359n0

    /* renamed from: e */
    public final AppCompatTextView f92652e;

    public C37046g(@C0359n0 View view, @C0359n0 MaterialButton materialButton, @C0359n0 View view2, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 AppCompatTextView appCompatTextView) {
        this.f92648a = view;
        this.f92649b = materialButton;
        this.f92650c = view2;
        this.f92651d = appCompatImageView;
        this.f92652e = appCompatTextView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.timer_background_view;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.design.components.databinding.C37046g m151971a(@androidx.annotation.C0359n0 android.view.View r8) {
        /*
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.cancel_timer_button
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r8, r0)
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r4 == 0) goto L_0x0031
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.timer_background_view
            android.view.View r5 = androidx.viewbinding.C20753c.m96463a(r8, r0)
            if (r5 == 0) goto L_0x0031
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.timer_icon
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r8, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            if (r6 == 0) goto L_0x0031
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.timer_message_text
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r8, r0)
            r7 = r1
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            if (r7 == 0) goto L_0x0031
            com.carrefour.fid.android.design.components.databinding.g r0 = new com.carrefour.fid.android.design.components.databinding.g
            r2 = r0
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0031:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.databinding.C37046g.m151971a(android.view.View):com.carrefour.fid.android.design.components.databinding.g");
    }

    @C0359n0
    /* renamed from: b */
    public static C37046g m151972b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_count_down_timer, viewGroup);
            return m151971a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92648a;
    }
}
