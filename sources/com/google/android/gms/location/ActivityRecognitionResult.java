package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.C40821b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C40974d0;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

@SafeParcelable.C40812a(creator = "ActivityRecognitionResultCreator")
@SafeParcelable.C40818g({1000})
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new C30402y1();
    @SafeParcelable.C40814c(mo134489id = 1)

    /* renamed from: a */
    public List<DetectedActivity> f72664a;
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public long f72665b;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: c */
    public long f72666c;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: d */
    public int f72667d;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: e */
    public Bundle f72668e;

    @C40974d0
    public ActivityRecognitionResult(@RecentlyNonNull DetectedActivity detectedActivity, long j, long j2) {
        this(Collections.singletonList(detectedActivity), j, j2, 0, (Bundle) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    @androidx.annotation.RecentlyNullable
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.ActivityRecognitionResult m122020M(@androidx.annotation.RecentlyNonNull android.content.Intent r3) {
        /*
            boolean r0 = m122021n0(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x002b
        L_0x0009:
            android.os.Bundle r0 = r3.getExtras()
            if (r0 != 0) goto L_0x0010
            goto L_0x0007
        L_0x0010:
            java.lang.String r2 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L_0x0025
            byte[] r0 = (byte[]) r0
            android.os.Parcelable$Creator<com.google.android.gms.location.ActivityRecognitionResult> r2 = CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = com.google.android.gms.common.internal.safeparcel.C40821b.m166145a(r0, r2)
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
            goto L_0x002b
        L_0x0025:
            boolean r2 = r0 instanceof com.google.android.gms.location.ActivityRecognitionResult
            if (r2 == 0) goto L_0x0007
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
        L_0x002b:
            if (r0 == 0) goto L_0x002e
            return r0
        L_0x002e:
            java.util.List r3 = m122022p0(r3)
            if (r3 == 0) goto L_0x0048
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x003b
            goto L_0x0048
        L_0x003b:
            int r0 = r3.size()
            int r0 = r0 + -1
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            return r3
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.m122020M(android.content.Intent):com.google.android.gms.location.ActivityRecognitionResult");
    }

    /* renamed from: n0 */
    public static boolean m122021n0(@C0363p0 Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List<ActivityRecognitionResult> p0 = m122022p0(intent);
        if (p0 == null || p0.isEmpty()) {
            return false;
        }
        return true;
    }

    @RecentlyNullable
    /* renamed from: p0 */
    public static List<ActivityRecognitionResult> m122022p0(@RecentlyNonNull Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return C40821b.m166151g(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    /* renamed from: t0 */
    public static boolean m122023t0(@C0363p0 Bundle bundle, @C0363p0 Bundle bundle2) {
        int length;
        if (bundle == null) {
            if (bundle2 == null) {
                return true;
            }
            return false;
        } else if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        } else {
            for (String next : bundle.keySet()) {
                if (!bundle2.containsKey(next)) {
                    return false;
                }
                Object obj = bundle.get(next);
                Object obj2 = bundle2.get(next);
                if (obj == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (obj instanceof Bundle) {
                    if (!m122023t0(bundle.getBundle(next), bundle2.getBundle(next))) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        int i = 0;
                        while (i < length) {
                            if (C40808s.m166010b(Array.get(obj, i), Array.get(obj2, i))) {
                                i++;
                            }
                        }
                        continue;
                    }
                    return false;
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: Q */
    public int mo85516Q(int i) {
        for (DetectedActivity next : this.f72664a) {
            if (next.mo85552Q() == i) {
                return next.mo85551M();
            }
        }
        return 0;
    }

    /* renamed from: W */
    public long mo85517W() {
        return this.f72666c;
    }

    @RecentlyNonNull
    /* renamed from: X */
    public DetectedActivity mo85518X() {
        return this.f72664a.get(0);
    }

    @RecentlyNonNull
    /* renamed from: e0 */
    public List<DetectedActivity> mo85519e0() {
        return this.f72664a;
    }

    @C40858y
    public final boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.f72665b == activityRecognitionResult.f72665b && this.f72666c == activityRecognitionResult.f72666c && this.f72667d == activityRecognitionResult.f72667d && C40808s.m166010b(this.f72664a, activityRecognitionResult.f72664a) && m122023t0(this.f72668e, activityRecognitionResult.f72668e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f0 */
    public long mo85521f0() {
        return this.f72665b;
    }

    @C40858y
    public final int hashCode() {
        return C40808s.m166011c(Long.valueOf(this.f72665b), Long.valueOf(this.f72666c), Integer.valueOf(this.f72667d), this.f72664a, this.f72668e);
    }

    @RecentlyNonNull
    public String toString() {
        String valueOf = String.valueOf(this.f72664a);
        long j = this.f72665b;
        long j2 = this.f72666c;
        StringBuilder sb = new StringBuilder(valueOf.length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166117d0(parcel, 1, this.f72664a, false);
        C40820a.m166094K(parcel, 2, this.f72665b);
        C40820a.m166094K(parcel, 3, this.f72666c);
        C40820a.m166089F(parcel, 4, this.f72667d);
        C40820a.m166129k(parcel, 5, this.f72668e, false);
        C40820a.m166112b(parcel, a);
    }

    public ActivityRecognitionResult(@RecentlyNonNull List<DetectedActivity> list, long j, long j2) {
        this(list, j, j2, 0, (Bundle) null);
    }

    @C40858y
    @SafeParcelable.C40813b
    public ActivityRecognitionResult(@RecentlyNonNull @SafeParcelable.C40816e(mo134492id = 1) List<DetectedActivity> list, @SafeParcelable.C40816e(mo134492id = 2) long j, @SafeParcelable.C40816e(mo134492id = 3) long j2, @SafeParcelable.C40816e(mo134492id = 4) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) Bundle bundle) {
        boolean z = true;
        C40843u.m166192b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        C40843u.m166192b((j <= 0 || j2 <= 0) ? false : z, "Must set times");
        this.f72664a = list;
        this.f72665b = j;
        this.f72666c = j2;
        this.f72667d = i;
        this.f72668e = bundle;
    }
}
