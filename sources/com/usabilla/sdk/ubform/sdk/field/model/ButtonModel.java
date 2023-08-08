package com.usabilla.sdk.ubform.sdk.field.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseStringModel;
import org.json.JSONException;
import org.json.JSONObject;

public class ButtonModel extends BaseStringModel {
    public static final Parcelable.Creator<ButtonModel> CREATOR = new C9992a();

    /* renamed from: E0 */
    public static final String f27435E0 = "title";

    /* renamed from: F0 */
    public static final String f27436F0 = "cancel";

    /* renamed from: Y */
    public String f27437Y;

    /* renamed from: Z */
    public String f27438Z;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.ButtonModel$a */
    public class C9992a implements Parcelable.Creator<ButtonModel> {
        /* renamed from: a */
        public ButtonModel createFromParcel(Parcel parcel) {
            return new ButtonModel(parcel, (C9992a) null);
        }

        /* renamed from: b */
        public ButtonModel[] newArray(int i) {
            return new ButtonModel[i];
        }
    }

    public /* synthetic */ ButtonModel(Parcel parcel, C9992a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public Object mo20872a() {
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f27437Y);
        parcel.writeString(this.f27438Z);
    }

    @C0363p0
    /* renamed from: x */
    public String mo20874x() {
        return this.f27438Z;
    }

    @C0363p0
    /* renamed from: y */
    public String mo20875y() {
        return this.f27437Y;
    }

    public ButtonModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        if (jSONObject.has("title")) {
            this.f27437Y = jSONObject.getString("title");
        }
        if (jSONObject.has("cancel")) {
            this.f27438Z = jSONObject.getString("cancel");
        }
    }

    public ButtonModel(Parcel parcel) {
        super(parcel);
        this.f27437Y = parcel.readString();
        this.f27438Z = parcel.readString();
    }
}
