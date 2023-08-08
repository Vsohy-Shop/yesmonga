package com.usabilla.sdk.ubform.utils.ext;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.usabilla.sdk.ubform.utils.ext.k */
public final class C10137k {
    /* renamed from: a */
    public static final /* synthetic */ List m38364a(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        if (readInt > 0) {
            int i = 0;
            do {
                i++;
                arrayList.add(Integer.valueOf(parcel.readInt()));
            } while (i < readInt);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m38365b(Parcel parcel, List list) {
        Intrinsics.checkNotNullParameter(parcel, "<this>");
        Intrinsics.checkNotNullParameter(list, "input");
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(((Number) it.next()).intValue());
        }
    }
}
