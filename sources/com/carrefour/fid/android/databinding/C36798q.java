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

/* renamed from: com.carrefour.fid.android.databinding.q */
public final class C36798q implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f91513a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91514b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91515c;

    public C36798q(@C0359n0 View view, @C0359n0 ImageView imageView, @C0359n0 TextView textView) {
        this.f91513a = view;
        this.f91514b = imageView;
        this.f91515c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36798q m150919a(@C0359n0 View view) {
        int i = R.id.image_criteo_banner;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_criteo_banner);
        if (imageView != null) {
            i = R.id.text_criteo_banner;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_criteo_banner);
            if (textView != null) {
                return new C36798q(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C36798q m150920b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.criteo_mini_banner_layout, viewGroup);
            return m150919a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f91513a;
    }
}
