package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C19187a();

    /* renamed from: a */
    public ArrayList<String> f49300a;

    /* renamed from: b */
    public ArrayList<String> f49301b;

    /* renamed from: c */
    public BackStackRecordState[] f49302c;

    /* renamed from: d */
    public int f49303d;

    /* renamed from: e */
    public String f49304e = null;

    /* renamed from: f */
    public ArrayList<String> f49305f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<BackStackState> f49306g = new ArrayList<>();

    /* renamed from: v */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f49307v;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    public class C19187a implements Parcelable.Creator<FragmentManagerState> {
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: b */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f49300a);
        parcel.writeStringList(this.f49301b);
        parcel.writeTypedArray(this.f49302c, i);
        parcel.writeInt(this.f49303d);
        parcel.writeString(this.f49304e);
        parcel.writeStringList(this.f49305f);
        parcel.writeTypedList(this.f49306g);
        parcel.writeTypedList(this.f49307v);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f49300a = parcel.createStringArrayList();
        this.f49301b = parcel.createStringArrayList();
        this.f49302c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f49303d = parcel.readInt();
        this.f49304e = parcel.readString();
        this.f49305f = parcel.createStringArrayList();
        this.f49306g = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f49307v = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
