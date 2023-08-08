package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.fragment.app.C19234h0;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C19149a();

    /* renamed from: Z */
    public static final String f49155Z = "FragmentManager";

    /* renamed from: X */
    public final ArrayList<String> f49156X;

    /* renamed from: Y */
    public final boolean f49157Y;

    /* renamed from: a */
    public final int[] f49158a;

    /* renamed from: b */
    public final ArrayList<String> f49159b;

    /* renamed from: c */
    public final int[] f49160c;

    /* renamed from: d */
    public final int[] f49161d;

    /* renamed from: e */
    public final int f49162e;

    /* renamed from: f */
    public final String f49163f;

    /* renamed from: g */
    public final int f49164g;

    /* renamed from: v */
    public final int f49165v;

    /* renamed from: w */
    public final CharSequence f49166w;

    /* renamed from: x */
    public final int f49167x;

    /* renamed from: y */
    public final CharSequence f49168y;

    /* renamed from: z */
    public final ArrayList<String> f49169z;

    /* renamed from: androidx.fragment.app.BackStackRecordState$a */
    public class C19149a implements Parcelable.Creator<BackStackRecordState> {
        /* renamed from: a */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        /* renamed from: b */
        public BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(C19197a aVar) {
        int size = aVar.f49493c.size();
        this.f49158a = new int[(size * 6)];
        if (aVar.f49499i) {
            this.f49159b = new ArrayList<>(size);
            this.f49160c = new int[size];
            this.f49161d = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C19234h0.C19235a aVar2 = aVar.f49493c.get(i);
                int i3 = i2 + 1;
                this.f49158a[i2] = aVar2.f49510a;
                ArrayList<String> arrayList = this.f49159b;
                Fragment fragment = aVar2.f49511b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f49158a;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f49512c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f49513d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f49514e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f49515f;
                iArr[i7] = aVar2.f49516g;
                this.f49160c[i] = aVar2.f49517h.ordinal();
                this.f49161d[i] = aVar2.f49518i.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.f49162e = aVar.f49498h;
            this.f49163f = aVar.f49501k;
            this.f49164g = aVar.f49367P;
            this.f49165v = aVar.f49502l;
            this.f49166w = aVar.f49503m;
            this.f49167x = aVar.f49504n;
            this.f49168y = aVar.f49505o;
            this.f49169z = aVar.f49506p;
            this.f49156X = aVar.f49507q;
            this.f49157Y = aVar.f49508r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public final void mo56569a(@C0359n0 C19197a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.f49158a.length) {
                C19234h0.C19235a aVar2 = new C19234h0.C19235a();
                int i3 = i + 1;
                aVar2.f49510a = this.f49158a[i];
                if (FragmentManager.m89694W0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Instantiate ");
                    sb.append(aVar);
                    sb.append(" op #");
                    sb.append(i2);
                    sb.append(" base fragment #");
                    sb.append(this.f49158a[i3]);
                }
                aVar2.f49517h = Lifecycle.State.values()[this.f49160c[i2]];
                aVar2.f49518i = Lifecycle.State.values()[this.f49161d[i2]];
                int[] iArr = this.f49158a;
                int i4 = i3 + 1;
                if (iArr[i3] == 0) {
                    z = false;
                }
                aVar2.f49512c = z;
                int i5 = i4 + 1;
                int i6 = iArr[i4];
                aVar2.f49513d = i6;
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                aVar2.f49514e = i8;
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                aVar2.f49515f = i10;
                int i11 = iArr[i9];
                aVar2.f49516g = i11;
                aVar.f49494d = i6;
                aVar.f49495e = i8;
                aVar.f49496f = i10;
                aVar.f49497g = i11;
                aVar.mo57223m(aVar2);
                i2++;
                i = i9 + 1;
            } else {
                aVar.f49498h = this.f49162e;
                aVar.f49501k = this.f49163f;
                aVar.f49499i = true;
                aVar.f49502l = this.f49165v;
                aVar.f49503m = this.f49166w;
                aVar.f49504n = this.f49167x;
                aVar.f49505o = this.f49168y;
                aVar.f49506p = this.f49169z;
                aVar.f49507q = this.f49156X;
                aVar.f49508r = this.f49157Y;
                return;
            }
        }
    }

    @C0359n0
    /* renamed from: b */
    public C19197a mo56570b(@C0359n0 FragmentManager fragmentManager) {
        C19197a aVar = new C19197a(fragmentManager);
        mo56569a(aVar);
        aVar.f49367P = this.f49164g;
        for (int i = 0; i < this.f49159b.size(); i++) {
            String str = this.f49159b.get(i);
            if (str != null) {
                aVar.f49493c.get(i).f49511b = fragmentManager.mo56892o0(str);
            }
        }
        aVar.mo57042U(1);
        return aVar;
    }

    @C0359n0
    /* renamed from: c */
    public C19197a mo56571c(@C0359n0 FragmentManager fragmentManager, @C0359n0 Map<String, Fragment> map) {
        C19197a aVar = new C19197a(fragmentManager);
        mo56569a(aVar);
        for (int i = 0; i < this.f49159b.size(); i++) {
            String str = this.f49159b.get(i);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment != null) {
                    aVar.f49493c.get(i).f49511b = fragment;
                } else {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f49163f + " failed due to missing saved state for Fragment (" + str + ")");
                }
            }
        }
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f49158a);
        parcel.writeStringList(this.f49159b);
        parcel.writeIntArray(this.f49160c);
        parcel.writeIntArray(this.f49161d);
        parcel.writeInt(this.f49162e);
        parcel.writeString(this.f49163f);
        parcel.writeInt(this.f49164g);
        parcel.writeInt(this.f49165v);
        TextUtils.writeToParcel(this.f49166w, parcel, 0);
        parcel.writeInt(this.f49167x);
        TextUtils.writeToParcel(this.f49168y, parcel, 0);
        parcel.writeStringList(this.f49169z);
        parcel.writeStringList(this.f49156X);
        parcel.writeInt(this.f49157Y ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f49158a = parcel.createIntArray();
        this.f49159b = parcel.createStringArrayList();
        this.f49160c = parcel.createIntArray();
        this.f49161d = parcel.createIntArray();
        this.f49162e = parcel.readInt();
        this.f49163f = parcel.readString();
        this.f49164g = parcel.readInt();
        this.f49165v = parcel.readInt();
        this.f49166w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f49167x = parcel.readInt();
        this.f49168y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f49169z = parcel.createStringArrayList();
        this.f49156X = parcel.createStringArrayList();
        this.f49157Y = parcel.readInt() != 0;
    }
}
