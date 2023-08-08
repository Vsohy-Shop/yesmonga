package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.account.C13144b;

/* renamed from: com.carrefour.fid.android.account.databinding.p */
public final class C13229p implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f32544a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f32545b;
    @C0359n0

    /* renamed from: c */
    public final TextView f32546c;

    public C13229p(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 TextView textView) {
        this.f32544a = constraintLayout;
        this.f32545b = recyclerView;
        this.f32546c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C13229p m57323a(@C0359n0 View view) {
        int i = C13144b.C13154j.holder_account_address_verification_suggestions_list;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
        if (recyclerView != null) {
            i = C13144b.C13154j.holder_account_address_verification_suggestions_title_textview;
            TextView textView = (TextView) C20753c.m96463a(view, i);
            if (textView != null) {
                return new C13229p((ConstraintLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C13229p m57324c(@C0359n0 LayoutInflater layoutInflater) {
        return m57325d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13229p m57325d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.holder_verify_user_address_suggestions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57323a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f32544a;
    }
}
