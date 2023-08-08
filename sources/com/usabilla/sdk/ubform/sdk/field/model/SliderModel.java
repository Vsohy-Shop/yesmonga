package com.usabilla.sdk.ubform.sdk.field.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseIntegerModel;
import org.json.JSONException;
import org.json.JSONObject;

public class SliderModel extends BaseIntegerModel {
    public static final Parcelable.Creator<SliderModel> CREATOR = new C10002a();

    /* renamed from: G0 */
    public static final String f27453G0 = "scale";

    /* renamed from: H0 */
    public static final String f27454H0 = "low";

    /* renamed from: I0 */
    public static final String f27455I0 = "high";

    /* renamed from: E0 */
    public int f27456E0;

    /* renamed from: F0 */
    public boolean f27457F0;

    /* renamed from: Y */
    public String f27458Y;

    /* renamed from: Z */
    public String f27459Z;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.SliderModel$a */
    public class C10002a implements Parcelable.Creator<SliderModel> {
        /* renamed from: a */
        public SliderModel createFromParcel(Parcel parcel) {
            return new SliderModel(parcel, (C10002a) null);
        }

        /* renamed from: b */
        public SliderModel[] newArray(int i) {
            return new SliderModel[i];
        }
    }

    public /* synthetic */ SliderModel(Parcel parcel, C10002a aVar) {
        this(parcel);
    }

    /* renamed from: A */
    public boolean mo20922A() {
        return this.f27457F0;
    }

    /* renamed from: a */
    public Object mo20872a() {
        if (!mo20922A()) {
            return Integer.valueOf(((Integer) this.f27479a).intValue() + 1);
        }
        return this.f27479a;
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
        parcel.writeString(this.f27458Y);
        parcel.writeString(this.f27459Z);
        parcel.writeInt(this.f27456E0);
        parcel.writeByte(this.f27457F0 ? (byte) 1 : 0);
    }

    /* renamed from: x */
    public String mo20923x() {
        return this.f27459Z;
    }

    /* renamed from: y */
    public String mo20924y() {
        return this.f27458Y;
    }

    /* renamed from: z */
    public int mo20925z() {
        return this.f27456E0;
    }

    public SliderModel(JSONObject jSONObject, boolean z) throws JSONException {
        super(jSONObject);
        if (jSONObject.has("scale")) {
            this.f27456E0 = jSONObject.getInt("scale");
        }
        if (jSONObject.has(f27454H0)) {
            this.f27458Y = jSONObject.getString(f27454H0);
        }
        if (jSONObject.has("high")) {
            this.f27459Z = jSONObject.getString("high");
        }
        this.f27457F0 = z;
        this.f27479a = -1;
    }

    public SliderModel(Parcel parcel) {
        super(parcel);
        this.f27458Y = parcel.readString();
        this.f27459Z = parcel.readString();
        this.f27456E0 = parcel.readInt();
        this.f27457F0 = parcel.readByte() != 0;
    }
}
