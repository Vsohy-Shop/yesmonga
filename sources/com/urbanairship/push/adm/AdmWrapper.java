package com.urbanairship.push.adm;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.amazon.device.messaging.ADM;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;

class AdmWrapper {
    @C0363p0
    public static String getRegistrationId(Context context) {
        return new ADM(context).getRegistrationId();
    }

    public static boolean isSupported() {
        try {
            return new ADM(UAirship.m146200l()).isSupported();
        } catch (RuntimeException unused) {
            C36059m.m148421q("Failed to call ADM. Make sure ADM jar is not bundled with the APK.", new Object[0]);
            return false;
        }
    }

    public static void startRegistration(@C0359n0 Context context) {
        new ADM(context).startRegister();
    }
}
