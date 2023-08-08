package com.contentsquare.android.internal.features.clientmode.p024ui.deactivationdialog;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C0475e;
import com.contentsquare.android.C14147n;
import com.contentsquare.android.sdk.C14266d4;
import com.contentsquare.android.sdk.C14312ef;
import com.contentsquare.android.sdk.C14563o1;

/* renamed from: com.contentsquare.android.internal.features.clientmode.ui.deactivationdialog.DeactivationActivity */
public class DeactivationActivity extends C0475e {

    /* renamed from: U0 */
    public C14563o1 f34941U0;

    /* renamed from: V0 */
    public C14266d4 f34942V0;

    /* renamed from: com.contentsquare.android.internal.features.clientmode.ui.deactivationdialog.DeactivationActivity$a */
    public class C14126a implements View.OnClickListener {
        public C14126a() {
        }

        public void onClick(View view) {
            DeactivationActivity.this.f34942V0.mo34903a();
            DeactivationActivity.this.f34941U0.mo36014a();
            DeactivationActivity.this.finish();
        }
    }

    /* renamed from: com.contentsquare.android.internal.features.clientmode.ui.deactivationdialog.DeactivationActivity$b */
    public class C14127b implements View.OnClickListener {
        public C14127b() {
        }

        public void onClick(View view) {
            DeactivationActivity.this.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34942V0 = new C14266d4(getApplication());
        this.f34941U0 = C14312ef.m61521b(getApplication()).mo35094e();
        setContentView(C14147n.C14154g.contentsquare_client_mode_deactivation);
        findViewById(C14147n.C14153f.deactivation_window_disable_button).setOnClickListener(new C14126a());
        findViewById(C14147n.C14153f.deactivation_window_cancel_button).setOnClickListener(new C14127b());
        setFinishOnTouchOutside(false);
    }
}
