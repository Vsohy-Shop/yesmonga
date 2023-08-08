package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C20739a();

    /* renamed from: a */
    public final C20749g f53569a;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C20739a implements Parcelable.Creator<ParcelImpl> {
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(C20749g gVar) {
        this.f53569a = gVar;
    }

    /* renamed from: a */
    public <T extends C20749g> T mo62131a() {
        return this.f53569a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C20745e(parcel).mo62224l1(this.f53569a);
    }

    public ParcelImpl(Parcel parcel) {
        this.f53569a = new C20745e(parcel).mo62208g0();
    }
}
