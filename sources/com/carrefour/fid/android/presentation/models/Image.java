package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/Image;", "Landroid/os/Parcelable;", "", "a", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "imagePatternId", "b", "damId", "c", "imageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class Image implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Image> CREATOR = new C38432a();

    /* renamed from: d */
    public static final int f97429d = 0;
    @C12579k

    /* renamed from: a */
    public final String f97430a;
    @C12579k

    /* renamed from: b */
    public final String f97431b;
    @C12579k

    /* renamed from: c */
    public final String f97432c;

    /* renamed from: com.carrefour.fid.android.presentation.models.Image$a */
    public static final class C38432a implements Parcelable.Creator<Image> {
        @C12579k
        /* renamed from: a */
        public final Image createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Image(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final Image[] newArray(int i) {
            return new Image[i];
        }
    }

    public Image() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: a */
    public final String mo121644a() {
        String str = this.f97430a;
        String str2 = this.f97431b;
        String str3 = this.f97432c;
        return str + "/" + str2 + "/" + str3;
    }

    @C12579k
    /* renamed from: b */
    public final String mo121645b() {
        return this.f97431b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo121646c() {
        return this.f97432c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo121647d() {
        return this.f97430a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f97430a);
        parcel.writeString(this.f97431b);
        parcel.writeString(this.f97432c);
    }

    public Image(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "imagePatternId");
        Intrinsics.checkNotNullParameter(str2, "damId");
        Intrinsics.checkNotNullParameter(str3, "imageName");
        this.f97430a = str;
        this.f97431b = str2;
        this.f97432c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Image(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? new String() : str3);
    }
}
