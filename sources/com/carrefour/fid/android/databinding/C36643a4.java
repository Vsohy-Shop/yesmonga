package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.a4 */
public final class C36643a4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final Button f90555a;

    public C36643a4(@C0359n0 Button button) {
        this.f90555a = button;
    }

    @C0359n0
    /* renamed from: a */
    public static C36643a4 m150301a(@C0359n0 View view) {
        if (view != null) {
            return new C36643a4((Button) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36643a4 m150302c(@C0359n0 LayoutInflater layoutInflater) {
        return m150303d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36643a4 m150303d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_app_environment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150301a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public Button getRoot() {
        return this.f90555a;
    }
}
