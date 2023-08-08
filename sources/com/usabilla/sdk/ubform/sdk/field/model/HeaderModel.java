package com.usabilla.sdk.ubform.sdk.field.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseStringModel;
import org.json.JSONException;
import org.json.JSONObject;

public class HeaderModel extends BaseStringModel {
    public static final Parcelable.Creator<HeaderModel> CREATOR = new C9995a();

    /* renamed from: Y */
    public static final String f27441Y = "text";

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.HeaderModel$a */
    public class C9995a implements Parcelable.Creator<HeaderModel> {
        /* renamed from: a */
        public HeaderModel createFromParcel(Parcel parcel) {
            return new HeaderModel(parcel, (C9995a) null);
        }

        /* renamed from: b */
        public HeaderModel[] newArray(int i) {
            return new HeaderModel[i];
        }
    }

    public /* synthetic */ HeaderModel(Parcel parcel, C9995a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public Object mo20872a() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public boolean mo20885j() {
        return true;
    }

    public HeaderModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        if (jSONObject.has("text")) {
            this.f27479a = jSONObject.getString("text");
        }
    }

    public HeaderModel(Parcel parcel) {
        super(parcel);
    }
}
