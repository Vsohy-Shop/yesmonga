package com.contentsquare.android.internal.features.clientmode.p024ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0302g;
import androidx.activity.result.contract.C0268b;
import androidx.appcompat.app.C0441a;
import androidx.appcompat.app.C0475e;
import androidx.appcompat.widget.Toolbar;
import com.contentsquare.android.C14147n;
import com.contentsquare.android.internal.features.clientmode.p024ui.developer.DeveloperActivationActivity;
import com.contentsquare.android.sdk.C14312ef;
import com.contentsquare.android.sdk.C14327f7;
import com.contentsquare.android.sdk.C14563o1;
import com.contentsquare.android.sdk.C14584o6;
import com.contentsquare.android.sdk.C14740t7;
import com.contentsquare.android.sdk.C14843x;

/* renamed from: com.contentsquare.android.internal.features.clientmode.ui.settings.SettingsActivity */
public class SettingsActivity extends C0475e {

    /* renamed from: U0 */
    public int f34956U0;

    /* renamed from: V0 */
    public C14584o6 f34957V0 = new C14584o6();

    /* renamed from: W0 */
    public C14563o1 f34958W0;

    /* renamed from: X0 */
    public C14843x f34959X0;

    /* renamed from: Y0 */
    public C14740t7 f34960Y0;

    /* renamed from: Z0 */
    public C0302g<Intent> f34961Z0 = registerForActivityResult(new C0268b.C0290m(), new C14134b(this));

    /* renamed from: com.contentsquare.android.internal.features.clientmode.ui.settings.SettingsActivity$a */
    public class C14132a implements View.OnClickListener {
        public C14132a() {
        }

        public void onClick(View view) {
            SettingsActivity settingsActivity = SettingsActivity.this;
            settingsActivity.f34956U0++;
            settingsActivity.mo34408a();
        }
    }

    /* renamed from: V0 */
    public static void m60696V0(Context context) {
        Intent intent = new Intent(context, SettingsActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ void m60697W0(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public /* synthetic */ void m60698X0(ActivityResult activityResult) {
        if (activityResult.mo855b() == -1) {
            recreate();
        }
    }

    /* renamed from: Y0 */
    public final void mo34406Y0(Toolbar toolbar) {
        C0441a B0 = mo1473B0();
        if (B0 != null) {
            B0.mo1268Y(true);
            B0.mo1272c0(true);
        }
        toolbar.setNavigationOnClickListener(new C14133a(this));
    }

    /* renamed from: Z0 */
    public final void mo34407Z0() {
        ((TextView) findViewById(C14147n.C14153f.footer_textview)).setText(getResources().getString(C14147n.C14155h.contentsquare_settings_sdk_version_title, new Object[]{"4.14.0"}));
        ((RelativeLayout) findViewById(C14147n.C14153f.settings_footer)).setOnClickListener(new C14132a());
    }

    /* renamed from: a */
    public final void mo34408a() {
        if (!this.f34960Y0.mo36497d().booleanValue() && this.f34956U0 == 10) {
            this.f34961Z0.mo960b(new Intent(this, DeveloperActivationActivity.class));
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.f34958W0.mo36017d();
        this.f34958W0.mo36018e();
    }

    public void onCreate(Bundle bundle) {
        this.f34959X0 = this.f34957V0.mo36043a(getApplicationContext());
        this.f34960Y0 = this.f34957V0.mo36044b(getApplication());
        this.f34958W0 = C14312ef.m61521b(getApplication()).mo35094e();
        super.onCreate(bundle);
        setContentView(C14147n.C14154g.contentsquare_settings_activity);
        Toolbar toolbar = (Toolbar) findViewById(C14147n.C14153f.settings_toolbar);
        mo1483K0(toolbar);
        if (bundle == null) {
            mo57175g0().mo56909u().mo57201C(C14147n.C14153f.container, new C14327f7()).mo57054s();
        }
        mo34406Y0(toolbar);
        mo34407Z0();
    }

    public void onResume() {
        super.onResume();
        this.f34956U0 = 0;
        this.f34958W0.mo36016c();
        if (!this.f34960Y0.mo36495b().booleanValue()) {
            finish();
        }
    }
}
