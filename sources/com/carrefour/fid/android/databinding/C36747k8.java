package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.k8 */
public final class C36747k8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CardView f91156a;
    @C0359n0

    /* renamed from: b */
    public final Button f91157b;
    @C0359n0

    /* renamed from: c */
    public final Button f91158c;

    public C36747k8(@C0359n0 CardView cardView, @C0359n0 Button button, @C0359n0 Button button2) {
        this.f91156a = cardView;
        this.f91157b = button;
        this.f91158c = button2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36747k8 m150715a(@C0359n0 View view) {
        int i = R.id.customerServiceBtn;
        Button button = (Button) C20753c.m96463a(view, R.id.customerServiceBtn);
        if (button != null) {
            i = R.id.laterBtn;
            Button button2 = (Button) C20753c.m96463a(view, R.id.laterBtn);
            if (button2 != null) {
                return new C36747k8((CardView) view, button, button2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36747k8 m150716c(@C0359n0 LayoutInflater layoutInflater) {
        return m150717d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36747k8 m150717d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.terminal_card_error_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150715a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CardView getRoot() {
        return this.f91156a;
    }
}
