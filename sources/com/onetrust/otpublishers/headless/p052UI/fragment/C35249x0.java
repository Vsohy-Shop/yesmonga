package com.onetrust.otpublishers.headless.p052UI.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.C19232h;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Event.C34962a;
import com.onetrust.otpublishers.headless.Internal.Event.C34963b;
import com.onetrust.otpublishers.headless.Internal.Helper.C34983o;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTConsentInteractionType;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.Public.OTVendorListMode;
import com.onetrust.otpublishers.headless.Public.uiutils.OTVendorUtils;
import com.onetrust.otpublishers.headless.p052UI.C35127a;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35100a0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35121u;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35132c;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35139e;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35157k0;
import com.onetrust.otpublishers.headless.p052UI.fragment.C35213h0;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35256b;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35263h;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.fragment.x0 */
public class C35249x0 extends C31185b implements View.OnClickListener, OTVendorUtils.ItemListener, C35213h0.C35214a {

    /* renamed from: E0 */
    public OTVendorUtils f86518E0;

    /* renamed from: F0 */
    public String f86519F0;

    /* renamed from: G0 */
    public String f86520G0;

    /* renamed from: H0 */
    public String f86521H0;

    /* renamed from: I0 */
    public JSONObject f86522I0;

    /* renamed from: J0 */
    public View f86523J0;

    /* renamed from: K0 */
    public View f86524K0;

    /* renamed from: L0 */
    public EditText f86525L0;

    /* renamed from: M0 */
    public OTConfiguration f86526M0;

    /* renamed from: N0 */
    public UIUtils f86527N0;

    /* renamed from: O0 */
    public CardView f86528O0;

    /* renamed from: P0 */
    public RecyclerView f86529P0;

    /* renamed from: Q0 */
    public boolean f86530Q0;

    /* renamed from: R0 */
    public boolean f86531R0;

    /* renamed from: S0 */
    public boolean f86532S0;

    /* renamed from: T0 */
    public SearchView f86533T0;

    /* renamed from: U0 */
    public Map<String, String> f86534U0 = new HashMap();

    /* renamed from: V0 */
    public Map<String, String> f86535V0 = new HashMap();

    /* renamed from: W0 */
    public ImageView f86536W0;

    /* renamed from: X */
    public SwitchCompat f86537X;

    /* renamed from: X0 */
    public Button f86538X0;

    /* renamed from: Y */
    public C34962a f86539Y = new C34962a();

    /* renamed from: Y0 */
    public Button f86540Y0;

    /* renamed from: Z */
    public C35213h0 f86541Z;

    /* renamed from: Z0 */
    public Button f86542Z0;

    /* renamed from: a */
    public TextView f86543a;

    /* renamed from: a1 */
    public C35157k0 f86544a1;

    /* renamed from: b */
    public TextView f86545b;

    /* renamed from: b1 */
    public C35139e f86546b1;

    /* renamed from: c */
    public RelativeLayout f86547c;

    /* renamed from: c1 */
    public C35132c f86548c1;

    /* renamed from: d */
    public C31178a f86549d;

    /* renamed from: d1 */
    public String f86550d1 = OTVendorListMode.IAB;

    /* renamed from: e */
    public ImageView f86551e;

    /* renamed from: e1 */
    public int f86552e1;

    /* renamed from: f */
    public ImageView f86553f;

    /* renamed from: f1 */
    public C35263h f86554f1;

    /* renamed from: g */
    public ImageView f86555g;

    /* renamed from: g1 */
    public C35015e f86556g1;

    /* renamed from: v */
    public Context f86557v;

    /* renamed from: w */
    public Button f86558w;

    /* renamed from: x */
    public RelativeLayout f86559x;

    /* renamed from: y */
    public OTPublishersHeadlessSDK f86560y;

    /* renamed from: z */
    public C35127a f86561z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.fragment.x0$a */
    public class C35250a implements SearchView.C0666m {
        public C35250a() {
        }

        /* renamed from: a */
        public boolean mo3026a(String str) {
            if (C35020d.m143605J(str)) {
                C35249x0.this.mo105493l1();
                return false;
            }
            C35249x0.this.mo105489g1(str, true);
            return false;
        }

        /* renamed from: b */
        public boolean mo3027b(String str) {
            C35249x0.this.mo105489g1(str, true);
            return false;
        }
    }

    @C0359n0
    /* renamed from: R0 */
    public static C35249x0 m145291R0(@C0359n0 String str, @C0359n0 C34962a aVar, @C0363p0 OTConfiguration oTConfiguration) {
        C35249x0 x0Var = new C35249x0();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        x0Var.setArguments(bundle);
        x0Var.mo105483a1(aVar);
        x0Var.mo105486b1(oTConfiguration);
        return x0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public /* synthetic */ void m145292T0(DialogInterface dialogInterface) {
        C31178a aVar = (C31178a) dialogInterface;
        this.f86549d = aVar;
        this.f86527N0.mo104281t(this.f86557v, aVar);
        this.f86549d.setCancelable(false);
        this.f86549d.setCanceledOnTouchOutside(false);
        C35263h hVar = this.f86554f1;
        if (!(hVar == null || hVar.mo105629w().mo104966a() == null)) {
            this.f86549d.setTitle((CharSequence) this.f86554f1.mo105629w().mo104966a().mo104663g());
        }
        this.f86549d.setOnKeyListener(new C35247w0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public /* synthetic */ void m145293X0(CompoundButton compoundButton, boolean z) {
        Context context;
        String str;
        String str2;
        SwitchCompat switchCompat;
        this.f86530Q0 = z;
        OTLogger.m143447b("OneTrust", "onCreateViewSetOnCheckedChangeListener " + this.f86530Q0);
        UIUtils uIUtils = this.f86527N0;
        if (z) {
            context = this.f86557v;
            switchCompat = this.f86537X;
            str2 = this.f86519F0;
            str = this.f86520G0;
        } else {
            context = this.f86557v;
            switchCompat = this.f86537X;
            str2 = this.f86519F0;
            str = this.f86521H0;
        }
        uIUtils.mo104280s(context, switchCompat, str2, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ boolean m145296h1(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        new UIUtils().mo104267E(new C34963b(13), this.f86539Y);
        mo105485b(3);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public /* synthetic */ boolean m145297p1() {
        mo105493l1();
        return false;
    }

    @C0359n0
    /* renamed from: S0 */
    public final Map<String, String> mo105476S0(@C0363p0 String str) {
        String str2;
        Map<String, String> map;
        String str3;
        if (str != null && !C35020d.m143605J(str) && !C28819e.f70617a.equals(str)) {
            for (String split : str.substring(1, str.length() - 1).split(",")) {
                String[] split2 = split.split("=");
                if (OTVendorListMode.IAB.equalsIgnoreCase(this.f86550d1)) {
                    map = this.f86534U0;
                    str2 = split2[0].trim();
                    str3 = split2[1];
                } else {
                    map = this.f86535V0;
                    str2 = split2[0].trim();
                    str3 = split2[1];
                }
                map.put(str2, str3.trim());
            }
        }
        return OTVendorListMode.IAB.equalsIgnoreCase(this.f86550d1) ? this.f86534U0 : this.f86535V0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00f6, code lost:
        if (com.onetrust.otpublishers.headless.Public.OTVendorListMode.GENERAL.equalsIgnoreCase(r4.f86550d1) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00f8, code lost:
        r4.f86536W0.getDrawable().setTint(android.graphics.Color.parseColor(r4.f86554f1.mo105621o()));
        com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143447b("VendorsList", "selectedFilterMap = " + r4.f86534U0.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0125, code lost:
        r5 = "Selected";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x00e4, code lost:
        if (com.onetrust.otpublishers.headless.Public.OTVendorListMode.IAB.equalsIgnoreCase(r4.f86550d1) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x019a  */
    @androidx.annotation.C0376v0(api = 21)
    /* renamed from: U0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105477U0(@androidx.annotation.C0359n0 android.view.View r5) {
        /*
            r4 = this;
            java.lang.String r0 = "VendorsList"
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.rv_vendors_list
            android.view.View r1 = r5.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r4.f86529P0 = r1
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r3 = r4.f86557v
            r2.<init>(r3)
            r1.setLayoutManager(r2)
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.back_from_vendorlist
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.f86551e = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.VL_page_title
            android.view.View r1 = r5.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.f86543a = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.vendor_allow_all_title
            android.view.View r1 = r5.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.f86545b = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.vendors_parent_layout
            android.view.View r1 = r5.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r4.f86559x = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.vendors_confirm_choices_btn
            android.view.View r1 = r5.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r4.f86558w = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.footer_layout
            android.view.View r1 = r5.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r4.f86547c = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.all_consent_toggle
            android.view.View r1 = r5.findViewById(r1)
            androidx.appcompat.widget.SwitchCompat r1 = (androidx.appcompat.widget.SwitchCompat) r1
            r4.f86537X = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.search_vendor
            android.view.View r1 = r5.findViewById(r1)
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            r4.f86533T0 = r1
            int r2 = androidx.appcompat.C0387a.C0394g.search_src_text
            android.view.View r1 = r1.findViewById(r2)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r4.f86525L0 = r1
            androidx.appcompat.widget.SearchView r1 = r4.f86533T0
            int r2 = androidx.appcompat.C0387a.C0394g.search_mag_icon
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.f86553f = r1
            androidx.appcompat.widget.SearchView r1 = r4.f86533T0
            int r2 = androidx.appcompat.C0387a.C0394g.search_close_btn
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.f86555g = r1
            androidx.appcompat.widget.SearchView r1 = r4.f86533T0
            int r2 = androidx.appcompat.C0387a.C0394g.search_edit_frame
            android.view.View r1 = r1.findViewById(r2)
            r4.f86524K0 = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.filter_vendors
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.f86536W0 = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.view3
            android.view.View r1 = r5.findViewById(r1)
            r4.f86523J0 = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.button_iab_vendors
            android.view.View r1 = r5.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r4.f86538X0 = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.button_google_vendors
            android.view.View r1 = r5.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r4.f86540Y0 = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.button_general_vendors
            android.view.View r1 = r5.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r4.f86542Z0 = r1
            int r1 = com.onetrust.otpublishers.headless.C35265a.C35273h.tab_layout
            android.view.View r5 = r5.findViewById(r1)
            androidx.cardview.widget.CardView r5 = (androidx.cardview.widget.CardView) r5
            r4.f86528O0 = r5
            com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK r5 = r4.f86560y     // Catch:{ JSONException -> 0x0165 }
            org.json.JSONObject r5 = r5.getPreferenceCenterData()     // Catch:{ JSONException -> 0x0165 }
            r4.f86522I0 = r5     // Catch:{ JSONException -> 0x0165 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r4.f86534U0     // Catch:{ JSONException -> 0x0165 }
            int r5 = r5.size()     // Catch:{ JSONException -> 0x0165 }
            if (r5 <= 0) goto L_0x00e6
            java.lang.String r5 = "iab"
            java.lang.String r1 = r4.f86550d1     // Catch:{ JSONException -> 0x0165 }
            boolean r5 = r5.equalsIgnoreCase(r1)     // Catch:{ JSONException -> 0x0165 }
            if (r5 != 0) goto L_0x00f8
        L_0x00e6:
            java.util.Map<java.lang.String, java.lang.String> r5 = r4.f86535V0     // Catch:{ JSONException -> 0x0165 }
            int r5 = r5.size()     // Catch:{ JSONException -> 0x0165 }
            if (r5 <= 0) goto L_0x0128
            java.lang.String r5 = "general"
            java.lang.String r1 = r4.f86550d1     // Catch:{ JSONException -> 0x0165 }
            boolean r5 = r5.equalsIgnoreCase(r1)     // Catch:{ JSONException -> 0x0165 }
            if (r5 == 0) goto L_0x0128
        L_0x00f8:
            android.widget.ImageView r5 = r4.f86536W0     // Catch:{ JSONException -> 0x0165 }
            android.graphics.drawable.Drawable r5 = r5.getDrawable()     // Catch:{ JSONException -> 0x0165 }
            com.onetrust.otpublishers.headless.UI.mobiledatautils.h r1 = r4.f86554f1     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r1 = r1.mo105621o()     // Catch:{ JSONException -> 0x0165 }
            int r1 = android.graphics.Color.parseColor(r1)     // Catch:{ JSONException -> 0x0165 }
            r5.setTint(r1)     // Catch:{ JSONException -> 0x0165 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0165 }
            r5.<init>()     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r1 = "selectedFilterMap = "
            r5.append(r1)     // Catch:{ JSONException -> 0x0165 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.f86534U0     // Catch:{ JSONException -> 0x0165 }
            int r1 = r1.size()     // Catch:{ JSONException -> 0x0165 }
            r5.append(r1)     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x0165 }
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143447b(r0, r5)     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r5 = "Selected"
            goto L_0x014e
        L_0x0128:
            com.onetrust.otpublishers.headless.UI.mobiledatautils.h r5 = r4.f86554f1     // Catch:{ JSONException -> 0x0165 }
            if (r5 == 0) goto L_0x014c
            java.lang.String r5 = r5.mo105620n()     // Catch:{ JSONException -> 0x0165 }
            boolean r5 = com.onetrust.otpublishers.headless.Internal.C35020d.m143605J(r5)     // Catch:{ JSONException -> 0x0165 }
            if (r5 != 0) goto L_0x014c
            android.widget.ImageView r5 = r4.f86536W0     // Catch:{ JSONException -> 0x0165 }
            android.graphics.drawable.Drawable r5 = r5.getDrawable()     // Catch:{ JSONException -> 0x0165 }
            com.onetrust.otpublishers.headless.UI.mobiledatautils.h r1 = r4.f86554f1     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r1 = r1.mo105620n()     // Catch:{ JSONException -> 0x0165 }
            int r1 = android.graphics.Color.parseColor(r1)     // Catch:{ JSONException -> 0x0165 }
            r5.setTint(r1)     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r5 = "Unselected"
            goto L_0x014e
        L_0x014c:
            java.lang.String r5 = ""
        L_0x014e:
            android.widget.ImageView r1 = r4.f86536W0     // Catch:{ JSONException -> 0x0165 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0165 }
            r2.<init>()     // Catch:{ JSONException -> 0x0165 }
            r2.append(r5)     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r5 = "Filter"
            r2.append(r5)     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r5 = r2.toString()     // Catch:{ JSONException -> 0x0165 }
            r1.setContentDescription(r5)     // Catch:{ JSONException -> 0x0165 }
            goto L_0x017e
        L_0x0165:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error while populating updating filter icon color"
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.onetrust.otpublishers.headless.Internal.Log.OTLogger.m143457l(r0, r5)
        L_0x017e:
            com.onetrust.otpublishers.headless.UI.Helper.UIUtils r5 = r4.f86527N0
            android.widget.RelativeLayout r0 = r4.f86547c
            android.content.Context r1 = r4.f86557v
            r5.mo104282u(r0, r1)
            com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration r5 = r4.f86526M0
            if (r5 == 0) goto L_0x019a
            boolean r5 = r5.isShowConfirmMyChoice()
            if (r5 == 0) goto L_0x019a
            android.widget.Button r5 = r4.f86558w
            r0 = 0
            r5.setVisibility(r0)
            android.widget.RelativeLayout r5 = r4.f86547c
            goto L_0x01a4
        L_0x019a:
            android.widget.Button r5 = r4.f86558w
            r0 = 8
            r5.setVisibility(r0)
            android.widget.RelativeLayout r5 = r4.f86547c
            r0 = 4
        L_0x01a4:
            r5.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onetrust.otpublishers.headless.p052UI.fragment.C35249x0.mo105477U0(android.view.View):void");
    }

    /* renamed from: V0 */
    public final void mo105478V0(@C0359n0 Button button, @C0359n0 Button button2, @C0359n0 Button button3) {
        try {
            String a = this.f86554f1.mo105617k().mo104699a();
            if (!C35020d.m143605J(a)) {
                button.setBackgroundColor(Color.parseColor(a));
            }
            C35263h hVar = this.f86554f1;
            String e = hVar.mo105612e(hVar.mo105617k().mo104296u(), "PcButtonTextColor");
            if (!C35020d.m143605J(e)) {
                button.setTextColor(Color.parseColor(e));
            }
            C35263h hVar2 = this.f86554f1;
            String e2 = hVar2.mo105612e(hVar2.mo105630x().mo104667k(), "PcTextColor");
            button2.setBackgroundColor(0);
            button3.setBackgroundColor(0);
            this.f86528O0.setCardBackgroundColor(0);
            if (!C35020d.m143605J(e2)) {
                button2.setTextColor(Color.parseColor(e2));
                button3.setTextColor(Color.parseColor(e2));
            }
        } catch (JSONException unused) {
            OTLogger.m143457l("VendorsList", "Error on parsing PC button color.");
        }
    }

    /* renamed from: W0 */
    public void mo105479W0(@C0359n0 Button button, @C0359n0 C35105e eVar, @C0359n0 OTConfiguration oTConfiguration) {
        C35110j o = eVar.mo104712o();
        new UIUtils().mo104283v(button, o, oTConfiguration);
        button.setText(eVar.mo104295s());
        if (!C35020d.m143605J(o.mo104757f())) {
            button.setTextSize(Float.parseFloat(o.mo104757f()));
        }
        if (!C35020d.m143605J(eVar.mo104296u())) {
            button.setTextColor(Color.parseColor(eVar.mo104296u()));
        } else {
            try {
                button.setTextColor(Color.parseColor(this.f86522I0.getString("PcButtonTextColor")));
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "error while parsing " + e.getMessage());
            }
        }
        try {
            UIUtils.m143755p(this.f86557v, button, eVar, this.f86554f1.mo105612e(eVar.mo104699a(), "PcButtonColor"), eVar.mo104702e());
        } catch (JSONException e2) {
            OTLogger.m143457l("OneTrust", "error while parsing PC_BUTTON_COLOR : " + e2.getMessage());
        }
    }

    /* renamed from: Y0 */
    public void mo105480Y0(@C0359n0 EditText editText, @C0359n0 View view, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 C35100a0 a0Var) {
        if (!C35020d.m143605J(a0Var.mo104652o())) {
            editText.setTextColor(Color.parseColor(a0Var.mo104652o()));
        }
        if (!C35020d.m143605J(a0Var.mo104650m())) {
            editText.setHintTextColor(Color.parseColor(a0Var.mo104650m()));
        }
        if (!C35020d.m143605J(a0Var.mo104648k())) {
            imageView.setColorFilter(Color.parseColor(a0Var.mo104648k()), PorterDuff.Mode.SRC_IN);
        }
        if (!C35020d.m143605J(a0Var.mo104646i())) {
            imageView2.setColorFilter(Color.parseColor(a0Var.mo104646i()), PorterDuff.Mode.SRC_IN);
        }
        view.setBackgroundResource(C35265a.C35272g.ot_search_border);
        GradientDrawable gradientDrawable = new GradientDrawable();
        String g = a0Var.mo104644g();
        String c = a0Var.mo104640c();
        String a = a0Var.mo104638a();
        String e = a0Var.mo104642e();
        gradientDrawable.setStroke(Integer.parseInt(g), Color.parseColor(c));
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor(a));
        gradientDrawable.setCornerRadius(Float.parseFloat(e));
        view.setBackground(gradientDrawable);
    }

    /* renamed from: Z0 */
    public void mo105481Z0(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var, @C0359n0 OTConfiguration oTConfiguration) {
        C35110j a = b0Var.mo104657a();
        new UIUtils().mo104264A(textView, a, oTConfiguration);
        if (!C35020d.m143605J(a.mo104757f())) {
            textView.setTextSize(Float.parseFloat(a.mo104757f()));
        }
        textView.setText(b0Var.mo104663g());
        if (!C35020d.m143605J(b0Var.mo104667k())) {
            textView.setTextColor(Color.parseColor(b0Var.mo104667k()));
        } else {
            try {
                textView.setTextColor(Color.parseColor(this.f86522I0.getString("PcTextColor")));
            } catch (JSONException e) {
                OTLogger.m143457l("OneTrust", "error while parsing " + e.getMessage());
            }
        }
        if (!C35020d.m143605J(b0Var.mo104665i())) {
            UIUtils.m143758y(textView, Integer.parseInt(b0Var.mo104665i()));
        }
    }

    /* renamed from: a */
    public final void mo105482a() {
        if (OTVendorListMode.IAB.equalsIgnoreCase(this.f86550d1) && this.f86544a1 != null) {
            OTLogger.m143447b("OneTrust", "onCreateViewSetonClick iabVendorAdapter" + this.f86530Q0);
            this.f86544a1.mo105151H(this.f86530Q0);
        } else if (!OTVendorListMode.GOOGLE.equalsIgnoreCase(this.f86550d1) || this.f86546b1 == null) {
            OTLogger.m143447b("OneTrust", "onCreateViewSetonClick generalVendorAdapter" + this.f86530Q0);
            this.f86548c1.mo105090I(this.f86530Q0);
        } else {
            OTLogger.m143447b("OneTrust", "onCreateViewSetonClick googleVendorAdapter" + this.f86530Q0);
            this.f86546b1.mo105111E(this.f86530Q0);
        }
    }

    /* renamed from: a1 */
    public void mo105483a1(@C0359n0 C34962a aVar) {
        this.f86539Y = aVar;
    }

    /* renamed from: b */
    public final void mo105485b(int i) {
        dismiss();
        C35127a aVar = this.f86561z;
        if (aVar != null) {
            aVar.mo105080b(i);
        }
        this.f86534U0.clear();
    }

    /* renamed from: b1 */
    public void mo105486b1(@C0363p0 OTConfiguration oTConfiguration) {
        this.f86526M0 = oTConfiguration;
    }

    @C0376v0(api = 21)
    /* renamed from: c */
    public void mo105381c(@C0359n0 Map<String, String> map) {
        String str;
        Map<String, String> map2;
        if (OTVendorListMode.IAB.equalsIgnoreCase(this.f86550d1)) {
            this.f86534U0 = map;
        } else {
            this.f86535V0 = map;
        }
        if (map.size() > 0) {
            if (OTVendorListMode.IAB.equalsIgnoreCase(this.f86550d1)) {
                this.f86531R0 = true;
            } else {
                this.f86532S0 = true;
            }
            this.f86536W0.getDrawable().setTint(Color.parseColor(this.f86554f1.mo105621o()));
            str = "Selected";
        } else {
            this.f86531R0 = false;
            this.f86532S0 = false;
            C35263h hVar = this.f86554f1;
            if (hVar == null || C35020d.m143605J(hVar.mo105620n())) {
                str = "";
            } else {
                this.f86536W0.getDrawable().setTint(Color.parseColor(this.f86554f1.mo105620n()));
                str = "Unselected";
            }
        }
        ImageView imageView = this.f86536W0;
        imageView.setContentDescription(str + "Filter");
        if (OTVendorListMode.IAB.equalsIgnoreCase(this.f86550d1)) {
            this.f86544a1.mo105146B(map);
            map2 = this.f86534U0;
        } else {
            this.f86548c1.mo105101z(map);
            map2 = this.f86535V0;
        }
        mo105491j1(map2);
    }

    /* renamed from: c1 */
    public void mo105487c1(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f86560y = oTPublishersHeadlessSDK;
    }

    /* renamed from: d1 */
    public void mo105488d1(C35127a aVar) {
        this.f86561z = aVar;
    }

    /* renamed from: g1 */
    public final void mo105489g1(String str, boolean z) {
        if (OTVendorListMode.IAB.equalsIgnoreCase(this.f86550d1)) {
            this.f86544a1.mo105150G(z);
            this.f86544a1.getFilter().filter(str);
        }
        if (OTVendorListMode.GOOGLE.equalsIgnoreCase(this.f86550d1)) {
            this.f86546b1.mo105110D(z);
            this.f86546b1.getFilter().filter(str);
        }
        if (OTVendorListMode.GENERAL.equalsIgnoreCase(this.f86550d1)) {
            this.f86548c1.mo105089H(z);
            this.f86548c1.getFilter().filter(str);
        }
    }

    /* renamed from: i1 */
    public final void mo105490i1(String str) {
        this.f86559x.setBackgroundColor(Color.parseColor(str));
        this.f86543a.setBackgroundColor(Color.parseColor(str));
        this.f86545b.setBackgroundColor(Color.parseColor(str));
        this.f86547c.setBackgroundColor(Color.parseColor(str));
    }

    /* renamed from: j1 */
    public final void mo105491j1(Map<String, String> map) {
        C35213h0 P0 = C35213h0.m145163P0(OTFragmentTags.OT_VENDOR_LIST_FILTER_FRAGMENT_TAG, map, this.f86526M0, this.f86550d1);
        this.f86541Z = P0;
        P0.mo105372V0(this.f86560y);
    }

    /* renamed from: k1 */
    public final void mo105492k1() {
        String str;
        String str2;
        SwitchCompat switchCompat;
        Context context;
        UIUtils uIUtils;
        this.f86519F0 = this.f86554f1.mo105628v();
        this.f86520G0 = this.f86554f1.mo105627u();
        this.f86521H0 = this.f86554f1.mo105626t();
        mo105484b();
        mo105490i1(new C35256b(this.f86552e1).mo105526b("", this.f86554f1.mo105623q(), "#FFFFFF", "#2F2F2F"));
        if (this.f86537X.isChecked()) {
            uIUtils = this.f86527N0;
            context = this.f86557v;
            switchCompat = this.f86537X;
            str2 = this.f86519F0;
            str = this.f86520G0;
        } else {
            uIUtils = this.f86527N0;
            context = this.f86557v;
            switchCompat = this.f86537X;
            str2 = this.f86519F0;
            str = this.f86521H0;
        }
        uIUtils.mo104280s(context, switchCompat, str2, str);
        mo105481Z0(this.f86545b, this.f86554f1.mo105610c(), this.f86526M0);
        mo105479W0(this.f86558w, this.f86554f1.mo105617k(), this.f86526M0);
        this.f86551e.setColorFilter(Color.parseColor(this.f86554f1.mo105616j()), PorterDuff.Mode.SRC_IN);
        this.f86523J0.setBackgroundColor(Color.parseColor(this.f86554f1.mo105619m()));
        mo105480Y0(this.f86525L0, this.f86524K0, this.f86553f, this.f86555g, this.f86554f1.mo105625s());
    }

    /* renamed from: l1 */
    public final void mo105493l1() {
        mo105489g1("", false);
    }

    @C0376v0(api = 21)
    /* renamed from: m1 */
    public final void mo105494m1() {
        Context context = this.f86557v;
        OTPublishersHeadlessSDK oTPublishersHeadlessSDK = this.f86560y;
        C34962a aVar = this.f86539Y;
        C19232h activity = getActivity();
        Objects.requireNonNull(activity);
        this.f86544a1 = new C35157k0(this, context, oTPublishersHeadlessSDK, aVar, activity.mo57175g0(), this.f86531R0, this.f86534U0, this.f86518E0, this.f86554f1, this.f86526M0);
        if (this.f86556g1.mo103992c()) {
            this.f86546b1 = new C35139e(this, this.f86557v, this.f86560y, this.f86539Y, this.f86531R0, this.f86534U0, this.f86518E0, this.f86554f1, this.f86526M0);
        }
        if (this.f86556g1.f85172b.mo103962g()) {
            this.f86542Z0.setText(new C34983o(this.f86557v).mo103835j().mo103837l());
            if (!this.f86556g1.mo103987V().equalsIgnoreCase("IAB2")) {
                this.f86550d1 = OTVendorListMode.GENERAL;
            }
            this.f86548c1 = new C35132c(this, this.f86557v, this.f86560y, this.f86518E0, this.f86554f1, this.f86526M0, this.f86539Y, this.f86532S0, this.f86535V0);
        }
        if (OTVendorListMode.GENERAL.equalsIgnoreCase(this.f86550d1)) {
            mo105499r1();
        } else if (OTVendorListMode.GOOGLE.equalsIgnoreCase(this.f86550d1)) {
            mo105500s1();
        } else {
            mo105501t1();
        }
    }

    /* renamed from: n1 */
    public final void mo105495n1() {
        this.f86551e.setOnClickListener(this);
        this.f86558w.setOnClickListener(this);
        this.f86537X.setOnClickListener(this);
        this.f86537X.setChecked(true);
        this.f86536W0.setOnClickListener(this);
        this.f86538X0.setOnClickListener(this);
        this.f86540Y0.setOnClickListener(this);
        this.f86542Z0.setOnClickListener(this);
        this.f86537X.setOnCheckedChangeListener(new C35245v0(this));
        this.f86537X.setContentDescription(this.f86554f1.mo105618l());
        mo105496o1();
    }

    /* renamed from: o1 */
    public final void mo105496o1() {
        this.f86533T0.setQueryHint("Search..");
        this.f86533T0.setIconifiedByDefault(false);
        this.f86533T0.mo1757a();
        this.f86533T0.clearFocus();
        this.f86533T0.setOnQueryTextListener(new C35250a());
        this.f86533T0.setOnCloseListener(new C35241t0(this));
    }

    @C0376v0(api = 21)
    public void onClick(View view) {
        int i;
        int id = view.getId();
        if (id == C35265a.C35273h.back_from_vendorlist) {
            this.f86527N0.mo104267E(new C34963b(13), this.f86539Y);
            i = 3;
        } else if (id == C35265a.C35273h.vendors_confirm_choices_btn) {
            this.f86560y.saveConsent(OTConsentInteractionType.VENDOR_LIST_CONFIRM);
            this.f86527N0.mo104267E(new C34963b(14), this.f86539Y);
            C34963b bVar = new C34963b(17);
            bVar.mo103583e(OTConsentInteractionType.VENDOR_LIST_CONFIRM);
            this.f86527N0.mo104267E(bVar, this.f86539Y);
            i = 1;
        } else if (id == C35265a.C35273h.all_consent_toggle) {
            mo105482a();
            return;
        } else if (id == C35265a.C35273h.filter_vendors) {
            mo105491j1(OTVendorListMode.GENERAL.equalsIgnoreCase(this.f86550d1) ? this.f86535V0 : this.f86534U0);
            if (!this.f86541Z.isAdded()) {
                this.f86541Z.mo105373W0(this);
                this.f86541Z.mo105379d(this.f86550d1);
                C35213h0 h0Var = this.f86541Z;
                C19232h activity = getActivity();
                Objects.requireNonNull(activity);
                h0Var.show(activity.mo57175g0(), OTFragmentTags.OT_VENDOR_LIST_FILTER_FRAGMENT_TAG);
                return;
            }
            return;
        } else if (id == C35265a.C35273h.button_iab_vendors) {
            mo105501t1();
            return;
        } else if (id == C35265a.C35273h.button_google_vendors) {
            mo105500s1();
            return;
        } else if (id == C35265a.C35273h.button_general_vendors) {
            mo105499r1();
            return;
        } else {
            return;
        }
        mo105485b(i);
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f86527N0.mo104281t(this.f86557v, this.f86549d);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Context applicationContext = getContext().getApplicationContext();
        if (this.f86560y == null) {
            this.f86560y = new OTPublishersHeadlessSDK(applicationContext);
        }
        this.f86527N0 = new UIUtils();
        if (getArguments() != null) {
            this.f86531R0 = getArguments().getBoolean("IS_FILTERED_VENDOR_LIST");
            this.f86550d1 = OTVendorListMode.IAB;
            this.f86532S0 = false;
            if (getArguments().containsKey("generalVendors") && getArguments().getBoolean("generalVendors")) {
                this.f86531R0 = false;
                this.f86532S0 = true;
                this.f86550d1 = OTVendorListMode.GENERAL;
            }
            if (this.f86531R0) {
                Map<String, String> S0 = mo105476S0(getArguments().getString("PURPOSE_MAP"));
                this.f86534U0 = S0;
                mo105491j1(S0);
            }
            if (this.f86532S0) {
                Map<String, String> S02 = mo105476S0(getArguments().getString("PURPOSE_MAP"));
                this.f86535V0 = S02;
                mo105491j1(S02);
            }
        }
    }

    @C0359n0
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35243u0(this));
        return onCreateDialog;
    }

    @C0376v0(api = 21)
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        this.f86557v = context;
        this.f86556g1 = new C35015e(context);
        this.f86518E0 = this.f86560y.getOtVendorUtils();
        View e = new UIUtils().mo104271e(this.f86557v, layoutInflater, viewGroup, C35265a.C35276k.fragment_ot_vendors_list);
        this.f86530Q0 = false;
        int b = UIUtils.m143749b(this.f86557v, this.f86526M0);
        this.f86552e1 = b;
        C35263h hVar = new C35263h();
        this.f86554f1 = hVar;
        hVar.mo105615i(this.f86560y, this.f86557v, b);
        OTLogger.m143447b("VendorsList", "themeMode = " + this.f86552e1);
        mo105477U0(e);
        mo105495n1();
        mo105498q1();
        mo105492k1();
        mo105494m1();
        return e;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f86539Y = null;
        this.f86518E0.setSelectAllButtonListener((OTVendorUtils.ItemListener) null);
        this.f86529P0.setAdapter((RecyclerView.Adapter) null);
    }

    public void onItemClick(@C0359n0 String str, boolean z) {
        if (str.equalsIgnoreCase(this.f86550d1)) {
            this.f86537X.setChecked(z);
        }
    }

    @C0376v0(api = 21)
    /* renamed from: q1 */
    public final void mo105498q1() {
        try {
            JSONObject preferenceCenterData = this.f86560y.getPreferenceCenterData();
            this.f86522I0 = preferenceCenterData;
            if (preferenceCenterData != null) {
                mo105502u1();
                this.f86538X0.setText(this.f86554f1.mo105614g(this.f86522I0));
                this.f86540Y0.setText(this.f86554f1.mo105622p());
                mo105494m1();
            }
        } catch (Exception e) {
            OTLogger.m143457l("VendorsList", "error while populating  PC fields" + e.getMessage());
        }
    }

    @C0376v0(api = 21)
    /* renamed from: r1 */
    public final void mo105499r1() {
        String str;
        Drawable drawable;
        this.f86550d1 = OTVendorListMode.GENERAL;
        int i = 0;
        this.f86536W0.setVisibility(0);
        this.f86533T0.setVisibility(0);
        mo105478V0(this.f86542Z0, this.f86538X0, this.f86540Y0);
        this.f86548c1.mo105097t(this.f86518E0);
        this.f86548c1.getFilter().filter(this.f86533T0.getQuery());
        this.f86529P0.setAdapter(this.f86548c1);
        if (!this.f86556g1.f85172b.mo103963h()) {
            i = 8;
        }
        this.f86537X.setVisibility(i);
        this.f86545b.setVisibility(i);
        this.f86523J0.setVisibility(i);
        if (this.f86535V0.size() > 0) {
            drawable = this.f86536W0.getDrawable();
            str = this.f86554f1.mo105621o();
        } else {
            drawable = this.f86536W0.getDrawable();
            str = this.f86554f1.mo105620n();
        }
        drawable.setTint(Color.parseColor(str));
    }

    /* renamed from: s1 */
    public final void mo105500s1() {
        this.f86550d1 = OTVendorListMode.GOOGLE;
        this.f86536W0.setVisibility(8);
        this.f86533T0.setVisibility(0);
        this.f86537X.setVisibility(0);
        this.f86545b.setVisibility(0);
        this.f86523J0.setVisibility(0);
        mo105478V0(this.f86540Y0, this.f86538X0, this.f86542Z0);
        this.f86546b1.mo105119r(this.f86518E0);
        this.f86546b1.getFilter().filter(this.f86533T0.getQuery());
        this.f86529P0.setAdapter(this.f86546b1);
    }

    @C0376v0(api = 21)
    /* renamed from: t1 */
    public final void mo105501t1() {
        String str;
        Drawable drawable;
        this.f86550d1 = OTVendorListMode.IAB;
        this.f86536W0.setVisibility(0);
        this.f86533T0.setVisibility(0);
        this.f86537X.setVisibility(0);
        this.f86545b.setVisibility(0);
        this.f86523J0.setVisibility(0);
        mo105478V0(this.f86538X0, this.f86540Y0, this.f86542Z0);
        this.f86544a1.mo105159t(this.f86518E0);
        this.f86529P0.setAdapter(this.f86544a1);
        this.f86544a1.getFilter().filter(this.f86533T0.getQuery());
        if (this.f86534U0.size() > 0) {
            drawable = this.f86536W0.getDrawable();
            str = this.f86554f1.mo105621o();
        } else {
            drawable = this.f86536W0.getDrawable();
            str = this.f86554f1.mo105620n();
        }
        drawable.setTint(Color.parseColor(str));
    }

    /* renamed from: u1 */
    public final void mo105502u1() {
        if ("IAB2".equalsIgnoreCase(this.f86556g1.mo103987V())) {
            boolean c = this.f86556g1.mo103992c();
            boolean g = this.f86556g1.f85172b.mo103962g();
            int i = 8;
            int i2 = (c || g) ? 0 : 8;
            int i3 = c ? 0 : 8;
            if (g) {
                i = 0;
            }
            this.f86528O0.setVisibility(i2);
            this.f86542Z0.setVisibility(i);
            this.f86540Y0.setVisibility(i3);
        }
    }

    /* renamed from: b */
    public final void mo105484b() {
        C35121u w = this.f86554f1.mo105629w();
        this.f86543a.setTextColor(Color.parseColor(w.mo104966a().mo104667k()));
        if (w.mo104966a().mo104657a().mo104757f() != null && !C35020d.m143605J(w.mo104966a().mo104657a().mo104757f())) {
            this.f86543a.setTextSize(Float.parseFloat(w.mo104966a().mo104657a().mo104757f()));
        }
        new UIUtils().mo104264A(this.f86543a, w.mo104966a().mo104657a(), this.f86526M0);
        this.f86543a.setText(w.mo104966a().mo104663g());
    }
}
