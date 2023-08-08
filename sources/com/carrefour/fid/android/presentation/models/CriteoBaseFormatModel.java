package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.CriteoFormatRenderingDomain;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\u0010\u001c\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010#\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010$\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010*\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005HÖ\u0001R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u001c\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u0016\u0010!R\u001c\u0010$\u001a\u0004\u0018\u00010\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001e\u0010!R\"\u0010*\u001a\u00020\u00058\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/CriteoBaseFormatModel;", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "Landroid/os/Parcelable;", "", "id", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "Lcom/carrefour/fid/android/presentation/models/CriteoProductModel;", "a", "Ljava/util/List;", "()Ljava/util/List;", "g", "(Ljava/util/List;)V", "criteoProducts", "Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;", "Lcom/carrefour/fid/android/presentation/models/CriteoFormatRenderingModel;", "b", "Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;", "e", "()Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;", "h", "(Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;)V", "rendering", "", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "onViewBeacon", "onClickBeacon", "onFileClickBeacon", "f", "I", "()I", "i", "(I)V", "selectedProductPosition", "<init>", "(Ljava/util/List;Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public class CriteoBaseFormatModel implements OfferModel, Parcelable {
    @C12579k
    public static final Parcelable.Creator<CriteoBaseFormatModel> CREATOR = new C38421a();

    /* renamed from: g */
    public static final int f97348g = 8;
    @C12579k

    /* renamed from: a */
    public List<CriteoProductModel> f97349a;
    @C12580l

    /* renamed from: b */
    public CriteoFormatRenderingDomain f97350b;
    @C12580l

    /* renamed from: c */
    public final String f97351c;
    @C12580l

    /* renamed from: d */
    public final String f97352d;
    @C12580l

    /* renamed from: e */
    public final String f97353e;

    /* renamed from: f */
    public int f97354f;

    /* renamed from: com.carrefour.fid.android.presentation.models.CriteoBaseFormatModel$a */
    public static final class C38421a implements Parcelable.Creator<CriteoBaseFormatModel> {
        @C12579k
        /* renamed from: a */
        public final CriteoBaseFormatModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CriteoProductModel.CREATOR.createFromParcel(parcel));
            }
            return new CriteoBaseFormatModel(arrayList, parcel.readInt() == 0 ? null : CriteoFormatRenderingDomain.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public final CriteoBaseFormatModel[] newArray(int i) {
            return new CriteoBaseFormatModel[i];
        }
    }

    public CriteoBaseFormatModel(@C12579k List<CriteoProductModel> list, @C12580l CriteoFormatRenderingDomain criteoFormatRenderingDomain, @C12580l String str, @C12580l String str2, @C12580l String str3, int i) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        this.f97349a = list;
        this.f97350b = criteoFormatRenderingDomain;
        this.f97351c = str;
        this.f97352d = str2;
        this.f97353e = str3;
        this.f97354f = i;
    }

    @C12579k
    /* renamed from: a */
    public List<CriteoProductModel> mo121461a() {
        return this.f97349a;
    }

    @C12580l
    /* renamed from: b */
    public String mo121462b() {
        return this.f97352d;
    }

    @C12580l
    /* renamed from: c */
    public String mo121463c() {
        return this.f97353e;
    }

    @C12580l
    /* renamed from: d */
    public String mo121464d() {
        return this.f97351c;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public CriteoFormatRenderingDomain mo121466e() {
        return this.f97350b;
    }

    /* renamed from: f */
    public int mo121467f() {
        return this.f97354f;
    }

    /* renamed from: g */
    public void mo121468g(@C12579k List<CriteoProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f97349a = list;
    }

    /* renamed from: h */
    public void mo121469h(@C12580l CriteoFormatRenderingDomain criteoFormatRenderingDomain) {
        this.f97350b = criteoFormatRenderingDomain;
    }

    /* renamed from: i */
    public void mo121470i(int i) {
        this.f97354f = i;
    }

    /* renamed from: id */
    public long mo121471id() {
        return (long) hashCode();
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<CriteoProductModel> list = this.f97349a;
        parcel.writeInt(list.size());
        for (CriteoProductModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        CriteoFormatRenderingDomain criteoFormatRenderingDomain = this.f97350b;
        if (criteoFormatRenderingDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            criteoFormatRenderingDomain.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f97351c);
        parcel.writeString(this.f97352d);
        parcel.writeString(this.f97353e);
        parcel.writeInt(this.f97354f);
    }
}
