package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.design.components.databinding.s0 */
public final class C37076s0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f92810a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f92811b;
    @C0359n0

    /* renamed from: c */
    public final EditText f92812c;
    @C0359n0

    /* renamed from: d */
    public final TextView f92813d;
    @C0359n0

    /* renamed from: e */
    public final View f92814e;

    public C37076s0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 EditText editText, @C0359n0 TextView textView, @C0359n0 View view) {
        this.f92810a = constraintLayout;
        this.f92811b = materialButton;
        this.f92812c = editText;
        this.f92813d = textView;
        this.f92814e = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.search_list_item_underline;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.design.components.databinding.C37076s0 m152057a(@androidx.annotation.C0359n0 android.view.View r8) {
        /*
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.search_list_item_delete_button
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r8, r0)
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r4 == 0) goto L_0x0033
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.search_list_item_edit_text
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r8, r0)
            r5 = r1
            android.widget.EditText r5 = (android.widget.EditText) r5
            if (r5 == 0) goto L_0x0033
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.search_list_item_error_text_view
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r8, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0033
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36906j.search_list_item_underline
            android.view.View r7 = androidx.viewbinding.C20753c.m96463a(r8, r0)
            if (r7 == 0) goto L_0x0033
            com.carrefour.fid.android.design.components.databinding.s0 r0 = new com.carrefour.fid.android.design.components.databinding.s0
            r3 = r8
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0033:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.databinding.C37076s0.m152057a(android.view.View):com.carrefour.fid.android.design.components.databinding.s0");
    }

    @C0359n0
    /* renamed from: c */
    public static C37076s0 m152058c(@C0359n0 LayoutInflater layoutInflater) {
        return m152059d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37076s0 m152059d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_search_with_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m152057a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92810a;
    }
}
