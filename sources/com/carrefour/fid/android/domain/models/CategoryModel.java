package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0012\u0010\f¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/CategoryModel;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "level1", "b", "level2", "c", "level3", "d", "level4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CategoryModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CategoryModel> CREATOR = new C37904a();

    /* renamed from: e */
    public static final int f95095e = 0;
    @C12580l

    /* renamed from: a */
    public final String f95096a;
    @C12580l

    /* renamed from: b */
    public final String f95097b;
    @C12580l

    /* renamed from: c */
    public final String f95098c;
    @C12580l

    /* renamed from: d */
    public final String f95099d;

    /* renamed from: com.carrefour.fid.android.domain.models.CategoryModel$a */
    public static final class C37904a implements Parcelable.Creator<CategoryModel> {
        @C12579k
        /* renamed from: a */
        public final CategoryModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CategoryModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CategoryModel[] newArray(int i) {
            return new CategoryModel[i];
        }
    }

    public CategoryModel(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
        this.f95096a = str;
        this.f95097b = str2;
        this.f95098c = str3;
        this.f95099d = str4;
    }

    @C12580l
    /* renamed from: a */
    public final String mo115681a() {
        return this.f95096a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo115682b() {
        return this.f95097b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo115683c() {
        return this.f95098c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo115684d() {
        return this.f95099d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95096a);
        parcel.writeString(this.f95097b);
        parcel.writeString(this.f95098c);
        parcel.writeString(this.f95099d);
    }
}
