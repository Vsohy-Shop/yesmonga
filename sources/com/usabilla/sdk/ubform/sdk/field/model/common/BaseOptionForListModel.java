package com.usabilla.sdk.ubform.sdk.field.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseOptionForListModel extends BaseOptionModel<List<String>> {
    public static final Parcelable.Creator<BaseOptionForListModel> CREATOR = new C10006a();

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionForListModel$a */
    public class C10006a implements Parcelable.Creator<BaseOptionForListModel> {
        /* renamed from: a */
        public BaseOptionForListModel createFromParcel(Parcel parcel) {
            return new BaseOptionForListModel(parcel);
        }

        /* renamed from: b */
        public BaseOptionForListModel[] newArray(int i) {
            return new BaseOptionForListModel[i];
        }
    }

    public BaseOptionForListModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        this.f27479a = new ArrayList();
    }

    /* renamed from: a */
    public Object mo20872a() {
        return new JSONArray((Collection) this.f27479a);
    }

    /* renamed from: b */
    public List<String> mo20916b() {
        return (List) this.f27479a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public boolean mo20885j() {
        T t = this.f27479a;
        return t != null && !((List) t).isEmpty();
    }

    /* renamed from: n */
    public void mo20900n() {
        this.f27479a = new ArrayList();
        this.f27480b = false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList((List) this.f27479a);
    }

    public BaseOptionForListModel(Parcel parcel) {
        super(parcel);
        T arrayList = new ArrayList();
        this.f27479a = arrayList;
        parcel.readList((List) arrayList, LinkedList.class.getClassLoader());
    }
}
