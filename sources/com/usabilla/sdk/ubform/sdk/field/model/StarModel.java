package com.usabilla.sdk.ubform.sdk.field.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseIntegerModel;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldType;
import org.json.JSONException;
import org.json.JSONObject;

public class StarModel extends BaseIntegerModel {
    public static final Parcelable.Creator<StarModel> CREATOR = new C10003a();

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.StarModel$a */
    public class C10003a implements Parcelable.Creator<StarModel> {
        /* renamed from: a */
        public StarModel createFromParcel(Parcel parcel) {
            return new StarModel(parcel, (C10003a) null);
        }

        /* renamed from: b */
        public StarModel[] newArray(int i) {
            return new StarModel[i];
        }
    }

    public /* synthetic */ StarModel(Parcel parcel, C10003a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public boolean mo20885j() {
        return ((Integer) this.f27479a).intValue() > -1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(((Integer) this.f27479a).intValue());
    }

    public StarModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        mo20982p(FieldType.STAR);
        this.f27479a = -1;
    }

    public StarModel(Parcel parcel) {
        super(parcel);
        this.f27479a = Integer.valueOf(parcel.readInt());
    }
}
