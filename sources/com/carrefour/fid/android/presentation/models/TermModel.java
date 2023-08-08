package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/TermModel;", "Landroid/os/Parcelable;", "", "a", "b", "", "c", "term", "count", "selected", "d", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "f", "Z", "g", "()Z", "i", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class TermModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<TermModel> CREATOR = new C38451a();

    /* renamed from: d */
    public static final int f97563d = 8;
    @C12579k

    /* renamed from: a */
    public final String f97564a;
    @C12579k

    /* renamed from: b */
    public final String f97565b;

    /* renamed from: c */
    public boolean f97566c;

    /* renamed from: com.carrefour.fid.android.presentation.models.TermModel$a */
    public static final class C38451a implements Parcelable.Creator<TermModel> {
        @C12579k
        /* renamed from: a */
        public final TermModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TermModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final TermModel[] newArray(int i) {
            return new TermModel[i];
        }
    }

    public TermModel(@C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78927O);
        Intrinsics.checkNotNullParameter(str2, "count");
        this.f97564a = str;
        this.f97565b = str2;
        this.f97566c = z;
    }

    /* renamed from: e */
    public static /* synthetic */ TermModel m159489e(TermModel termModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = termModel.f97564a;
        }
        if ((i & 2) != 0) {
            str2 = termModel.f97565b;
        }
        if ((i & 4) != 0) {
            z = termModel.f97566c;
        }
        return termModel.mo121961d(str, str2, z);
    }

    @C12579k
    /* renamed from: a */
    public final String mo121958a() {
        return this.f97564a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo121959b() {
        return this.f97565b;
    }

    /* renamed from: c */
    public final boolean mo121960c() {
        return this.f97566c;
    }

    @C12579k
    /* renamed from: d */
    public final TermModel mo121961d(@C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78927O);
        Intrinsics.checkNotNullParameter(str2, "count");
        return new TermModel(str, str2, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermModel)) {
            return false;
        }
        TermModel termModel = (TermModel) obj;
        return Intrinsics.areEqual((Object) this.f97564a, (Object) termModel.f97564a) && Intrinsics.areEqual((Object) this.f97565b, (Object) termModel.f97565b) && this.f97566c == termModel.f97566c;
    }

    @C12579k
    /* renamed from: f */
    public final String mo121964f() {
        return this.f97565b;
    }

    /* renamed from: g */
    public final boolean mo121965g() {
        return this.f97566c;
    }

    @C12579k
    /* renamed from: h */
    public final String mo121966h() {
        return this.f97564a;
    }

    public int hashCode() {
        int hashCode = ((this.f97564a.hashCode() * 31) + this.f97565b.hashCode()) * 31;
        boolean z = this.f97566c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final void mo121968i(boolean z) {
        this.f97566c = z;
    }

    @C12579k
    public String toString() {
        String str = this.f97564a;
        String str2 = this.f97565b;
        boolean z = this.f97566c;
        return "TermModel(term=" + str + ", count=" + str2 + ", selected=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f97564a);
        parcel.writeString(this.f97565b);
        parcel.writeInt(this.f97566c ? 1 : 0);
    }
}
