package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C40974d0;
import com.google.errorprone.annotations.C32488a;
import com.google.errorprone.annotations.C32489b;
import com.urbanairship.iam.events.C9175a;

@SafeParcelable.C40812a(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements C40669r, ReflectedParcelable {
    @C0359n0
    public static final Parcelable.Creator<Status> CREATOR = new C40502f0();
    @C40858y
    @C0359n0

    /* renamed from: X */
    public static final Status f103182X = new Status(17);
    @C40858y
    @C40473a
    @C0359n0
    @C40974d0

    /* renamed from: f */
    public static final Status f103183f = new Status(-1);
    @C40858y
    @C40473a
    @C0359n0
    @C40974d0

    /* renamed from: g */
    public static final Status f103184g = new Status(0);
    @C40473a
    @C40858y
    @C0359n0

    /* renamed from: v */
    public static final Status f103185v = new Status(14);
    @C40473a
    @C40858y
    @C0359n0

    /* renamed from: w */
    public static final Status f103186w = new Status(8);
    @C40473a
    @C40858y
    @C0359n0

    /* renamed from: x */
    public static final Status f103187x = new Status(15);
    @C40473a
    @C40858y
    @C0359n0

    /* renamed from: y */
    public static final Status f103188y = new Status(16);
    @C40473a
    @C0359n0

    /* renamed from: z */
    public static final Status f103189z = new Status(18);
    @SafeParcelable.C40819h(mo134498id = 1000)

    /* renamed from: a */
    public final int f103190a;
    @SafeParcelable.C40814c(getter = "getStatusCode", mo134489id = 1)

    /* renamed from: b */
    public final int f103191b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getStatusMessage", mo134489id = 2)

    /* renamed from: c */
    public final String f103192c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPendingIntent", mo134489id = 3)

    /* renamed from: d */
    public final PendingIntent f103193d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getConnectionResult", mo134489id = 4)

    /* renamed from: e */
    public final ConnectionResult f103194e;

    @SafeParcelable.C40813b
    public Status(@SafeParcelable.C40816e(mo134492id = 1000) int i, @SafeParcelable.C40816e(mo134492id = 1) int i2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) PendingIntent pendingIntent, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) ConnectionResult connectionResult) {
        this.f103190a = i;
        this.f103191b = i2;
        this.f103192c = str;
        this.f103193d = pendingIntent;
        this.f103194e = connectionResult;
    }

    @C0359n0
    /* renamed from: A0 */
    public final String mo133645A0() {
        String str = this.f103192c;
        return str != null ? str : C40501f.m164764a(this.f103191b);
    }

    @C0363p0
    /* renamed from: M */
    public ConnectionResult mo133646M() {
        return this.f103194e;
    }

    @C0363p0
    /* renamed from: Q */
    public PendingIntent mo133647Q() {
        return this.f103193d;
    }

    /* renamed from: W */
    public int mo133648W() {
        return this.f103191b;
    }

    @C0363p0
    /* renamed from: X */
    public String mo133649X() {
        return this.f103192c;
    }

    @C40974d0
    /* renamed from: e0 */
    public boolean mo133650e0() {
        return this.f103193d != null;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f103190a != status.f103190a || this.f103191b != status.f103191b || !C40808s.m166010b(this.f103192c, status.f103192c) || !C40808s.m166010b(this.f103193d, status.f103193d) || !C40808s.m166010b(this.f103194e, status.f103194e)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public boolean mo133652f0() {
        return this.f103191b == 16;
    }

    @C0359n0
    @C32488a
    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f103190a), Integer.valueOf(this.f103191b), this.f103192c, this.f103193d, this.f103194e);
    }

    /* renamed from: n0 */
    public boolean mo133654n0() {
        return this.f103191b == 14;
    }

    @C32489b
    /* renamed from: p0 */
    public boolean mo133655p0() {
        return this.f103191b <= 0;
    }

    /* renamed from: t0 */
    public void mo133656t0(@C0359n0 Activity activity, int i) throws IntentSender.SendIntentException {
        if (mo133650e0()) {
            PendingIntent pendingIntent = this.f103193d;
            C40843u.m166202l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    @C0359n0
    public String toString() {
        C40808s.C40809a d = C40808s.m166012d(this);
        d.mo134475a("statusCode", mo133645A0());
        d.mo134475a(C9175a.f24920M, this.f103193d);
        return d.toString();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, mo133648W());
        C40820a.m166108Y(parcel, 2, mo133649X(), false);
        C40820a.m166102S(parcel, 3, this.f103193d, i, false);
        C40820a.m166102S(parcel, 4, mo133646M(), i, false);
        C40820a.m166089F(parcel, 1000, this.f103190a);
        C40820a.m166112b(parcel, a);
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(int i, @C0363p0 String str) {
        this(1, i, str, (PendingIntent) null, (ConnectionResult) null);
    }

    public Status(int i, @C0363p0 String str, @C0363p0 PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent, (ConnectionResult) null);
    }

    public Status(@C0359n0 ConnectionResult connectionResult, @C0359n0 String str) {
        this(connectionResult, str, 17);
    }

    @C40473a
    @Deprecated
    public Status(@C0359n0 ConnectionResult connectionResult, @C0359n0 String str, int i) {
        this(1, i, str, connectionResult.mo133593W(), connectionResult);
    }
}
