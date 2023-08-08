package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.b */
public final class C37031b implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92563a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92564b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f92565c;

    public C37031b(@C0359n0 View view, @C0359n0 TextView textView, @C0359n0 ImageView imageView) {
        this.f92563a = view;
        this.f92564b = textView;
        this.f92565c = imageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37031b m151935a(@C0359n0 View view) {
        int i = C36896b.C36906j.address_text;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C36896b.C36906j.picto_image;
            ImageView imageView = (ImageView) C20753c.m96463a(view, i);
            if (imageView != null) {
                return new C37031b(view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37031b m151936b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_address_box, viewGroup);
            return m151935a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92563a;
    }
}
