package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.list.ListItemRecyclerView;

/* renamed from: com.carrefour.fid.android.databinding.i3 */
public final class C36722i3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91010a;
    @C0359n0

    /* renamed from: b */
    public final ListItemRecyclerView f91011b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91012c;

    public C36722i3(@C0359n0 LinearLayout linearLayout, @C0359n0 ListItemRecyclerView listItemRecyclerView, @C0359n0 TextView textView) {
        this.f91010a = linearLayout;
        this.f91011b = listItemRecyclerView;
        this.f91012c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36722i3 m150615a(@C0359n0 View view) {
        int i = R.id.quantity_list;
        ListItemRecyclerView listItemRecyclerView = (ListItemRecyclerView) C20753c.m96463a(view, R.id.quantity_list);
        if (listItemRecyclerView != null) {
            i = R.id.quantity_title;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.quantity_title);
            if (textView != null) {
                return new C36722i3((LinearLayout) view, listItemRecyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36722i3 m150616c(@C0359n0 LayoutInflater layoutInflater) {
        return m150617d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36722i3 m150617d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_quantity_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150615a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91010a;
    }
}
