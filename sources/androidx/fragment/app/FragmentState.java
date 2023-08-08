package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.lifecycle.Lifecycle;
import com.carrefour.fid.android.core.extension.C36306e;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C19188a();

    /* renamed from: X */
    public Bundle f49308X;

    /* renamed from: a */
    public final String f49309a;

    /* renamed from: b */
    public final String f49310b;

    /* renamed from: c */
    public final boolean f49311c;

    /* renamed from: d */
    public final int f49312d;

    /* renamed from: e */
    public final int f49313e;

    /* renamed from: f */
    public final String f49314f;

    /* renamed from: g */
    public final boolean f49315g;

    /* renamed from: v */
    public final boolean f49316v;

    /* renamed from: w */
    public final boolean f49317w;

    /* renamed from: x */
    public final Bundle f49318x;

    /* renamed from: y */
    public final boolean f49319y;

    /* renamed from: z */
    public final int f49320z;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    public class C19188a implements Parcelable.Creator<FragmentState> {
        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: b */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f49309a = fragment.getClass().getName();
        this.f49310b = fragment.mWho;
        this.f49311c = fragment.mFromLayout;
        this.f49312d = fragment.mFragmentId;
        this.f49313e = fragment.mContainerId;
        this.f49314f = fragment.mTag;
        this.f49315g = fragment.mRetainInstance;
        this.f49316v = fragment.mRemoving;
        this.f49317w = fragment.mDetached;
        this.f49318x = fragment.mArguments;
        this.f49319y = fragment.mHidden;
        this.f49320z = fragment.mMaxState.ordinal();
    }

    @C0359n0
    /* renamed from: a */
    public Fragment mo56967a(@C0359n0 C19250l lVar, @C0359n0 ClassLoader classLoader) {
        Fragment a = lVar.mo56932a(classLoader, this.f49309a);
        Bundle bundle = this.f49318x;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.setArguments(this.f49318x);
        a.mWho = this.f49310b;
        a.mFromLayout = this.f49311c;
        a.mRestored = true;
        a.mFragmentId = this.f49312d;
        a.mContainerId = this.f49313e;
        a.mTag = this.f49314f;
        a.mRetainInstance = this.f49315g;
        a.mRemoving = this.f49316v;
        a.mDetached = this.f49317w;
        a.mHidden = this.f49319y;
        a.mMaxState = Lifecycle.State.values()[this.f49320z];
        Bundle bundle2 = this.f49308X;
        if (bundle2 != null) {
            a.mSavedFragmentState = bundle2;
        } else {
            a.mSavedFragmentState = new Bundle();
        }
        return a;
    }

    public int describeContents() {
        return 0;
    }

    @C0359n0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f49309a);
        sb.append(C36306e.f89637a);
        sb.append(this.f49310b);
        sb.append(")}:");
        if (this.f49311c) {
            sb.append(" fromLayout");
        }
        if (this.f49313e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f49313e));
        }
        String str = this.f49314f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f49314f);
        }
        if (this.f49315g) {
            sb.append(" retainInstance");
        }
        if (this.f49316v) {
            sb.append(" removing");
        }
        if (this.f49317w) {
            sb.append(" detached");
        }
        if (this.f49319y) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f49309a);
        parcel.writeString(this.f49310b);
        parcel.writeInt(this.f49311c ? 1 : 0);
        parcel.writeInt(this.f49312d);
        parcel.writeInt(this.f49313e);
        parcel.writeString(this.f49314f);
        parcel.writeInt(this.f49315g ? 1 : 0);
        parcel.writeInt(this.f49316v ? 1 : 0);
        parcel.writeInt(this.f49317w ? 1 : 0);
        parcel.writeBundle(this.f49318x);
        parcel.writeInt(this.f49319y ? 1 : 0);
        parcel.writeBundle(this.f49308X);
        parcel.writeInt(this.f49320z);
    }

    public FragmentState(Parcel parcel) {
        this.f49309a = parcel.readString();
        this.f49310b = parcel.readString();
        boolean z = true;
        this.f49311c = parcel.readInt() != 0;
        this.f49312d = parcel.readInt();
        this.f49313e = parcel.readInt();
        this.f49314f = parcel.readString();
        this.f49315g = parcel.readInt() != 0;
        this.f49316v = parcel.readInt() != 0;
        this.f49317w = parcel.readInt() != 0;
        this.f49318x = parcel.readBundle();
        this.f49319y = parcel.readInt() == 0 ? false : z;
        this.f49308X = parcel.readBundle();
        this.f49320z = parcel.readInt();
    }
}
