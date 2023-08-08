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

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0011\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003JY\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0017\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0019\u001a\u00020\rHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\u0019\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0005HÖ\u0001R(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010\u0013\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0016X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0016X\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0016X\u0004¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\"\u0010\u0017\u001a\u00020\u00058\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006@"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/CriteoFlagshipModel;", "Lcom/carrefour/fid/android/presentation/models/CriteoBaseFormatModel;", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/a;", "Lcom/carrefour/fid/android/design/components/widgets/productcard/b$a;", "typeFactory", "", "getType", "", "Lcom/carrefour/fid/android/presentation/models/CriteoProductModel;", "j", "Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;", "Lcom/carrefour/fid/android/presentation/models/CriteoFormatRenderingModel;", "k", "", "l", "m", "n", "o", "criteoProducts", "rendering", "onViewBeacon", "onClickBeacon", "onFileClickBeacon", "selectedProductPosition", "p", "toString", "hashCode", "", "other", "", "equals", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "v", "Ljava/util/List;", "a", "()Ljava/util/List;", "g", "(Ljava/util/List;)V", "w", "Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;", "e", "()Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;", "h", "(Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;)V", "x", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "y", "b", "z", "c", "X", "I", "f", "()I", "i", "(I)V", "<init>", "(Ljava/util/List;Lcom/carrefour/fid/android/domain/models/CriteoFormatRenderingDomain;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CriteoFlagshipModel extends CriteoBaseFormatModel implements C37369a {
    @C12579k
    public static final Parcelable.Creator<CriteoFlagshipModel> CREATOR = new C38423a();

    /* renamed from: Y */
    public static final int f97363Y = 8;

    /* renamed from: X */
    public int f97364X;
    @C12579k

    /* renamed from: v */
    public List<CriteoProductModel> f97365v;
    @C12580l

    /* renamed from: w */
    public CriteoFormatRenderingDomain f97366w;
    @C12580l

    /* renamed from: x */
    public final String f97367x;
    @C12580l

    /* renamed from: y */
    public final String f97368y;
    @C12580l

    /* renamed from: z */
    public final String f97369z;

    /* renamed from: com.carrefour.fid.android.presentation.models.CriteoFlagshipModel$a */
    public static final class C38423a implements Parcelable.Creator<CriteoFlagshipModel> {
        @C12579k
        /* renamed from: a */
        public final CriteoFlagshipModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CriteoProductModel.CREATOR.createFromParcel(parcel));
            }
            return new CriteoFlagshipModel(arrayList, parcel.readInt() == 0 ? null : CriteoFormatRenderingDomain.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public final CriteoFlagshipModel[] newArray(int i) {
            return new CriteoFlagshipModel[i];
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CriteoFlagshipModel(List list, CriteoFormatRenderingDomain criteoFormatRenderingDomain, String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, criteoFormatRenderingDomain, str, str2, str3, (i2 & 32) != 0 ? 0 : i);
    }

    /* renamed from: q */
    public static /* synthetic */ CriteoFlagshipModel m159112q(CriteoFlagshipModel criteoFlagshipModel, List<CriteoProductModel> list, CriteoFormatRenderingDomain criteoFormatRenderingDomain, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = criteoFlagshipModel.f97365v;
        }
        if ((i2 & 2) != 0) {
            criteoFormatRenderingDomain = criteoFlagshipModel.f97366w;
        }
        CriteoFormatRenderingDomain criteoFormatRenderingDomain2 = criteoFormatRenderingDomain;
        if ((i2 & 4) != 0) {
            str = criteoFlagshipModel.f97367x;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = criteoFlagshipModel.f97368y;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = criteoFlagshipModel.f97369z;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            i = criteoFlagshipModel.f97364X;
        }
        return criteoFlagshipModel.mo121491p(list, criteoFormatRenderingDomain2, str4, str5, str6, i);
    }

    @C12579k
    /* renamed from: a */
    public List<CriteoProductModel> mo121461a() {
        return this.f97365v;
    }

    @C12580l
    /* renamed from: b */
    public String mo121462b() {
        return this.f97368y;
    }

    @C12580l
    /* renamed from: c */
    public String mo121463c() {
        return this.f97369z;
    }

    @C12580l
    /* renamed from: d */
    public String mo121464d() {
        return this.f97367x;
    }

    @C12580l
    /* renamed from: e */
    public CriteoFormatRenderingDomain mo121466e() {
        return this.f97366w;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CriteoFlagshipModel)) {
            return false;
        }
        CriteoFlagshipModel criteoFlagshipModel = (CriteoFlagshipModel) obj;
        return Intrinsics.areEqual((Object) this.f97365v, (Object) criteoFlagshipModel.f97365v) && Intrinsics.areEqual((Object) this.f97366w, (Object) criteoFlagshipModel.f97366w) && Intrinsics.areEqual((Object) this.f97367x, (Object) criteoFlagshipModel.f97367x) && Intrinsics.areEqual((Object) this.f97368y, (Object) criteoFlagshipModel.f97368y) && Intrinsics.areEqual((Object) this.f97369z, (Object) criteoFlagshipModel.f97369z) && this.f97364X == criteoFlagshipModel.f97364X;
    }

    /* renamed from: f */
    public int mo121467f() {
        return this.f97364X;
    }

    /* renamed from: g */
    public void mo121468g(@C12579k List<CriteoProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f97365v = list;
    }

    public int getType(@C12579k C37353b.C37354a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "typeFactory");
        return 6;
    }

    /* renamed from: h */
    public void mo121469h(@C12580l CriteoFormatRenderingDomain criteoFormatRenderingDomain) {
        this.f97366w = criteoFormatRenderingDomain;
    }

    public int hashCode() {
        int hashCode = this.f97365v.hashCode() * 31;
        CriteoFormatRenderingDomain criteoFormatRenderingDomain = this.f97366w;
        int i = 0;
        int hashCode2 = (hashCode + (criteoFormatRenderingDomain == null ? 0 : criteoFormatRenderingDomain.hashCode())) * 31;
        String str = this.f97367x;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97368y;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97369z;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode4 + i) * 31) + Integer.hashCode(this.f97364X);
    }

    /* renamed from: i */
    public void mo121470i(int i) {
        this.f97364X = i;
    }

    @C12579k
    /* renamed from: j */
    public final List<CriteoProductModel> mo121485j() {
        return this.f97365v;
    }

    @C12580l
    /* renamed from: k */
    public final CriteoFormatRenderingDomain mo121486k() {
        return this.f97366w;
    }

    @C12580l
    /* renamed from: l */
    public final String mo121487l() {
        return this.f97367x;
    }

    @C12580l
    /* renamed from: m */
    public final String mo121488m() {
        return this.f97368y;
    }

    @C12580l
    /* renamed from: n */
    public final String mo121489n() {
        return this.f97369z;
    }

    /* renamed from: o */
    public final int mo121490o() {
        return this.f97364X;
    }

    @C12579k
    /* renamed from: p */
    public final CriteoFlagshipModel mo121491p(@C12579k List<CriteoProductModel> list, @C12580l CriteoFormatRenderingDomain criteoFormatRenderingDomain, @C12580l String str, @C12580l String str2, @C12580l String str3, int i) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        return new CriteoFlagshipModel(list, criteoFormatRenderingDomain, str, str2, str3, i);
    }

    @C12579k
    public String toString() {
        List<CriteoProductModel> list = this.f97365v;
        CriteoFormatRenderingDomain criteoFormatRenderingDomain = this.f97366w;
        String str = this.f97367x;
        String str2 = this.f97368y;
        String str3 = this.f97369z;
        int i = this.f97364X;
        return "CriteoFlagshipModel(criteoProducts=" + list + ", rendering=" + criteoFormatRenderingDomain + ", onViewBeacon=" + str + ", onClickBeacon=" + str2 + ", onFileClickBeacon=" + str3 + ", selectedProductPosition=" + i + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<CriteoProductModel> list = this.f97365v;
        parcel.writeInt(list.size());
        for (CriteoProductModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        CriteoFormatRenderingDomain criteoFormatRenderingDomain = this.f97366w;
        if (criteoFormatRenderingDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            criteoFormatRenderingDomain.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f97367x);
        parcel.writeString(this.f97368y);
        parcel.writeString(this.f97369z);
        parcel.writeInt(this.f97364X);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoFlagshipModel(@C12579k List<CriteoProductModel> list, @C12580l CriteoFormatRenderingDomain criteoFormatRenderingDomain, @C12580l String str, @C12580l String str2, @C12580l String str3, int i) {
        super(list, criteoFormatRenderingDomain, str, str2, str3, i);
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        this.f97365v = list;
        this.f97366w = criteoFormatRenderingDomain;
        this.f97367x = str;
        this.f97368y = str2;
        this.f97369z = str3;
        this.f97364X = i;
    }
}
