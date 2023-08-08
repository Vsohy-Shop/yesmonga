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

/* renamed from: com.carrefour.fid.android.databinding.f7 */
public final class C36696f7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90847a;
    @C0359n0

    /* renamed from: b */
    public final TextView f90848b;

    public C36696f7(@C0359n0 LinearLayout linearLayout, @C0359n0 TextView textView) {
        this.f90847a = linearLayout;
        this.f90848b = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36696f7 m150511a(@C0359n0 View view) {
        TextView textView = (TextView) C20753c.m96463a(view, R.id.body);
        if (textView != null) {
            return new C36696f7((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.body)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36696f7 m150512c(@C0359n0 LayoutInflater layoutInflater) {
        return m150513d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36696f7 m150513d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.security_alert_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150511a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90847a;
    }
}
