package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.i0 */
public final class C27493i0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f66693a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f66694b;
    @C0359n0

    /* renamed from: c */
    public final TextView f66695c;

    public C27493i0(@C0359n0 View view, @C0359n0 ImageView imageView, @C0359n0 TextView textView) {
        this.f66693a = view;
        this.f66694b = imageView;
        this.f66695c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C27493i0 m115697a(@C0359n0 View view) {
        int i = C27609f.C27619j.image_holder_ecoscore;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            i = C27609f.C27619j.text_holder_ecoscore;
            TextView textView = (TextView) C20753c.m96463a(view, i);
            if (textView != null) {
                return new C27493i0(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C27493i0 m115698b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C27609f.C27622m.view_image_ecoscore, viewGroup);
            return m115697a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f66693a;
    }
}
