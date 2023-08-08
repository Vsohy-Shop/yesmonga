package com.urbanairship.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.C36098y;
import com.urbanairship.UAirship;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NotificationProxyActivity extends Activity {

    /* renamed from: com.urbanairship.push.NotificationProxyActivity$a */
    public class C9443a implements C36098y<Boolean> {
        public C9443a() {
        }

        /* renamed from: a */
        public void onResult(@C0363p0 Boolean bool) {
            C36059m.m148419o("Finished processing notification intent with result %s.", bool);
        }
    }

    public final void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        Autopilot.m146142e(this);
        if (UAirship.m146184O() || UAirship.m146182M()) {
            Intent intent = getIntent();
            if (intent == null || intent.getAction() == null) {
                finish();
                return;
            }
            C36059m.m148419o("Received intent: %s", intent.getAction());
            new C9462f(this, intent).mo19247e().mo107826e(new C9443a());
            finish();
            return;
        }
        C36059m.m148409e("NotificationProxyActivity - unable to receive intent, takeOff not called.", new Object[0]);
        finish();
    }
}
