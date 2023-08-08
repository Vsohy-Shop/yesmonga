package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import kotlinx.serialization.json.internal.C12361b;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    @C0359n0
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C0252a();

    /* renamed from: a */
    public final int f753a;
    @C0363p0

    /* renamed from: b */
    public final Intent f754b;

    /* renamed from: androidx.activity.result.ActivityResult$a */
    public class C0252a implements Parcelable.Creator<ActivityResult> {
        /* renamed from: a */
        public ActivityResult createFromParcel(@C0359n0 Parcel parcel) {
            return new ActivityResult(parcel);
        }

        /* renamed from: b */
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }
    }

    public ActivityResult(int i, @C0363p0 Intent intent) {
        this.f753a = i;
        this.f754b = intent;
    }

    @C0359n0
    /* renamed from: c */
    public static String m1351c(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @C0363p0
    /* renamed from: a */
    public Intent mo854a() {
        return this.f754b;
    }

    /* renamed from: b */
    public int mo855b() {
        return this.f753a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m1351c(this.f753a) + ", data=" + this.f754b + C12361b.f30259j;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f753a);
        if (this.f754b == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Intent intent = this.f754b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f753a = parcel.readInt();
        this.f754b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
