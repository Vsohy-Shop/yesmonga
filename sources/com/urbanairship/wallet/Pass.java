package com.urbanairship.wallet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;

public class Pass implements Parcelable {
    @C0359n0
    public static final Parcelable.Creator<Pass> CREATOR = new C9695a();

    /* renamed from: c */
    public static final String f26548c = "publicUrl";

    /* renamed from: d */
    public static final String f26549d = "path";

    /* renamed from: e */
    public static final String f26550e = "id";

    /* renamed from: a */
    public final Uri f26551a;

    /* renamed from: b */
    public final String f26552b;

    /* renamed from: com.urbanairship.wallet.Pass$a */
    public class C9695a implements Parcelable.Creator<Pass> {
        @C0359n0
        /* renamed from: a */
        public Pass createFromParcel(@C0359n0 Parcel parcel) {
            return new Pass(parcel);
        }

        @C0359n0
        /* renamed from: b */
        public Pass[] newArray(int i) {
            return new Pass[i];
        }
    }

    public Pass(@C0359n0 Uri uri, @C0363p0 String str) {
        this.f26551a = uri;
        this.f26552b = str;
    }

    @C0363p0
    /* renamed from: c */
    public static Pass m36274c(JsonValue jsonValue) {
        String l = jsonValue.mo18749A().mo18801A("id").mo18769l();
        String l2 = jsonValue.mo18749A().mo18801A(f26548c).mo18749A().mo18801A("path").mo18769l();
        if (!C9669o0.m36224e(l2)) {
            return new Pass(Uri.parse(l2), l);
        }
        C36059m.m148409e("Pass - unable to parse URI from %s", jsonValue);
        return null;
    }

    @C0363p0
    /* renamed from: a */
    public String mo19663a() {
        return this.f26552b;
    }

    @C0359n0
    /* renamed from: b */
    public Uri mo19664b() {
        return this.f26551a;
    }

    /* renamed from: d */
    public void mo19665d(@C0359n0 Context context) {
        context.startActivity(new Intent("android.intent.action.VIEW").setData(this.f26551a).setFlags(268435456));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeParcelable(this.f26551a, i);
        parcel.writeString(this.f26552b);
    }

    public Pass(@C0359n0 Parcel parcel) {
        this.f26551a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f26552b = parcel.readString();
    }
}
