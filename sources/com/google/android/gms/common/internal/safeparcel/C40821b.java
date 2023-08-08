package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40967c;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.common.zzag;
import java.util.ArrayList;

@C40473a
@C40974d0
/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public final class C40821b {
    @C40473a
    @C0359n0
    /* renamed from: a */
    public static <T extends SafeParcelable> T m166145a(@C0359n0 byte[] bArr, @C0359n0 Parcelable.Creator<T> creator) {
        C40843u.m166202l(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    @C0363p0
    @C40473a
    /* renamed from: b */
    public static <T extends SafeParcelable> T m166146b(@C0359n0 Intent intent, @C0359n0 String str, @C0359n0 Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return m166145a(byteArrayExtra, creator);
    }

    @C40473a
    @C0359n0
    /* renamed from: c */
    public static <T extends SafeParcelable> T m166147c(@C0359n0 String str, @C0359n0 Parcelable.Creator<T> creator) {
        return m166145a(C40967c.m166594b(str), creator);
    }

    @C0363p0
    @Deprecated
    /* renamed from: d */
    public static <T extends SafeParcelable> ArrayList<T> m166148d(@C0359n0 Bundle bundle, @C0359n0 String str, @C0359n0 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(m166145a((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    @C0363p0
    @C40473a
    /* renamed from: e */
    public static <T extends SafeParcelable> ArrayList<T> m166149e(@C0359n0 Bundle bundle, @C0359n0 String str, @C0359n0 Parcelable.Creator<T> creator) {
        return m166150f(bundle.getByteArray(str), creator);
    }

    @C0363p0
    /* renamed from: f */
    public static <T extends SafeParcelable> ArrayList<T> m166150f(@C0363p0 byte[] bArr, @C0359n0 Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, length);
        obtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            obtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            obtain.recycle();
        }
    }

    @C0363p0
    @C40473a
    @Deprecated
    /* renamed from: g */
    public static <T extends SafeParcelable> ArrayList<T> m166151g(@C0359n0 Intent intent, @C0359n0 String str, @C0359n0 Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(m166145a((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    @C0363p0
    @C40473a
    /* renamed from: h */
    public static <T extends SafeParcelable> ArrayList<T> m166152h(@C0359n0 Intent intent, @C0359n0 String str, @C0359n0 Parcelable.Creator<T> creator) {
        return m166150f(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    /* renamed from: i */
    public static <T extends SafeParcelable> void m166153i(@C0359n0 Iterable<T> iterable, @C0359n0 Bundle bundle, @C0359n0 String str) {
        ArrayList arrayList = new ArrayList();
        for (T m : iterable) {
            arrayList.add(m166157m(m));
        }
        bundle.putSerializable(str, arrayList);
    }

    /* renamed from: j */
    public static <T extends SafeParcelable> void m166154j(@C0359n0 Iterable<T> iterable, @C0359n0 Bundle bundle, @C0359n0 String str) {
        bundle.putByteArray(str, m166160p(iterable));
    }

    @C40473a
    @Deprecated
    /* renamed from: k */
    public static <T extends SafeParcelable> void m166155k(@C0359n0 Iterable<T> iterable, @C0359n0 Intent intent, @C0359n0 String str) {
        ArrayList arrayList = new ArrayList();
        for (T m : iterable) {
            arrayList.add(m166157m(m));
        }
        intent.putExtra(str, arrayList);
    }

    @C40473a
    /* renamed from: l */
    public static <T extends SafeParcelable> void m166156l(@C0359n0 Iterable<T> iterable, @C0359n0 Intent intent, @C0359n0 String str) {
        intent.putExtra(str, m166160p(iterable));
    }

    @C40473a
    @C0359n0
    /* renamed from: m */
    public static <T extends SafeParcelable> byte[] m166157m(@C0359n0 T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @C40473a
    /* renamed from: n */
    public static <T extends SafeParcelable> void m166158n(@C0359n0 T t, @C0359n0 Intent intent, @C0359n0 String str) {
        intent.putExtra(str, m166157m(t));
    }

    @C40473a
    @C0359n0
    /* renamed from: o */
    public static <T extends SafeParcelable> String m166159o(@C0359n0 T t) {
        return C40967c.m166597e(m166157m(t));
    }

    /* renamed from: p */
    public static byte[] m166160p(Iterable iterable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeTypedList(zzag.m167015H(iterable));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}
