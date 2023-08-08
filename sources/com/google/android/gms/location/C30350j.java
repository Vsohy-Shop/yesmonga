package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C40761g;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.C30331f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.location.j */
public class C30350j {

    /* renamed from: a */
    public final int f72809a;
    @C30331f.C30333b

    /* renamed from: b */
    public final int f72810b;

    /* renamed from: c */
    public final List<C30331f> f72811c;

    /* renamed from: d */
    public final Location f72812d;

    public C30350j(int i, @C30331f.C30333b int i2, List<C30331f> list, Location location) {
        this.f72809a = i;
        this.f72810b = i2;
        this.f72811c = list;
        this.f72812d = location;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C30350j m122173a(@RecentlyNonNull Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra(C40761g.f103868a, -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1) {
            if (intExtra2 == 1 || intExtra2 == 2) {
                i = intExtra2;
            } else if (intExtra2 == 4) {
                i = 4;
            }
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = (byte[]) arrayList2.get(i2);
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                obtain.recycle();
                arrayList.add(zzbe.CREATOR.createFromParcel(obtain));
            }
        }
        return new C30350j(intExtra, i, arrayList, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    /* renamed from: b */
    public int mo85720b() {
        return this.f72809a;
    }

    @C30331f.C30333b
    /* renamed from: c */
    public int mo85721c() {
        return this.f72810b;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public List<C30331f> mo85722d() {
        return this.f72811c;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public Location mo85723e() {
        return this.f72812d;
    }

    /* renamed from: f */
    public boolean mo85724f() {
        return this.f72809a != -1;
    }
}
