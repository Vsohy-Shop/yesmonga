package com.usabilla.sdk.ubform.sdk.field.model.common;

import android.os.Parcel;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseOptionModel<M> extends FieldModel<M> {

    /* renamed from: E0 */
    public static final String f27465E0 = "random";

    /* renamed from: F0 */
    public static final String f27466F0 = "options";

    /* renamed from: G0 */
    public static final String f27467G0 = "title";

    /* renamed from: H0 */
    public static final String f27468H0 = "value";

    /* renamed from: Y */
    public List<Option> f27469Y;

    /* renamed from: Z */
    public final boolean f27470Z;

    public BaseOptionModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        this.f27470Z = jSONObject.optBoolean(f27465E0, false);
        this.f27469Y = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("options");
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f27469Y.add(new Option(jSONArray.getJSONObject(i).getString("title"), jSONArray.getJSONObject(i).getString("value")));
            }
            if (this.f27470Z) {
                Collections.shuffle(this.f27469Y);
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.f27469Y);
        parcel.writeByte(this.f27470Z ? (byte) 1 : 0);
    }

    /* renamed from: x */
    public List<Option> mo20953x() {
        return this.f27469Y;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: y */
    public boolean mo20954y() {
        return this.f27470Z;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: z */
    public void mo20955z(List<Option> list) {
        this.f27469Y = list;
    }

    public BaseOptionModel(Parcel parcel) {
        super(parcel);
        ArrayList arrayList = new ArrayList();
        this.f27469Y = arrayList;
        parcel.readList(arrayList, Option.class.getClassLoader());
        this.f27470Z = parcel.readByte() != 0;
    }
}
