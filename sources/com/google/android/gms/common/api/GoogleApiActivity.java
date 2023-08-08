package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.cloudmessaging.C40434a;
import com.google.android.gms.common.C40713g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C40564i;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.urbanairship.iam.events.C9175a;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    @C40974d0

    /* renamed from: a */
    public int f103179a = 0;

    @C0359n0
    /* renamed from: a */
    public static Intent m164700a(@C0359n0 Context context, @C0359n0 PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra(C40434a.C40436b.f103054a, pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* renamed from: b */
    public final void mo133633b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get(C40434a.C40436b.f103054a);
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            finish();
        } else if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                this.f103179a = 1;
            } catch (ActivityNotFoundException unused) {
                if (extras.getBoolean("notify_manager", true)) {
                    C40564i.m165102z(this).mo133946M(new ConnectionResult(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (Build.FINGERPRINT.contains("generic")) {
                        str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                this.f103179a = 1;
                finish();
            } catch (IntentSender.SendIntentException unused2) {
                finish();
            }
        } else {
            C40713g.m165640x().mo134193B(this, ((Integer) C40843u.m166202l(num)).intValue(), 2, this);
            this.f103179a = 1;
        }
    }

    public final void onActivityResult(int i, int i2, @C0359n0 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f103179a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C40564i z = C40564i.m165102z(this);
                if (i2 == -1) {
                    z.mo133947b();
                } else if (i2 == 0) {
                    z.mo133946M(new ConnectionResult(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f103179a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCancel(@C0359n0 DialogInterface dialogInterface) {
        this.f103179a = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f103179a = bundle.getInt(C9175a.f24920M);
        }
        if (this.f103179a != 1) {
            mo133633b();
        }
    }

    public final void onSaveInstanceState(@C0359n0 Bundle bundle) {
        bundle.putInt(C9175a.f24920M, this.f103179a);
        super.onSaveInstanceState(bundle);
    }
}
