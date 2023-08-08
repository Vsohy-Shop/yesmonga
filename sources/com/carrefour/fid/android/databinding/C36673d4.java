package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.d4 */
public final class C36673d4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TextView f90720a;

    public C36673d4(@C0359n0 TextView textView) {
        this.f90720a = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36673d4 m150421a(@C0359n0 View view) {
        if (view != null) {
            return new C36673d4((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36673d4 m150422c(@C0359n0 LayoutInflater layoutInflater) {
        return m150423d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36673d4 m150423d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_legal_notice, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150421a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TextView getRoot() {
        return this.f90720a;
    }
}
