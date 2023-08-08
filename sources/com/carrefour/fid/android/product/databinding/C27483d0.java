package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.d0 */
public final class C27483d0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66635a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f66636b;
    @C0359n0

    /* renamed from: c */
    public final TextView f66637c;
    @C0359n0

    /* renamed from: d */
    public final TextView f66638d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f66639e;
    @C0359n0

    /* renamed from: f */
    public final ImageButton f66640f;
    @C0359n0

    /* renamed from: g */
    public final TextView f66641g;

    public C27483d0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageButton imageButton, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 RecyclerView recyclerView, @C0359n0 ImageButton imageButton2, @C0359n0 TextView textView3) {
        this.f66635a = constraintLayout;
        this.f66636b = imageButton;
        this.f66637c = textView;
        this.f66638d = textView2;
        this.f66639e = recyclerView;
        this.f66640f = imageButton2;
        this.f66641g = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C27483d0 m115657a(@C0359n0 View view) {
        int i = C27609f.C27619j.filter_button;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, i);
        if (imageButton != null) {
            i = C27609f.C27619j.filter_count;
            TextView textView = (TextView) C20753c.m96463a(view, i);
            if (textView != null) {
                i = C27609f.C27619j.subtitle;
                TextView textView2 = (TextView) C20753c.m96463a(view, i);
                if (textView2 != null) {
                    i = C27609f.C27619j.tagline_list;
                    RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
                    if (recyclerView != null) {
                        i = C27609f.C27619j.tagline_scroll_button;
                        ImageButton imageButton2 = (ImageButton) C20753c.m96463a(view, i);
                        if (imageButton2 != null) {
                            i = C27609f.C27619j.title;
                            TextView textView3 = (TextView) C20753c.m96463a(view, i);
                            if (textView3 != null) {
                                return new C27483d0((ConstraintLayout) view, imageButton, textView, textView2, recyclerView, imageButton2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27483d0 m115658c(@C0359n0 LayoutInflater layoutInflater) {
        return m115659d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27483d0 m115659d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.plp_sub_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115657a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66635a;
    }
}
