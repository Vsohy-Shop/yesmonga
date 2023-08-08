package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.p0 */
public final class C37070p0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f92768a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92769b;
    @C0359n0

    /* renamed from: c */
    public final Button f92770c;
    @C0359n0

    /* renamed from: d */
    public final Button f92771d;
    @C0359n0

    /* renamed from: e */
    public final Button f92772e;
    @C0359n0

    /* renamed from: f */
    public final TextView f92773f;

    public C37070p0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 Button button, @C0359n0 Button button2, @C0359n0 Button button3, @C0359n0 TextView textView2) {
        this.f92768a = constraintLayout;
        this.f92769b = textView;
        this.f92770c = button;
        this.f92771d = button2;
        this.f92772e = button3;
        this.f92773f = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37070p0 m152037a(@C0359n0 View view) {
        int i = C36896b.C36906j.component_overlay_description_text;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C36896b.C36906j.component_overlay_negative_button;
            Button button = (Button) C20753c.m96463a(view, i);
            if (button != null) {
                i = C36896b.C36906j.component_overlay_negative_vertical_button;
                Button button2 = (Button) C20753c.m96463a(view, i);
                if (button2 != null) {
                    i = C36896b.C36906j.component_overlay_positive_button;
                    Button button3 = (Button) C20753c.m96463a(view, i);
                    if (button3 != null) {
                        i = C36896b.C36906j.component_overlay_title_text;
                        TextView textView2 = (TextView) C20753c.m96463a(view, i);
                        if (textView2 != null) {
                            return new C37070p0((ConstraintLayout) view, textView, button, button2, button3, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C37070p0 m152038c(@C0359n0 LayoutInflater layoutInflater) {
        return m152039d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37070p0 m152039d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_product_overlay, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m152037a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92768a;
    }
}
