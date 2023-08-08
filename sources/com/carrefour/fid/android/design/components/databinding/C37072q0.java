package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.design.components.databinding.q0 */
public final class C37072q0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f92785a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f92786b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatTextView f92787c;
    @C0359n0

    /* renamed from: d */
    public final ImageButton f92788d;
    @C0359n0

    /* renamed from: e */
    public final ImageButton f92789e;
    @C0359n0

    /* renamed from: f */
    public final AppCompatImageView f92790f;
    @C0359n0

    /* renamed from: g */
    public final ImageButton f92791g;
    @C0359n0

    /* renamed from: h */
    public final ImageButton f92792h;
    @C0359n0

    /* renamed from: i */
    public final AppCompatTextView f92793i;
    @C0359n0

    /* renamed from: j */
    public final ImageButton f92794j;
    @C0359n0

    /* renamed from: k */
    public final MaterialButton f92795k;

    public C37072q0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageButton imageButton, @C0359n0 AppCompatTextView appCompatTextView, @C0359n0 ImageButton imageButton2, @C0359n0 ImageButton imageButton3, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 ImageButton imageButton4, @C0359n0 ImageButton imageButton5, @C0359n0 AppCompatTextView appCompatTextView2, @C0359n0 ImageButton imageButton6, @C0359n0 MaterialButton materialButton) {
        this.f92785a = constraintLayout;
        this.f92786b = imageButton;
        this.f92787c = appCompatTextView;
        this.f92788d = imageButton2;
        this.f92789e = imageButton3;
        this.f92790f = appCompatImageView;
        this.f92791g = imageButton4;
        this.f92792h = imageButton5;
        this.f92793i = appCompatTextView2;
        this.f92794j = imageButton6;
        this.f92795k = materialButton;
    }

    @C0359n0
    /* renamed from: a */
    public static C37072q0 m152043a(@C0359n0 View view) {
        int i = C36896b.C36906j.rating_close_button;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, i);
        if (imageButton != null) {
            i = C36896b.C36906j.rating_desc;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, i);
            if (appCompatTextView != null) {
                i = C36896b.C36906j.rating_five;
                ImageButton imageButton2 = (ImageButton) C20753c.m96463a(view, i);
                if (imageButton2 != null) {
                    i = C36896b.C36906j.rating_four;
                    ImageButton imageButton3 = (ImageButton) C20753c.m96463a(view, i);
                    if (imageButton3 != null) {
                        i = C36896b.C36906j.rating_icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, i);
                        if (appCompatImageView != null) {
                            i = C36896b.C36906j.rating_one;
                            ImageButton imageButton4 = (ImageButton) C20753c.m96463a(view, i);
                            if (imageButton4 != null) {
                                i = C36896b.C36906j.rating_three;
                                ImageButton imageButton5 = (ImageButton) C20753c.m96463a(view, i);
                                if (imageButton5 != null) {
                                    i = C36896b.C36906j.rating_title;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C20753c.m96463a(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = C36896b.C36906j.rating_two;
                                        ImageButton imageButton6 = (ImageButton) C20753c.m96463a(view, i);
                                        if (imageButton6 != null) {
                                            i = C36896b.C36906j.rating_valid_button;
                                            MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, i);
                                            if (materialButton != null) {
                                                return new C37072q0((ConstraintLayout) view, imageButton, appCompatTextView, imageButton2, imageButton3, appCompatImageView, imageButton4, imageButton5, appCompatTextView2, imageButton6, materialButton);
                                            }
                                        }
                                    }
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
    public static C37072q0 m152044c(@C0359n0 LayoutInflater layoutInflater) {
        return m152045d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37072q0 m152045d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_rating_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m152043a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92785a;
    }
}
