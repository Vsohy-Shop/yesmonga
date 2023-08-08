package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.design.components.widgets.AddressRadioButtonComponent;

/* renamed from: com.carrefour.fid.android.account.databinding.o */
public final class C13228o implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final AddressRadioButtonComponent f32542a;
    @C0359n0

    /* renamed from: b */
    public final AddressRadioButtonComponent f32543b;

    public C13228o(@C0359n0 AddressRadioButtonComponent addressRadioButtonComponent, @C0359n0 AddressRadioButtonComponent addressRadioButtonComponent2) {
        this.f32542a = addressRadioButtonComponent;
        this.f32543b = addressRadioButtonComponent2;
    }

    @C0359n0
    /* renamed from: a */
    public static C13228o m57319a(@C0359n0 View view) {
        if (view != null) {
            AddressRadioButtonComponent addressRadioButtonComponent = (AddressRadioButtonComponent) view;
            return new C13228o(addressRadioButtonComponent, addressRadioButtonComponent);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C13228o m57320c(@C0359n0 LayoutInflater layoutInflater) {
        return m57321d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13228o m57321d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.holder_verify_user_address_suggestion_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57319a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public AddressRadioButtonComponent getRoot() {
        return this.f32542a;
    }
}
