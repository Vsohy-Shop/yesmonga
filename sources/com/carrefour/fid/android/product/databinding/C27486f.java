package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.widgets.list.ListItemRecyclerView;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.f */
public final class C27486f implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f66662a;
    @C0359n0

    /* renamed from: b */
    public final ListItemRecyclerView f66663b;
    @C0359n0

    /* renamed from: c */
    public final TextView f66664c;

    public C27486f(@C0359n0 LinearLayout linearLayout, @C0359n0 ListItemRecyclerView listItemRecyclerView, @C0359n0 TextView textView) {
        this.f66662a = linearLayout;
        this.f66663b = listItemRecyclerView;
        this.f66664c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C27486f m115669a(@C0359n0 View view) {
        int i = C27609f.C27619j.quantity_list;
        ListItemRecyclerView listItemRecyclerView = (ListItemRecyclerView) C20753c.m96463a(view, i);
        if (listItemRecyclerView != null) {
            i = C27609f.C27619j.quantity_title;
            TextView textView = (TextView) C20753c.m96463a(view, i);
            if (textView != null) {
                return new C27486f((LinearLayout) view, listItemRecyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27486f m115670c(@C0359n0 LayoutInflater layoutInflater) {
        return m115671d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27486f m115671d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.fragment_quantity_bottom_sheet2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115669a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f66662a;
    }
}
