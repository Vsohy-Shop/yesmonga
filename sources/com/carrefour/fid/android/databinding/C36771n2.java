package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.n2 */
public final class C36771n2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final RelativeLayout f91356a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91357b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatTextView f91358c;

    public C36771n2(@C0359n0 RelativeLayout relativeLayout, @C0359n0 ImageView imageView, @C0359n0 AppCompatTextView appCompatTextView) {
        this.f91356a = relativeLayout;
        this.f91357b = imageView;
        this.f91358c = appCompatTextView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36771n2 m150811a(@C0359n0 View view) {
        int i = R.id.iv_indicator;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.iv_indicator);
        if (imageView != null) {
            i = R.id.list_header;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, R.id.list_header);
            if (appCompatTextView != null) {
                return new C36771n2((RelativeLayout) view, imageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36771n2 m150812c(@C0359n0 LayoutInflater layoutInflater) {
        return m150813d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36771n2 m150813d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_loyalty_history_date_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150811a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f91356a;
    }
}
