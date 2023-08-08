package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.i1 */
public final class C37054i1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final Toolbar f92688a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f92689b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f92690c;
    @C0359n0

    /* renamed from: d */
    public final Group f92691d;
    @C0359n0

    /* renamed from: e */
    public final TextView f92692e;
    @C0359n0

    /* renamed from: f */
    public final ImageView f92693f;
    @C0359n0

    /* renamed from: g */
    public final ImageButton f92694g;
    @C0359n0

    /* renamed from: h */
    public final ImageButton f92695h;

    public C37054i1(@C0359n0 Toolbar toolbar, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 Group group, @C0359n0 TextView textView, @C0359n0 ImageView imageView3, @C0359n0 ImageButton imageButton, @C0359n0 ImageButton imageButton2) {
        this.f92688a = toolbar;
        this.f92689b = imageView;
        this.f92690c = imageView2;
        this.f92691d = group;
        this.f92692e = textView;
        this.f92693f = imageView3;
        this.f92694g = imageButton;
        this.f92695h = imageButton2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37054i1 m151995a(@C0359n0 View view) {
        int i = C36896b.C36906j.toolbar_arrow_down;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            i = C36896b.C36906j.toolbar_drive_icon;
            ImageView imageView2 = (ImageView) C20753c.m96463a(view, i);
            if (imageView2 != null) {
                i = C36896b.C36906j.toolbar_group_drive_selection;
                Group group = (Group) C20753c.m96463a(view, i);
                if (group != null) {
                    i = C36896b.C36906j.toolbar_label_text;
                    TextView textView = (TextView) C20753c.m96463a(view, i);
                    if (textView != null) {
                        i = C36896b.C36906j.toolbar_left_icon;
                        ImageView imageView3 = (ImageView) C20753c.m96463a(view, i);
                        if (imageView3 != null) {
                            i = C36896b.C36906j.toolbar_right_icon;
                            ImageButton imageButton = (ImageButton) C20753c.m96463a(view, i);
                            if (imageButton != null) {
                                i = C36896b.C36906j.toolbar_search_icon;
                                ImageButton imageButton2 = (ImageButton) C20753c.m96463a(view, i);
                                if (imageButton2 != null) {
                                    return new C37054i1((Toolbar) view, imageView, imageView2, group, textView, imageView3, imageButton, imageButton2);
                                }
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
    public static C37054i1 m151996c(@C0359n0 LayoutInflater layoutInflater) {
        return m151997d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37054i1 m151997d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_toolbar_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151995a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public Toolbar getRoot() {
        return this.f92688a;
    }
}
