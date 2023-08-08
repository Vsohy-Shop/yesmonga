package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel;
import com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult;
import kotlinx.coroutines.flow.C11908f;

/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$3 */
public final class CreateLoyaltyCardStepTwoFragment$validateUserInput$3 implements C11908f<ValidUserAddressResult> {

    /* renamed from: a */
    public final /* synthetic */ CreateLoyaltyCardStepTwoFragment f60782a;

    /* renamed from: b */
    public final /* synthetic */ LoyaltyMembershipConsentModel f60783b;

    public CreateLoyaltyCardStepTwoFragment$validateUserInput$3(CreateLoyaltyCardStepTwoFragment createLoyaltyCardStepTwoFragment, LoyaltyMembershipConsentModel loyaltyMembershipConsentModel) {
        this.f60782a = createLoyaltyCardStepTwoFragment;
        this.f60783b = loyaltyMembershipConsentModel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult r18, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$3$emit$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$3$emit$1 r3 = (com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$3$emit$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$3$emit$1 r3 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$3$emit$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r5 = r3.label
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x0043
            if (r5 == r7) goto L_0x003b
            if (r5 != r6) goto L_0x0033
            kotlin.C11661u0.m45747n(r2)
            goto L_0x00c1
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            java.lang.Object r1 = r3.L$0
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$3 r1 = (com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$3) r1
            kotlin.C11661u0.m45747n(r2)
            goto L_0x00b3
        L_0x0043:
            kotlin.C11661u0.m45747n(r2)
            com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult$AddressVerification r2 = com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult.AddressVerification.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x007f
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment r1 = r0.f60782a
            java.lang.Class<com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateSecretCodeFragment> r2 = com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateSecretCodeFragment.class
            java.lang.Object r1 = com.carrefour.fid.android.core.extension.FragmentKt.m148916b(r1, r2)
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateSecretCodeFragment r1 = (com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateSecretCodeFragment) r1
            if (r1 == 0) goto L_0x0061
            r2 = 0
            r1.mo71220Z0(r2)
            r1.mo71221a1(r2)
        L_0x0061:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment r1 = r0.f60782a
            com.carrefour.fid.android.shared.navigation.c r2 = r1.getNavigator()
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment r1 = r0.f60782a
            androidx.navigation.NavController r3 = androidx.navigation.fragment.C19736g.m91827a(r1)
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r1 = r0.f60783b
            com.carrefour.fid.android.domain.models.account.Address r4 = r1.mo117843j()
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r1 = r0.f60783b
            java.lang.String r5 = r1.mo117848o()
            r6 = 0
            r7 = 0
            r2.mo83832h(r3, r4, r5, r6, r7)
            goto L_0x00f2
        L_0x007f:
            com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult$ValidAddress r2 = com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult.ValidAddress.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00c4
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment r1 = r0.f60782a
            com.carrefour.fid.android.loyalty.presentation.viewmodels.create.InitLoyaltyCardViewModel r1 = r1.mo71181M0()
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment r2 = r0.f60782a
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.g r2 = r2.mo71180L0()
            boolean r2 = r2.mo71407i()
            com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel r5 = r0.f60783b
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment r8 = r0.f60782a
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.g r8 = r8.mo71180L0()
            java.lang.String r8 = r8.mo71404g()
            if (r8 != 0) goto L_0x00a7
            java.lang.String r8 = ""
        L_0x00a7:
            r3.L$0 = r0
            r3.label = r7
            java.lang.Object r1 = r1.startLoyaltyProcess(r2, r5, r8, r3)
            if (r1 != r4) goto L_0x00b2
            return r4
        L_0x00b2:
            r1 = r0
        L_0x00b3:
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment r1 = r1.f60782a
            r2 = 0
            r3.L$0 = r2
            r3.label = r6
            java.lang.Object r1 = r1.mo71182N0(r3)
            if (r1 != r4) goto L_0x00c1
            return r4
        L_0x00c1:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x00c4:
            com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult$Error r2 = com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult.Error.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x00ed
            com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment r3 = r0.f60782a
            com.carrefour.fid.android.design.components.widgets.NotificationComponent$Variant r4 = com.carrefour.fid.android.design.components.widgets.NotificationComponent.Variant.ERROR
            r1 = 2131952978(0x7f130552, float:1.9542414E38)
            java.lang.String r5 = r3.getString(r1)
            java.lang.String r1 = "getString(R.string.loyalty_carrefour_error_text)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 2044(0x7fc, float:2.864E-42)
            r16 = 0
            com.carrefour.fid.android.shared.extension.FragmentKt.m118811B(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00f2
        L_0x00ed:
            com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult$Uninitialized r2 = com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult.Uninitialized.INSTANCE
            kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
        L_0x00f2:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.CreateLoyaltyCardStepTwoFragment$validateUserInput$3.emit(com.carrefour.fid.android.loyalty.core.type.ValidUserAddressResult, kotlin.coroutines.c):java.lang.Object");
    }
}
