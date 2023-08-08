package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.v3 */
public final class C36852v3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91796a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91797b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f91798c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91799d;

    public C36852v3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 LinearLayout linearLayout, @C0359n0 TextView textView) {
        this.f91796a = constraintLayout;
        this.f91797b = imageView;
        this.f91798c = linearLayout;
        this.f91799d = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36852v3 m151125a(@C0359n0 View view) {
        int i = R.id.ivBarreCode;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.ivBarreCode);
        if (imageView != null) {
            i = R.id.linearLayout2;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.linearLayout2);
            if (linearLayout != null) {
                i = R.id.tvNbrCommand;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.tvNbrCommand);
                if (textView != null) {
                    return new C36852v3((ConstraintLayout) view, imageView, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36852v3 m151126c(@C0359n0 LayoutInflater layoutInflater) {
        return m151127d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36852v3 m151127d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_withdrawal_order, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151125a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91796a;
    }
}
