package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.r */
public final class C37073r implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f92796a;

    public C37073r(@C0359n0 FrameLayout frameLayout) {
        this.f92796a = frameLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C37073r m152047a(@C0359n0 View view) {
        if (view != null) {
            return new C37073r((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C37073r m152048c(@C0359n0 LayoutInflater layoutInflater) {
        return m152049d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37073r m152049d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_infinite_list_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m152047a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f92796a;
    }
}
