package com.usabilla.sdk.ubform.sdk.field.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.Logger;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0019B!\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J#\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÂ\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/model/common/MaskModel;", "Landroid/os/Parcelable;", "", "text", "g", "", "masks", "", "maskCharacter", "e", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "c", "d", "a", "Ljava/util/List;", "b", "C", "<init>", "(Ljava/util/List;C)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@C12187d
public final class MaskModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<MaskModel> CREATOR = new C10010b();
    @C12579k

    /* renamed from: c */
    public static final C10009a f27488c = new C10009a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public static final String f27489d = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+";

    /* renamed from: e */
    public static final char f27490e = 'X';
    @C12579k

    /* renamed from: f */
    public static final List<String> f27491f = CollectionsKt__CollectionsKt.m40448L("[0-9]{4,}", f27489d);
    @C12579k

    /* renamed from: a */
    public final List<String> f27492a;

    /* renamed from: b */
    public final char f27493b;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.common.MaskModel$a */
    public static final class C10009a {
        public /* synthetic */ C10009a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final List<String> mo20999a() {
            return MaskModel.f27491f;
        }

        public C10009a() {
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.common.MaskModel$b */
    public static final class C10010b implements Parcelable.Creator<MaskModel> {
        @C12579k
        /* renamed from: a */
        public final MaskModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MaskModel(parcel.createStringArrayList(), (char) parcel.readInt());
        }

        @C12579k
        /* renamed from: b */
        public final MaskModel[] newArray(int i) {
            return new MaskModel[i];
        }
    }

    public MaskModel() {
        this((List) null, 0, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ MaskModel m37697f(MaskModel maskModel, List<String> list, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            list = maskModel.f27492a;
        }
        if ((i & 2) != 0) {
            c = maskModel.f27493b;
        }
        return maskModel.mo20993e(list, c);
    }

    /* renamed from: c */
    public final List<String> mo20990c() {
        return this.f27492a;
    }

    /* renamed from: d */
    public final char mo20991d() {
        return this.f27493b;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final MaskModel mo20993e(@C12579k List<String> list, char c) {
        Intrinsics.checkNotNullParameter(list, C10108c.f27786K);
        return new MaskModel(list, c);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskModel)) {
            return false;
        }
        MaskModel maskModel = (MaskModel) obj;
        return Intrinsics.areEqual((Object) this.f27492a, (Object) maskModel.f27492a) && this.f27493b == maskModel.f27493b;
    }

    @C12579k
    /* renamed from: g */
    public final String mo20995g(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        for (String str2 : this.f27492a) {
            try {
                str = new Regex(str2).mo23337n(str, new MaskModel$maskText$1$1(this));
            } catch (PatternSyntaxException unused) {
                Logger.Companion companion = Logger.f26647a;
                companion.logInfo("MaskingError: Invalid Regex \"" + str2 + "\". Skipping regex.");
            }
        }
        return str;
    }

    public int hashCode() {
        return (this.f27492a.hashCode() * 31) + Character.hashCode(this.f27493b);
    }

    @C12579k
    public String toString() {
        return "MaskModel(masks=" + this.f27492a + ", maskCharacter=" + this.f27493b + ')';
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeStringList(this.f27492a);
        parcel.writeInt(this.f27493b);
    }

    public MaskModel(@C12579k List<String> list, char c) {
        Intrinsics.checkNotNullParameter(list, C10108c.f27786K);
        this.f27492a = list;
        this.f27493b = c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MaskModel(List list, char c, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 2) != 0 ? f27490e : c);
    }
}
