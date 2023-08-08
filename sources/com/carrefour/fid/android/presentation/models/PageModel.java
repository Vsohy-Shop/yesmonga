package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/PageModel;", "Landroid/os/Parcelable;", "", "a", "b", "count", "total", "c", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "I", "e", "()I", "f", "<init>", "(II)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class PageModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<PageModel> CREATOR = new C38441a();

    /* renamed from: c */
    public static final int f97485c = 0;

    /* renamed from: a */
    public final int f97486a;

    /* renamed from: b */
    public final int f97487b;

    /* renamed from: com.carrefour.fid.android.presentation.models.PageModel$a */
    public static final class C38441a implements Parcelable.Creator<PageModel> {
        @C12579k
        /* renamed from: a */
        public final PageModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PageModel(parcel.readInt(), parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public final PageModel[] newArray(int i) {
            return new PageModel[i];
        }
    }

    public PageModel(int i, int i2) {
        this.f97486a = i;
        this.f97487b = i2;
    }

    /* renamed from: d */
    public static /* synthetic */ PageModel m159350d(PageModel pageModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = pageModel.f97486a;
        }
        if ((i3 & 2) != 0) {
            i2 = pageModel.f97487b;
        }
        return pageModel.mo121773c(i, i2);
    }

    /* renamed from: a */
    public final int mo121771a() {
        return this.f97486a;
    }

    /* renamed from: b */
    public final int mo121772b() {
        return this.f97487b;
    }

    @C12579k
    /* renamed from: c */
    public final PageModel mo121773c(int i, int i2) {
        return new PageModel(i, i2);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo121775e() {
        return this.f97486a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageModel)) {
            return false;
        }
        PageModel pageModel = (PageModel) obj;
        return this.f97486a == pageModel.f97486a && this.f97487b == pageModel.f97487b;
    }

    /* renamed from: f */
    public final int mo121777f() {
        return this.f97487b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f97486a) * 31) + Integer.hashCode(this.f97487b);
    }

    @C12579k
    public String toString() {
        int i = this.f97486a;
        int i2 = this.f97487b;
        return "PageModel(count=" + i + ", total=" + i2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f97486a);
        parcel.writeInt(this.f97487b);
    }
}
