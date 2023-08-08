package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.v */
public final class C36848v implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ComposeView f91780a;

    public C36848v(@C0359n0 ComposeView composeView) {
        this.f91780a = composeView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36848v m151109a(@C0359n0 View view) {
        if (view != null) {
            return new C36848v((ComposeView) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36848v m151110c(@C0359n0 LayoutInflater layoutInflater) {
        return m151111d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36848v m151111d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_consent_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151109a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ComposeView getRoot() {
        return this.f91780a;
    }
}
