package com.usabilla.sdk.ubform.sdk.field.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionForListModel;
import org.json.JSONException;
import org.json.JSONObject;

public class CheckboxModel extends BaseOptionForListModel {
    public static final Parcelable.Creator<CheckboxModel> CREATOR = new C9993a();

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.CheckboxModel$a */
    public class C9993a implements Parcelable.Creator<CheckboxModel> {
        /* renamed from: a */
        public CheckboxModel createFromParcel(Parcel parcel) {
            return new CheckboxModel(parcel, (C9993a) null);
        }

        /* renamed from: b */
        public CheckboxModel[] newArray(int i) {
            return new CheckboxModel[i];
        }
    }

    public /* synthetic */ CheckboxModel(Parcel parcel, C9993a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public CheckboxModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
    }

    public CheckboxModel(Parcel parcel) {
        super(parcel);
    }
}
