package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.design.components.widgets.AddressRadioButtonComponent;

/* renamed from: com.carrefour.fid.android.account.databinding.m */
public final class C13226m implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f32534a;
    @C0359n0

    /* renamed from: b */
    public final TextView f32535b;
    @C0359n0

    /* renamed from: c */
    public final AddressRadioButtonComponent f32536c;
    @C0359n0

    /* renamed from: d */
    public final AddressRadioButtonComponent f32537d;
    @C0359n0

    /* renamed from: e */
    public final RadioGroup f32538e;

    public C13226m(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 AddressRadioButtonComponent addressRadioButtonComponent, @C0359n0 AddressRadioButtonComponent addressRadioButtonComponent2, @C0359n0 RadioGroup radioGroup) {
        this.f32534a = constraintLayout;
        this.f32535b = textView;
        this.f32536c = addressRadioButtonComponent;
        this.f32537d = addressRadioButtonComponent2;
        this.f32538e = radioGroup;
    }

    @C0359n0
    /* renamed from: a */
    public static C13226m m57311a(@C0359n0 View view) {
        int i = C13144b.C13154j.holder_account_address_verification_bottom_title_textview;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C13144b.C13154j.holder_account_address_verification_keep_address_radio;
            AddressRadioButtonComponent addressRadioButtonComponent = (AddressRadioButtonComponent) C20753c.m96463a(view, i);
            if (addressRadioButtonComponent != null) {
                i = C13144b.C13154j.holder_account_address_verification_other_address_radio;
                AddressRadioButtonComponent addressRadioButtonComponent2 = (AddressRadioButtonComponent) C20753c.m96463a(view, i);
                if (addressRadioButtonComponent2 != null) {
                    i = C13144b.C13154j.holder_account_address_verification_radio_group;
                    RadioGroup radioGroup = (RadioGroup) C20753c.m96463a(view, i);
                    if (radioGroup != null) {
                        return new C13226m((ConstraintLayout) view, textView, addressRadioButtonComponent, addressRadioButtonComponent2, radioGroup);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C13226m m57312c(@C0359n0 LayoutInflater layoutInflater) {
        return m57313d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13226m m57313d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.holder_verify_user_address_bottom, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57311a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f32534a;
    }
}
