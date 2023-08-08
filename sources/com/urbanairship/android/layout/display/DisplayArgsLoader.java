package com.urbanairship.android.layout.display;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class DisplayArgsLoader implements Parcelable {
    public static final Parcelable.Creator<DisplayArgsLoader> CREATOR = new C35577a();

    /* renamed from: b */
    public static final Map<String, C35578a> f87966b = new HashMap();

    /* renamed from: a */
    public final String f87967a;

    public static class LoadException extends Exception {
        public LoadException(String str) {
            super(str);
        }
    }

    /* renamed from: com.urbanairship.android.layout.display.DisplayArgsLoader$a */
    public class C35577a implements Parcelable.Creator<DisplayArgsLoader> {
        /* renamed from: a */
        public DisplayArgsLoader createFromParcel(Parcel parcel) {
            return new DisplayArgsLoader(parcel, (C35577a) null);
        }

        /* renamed from: b */
        public DisplayArgsLoader[] newArray(int i) {
            return new DisplayArgsLoader[i];
        }
    }

    public /* synthetic */ DisplayArgsLoader(Parcel parcel, C35577a aVar) {
        this(parcel);
    }

    /* renamed from: c */
    public static DisplayArgsLoader m146843c(@C0359n0 C35578a aVar) {
        String uuid = UUID.randomUUID().toString();
        f87966b.put(uuid, aVar);
        return new DisplayArgsLoader(uuid);
    }

    /* renamed from: a */
    public void mo106586a() {
        f87966b.remove(this.f87967a);
    }

    @C0359n0
    /* renamed from: b */
    public C35578a mo106587b() throws LoadException {
        C35578a aVar = f87966b.get(this.f87967a);
        if (aVar != null) {
            return aVar;
        }
        throw new LoadException("Layout args no longer available");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f87967a);
    }

    public DisplayArgsLoader(@C0363p0 String str) {
        this.f87967a = str;
    }

    public DisplayArgsLoader(Parcel parcel) {
        this.f87967a = parcel.readString();
    }
}
