package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C40473a
/* renamed from: com.google.android.gms.common.data.g */
public class C40698g<T extends SafeParcelable> extends C40691a<T> {

    /* renamed from: c */
    public static final String[] f103677c = {"data"};

    /* renamed from: b */
    public final Parcelable.Creator f103678b;

    @C40473a
    public C40698g(@C0359n0 DataHolder dataHolder, @C0359n0 Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.f103678b = creator;
    }

    @C40473a
    /* renamed from: i */
    public static <T extends SafeParcelable> void m165618i(@C0359n0 DataHolder.C40690a aVar, @C0359n0 T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", obtain.marshall());
        aVar.mo134148c(contentValues);
        obtain.recycle();
    }

    @C40473a
    @C0359n0
    /* renamed from: k */
    public static DataHolder.C40690a m165619k() {
        return DataHolder.m165564M(f103677c);
    }

    @C40473a
    @C0359n0
    /* renamed from: q */
    public T get(int i) {
        DataHolder dataHolder = (DataHolder) C40843u.m166202l(this.f103670a);
        byte[] X = dataHolder.mo134132X("data", i, dataHolder.mo134144t0(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(X, 0, X.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) this.f103678b.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }
}
