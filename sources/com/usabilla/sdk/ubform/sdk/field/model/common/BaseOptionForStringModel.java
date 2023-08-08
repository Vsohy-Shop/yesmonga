package com.usabilla.sdk.ubform.sdk.field.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseOptionForStringModel extends BaseOptionModel<String> {
    public static final Parcelable.Creator<BaseOptionForStringModel> CREATOR = new C10007a();

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionForStringModel$a */
    public class C10007a implements Parcelable.Creator<BaseOptionForStringModel> {
        /* renamed from: a */
        public BaseOptionForStringModel createFromParcel(Parcel parcel) {
            return new BaseOptionForStringModel(parcel);
        }

        /* renamed from: b */
        public BaseOptionForStringModel[] newArray(int i) {
            return new BaseOptionForStringModel[i];
        }
    }

    public BaseOptionForStringModel(JSONObject jSONObject) throws JSONException {
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
        return !TextUtils.isEmpty((CharSequence) this.f27479a);
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

    public BaseOptionForStringModel(Parcel parcel) {
        super(parcel);
        this.f27479a = parcel.readString();
    }
}
