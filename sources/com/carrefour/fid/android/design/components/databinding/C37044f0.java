package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.design.components.databinding.f0 */
public final class C37044f0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92631a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f92632b;
    @C0359n0

    /* renamed from: c */
    public final Group f92633c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f92634d;
    @C0359n0

    /* renamed from: e */
    public final TextView f92635e;
    @C0359n0

    /* renamed from: f */
    public final ConstraintLayout f92636f;
    @C0359n0

    /* renamed from: g */
    public final ImageView f92637g;
    @C0359n0

    /* renamed from: h */
    public final AppCompatSeekBar f92638h;
    @C0359n0

    /* renamed from: i */
    public final AppCompatSeekBar f92639i;
    @C0359n0

    /* renamed from: j */
    public final ImageView f92640j;
    @C0359n0

    /* renamed from: k */
    public final Barrier f92641k;
    @C0359n0

    /* renamed from: l */
    public final TextView f92642l;
    @C0359n0

    /* renamed from: m */
    public final TextView f92643m;
    @C0359n0

    /* renamed from: n */
    public final AppCompatTextView f92644n;
    @C0359n0

    /* renamed from: o */
    public final MaterialButton f92645o;

    public C37044f0(@C0359n0 View view, @C0359n0 MaterialButton materialButton, @C0359n0 Group group, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView2, @C0359n0 AppCompatSeekBar appCompatSeekBar, @C0359n0 AppCompatSeekBar appCompatSeekBar2, @C0359n0 ImageView imageView3, @C0359n0 Barrier barrier, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 AppCompatTextView appCompatTextView, @C0359n0 MaterialButton materialButton2) {
        this.f92631a = view;
        this.f92632b = materialButton;
        this.f92633c = group;
        this.f92634d = imageView;
        this.f92635e = textView;
        this.f92636f = constraintLayout;
        this.f92637g = imageView2;
        this.f92638h = appCompatSeekBar;
        this.f92639i = appCompatSeekBar2;
        this.f92640j = imageView3;
        this.f92641k = barrier;
        this.f92642l = textView2;
        this.f92643m = textView3;
        this.f92644n = appCompatTextView;
        this.f92645o = materialButton2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37044f0 m151965a(@C0359n0 View view) {
        View view2 = view;
        int i = C36896b.C36906j.additional_order_button;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view2, i);
        if (materialButton != null) {
            i = C36896b.C36906j.additional_order_info;
            Group group = (Group) C20753c.m96463a(view2, i);
            if (group != null) {
                i = C36896b.C36906j.additional_order_info_imageview;
                ImageView imageView = (ImageView) C20753c.m96463a(view2, i);
                if (imageView != null) {
                    i = C36896b.C36906j.additional_order_info_textview;
                    TextView textView = (TextView) C20753c.m96463a(view2, i);
                    if (textView != null) {
                        i = C36896b.C36906j.component_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C20753c.m96463a(view2, i);
                        if (constraintLayout != null) {
                            i = C36896b.C36906j.order_itinerary_image;
                            ImageView imageView2 = (ImageView) C20753c.m96463a(view2, i);
                            if (imageView2 != null) {
                                i = C36896b.C36906j.order_seek_bar_step;
                                AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) C20753c.m96463a(view2, i);
                                if (appCompatSeekBar != null) {
                                    i = C36896b.C36906j.order_seek_bar_step_background;
                                    AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) C20753c.m96463a(view2, i);
                                    if (appCompatSeekBar2 != null) {
                                        i = C36896b.C36906j.order_status_arrow;
                                        ImageView imageView3 = (ImageView) C20753c.m96463a(view2, i);
                                        if (imageView3 != null) {
                                            i = C36896b.C36906j.order_status_bottom_barrier;
                                            Barrier barrier = (Barrier) C20753c.m96463a(view2, i);
                                            if (barrier != null) {
                                                i = C36896b.C36906j.order_text_address;
                                                TextView textView2 = (TextView) C20753c.m96463a(view2, i);
                                                if (textView2 != null) {
                                                    i = C36896b.C36906j.order_text_number;
                                                    TextView textView3 = (TextView) C20753c.m96463a(view2, i);
                                                    if (textView3 != null) {
                                                        i = C36896b.C36906j.order_text_status;
                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view2, i);
                                                        if (appCompatTextView != null) {
                                                            i = C36896b.C36906j.withdrawal_voucher_button;
                                                            MaterialButton materialButton2 = (MaterialButton) C20753c.m96463a(view2, i);
                                                            if (materialButton2 != null) {
                                                                return new C37044f0(view, materialButton, group, imageView, textView, constraintLayout, imageView2, appCompatSeekBar, appCompatSeekBar2, imageView3, barrier, textView2, textView3, appCompatTextView, materialButton2);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37044f0 m151966b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_order_status, viewGroup);
            return m151965a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92631a;
    }
}
