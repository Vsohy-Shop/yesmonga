package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.design.components.databinding.t0 */
public final class C37078t0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92817a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f92818b;
    @C0359n0

    /* renamed from: c */
    public final TextView f92819c;
    @C0359n0

    /* renamed from: d */
    public final AppCompatImageView f92820d;
    @C0359n0

    /* renamed from: e */
    public final TextView f92821e;
    @C0359n0

    /* renamed from: f */
    public final TextView f92822f;
    @C0359n0

    /* renamed from: g */
    public final TextView f92823g;

    public C37078t0(@C0359n0 View view, @C0359n0 MaterialButton materialButton, @C0359n0 TextView textView, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4) {
        this.f92817a = view;
        this.f92818b = materialButton;
        this.f92819c = textView;
        this.f92820d = appCompatImageView;
        this.f92821e = textView2;
        this.f92822f = textView3;
        this.f92823g = textView4;
    }

    @C0359n0
    /* renamed from: a */
    public static C37078t0 m152063a(@C0359n0 View view) {
        int i = C36896b.C36906j.button;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, i);
        if (materialButton != null) {
            i = C36896b.C36906j.details_text;
            TextView textView = (TextView) C20753c.m96463a(view, i);
            if (textView != null) {
                i = C36896b.C36906j.image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, i);
                if (appCompatImageView != null) {
                    i = C36896b.C36906j.status_text;
                    TextView textView2 = (TextView) C20753c.m96463a(view, i);
                    if (textView2 != null) {
                        i = C36896b.C36906j.sub_title;
                        TextView textView3 = (TextView) C20753c.m96463a(view, i);
                        if (textView3 != null) {
                            i = C36896b.C36906j.title;
                            TextView textView4 = (TextView) C20753c.m96463a(view, i);
                            if (textView4 != null) {
                                return new C37078t0(view, materialButton, textView, appCompatImageView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37078t0 m152064b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_service_info, viewGroup);
            return m152063a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92817a;
    }
}
