package com.usabilla.sdk.ubform.sdk.field.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.UbScreenshot;
import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldType;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ScreenshotModel extends FieldModel<UbScreenshot> {
    public static final Parcelable.Creator<ScreenshotModel> CREATOR = new C10001a();

    /* renamed from: Z */
    public static final String f27451Z = "screenshotTitle";

    /* renamed from: Y */
    public String f27452Y;

    /* renamed from: com.usabilla.sdk.ubform.sdk.field.model.ScreenshotModel$a */
    public class C10001a implements Parcelable.Creator<ScreenshotModel> {
        /* renamed from: a */
        public ScreenshotModel createFromParcel(Parcel parcel) {
            return new ScreenshotModel(parcel);
        }

        /* renamed from: b */
        public ScreenshotModel[] newArray(int i) {
            return new ScreenshotModel[i];
        }
    }

    public ScreenshotModel(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
        if (jSONObject.has("screenshotTitle")) {
            this.f27452Y = jSONObject.getString("screenshotTitle");
        }
        mo20982p(FieldType.SCREENSHOT);
    }

    /* renamed from: a */
    public Object mo20872a() {
        return null;
    }

    /* renamed from: b */
    public List<String> mo20916b() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public boolean mo20885j() {
        return true;
    }

    /* renamed from: n */
    public void mo20900n() {
        this.f27479a = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f27452Y);
        parcel.writeParcelable((Parcelable) this.f27479a, i);
    }

    /* renamed from: x */
    public String mo20917x() {
        return this.f27452Y;
    }

    public ScreenshotModel(Parcel parcel) {
        super(parcel);
        this.f27452Y = parcel.readString();
        this.f27479a = parcel.readParcelable(UbScreenshot.class.getClassLoader());
    }
}
