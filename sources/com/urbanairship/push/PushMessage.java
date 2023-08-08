package com.urbanairship.push;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36049g;
import com.urbanairship.C36059m;
import com.urbanairship.actions.ActionValue;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9667n0;
import com.urbanairship.util.C9669o0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PushMessage implements Parcelable, C9333e {
    @C0359n0
    public static final Parcelable.Creator<PushMessage> CREATOR = new C9445a();
    @C0359n0

    /* renamed from: E0 */
    public static final String f25811E0 = "com.urbanairship.local_only";
    @C0359n0

    /* renamed from: F0 */
    public static final String f25812F0 = "com.urbanairship.icon_color";
    @C0359n0

    /* renamed from: G0 */
    public static final String f25813G0 = "com.urbanairship.icon";
    @C0359n0

    /* renamed from: H0 */
    public static final String f25814H0 = "com.urbanairship.priority";
    @C0359n0
    @Deprecated

    /* renamed from: I0 */
    public static final String f25815I0 = "com.urbanairship.sound";

    /* renamed from: J0 */
    public static final int f25816J0 = -2;

    /* renamed from: K0 */
    public static final int f25817K0 = 2;
    @C0359n0

    /* renamed from: L0 */
    public static final String f25818L0 = "com.urbanairship.visibility";

    /* renamed from: M0 */
    public static final int f25819M0 = -1;

    /* renamed from: N0 */
    public static final int f25820N0 = 1;

    /* renamed from: O0 */
    public static final int f25821O0 = 1;
    @C0359n0

    /* renamed from: P0 */
    public static final String f25822P0 = "com.urbanairship.public_notification";
    @C0359n0

    /* renamed from: Q0 */
    public static final String f25823Q0 = "com.urbanairship.category";
    @C0359n0

    /* renamed from: R0 */
    public static final String f25824R0 = "com.urbanairship.push.CANONICAL_PUSH_ID";
    @C0359n0

    /* renamed from: S0 */
    public static final String f25825S0 = "com.urbanairship.push.EXPIRATION";
    @C0359n0

    /* renamed from: T0 */
    public static final String f25826T0 = "com.urbanairship.in_app";
    @C0359n0

    /* renamed from: U0 */
    public static final String f25827U0 = "com.urbanairship.notification_tag";
    @C0359n0

    /* renamed from: V0 */
    public static final String f25828V0 = "com.urbanairship.notification_channel";
    @C0359n0

    /* renamed from: W0 */
    public static final String f25829W0 = "com.urbanairship.priority";
    @C0359n0

    /* renamed from: X */
    public static final String f25830X = "com.urbanairship.summary";
    @C0359n0

    /* renamed from: X0 */
    public static final String f25831X0 = "high";
    @C0359n0

    /* renamed from: Y */
    public static final String f25832Y = "com.urbanairship.wearable";
    @C0359n0

    /* renamed from: Y0 */
    public static final String f25833Y0 = "com.urbanairship.foreground_display";
    @C0359n0

    /* renamed from: Z */
    public static final String f25834Z = "com.urbanairship.style";
    @C0359n0

    /* renamed from: Z0 */
    public static final String f25835Z0 = "a4scontent";
    @C0359n0

    /* renamed from: a1 */
    public static final String f25836a1 = "a4sid";
    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: b1 */
    public static final String f25837b1 = "com.urbanairship.remote-data.update";

    /* renamed from: c1 */
    public static final String f25838c1 = "default";
    @C0359n0

    /* renamed from: d */
    public static final String f25839d = "_uamid";

    /* renamed from: d1 */
    public static final String f25840d1 = "^mc";

    /* renamed from: e */
    public static final String f25841e = "com.urbanairship.push.PING";
    @C0359n0

    /* renamed from: f */
    public static final String f25842f = "com.urbanairship.push.ALERT";
    @C0359n0

    /* renamed from: g */
    public static final String f25843g = "com.urbanairship.push.PUSH_ID";
    @C0359n0

    /* renamed from: v */
    public static final String f25844v = "com.urbanairship.metadata";
    @C0359n0

    /* renamed from: w */
    public static final String f25845w = "com.urbanairship.actions";
    @C0359n0

    /* renamed from: x */
    public static final String f25846x = "com.urbanairship.interactive_actions";
    @C0359n0

    /* renamed from: y */
    public static final String f25847y = "com.urbanairship.interactive_type";
    @C0359n0

    /* renamed from: z */
    public static final String f25848z = "com.urbanairship.title";

    /* renamed from: a */
    public Bundle f25849a;

    /* renamed from: b */
    public final Map<String, String> f25850b;

    /* renamed from: c */
    public Uri f25851c = null;

    /* renamed from: com.urbanairship.push.PushMessage$a */
    public class C9445a implements Parcelable.Creator<PushMessage> {
        @C0359n0
        /* renamed from: a */
        public PushMessage createFromParcel(@C0359n0 Parcel parcel) {
            Bundle readBundle = parcel.readBundle(PushMessage.class.getClassLoader());
            if (readBundle == null) {
                readBundle = new Bundle();
            }
            return new PushMessage(readBundle);
        }

        @C0359n0
        /* renamed from: b */
        public PushMessage[] newArray(int i) {
            return new PushMessage[i];
        }
    }

    public PushMessage(@C0359n0 Bundle bundle) {
        this.f25849a = bundle;
        this.f25850b = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null) {
                this.f25850b.put(next, String.valueOf(obj));
            }
        }
    }

    @C0363p0
    /* renamed from: c */
    public static PushMessage m35484c(@C0363p0 Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            Bundle bundleExtra = intent.getBundleExtra(C9537t.f26070J);
            if (bundleExtra == null) {
                return null;
            }
            return new PushMessage(bundleExtra);
        } catch (BadParcelableException e) {
            C36059m.m148411g(e, "Failed to parse push message from intent.", new Object[0]);
            return null;
        }
    }

    @C0359n0
    /* renamed from: d */
    public static PushMessage m35485d(@C0359n0 JsonValue jsonValue) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : jsonValue.mo18749A().mo18809i()) {
            if (((JsonValue) next.getValue()).mo18783y()) {
                hashMap.put((String) next.getKey(), ((JsonValue) next.getValue()).mo18750B());
            } else {
                hashMap.put((String) next.getKey(), ((JsonValue) next.getValue()).toString());
            }
        }
        return new PushMessage((Map<String, String>) hashMap);
    }

    @C0363p0
    /* renamed from: A */
    public String mo19154A() {
        return this.f25850b.get(f25830X);
    }

    @C0363p0
    /* renamed from: B */
    public String mo19155B() {
        return this.f25850b.get(f25848z);
    }

    /* renamed from: C */
    public int mo19156C() {
        try {
            String str = this.f25850b.get(f25818L0);
            if (C9669o0.m36224e(str)) {
                return 1;
            }
            return C9667n0.m36216a(Integer.parseInt(str), -1, 1);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    @C0363p0
    /* renamed from: D */
    public String mo19157D() {
        return this.f25850b.get(f25832Y);
    }

    /* renamed from: E */
    public boolean mo19158E() {
        return this.f25850b.containsKey(f25836a1);
    }

    /* renamed from: F */
    public boolean mo19159F() {
        return this.f25850b.containsKey("a4scontent");
    }

    /* renamed from: G */
    public boolean mo19160G() {
        return this.f25850b.containsKey(f25843g) || this.f25850b.containsKey(f25824R0) || this.f25850b.containsKey(f25844v);
    }

    /* renamed from: H */
    public boolean mo19161H() {
        String str = this.f25850b.get(f25825S0);
        if (!C9669o0.m36224e(str)) {
            C36059m.m148419o("Notification expiration time is \"%s\"", str);
            try {
                if (Long.parseLong(str) * 1000 < System.currentTimeMillis()) {
                    return true;
                }
            } catch (NumberFormatException e) {
                C36059m.m148407c(e, "Ignoring malformed expiration time.", new Object[0]);
            }
        }
        return false;
    }

    @C0363p0
    /* renamed from: I */
    public boolean mo19162I() {
        String str = this.f25850b.get(f25833Y0);
        if (str != null) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    /* renamed from: J */
    public boolean mo19163J() {
        return Boolean.parseBoolean(this.f25850b.get(f25811E0));
    }

    /* renamed from: K */
    public boolean mo19164K() {
        return this.f25850b.containsKey(f25841e);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: L */
    public boolean mo19165L() {
        return this.f25850b.containsKey(f25837b1);
    }

    /* renamed from: a */
    public boolean mo19166a() {
        for (String startsWith : this.f25850b.keySet()) {
            if (startsWith.startsWith(C36049g.f89063b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo19167b(@C0359n0 String str) {
        return this.f25850b.containsKey(str);
    }

    public int describeContents() {
        return 0;
    }

    @C0359n0
    /* renamed from: e */
    public Map<String, ActionValue> mo19169e() {
        String str = this.f25850b.get(f25845w);
        HashMap hashMap = new HashMap();
        try {
            C9323b j = JsonValue.m34960C(str).mo18767j();
            if (j != null) {
                Iterator<Map.Entry<String, JsonValue>> it = j.iterator();
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    hashMap.put((String) next.getKey(), new ActionValue((JsonValue) next.getValue()));
                }
            }
            if (!C9669o0.m36224e(mo19189w())) {
                hashMap.put("^mc", ActionValue.m146328o(mo19189w()));
            }
            return hashMap;
        } catch (JsonException unused) {
            C36059m.m148409e("Unable to parse action payload: %s", str);
            return hashMap;
        }
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f25850b.equals(((PushMessage) obj).f25850b);
    }

    @C0363p0
    /* renamed from: f */
    public String mo19171f() {
        return this.f25850b.get(f25842f);
    }

    @C0363p0
    /* renamed from: g */
    public String mo19172g() {
        return this.f25850b.get(f25824R0);
    }

    @C0363p0
    /* renamed from: h */
    public String mo19173h() {
        return this.f25850b.get(f25823Q0);
    }

    public int hashCode() {
        return this.f25850b.hashCode();
    }

    @C0363p0
    /* renamed from: i */
    public String mo19175i(@C0359n0 String str) {
        return this.f25850b.get(str);
    }

    @C0359n0
    /* renamed from: j */
    public String mo19176j(@C0359n0 String str, @C0359n0 String str2) {
        String i = mo19175i(str);
        return i == null ? str2 : i;
    }

    @C0375v
    /* renamed from: k */
    public int mo19177k(@C0359n0 Context context, int i) {
        String str = this.f25850b.get(f25813G0);
        if (str != null) {
            int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
            if (identifier != 0) {
                return identifier;
            }
            C36059m.m148421q("PushMessage - unable to find icon drawable with name: %s. Using default icon: %s", str, Integer.valueOf(i));
        }
        return i;
    }

    /* renamed from: l */
    public int mo19178l(int i) {
        String str = this.f25850b.get(f25812F0);
        if (str != null) {
            try {
                return Color.parseColor(str);
            } catch (IllegalArgumentException unused) {
                C36059m.m148421q("Unrecognized icon color string: %s. Using default color: %s", str, Integer.valueOf(i));
            }
        }
        return i;
    }

    @C0363p0
    /* renamed from: m */
    public String mo19179m() {
        return this.f25850b.get(f25846x);
    }

    @C0363p0
    /* renamed from: n */
    public String mo19180n() {
        return this.f25850b.get(f25847y);
    }

    @C0363p0
    /* renamed from: o */
    public String mo19181o() {
        return this.f25850b.get(f25844v);
    }

    @C0363p0
    /* renamed from: p */
    public String mo19182p() {
        return this.f25850b.get(f25828V0);
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return JsonValue.m34975U(this.f25850b);
    }

    @C0363p0
    /* renamed from: r */
    public String mo19183r(@C0363p0 String str) {
        String str2 = this.f25850b.get(f25828V0);
        return str2 == null ? str : str2;
    }

    @C0363p0
    /* renamed from: s */
    public String mo19184s() {
        return this.f25850b.get(f25827U0);
    }

    /* renamed from: t */
    public int mo19185t() {
        try {
            String str = this.f25850b.get("com.urbanairship.priority");
            if (C9669o0.m36224e(str)) {
                return 0;
            }
            return C9667n0.m36216a(Integer.parseInt(str), -2, 2);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @C0359n0
    public String toString() {
        return this.f25850b.toString();
    }

    @C0363p0
    /* renamed from: u */
    public String mo19187u() {
        return this.f25850b.get(f25822P0);
    }

    @C0359n0
    /* renamed from: v */
    public Bundle mo19188v() {
        if (this.f25849a == null) {
            this.f25849a = new Bundle();
            for (Map.Entry next : this.f25850b.entrySet()) {
                this.f25849a.putString((String) next.getKey(), (String) next.getValue());
            }
        }
        return this.f25849a;
    }

    @C0363p0
    /* renamed from: w */
    public String mo19189w() {
        return this.f25850b.get(f25839d);
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeBundle(mo19188v());
    }

    @C0363p0
    /* renamed from: x */
    public String mo19191x() {
        return this.f25850b.get(f25843g);
    }

    @C0363p0
    @Deprecated
    /* renamed from: y */
    public Uri mo19192y(@C0359n0 Context context) {
        if (this.f25851c == null && this.f25850b.get(f25815I0) != null) {
            String str = this.f25850b.get(f25815I0);
            int identifier = context.getResources().getIdentifier(str, "raw", context.getPackageName());
            if (identifier != 0) {
                this.f25851c = Uri.parse("android.resource://" + context.getPackageName() + "/" + identifier);
            } else if (!"default".equals(str)) {
                C36059m.m148421q("PushMessage - unable to find notification sound with name: %s", str);
            }
        }
        return this.f25851c;
    }

    @C0363p0
    /* renamed from: z */
    public String mo19193z() {
        return this.f25850b.get(f25834Z);
    }

    public PushMessage(@C0359n0 Map<String, String> map) {
        this.f25850b = new HashMap(map);
    }
}
