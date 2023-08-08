package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.g8 */
public final class C36707g8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90906a;
    @C0359n0

    /* renamed from: b */
    public final TextView f90907b;
    @C0359n0

    /* renamed from: c */
    public final TextView f90908c;
    @C0359n0

    /* renamed from: d */
    public final TextView f90909d;

    public C36707g8(@C0359n0 LinearLayout linearLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f90906a = linearLayout;
        this.f90907b = textView;
        this.f90908c = textView2;
        this.f90909d = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36707g8 m150555a(@C0359n0 View view) {
        int i = R.id.dayNameText;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.dayNameText);
        if (textView != null) {
            i = R.id.openingRange;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.openingRange);
            if (textView2 != null) {
                i = R.id.passDay;
                TextView textView3 = (TextView) C20753c.m96463a(view, R.id.passDay);
                if (textView3 != null) {
                    return new C36707g8((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36707g8 m150556c(@C0359n0 LayoutInflater layoutInflater) {
        return m150557d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36707g8 m150557d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.store_hour_day_cell, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150555a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90906a;
    }
}
