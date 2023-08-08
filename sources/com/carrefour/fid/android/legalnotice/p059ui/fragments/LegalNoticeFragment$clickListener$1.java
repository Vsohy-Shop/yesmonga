package com.carrefour.fid.android.legalnotice.p059ui.fragments;

import android.view.View;
import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.app.listeners.C13830b;
import com.carrefour.fid.android.presentation.viewmodels.privacy.PrivacyViewModel;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.legalnotice.ui.fragments.LegalNoticeFragment$clickListener$1 */
public final class LegalNoticeFragment$clickListener$1 implements C13830b.C13831a {

    /* renamed from: a */
    public final /* synthetic */ LegalNoticeFragment f96896a;

    public LegalNoticeFragment$clickListener$1(LegalNoticeFragment legalNoticeFragment) {
        this.f96896a = legalNoticeFragment;
    }

    /* renamed from: a */
    public final void mo32762a(int i, @C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        switch (i) {
            case 0:
                LegalNoticeFragment legalNoticeFragment = this.f96896a;
                legalNoticeFragment.mo119695Y0(new LegalNoticeFragment$clickListener$1$onItemClick$1(legalNoticeFragment));
                return;
            case 1:
                LegalNoticeFragment legalNoticeFragment2 = this.f96896a;
                legalNoticeFragment2.mo119695Y0(new LegalNoticeFragment$clickListener$1$onItemClick$2(legalNoticeFragment2));
                return;
            case 2:
                LegalNoticeFragment legalNoticeFragment3 = this.f96896a;
                legalNoticeFragment3.mo119695Y0(new LegalNoticeFragment$clickListener$1$onItemClick$3(legalNoticeFragment3));
                return;
            case 3:
                LegalNoticeFragment legalNoticeFragment4 = this.f96896a;
                legalNoticeFragment4.mo119695Y0(new LegalNoticeFragment$clickListener$1$onItemClick$4(legalNoticeFragment4));
                return;
            case 4:
                FragmentKt.m118823k(this.f96896a, C38238b.f96906a.mo119706a());
                this.f96896a.f96892w.mo119686g();
                return;
            case 5:
                FragmentKt.m118823k(this.f96896a, C38238b.f96906a.mo119707b());
                this.f96896a.f96892w.mo119686g();
                return;
            case 6:
                PrivacyViewModel R0 = this.f96896a.mo119692V0();
                C19232h requireActivity = this.f96896a.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                R0.mo78967s0(requireActivity);
                return;
            default:
                return;
        }
    }
}
