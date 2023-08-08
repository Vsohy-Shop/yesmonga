package com.usabilla.sdk.ubform.sdk.field.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldType;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.rule.RuleFieldModel;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class FieldModel<T> implements Parcelable {

    /* renamed from: X */
    public static final String f27475X = "required";

    /* renamed from: x */
    public static final String f27476x = "type";

    /* renamed from: y */
    public static final String f27477y = "name";

    /* renamed from: z */
    public static final String f27478z = "title";

    /* renamed from: a */
    public T f27479a;

    /* renamed from: b */
    public boolean f27480b;

    /* renamed from: c */
    public String f27481c;

    /* renamed from: d */
    public String f27482d;

    /* renamed from: e */
    public boolean f27483e;

    /* renamed from: f */
    public boolean f27484f;

    /* renamed from: g */
    public FieldType f27485g;

    /* renamed from: v */
    public RuleFieldModel f27486v;

    /* renamed from: w */
    public UbInternalTheme f27487w;

    public FieldModel(JSONObject jSONObject) throws JSONException {
        this.f27485g = FieldType.m37914b(jSONObject.getString("type"));
        this.f27483e = true;
        this.f27480b = false;
        if (jSONObject.has("name")) {
            this.f27481c = jSONObject.getString("name");
        }
        if (jSONObject.has("title")) {
            this.f27482d = jSONObject.getString("title");
        }
        if (jSONObject.has(f27475X)) {
            this.f27484f = jSONObject.getBoolean(f27475X);
        }
    }

    /* renamed from: a */
    public abstract Object mo20872a();

    /* renamed from: b */
    public abstract List<String> mo20916b();

    /* renamed from: c */
    public FieldType mo20972c() {
        return this.f27485g;
    }

    /* renamed from: d */
    public T mo20973d() {
        return this.f27479a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo20974e() {
        return this.f27481c;
    }

    /* renamed from: f */
    public RuleFieldModel mo20975f() {
        return this.f27486v;
    }

    /* renamed from: g */
    public UbInternalTheme mo20976g() {
        return this.f27487w;
    }

    /* renamed from: h */
    public String mo20977h() {
        return this.f27482d;
    }

    /* renamed from: i */
    public boolean mo20978i() {
        return this.f27483e;
    }

    /* renamed from: j */
    public abstract boolean mo20885j();

    /* renamed from: k */
    public boolean mo20979k() {
        return this.f27484f;
    }

    /* renamed from: l */
    public boolean mo20980l() {
        return this.f27480b;
    }

    /* renamed from: m */
    public boolean mo20899m() {
        return !this.f27483e || !this.f27484f || mo20885j();
    }

    /* renamed from: n */
    public abstract void mo20900n();

    /* renamed from: o */
    public void mo20981o(String str) {
        this.f27481c = str;
    }

    /* renamed from: p */
    public void mo20982p(FieldType fieldType) {
        this.f27485g = fieldType;
    }

    /* renamed from: q */
    public void mo20983q(@C0363p0 T t) {
        this.f27479a = t;
        this.f27480b = true;
    }

    /* renamed from: r */
    public void mo20984r(boolean z) {
        this.f27483e = z;
        if (!z) {
            mo20900n();
        }
    }

    /* renamed from: s */
    public void mo20985s(boolean z) {
        this.f27480b = z;
    }

    /* renamed from: t */
    public void mo20986t(boolean z) {
        this.f27484f = z;
    }

    /* renamed from: u */
    public void mo20987u(RuleFieldModel ruleFieldModel) {
        this.f27486v = ruleFieldModel;
    }

    /* renamed from: v */
    public void mo20988v(UbInternalTheme ubInternalTheme) {
        this.f27487w = ubInternalTheme;
    }

    /* renamed from: w */
    public void mo20989w(String str) {
        this.f27482d = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f27480b ? (byte) 1 : 0);
        parcel.writeString(this.f27481c);
        parcel.writeString(this.f27482d);
        parcel.writeByte(this.f27484f ? (byte) 1 : 0);
        parcel.writeSerializable(this.f27485g);
        parcel.writeByte(this.f27483e ? (byte) 1 : 0);
        parcel.writeParcelable(this.f27486v, i);
        parcel.writeParcelable(this.f27487w, i);
    }

    public FieldModel(Parcel parcel) {
        boolean z = true;
        this.f27480b = parcel.readByte() != 0;
        this.f27481c = parcel.readString();
        this.f27482d = parcel.readString();
        this.f27484f = parcel.readByte() != 0;
        this.f27485g = (FieldType) parcel.readSerializable();
        this.f27483e = parcel.readByte() == 0 ? false : z;
        this.f27486v = (RuleFieldModel) parcel.readParcelable(RuleFieldModel.class.getClassLoader());
        this.f27487w = (UbInternalTheme) parcel.readParcelable(UbInternalTheme.class.getClassLoader());
    }
}
