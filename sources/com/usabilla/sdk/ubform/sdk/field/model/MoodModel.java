package com.usabilla.sdk.ubform.sdk.field.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionForIntegerModel;
import org.json.JSONException;
import org.json.JSONObject;

public class MoodModel extends BaseOptionForIntegerModel {
    public static final Parcelable.Creator<MoodModel> CREATOR = new C9996a();

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.MoodModel$a */
    public class C9996a implements Parcelable.Creator<MoodModel> {
        /* renamed from: a */
        public MoodModel createFromParcel(Parcel parcel) {
            return new MoodModel(parcel, (C9996a) null);
        }

        /* renamed from: b */
        public MoodModel[] newArray(int i) {
            return new MoodModel[i];
        }
    }

    public /* synthetic */ MoodModel(Parcel parcel, C9996a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public MoodModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
    }

    public MoodModel(Parcel parcel) {
        super(parcel);
    }
}
