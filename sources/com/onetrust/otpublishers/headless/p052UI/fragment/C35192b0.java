package com.onetrust.otpublishers.headless.p052UI.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.google.firebase.installations.local.PersistedInstallation;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Helper.C34967b0;
import com.onetrust.otpublishers.headless.Internal.Helper.C34976h;
import com.onetrust.otpublishers.headless.Internal.Helper.C34983o;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35014d;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.C35127a;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35118r;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35119s;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35160l;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35173t;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35257c;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35259d;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35260e;
import com.urbanairship.iam.banner.C9156c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.fragment.b0 */
public class C35192b0 extends C31185b implements View.OnClickListener, C35160l.C35161a, C35127a, C35173t.C35175b {

    /* renamed from: A1 */
    public C35260e f86170A1;

    /* renamed from: B1 */
    public String f86171B1;

    /* renamed from: E0 */
    public TextView f86172E0;

    /* renamed from: F0 */
    public TextView f86173F0;

    /* renamed from: G0 */
    public TextView f86174G0;

    /* renamed from: H0 */
    public TextView f86175H0;

    /* renamed from: I0 */
    public TextView f86176I0;

    /* renamed from: J0 */
    public TextView f86177J0;

    /* renamed from: K0 */
    public TextView f86178K0;

    /* renamed from: L0 */
    public TextView f86179L0;

    /* renamed from: M0 */
    public TextView f86180M0;

    /* renamed from: N0 */
    public TextView f86181N0;

    /* renamed from: O0 */
    public TextView f86182O0;

    /* renamed from: P0 */
    public C31178a f86183P0;

    /* renamed from: Q0 */
    public C35160l f86184Q0;

    /* renamed from: R0 */
    public Context f86185R0;

    /* renamed from: S0 */
    public OTPublishersHeadlessSDK f86186S0;

    /* renamed from: T0 */
    public C35127a f86187T0;

    /* renamed from: U0 */
    public SwitchCompat f86188U0;

    /* renamed from: V0 */
    public SwitchCompat f86189V0;

    /* renamed from: W0 */
    public SwitchCompat f86190W0;

    /* renamed from: X */
    public TextView f86191X;

    /* renamed from: X0 */
    public SwitchCompat f86192X0;

    /* renamed from: Y */
    public TextView f86193Y;

    /* renamed from: Y0 */
    public SwitchCompat f86194Y0;

    /* renamed from: Z */
    public TextView f86195Z;

    /* renamed from: Z0 */
    public SwitchCompat f86196Z0;

    /* renamed from: a */
    public boolean f86197a;

    /* renamed from: a1 */
    public RecyclerView f86198a1;

    /* renamed from: b */
    public TextView f86199b;

    /* renamed from: b1 */
    public RelativeLayout f86200b1;

    /* renamed from: c */
    public TextView f86201c;

    /* renamed from: c1 */
    public RelativeLayout f86202c1;

    /* renamed from: d */
    public TextView f86203d;

    /* renamed from: d1 */
    public String f86204d1;

    /* renamed from: e */
    public TextView f86205e;

    /* renamed from: e1 */
    public String f86206e1;

    /* renamed from: f */
    public TextView f86207f;

    /* renamed from: f1 */
    public String f86208f1;

    /* renamed from: g */
    public TextView f86209g;

    /* renamed from: g1 */
    public FrameLayout f86210g1;

    /* renamed from: h1 */
    public int f86211h1;

    /* renamed from: i1 */
    public ImageView f86212i1;

    /* renamed from: j1 */
    public C35249x0 f86213j1;

    /* renamed from: k1 */
    public OTSDKListFragment f86214k1;

    /* renamed from: l1 */
    public C34962a f86215l1 = new C34962a();

    /* renamed from: m1 */
    public boolean f86216m1;

    /* renamed from: n1 */
    public boolean f86217n1;

    /* renamed from: o1 */
    public boolean f86218o1;

    /* renamed from: p1 */
    public boolean f86219p1;

    /* renamed from: q1 */
    public JSONObject f86220q1;

    /* renamed from: r1 */
    public JSONObject f86221r1;

    /* renamed from: s1 */
    public String f86222s1;

    /* renamed from: t1 */
    public UIUtils f86223t1;

    /* renamed from: u1 */
    public Map<String, String> f86224u1 = new HashMap();

    /* renamed from: v */
    public TextView f86225v;

    /* renamed from: v1 */
    public String f86226v1;

    /* renamed from: w */
    public TextView f86227w;

    /* renamed from: w1 */
    public C35119s f86228w1;

    /* renamed from: x */
    public TextView f86229x;

    /* renamed from: x1 */
    public OTConfiguration f86230x1;

    /* renamed from: y */
    public TextView f86231y;

    /* renamed from: y1 */
    public C35118r f86232y1;

    /* renamed from: z */
    public TextView f86233z;

    /* renamed from: z1 */
    public C35259d f86234z1;

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public /* synthetic */ void m145010A1(View view) {
        try {
            mo105297g1(this.f86189V0, true);
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error in setting subgroup consent parent for parentGroupLegitIntToggle " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public /* synthetic */ void m145011B1(String str, CompoundButton compoundButton, boolean z) {
        OTLogger.m143447b("OTPCDetail", "Updating consent of parent parentGroupConsentToggle: " + z);
        this.f86186S0.updatePurposeConsent(str, z);
        C34963b bVar = new C34963b(7);
        bVar.mo103581c(str);
        bVar.mo103580b(z ? 1 : 0);
        this.f86223t1.mo104267E(bVar, this.f86215l1);
        mo105305p1(z, this.f86188U0);
    }

    /* renamed from: C1 */
    public static boolean m145012C1(int i) {
        return i == C35265a.C35273h.sdk_list_link || i == C35265a.C35273h.sdk_list_link_child || i == C35265a.C35273h.sdk_list_link_child_below || i == C35265a.C35273h.sdk_list_link_parent_below_combined;
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public /* synthetic */ void m145013E1(String str, CompoundButton compoundButton, boolean z) {
        OTLogger.m143447b("OTPCDetail", "Updating consent of parent parentGroupConsentToggleNonIab : " + z);
        this.f86186S0.updatePurposeConsent(str, z);
        C34963b bVar = new C34963b(7);
        bVar.mo103581c(str);
        bVar.mo103580b(z ? 1 : 0);
        this.f86223t1.mo104267E(bVar, this.f86215l1);
        mo105305p1(z, this.f86196Z0);
    }

    /* renamed from: F1 */
    public static boolean m145014F1(int i) {
        return i == C35265a.C35273h.vendors_list_link || i == C35265a.C35273h.vendors_list_link_below || i == C35265a.C35273h.vendors_list_link_parent || i == C35265a.C35273h.vendors_list_link_parent_below_combined;
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public /* synthetic */ void m145015H1(String str, CompoundButton compoundButton, boolean z) {
        this.f86186S0.updatePurposeLegitInterest(str, z);
        C34963b bVar = new C34963b(11);
        bVar.mo103581c(str);
        bVar.mo103580b(z ? 1 : 0);
        this.f86223t1.mo104267E(bVar, this.f86215l1);
        mo105305p1(z, this.f86189V0);
    }

    /* renamed from: a1 */
    public static C35192b0 m145029a1(@C0359n0 String str, @C0359n0 C34962a aVar, @C0363p0 OTConfiguration oTConfiguration, @C0359n0 C35259d dVar) {
        C35192b0 b0Var = new C35192b0();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        b0Var.setArguments(bundle);
        b0Var.mo105298h1(aVar);
        b0Var.mo105299i1(oTConfiguration);
        b0Var.mo105303l1(dVar);
        return b0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public /* synthetic */ void m145030b1(DialogInterface dialogInterface) {
        JSONObject jSONObject;
        C31178a aVar = (C31178a) dialogInterface;
        this.f86183P0 = aVar;
        this.f86223t1.mo104281t(this.f86185R0, aVar);
        this.f86183P0.setCancelable(false);
        C31178a aVar2 = this.f86183P0;
        if (!(aVar2 == null || (jSONObject = this.f86220q1) == null)) {
            aVar2.setTitle((CharSequence) jSONObject.optString("GroupName"));
        }
        this.f86183P0.setOnKeyListener(new C35248x(this));
    }

    /* renamed from: d1 */
    public static void m145031d1(@C0359n0 View view, int i, @C0363p0 View view2) {
        view.setVisibility(i);
        if (view2 != null) {
            view2.setVisibility(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ void m145032m1(String str, View view) {
        mo105306q1(this.f86190W0.isChecked(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public /* synthetic */ void m145033n1(String str, CompoundButton compoundButton, boolean z) {
        OTLogger.m143447b("OTPCDetail", "Updating consent of parent groupConsentToggle : " + z);
        this.f86186S0.updatePurposeConsent(str, z);
        C34963b bVar = new C34963b(7);
        bVar.mo103581c(str);
        bVar.mo103580b(z ? 1 : 0);
        this.f86223t1.mo104267E(bVar, this.f86215l1);
        mo105305p1(z, this.f86190W0);
    }

    /* renamed from: o1 */
    public static void m145034o1(@C0359n0 List<String> list, @C0359n0 JSONObject jSONObject) {
        if (jSONObject.getJSONArray("FirstPartyCookies").length() > 0) {
            list.add(jSONObject.getString("CustomGroupId"));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public /* synthetic */ boolean m145035r1(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 4) {
            return false;
        }
        mo105270E(4);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public /* synthetic */ void m145036s1(View view) {
        try {
            mo105297g1(this.f86188U0, false);
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error in setting subgroup consent parent for parentGroupConsentToggle " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public /* synthetic */ void m145037t1(String str, View view) {
        mo105306q1(this.f86190W0.isChecked(), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public /* synthetic */ void m145038u1(String str, CompoundButton compoundButton, boolean z) {
        OTLogger.m143447b("OTPCDetail", "Updating consent of parent groupConsentToggleNonIab: " + z);
        this.f86186S0.updatePurposeConsent(str, z);
        C34963b bVar = new C34963b(7);
        bVar.mo103581c(str);
        bVar.mo103580b(z ? 1 : 0);
        this.f86223t1.mo104267E(bVar, this.f86215l1);
        mo105305p1(z, this.f86194Y0);
    }

    /* access modifiers changed from: private */
    /* renamed from: w1 */
    public /* synthetic */ void m145039w1(View view) {
        try {
            mo105297g1(this.f86196Z0, false);
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error in setting subgroup consent parent for parentGroupConsentToggleNonIab " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public /* synthetic */ void m145040x1(String str, CompoundButton compoundButton, boolean z) {
        this.f86186S0.updatePurposeLegitInterest(str, z);
        C34963b bVar = new C34963b(11);
        bVar.mo103581c(str);
        bVar.mo103580b(z ? 1 : 0);
        this.f86223t1.mo104267E(bVar, this.f86215l1);
        mo105305p1(z, this.f86192X0);
    }

    /* renamed from: y1 */
    public static boolean m145041y1(int i) {
        return i == C35265a.C35273h.view_legal_text_below || i == C35265a.C35273h.view_legal_text_parent || i == C35265a.C35273h.view_legal_text_parent_below_combined || i == C35265a.C35273h.view_legal_text_parent_below;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c1, code lost:
        if (com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r12.f86226v1) == false) goto L_0x00ce;
     */
    /* renamed from: D1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105269D1() {
        /*
            r12 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r12.f86198a1
            r1 = 0
            r2 = 0
            m145031d1(r0, r1, r2)
            android.widget.FrameLayout r0 = r12.f86210g1
            r3 = 8
            m145031d1(r0, r3, r2)
            android.widget.TextView r0 = r12.f86199b
            m145031d1(r0, r1, r2)
            android.widget.TextView r0 = r12.f86209g
            r12.mo105295e1(r0)
            androidx.appcompat.widget.SwitchCompat r0 = r12.f86188U0
            m145031d1(r0, r1, r2)
            androidx.appcompat.widget.SwitchCompat r0 = r12.f86189V0
            m145031d1(r0, r1, r2)
            android.widget.TextView r0 = r12.f86201c
            m145031d1(r0, r1, r2)
            android.widget.TextView r0 = r12.f86229x
            m145031d1(r0, r1, r2)
            android.widget.RelativeLayout r0 = r12.f86202c1
            r4 = 60
            r0.setPadding(r1, r1, r1, r4)
            r12.mo105273J1()
            org.json.JSONObject r0 = r12.f86220q1
            java.lang.String r5 = "Status"
            java.lang.String r0 = r0.getString(r5)
            java.lang.String r6 = "always"
            r0.contains(r6)
            org.json.JSONObject r0 = r12.f86220q1
            java.lang.String r0 = r0.getString(r5)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0056
            androidx.recyclerview.widget.RecyclerView r0 = r12.f86198a1
            r5 = 100
            r0.setPadding(r1, r4, r1, r5)
        L_0x0056:
            java.lang.String r0 = r12.f86226v1
            java.lang.String r1 = "user_friendly"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x00c3
        L_0x0061:
            java.lang.String r0 = r12.f86226v1
            java.lang.String r1 = "legal"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00b1
            org.json.JSONObject r0 = r12.f86220q1
            java.lang.String r1 = "Type"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "COOKIE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0097
            android.widget.TextView r0 = r12.f86195Z
            m145031d1(r0, r3, r2)
            android.widget.TextView r0 = r12.f86173F0
            m145031d1(r0, r3, r2)
            android.widget.TextView r0 = r12.f86231y
            m145031d1(r0, r3, r2)
            android.widget.TextView r0 = r12.f86174G0
            m145031d1(r0, r3, r2)
            android.widget.TextView r0 = r12.f86178K0
            m145031d1(r0, r3, r2)
            java.lang.String r0 = r12.f86222s1
            goto L_0x00ad
        L_0x0097:
            android.widget.TextView r0 = r12.f86195Z
            m145031d1(r0, r3, r2)
            android.widget.TextView r0 = r12.f86173F0
            m145031d1(r0, r3, r2)
            android.widget.TextView r0 = r12.f86231y
            m145031d1(r0, r3, r2)
            android.widget.TextView r0 = r12.f86174G0
            m145031d1(r0, r3, r2)
            java.lang.String r0 = r12.f86204d1
        L_0x00ad:
            r12.mo105294d(r0)
            goto L_0x00ce
        L_0x00b1:
            org.json.JSONObject r0 = r12.f86221r1
            java.lang.String r1 = r12.f86226v1
            boolean r0 = r0.isNull(r1)
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = r12.f86226v1
            boolean r0 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r0)
            if (r0 == 0) goto L_0x00ce
        L_0x00c3:
            com.onetrust.otpublishers.headless.UI.Helper.UIUtils r0 = r12.f86223t1
            android.content.Context r1 = r12.f86185R0
            android.widget.TextView r2 = r12.f86209g
            java.lang.String r3 = r12.f86204d1
            r0.mo104279r(r1, r2, r3)
        L_0x00ce:
            com.onetrust.otpublishers.headless.UI.adapter.l r0 = new com.onetrust.otpublishers.headless.UI.adapter.l
            android.content.Context r6 = r12.f86185R0
            int r7 = r12.f86211h1
            com.onetrust.otpublishers.headless.UI.mobiledatautils.d r1 = r12.f86234z1
            boolean r8 = r1.mo105549d()
            com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration r9 = r12.f86230x1
            com.onetrust.otpublishers.headless.UI.mobiledatautils.e r10 = r12.f86170A1
            com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK r11 = r12.f86186S0
            r4 = r0
            r5 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r12.f86184Q0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r12.f86198a1
            r1.setAdapter(r0)
            org.json.JSONObject r0 = r12.f86220q1
            java.lang.String r1 = "HasLegIntOptOut"
            boolean r0 = r0.getBoolean(r1)
            r12.f86217n1 = r0
            org.json.JSONObject r0 = r12.f86220q1
            java.lang.String r1 = "HasConsentOptOut"
            boolean r0 = r0.getBoolean(r1)
            r12.f86218o1 = r0
            com.onetrust.otpublishers.headless.UI.mobiledatautils.e r0 = r12.f86170A1
            java.lang.String r0 = r0.mo105580p()
            r12.f86206e1 = r0
            r12.mo105291b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.p052UI.fragment.C35192b0.mo105269D1():void");
    }

    /* renamed from: E */
    public void mo105270E(int i) {
        dismiss();
        C35127a aVar = this.f86187T0;
        if (aVar != null) {
            aVar.mo105080b(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00ba, code lost:
        if (com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r6.f86226v1) == false) goto L_0x00c7;
     */
    /* renamed from: G1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105271G1() {
        /*
            r6 = this;
            android.widget.RelativeLayout r0 = r6.f86202c1
            r1 = 0
            r0.setPadding(r1, r1, r1, r1)
            android.widget.TextView r0 = r6.f86175H0
            r2 = 8
            r3 = 0
            m145031d1(r0, r2, r3)
            android.widget.FrameLayout r0 = r6.f86210g1
            m145031d1(r0, r1, r3)
            androidx.recyclerview.widget.RecyclerView r0 = r6.f86198a1
            m145031d1(r0, r2, r3)
            android.widget.TextView r0 = r6.f86199b
            m145031d1(r0, r2, r3)
            android.widget.TextView r0 = r6.f86225v
            r6.mo105295e1(r0)
            android.widget.TextView r0 = r6.f86209g
            m145031d1(r0, r2, r3)
            androidx.appcompat.widget.SwitchCompat r0 = r6.f86188U0
            m145031d1(r0, r2, r3)
            androidx.appcompat.widget.SwitchCompat r0 = r6.f86189V0
            m145031d1(r0, r2, r3)
            android.widget.TextView r0 = r6.f86201c
            m145031d1(r0, r2, r3)
            android.widget.TextView r0 = r6.f86229x
            m145031d1(r0, r2, r3)
            com.onetrust.otpublishers.headless.UI.Helper.UIUtils r0 = r6.f86223t1
            org.json.JSONObject r1 = r6.f86220q1
            java.lang.String r0 = r0.mo104274j(r1)
            android.widget.TextView r1 = r6.f86207f
            r1.setText(r0)
            android.widget.TextView r0 = r6.f86207f
            r1 = 1
            androidx.core.view.C18196h2.m82478C1(r0, r1)
            android.widget.TextView r0 = r6.f86199b
            androidx.core.view.C18196h2.m82478C1(r0, r1)
            org.json.JSONObject r0 = r6.f86221r1
            if (r0 == 0) goto L_0x00c7
            org.json.JSONObject r0 = r6.f86220q1
            java.lang.String r1 = "Status"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "always"
            r0.contains(r1)
            java.lang.String r0 = r6.f86226v1
            java.lang.String r1 = "user_friendly"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x006f
            goto L_0x00bc
        L_0x006f:
            java.lang.String r0 = r6.f86226v1
            java.lang.String r1 = "legal"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00aa
            org.json.JSONObject r0 = r6.f86220q1
            java.lang.String r1 = "Type"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "COOKIE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
            goto L_0x00bc
        L_0x008a:
            com.onetrust.otpublishers.headless.UI.Helper.UIUtils r0 = r6.f86223t1
            android.content.Context r1 = r6.f86185R0
            android.widget.TextView r4 = r6.f86225v
            java.lang.String r5 = r6.f86222s1
            r0.mo104279r(r1, r4, r5)
            android.widget.TextView r0 = r6.f86195Z
            m145031d1(r0, r2, r3)
            android.widget.TextView r0 = r6.f86173F0
            m145031d1(r0, r2, r3)
            android.widget.TextView r0 = r6.f86231y
            m145031d1(r0, r2, r3)
            android.widget.TextView r0 = r6.f86174G0
            m145031d1(r0, r2, r3)
            goto L_0x00c7
        L_0x00aa:
            org.json.JSONObject r0 = r6.f86221r1
            java.lang.String r1 = r6.f86226v1
            boolean r0 = r0.isNull(r1)
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = r6.f86226v1
            boolean r0 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r0)
            if (r0 == 0) goto L_0x00c7
        L_0x00bc:
            com.onetrust.otpublishers.headless.UI.Helper.UIUtils r0 = r6.f86223t1
            android.content.Context r1 = r6.f86185R0
            android.widget.TextView r2 = r6.f86225v
            java.lang.String r3 = r6.f86204d1
            r0.mo104279r(r1, r2, r3)
        L_0x00c7:
            org.json.JSONObject r0 = r6.f86220q1
            java.lang.String r1 = "HasLegIntOptOut"
            boolean r0 = r0.getBoolean(r1)
            r6.f86217n1 = r0
            org.json.JSONObject r0 = r6.f86220q1
            java.lang.String r1 = "HasConsentOptOut"
            boolean r0 = r0.getBoolean(r1)
            r6.f86218o1 = r0
            com.onetrust.otpublishers.headless.UI.mobiledatautils.e r0 = r6.f86170A1
            java.lang.String r0 = r0.mo105580p()
            r6.f86206e1 = r0
            r6.mo105307v1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.p052UI.fragment.C35192b0.mo105271G1():void");
    }

    /* renamed from: I */
    public void mo105185I(String str, int i, boolean z, boolean z2) {
        (!z2 ? this.f86197a ? this.f86188U0 : this.f86196Z0 : this.f86189V0).setChecked(z);
    }

    /* renamed from: I1 */
    public final void mo105272I1() {
        String str;
        TextView textView;
        this.f86200b1.setPadding(0, 0, 0, 80);
        if (!this.f86221r1.getBoolean("IsIabEnabled") || !this.f86220q1.getBoolean("IsIabPurpose") || (str = this.f86208f1) == null) {
            m145031d1(this.f86227w, 8, (View) null);
            m145031d1(this.f86205e, 8, (View) null);
            m145031d1(this.f86229x, 8, (View) null);
            m145031d1(this.f86231y, 8, (View) null);
            if (!this.f86220q1.getBoolean("IsIabPurpose")) {
                mo105292b2();
                return;
            }
            return;
        }
        if (str.equals(C9156c.f24821Y)) {
            m145031d1(this.f86193Y, 0, (View) null);
            m145031d1(this.f86205e, 0, (View) null);
            m145031d1(this.f86229x, 0, (View) null);
            m145031d1(this.f86195Z, 0, (View) null);
            m145031d1(this.f86227w, 8, (View) null);
            textView = this.f86231y;
        } else if (this.f86208f1.equals(C9156c.f24820X)) {
            m145031d1(this.f86227w, 0, (View) null);
            m145031d1(this.f86205e, 0, (View) null);
            m145031d1(this.f86229x, 0, (View) null);
            m145031d1(this.f86231y, 0, (View) null);
            m145031d1(this.f86193Y, 8, (View) null);
            textView = this.f86195Z;
        } else {
            return;
        }
        m145031d1(textView, 8, (View) null);
    }

    /* renamed from: J1 */
    public final void mo105273J1() {
        if (!this.f86221r1.getBoolean("IsIabEnabled") || !this.f86220q1.getString("Type").contains("IAB")) {
            mo105278O1();
        } else {
            mo105286W1();
        }
    }

    /* renamed from: K1 */
    public final void mo105274K1() {
        RelativeLayout relativeLayout;
        int i;
        if (this.f86197a) {
            m145031d1(this.f86190W0, 0, (View) null);
            m145031d1(this.f86203d, 0, (View) null);
            relativeLayout = this.f86200b1;
            i = 100;
        } else {
            m145031d1(this.f86190W0, 8, (View) null);
            m145031d1(this.f86203d, 8, (View) null);
            m145031d1(this.f86188U0, 8, (View) null);
            m145031d1(this.f86201c, 8, (View) null);
            m145031d1(this.f86194Y0, 0, (View) null);
            m145031d1(this.f86196Z0, 0, (View) null);
            if (!C35020d.m143605J(this.f86204d1)) {
                m145031d1(this.f86209g, 0, (View) null);
                relativeLayout = this.f86200b1;
                i = 80;
            } else {
                m145031d1(this.f86209g, 8, (View) null);
                this.f86200b1.setPadding(0, 0, 0, 0);
                return;
            }
        }
        relativeLayout.setPadding(0, 0, 0, i);
    }

    /* renamed from: L1 */
    public final void mo105275L1() {
        TextView textView;
        String p = this.f86170A1.mo105580p();
        if (!this.f86217n1 || !p.equals("IAB2_PURPOSE") || !this.f86216m1) {
            m145031d1(this.f86192X0, 8, (View) null);
            m145031d1(this.f86205e, 8, (View) null);
            m145031d1(this.f86189V0, 8, (View) null);
            textView = this.f86229x;
        } else if (this.f86197a) {
            m145031d1(this.f86192X0, 0, (View) null);
            m145031d1(this.f86205e, 0, (View) null);
            return;
        } else {
            m145031d1(this.f86192X0, 8, (View) null);
            textView = this.f86205e;
        }
        m145031d1(textView, 8, (View) null);
    }

    /* renamed from: M1 */
    public final void mo105276M1() {
        int i;
        TextView textView;
        if (!this.f86217n1 || !this.f86206e1.equals("IAB2_PURPOSE") || !this.f86216m1) {
            m145031d1(this.f86192X0, 4, (View) null);
            i = 8;
            m145031d1(this.f86205e, 8, (View) null);
            m145031d1(this.f86189V0, 8, (View) null);
            textView = this.f86229x;
        } else {
            i = 0;
            m145031d1(this.f86192X0, 0, (View) null);
            textView = this.f86205e;
        }
        m145031d1(textView, i, (View) null);
    }

    /* renamed from: N1 */
    public final void mo105277N1() {
        this.f86212i1.setOnClickListener(this);
        this.f86227w.setOnClickListener(this);
        this.f86231y.setOnClickListener(this);
        this.f86195Z.setOnClickListener(this);
        this.f86193Y.setOnClickListener(this);
        this.f86172E0.setOnClickListener(this);
        this.f86173F0.setOnClickListener(this);
        this.f86177J0.setOnClickListener(this);
        this.f86178K0.setOnClickListener(this);
        this.f86174G0.setOnClickListener(this);
        this.f86175H0.setOnClickListener(this);
        this.f86176I0.setOnClickListener(this);
        this.f86179L0.setOnClickListener(this);
        this.f86180M0.setOnClickListener(this);
    }

    /* renamed from: O1 */
    public final void mo105278O1() {
        JSONArray jSONArray = new JSONArray();
        if (this.f86220q1.has("SubGroups")) {
            jSONArray = this.f86220q1.getJSONArray("SubGroups");
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.getJSONObject(i).getString("Type").contains("IAB")) {
                mo105285V1();
            }
        }
    }

    /* renamed from: P1 */
    public final void mo105279P1() {
        this.f86221r1 = this.f86186S0.getPreferenceCenterData();
        this.f86197a = new C34976h().mo103751m(new C35014d(this.f86185R0, "OTT_DEFAULT_USER"));
        mo105290a2();
        if (this.f86221r1 != null) {
            mo105283T1();
            mo105272I1();
            if (this.f86220q1.has("SubGroups")) {
                mo105269D1();
            } else {
                mo105271G1();
            }
        }
        mo105282S1();
    }

    /* renamed from: Q1 */
    public final void mo105280Q1() {
        String n = this.f86170A1.mo105578n();
        boolean z = false;
        boolean z2 = this.f86186S0.getPurposeConsentLocal(n) == 1;
        if (this.f86197a) {
            if (this.f86186S0.getPurposeLegitInterestLocal(n) == 1) {
                z = true;
            }
            this.f86188U0.setChecked(z2);
            this.f86189V0.setChecked(z);
            mo105305p1(z2, this.f86188U0);
            mo105305p1(z, this.f86189V0);
            this.f86190W0.setChecked(z2);
            mo105305p1(z2, this.f86190W0);
            this.f86192X0.setChecked(z);
            mo105305p1(z, this.f86192X0);
            return;
        }
        this.f86196Z0.setChecked(z2);
        mo105305p1(z2, this.f86196Z0);
        this.f86194Y0.setChecked(z2);
        mo105305p1(z2, this.f86194Y0);
    }

    /* renamed from: R1 */
    public final void mo105281R1() {
        if (!this.f86214k1.isAdded() && getActivity() != null) {
            Bundle bundle = new Bundle();
            try {
                ArrayList arrayList = new ArrayList();
                m145034o1(arrayList, this.f86220q1);
                if (this.f86220q1.has("SubGroups")) {
                    JSONArray jSONArray = this.f86220q1.getJSONArray("SubGroups");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        m145034o1(arrayList, jSONArray.getJSONObject(i));
                    }
                }
                bundle.putString("OT_GROUP_ID_LIST", arrayList.toString());
                bundle.putString("GroupName", this.f86220q1.getString("GroupName"));
                bundle.putString("CustomGroupId", this.f86220q1.getString("CustomGroupId"));
                bundle.putString("sdkLevelOptOutShow", this.f86171B1);
                bundle.putString("SDK_LIST_VIEW_TITLE", this.f86228w1.mo104902w().mo104763a().mo104663g());
                bundle.putString("ALWAYS_ACTIVE_TEXT", this.f86228w1.mo104879a().mo104663g());
                bundle.putString("ALWAYS_ACTIVE_TEXT_COLOR", this.f86228w1.mo104879a().mo104667k());
            } catch (JSONException e) {
                OTLogger.m143457l("OTPCDetail", "error in passing sdklist : " + e.getMessage());
            }
            this.f86214k1.setArguments(bundle);
            this.f86214k1.show(getActivity().mo57175g0(), OTFragmentTags.OT_SDK_LIST_FRAGMENT_TAG);
        }
    }

    /* renamed from: S1 */
    public final void mo105282S1() {
        String n = this.f86170A1.mo105578n();
        this.f86188U0.setOnClickListener(new C35230o(this));
        this.f86196Z0.setOnClickListener(new C35238s(this));
        this.f86189V0.setOnClickListener(new C35240t(this));
        this.f86190W0.setOnClickListener(new C35242u(this, n));
        this.f86194Y0.setOnClickListener(new C35244v(this, n));
        mo105287X1();
        mo105284U1();
    }

    /* renamed from: T1 */
    public final void mo105283T1() {
        JSONObject jSONObject;
        TextView textView;
        TextView textView2;
        this.f86226v1 = this.f86170A1.mo105577l();
        this.f86219p1 = this.f86221r1.getBoolean("ShowCookieList");
        this.f86204d1 = this.f86220q1.optString("GroupDescription");
        if (this.f86220q1.has("DescriptionLegal")) {
            this.f86222s1 = this.f86220q1.getString("DescriptionLegal");
        }
        if (this.f86221r1.has("PCGrpDescLinkPosition")) {
            String string = this.f86221r1.getString("PCGrpDescLinkPosition");
            this.f86208f1 = string;
            if (C35020d.m143605J(string) || "null".equals(this.f86208f1)) {
                this.f86208f1 = C9156c.f24821Y;
            }
        }
        C34983o j = new C34983o(this.f86185R0).mo103835j();
        if (this.f86220q1.has("SubGroups")) {
            mo105300j(C35260e.m145403m(this.f86220q1));
            jSONObject = this.f86220q1;
            textView = this.f86177J0;
            textView2 = this.f86172E0;
        } else if (!this.f86220q1.getBoolean("IsIabPurpose")) {
            mo105292b2();
            jSONObject = this.f86220q1;
            textView = this.f86193Y;
            textView2 = this.f86227w;
        } else {
            return;
        }
        C35260e.m145401h(jSONObject, textView, textView2, this.f86208f1, j);
    }

    /* renamed from: U1 */
    public final void mo105284U1() {
        String str;
        String str2;
        SwitchCompat switchCompat;
        Context context;
        UIUtils uIUtils;
        String n = this.f86170A1.mo105578n();
        this.f86192X0.setChecked(this.f86186S0.getPurposeLegitInterestLocal(n) == 1);
        if (this.f86186S0.getPurposeLegitInterestLocal(n) == 1) {
            uIUtils = this.f86223t1;
            context = this.f86185R0;
            switchCompat = this.f86192X0;
            str2 = this.f86170A1.mo105584t().mo104877C();
            str = this.f86170A1.mo105584t().mo104876B();
        } else {
            uIUtils = this.f86223t1;
            context = this.f86185R0;
            switchCompat = this.f86192X0;
            str2 = this.f86170A1.mo105584t().mo104877C();
            str = this.f86170A1.mo105584t().mo104875A();
        }
        uIUtils.mo104280s(context, switchCompat, str2, str);
        this.f86190W0.setOnCheckedChangeListener(new C35232p(this, n));
        this.f86194Y0.setOnCheckedChangeListener(new C35234q(this, n));
        this.f86192X0.setOnCheckedChangeListener(new C35236r(this, n));
    }

    /* renamed from: V1 */
    public final void mo105285V1() {
        if (this.f86208f1.equals(C9156c.f24821Y)) {
            m145031d1(this.f86177J0, 0, (View) null);
            m145031d1(this.f86172E0, 8, (View) null);
            if (this.f86226v1.equalsIgnoreCase("user_friendly")) {
                m145031d1(this.f86178K0, 0, (View) null);
            } else {
                if (this.f86226v1.equalsIgnoreCase("legal")) {
                    m145031d1(this.f86178K0, 8, (View) null);
                }
                this.f86200b1.setPadding(0, 0, 0, 80);
            }
            m145031d1(this.f86173F0, 8, (View) null);
            this.f86200b1.setPadding(0, 0, 0, 80);
        } else if (this.f86208f1.equals(C9156c.f24820X)) {
            m145031d1(this.f86172E0, 0, (View) null);
            m145031d1(this.f86177J0, 8, (View) null);
            if (this.f86226v1.equalsIgnoreCase("user_friendly")) {
                m145031d1(this.f86178K0, 8, (View) null);
                m145031d1(this.f86173F0, 0, (View) null);
            } else if (this.f86226v1.equalsIgnoreCase("legal")) {
                m145031d1(this.f86178K0, 8, (View) null);
                m145031d1(this.f86173F0, 8, (View) null);
            }
        }
    }

    /* renamed from: W1 */
    public final void mo105286W1() {
        String str = this.f86208f1;
        if (str == null) {
            return;
        }
        if (str.equals(C9156c.f24821Y)) {
            m145031d1(this.f86177J0, 0, (View) null);
            m145031d1(this.f86178K0, 0, (View) null);
            m145031d1(this.f86172E0, 8, (View) null);
            m145031d1(this.f86173F0, 8, (View) null);
            this.f86200b1.setPadding(0, 0, 0, 80);
        } else if (this.f86208f1.equals(C9156c.f24820X)) {
            m145031d1(this.f86172E0, 0, (View) null);
            m145031d1(this.f86173F0, 0, (View) null);
            m145031d1(this.f86177J0, 8, (View) null);
            m145031d1(this.f86178K0, 8, (View) null);
        }
    }

    /* renamed from: X1 */
    public final void mo105287X1() {
        String n = this.f86170A1.mo105578n();
        this.f86188U0.setOnCheckedChangeListener(new C35251y(this, n));
        this.f86196Z0.setOnCheckedChangeListener(new C35253z(this, n));
        this.f86189V0.setOnCheckedChangeListener(new C35189a0(this, n));
    }

    /* renamed from: Y1 */
    public final void mo105288Y1() {
        TextView textView = this.f86231y;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        TextView textView2 = this.f86195Z;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        TextView textView3 = this.f86173F0;
        textView3.setPaintFlags(textView3.getPaintFlags() | 8);
        TextView textView4 = this.f86174G0;
        textView4.setPaintFlags(textView4.getPaintFlags() | 8);
        this.f86178K0.setPaintFlags(this.f86174G0.getPaintFlags() | 8);
        TextView textView5 = this.f86227w;
        textView5.setPaintFlags(textView5.getPaintFlags() | 8);
        TextView textView6 = this.f86193Y;
        textView6.setPaintFlags(textView6.getPaintFlags() | 8);
        TextView textView7 = this.f86172E0;
        textView7.setPaintFlags(textView7.getPaintFlags() | 8);
        TextView textView8 = this.f86177J0;
        textView8.setPaintFlags(textView8.getPaintFlags() | 8);
        TextView textView9 = this.f86176I0;
        textView9.setPaintFlags(textView9.getPaintFlags() | 8);
        TextView textView10 = this.f86175H0;
        textView10.setPaintFlags(textView10.getPaintFlags() | 8);
        TextView textView11 = this.f86179L0;
        textView11.setPaintFlags(textView11.getPaintFlags() | 8);
        TextView textView12 = this.f86180M0;
        textView12.setPaintFlags(textView12.getPaintFlags() | 8);
    }

    /* renamed from: Z1 */
    public final void mo105289Z1() {
        String g = this.f86228w1.mo104891m().mo104663g();
        String g2 = this.f86228w1.mo104897s().mo104663g();
        this.f86188U0.setContentDescription(g);
        this.f86190W0.setContentDescription(g);
        this.f86194Y0.setContentDescription(g);
        this.f86196Z0.setContentDescription(g);
        this.f86192X0.setContentDescription(g2);
        this.f86189V0.setContentDescription(g2);
    }

    /* renamed from: a */
    public void mo105222a() {
        mo105280Q1();
        C35160l lVar = this.f86184Q0;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @C0376v0(api = 17)
    /* renamed from: a2 */
    public final void mo105290a2() {
        try {
            C35119s sVar = this.f86228w1;
            if (sVar != null) {
                this.f86200b1.setBackgroundColor(Color.parseColor(sVar.mo104887i()));
                mo105296f1(this.f86199b, this.f86228w1.mo104905z());
                mo105296f1(this.f86207f, this.f86228w1.mo104903x());
                mo105296f1(this.f86203d, this.f86228w1.mo104891m());
                mo105296f1(this.f86201c, this.f86228w1.mo104891m());
                mo105296f1(this.f86205e, this.f86228w1.mo104897s());
                mo105296f1(this.f86229x, this.f86228w1.mo104897s());
                mo105296f1(this.f86209g, this.f86228w1.mo104904y());
                mo105296f1(this.f86225v, this.f86228w1.mo104904y());
                C35102b0 a = this.f86228w1.mo104879a();
                mo105296f1(this.f86233z, a);
                mo105296f1(this.f86191X, a);
                mo105296f1(this.f86181N0, a);
                mo105296f1(this.f86182O0, a);
                C35102b0 a2 = this.f86228w1.mo104878D().mo104763a();
                mo105296f1(this.f86227w, a2);
                mo105296f1(this.f86193Y, a2);
                mo105296f1(this.f86172E0, a2);
                mo105296f1(this.f86177J0, a2);
                C35102b0 a3 = this.f86228w1.mo104902w().mo104763a();
                mo105296f1(this.f86176I0, a3);
                mo105296f1(this.f86175H0, a3);
                mo105296f1(this.f86180M0, a3);
                mo105296f1(this.f86179L0, a3);
                C35102b0 a4 = this.f86228w1.mo104894p().mo104763a();
                mo105296f1(this.f86174G0, a4);
                mo105296f1(this.f86173F0, a4);
                mo105296f1(this.f86231y, a4);
                mo105296f1(this.f86195Z, a4);
                mo105296f1(this.f86178K0, a4);
                C35257c.m145352d(this.f86174G0);
                C35257c.m145352d(this.f86173F0);
                C35257c.m145352d(this.f86231y);
                C35257c.m145352d(this.f86195Z);
                C35257c.m145352d(this.f86178K0);
                mo105289Z1();
                this.f86212i1.setColorFilter(Color.parseColor(this.f86228w1.mo104883e()));
                mo105308z1();
            }
        } catch (IllegalArgumentException e) {
            OTLogger.m143457l("OneTrust", "Error while applying Styles to PC Details view, err : " + e.getMessage());
        }
    }

    /* renamed from: b */
    public void mo105080b(int i) {
        if (i == 1) {
            mo105270E(i);
        }
        if (i == 3) {
            C35249x0 R0 = C35249x0.m145291R0(OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG, this.f86215l1, this.f86230x1);
            this.f86213j1 = R0;
            R0.mo105487c1(this.f86186S0);
        }
    }

    /* renamed from: b2 */
    public void mo105292b2() {
        TextView textView;
        if (!this.f86219p1 || this.f86208f1 == null || !C35260e.m145403m(this.f86220q1)) {
            m145031d1(this.f86175H0, 8, (View) null);
            m145031d1(this.f86176I0, 8, (View) null);
        } else if (this.f86208f1.equals(C9156c.f24821Y)) {
            m145031d1(this.f86180M0, 0, (View) null);
            m145031d1(this.f86175H0, 8, (View) null);
            textView = this.f86176I0;
            m145031d1(textView, 8, (View) null);
        } else if (this.f86208f1.equals(C9156c.f24820X)) {
            m145031d1(this.f86175H0, 0, (View) null);
            m145031d1(this.f86176I0, 0, (View) null);
        } else {
            return;
        }
        m145031d1(this.f86179L0, 8, (View) null);
        textView = this.f86180M0;
        m145031d1(textView, 8, (View) null);
    }

    /* renamed from: c1 */
    public final void mo105293c1(@C0359n0 View view) {
        this.f86202c1 = (RelativeLayout) view.findViewById(C35265a.C35273h.main_sub_layout);
        this.f86199b = (TextView) view.findViewById(C35265a.C35273h.parent_group_name);
        this.f86209g = (TextView) view.findViewById(C35265a.C35273h.parent_group_desc);
        this.f86207f = (TextView) view.findViewById(C35265a.C35273h.sub_group_name);
        this.f86225v = (TextView) view.findViewById(C35265a.C35273h.sub_group_desc);
        this.f86210g1 = (FrameLayout) view.findViewById(C35265a.C35273h.group_layout);
        this.f86200b1 = (RelativeLayout) view.findViewById(C35265a.C35273h.pc_details_main_layout);
        this.f86203d = (TextView) view.findViewById(C35265a.C35273h.tv_consent);
        this.f86205e = (TextView) view.findViewById(C35265a.C35273h.tv_legit_Int);
        this.f86188U0 = (SwitchCompat) view.findViewById(C35265a.C35273h.parent_group_consent_toggle);
        this.f86190W0 = (SwitchCompat) view.findViewById(C35265a.C35273h.consent_toggle);
        this.f86192X0 = (SwitchCompat) view.findViewById(C35265a.C35273h.legitInt_toggle);
        this.f86212i1 = (ImageView) view.findViewById(C35265a.C35273h.back_to_pc);
        this.f86227w = (TextView) view.findViewById(C35265a.C35273h.vendors_list_link);
        this.f86231y = (TextView) view.findViewById(C35265a.C35273h.view_legal_text);
        this.f86201c = (TextView) view.findViewById(C35265a.C35273h.parent_tv_consent);
        this.f86229x = (TextView) view.findViewById(C35265a.C35273h.parent_tv_legit_Int);
        this.f86189V0 = (SwitchCompat) view.findViewById(C35265a.C35273h.parent_group_li_toggle);
        this.f86194Y0 = (SwitchCompat) view.findViewById(C35265a.C35273h.consent_toggle_non_iab);
        this.f86196Z0 = (SwitchCompat) view.findViewById(C35265a.C35273h.parent_consent_toggle_non_iab);
        this.f86198a1 = (RecyclerView) view.findViewById(C35265a.C35273h.rv_pc_details);
        this.f86191X = (TextView) view.findViewById(C35265a.C35273h.alwaysActiveText);
        this.f86233z = (TextView) view.findViewById(C35265a.C35273h.alwaysActiveTextChild);
        this.f86181N0 = (TextView) view.findViewById(C35265a.C35273h.alwaysActiveText_non_iab);
        this.f86193Y = (TextView) view.findViewById(C35265a.C35273h.vendors_list_link_below);
        this.f86195Z = (TextView) view.findViewById(C35265a.C35273h.view_legal_text_below);
        this.f86172E0 = (TextView) view.findViewById(C35265a.C35273h.vendors_list_link_parent);
        this.f86173F0 = (TextView) view.findViewById(C35265a.C35273h.view_legal_text_parent);
        this.f86174G0 = (TextView) view.findViewById(C35265a.C35273h.view_legal_text_parent_below);
        this.f86175H0 = (TextView) view.findViewById(C35265a.C35273h.sdk_list_link);
        this.f86176I0 = (TextView) view.findViewById(C35265a.C35273h.sdk_list_link_child);
        this.f86179L0 = (TextView) view.findViewById(C35265a.C35273h.sdk_list_link_parent_below_combined);
        this.f86180M0 = (TextView) view.findViewById(C35265a.C35273h.sdk_list_link_child_below);
        this.f86177J0 = (TextView) view.findViewById(C35265a.C35273h.vendors_list_link_parent_below_combined);
        this.f86178K0 = (TextView) view.findViewById(C35265a.C35273h.view_legal_text_parent_below_combined);
        this.f86182O0 = (TextView) view.findViewById(C35265a.C35273h.parent_alwaysActiveText_non_iab);
        this.f86198a1.setHasFixedSize(true);
        this.f86198a1.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    /* renamed from: d */
    public final void mo105294d(@C0363p0 String str) {
        TextView textView;
        int i;
        if (str == null || C35020d.m143605J(str)) {
            textView = this.f86209g;
            i = 8;
        } else {
            this.f86223t1.mo104279r(this.f86185R0, this.f86209g, str);
            textView = this.f86209g;
            i = 0;
        }
        m145031d1(textView, i, (View) null);
    }

    /* renamed from: e1 */
    public final void mo105295e1(TextView textView) {
        m145031d1(textView, !C35020d.m143605J(this.f86204d1) ? 0 : 8, (View) null);
    }

    @C0376v0(api = 17)
    /* renamed from: f1 */
    public final void mo105296f1(@C0359n0 TextView textView, C35102b0 b0Var) {
        textView.setText(b0Var.mo104663g());
        textView.setTextColor(Color.parseColor(b0Var.mo104667k()));
        C35110j a = b0Var.mo104657a();
        new UIUtils().mo104264A(textView, a, this.f86230x1);
        if (!C35020d.m143605J(a.mo104757f())) {
            textView.setTextSize(Float.parseFloat(a.mo104757f()));
        }
        if (!C35020d.m143605J(b0Var.mo104665i())) {
            UIUtils.m143758y(textView, Integer.parseInt(b0Var.mo104665i()));
        }
    }

    /* renamed from: g1 */
    public final void mo105297g1(SwitchCompat switchCompat, boolean z) {
        if (this.f86220q1.has("SubGroups")) {
            this.f86170A1.mo105574g(this.f86220q1.getJSONArray("SubGroups"), switchCompat.isChecked(), z, this.f86186S0);
            this.f86184Q0.notifyDataSetChanged();
        }
    }

    /* renamed from: h1 */
    public void mo105298h1(@C0359n0 C34962a aVar) {
        this.f86215l1 = aVar;
    }

    /* renamed from: i1 */
    public void mo105299i1(@C0363p0 OTConfiguration oTConfiguration) {
        this.f86230x1 = oTConfiguration;
    }

    /* renamed from: j */
    public final void mo105300j(boolean z) {
        String str;
        TextView textView;
        if (z && this.f86219p1 && (str = this.f86208f1) != null) {
            if (str.equals(C9156c.f24821Y)) {
                textView = this.f86179L0;
            } else if (this.f86208f1.equals(C9156c.f24820X)) {
                this.f86179L0.setVisibility(8);
                textView = this.f86175H0;
            } else {
                return;
            }
            textView.setVisibility(0);
        }
    }

    /* renamed from: j1 */
    public void mo105301j1(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f86186S0 = oTPublishersHeadlessSDK;
    }

    /* renamed from: k1 */
    public void mo105302k1(C35127a aVar) {
        this.f86187T0 = aVar;
    }

    /* renamed from: l1 */
    public final void mo105303l1(C35259d dVar) {
        this.f86234z1 = dVar;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C35265a.C35273h.back_to_pc) {
            mo105270E(4);
        } else if (m145014F1(id)) {
            if (!this.f86213j1.isAdded() && getActivity() != null) {
                try {
                    boolean z = !this.f86220q1.optBoolean("IsIabPurpose") && C35260e.m145402j(this.f86220q1);
                    Bundle a = z ? this.f86170A1.mo105570a(this.f86224u1) : this.f86170A1.mo105576k(this.f86224u1);
                    a.putBoolean("generalVendors", z);
                    this.f86213j1.setArguments(a);
                    this.f86213j1.mo105488d1(this);
                    this.f86213j1.show(getActivity().mo57175g0(), OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG);
                    this.f86223t1.mo104267E(new C34963b(12), this.f86215l1);
                } catch (JSONException e) {
                    OTLogger.m143457l("OTPCDetail", "error thrown onClick: Vendor list link " + e);
                }
            }
        } else if (id == C35265a.C35273h.view_legal_text || m145041y1(id)) {
            C35020d.m143600B(this.f86185R0, this.f86170A1.mo105582r());
        } else if (m145012C1(id)) {
            mo105281R1();
        }
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f86223t1.mo104281t(this.f86185R0, this.f86183P0);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Context applicationContext = getContext().getApplicationContext();
        if (applicationContext != null && this.f86186S0 == null) {
            this.f86186S0 = new OTPublishersHeadlessSDK(applicationContext);
        }
    }

    @C0359n0
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35246w(this));
        return onCreateDialog;
    }

    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        this.f86185R0 = getContext();
        C35249x0 R0 = C35249x0.m145291R0(OTFragmentTags.OT_VENDOR_LIST_FRAGMENT_TAG, this.f86215l1, this.f86230x1);
        this.f86213j1 = R0;
        R0.mo105487c1(this.f86186S0);
        OTSDKListFragment T0 = OTSDKListFragment.m144974T0(OTFragmentTags.OT_SDK_LIST_FRAGMENT_TAG, this.f86230x1);
        this.f86214k1 = T0;
        T0.mo105244Z0(this);
        this.f86214k1.mo105243Y0(this.f86186S0);
        UIUtils uIUtils = new UIUtils();
        this.f86223t1 = uIUtils;
        View e = uIUtils.mo104271e(this.f86185R0, layoutInflater, viewGroup, C35265a.C35276k.ot_preference_center_details_fragment);
        Bundle arguments = getArguments();
        this.f86170A1 = new C35260e();
        if (arguments != null) {
            str = arguments.getString("SUBGROUP_ARRAY");
            this.f86211h1 = arguments.getInt("PARENT_POSITION");
            this.f86171B1 = arguments.getString("sdkLevelOptOutShow");
        } else {
            str = "";
        }
        this.f86170A1.mo105573f(str, UIUtils.m143749b(this.f86185R0, this.f86230x1), this.f86185R0, this.f86186S0);
        this.f86220q1 = this.f86170A1.mo105571b();
        this.f86216m1 = this.f86234z1.mo105549d();
        this.f86228w1 = this.f86170A1.mo105584t();
        this.f86232y1 = this.f86170A1.mo105583s();
        mo105293c1(e);
        mo105277N1();
        try {
            mo105279P1();
        } catch (JSONException e2) {
            OTLogger.m143457l("OneTrust", "error in populating views with data " + e2.getMessage());
        }
        return e;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f86215l1 = null;
        this.f86187T0 = null;
    }

    public void onResume() {
        super.onResume();
        mo105280Q1();
    }

    /* renamed from: p1 */
    public final void mo105305p1(boolean z, @C0359n0 SwitchCompat switchCompat) {
        UIUtils uIUtils;
        String str;
        String str2;
        Context context;
        if (z) {
            uIUtils = this.f86223t1;
            context = this.f86185R0;
            str2 = this.f86170A1.mo105584t().mo104877C();
            str = this.f86170A1.mo105584t().mo104876B();
        } else {
            uIUtils = this.f86223t1;
            context = this.f86185R0;
            str2 = this.f86170A1.mo105584t().mo104877C();
            str = this.f86170A1.mo105584t().mo104875A();
        }
        uIUtils.mo104280s(context, switchCompat, str2, str);
    }

    /* renamed from: q1 */
    public final void mo105306q1(boolean z, @C0359n0 String str) {
        JSONArray l = new C34967b0(this.f86185R0).mo103644l(str);
        if (l != null) {
            for (int i = 0; i < l.length(); i++) {
                try {
                    this.f86186S0.updateSDKConsentStatus(l.get(i).toString(), z);
                } catch (JSONException e) {
                    OTLogger.m143457l("OTPCDetail", "Error while Updating consent of SDK " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: v1 */
    public final void mo105307v1() {
        TextView textView;
        View view;
        if (this.f86220q1.getString(PersistedInstallation.f80251i).contains("always") || this.f86220q1.getString("Type").equals("IAB2_SPL_PURPOSE") || this.f86220q1.getString("Type").equals("IAB2_FEATURE")) {
            m145031d1(this.f86190W0, 8, (View) null);
            m145031d1(this.f86188U0, 8, (View) null);
            m145031d1(this.f86192X0, 8, (View) null);
            m145031d1(this.f86189V0, 8, (View) null);
            m145031d1(this.f86229x, 8, (View) null);
            m145031d1(this.f86205e, 8, (View) null);
            if (this.f86197a) {
                m145031d1(this.f86201c, 8, (View) null);
                m145031d1(this.f86191X, 8, (View) null);
                m145031d1(this.f86181N0, 8, (View) null);
                m145031d1(this.f86203d, 0, (View) null);
                textView = this.f86233z;
            } else {
                m145031d1(this.f86203d, 8, (View) null);
                m145031d1(this.f86233z, 8, (View) null);
                textView = this.f86181N0;
            }
        } else {
            mo105276M1();
            if (!this.f86218o1) {
                m145031d1(this.f86190W0, 8, (View) null);
                m145031d1(this.f86203d, 8, (View) null);
                m145031d1(this.f86188U0, 8, (View) null);
                view = this.f86201c;
            } else if (this.f86197a) {
                m145031d1(this.f86190W0, 0, (View) null);
                textView = this.f86203d;
            } else {
                m145031d1(this.f86190W0, 8, (View) null);
                m145031d1(this.f86203d, 8, (View) null);
                m145031d1(this.f86194Y0, 0, (View) null);
                view = this.f86196Z0;
            }
            m145031d1(view, 8, (View) null);
            return;
        }
        m145031d1(textView, 0, (View) null);
    }

    /* renamed from: z1 */
    public final void mo105308z1() {
        C35118r rVar = this.f86232y1;
        if (rVar == null || rVar.mo104873d()) {
            mo105288Y1();
        }
    }

    /* renamed from: b */
    public final void mo105291b() {
        TextView textView;
        if (this.f86220q1.getString(PersistedInstallation.f80251i).contains("always") || this.f86220q1.getString("Type").equals("IAB2_SPL_PURPOSE") || this.f86220q1.getString("Type").equals("IAB2_FEATURE")) {
            m145031d1(this.f86190W0, 8, (View) null);
            m145031d1(this.f86194Y0, 8, (View) null);
            m145031d1(this.f86188U0, 8, (View) null);
            m145031d1(this.f86196Z0, 8, (View) null);
            m145031d1(this.f86192X0, 8, (View) null);
            m145031d1(this.f86189V0, 8, (View) null);
            m145031d1(this.f86229x, 8, (View) null);
            m145031d1(this.f86205e, 8, (View) null);
            m145031d1(this.f86203d, 8, (View) null);
            if (this.f86197a) {
                m145031d1(this.f86201c, 0, (View) null);
                m145031d1(this.f86191X, 0, (View) null);
                textView = this.f86182O0;
            } else {
                m145031d1(this.f86201c, 8, (View) null);
                m145031d1(this.f86191X, 8, (View) null);
                m145031d1(this.f86182O0, 0, (View) null);
                return;
            }
        } else {
            this.f86199b.setPadding(0, 0, 0, 25);
            mo105275L1();
            if (this.f86218o1) {
                mo105274K1();
                return;
            }
            m145031d1(this.f86190W0, 8, (View) null);
            m145031d1(this.f86203d, 8, (View) null);
            m145031d1(this.f86188U0, 8, (View) null);
            textView = this.f86201c;
        }
        m145031d1(textView, 8, (View) null);
    }
}
