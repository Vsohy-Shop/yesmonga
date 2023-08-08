package com.urbanairship.messagecenter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.C19234h0;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.activity.C35516b;

public class MessageActivity extends C35516b {

    /* renamed from: V0 */
    public static final String f25484V0 = "MessageFragment";

    /* renamed from: T0 */
    public String f25485T0;

    /* renamed from: U0 */
    public final C9370f f25486U0 = new C9343a();

    /* renamed from: com.urbanairship.messagecenter.MessageActivity$a */
    public class C9343a implements C9370f {
        public C9343a() {
        }

        /* renamed from: a */
        public void mo18875a() {
            if (MessageActivity.this.f25485T0 != null) {
                MessageActivity messageActivity = MessageActivity.this;
                messageActivity.mo18873G0(messageActivity.f25485T0);
            }
        }
    }

    /* renamed from: F0 */
    public final void mo18872F0() {
        if (this.f25485T0 != null) {
            C9384n nVar = (C9384n) mo57175g0().mo56903s0(f25484V0);
            if (nVar == null || !this.f25485T0.equals(nVar.mo19046O0())) {
                C19234h0 u = mo57175g0().mo56909u();
                if (nVar != null) {
                    u.mo57038B(nVar);
                }
                u.mo57217g(16908290, C9384n.m35337Q0(this.f25485T0), f25484V0).mo57054s();
            }
            mo18873G0(this.f25485T0);
        }
    }

    /* renamed from: G0 */
    public final void mo18873G0(@C0363p0 String str) {
        C9371g l = C9372h.m35254H().mo18999B().mo18929l(str);
        if (l == null) {
            setTitle((CharSequence) null);
        } else {
            setTitle(l.mo18988j0());
        }
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        Autopilot.m146140c(getApplication());
        if (UAirship.m146184O() || UAirship.m146182M()) {
            mo106409C0(true);
            if (bundle == null) {
                this.f25485T0 = C9372h.m35253E(getIntent());
            } else {
                this.f25485T0 = bundle.getString("messageId");
            }
            if (this.f25485T0 == null) {
                finish();
            } else {
                mo18872F0();
            }
        } else {
            C36059m.m148409e("MessageActivity - unable to create activity, takeOff not called.", new Object[0]);
            finish();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String E = C9372h.m35253E(intent);
        if (E != null) {
            this.f25485T0 = E;
            mo18872F0();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("messageId", this.f25485T0);
    }

    public void onStart() {
        super.onStart();
        C9372h.m35254H().mo18999B().mo18920c(this.f25486U0);
    }

    public void onStop() {
        super.onStop();
        C9372h.m35254H().mo18999B().mo18916E(this.f25486U0);
    }
}
