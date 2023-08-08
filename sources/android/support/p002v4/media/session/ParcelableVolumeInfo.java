package android.support.p002v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0139a();

    /* renamed from: a */
    public int f451a;

    /* renamed from: b */
    public int f452b;

    /* renamed from: c */
    public int f453c;

    /* renamed from: d */
    public int f454d;

    /* renamed from: e */
    public int f455e;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public static class C0139a implements Parcelable.Creator<ParcelableVolumeInfo> {
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f451a = i;
        this.f452b = i2;
        this.f453c = i3;
        this.f454d = i4;
        this.f455e = i5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f451a);
        parcel.writeInt(this.f453c);
        parcel.writeInt(this.f454d);
        parcel.writeInt(this.f455e);
        parcel.writeInt(this.f452b);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f451a = parcel.readInt();
        this.f453c = parcel.readInt();
        this.f454d = parcel.readInt();
        this.f455e = parcel.readInt();
        this.f452b = parcel.readInt();
    }
}
