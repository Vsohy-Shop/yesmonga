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

/* renamed from: com.carrefour.fid.android.design.components.databinding.u */
public final class C37079u implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92824a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92825b;
    @C0359n0

    /* renamed from: c */
    public final TextView f92826c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f92827d;
    @C0359n0

    /* renamed from: e */
    public final ImageView f92828e;

    public C37079u(@C0359n0 View view, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2) {
        this.f92824a = view;
        this.f92825b = textView;
        this.f92826c = textView2;
        this.f92827d = imageView;
        this.f92828e = imageView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37079u m152065a(@C0359n0 View view) {
        int i = C36896b.C36906j.item_label_error_text;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C36896b.C36906j.item_label_text;
            TextView textView2 = (TextView) C20753c.m96463a(view, i);
            if (textView2 != null) {
                i = C36896b.C36906j.item_left_icon;
                ImageView imageView = (ImageView) C20753c.m96463a(view, i);
                if (imageView != null) {
                    i = C36896b.C36906j.item_right_icon;
                    ImageView imageView2 = (ImageView) C20753c.m96463a(view, i);
                    if (imageView2 != null) {
                        return new C37079u(view, textView, textView2, imageView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37079u m152066b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_list_item, viewGroup);
            return m152065a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92824a;
    }
}
