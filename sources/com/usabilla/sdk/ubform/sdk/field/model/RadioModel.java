package com.usabilla.sdk.ubform.sdk.field.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionForStringModel;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/model/RadioModel;", "Lcom/usabilla/sdk/ubform/sdk/field/model/common/BaseOptionForStringModel;", "", "a", "", "describeContents", "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "I0", "b", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public class RadioModel extends BaseOptionForStringModel {
    @C12579k
    @C11287e
    public static final Parcelable.Creator<RadioModel> CREATOR = new C9999a();
    @C12579k

    /* renamed from: I0 */
    public static final C10000b f27450I0 = new C10000b((DefaultConstructorMarker) null);

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.RadioModel$a */
    public static final class C9999a implements Parcelable.Creator<RadioModel> {
        @C12579k
        /* renamed from: a */
        public RadioModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "source");
            return new RadioModel(parcel, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: b */
        public RadioModel[] newArray(int i) {
            return new RadioModel[i];
        }
    }

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.RadioModel$b */
    public static final class C10000b {
        public /* synthetic */ C10000b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C10000b() {
        }
    }

    public /* synthetic */ RadioModel(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @C12579k
    /* renamed from: a */
    public Object mo20872a() {
        boolean z;
        T t = this.f27479a;
        if (t != null) {
            Intrinsics.checkNotNullExpressionValue(t, "mValue");
            if (((CharSequence) t).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return new JSONArray(CollectionsKt__CollectionsKt.m40463r((String) this.f27479a));
            }
        }
        return new JSONArray();
    }

    public int describeContents() {
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioModel(@C12579k JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
    }

    public RadioModel(Parcel parcel) {
        super(parcel);
    }
}
