package com.urbanairship.permission;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.activity.result.C0302g;
import androidx.activity.result.contract.C0268b;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.C0475e;
import androidx.core.app.C17018b;
import androidx.core.content.C17318d;
import androidx.core.util.C17970d;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class PermissionsActivity extends C0475e {
    @C0359n0

    /* renamed from: Y0 */
    public static final String f25745Y0 = "PERMISSION_EXTRA";
    @C0359n0

    /* renamed from: Z0 */
    public static final String f25746Z0 = "RESULT_RECEIVER_EXTRA";
    @C0359n0

    /* renamed from: a1 */
    public static final String f25747a1 = "PERMISSION_STATUS";
    @C0359n0

    /* renamed from: b1 */
    public static final String f25748b1 = "SILENTLY_DENIED";

    /* renamed from: c1 */
    public static final long f25749c1 = 2000;

    /* renamed from: d1 */
    public static boolean f25750d1 = false;

    /* renamed from: U0 */
    public List<Intent> f25751U0 = new ArrayList();

    /* renamed from: V0 */
    public C9423a f25752V0;

    /* renamed from: W0 */
    public boolean f25753W0 = false;

    /* renamed from: X0 */
    public final C0302g<String> f25754X0 = registerForActivityResult(new C0268b.C0289l(), new C9427d(this));

    /* renamed from: com.urbanairship.permission.PermissionsActivity$a */
    public static class C9423a {

        /* renamed from: a */
        public final String f25756a;

        /* renamed from: b */
        public final boolean f25757b;

        /* renamed from: c */
        public final long f25758c;

        /* renamed from: d */
        public final ResultReceiver f25759d;

        public C9423a(String str, boolean z, long j, ResultReceiver resultReceiver) {
            this.f25756a = str;
            this.f25757b = z;
            this.f25758c = j;
            this.f25759d = resultReceiver;
        }
    }

    @C0353k0
    /* renamed from: Z0 */
    public static void m35427Z0(@C0359n0 Context context, @C0359n0 String str, @C0359n0 final C17970d<C9426c> dVar) {
        Context applicationContext = context.getApplicationContext();
        Handler handler = new Handler(Looper.getMainLooper());
        if (C17318d.m79718a(applicationContext, str) == 0) {
            handler.post(new C9428e(dVar));
            return;
        }
        applicationContext.startActivity(new Intent(applicationContext, PermissionsActivity.class).setFlags(805306368).setPackage(UAirship.m146180A()).putExtra(f25745Y0, str).putExtra(f25746Z0, new ResultReceiver(handler) {
            public void onReceiveResult(int i, Bundle bundle) {
                PermissionsActivity.f25750d1 = false;
                if (i != -1) {
                    dVar.accept(C9426c.m35434a(false));
                } else if (PermissionStatus.valueOf(bundle.getString(PermissionsActivity.f25747a1)) == PermissionStatus.GRANTED) {
                    dVar.accept(C9426c.m35435c());
                } else {
                    dVar.accept(C9426c.m35434a(bundle.getBoolean(PermissionsActivity.f25748b1, false)));
                }
            }
        }));
    }

    /* renamed from: V0 */
    public final void mo19119V0(@C0363p0 Intent intent) {
        if (intent != null) {
            this.f25751U0.add(intent);
        }
    }

    /* renamed from: X0 */
    public final void mo19120X0(Boolean bool) {
        C9423a aVar = this.f25752V0;
        if (aVar != null) {
            this.f25752V0 = null;
            boolean P = C17018b.m78749P(this, aVar.f25756a);
            long currentTimeMillis = System.currentTimeMillis() - aVar.f25758c;
            C36059m.m148419o("Received permission result: permission %s, shouldShowRequestPermissionRationale before: %s, shouldShowRequestPermissionRationale after: %s, granted: %s, time: %s", aVar.f25756a, Boolean.valueOf(aVar.f25757b), Boolean.valueOf(P), bool, Long.valueOf(currentTimeMillis));
            Bundle bundle = new Bundle();
            if (bool.booleanValue()) {
                bundle.putString(f25747a1, PermissionStatus.GRANTED.name());
            } else {
                bundle.putString(f25747a1, PermissionStatus.DENIED.name());
                if (currentTimeMillis <= 2000 && !P && !aVar.f25757b) {
                    bundle.putBoolean(f25748b1, true);
                }
            }
            aVar.f25759d.send(-1, bundle);
            mo19121Y0();
        }
    }

    /* renamed from: Y0 */
    public final void mo19121Y0() {
        if (this.f25751U0.isEmpty() && this.f25752V0 == null) {
            finish();
        } else if (this.f25753W0 && this.f25752V0 == null) {
            Intent remove = this.f25751U0.remove(0);
            String stringExtra = remove.getStringExtra(f25745Y0);
            ResultReceiver resultReceiver = (ResultReceiver) remove.getParcelableExtra(f25746Z0);
            if (stringExtra == null || resultReceiver == null) {
                mo19121Y0();
                return;
            }
            this.f25752V0 = new C9423a(stringExtra, C17018b.m78749P(this, stringExtra), System.currentTimeMillis(), resultReceiver);
            C36059m.m148419o("Requesting permission %s", stringExtra);
            this.f25754X0.mo960b(stringExtra);
        }
    }

    public final void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        Autopilot.m146140c(getApplication());
        if (bundle == null) {
            mo19119V0(getIntent());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C9423a aVar = this.f25752V0;
        if (aVar != null) {
            aVar.f25759d.send(0, new Bundle());
            this.f25752V0 = null;
        }
        for (Intent next : this.f25751U0) {
            C36059m.m148419o("Permission request cancelled", next);
            ResultReceiver resultReceiver = (ResultReceiver) next.getParcelableExtra(f25746Z0);
            if (resultReceiver != null) {
                resultReceiver.send(0, new Bundle());
            }
        }
        this.f25751U0.clear();
        this.f25754X0.mo822d();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f25751U0.add(intent);
    }

    public void onPause() {
        super.onPause();
        this.f25753W0 = false;
    }

    public void onResume() {
        super.onResume();
        this.f25753W0 = true;
        mo19121Y0();
    }
}
