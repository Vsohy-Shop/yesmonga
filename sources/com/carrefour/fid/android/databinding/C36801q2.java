package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.q2 */
public final class C36801q2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91528a;
    @C0359n0

    /* renamed from: b */
    public final Button f91529b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91530c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91531d;

    public C36801q2(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView) {
        this.f91528a = constraintLayout;
        this.f91529b = button;
        this.f91530c = imageView;
        this.f91531d = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36801q2 m150929a(@C0359n0 View view) {
        int i = R.id.goToLoginView;
        Button button = (Button) C20753c.m96463a(view, R.id.goToLoginView);
        if (button != null) {
            i = R.id.loyaltyNotLoggedImage;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.loyaltyNotLoggedImage);
            if (imageView != null) {
                i = R.id.loyaltyNotLoggedTitle;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.loyaltyNotLoggedTitle);
                if (textView != null) {
                    return new C36801q2((ConstraintLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36801q2 m150930c(@C0359n0 LayoutInflater layoutInflater) {
        return m150931d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36801q2 m150931d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_loyalty_not_logged, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150929a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91528a;
    }
}
