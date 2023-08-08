package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.widgets.filter.FilterItemRecyclerView;

/* renamed from: com.carrefour.fid.android.design.components.databinding.p */
public final class C37069p implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92762a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f92763b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayoutCompat f92764c;
    @C0359n0

    /* renamed from: d */
    public final FilterItemRecyclerView f92765d;
    @C0359n0

    /* renamed from: e */
    public final TextView f92766e;
    @C0359n0

    /* renamed from: f */
    public final ConstraintLayout f92767f;

    public C37069p(@C0359n0 View view, @C0359n0 ImageView imageView, @C0359n0 LinearLayoutCompat linearLayoutCompat, @C0359n0 FilterItemRecyclerView filterItemRecyclerView, @C0359n0 TextView textView, @C0359n0 ConstraintLayout constraintLayout) {
        this.f92762a = view;
        this.f92763b = imageView;
        this.f92764c = linearLayoutCompat;
        this.f92765d = filterItemRecyclerView;
        this.f92766e = textView;
        this.f92767f = constraintLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C37069p m152035a(@C0359n0 View view) {
        int i = C36896b.C36906j.expand_image;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            i = C36896b.C36906j.group_holder;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C20753c.m96463a(view, i);
            if (linearLayoutCompat != null) {
                i = C36896b.C36906j.group_items;
                FilterItemRecyclerView filterItemRecyclerView = (FilterItemRecyclerView) C20753c.m96463a(view, i);
                if (filterItemRecyclerView != null) {
                    i = C36896b.C36906j.group_text_title;
                    TextView textView = (TextView) C20753c.m96463a(view, i);
                    if (textView != null) {
                        i = C36896b.C36906j.group_title_holder;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C20753c.m96463a(view, i);
                        if (constraintLayout != null) {
                            return new C37069p(view, imageView, linearLayoutCompat, filterItemRecyclerView, textView, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37069p m152036b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_filter_item_filter_group, viewGroup);
            return m152035a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92762a;
    }
}
