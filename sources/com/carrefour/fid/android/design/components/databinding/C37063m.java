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

/* renamed from: com.carrefour.fid.android.design.components.databinding.m */
public final class C37063m implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92717a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92718b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f92719c;
    @C0359n0

    /* renamed from: d */
    public final TextView f92720d;

    public C37063m(@C0359n0 View view, @C0359n0 TextView textView, @C0359n0 ImageView imageView, @C0359n0 TextView textView2) {
        this.f92717a = view;
        this.f92718b = textView;
        this.f92719c = imageView;
        this.f92720d = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37063m m152023a(@C0359n0 View view) {
        int i = C36896b.C36906j.favorite_store_description;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C36896b.C36906j.favorite_store_icon;
            ImageView imageView = (ImageView) C20753c.m96463a(view, i);
            if (imageView != null) {
                i = C36896b.C36906j.favorite_store_name;
                TextView textView2 = (TextView) C20753c.m96463a(view, i);
                if (textView2 != null) {
                    return new C37063m(view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37063m m152024b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_favorite_store, viewGroup);
            return m152023a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92717a;
    }
}
