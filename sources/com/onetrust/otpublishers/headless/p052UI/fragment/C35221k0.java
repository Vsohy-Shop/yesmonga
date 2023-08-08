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
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.C31178a;
import com.google.android.material.bottomsheet.C31185b;
import com.onetrust.otpublishers.headless.C35265a;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Public.DataModel.OTConfiguration;
import com.onetrust.otpublishers.headless.Public.Keys.OTFragmentTags;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import com.onetrust.otpublishers.headless.p052UI.Helper.UIUtils;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35102b0;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35110j;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35122v;
import com.onetrust.otpublishers.headless.p052UI.adapter.C35179v;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35257c;
import com.onetrust.otpublishers.headless.p052UI.mobiledatautils.C35262g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.onetrust.otpublishers.headless.UI.fragment.k0 */
public class C35221k0 extends C31185b implements View.OnClickListener {

    /* renamed from: E0 */
    public int f86408E0 = 22;

    /* renamed from: X */
    public View f86409X;

    /* renamed from: Y */
    public OTConfiguration f86410Y;

    /* renamed from: Z */
    public C35257c f86411Z;

    /* renamed from: a */
    public TextView f86412a;

    /* renamed from: b */
    public RecyclerView f86413b;

    /* renamed from: c */
    public Button f86414c;

    /* renamed from: d */
    public C31178a f86415d;

    /* renamed from: e */
    public C35179v f86416e;

    /* renamed from: f */
    public RelativeLayout f86417f;

    /* renamed from: g */
    public Context f86418g;

    /* renamed from: v */
    public RelativeLayout f86419v;

    /* renamed from: w */
    public OTPublishersHeadlessSDK f86420w;

    /* renamed from: x */
    public C35222a f86421x;

    /* renamed from: y */
    public List<String> f86422y = new ArrayList();

    /* renamed from: z */
    public C35122v f86423z;

    /* renamed from: com.onetrust.otpublishers.headless.UI.fragment.k0$a */
    public interface C35222a {
        /* renamed from: v0 */
        void mo105265v0(@C0359n0 List<String> list, boolean z);
    }

    @C0359n0
    /* renamed from: P0 */
    public static C35221k0 m145218P0(@C0359n0 String str, @C0359n0 List<String> list, @C0363p0 OTConfiguration oTConfiguration) {
        C35221k0 k0Var = new C35221k0();
        Bundle bundle = new Bundle();
        bundle.putString(OTFragmentTags.FRAGMENT_TAG, str);
        k0Var.setArguments(bundle);
        k0Var.mo105417X0(list);
        k0Var.mo105414U0(oTConfiguration);
        return k0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public /* synthetic */ void m145219Q0(DialogInterface dialogInterface) {
        C31178a aVar = (C31178a) dialogInterface;
        this.f86415d = aVar;
        this.f86411Z.mo105528b(this.f86418g, aVar);
        this.f86415d.setCancelable(false);
        this.f86415d.setCanceledOnTouchOutside(false);
        this.f86415d.setOnKeyListener(new C35219j0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public /* synthetic */ boolean m145220Y0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (!C35257c.m145353e(i, keyEvent)) {
            return false;
        }
        dismiss();
        return false;
    }

    /* renamed from: R0 */
    public final void mo105411R0(@C0359n0 View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C35265a.C35273h.filter_list);
        this.f86413b = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f86413b.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f86412a = (TextView) view.findViewById(C35265a.C35273h.ot_cancel_filter);
        this.f86419v = (RelativeLayout) view.findViewById(C35265a.C35273h.footer_layout);
        this.f86414c = (Button) view.findViewById(C35265a.C35273h.btn_apply_filter);
        this.f86417f = (RelativeLayout) view.findViewById(C35265a.C35273h.filter_layout);
        this.f86409X = view.findViewById(C35265a.C35273h.view1);
        this.f86414c.setOnClickListener(this);
        this.f86412a.setOnClickListener(this);
    }

    /* renamed from: S0 */
    public final void mo105412S0(@C0359n0 Button button, @C0359n0 C35105e eVar) {
        button.setText(eVar.mo104295s());
        C35110j o = eVar.mo104712o();
        new UIUtils().mo104283v(button, o, this.f86410Y);
        if (!C35020d.m143605J(o.mo104757f())) {
            button.setTextSize(Float.parseFloat(o.mo104757f()));
        }
        if (!C35020d.m143605J(eVar.mo104296u())) {
            button.setTextColor(Color.parseColor(eVar.mo104296u()));
        }
        UIUtils.m143755p(this.f86418g, button, eVar, eVar.mo104699a(), eVar.mo104702e());
    }

    /* renamed from: T0 */
    public final void mo105413T0(@C0359n0 TextView textView, @C0359n0 C35102b0 b0Var) {
        textView.setText(b0Var.mo104663g());
        C35110j a = b0Var.mo104657a();
        new UIUtils().mo104264A(textView, a, this.f86410Y);
        if (!C35020d.m143605J(a.mo104757f())) {
            textView.setTextSize(Float.parseFloat(a.mo104757f()));
        }
        if (!C35020d.m143605J(b0Var.mo104667k())) {
            textView.setTextColor(Color.parseColor(b0Var.mo104667k()));
        }
        if (!C35020d.m143605J(b0Var.mo104665i())) {
            UIUtils.m143758y(textView, Integer.parseInt(b0Var.mo104665i()));
        }
    }

    /* renamed from: U0 */
    public void mo105414U0(@C0363p0 OTConfiguration oTConfiguration) {
        this.f86410Y = oTConfiguration;
    }

    /* renamed from: V0 */
    public void mo105415V0(@C0359n0 OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f86420w = oTPublishersHeadlessSDK;
    }

    /* renamed from: W0 */
    public void mo105416W0(@C0359n0 C35222a aVar) {
        this.f86421x = aVar;
    }

    /* renamed from: X0 */
    public final void mo105417X0(@C0359n0 List<String> list) {
        this.f86422y = list;
    }

    /* renamed from: a */
    public void mo105418a() {
        dismiss();
    }

    /* renamed from: b */
    public final void mo105419b() {
        C35122v vVar = this.f86423z;
        if (vVar != null) {
            String i = vVar.mo104976i();
            this.f86417f.setBackgroundColor(Color.parseColor(i));
            this.f86419v.setBackgroundColor(Color.parseColor(i));
            mo105413T0(this.f86412a, this.f86423z.mo104982o());
            mo105412S0(this.f86414c, this.f86423z.mo104979l());
            String w = this.f86423z.mo104991w();
            if (!C35020d.m143605J(w)) {
                this.f86409X.setBackgroundColor(Color.parseColor(w));
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C35265a.C35273h.btn_apply_filter) {
            this.f86421x.mo105265v0(this.f86416e.mo105226m(), this.f86416e.mo105226m().isEmpty());
            mo105418a();
        } else if (id == C35265a.C35273h.ot_cancel_filter) {
            dismiss();
        }
    }

    public void onConfigurationChanged(@C0359n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f86411Z.mo105528b(this.f86418g, this.f86415d);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (this.f86420w == null) {
            dismiss();
        }
    }

    @C0359n0
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new C35216i0(this));
        return onCreateDialog;
    }

    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        this.f86418g = context;
        this.f86411Z = new C35257c();
        int b = UIUtils.m143749b(context, this.f86410Y);
        this.f86408E0 = b;
        C35262g gVar = new C35262g();
        gVar.mo105606c(this.f86418g, b, this.f86420w);
        this.f86423z = gVar.mo105607e();
        View e = new UIUtils().mo104271e(this.f86418g, layoutInflater, viewGroup, C35265a.C35276k.fragment_ot_sdk_list_filter);
        mo105411R0(e);
        C35179v vVar = new C35179v(gVar.mo105605b(gVar.mo105604a()), this.f86422y, this.f86410Y, gVar);
        this.f86416e = vVar;
        this.f86413b.setAdapter(vVar);
        mo105419b();
        return e;
    }
}
