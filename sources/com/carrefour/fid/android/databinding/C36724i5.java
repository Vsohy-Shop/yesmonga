package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.i5 */
public final class C36724i5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91017a;
    @C0359n0

    /* renamed from: b */
    public final C36803q4 f91018b;
    @C0359n0

    /* renamed from: c */
    public final C36694f5 f91019c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91020d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91021e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91022f;

    public C36724i5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 C36803q4 q4Var, @C0359n0 C36694f5 f5Var, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f91017a = constraintLayout;
        this.f91018b = q4Var;
        this.f91019c = f5Var;
        this.f91020d = textView;
        this.f91021e = textView2;
        this.f91022f = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36724i5 m150623a(@C0359n0 View view) {
        int i = R.id.department_returnable_bag;
        View a = C20753c.m96463a(view, R.id.department_returnable_bag);
        if (a != null) {
            C36803q4 a2 = C36803q4.m150937a(a);
            i = R.id.product_returnable_bag;
            View a3 = C20753c.m96463a(view, R.id.product_returnable_bag);
            if (a3 != null) {
                C36694f5 a4 = C36694f5.m150503a(a3);
                i = R.id.text_more;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_more);
                if (textView != null) {
                    i = R.id.text_returnable_bag_title;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_returnable_bag_title);
                    if (textView2 != null) {
                        i = R.id.text_returnable_bag_title_desc;
                        TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_returnable_bag_title_desc);
                        if (textView3 != null) {
                            return new C36724i5((ConstraintLayout) view, a2, a4, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36724i5 m150624c(@C0359n0 LayoutInflater layoutInflater) {
        return m150625d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36724i5 m150625d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_returnable_bag, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150623a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91017a;
    }
}
