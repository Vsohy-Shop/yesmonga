package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.i7 */
public final class C36726i7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91029a;
    @C0359n0

    /* renamed from: b */
    public final Button f91030b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91031c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91032d;

    public C36726i7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91029a = constraintLayout;
        this.f91030b = button;
        this.f91031c = textView;
        this.f91032d = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36726i7 m150631a(@C0359n0 View view) {
        int i = R.id.service_attach_fid;
        Button button = (Button) C20753c.m96463a(view, R.id.service_attach_fid);
        if (button != null) {
            i = R.id.service_create_fid;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.service_create_fid);
            if (textView != null) {
                i = R.id.service_title;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.service_title);
                if (textView2 != null) {
                    return new C36726i7((ConstraintLayout) view, button, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36726i7 m150632c(@C0359n0 LayoutInflater layoutInflater) {
        return m150633d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36726i7 m150633d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.service_no_fid_bloc, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150631a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91029a;
    }
}
