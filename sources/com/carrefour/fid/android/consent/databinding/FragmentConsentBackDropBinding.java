package com.carrefour.fid.android.consent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.consent.C36099R;
import com.google.android.material.button.MaterialButton;

public final class FragmentConsentBackDropBinding implements C20752b {
    @C0359n0
    public final MaterialButton consentAcceptAllButton;
    @C0359n0
    public final TextView consentBackDropCarrefourAdsDescription;
    @C0359n0
    public final View consentBackDropCarrefourAdsSeparator;
    @C0359n0
    public final TextView consentBackDropCarrefourAdsTitle;
    @C0359n0
    public final MaterialButton consentBackDropDismissButton;
    @C0359n0
    public final TextView consentBackDropPartnersAdsDescription;
    @C0359n0
    public final TextView consentBackDropPartnersAdsTitle;
    @C0359n0
    public final MaterialButton consentConfigureButton;
    @C0359n0
    private final ConstraintLayout rootView;
    @C0359n0
    public final View separatorProductSearchWithList;

    private FragmentConsentBackDropBinding(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 TextView textView, @C0359n0 View view, @C0359n0 TextView textView2, @C0359n0 MaterialButton materialButton2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 MaterialButton materialButton3, @C0359n0 View view2) {
        this.rootView = constraintLayout;
        this.consentAcceptAllButton = materialButton;
        this.consentBackDropCarrefourAdsDescription = textView;
        this.consentBackDropCarrefourAdsSeparator = view;
        this.consentBackDropCarrefourAdsTitle = textView2;
        this.consentBackDropDismissButton = materialButton2;
        this.consentBackDropPartnersAdsDescription = textView3;
        this.consentBackDropPartnersAdsTitle = textView4;
        this.consentConfigureButton = materialButton3;
        this.separatorProductSearchWithList = view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r0 = com.carrefour.fid.android.consent.C36099R.C36103id.separator_product_search_with_list;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = com.carrefour.fid.android.consent.C36099R.C36103id.consent_back_drop_carrefour_ads_separator;
     */
    @androidx.annotation.C0359n0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.consent.databinding.FragmentConsentBackDropBinding bind(@androidx.annotation.C0359n0 android.view.View r13) {
        /*
            int r0 = com.carrefour.fid.android.consent.C36099R.C36103id.consent_accept_all_button
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r4 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.consent.C36099R.C36103id.consent_back_drop_carrefour_ads_description
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.consent.C36099R.C36103id.consent_back_drop_carrefour_ads_separator
            android.view.View r6 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            if (r6 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.consent.C36099R.C36103id.consent_back_drop_carrefour_ads_title
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.consent.C36099R.C36103id.consent_back_drop_dismiss_button
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r8 = r1
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            if (r8 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.consent.C36099R.C36103id.consent_back_drop_partners_ads_description
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.consent.C36099R.C36103id.consent_back_drop_partners_ads_title
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.consent.C36099R.C36103id.consent_configure_button
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r11 = r1
            com.google.android.material.button.MaterialButton r11 = (com.google.android.material.button.MaterialButton) r11
            if (r11 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.consent.C36099R.C36103id.separator_product_search_with_list
            android.view.View r12 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            if (r12 == 0) goto L_0x0067
            com.carrefour.fid.android.consent.databinding.FragmentConsentBackDropBinding r0 = new com.carrefour.fid.android.consent.databinding.FragmentConsentBackDropBinding
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0067:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.databinding.FragmentConsentBackDropBinding.bind(android.view.View):com.carrefour.fid.android.consent.databinding.FragmentConsentBackDropBinding");
    }

    @C0359n0
    public static FragmentConsentBackDropBinding inflate(@C0359n0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    public static FragmentConsentBackDropBinding inflate(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36099R.C36105layout.fragment_consent_back_drop, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @C0359n0
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
