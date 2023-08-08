package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.o6 */
public final class C36785o6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CardView f91446a;

    public C36785o6(@C0359n0 CardView cardView) {
        this.f91446a = cardView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36785o6 m150867a(@C0359n0 View view) {
        if (view != null) {
            return new C36785o6((CardView) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36785o6 m150868c(@C0359n0 LayoutInflater layoutInflater) {
        return m150869d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36785o6 m150869d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.loyalty_amount_history_placeholder_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150867a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CardView getRoot() {
        return this.f91446a;
    }
}
