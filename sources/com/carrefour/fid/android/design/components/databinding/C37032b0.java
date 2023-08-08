package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.widgets.LoaderMaterialButton;

/* renamed from: com.carrefour.fid.android.design.components.databinding.b0 */
public final class C37032b0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92566a;
    @C0359n0

    /* renamed from: b */
    public final Barrier f92567b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatTextView f92568c;
    @C0359n0

    /* renamed from: d */
    public final AppCompatImageView f92569d;
    @C0359n0

    /* renamed from: e */
    public final LoaderMaterialButton f92570e;
    @C0359n0

    /* renamed from: f */
    public final RecyclerView f92571f;
    @C0359n0

    /* renamed from: g */
    public final LoaderMaterialButton f92572g;
    @C0359n0

    /* renamed from: h */
    public final LoaderMaterialButton f92573h;
    @C0359n0

    /* renamed from: i */
    public final AppCompatTextView f92574i;

    public C37032b0(@C0359n0 View view, @C0359n0 Barrier barrier, @C0359n0 AppCompatTextView appCompatTextView, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 LoaderMaterialButton loaderMaterialButton, @C0359n0 RecyclerView recyclerView, @C0359n0 LoaderMaterialButton loaderMaterialButton2, @C0359n0 LoaderMaterialButton loaderMaterialButton3, @C0359n0 AppCompatTextView appCompatTextView2) {
        this.f92566a = view;
        this.f92567b = barrier;
        this.f92568c = appCompatTextView;
        this.f92569d = appCompatImageView;
        this.f92570e = loaderMaterialButton;
        this.f92571f = recyclerView;
        this.f92572g = loaderMaterialButton2;
        this.f92573h = loaderMaterialButton3;
        this.f92574i = appCompatTextView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37032b0 m151937a(@C0359n0 View view) {
        int i = C36896b.C36906j.message_button_start_barrier;
        Barrier barrier = (Barrier) C20753c.m96463a(view, i);
        if (barrier != null) {
            i = C36896b.C36906j.message_description;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, i);
            if (appCompatTextView != null) {
                i = C36896b.C36906j.message_image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, i);
                if (appCompatImageView != null) {
                    i = C36896b.C36906j.message_primary_button;
                    LoaderMaterialButton loaderMaterialButton = (LoaderMaterialButton) C20753c.m96463a(view, i);
                    if (loaderMaterialButton != null) {
                        i = C36896b.C36906j.message_recyclerview;
                        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
                        if (recyclerView != null) {
                            i = C36896b.C36906j.message_secondary_button;
                            LoaderMaterialButton loaderMaterialButton2 = (LoaderMaterialButton) C20753c.m96463a(view, i);
                            if (loaderMaterialButton2 != null) {
                                i = C36896b.C36906j.message_third_button;
                                LoaderMaterialButton loaderMaterialButton3 = (LoaderMaterialButton) C20753c.m96463a(view, i);
                                if (loaderMaterialButton3 != null) {
                                    i = C36896b.C36906j.message_title;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C20753c.m96463a(view, i);
                                    if (appCompatTextView2 != null) {
                                        return new C37032b0(view, barrier, appCompatTextView, appCompatImageView, loaderMaterialButton, recyclerView, loaderMaterialButton2, loaderMaterialButton3, appCompatTextView2);
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
    /* renamed from: b */
    public static C37032b0 m151938b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_message, viewGroup);
            return m151937a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92566a;
    }
}
