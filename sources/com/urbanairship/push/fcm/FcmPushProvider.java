package com.urbanairship.push.fcm;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.C33033f;
import com.google.firebase.messaging.FirebaseMessaging;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.AirshipVersionInfo;
import com.urbanairship.C36049g;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.google.C9111c;
import com.urbanairship.push.PushProvider;
import com.urbanairship.util.C9669o0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FcmPushProvider implements PushProvider, AirshipVersionInfo {
    @C0359n0
    /* renamed from: f */
    public static FirebaseMessaging m35571f() throws IllegalStateException {
        AirshipConfigOptions f = UAirship.m146188Y().mo106220f();
        if (C9669o0.m36224e(f.f87125D)) {
            return FirebaseMessaging.m133682u();
        }
        return (FirebaseMessaging) C33033f.m133334q(f.f87125D).mo95720l(FirebaseMessaging.class);
    }

    @C0359n0
    public String getAirshipVersion() {
        return "16.9.2";
    }

    @C0359n0
    public String getDeliveryType() {
        return "fcm";
    }

    @C0359n0
    public String getPackageVersion() {
        return C36049g.f89066e;
    }

    public int getPlatform() {
        return 2;
    }

    @C0363p0
    public String getRegistrationToken(@C0359n0 Context context) throws PushProvider.RegistrationException {
        try {
            return (String) C31053n.m124519a(m35571f().mo95946x());
        } catch (Exception e) {
            throw new PushProvider.RegistrationException("FCM error " + e.getMessage(), true, e);
        }
    }

    public boolean isAvailable(@C0359n0 Context context) {
        try {
            if (C9111c.m34015d(context) == 0) {
                return true;
            }
            C36059m.m148413i("Google Play services is currently unavailable.", new Object[0]);
            return false;
        } catch (Exception e) {
            C36059m.m148411g(e, "Unable to register with FCM.", new Object[0]);
            return false;
        }
    }

    public boolean isSupported(@C0359n0 Context context) {
        return C9111c.m34017f(context);
    }

    @C0359n0
    public String toString() {
        return "FCM Push Provider " + getAirshipVersion();
    }
}
