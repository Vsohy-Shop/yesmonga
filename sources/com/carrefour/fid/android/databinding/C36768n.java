package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.n */
public final class C36768n implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91343a;
    @C0359n0

    /* renamed from: b */
    public final RelativeLayout f91344b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91345c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91346d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91347e;

    public C36768n(@C0359n0 LinearLayout linearLayout, @C0359n0 RelativeLayout relativeLayout, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91343a = linearLayout;
        this.f91344b = relativeLayout;
        this.f91345c = imageView;
        this.f91346d = textView;
        this.f91347e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36768n m150799a(@C0359n0 View view) {
        int i = R.id.barcodeContainer;
        RelativeLayout relativeLayout = (RelativeLayout) C20753c.m96463a(view, R.id.barcodeContainer);
        if (relativeLayout != null) {
            i = R.id.barcodeImageView;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.barcodeImageView);
            if (imageView != null) {
                i = R.id.cardNumberTextView;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.cardNumberTextView);
                if (textView != null) {
                    i = R.id.codebarTitleRemise;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.codebarTitleRemise);
                    if (textView2 != null) {
                        return new C36768n((LinearLayout) view, relativeLayout, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36768n m150800c(@C0359n0 LayoutInflater layoutInflater) {
        return m150801d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36768n m150801d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.coupon_barcode_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150799a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91343a;
    }
}
