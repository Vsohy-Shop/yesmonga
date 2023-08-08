package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.q6 */
public final class C36805q6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f91543a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91544b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91545c;

    public C36805q6(@C0359n0 View view, @C0359n0 ImageView imageView, @C0359n0 TextView textView) {
        this.f91543a = view;
        this.f91544b = imageView;
        this.f91545c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36805q6 m150945a(@C0359n0 View view) {
        int i = R.id.lucky_cart_banner_image;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.lucky_cart_banner_image);
        if (imageView != null) {
            i = R.id.lucky_cart_banner_title;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.lucky_cart_banner_title);
            if (textView != null) {
                return new C36805q6(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C36805q6 m150946b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.lucky_cart_banner_layout, viewGroup);
            return m150945a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f91543a;
    }
}
