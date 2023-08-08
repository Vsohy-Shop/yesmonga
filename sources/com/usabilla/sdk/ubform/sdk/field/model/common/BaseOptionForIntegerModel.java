package com.usabilla.sdk.ubform.sdk.field.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseOptionForIntegerModel extends BaseOptionModel<Integer> {
    public static final Parcelable.Creator<BaseOptionForIntegerModel> CREATOR = new C10005a();

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionForIntegerModel$a */
    public class C10005a implements Parcelable.Creator<BaseOptionForIntegerModel> {
        /* renamed from: a */
        public BaseOptionForIntegerModel createFromParcel(Parcel parcel) {
            return new BaseOptionForIntegerModel(parcel);
        }

        /* renamed from: b */
        public BaseOptionForIntegerModel[] newArray(int i) {
            return new BaseOptionForIntegerModel[i];
        }
    }

    public BaseOptionForIntegerModel(JSONObject jSONObject) throws JSONException {
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

    /* renamed from: j */
    public boolean mo20885j() {
        T t = this.f27479a;
        return t != null && ((Integer) t).intValue() >= 0;
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

    public BaseOptionForIntegerModel(Parcel parcel) {
        super(parcel);
        this.f27479a = Integer.valueOf(parcel.readInt());
    }
}
