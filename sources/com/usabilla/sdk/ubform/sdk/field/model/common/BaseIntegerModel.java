package com.usabilla.sdk.ubform.sdk.field.model.common;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseIntegerModel extends FieldModel<Integer> {
    public BaseIntegerModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        this.f27479a = -1;
    }

    /* renamed from: a */
    public Object mo20872a() {
        return this.f27479a;
    }

    /* renamed from: b */
    public List<String> mo20916b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(this.f27479a));
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: n */
    public void mo20900n() {
        this.f27479a = -1;
        this.f27480b = false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(((Integer) this.f27479a).intValue());
    }

    public BaseIntegerModel(Parcel parcel) {
        super(parcel);
        this.f27479a = Integer.valueOf(parcel.readInt());
    }
}
