package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.s */
public final class C37075s implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92804a;
    @C0359n0

    /* renamed from: b */
    public final View f92805b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f92806c;
    @C0359n0

    /* renamed from: d */
    public final Space f92807d;
    @C0359n0

    /* renamed from: e */
    public final TextView f92808e;
    @C0359n0

    /* renamed from: f */
    public final TextView f92809f;

    public C37075s(@C0359n0 View view, @C0359n0 View view2, @C0359n0 ImageView imageView, @C0359n0 Space space, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f92804a = view;
        this.f92805b = view2;
        this.f92806c = imageView;
        this.f92807d = space;
        this.f92808e = textView;
        this.f92809f = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37075s m152055a(@C0359n0 View view) {
        int i = C36896b.C36906j.label_background;
        View a = C20753c.m96463a(view, i);
        if (a != null) {
            i = C36896b.C36906j.label_left_icon;
            ImageView imageView = (ImageView) C20753c.m96463a(view, i);
            if (imageView != null) {
                i = C36896b.C36906j.label_right_margin;
                Space space = (Space) C20753c.m96463a(view, i);
                if (space != null) {
                    i = C36896b.C36906j.label_subtext;
                    TextView textView = (TextView) C20753c.m96463a(view, i);
                    if (textView != null) {
                        i = C36896b.C36906j.label_text;
                        TextView textView2 = (TextView) C20753c.m96463a(view, i);
                        if (textView2 != null) {
                            return new C37075s(view, a, imageView, space, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37075s m152056b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_label, viewGroup);
            return m152055a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92804a;
    }
}
