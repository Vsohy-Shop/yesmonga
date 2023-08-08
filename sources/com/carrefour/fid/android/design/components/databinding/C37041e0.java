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

/* renamed from: com.carrefour.fid.android.design.components.databinding.e0 */
public final class C37041e0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92616a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f92617b;
    @C0359n0

    /* renamed from: c */
    public final TextView f92618c;

    public C37041e0(@C0359n0 View view, @C0359n0 ImageView imageView, @C0359n0 TextView textView) {
        this.f92616a = view;
        this.f92617b = imageView;
        this.f92618c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37041e0 m151959a(@C0359n0 View view) {
        int i = C36896b.C36906j.image_holder_nutriscore;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            i = C36896b.C36906j.text_holder_nutriscore;
            TextView textView = (TextView) C20753c.m96463a(view, i);
            if (textView != null) {
                return new C37041e0(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37041e0 m151960b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_nutriscore, viewGroup);
            return m151959a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92616a;
    }
}
