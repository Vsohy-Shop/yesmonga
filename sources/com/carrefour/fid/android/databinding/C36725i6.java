package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.RadioButtonComponent;

/* renamed from: com.carrefour.fid.android.databinding.i6 */
public final class C36725i6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayoutCompat f91023a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91024b;
    @C0359n0

    /* renamed from: c */
    public final RadioButtonComponent f91025c;
    @C0359n0

    /* renamed from: d */
    public final RadioButtonComponent f91026d;
    @C0359n0

    /* renamed from: e */
    public final RadioGroup f91027e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91028f;

    public C36725i6(@C0359n0 LinearLayoutCompat linearLayoutCompat, @C0359n0 ImageView imageView, @C0359n0 RadioButtonComponent radioButtonComponent, @C0359n0 RadioButtonComponent radioButtonComponent2, @C0359n0 RadioGroup radioGroup, @C0359n0 TextView textView) {
        this.f91023a = linearLayoutCompat;
        this.f91024b = imageView;
        this.f91025c = radioButtonComponent;
        this.f91026d = radioButtonComponent2;
        this.f91027e = radioGroup;
        this.f91028f = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36725i6 m150627a(@C0359n0 View view) {
        int i = R.id.post_order_substitution_logo;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.post_order_substitution_logo);
        if (imageView != null) {
            i = R.id.post_order_substitution_radiobutton_no;
            RadioButtonComponent radioButtonComponent = (RadioButtonComponent) C20753c.m96463a(view, R.id.post_order_substitution_radiobutton_no);
            if (radioButtonComponent != null) {
                i = R.id.post_order_substitution_radiobutton_yes;
                RadioButtonComponent radioButtonComponent2 = (RadioButtonComponent) C20753c.m96463a(view, R.id.post_order_substitution_radiobutton_yes);
                if (radioButtonComponent2 != null) {
                    i = R.id.post_order_substitution_radiogroup;
                    RadioGroup radioGroup = (RadioGroup) C20753c.m96463a(view, R.id.post_order_substitution_radiogroup);
                    if (radioGroup != null) {
                        i = R.id.post_order_substitution_text;
                        TextView textView = (TextView) C20753c.m96463a(view, R.id.post_order_substitution_text);
                        if (textView != null) {
                            return new C36725i6((LinearLayoutCompat) view, imageView, radioButtonComponent, radioButtonComponent2, radioGroup, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36725i6 m150628c(@C0359n0 LayoutInflater layoutInflater) {
        return m150629d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36725i6 m150629d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_post_order_substitution_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150627a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayoutCompat getRoot() {
        return this.f91023a;
    }
}
