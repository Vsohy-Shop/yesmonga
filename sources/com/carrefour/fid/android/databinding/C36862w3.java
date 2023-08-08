package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.w3 */
public final class C36862w3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91847a;
    @C0359n0

    /* renamed from: b */
    public final View f91848b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91849c;

    public C36862w3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 TextView textView) {
        this.f91847a = constraintLayout;
        this.f91848b = view;
        this.f91849c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36862w3 m151165a(@C0359n0 View view) {
        int i = R.id.line;
        View a = C20753c.m96463a(view, R.id.line);
        if (a != null) {
            i = R.id.productOriginesPlaceholder;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.productOriginesPlaceholder);
            if (textView != null) {
                return new C36862w3((ConstraintLayout) view, a, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36862w3 m151166c(@C0359n0 LayoutInflater layoutInflater) {
        return m151167d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36862w3 m151167d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.header_basket_placeholder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151165a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91847a;
    }
}
