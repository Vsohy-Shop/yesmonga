package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.a */
public final class C36638a implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CardView f90534a;
    @C0359n0

    /* renamed from: b */
    public final Button f90535b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f90536c;

    public C36638a(@C0359n0 CardView cardView, @C0359n0 Button button, @C0359n0 ImageView imageView) {
        this.f90534a = cardView;
        this.f90535b = button;
        this.f90536c = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36638a m150281a(@C0359n0 View view) {
        int i = R.id.activateCardNowBtn;
        Button button = (Button) C20753c.m96463a(view, R.id.activateCardNowBtn);
        if (button != null) {
            i = R.id.closeActiveFidPopIn;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.closeActiveFidPopIn);
            if (imageView != null) {
                return new C36638a((CardView) view, button, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36638a m150282c(@C0359n0 LayoutInflater layoutInflater) {
        return m150283d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36638a m150283d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.active_fid_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150281a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CardView getRoot() {
        return this.f90534a;
    }
}
