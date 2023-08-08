package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C19150a();

    /* renamed from: a */
    public final List<String> f49170a;

    /* renamed from: b */
    public final List<BackStackRecordState> f49171b;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    public class C19150a implements Parcelable.Creator<BackStackState> {
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: b */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(List<String> list, List<BackStackRecordState> list2) {
        this.f49170a = list;
        this.f49171b = list2;
    }

    @C0359n0
    /* renamed from: a */
    public List<C19197a> mo56578a(@C0359n0 FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap hashMap = new HashMap(this.f49170a.size());
        for (String next : this.f49170a) {
            Fragment fragment = map.get(next);
            if (fragment != null) {
                hashMap.put(fragment.mWho, fragment);
            } else {
                FragmentState C = fragmentManager.mo56804H0().mo57146C(next, (FragmentState) null);
                if (C != null) {
                    Fragment a = C.mo56967a(fragmentManager.mo56801G0(), fragmentManager.mo56810J0().mo57316k().getClassLoader());
                    hashMap.put(a.mWho, a);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (BackStackRecordState c : this.f49171b) {
            arrayList.add(c.mo56571c(fragmentManager, hashMap));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeStringList(this.f49170a);
        parcel.writeTypedList(this.f49171b);
    }

    public BackStackState(@C0359n0 Parcel parcel) {
        this.f49170a = parcel.createStringArrayList();
        this.f49171b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
