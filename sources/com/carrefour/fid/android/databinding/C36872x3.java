package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.x3 */
public final class C36872x3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TextView f91903a;

    public C36872x3(@C0359n0 TextView textView) {
        this.f91903a = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36872x3 m151203a(@C0359n0 View view) {
        if (view != null) {
            return new C36872x3((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36872x3 m151204c(@C0359n0 LayoutInflater layoutInflater) {
        return m151205d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36872x3 m151205d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_account_list_category, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151203a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TextView getRoot() {
        return this.f91903a;
    }
}
