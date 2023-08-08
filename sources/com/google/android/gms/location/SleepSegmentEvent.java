package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.C40821b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.C40812a(creator = "SleepSegmentEventCreator")
@SafeParcelable.C40818g({1000})
public class SleepSegmentEvent extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new C30368n1();

    /* renamed from: f */
    public static final int f72750f = 0;

    /* renamed from: g */
    public static final int f72751g = 1;

    /* renamed from: v */
    public static final int f72752v = 2;
    @SafeParcelable.C40814c(getter = "getStartTimeMillis", mo134489id = 1)

    /* renamed from: a */
    public final long f72753a;
    @SafeParcelable.C40814c(getter = "getEndTimeMillis", mo134489id = 2)

    /* renamed from: b */
    public final long f72754b;
    @SafeParcelable.C40814c(getter = "getStatus", mo134489id = 3)

    /* renamed from: c */
    public final int f72755c;
    @SafeParcelable.C40814c(getter = "getMissingDataDurationMinutes", mo134489id = 4)

    /* renamed from: d */
    public final int f72756d;
    @SafeParcelable.C40814c(getter = "getNinetiethPctConfidence", mo134489id = 5)

    /* renamed from: e */
    public final int f72757e;

    @C40858y
    @SafeParcelable.C40813b
    public SleepSegmentEvent(@SafeParcelable.C40816e(mo134492id = 1) long j, @SafeParcelable.C40816e(mo134492id = 2) long j2, @SafeParcelable.C40816e(mo134492id = 3) int i, @SafeParcelable.C40816e(mo134492id = 4) int i2, @SafeParcelable.C40816e(mo134492id = 5) int i3) {
        boolean z;
        if (j <= j2) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166192b(z, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.f72753a = j;
        this.f72754b = j2;
        this.f72755c = i;
        this.f72756d = i2;
        this.f72757e = i3;
    }

    @RecentlyNonNull
    /* renamed from: M */
    public static List<SleepSegmentEvent> m122101M(@RecentlyNonNull Intent intent) {
        C40843u.m166202l(intent);
        if (!m122102f0(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            C40843u.m166202l(bArr);
            arrayList2.add((SleepSegmentEvent) C40821b.m166145a(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: f0 */
    public static boolean m122102f0(@C0363p0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    /* renamed from: Q */
    public long mo85625Q() {
        return this.f72754b;
    }

    /* renamed from: W */
    public long mo85626W() {
        return this.f72754b - this.f72753a;
    }

    /* renamed from: X */
    public long mo85627X() {
        return this.f72753a;
    }

    /* renamed from: e0 */
    public int mo85628e0() {
        return this.f72755c;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.f72753a == sleepSegmentEvent.mo85627X() && this.f72754b == sleepSegmentEvent.mo85625Q() && this.f72755c == sleepSegmentEvent.mo85628e0() && this.f72756d == sleepSegmentEvent.f72756d && this.f72757e == sleepSegmentEvent.f72757e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return C40808s.m166011c(Long.valueOf(this.f72753a), Long.valueOf(this.f72754b), Integer.valueOf(this.f72755c));
    }

    @RecentlyNonNull
    public String toString() {
        long j = this.f72753a;
        long j2 = this.f72754b;
        int i = this.f72755c;
        StringBuilder sb = new StringBuilder(84);
        sb.append("startMillis=");
        sb.append(j);
        sb.append(", endMillis=");
        sb.append(j2);
        sb.append(", status=");
        sb.append(i);
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C40843u.m166202l(parcel);
        int a = C40820a.m166110a(parcel);
        C40820a.m166094K(parcel, 1, mo85627X());
        C40820a.m166094K(parcel, 2, mo85625Q());
        C40820a.m166089F(parcel, 3, mo85628e0());
        C40820a.m166089F(parcel, 4, this.f72756d);
        C40820a.m166089F(parcel, 5, this.f72757e);
        C40820a.m166112b(parcel, a);
    }
}
