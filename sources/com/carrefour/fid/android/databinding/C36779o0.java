package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.o0 */
public final class C36779o0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91399a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f91400b;
    @C0359n0

    /* renamed from: c */
    public final ProgressBar f91401c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91402d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91403e;

    public C36779o0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91399a = constraintLayout;
        this.f91400b = recyclerView;
        this.f91401c = progressBar;
        this.f91402d = textView;
        this.f91403e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36779o0 m150843a(@C0359n0 View view) {
        int i = R.id.list_app_environment;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_app_environment);
        if (recyclerView != null) {
            i = R.id.progress_app_environment;
            ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progress_app_environment);
            if (progressBar != null) {
                i = R.id.text_app_environment_confirm;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_app_environment_confirm);
                if (textView != null) {
                    i = R.id.text_app_environment_title;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_app_environment_title);
                    if (textView2 != null) {
                        return new C36779o0((ConstraintLayout) view, recyclerView, progressBar, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36779o0 m150844c(@C0359n0 LayoutInflater layoutInflater) {
        return m150845d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36779o0 m150845d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_app_environment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150843a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91399a;
    }
}
