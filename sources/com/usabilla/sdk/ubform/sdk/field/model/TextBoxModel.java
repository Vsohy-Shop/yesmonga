package com.usabilla.sdk.ubform.sdk.field.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseStringModel;
import com.usabilla.sdk.ubform.sdk.field.model.common.MaskModel;
import com.usabilla.sdk.ubform.utils.ext.ExtensionJsonKt;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\u0005B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\""}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/model/TextBoxModel;", "Lcom/usabilla/sdk/ubform/sdk/field/model/common/BaseStringModel;", "Lkotlin/d2;", "n", "", "a", "Landroid/os/Parcel;", "parcel", "", "flags", "writeToParcel", "describeContents", "other", "", "equals", "hashCode", "", "Y", "Ljava/lang/String;", "x", "()Ljava/lang/String;", "placeholder", "Z", "defaultValue", "Lcom/usabilla/sdk/ubform/sdk/field/model/common/MaskModel;", "E0", "Lcom/usabilla/sdk/ubform/sdk/field/model/common/MaskModel;", "maskModel", "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lorg/json/JSONObject;Lcom/usabilla/sdk/ubform/sdk/field/model/common/MaskModel;)V", "(Landroid/os/Parcel;)V", "CREATOR", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class TextBoxModel extends BaseStringModel {
    @C12579k
    public static final C10004a CREATOR = new C10004a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: F0 */
    public static final String f27460F0 = "default";
    @C12579k

    /* renamed from: G0 */
    public static final String f27461G0 = "placeholder";
    @C12579k

    /* renamed from: E0 */
    public final MaskModel f27462E0;
    @C12579k

    /* renamed from: Y */
    public final String f27463Y;
    @C12579k

    /* renamed from: Z */
    public final String f27464Z;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.TextBoxModel$a */
    public static final class C10004a implements Parcelable.Creator<TextBoxModel> {
        public /* synthetic */ C10004a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public TextBoxModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextBoxModel(parcel);
        }

        @C12579k
        /* renamed from: b */
        public TextBoxModel[] newArray(int i) {
            return new TextBoxModel[i];
        }

        public C10004a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextBoxModel(JSONObject jSONObject, MaskModel maskModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i & 2) != 0 ? new MaskModel((List) null, 0, 3, (DefaultConstructorMarker) null) : maskModel);
    }

    @C12579k
    /* renamed from: a */
    public Object mo20872a() {
        MaskModel maskModel = this.f27462E0;
        T t = this.f27479a;
        Intrinsics.checkNotNullExpressionValue(t, "mValue");
        return maskModel.mo20995g((String) t);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<TextBoxModel> cls2 = TextBoxModel.class;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!Intrinsics.areEqual((Object) cls2, (Object) cls)) {
            return false;
        }
        if (obj != null) {
            TextBoxModel textBoxModel = (TextBoxModel) obj;
            if (Intrinsics.areEqual((Object) this.f27463Y, (Object) textBoxModel.f27463Y) && Intrinsics.areEqual((Object) this.f27464Z, (Object) textBoxModel.f27464Z) && Intrinsics.areEqual((Object) this.f27462E0, (Object) textBoxModel.f27462E0)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.usabilla.sdk.ubform.sdk.field.model.TextBoxModel");
    }

    public int hashCode() {
        return (((this.f27463Y.hashCode() * 31) + this.f27464Z.hashCode()) * 31) + this.f27462E0.hashCode();
    }

    /* renamed from: n */
    public void mo20900n() {
        this.f27479a = this.f27464Z;
        this.f27480b = false;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f27463Y);
        parcel.writeString(this.f27464Z);
        parcel.writeParcelable(this.f27462E0, i);
    }

    @C12579k
    /* renamed from: x */
    public final String mo20936x() {
        return this.f27463Y;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextBoxModel(@C12579k JSONObject jSONObject, @C12579k MaskModel maskModel) {
        super(jSONObject);
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        Intrinsics.checkNotNullParameter(maskModel, "maskModel");
        String c = ExtensionJsonKt.m38314c(jSONObject, "placeholder");
        String str = "";
        this.f27463Y = c == null ? str : c;
        String c2 = ExtensionJsonKt.m38314c(jSONObject, "default");
        this.f27464Z = c2 != null ? c2 : str;
        this.f27462E0 = maskModel;
        mo20900n();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextBoxModel(@C12579k Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        String str = "";
        this.f27463Y = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.f27464Z = readString2 != null ? readString2 : str;
        Parcelable readParcelable = parcel.readParcelable(MaskModel.class.getClassLoader());
        Intrinsics.checkNotNull(readParcelable);
        Intrinsics.checkNotNullExpressionValue(readParcelable, "parcel.readParcelable(MaskModel::class.java.classLoader)!!");
        this.f27462E0 = (MaskModel) readParcelable;
    }
}
