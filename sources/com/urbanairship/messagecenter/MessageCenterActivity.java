package com.urbanairship.messagecenter;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.activity.C35516b;

public class MessageCenterActivity extends C35516b {

    /* renamed from: T0 */
    public MessageCenterFragment f25488T0;

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        Autopilot.m146140c(getApplication());
        if (UAirship.m146184O() || UAirship.m146182M()) {
            mo106409C0(true);
            if (bundle != null) {
                this.f25488T0 = (MessageCenterFragment) mo57175g0().mo56903s0("MESSAGE_CENTER_FRAGMENT");
            }
            if (this.f25488T0 == null) {
                this.f25488T0 = MessageCenterFragment.m35107M0(C9372h.m35253E(getIntent()));
                mo57175g0().mo56909u().mo57217g(16908290, this.f25488T0, "MESSAGE_CENTER_FRAGMENT").mo57054s();
            }
            this.f25488T0.mo18881O0(C9372h.m35254H().mo19000C());
            return;
        }
        C36059m.m148409e("MessageCenterActivity - unable to create activity, takeOff not called.", new Object[0]);
        finish();
    }

    public void onNewIntent(@C0359n0 Intent intent) {
        super.onNewIntent(intent);
        String E = C9372h.m35253E(intent);
        if (E != null) {
            this.f25488T0.mo18880N0(E);
        }
    }

    public boolean onOptionsItemSelected(@C0359n0 MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}
