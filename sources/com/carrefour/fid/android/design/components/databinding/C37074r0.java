package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.r0 */
public final class C37074r0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f92797a;
    @C0359n0

    /* renamed from: b */
    public final Barrier f92798b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f92799c;
    @C0359n0

    /* renamed from: d */
    public final Group f92800d;
    @C0359n0

    /* renamed from: e */
    public final EditText f92801e;
    @C0359n0

    /* renamed from: f */
    public final ImageView f92802f;
    @C0359n0

    /* renamed from: g */
    public final ImageView f92803g;

    public C37074r0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Barrier barrier, @C0359n0 ImageView imageView, @C0359n0 Group group, @C0359n0 EditText editText, @C0359n0 ImageView imageView2, @C0359n0 ImageView imageView3) {
        this.f92797a = constraintLayout;
        this.f92798b = barrier;
        this.f92799c = imageView;
        this.f92800d = group;
        this.f92801e = editText;
        this.f92802f = imageView2;
        this.f92803g = imageView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C37074r0 m152051a(@C0359n0 View view) {
        int i = C36896b.C36906j.search_bar_barrier;
        Barrier barrier = (Barrier) C20753c.m96463a(view, i);
        if (barrier != null) {
            i = C36896b.C36906j.search_bar_clear_input_button;
            ImageView imageView = (ImageView) C20753c.m96463a(view, i);
            if (imageView != null) {
                i = C36896b.C36906j.search_bar_group;
                Group group = (Group) C20753c.m96463a(view, i);
                if (group != null) {
                    i = C36896b.C36906j.search_bar_input;
                    EditText editText = (EditText) C20753c.m96463a(view, i);
                    if (editText != null) {
                        i = C36896b.C36906j.search_bar_mic_button;
                        ImageView imageView2 = (ImageView) C20753c.m96463a(view, i);
                        if (imageView2 != null) {
                            i = C36896b.C36906j.search_bar_scan_button;
                            ImageView imageView3 = (ImageView) C20753c.m96463a(view, i);
                            if (imageView3 != null) {
                                return new C37074r0((ConstraintLayout) view, barrier, imageView, group, editText, imageView2, imageView3);
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
    public static C37074r0 m152052c(@C0359n0 LayoutInflater layoutInflater) {
        return m152053d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37074r0 m152053d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_search_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m152051a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92797a;
    }
}
