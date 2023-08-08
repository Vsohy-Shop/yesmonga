package com.onetrust.otpublishers.headless.p052UI.DataModels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.onetrust.otpublishers.headless.UI.DataModels.a */
public class C35021a implements Parcelable {
    public static final Parcelable.Creator<C35021a> CREATOR = new C35022a();

    /* renamed from: a */
    public String f85233a;

    /* renamed from: b */
    public String f85234b;

    /* renamed from: c */
    public String f85235c;

    /* renamed from: d */
    public String f85236d;

    /* renamed from: e */
    public String f85237e;

    /* renamed from: f */
    public String f85238f;

    /* renamed from: g */
    public ArrayList<C35024c> f85239g = new ArrayList<>();

    /* renamed from: com.onetrust.otpublishers.headless.UI.DataModels.a$a */
    public class C35022a implements Parcelable.Creator<C35021a> {
        /* renamed from: a */
        public C35021a createFromParcel(Parcel parcel) {
            return new C35021a(parcel);
        }

        /* renamed from: b */
        public C35021a[] newArray(int i) {
            return new C35021a[i];
        }
    }

    public C35021a() {
    }

    @C0363p0
    /* renamed from: a */
    public String mo104197a() {
        return this.f85234b;
    }

    /* renamed from: b */
    public void mo104198b(@C0359n0 String str) {
        this.f85235c = str;
    }

    /* renamed from: c */
    public void mo104199c(@C0363p0 ArrayList<C35024c> arrayList) {
        this.f85239g = arrayList;
    }

    @C0363p0
    /* renamed from: d */
    public ArrayList<C35024c> mo104200d() {
        return this.f85239g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo104202e(@C0359n0 String str) {
        this.f85237e = str;
    }

    @C0363p0
    /* renamed from: f */
    public String mo104203f() {
        return this.f85236d;
    }

    /* renamed from: g */
    public void mo104204g(@C0359n0 String str) {
        this.f85233a = str;
    }

    /* renamed from: h */
    public void mo104205h(@C0359n0 String str) {
        this.f85234b = str;
    }

    /* renamed from: i */
    public void mo104206i(@C0359n0 String str) {
    }

    /* renamed from: j */
    public void mo104207j(@C0359n0 String str) {
        this.f85236d = str;
    }

    public String toString() {
        return "OTConsentPreferencesCustomPreferencesModel{Id='" + this.f85233a + '\'' + ", Name='" + this.f85234b + '\'' + ", Description='" + this.f85235c + '\'' + ", SelectionType='" + this.f85236d + '\'' + ", DisplayAs='" + this.f85237e + '\'' + ", Required='" + this.f85238f + '\'' + ", otConsentPreferencesOptionsModels=" + this.f85239g + C12361b.f30259j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f85233a);
        parcel.writeString(this.f85234b);
        parcel.writeString(this.f85235c);
        parcel.writeString(this.f85236d);
        parcel.writeString(this.f85237e);
        parcel.writeString(this.f85238f);
    }

    public C35021a(Parcel parcel) {
        this.f85233a = parcel.readString();
        this.f85234b = parcel.readString();
        this.f85235c = parcel.readString();
        this.f85236d = parcel.readString();
        this.f85237e = parcel.readString();
        this.f85238f = parcel.readString();
    }
}
