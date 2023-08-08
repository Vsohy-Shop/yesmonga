package com.usabilla.sdk.ubform.sdk.field.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseStringModel;
import org.json.JSONException;
import org.json.JSONObject;

public class ParagraphModel extends BaseStringModel {
    public static final Parcelable.Creator<ParagraphModel> CREATOR = new C9997a();

    /* renamed from: E0 */
    public static final String f27442E0 = "text";

    /* renamed from: Z */
    public static final String f27443Z = "html";

    /* renamed from: Y */
    public boolean f27444Y;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.ParagraphModel$a */
    public class C9997a implements Parcelable.Creator<ParagraphModel> {
        /* renamed from: a */
        public ParagraphModel createFromParcel(Parcel parcel) {
            return new ParagraphModel(parcel, (C9997a) null);
        }

        /* renamed from: b */
        public ParagraphModel[] newArray(int i) {
            return new ParagraphModel[i];
        }
    }

    public /* synthetic */ ParagraphModel(Parcel parcel, C9997a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public Object mo20872a() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public boolean mo20885j() {
        return true;
    }

    /* renamed from: m */
    public boolean mo20899m() {
        return true;
    }

    /* renamed from: n */
    public void mo20900n() {
        this.f27480b = false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f27444Y ? (byte) 1 : 0);
    }

    /* renamed from: x */
    public boolean mo20901x() {
        return this.f27444Y;
    }

    public ParagraphModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        if (jSONObject.has("html")) {
            this.f27444Y = jSONObject.getBoolean("html");
        }
        this.f27479a = jSONObject.optString("text");
    }

    public ParagraphModel(Parcel parcel) {
        super(parcel);
        this.f27444Y = parcel.readByte() != 0;
    }
}
