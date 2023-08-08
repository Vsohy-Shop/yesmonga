package com.contentsquare.android.internal.features.clientmode.p024ui.tutorial;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0475e;
import com.contentsquare.android.C14147n;
import com.contentsquare.android.sdk.C14312ef;
import com.contentsquare.android.sdk.C14399h9;
import com.contentsquare.android.sdk.C14413i3;
import com.contentsquare.android.sdk.C14563o1;
import com.contentsquare.android.sdk.C14807vf;

/* renamed from: com.contentsquare.android.internal.features.clientmode.ui.tutorial.ClientModeTutorialActivity */
public class ClientModeTutorialActivity extends C0475e {

    /* renamed from: U0 */
    public C14563o1 f34965U0;

    /* renamed from: V0 */
    public C14807vf f34966V0;

    /* renamed from: W0 */
    public C14399h9 f34967W0;

    /* renamed from: U0 */
    public static void m60704U0(Context context) {
        Intent intent = new Intent(context, ClientModeTutorialActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ void m60705V0(View view) {
        mo34411W0();
    }

    /* renamed from: W0 */
    public final void mo34411W0() {
        C14807vf vfVar = this.f34966V0;
        if (vfVar != null) {
            vfVar.mo36653c(Boolean.FALSE);
            if (this.f34965U0.mo36020g()) {
                C14807vf vfVar2 = this.f34966V0;
                Boolean bool = Boolean.TRUE;
                vfVar2.mo36651a(bool);
                this.f34966V0.mo36652b(bool);
                finish();
                return;
            }
            startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), 2084);
        }
    }

    /* renamed from: a */
    public final void mo34412a() {
        this.f34965U0.mo36014a();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.f34967W0.mo35501a(getApplicationContext())) {
            C14413i3.m62076e(this, Integer.valueOf(C14147n.C14155h.contentsquare_draw_over_app_permission_msg));
            mo34412a();
            finish();
            return;
        }
        mo34411W0();
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo34411W0();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34967W0 = new C14399h9();
        this.f34965U0 = C14312ef.m61521b(getApplication()).mo35094e();
        this.f34966V0 = new C14807vf((Context) getApplication());
        setContentView(C14147n.C14154g.contentsquare_activity_client_mode_tutorial);
        findViewById(C14147n.C14153f.ok_button).setOnClickListener(new C14135a(this));
    }
}
