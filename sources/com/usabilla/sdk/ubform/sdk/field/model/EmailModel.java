package com.usabilla.sdk.ubform.sdk.field.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseStringModel;
import org.json.JSONException;
import org.json.JSONObject;

public class EmailModel extends BaseStringModel {
    public static final Parcelable.Creator<EmailModel> CREATOR = new C9994a();

    /* renamed from: Z */
    public static final String f27439Z = "placeholder";

    /* renamed from: Y */
    public String f27440Y;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.EmailModel$a */
    public class C9994a implements Parcelable.Creator<EmailModel> {
        /* renamed from: a */
        public EmailModel createFromParcel(Parcel parcel) {
            return new EmailModel(parcel, (C9994a) null);
        }

        /* renamed from: b */
        public EmailModel[] newArray(int i) {
            return new EmailModel[i];
        }
    }

    public /* synthetic */ EmailModel(Parcel parcel, C9994a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public boolean mo20885j() {
        T t = this.f27479a;
        return t != null && !((String) t).isEmpty() && Patterns.EMAIL_ADDRESS.matcher((CharSequence) this.f27479a).matches();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f27440Y);
    }

    /* renamed from: x */
    public String mo20886x() {
        return this.f27440Y;
    }

    public EmailModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        if (jSONObject.has("placeholder")) {
            this.f27440Y = jSONObject.getString("placeholder");
        }
    }

    public EmailModel(Parcel parcel) {
        super(parcel);
        this.f27440Y = parcel.readString();
    }
}
