package com.urbanairship.actions;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.C36080x;
import com.urbanairship.UAirship;
import com.urbanairship.activity.C35516b;
import com.urbanairship.util.C9646e;

public class RateAppActivity extends C35516b {

    /* renamed from: T0 */
    public AlertDialog f87469T0;

    /* renamed from: com.urbanairship.actions.RateAppActivity$a */
    public class C35480a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ Context f87470a;

        public C35480a(Context context) {
            this.f87470a = context;
        }

        public void onClick(@C0359n0 DialogInterface dialogInterface, int i) {
            try {
                UAirship Y = UAirship.m146188Y();
                RateAppActivity.this.startActivity(C9646e.m36140a(this.f87470a, Y.mo106201C(), Y.mo106220f()));
            } catch (ActivityNotFoundException e) {
                C36059m.m148411g(e, "No web browser available to handle request to open the store link.", new Object[0]);
            }
            dialogInterface.cancel();
            RateAppActivity.this.finish();
        }
    }

    /* renamed from: com.urbanairship.actions.RateAppActivity$b */
    public class C35481b implements DialogInterface.OnClickListener {
        public C35481b() {
        }

        public void onClick(@C0359n0 DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
            RateAppActivity.this.finish();
        }
    }

    /* renamed from: com.urbanairship.actions.RateAppActivity$c */
    public class C35482c implements DialogInterface.OnCancelListener {
        public C35482c() {
        }

        public void onCancel(@C0359n0 DialogInterface dialogInterface) {
            dialogInterface.cancel();
            RateAppActivity.this.finish();
        }
    }

    /* renamed from: D0 */
    public final void mo106327D0() {
        AlertDialog alertDialog = this.f87469T0;
        if (alertDialog == null || !alertDialog.isShowing()) {
            Intent intent = getIntent();
            if (intent == null) {
                C36059m.m148409e("RateAppActivity - Started activity with null intent.", new Object[0]);
                finish();
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            if (intent.getStringExtra("title") != null) {
                builder.setTitle(intent.getStringExtra("title"));
            } else {
                builder.setTitle(getString(C36080x.C36094n.ua_rate_app_action_default_title, new Object[]{mo106328E0()}));
            }
            if (intent.getStringExtra("body") != null) {
                builder.setMessage(intent.getStringExtra("body"));
            } else {
                String string = getString(C36080x.C36094n.ua_rate_app_action_default_rate_positive_button);
                builder.setMessage(getString(C36080x.C36094n.ua_rate_app_action_default_body, new Object[]{string}));
            }
            builder.setPositiveButton(getString(C36080x.C36094n.ua_rate_app_action_default_rate_positive_button), new C35480a(this));
            builder.setNegativeButton(getString(C36080x.C36094n.ua_rate_app_action_default_rate_negative_button), new C35481b());
            builder.setOnCancelListener(new C35482c());
            AlertDialog create = builder.create();
            this.f87469T0 = create;
            create.setCancelable(true);
            this.f87469T0.show();
        }
    }

    @C0359n0
    /* renamed from: E0 */
    public final String mo106328E0() {
        String packageName = UAirship.m146200l().getPackageName();
        PackageManager packageManager = UAirship.m146200l().getPackageManager();
        try {
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: F0 */
    public final void mo106329F0(@C0363p0 Uri uri, @C0363p0 Bundle bundle) {
        C36059m.m148406b("Relaunching activity", new Object[0]);
        finish();
        Intent flags = new Intent().setClass(this, getClass()).setData(uri).setFlags(268435456);
        if (bundle != null) {
            flags.putExtras(bundle);
        }
        startActivity(flags);
    }

    public void onCloseButtonClick(@C0359n0 View view) {
        finish();
    }

    @SuppressLint({"NewApi"})
    public final void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        Autopilot.m146140c(getApplication());
        if (!UAirship.m146184O() && !UAirship.m146182M()) {
            C36059m.m148409e("RateAppActivity - unable to create activity, takeOff not called.", new Object[0]);
            finish();
        }
    }

    public void onNewIntent(@C0359n0 Intent intent) {
        super.onNewIntent(intent);
        C36059m.m148406b("New intent received for rate app activity", new Object[0]);
        mo106329F0(intent.getData(), intent.getExtras());
    }

    @SuppressLint({"NewApi"})
    public void onPause() {
        super.onPause();
    }

    @SuppressLint({"NewApi"})
    public void onResume() {
        super.onResume();
        mo106327D0();
    }
}
