package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.d1 */
public final class C37039d1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92606a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92607b;
    @C0359n0

    /* renamed from: c */
    public final TextView f92608c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f92609d;
    @C0359n0

    /* renamed from: e */
    public final AppCompatImageView f92610e;
    @C0359n0

    /* renamed from: f */
    public final TextView f92611f;

    public C37039d1(@C0359n0 View view, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 ImageView imageView, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 TextView textView3) {
        this.f92606a = view;
        this.f92607b = textView;
        this.f92608c = textView2;
        this.f92609d = imageView;
        this.f92610e = appCompatImageView;
        this.f92611f = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C37039d1 m151955a(@C0359n0 View view) {
        int i = C36896b.C36906j.store_set_button;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C36896b.C36906j.store_set_description;
            TextView textView2 = (TextView) C20753c.m96463a(view, i);
            if (textView2 != null) {
                i = C36896b.C36906j.store_set_edit;
                ImageView imageView = (ImageView) C20753c.m96463a(view, i);
                if (imageView != null) {
                    i = C36896b.C36906j.store_set_icon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, i);
                    if (appCompatImageView != null) {
                        i = C36896b.C36906j.store_set_name;
                        TextView textView3 = (TextView) C20753c.m96463a(view, i);
                        if (textView3 != null) {
                            return new C37039d1(view, textView, textView2, imageView, appCompatImageView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37039d1 m151956b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_store_set, viewGroup);
            return m151955a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92606a;
    }
}
