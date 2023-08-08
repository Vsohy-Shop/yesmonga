package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.j2 */
public final class C36731j2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91058a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f91059b;
    @C0359n0

    /* renamed from: c */
    public final Button f91060c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91061d;

    public C36731j2(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 Button button, @C0359n0 TextView textView) {
        this.f91058a = constraintLayout;
        this.f91059b = recyclerView;
        this.f91060c = button;
        this.f91061d = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36731j2 m150651a(@C0359n0 View view) {
        int i = R.id.list_products_ordered;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_products_ordered);
        if (recyclerView != null) {
            i = R.id.submit_order_again;
            Button button = (Button) C20753c.m96463a(view, R.id.submit_order_again);
            if (button != null) {
                i = R.id.text_order_details;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_order_details);
                if (textView != null) {
                    return new C36731j2((ConstraintLayout) view, recyclerView, button, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36731j2 m150652c(@C0359n0 LayoutInflater layoutInflater) {
        return m150653d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36731j2 m150653d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_list_products_ordered_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150651a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91058a;
    }
}
