package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

@SuppressLint({"BanParcelableUsage"})
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C18543a();

    /* renamed from: b */
    public static final AbsSavedState f47317b = new AbsSavedState() {
    };

    /* renamed from: a */
    public final Parcelable f47318a;

    /* renamed from: androidx.customview.view.AbsSavedState$a */
    public class C18543a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f47317b;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    @C0363p0
    /* renamed from: a */
    public final Parcelable mo53419a() {
        return this.f47318a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f47318a, i);
    }

    public AbsSavedState() {
        this.f47318a = null;
    }

    public AbsSavedState(@C0359n0 Parcelable parcelable) {
        if (parcelable != null) {
            this.f47318a = parcelable == f47317b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(@C0359n0 Parcel parcel) {
        this(parcel, (ClassLoader) null);
    }

    public AbsSavedState(@C0359n0 Parcel parcel, @C0363p0 ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f47318a = readParcelable == null ? f47317b : readParcelable;
    }
}
