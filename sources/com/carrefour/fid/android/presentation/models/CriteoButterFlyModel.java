package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.carrefour.fid.android.domain.models.CriteoFormatRenderingDomain;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u0012\u000e\u0010\"\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u00104\u001a\u00020\u0005¢\u0006\u0004\b5\u00106J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0019\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005HÖ\u0001R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013R*\u0010\"\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010'\u001a\u0004\u0018\u00010\u00158\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\u00158\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u001c\u0010-\u001a\u0004\u0018\u00010\u00158\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\"\u00104\u001a\u00020\u00058\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00067"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/CriteoButterFlyModel;", "Lcom/carrefour/fid/android/presentation/models/CriteoBaseFormatModel;", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/a;", "Lcom/carrefour/fid/android/design/components/widgets/productcard/b$a;", "typeFactory", "", "getType", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "Lcom/carrefour/fid/android/presentation/models/CriteoProductModel;", "v", "Ljava/util/List;", "a", "()Ljava/util/List;", "g", "(Ljava/util/List;)V", "criteoProducts", "", "w", "j", "k", "buttonsNames", "Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;", "Lcom/carrefour/fid/android/presentation/models/CriteoFormatRenderingModel;", "x", "Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;", "e", "()Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;", "h", "(Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;)V", "rendering", "y", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "onViewBeacon", "z", "b", "onClickBeacon", "X", "c", "onFileClickBeacon", "Y", "I", "f", "()I", "i", "(I)V", "selectedProductPosition", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CriteoButterFlyModel extends CriteoBaseFormatModel implements C37369a {
    @C12579k
    public static final Parcelable.Creator<CriteoButterFlyModel> CREATOR = new C38422a();

    /* renamed from: Z */
    public static final int f97355Z = 8;
    @C12580l

    /* renamed from: X */
    public final String f97356X;

    /* renamed from: Y */
    public int f97357Y;
    @C12579k

    /* renamed from: v */
    public List<CriteoProductModel> f97358v;
    @C12579k

    /* renamed from: w */
    public List<String> f97359w;
    @C12580l

    /* renamed from: x */
    public CriteoFormatRenderingDomain f97360x;
    @C12580l

    /* renamed from: y */
    public final String f97361y;
    @C12580l

    /* renamed from: z */
    public final String f97362z;

    /* renamed from: com.carrefour.fid.android.presentation.models.CriteoButterFlyModel$a */
    public static final class C38422a implements Parcelable.Creator<CriteoButterFlyModel> {
        @C12579k
        /* renamed from: a */
        public final CriteoButterFlyModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CriteoProductModel.CREATOR.createFromParcel(parcel));
            }
            return new CriteoButterFlyModel(arrayList, parcel.createStringArrayList(), parcel.readInt() == 0 ? null : CriteoFormatRenderingDomain.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public final CriteoButterFlyModel[] newArray(int i) {
            return new CriteoButterFlyModel[i];
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CriteoButterFlyModel(List list, List list2, CriteoFormatRenderingDomain criteoFormatRenderingDomain, String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, criteoFormatRenderingDomain, str, str2, str3, (i2 & 64) != 0 ? 0 : i);
    }

    @C12579k
    /* renamed from: a */
    public List<CriteoProductModel> mo121461a() {
        return this.f97358v;
    }

    @C12580l
    /* renamed from: b */
    public String mo121462b() {
        return this.f97362z;
    }

    @C12580l
    /* renamed from: c */
    public String mo121463c() {
        return this.f97356X;
    }

    @C12580l
    /* renamed from: d */
    public String mo121464d() {
        return this.f97361y;
    }

    @C12580l
    /* renamed from: e */
    public CriteoFormatRenderingDomain mo121466e() {
        return this.f97360x;
    }

    /* renamed from: f */
    public int mo121467f() {
        return this.f97357Y;
    }

    /* renamed from: g */
    public void mo121468g(@C12579k List<CriteoProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f97358v = list;
    }

    public int getType(@C12579k C37353b.C37354a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "typeFactory");
        return 4;
    }

    /* renamed from: h */
    public void mo121469h(@C12580l CriteoFormatRenderingDomain criteoFormatRenderingDomain) {
        this.f97360x = criteoFormatRenderingDomain;
    }

    /* renamed from: i */
    public void mo121470i(int i) {
        this.f97357Y = i;
    }

    @C12579k
    /* renamed from: j */
    public final List<String> mo121477j() {
        return this.f97359w;
    }

    /* renamed from: k */
    public final void mo121478k(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f97359w = list;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<CriteoProductModel> list = this.f97358v;
        parcel.writeInt(list.size());
        for (CriteoProductModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.f97359w);
        CriteoFormatRenderingDomain criteoFormatRenderingDomain = this.f97360x;
        if (criteoFormatRenderingDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            criteoFormatRenderingDomain.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f97361y);
        parcel.writeString(this.f97362z);
        parcel.writeString(this.f97356X);
        parcel.writeInt(this.f97357Y);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoButterFlyModel(@C12579k List<CriteoProductModel> list, @C12579k List<String> list2, @C12580l CriteoFormatRenderingDomain criteoFormatRenderingDomain, @C12580l String str, @C12580l String str2, @C12580l String str3, int i) {
        super(list, criteoFormatRenderingDomain, str, str2, str3, i);
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "buttonsNames");
        this.f97358v = list;
        this.f97359w = list2;
        this.f97360x = criteoFormatRenderingDomain;
        this.f97361y = str;
        this.f97362z = str2;
        this.f97356X = str3;
        this.f97357Y = i;
    }
}
