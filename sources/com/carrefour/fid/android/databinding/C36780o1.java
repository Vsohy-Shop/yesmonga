package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.o1 */
public final class C36780o1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91404a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91405b;
    @C0359n0

    /* renamed from: c */
    public final Button f91406c;
    @C0359n0

    /* renamed from: d */
    public final EditText f91407d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91408e;
    @C0359n0

    /* renamed from: f */
    public final ImageView f91409f;
    @C0359n0

    /* renamed from: g */
    public final SwitchCompat f91410g;
    @C0359n0

    /* renamed from: h */
    public final TextView f91411h;
    @C0359n0

    /* renamed from: i */
    public final TextView f91412i;
    @C0359n0

    /* renamed from: j */
    public final TextView f91413j;
    @C0359n0

    /* renamed from: k */
    public final TextView f91414k;
    @C0359n0

    /* renamed from: l */
    public final TextView f91415l;
    @C0359n0

    /* renamed from: m */
    public final TextView f91416m;
    @C0359n0

    /* renamed from: n */
    public final TextView f91417n;
    @C0359n0

    /* renamed from: o */
    public final TextView f91418o;
    @C0359n0

    /* renamed from: p */
    public final ConstraintLayout f91419p;

    public C36780o1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 Button button, @C0359n0 EditText editText, @C0359n0 TextView textView, @C0359n0 ImageView imageView2, @C0359n0 SwitchCompat switchCompat, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6, @C0359n0 TextView textView7, @C0359n0 TextView textView8, @C0359n0 TextView textView9, @C0359n0 ConstraintLayout constraintLayout2) {
        this.f91404a = constraintLayout;
        this.f91405b = imageView;
        this.f91406c = button;
        this.f91407d = editText;
        this.f91408e = textView;
        this.f91409f = imageView2;
        this.f91410g = switchCompat;
        this.f91411h = textView2;
        this.f91412i = textView3;
        this.f91413j = textView4;
        this.f91414k = textView5;
        this.f91415l = textView6;
        this.f91416m = textView7;
        this.f91417n = textView8;
        this.f91418o = textView9;
        this.f91419p = constraintLayout2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36780o1 m150847a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.Image_checkout_step_two_edtTxtImgView;
        ImageView imageView = (ImageView) C20753c.m96463a(view2, R.id.Image_checkout_step_two_edtTxtImgView);
        if (imageView != null) {
            i = R.id.button_checkout_step_two_add_loyalty;
            Button button = (Button) C20753c.m96463a(view2, R.id.button_checkout_step_two_add_loyalty);
            if (button != null) {
                i = R.id.editext_checkout_step_two_fid_price;
                EditText editText = (EditText) C20753c.m96463a(view2, R.id.editext_checkout_step_two_fid_price);
                if (editText != null) {
                    i = R.id.fidTitle;
                    TextView textView = (TextView) C20753c.m96463a(view2, R.id.fidTitle);
                    if (textView != null) {
                        i = R.id.fidView;
                        ImageView imageView2 = (ImageView) C20753c.m96463a(view2, R.id.fidView);
                        if (imageView2 != null) {
                            i = R.id.switch_checkout_step_two_full_loyalty;
                            SwitchCompat switchCompat = (SwitchCompat) C20753c.m96463a(view2, R.id.switch_checkout_step_two_full_loyalty);
                            if (switchCompat != null) {
                                i = R.id.text_checkout_step_two_card_umber;
                                TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_step_two_card_umber);
                                if (textView2 != null) {
                                    i = R.id.text_checkout_step_two_loalty_code_error;
                                    TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_step_two_loalty_code_error);
                                    if (textView3 != null) {
                                        i = R.id.text_checkout_step_two_loyalty;
                                        TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_step_two_loyalty);
                                        if (textView4 != null) {
                                            i = R.id.text_checkout_step_two_loyalty_card;
                                            TextView textView5 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_step_two_loyalty_card);
                                            if (textView5 != null) {
                                                i = R.id.text_checkout_step_two_loyalty_code_ok;
                                                TextView textView6 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_step_two_loyalty_code_ok);
                                                if (textView6 != null) {
                                                    i = R.id.text_checkout_step_two_loyalty_note;
                                                    TextView textView7 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_step_two_loyalty_note);
                                                    if (textView7 != null) {
                                                        i = R.id.text_checkout_step_two_loyalty_price;
                                                        TextView textView8 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_step_two_loyalty_price);
                                                        if (textView8 != null) {
                                                            i = R.id.text_checkout_step_two_loyalty_title;
                                                            TextView textView9 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_step_two_loyalty_title);
                                                            if (textView9 != null) {
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                                                                return new C36780o1(constraintLayout, imageView, button, editText, textView, imageView2, switchCompat, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, constraintLayout);
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
    /* renamed from: c */
    public static C36780o1 m150848c(@C0359n0 LayoutInflater layoutInflater) {
        return m150849d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36780o1 m150849d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_step_3_fidelity_unsecured, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150847a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91404a;
    }
}
