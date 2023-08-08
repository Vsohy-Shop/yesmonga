package com.usabilla.sdk.ubform.sdk.field.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionForIntegerModel;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PickerModel extends BaseOptionForIntegerModel {
    public static final Parcelable.Creator<PickerModel> CREATOR = new C9998a();

    /* renamed from: K0 */
    public static final String f27445K0 = "Select";

    /* renamed from: L0 */
    public static final String f27446L0 = "default";

    /* renamed from: M0 */
    public static final String f27447M0 = "empty";

    /* renamed from: I0 */
    public String f27448I0;

    /* renamed from: J0 */
    public String f27449J0;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.PickerModel$a */
    public class C9998a implements Parcelable.Creator<PickerModel> {
        /* renamed from: a */
        public PickerModel createFromParcel(Parcel parcel) {
            return new PickerModel(parcel, (C9998a) null);
        }

        /* renamed from: b */
        public PickerModel[] newArray(int i) {
            return new PickerModel[i];
        }
    }

    public /* synthetic */ PickerModel(Parcel parcel, C9998a aVar) {
        this(parcel);
    }

    /* renamed from: A */
    public String mo20906A() {
        return this.f27448I0;
    }

    /* renamed from: B */
    public String mo20907B() {
        String str = this.f27449J0;
        return str == null ? f27445K0 : str;
    }

    /* renamed from: a */
    public Object mo20872a() {
        ArrayList arrayList = new ArrayList();
        if (((Integer) this.f27479a).intValue() == 0) {
            arrayList.add(this.f27448I0);
            return new JSONArray(arrayList);
        }
        arrayList.add(mo20953x().get(((Integer) this.f27479a).intValue() - 1).mo21006b());
        return new JSONArray(arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f27448I0);
        parcel.writeString(this.f27449J0);
    }

    public PickerModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        if (jSONObject.has("default")) {
            this.f27448I0 = jSONObject.getString("default");
        }
        if (jSONObject.has(f27447M0)) {
            this.f27449J0 = jSONObject.getString(f27447M0);
        }
    }

    public PickerModel(Parcel parcel) {
        super(parcel);
        this.f27448I0 = parcel.readString();
        this.f27449J0 = parcel.readString();
    }
}
