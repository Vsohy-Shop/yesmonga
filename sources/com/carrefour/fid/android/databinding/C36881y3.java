package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.y3 */
public final class C36881y3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TextView f91970a;

    public C36881y3(@C0359n0 TextView textView) {
        this.f91970a = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36881y3 m151239a(@C0359n0 View view) {
        if (view != null) {
            return new C36881y3((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36881y3 m151240c(@C0359n0 LayoutInflater layoutInflater) {
        return m151241d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36881y3 m151241d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_account_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151239a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TextView getRoot() {
        return this.f91970a;
    }
}
