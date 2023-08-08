package com.carrefour.fid.android.consent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.consent.C36099R;
import com.carrefour.fid.android.design.components.widgets.RadioButtonComponent;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;

public final class FragmentConfigureConsentOptinsBinding implements C20752b {
    @C0359n0
    public final View configureConsentOptinsBottomView;
    @C0359n0
    public final ScrollView configureConsentOptinsContent;
    @C0359n0
    public final ComposeView configureConsentOptinsHeader;
    @C0359n0
    public final LinearLayout configureConsentOptinsHeaderLayout;
    @C0359n0
    public final RadioButtonComponent configureConsentOptinsPersonalizedAdsAcceptRadio;
    @C0359n0
    public final RadioButtonComponent configureConsentOptinsPersonalizedAdsDeclineRadio;
    @C0359n0
    public final Group configureConsentOptinsPersonalizedAdsGroup;
    @C0359n0
    public final RadioGroup configureConsentOptinsPersonalizedAdsRadioGroup;
    @C0359n0
    public final View configureConsentOptinsPersonalizedAdsSeparator;
    @C0359n0
    public final TextView configureConsentOptinsPersonalizedAdsText;
    @C0359n0
    public final MaterialButton configureConsentOptinsSave;
    @C0359n0
    public final RadioButtonComponent configureConsentOptinsSharingToPartnersAcceptRadio;
    @C0359n0
    public final RadioButtonComponent configureConsentOptinsSharingToPartnersDeclineRadio;
    @C0359n0
    public final Group configureConsentOptinsSharingToPartnersGroup;
    @C0359n0
    public final RadioGroup configureConsentOptinsSharingToPartnersRadioGroup;
    @C0359n0
    public final TextView configureConsentOptinsSharingToPartnersText;
    @C0359n0
    public final ShimmerFrameLayout configureConsentOptinsShimmer;
    @C0359n0
    private final ConstraintLayout rootView;

    private FragmentConfigureConsentOptinsBinding(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 ScrollView scrollView, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 RadioButtonComponent radioButtonComponent, @C0359n0 RadioButtonComponent radioButtonComponent2, @C0359n0 Group group, @C0359n0 RadioGroup radioGroup, @C0359n0 View view2, @C0359n0 TextView textView, @C0359n0 MaterialButton materialButton, @C0359n0 RadioButtonComponent radioButtonComponent3, @C0359n0 RadioButtonComponent radioButtonComponent4, @C0359n0 Group group2, @C0359n0 RadioGroup radioGroup2, @C0359n0 TextView textView2, @C0359n0 ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = constraintLayout;
        this.configureConsentOptinsBottomView = view;
        this.configureConsentOptinsContent = scrollView;
        this.configureConsentOptinsHeader = composeView;
        this.configureConsentOptinsHeaderLayout = linearLayout;
        this.configureConsentOptinsPersonalizedAdsAcceptRadio = radioButtonComponent;
        this.configureConsentOptinsPersonalizedAdsDeclineRadio = radioButtonComponent2;
        this.configureConsentOptinsPersonalizedAdsGroup = group;
        this.configureConsentOptinsPersonalizedAdsRadioGroup = radioGroup;
        this.configureConsentOptinsPersonalizedAdsSeparator = view2;
        this.configureConsentOptinsPersonalizedAdsText = textView;
        this.configureConsentOptinsSave = materialButton;
        this.configureConsentOptinsSharingToPartnersAcceptRadio = radioButtonComponent3;
        this.configureConsentOptinsSharingToPartnersDeclineRadio = radioButtonComponent4;
        this.configureConsentOptinsSharingToPartnersGroup = group2;
        this.configureConsentOptinsSharingToPartnersRadioGroup = radioGroup2;
        this.configureConsentOptinsSharingToPartnersText = textView2;
        this.configureConsentOptinsShimmer = shimmerFrameLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_personalized_ads_separator;
     */
    @androidx.annotation.C0359n0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.consent.databinding.FragmentConfigureConsentOptinsBinding bind(@androidx.annotation.C0359n0 android.view.View r21) {
        /*
            r0 = r21
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_bottom_view
            android.view.View r4 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            if (r4 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_content
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r5 = r2
            android.widget.ScrollView r5 = (android.widget.ScrollView) r5
            if (r5 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_header
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r6 = r2
            androidx.compose.ui.platform.ComposeView r6 = (androidx.compose.p004ui.platform.ComposeView) r6
            if (r6 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_header_layout
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r7 = r2
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_personalized_ads_accept_radio
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r8 = r2
            com.carrefour.fid.android.design.components.widgets.RadioButtonComponent r8 = (com.carrefour.fid.android.design.components.widgets.RadioButtonComponent) r8
            if (r8 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_personalized_ads_decline_radio
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r9 = r2
            com.carrefour.fid.android.design.components.widgets.RadioButtonComponent r9 = (com.carrefour.fid.android.design.components.widgets.RadioButtonComponent) r9
            if (r9 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_personalized_ads_group
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r10 = r2
            androidx.constraintlayout.widget.Group r10 = (androidx.constraintlayout.widget.Group) r10
            if (r10 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_personalized_ads_radio_group
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r11 = r2
            android.widget.RadioGroup r11 = (android.widget.RadioGroup) r11
            if (r11 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_personalized_ads_separator
            android.view.View r12 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            if (r12 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_personalized_ads_text
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r13 = r2
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_save
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r14 = r2
            com.google.android.material.button.MaterialButton r14 = (com.google.android.material.button.MaterialButton) r14
            if (r14 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_sharing_to_partners_accept_radio
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r15 = r2
            com.carrefour.fid.android.design.components.widgets.RadioButtonComponent r15 = (com.carrefour.fid.android.design.components.widgets.RadioButtonComponent) r15
            if (r15 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_sharing_to_partners_decline_radio
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r16 = r2
            com.carrefour.fid.android.design.components.widgets.RadioButtonComponent r16 = (com.carrefour.fid.android.design.components.widgets.RadioButtonComponent) r16
            if (r16 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_sharing_to_partners_group
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r17 = r2
            androidx.constraintlayout.widget.Group r17 = (androidx.constraintlayout.widget.Group) r17
            if (r17 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_sharing_to_partners_radio_group
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r18 = r2
            android.widget.RadioGroup r18 = (android.widget.RadioGroup) r18
            if (r18 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_sharing_to_partners_text
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r19 = r2
            android.widget.TextView r19 = (android.widget.TextView) r19
            if (r19 == 0) goto L_0x00c6
            int r1 = com.carrefour.fid.android.consent.C36099R.C36103id.configure_consent_optins_shimmer
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r0, r1)
            r20 = r2
            com.facebook.shimmer.ShimmerFrameLayout r20 = (com.facebook.shimmer.ShimmerFrameLayout) r20
            if (r20 == 0) goto L_0x00c6
            com.carrefour.fid.android.consent.databinding.FragmentConfigureConsentOptinsBinding r1 = new com.carrefour.fid.android.consent.databinding.FragmentConfigureConsentOptinsBinding
            r2 = r1
            r3 = r0
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x00c6:
            android.content.res.Resources r0 = r21.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.databinding.FragmentConfigureConsentOptinsBinding.bind(android.view.View):com.carrefour.fid.android.consent.databinding.FragmentConfigureConsentOptinsBinding");
    }

    @C0359n0
    public static FragmentConfigureConsentOptinsBinding inflate(@C0359n0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    public static FragmentConfigureConsentOptinsBinding inflate(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36099R.C36105layout.fragment_configure_consent_optins, viewGroup, false);
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
