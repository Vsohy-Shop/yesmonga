package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.s */
public final class C36818s implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f91600a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91601b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f91602c;
    @C0359n0

    /* renamed from: d */
    public final ProgressBar f91603d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91604e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91605f;

    public C36818s(@C0359n0 View view, @C0359n0 TextView textView, @C0359n0 LinearLayout linearLayout, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f91600a = view;
        this.f91601b = textView;
        this.f91602c = linearLayout;
        this.f91603d = progressBar;
        this.f91604e = textView2;
        this.f91605f = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36818s m150995a(@C0359n0 View view) {
        int i = R.id.firstStep;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.firstStep);
        if (textView != null) {
            i = R.id.layoutIndicator;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.layoutIndicator);
            if (linearLayout != null) {
                i = R.id.progressStep;
                ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progressStep);
                if (progressBar != null) {
                    i = R.id.secondStep;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.secondStep);
                    if (textView2 != null) {
                        i = R.id.thirdStep;
                        TextView textView3 = (TextView) C20753c.m96463a(view, R.id.thirdStep);
                        if (textView3 != null) {
                            return new C36818s(view, textView, linearLayout, progressBar, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C36818s m150996b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.custom_step_view, viewGroup);
            return m150995a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f91600a;
    }
}
