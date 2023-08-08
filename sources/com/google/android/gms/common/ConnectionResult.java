package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.zxing.client.android.C34659k;
import com.urbanairship.iam.events.C9175a;

@SafeParcelable.C40812a(creator = "ConnectionResultCreator")
public final class ConnectionResult extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C40679b0();

    /* renamed from: E0 */
    public static final int f103115E0 = 10;

    /* renamed from: F0 */
    public static final int f103116F0 = 11;

    /* renamed from: G0 */
    public static final int f103117G0 = 13;

    /* renamed from: H0 */
    public static final int f103118H0 = 14;

    /* renamed from: I0 */
    public static final int f103119I0 = 15;

    /* renamed from: J0 */
    public static final int f103120J0 = 16;

    /* renamed from: K0 */
    public static final int f103121K0 = 17;

    /* renamed from: L0 */
    public static final int f103122L0 = 18;

    /* renamed from: M0 */
    public static final int f103123M0 = 19;

    /* renamed from: N0 */
    public static final int f103124N0 = 20;

    /* renamed from: O0 */
    public static final int f103125O0 = 22;

    /* renamed from: P0 */
    public static final int f103126P0 = 23;

    /* renamed from: Q0 */
    public static final int f103127Q0 = 24;
    @Deprecated

    /* renamed from: R0 */
    public static final int f103128R0 = 1500;
    @C40473a
    @C40858y
    @C0359n0

    /* renamed from: S0 */
    public static final ConnectionResult f103129S0 = new ConnectionResult(0);

    /* renamed from: X */
    public static final int f103130X = 7;

    /* renamed from: Y */
    public static final int f103131Y = 8;

    /* renamed from: Z */
    public static final int f103132Z = 9;
    @C40473a

    /* renamed from: e */
    public static final int f103133e = -1;

    /* renamed from: f */
    public static final int f103134f = 0;

    /* renamed from: g */
    public static final int f103135g = 1;

    /* renamed from: v */
    public static final int f103136v = 2;

    /* renamed from: w */
    public static final int f103137w = 3;

    /* renamed from: x */
    public static final int f103138x = 4;

    /* renamed from: y */
    public static final int f103139y = 5;

    /* renamed from: z */
    public static final int f103140z = 6;
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f103141a;
    @SafeParcelable.C40814c(getter = "getErrorCode", mo134489id = 2)

    /* renamed from: b */
    public final int f103142b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getResolution", mo134489id = 3)

    /* renamed from: c */
    public final PendingIntent f103143c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getErrorMessage", mo134489id = 4)

    /* renamed from: d */
    public final String f103144d;

    @SafeParcelable.C40813b
    public ConnectionResult(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) PendingIntent pendingIntent, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str) {
        this.f103141a = i;
        this.f103142b = i2;
        this.f103143c = pendingIntent;
        this.f103144d = str;
    }

    @C0359n0
    /* renamed from: n0 */
    public static String m164642n0(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return C34659k.C34660a.f83884o;
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i + ")";
                }
        }
    }

    /* renamed from: M */
    public int mo133591M() {
        return this.f103142b;
    }

    @C0363p0
    /* renamed from: Q */
    public String mo133592Q() {
        return this.f103144d;
    }

    @C0363p0
    /* renamed from: W */
    public PendingIntent mo133593W() {
        return this.f103143c;
    }

    /* renamed from: X */
    public boolean mo133594X() {
        return (this.f103142b == 0 || this.f103143c == null) ? false : true;
    }

    /* renamed from: e0 */
    public boolean mo133595e0() {
        return this.f103142b == 0;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.f103142b != connectionResult.f103142b || !C40808s.m166010b(this.f103143c, connectionResult.f103143c) || !C40808s.m166010b(this.f103144d, connectionResult.f103144d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public void mo133597f0(@C0359n0 Activity activity, int i) throws IntentSender.SendIntentException {
        if (mo133594X()) {
            PendingIntent pendingIntent = this.f103143c;
            C40843u.m166202l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    public int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f103142b), this.f103143c, this.f103144d);
    }

    @C0359n0
    public String toString() {
        C40808s.C40809a d = C40808s.m166012d(this);
        d.mo134475a("statusCode", m164642n0(this.f103142b));
        d.mo134475a(C9175a.f24920M, this.f103143c);
        d.mo134475a("message", this.f103144d);
        return d.toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103141a);
        C40820a.m166089F(parcel, 2, mo133591M());
        C40820a.m166102S(parcel, 3, mo133593W(), i, false);
        C40820a.m166108Y(parcel, 4, mo133592Q(), false);
        C40820a.m166112b(parcel, a);
    }

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i, @C0363p0 PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, @C0363p0 PendingIntent pendingIntent, @C0363p0 String str) {
        this(1, i, pendingIntent, str);
    }
}
