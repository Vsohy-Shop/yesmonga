package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.r */
public final class C36808r implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayoutCompat f91555a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91556b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91557c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91558d;

    public C36808r(@C0359n0 LinearLayoutCompat linearLayoutCompat, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91555a = linearLayoutCompat;
        this.f91556b = imageView;
        this.f91557c = textView;
        this.f91558d = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36808r m150955a(@C0359n0 View view) {
        int i = R.id.barcode_image_view;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.barcode_image_view);
        if (imageView != null) {
            i = R.id.card_holder_name;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.card_holder_name);
            if (textView != null) {
                i = R.id.card_number;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.card_number);
                if (textView2 != null) {
                    return new C36808r((LinearLayoutCompat) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36808r m150956c(@C0359n0 LayoutInflater layoutInflater) {
        return m150957d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36808r m150957d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.custom_fid_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150955a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayoutCompat getRoot() {
        return this.f91555a;
    }
}
