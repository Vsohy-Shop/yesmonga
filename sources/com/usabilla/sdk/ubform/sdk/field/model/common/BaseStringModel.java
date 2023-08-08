package com.usabilla.sdk.ubform.sdk.field.model.common;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseStringModel extends FieldModel<String> {
    public BaseStringModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        this.f27479a = "";
    }

    /* renamed from: a */
    public Object mo20872a() {
        return this.f27479a;
    }

    /* renamed from: b */
    public List<String> mo20916b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add((String) this.f27479a);
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public boolean mo20885j() {
        return !((String) this.f27479a).isEmpty();
    }

    /* renamed from: n */
    public void mo20900n() {
        this.f27479a = "";
        this.f27480b = false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString((String) this.f27479a);
    }

    public BaseStringModel(Parcel parcel) {
        super(parcel);
        this.f27479a = parcel.readString();
    }
}
