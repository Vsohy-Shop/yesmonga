package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.g0 */
public final class C36699g0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90853a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f90854b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatTextView f90855c;
    @C0359n0

    /* renamed from: d */
    public final MessageComponent f90856d;
    @C0359n0

    /* renamed from: e */
    public final AppCompatTextView f90857e;
    @C0359n0

    /* renamed from: f */
    public final AppCompatImageView f90858f;
    @C0359n0

    /* renamed from: g */
    public final Group f90859g;

    public C36699g0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 AppCompatTextView appCompatTextView, @C0359n0 MessageComponent messageComponent, @C0359n0 AppCompatTextView appCompatTextView2, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 Group group) {
        this.f90853a = constraintLayout;
        this.f90854b = materialButton;
        this.f90855c = appCompatTextView;
        this.f90856d = messageComponent;
        this.f90857e = appCompatTextView2;
        this.f90858f = appCompatImageView;
        this.f90859g = group;
    }

    @C0359n0
    /* renamed from: a */
    public static C36699g0 m150523a(@C0359n0 View view) {
        int i = R.id.additional_order_add_products;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, R.id.additional_order_add_products);
        if (materialButton != null) {
            i = R.id.additional_order_description;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, R.id.additional_order_description);
            if (appCompatTextView != null) {
                i = R.id.additional_order_error_view;
                MessageComponent messageComponent = (MessageComponent) C20753c.m96463a(view, R.id.additional_order_error_view);
                if (messageComponent != null) {
                    i = R.id.additional_order_title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C20753c.m96463a(view, R.id.additional_order_title);
                    if (appCompatTextView2 != null) {
                        i = R.id.additional_order_valid;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, R.id.additional_order_valid);
                        if (appCompatImageView != null) {
                            i = R.id.additional_order_valid_group;
                            Group group = (Group) C20753c.m96463a(view, R.id.additional_order_valid_group);
                            if (group != null) {
                                return new C36699g0((ConstraintLayout) view, materialButton, appCompatTextView, messageComponent, appCompatTextView2, appCompatImageView, group);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36699g0 m150524c(@C0359n0 LayoutInflater layoutInflater) {
        return m150525d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36699g0 m150525d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_additional_order_buttom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150523a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90853a;
    }
}
