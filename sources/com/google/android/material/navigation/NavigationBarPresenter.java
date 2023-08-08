package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0573j;
import androidx.appcompat.view.menu.C0585n;
import androidx.appcompat.view.menu.C0587o;
import androidx.appcompat.view.menu.C0594s;
import com.google.android.material.badge.C31135b;
import com.google.android.material.internal.ParcelableSparseArray;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationBarPresenter implements C0585n {

    /* renamed from: a */
    public C0568g f76063a;

    /* renamed from: b */
    public NavigationBarMenuView f76064b;

    /* renamed from: c */
    public boolean f76065c = false;

    /* renamed from: d */
    public int f76066d;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C31448a();

        /* renamed from: a */
        public int f76067a;
        @C0363p0

        /* renamed from: b */
        public ParcelableSparseArray f76068b;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        public class C31448a implements Parcelable.Creator<SavedState> {
            @C0359n0
            /* renamed from: a */
            public SavedState createFromParcel(@C0359n0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @C0359n0
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            parcel.writeInt(this.f76067a);
            parcel.writeParcelable(this.f76068b, 0);
        }

        public SavedState(@C0359n0 Parcel parcel) {
            this.f76067a = parcel.readInt();
            this.f76068b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    /* renamed from: a */
    public void mo90305a(int i) {
        this.f76066d = i;
    }

    /* renamed from: b */
    public void mo1936b(@C0363p0 C0568g gVar, boolean z) {
    }

    /* renamed from: c */
    public void mo90306c(@C0359n0 NavigationBarMenuView navigationBarMenuView) {
        this.f76064b = navigationBarMenuView;
    }

    /* renamed from: d */
    public boolean mo1938d(@C0363p0 C0568g gVar, @C0363p0 C0573j jVar) {
        return false;
    }

    /* renamed from: e */
    public void mo1939e(@C0363p0 C0585n.C0586a aVar) {
    }

    /* renamed from: f */
    public void mo1969f(@C0359n0 Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f76064b.mo90282q(savedState.f76067a);
            this.f76064b.mo90281p(C31135b.m125064g(this.f76064b.getContext(), savedState.f76068b));
        }
    }

    /* renamed from: g */
    public boolean mo1940g(@C0363p0 C0594s sVar) {
        return false;
    }

    public int getId() {
        return this.f76066d;
    }

    @C0363p0
    /* renamed from: h */
    public C0587o mo1942h(@C0363p0 ViewGroup viewGroup) {
        return this.f76064b;
    }

    @C0359n0
    /* renamed from: i */
    public Parcelable mo1970i() {
        SavedState savedState = new SavedState();
        savedState.f76067a = this.f76064b.getSelectedItemId();
        savedState.f76068b = C31135b.m125065h(this.f76064b.getBadgeDrawables());
        return savedState;
    }

    /* renamed from: j */
    public void mo1943j(boolean z) {
        if (!this.f76065c) {
            if (z) {
                this.f76064b.mo90249d();
            } else {
                this.f76064b.mo90283r();
            }
        }
    }

    /* renamed from: k */
    public boolean mo1944k() {
        return false;
    }

    /* renamed from: l */
    public boolean mo1945l(@C0363p0 C0568g gVar, @C0363p0 C0573j jVar) {
        return false;
    }

    /* renamed from: m */
    public void mo1946m(@C0359n0 Context context, @C0359n0 C0568g gVar) {
        this.f76063a = gVar;
        this.f76064b.mo1858c(gVar);
    }

    /* renamed from: n */
    public void mo90307n(boolean z) {
        this.f76065c = z;
    }
}
