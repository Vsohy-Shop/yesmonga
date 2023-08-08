package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.b4 */
public final class C36653b4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TextView f90604a;
    @C0359n0

    /* renamed from: b */
    public final TextView f90605b;

    public C36653b4(@C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f90604a = textView;
        this.f90605b = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36653b4 m150341a(@C0359n0 View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C36653b4(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36653b4 m150342c(@C0359n0 LayoutInflater layoutInflater) {
        return m150343d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36653b4 m150343d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_butterfly_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150341a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TextView getRoot() {
        return this.f90604a;
    }
}
