package com.onetrust.otpublishers.headless.p052UI.TVUI.fragments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import com.google.android.material.C31076a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTConsentInteractionType;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35067a;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35068b;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35069c;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35070d;
import com.onetrust.otpublishers.headless.p052UI.TVUI.datautils.C35071e;
import com.onetrust.otpublishers.headless.p052UI.TVUI.fragments.C35072a;
import com.onetrust.otpublishers.headless.p052UI.TVUI.fragments.C35087m;
import com.onetrust.otpublishers.headless.p052UI.TVUI.fragments.C35097s;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.fragments.h */
public class C35081h extends C31185b implements C35087m.C35088a, C35072a.C35073a, C35097s.C35098a {

    /* renamed from: a */
    public BottomSheetBehavior<View> f85499a;

    /* renamed from: b */
    public FrameLayout f85500b;

    /* renamed from: c */
    public C31178a f85501c;

    /* renamed from: d */
    public Context f85502d;

    /* renamed from: e */
    public OTPublishersHeadlessSDK f85503e;

    /* renamed from: f */
    public C34962a f85504f;

    /* renamed from: g */
    public int f85505g;

    /* renamed from: v */
    public UIUtils f85506v;

    /* renamed from: w */
    public int f85507w;

    /* renamed from: x */
    public Fragment f85508x;

    @C0359n0
    /* renamed from: Q0 */
    public static C35081h m144058Q0(@C0359n0 String str, @C0359n0 C34962a aVar, int i) {
        C35081h hVar = new C35081h();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        hVar.setArguments(bundle);
        hVar.mo104518T0(aVar);
        hVar.mo104526c1(i);
        return hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ void m144059R0(DialogInterface dialogInterface) {
        C31178a aVar = (C31178a) dialogInterface;
        this.f85501c = aVar;
        mo104517S0(aVar);
        FrameLayout frameLayout = (FrameLayout) this.f85501c.findViewById(C31076a.C31084h.design_bottom_sheet);
        this.f85500b = frameLayout;
        if (frameLayout != null) {
            this.f85499a = BottomSheetBehavior.m125237i0(frameLayout);
        }
        this.f85501c.setCancelable(false);
        this.f85501c.setCanceledOnTouchOutside(false);
        this.f85499a.mo88417V0(true);
        this.f85499a.mo88410O0(false);
        this.f85499a.mo88414S0(mo104520X0());
        this.f85501c.setOnKeyListener(new C35080g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public /* synthetic */ void m144060U0(String str, int i) {
        OTLogger.m143458m("OneTrust", "Saving Consent on BG thread");
        this.f85503e.saveConsent(str);
        this.f85506v.mo104267E(new C34963b(i), this.f85504f);
        mo104527d(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ boolean m144061W0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        mo104522Z0();
        return false;
    }

    /* renamed from: E */
    public final void mo104516E(int i) {
        Fragment fragment = this.f85508x;
        if (fragment != null && fragment.getArguments() != null) {
            this.f85508x.getArguments().putInt("OT_TV_FOCUSED_BTN", i);
        }
    }

    /* renamed from: S0 */
    public final void mo104517S0(C31178a aVar) {
        FrameLayout frameLayout = (FrameLayout) aVar.findViewById(C35265a.C35273h.design_bottom_sheet);
        this.f85500b = frameLayout;
        if (frameLayout != null) {
            this.f85499a = BottomSheetBehavior.m125237i0(frameLayout);
            ViewGroup.LayoutParams layoutParams = this.f85500b.getLayoutParams();
            int X0 = mo104520X0();
            if (layoutParams != null) {
                layoutParams.height = X0;
            }
            this.f85500b.setLayoutParams(layoutParams);
            this.f85499a.mo88418W0(3);
        }
    }

    /* renamed from: T0 */
    public void mo104518T0(@C0359n0 C34962a aVar) {
        this.f85504f = aVar;
    }

    /* renamed from: V0 */
    public final void mo104519V0(@C0363p0 Map<String, String> map, boolean z) {
        this.f85506v.mo104267E(new C34963b(12), this.f85504f);
        getChildFragmentManager().mo56909u().mo57201C(C35265a.C35273h.tv_main_lyt, C35097s.m144184J0(OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG, this.f85504f, this, this.f85503e, map, z)).mo57225o(OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG).mo57052q();
    }

    /* renamed from: X0 */
    public final int mo104520X0() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context context = getContext();
        Objects.requireNonNull(context);
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: Y0 */
    public final void mo104521Y0(@C0359n0 String str, int i) {
        new Thread(new C35078e(this, str, i)).start();
        dismiss();
    }

    /* renamed from: Z0 */
    public final void mo104522Z0() {
        String str;
        int i = this.f85507w;
        String str2 = OTConsentInteractionType.PC_CLOSE;
        if (i == 0) {
            this.f85506v.mo104267E(new C34963b(2), this.f85504f);
            str = OTConsentInteractionType.BANNER_CLOSE;
        } else {
            str = str2;
        }
        if (this.f85507w == 1) {
            this.f85506v.mo104267E(new C34963b(6), this.f85504f);
            mo104523a1(0);
        } else {
            str2 = str;
        }
        if (this.f85507w == 3) {
            this.f85506v.mo104267E(new C34963b(13), this.f85504f);
            mo104523a1(0);
        }
        if (this.f85507w == 4) {
            this.f85506v.mo104267E(new C34963b(13), this.f85504f);
            mo104523a1(1);
        }
        if (!str2.equals(OTConsentInteractionType.BANNER_CLOSE)) {
            getChildFragmentManager().mo56901r1();
        }
        if (getChildFragmentManager().mo56786B0() <= 1 && !str2.equals(OTConsentInteractionType.BANNER_CLOSE)) {
            mo104527d(str2);
            dismiss();
        }
    }

    /* renamed from: a */
    public void mo104471a() {
        this.f85506v.mo104267E(new C34963b(5), this.f85504f);
        mo104528d1();
        mo104516E(1);
    }

    /* renamed from: a1 */
    public final void mo104523a1(int i) {
        this.f85507w = i;
    }

    /* renamed from: b */
    public void mo104472b(int i) {
        if (i == 14) {
            mo104521Y0(OTConsentInteractionType.PC_CONFIRM, 10);
        }
        if (i == 11) {
            mo104521Y0(OTConsentInteractionType.BANNER_ALLOW_ALL, 3);
        }
        if (i == 12) {
            mo104521Y0(OTConsentInteractionType.BANNER_REJECT_ALL, 4);
        }
        if (i == 21) {
            mo104521Y0(OTConsentInteractionType.PC_ALLOW_ALL, 8);
        }
        if (i == 22) {
            mo104521Y0(OTConsentInteractionType.PC_REJECT_ALL, 9);
        }
        if (i == 13) {
            mo104521Y0(OTConsentInteractionType.BANNER_CLOSE, 2);
        }
        if (i == 16) {
            mo104521Y0(OTConsentInteractionType.BANNER_CONTINUE_WITHOUT_ACCEPTING, 2);
        }
        if (i == 15) {
            mo104523a1(3);
            mo104516E(2);
            mo104519V0((Map<String, String>) null, false);
        }
        if (i == 32) {
            mo104521Y0(OTConsentInteractionType.VENDOR_LIST_REJECT_ALL, 20);
        }
        if (i == 31) {
            mo104521Y0(OTConsentInteractionType.VENDOR_LIST_ALLOW_ALL, 19);
        }
        if (i == 33) {
            mo104521Y0(OTConsentInteractionType.VENDOR_LIST_CONFIRM, 14);
        }
        if (i == 23) {
            mo104522Z0();
        }
    }

    /* renamed from: b1 */
    public final void mo104524b1() {
        mo104523a1(0);
        this.f85508x = C35072a.m143991I0(OTFragmentTags.OT_BANNER_FRAGMENT_TAG, this);
        C19234h0 u = getChildFragmentManager().mo56909u();
        mo104516E(0);
        u.mo57201C(C35265a.C35273h.tv_main_lyt, this.f85508x).mo57225o(OTFragmentTags.OT_BANNER_FRAGMENT_TAG).mo57052q();
    }

    /* renamed from: c */
    public void mo104525c(Map<String, String> map) {
        mo104523a1(4);
        mo104516E(1);
        mo104519V0(map, true);
    }

    /* renamed from: c1 */
    public final void mo104526c1(int i) {
        this.f85505g = i;
    }

    /* renamed from: d */
    public final void mo104527d(@C0359n0 String str) {
        C34963b bVar = new C34963b(17);
        bVar.mo103583e(str);
        this.f85506v.mo104267E(bVar, this.f85504f);
    }

    /* renamed from: d1 */
    public final void mo104528d1() {
        mo104523a1(1);
        getChildFragmentManager().mo56909u().mo57201C(C35265a.C35273h.tv_main_lyt, C35087m.m144118J0(OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG, this.f85504f, this, this.f85503e)).mo57225o(OTFragmentTags.OT_PREFERENCE_CENTER_FRAGMENT_TAG).mo57052q();
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f85502d = getActivity();
        C35068b.m143905i().mo104381f(this.f85502d);
        C35069c y = C35069c.m143925y();
        y.mo104415o(this.f85502d);
        C35067a.m143884o().mo104362h(this.f85502d);
        this.f85506v = new UIUtils();
        Context context = this.f85502d;
        if (context != null && this.f85503e == null) {
            this.f85503e = new OTPublishersHeadlessSDK(context);
        }
        try {
            if (this.f85502d != null) {
                C35070d.m143959g().mo104428c(y.mo104407e(this.f85502d));
                C35070d.m143959g().mo104430e(this.f85502d);
                C35071e.m143968m().mo104439f(y.mo104407e(this.f85502d));
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "error while initializing VL data, err = " + e.getMessage());
        }
        if (this.f85505g == 0) {
            mo104524b1();
        } else {
            mo104528d1();
        }
    }

    @C0359n0
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35079f(this));
        return onCreateDialog;
    }

    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new UIUtils().mo104271e(this.f85502d, layoutInflater, viewGroup, C35265a.C35276k.ot_pc_main_tvfragment);
    }
}
