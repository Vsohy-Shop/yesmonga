package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1869c;
import androidx.core.content.C17339i;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C40733b;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.common.util.C40985k;
import com.google.errorprone.annotations.C32488a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.C40812a(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @C0359n0
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C40419c();
    @C0359n0
    @C40974d0

    /* renamed from: Y */
    public static C40979g f102993Y = C40985k.m166636d();

    /* renamed from: X */
    public Set f102994X = new HashSet();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f102995a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getId", mo134489id = 2)

    /* renamed from: b */
    public String f102996b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getIdToken", mo134489id = 3)

    /* renamed from: c */
    public String f102997c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getEmail", mo134489id = 4)

    /* renamed from: d */
    public String f102998d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getDisplayName", mo134489id = 5)

    /* renamed from: e */
    public String f102999e;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPhotoUrl", mo134489id = 6)

    /* renamed from: f */
    public Uri f103000f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getServerAuthCode", mo134489id = 7)

    /* renamed from: g */
    public String f103001g;
    @SafeParcelable.C40814c(getter = "getExpirationTimeSecs", mo134489id = 8)

    /* renamed from: v */
    public long f103002v;
    @SafeParcelable.C40814c(getter = "getObfuscatedIdentifier", mo134489id = 9)

    /* renamed from: w */
    public String f103003w;
    @SafeParcelable.C40814c(mo134489id = 10)

    /* renamed from: x */
    public List f103004x;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getGivenName", mo134489id = 11)

    /* renamed from: y */
    public String f103005y;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getFamilyName", mo134489id = 12)

    /* renamed from: z */
    public String f103006z;

    @SafeParcelable.C40813b
    public GoogleSignInAccount(@SafeParcelable.C40816e(mo134492id = 1) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) String str4, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) Uri uri, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) String str5, @SafeParcelable.C40816e(mo134492id = 8) long j, @SafeParcelable.C40816e(mo134492id = 9) String str6, @SafeParcelable.C40816e(mo134492id = 10) List list, @C0363p0 @SafeParcelable.C40816e(mo134492id = 11) String str7, @C0363p0 @SafeParcelable.C40816e(mo134492id = 12) String str8) {
        this.f102995a = i;
        this.f102996b = str;
        this.f102997c = str2;
        this.f102998d = str3;
        this.f102999e = str4;
        this.f103000f = uri;
        this.f103001g = str5;
        this.f103002v = j;
        this.f103003w = str6;
        this.f103004x = list;
        this.f103005y = str7;
        this.f103006z = str8;
    }

    @C0363p0
    /* renamed from: A1 */
    public static GoogleSignInAccount m164510A1(@C0363p0 String str) throws JSONException {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has(C17339i.f45595Y)) {
            str4 = jSONObject.optString(C17339i.f45595Y);
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount k1 = m164514k1(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        k1.f103001g = str7;
        return k1;
    }

    @C40473a
    @C0359n0
    /* renamed from: M */
    public static GoogleSignInAccount m164511M() {
        return m164512M1(new Account("<<default account>>", C40733b.f103787a), new HashSet());
    }

    /* renamed from: M1 */
    public static GoogleSignInAccount m164512M1(Account account, Set set) {
        return m164514k1((String) null, (String) null, account.name, (String) null, (String) null, (String) null, (Uri) null, 0L, account.name, set);
    }

    @C40473a
    @C0359n0
    /* renamed from: Q */
    public static GoogleSignInAccount m164513Q(@C0359n0 Account account) {
        return m164512M1(account, new C1869c());
    }

    @C0359n0
    /* renamed from: k1 */
    public static GoogleSignInAccount m164514k1(@C0363p0 String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 String str4, @C0363p0 String str5, @C0363p0 String str6, @C0363p0 Uri uri, @C0363p0 Long l, @C0359n0 String str7, @C0359n0 Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l.longValue(), C40843u.m166198h(str7), new ArrayList((Collection) C40843u.m166202l(set)), str5, str6);
    }

    @C0363p0
    /* renamed from: A0 */
    public Uri mo133452A0() {
        return this.f103000f;
    }

    @C40473a
    @C0359n0
    /* renamed from: C0 */
    public Set<Scope> mo133453C0() {
        HashSet hashSet = new HashSet(this.f103004x);
        hashSet.addAll(this.f102994X);
        return hashSet;
    }

    @C0359n0
    /* renamed from: G1 */
    public final String mo133454G1() {
        return this.f103003w;
    }

    @C0363p0
    /* renamed from: K0 */
    public String mo133455K0() {
        return this.f103001g;
    }

    @C0359n0
    /* renamed from: L1 */
    public final String mo133456L1() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo133466p0() != null) {
                jSONObject.put("id", mo133466p0());
            }
            if (mo133467t0() != null) {
                jSONObject.put("tokenId", mo133467t0());
            }
            if (mo133459X() != null) {
                jSONObject.put("email", mo133459X());
            }
            if (mo133458W() != null) {
                jSONObject.put(C17339i.f45595Y, mo133458W());
            }
            if (mo133462f0() != null) {
                jSONObject.put("givenName", mo133462f0());
            }
            if (mo133460e0() != null) {
                jSONObject.put("familyName", mo133460e0());
            }
            Uri A0 = mo133452A0();
            if (A0 != null) {
                jSONObject.put("photoUrl", A0.toString());
            }
            if (mo133455K0() != null) {
                jSONObject.put("serverAuthCode", mo133455K0());
            }
            jSONObject.put("expirationTime", this.f103002v);
            jSONObject.put("obfuscatedIdentifier", this.f103003w);
            JSONArray jSONArray = new JSONArray();
            List list = this.f103004x;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C40418b.f103037a);
            for (Scope M : scopeArr) {
                jSONArray.put(M.mo133640M());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @C40473a
    /* renamed from: N0 */
    public boolean mo133457N0() {
        return f102993Y.mo134768a() / 1000 >= this.f103002v + -300;
    }

    @C0363p0
    /* renamed from: W */
    public String mo133458W() {
        return this.f102999e;
    }

    @C0363p0
    /* renamed from: X */
    public String mo133459X() {
        return this.f102998d;
    }

    @C0363p0
    /* renamed from: e0 */
    public String mo133460e0() {
        return this.f103006z;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f103003w.equals(this.f103003w) || !googleSignInAccount.mo133453C0().equals(mo133453C0())) {
            return false;
        }
        return true;
    }

    @C0363p0
    /* renamed from: f0 */
    public String mo133462f0() {
        return this.f103005y;
    }

    public int hashCode() {
        return ((this.f103003w.hashCode() + 527) * 31) + mo133453C0().hashCode();
    }

    @C40473a
    @C0359n0
    @C32488a
    /* renamed from: j1 */
    public GoogleSignInAccount mo133464j1(@C0359n0 Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.f102994X, scopeArr);
        }
        return this;
    }

    @C0359n0
    /* renamed from: n0 */
    public Set<Scope> mo133465n0() {
        return new HashSet(this.f103004x);
    }

    @C0363p0
    /* renamed from: p0 */
    public String mo133466p0() {
        return this.f102996b;
    }

    @C0363p0
    /* renamed from: t0 */
    public String mo133467t0() {
        return this.f102997c;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f102995a);
        C40820a.m166108Y(parcel, 2, mo133466p0(), false);
        C40820a.m166108Y(parcel, 3, mo133467t0(), false);
        C40820a.m166108Y(parcel, 4, mo133459X(), false);
        C40820a.m166108Y(parcel, 5, mo133458W(), false);
        C40820a.m166102S(parcel, 6, mo133452A0(), i, false);
        C40820a.m166108Y(parcel, 7, mo133455K0(), false);
        C40820a.m166094K(parcel, 8, this.f103002v);
        C40820a.m166108Y(parcel, 9, this.f103003w, false);
        C40820a.m166117d0(parcel, 10, this.f103004x, false);
        C40820a.m166108Y(parcel, 11, mo133462f0(), false);
        C40820a.m166108Y(parcel, 12, mo133460e0(), false);
        C40820a.m166112b(parcel, a);
    }

    @C0363p0
    /* renamed from: y */
    public Account mo133469y() {
        String str = this.f102998d;
        if (str == null) {
            return null;
        }
        return new Account(str, C40733b.f103787a);
    }
}
