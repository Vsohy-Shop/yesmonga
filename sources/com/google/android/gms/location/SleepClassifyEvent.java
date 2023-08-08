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

@SafeParcelable.C40812a(creator = "SleepClassifyEventCreator")
public class SleepClassifyEvent extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new C30364m1();
    @SafeParcelable.C40814c(getter = "getTimestampSec", mo134489id = 1)

    /* renamed from: a */
    public final int f72741a;
    @SafeParcelable.C40814c(getter = "getConfidence", mo134489id = 2)

    /* renamed from: b */
    public final int f72742b;
    @SafeParcelable.C40814c(getter = "getMotion", mo134489id = 3)

    /* renamed from: c */
    public final int f72743c;
    @SafeParcelable.C40814c(getter = "getLight", mo134489id = 4)

    /* renamed from: d */
    public final int f72744d;
    @SafeParcelable.C40814c(getter = "getNoise", mo134489id = 5)

    /* renamed from: e */
    public final int f72745e;
    @SafeParcelable.C40814c(getter = "getLightDiff", mo134489id = 6)

    /* renamed from: f */
    public final int f72746f;
    @SafeParcelable.C40814c(getter = "getNightOrDay", mo134489id = 7)

    /* renamed from: g */
    public final int f72747g;
    @SafeParcelable.C40814c(getter = "getConfidenceOverwrittenByAlarmClockTrigger", mo134489id = 8)

    /* renamed from: v */
    public final boolean f72748v;
    @SafeParcelable.C40814c(getter = "getPresenceConfidence", mo134489id = 9)

    /* renamed from: w */
    public final int f72749w;

    @C40858y
    @SafeParcelable.C40813b
    public SleepClassifyEvent(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) int i3, @SafeParcelable.C40816e(mo134492id = 4) int i4, @SafeParcelable.C40816e(mo134492id = 5) int i5, @SafeParcelable.C40816e(mo134492id = 6) int i6, @SafeParcelable.C40816e(mo134492id = 7) int i7, @SafeParcelable.C40816e(mo134492id = 8) boolean z, @SafeParcelable.C40816e(mo134492id = 9) int i8) {
        this.f72741a = i;
        this.f72742b = i2;
        this.f72743c = i3;
        this.f72744d = i4;
        this.f72745e = i5;
        this.f72746f = i6;
        this.f72747g = i7;
        this.f72748v = z;
        this.f72749w = i8;
    }

    @RecentlyNonNull
    /* renamed from: M */
    public static List<SleepClassifyEvent> m122095M(@RecentlyNonNull Intent intent) {
        C40843u.m166202l(intent);
        if (!m122096f0(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            C40843u.m166202l(bArr);
            arrayList2.add((SleepClassifyEvent) C40821b.m166145a(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: f0 */
    public static boolean m122096f0(@C0363p0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    /* renamed from: Q */
    public int mo85617Q() {
        return this.f72742b;
    }

    /* renamed from: W */
    public int mo85618W() {
        return this.f72744d;
    }

    /* renamed from: X */
    public int mo85619X() {
        return this.f72743c;
    }

    /* renamed from: e0 */
    public long mo85620e0() {
        return ((long) this.f72741a) * 1000;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        if (this.f72741a == sleepClassifyEvent.f72741a && this.f72742b == sleepClassifyEvent.f72742b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f72741a), Integer.valueOf(this.f72742b));
    }

    @RecentlyNonNull
    public String toString() {
        int i = this.f72741a;
        int i2 = this.f72742b;
        int i3 = this.f72743c;
        int i4 = this.f72744d;
        StringBuilder sb = new StringBuilder(65);
        sb.append(i);
        sb.append(" Conf:");
        sb.append(i2);
        sb.append(" Motion:");
        sb.append(i3);
        sb.append(" Light:");
        sb.append(i4);
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C40843u.m166202l(parcel);
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f72741a);
        C40820a.m166089F(parcel, 2, mo85617Q());
        C40820a.m166089F(parcel, 3, mo85619X());
        C40820a.m166089F(parcel, 4, mo85618W());
        C40820a.m166089F(parcel, 5, this.f72745e);
        C40820a.m166089F(parcel, 6, this.f72746f);
        C40820a.m166089F(parcel, 7, this.f72747g);
        C40820a.m166122g(parcel, 8, this.f72748v);
        C40820a.m166089F(parcel, 9, this.f72749w);
        C40820a.m166112b(parcel, a);
    }
}
