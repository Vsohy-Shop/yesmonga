package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.f */
public final class C36688f implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f90775a;
    @C0359n0

    /* renamed from: b */
    public final LinearLayout f90776b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f90777c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f90778d;
    @C0359n0

    /* renamed from: e */
    public final TextView f90779e;

    public C36688f(@C0359n0 View view, @C0359n0 LinearLayout linearLayout, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 TextView textView) {
        this.f90775a = view;
        this.f90776b = linearLayout;
        this.f90777c = imageView;
        this.f90778d = imageView2;
        this.f90779e = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36688f m150481a(@C0359n0 View view) {
        int i = R.id.barcodeContainer;
        LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.barcodeContainer);
        if (linearLayout != null) {
            i = R.id.barcodeImageView;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.barcodeImageView);
            if (imageView != null) {
                i = R.id.bgCard;
                ImageView imageView2 = (ImageView) C20753c.m96463a(view, R.id.bgCard);
                if (imageView2 != null) {
                    i = R.id.cardNumberTextView;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.cardNumberTextView);
                    if (textView != null) {
                        return new C36688f(view, linearLayout, imageView, imageView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C36688f m150482b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.barcode_card_layout, viewGroup);
            return m150481a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f90775a;
    }
}
