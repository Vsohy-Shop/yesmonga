package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.o2 */
public final class C36781o2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91420a;
    @C0359n0

    /* renamed from: b */
    public final AppCompatTextView f91421b;

    public C36781o2(@C0359n0 LinearLayout linearLayout, @C0359n0 AppCompatTextView appCompatTextView) {
        this.f91420a = linearLayout;
        this.f91421b = appCompatTextView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36781o2 m150851a(@C0359n0 View view) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, R.id.list_child);
        if (appCompatTextView != null) {
            return new C36781o2((LinearLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.list_child)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36781o2 m150852c(@C0359n0 LayoutInflater layoutInflater) {
        return m150853d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36781o2 m150853d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_loyalty_history_date_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150851a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91420a;
    }
}
