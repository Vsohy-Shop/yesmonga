package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.C33180f;
import com.google.maps.android.data.kml.C33866p;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

@SafeParcelable.C40812a(creator = "CloudMessageCreator")
public final class CloudMessage extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<CloudMessage> CREATOR = new C40445e();

    /* renamed from: c */
    public static final int f103047c = 0;

    /* renamed from: d */
    public static final int f103048d = 1;

    /* renamed from: e */
    public static final int f103049e = 2;
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 1)

    /* renamed from: a */
    public Intent f103050a;
    @GuardedBy("this")

    /* renamed from: b */
    public Map<String, String> f103051b;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.cloudmessaging.CloudMessage$a */
    public @interface C40433a {
    }

    @SafeParcelable.C40813b
    public CloudMessage(@SafeParcelable.C40816e(mo134492id = 1) @C0359n0 Intent intent) {
        this.f103050a = intent;
    }

    /* renamed from: j1 */
    public static int m164583j1(@C0363p0 String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if (C33866p.f82157i.equals(str)) {
            return 2;
        }
        return 0;
    }

    @C0363p0
    /* renamed from: A0 */
    public String mo133521A0() {
        return this.f103050a.getStringExtra(C33180f.C33184d.f80623p);
    }

    /* renamed from: C0 */
    public long mo133522C0() {
        Object obj;
        Bundle extras = this.f103050a.getExtras();
        if (extras != null) {
            obj = extras.get(C33180f.C33184d.f80617j);
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 19);
            sb.append("Invalid sent time: ");
            sb.append(valueOf);
            return 0;
        }
    }

    @C0363p0
    /* renamed from: K0 */
    public String mo133523K0() {
        return this.f103050a.getStringExtra(C33180f.C33184d.f80614g);
    }

    @C0363p0
    /* renamed from: M */
    public String mo133524M() {
        return this.f103050a.getStringExtra(C33180f.C33184d.f80612e);
    }

    /* renamed from: N0 */
    public int mo133525N0() {
        Object obj;
        Bundle extras = this.f103050a.getExtras();
        if (extras != null) {
            obj = extras.get(C33180f.C33184d.f80616i);
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            return 0;
        }
    }

    @C0359n0
    /* renamed from: Q */
    public synchronized Map<String, String> mo133526Q() {
        if (this.f103051b == null) {
            Bundle extras = this.f103050a.getExtras();
            C1866a aVar = new C1866a();
            if (extras != null) {
                for (String next : extras.keySet()) {
                    Object obj = extras.get(next);
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!next.startsWith(C33180f.C33184d.f80608a) && !next.equals("from") && !next.equals(C33180f.C33184d.f80611d) && !next.equals(C33180f.C33184d.f80612e)) {
                            aVar.put(next, str);
                        }
                    }
                }
            }
            this.f103051b = aVar;
        }
        return this.f103051b;
    }

    @C0363p0
    /* renamed from: W */
    public String mo133527W() {
        return this.f103050a.getStringExtra("from");
    }

    @C0359n0
    /* renamed from: X */
    public Intent mo133528X() {
        return this.f103050a;
    }

    @C0363p0
    /* renamed from: e0 */
    public String mo133529e0() {
        String stringExtra = this.f103050a.getStringExtra(C33180f.C33184d.f80615h);
        if (stringExtra == null) {
            return this.f103050a.getStringExtra("message_id");
        }
        return stringExtra;
    }

    @C0363p0
    /* renamed from: f0 */
    public String mo133530f0() {
        return this.f103050a.getStringExtra(C33180f.C33184d.f80611d);
    }

    /* renamed from: n0 */
    public int mo133531n0() {
        String stringExtra = this.f103050a.getStringExtra(C33180f.C33184d.f80618k);
        if (stringExtra == null) {
            stringExtra = this.f103050a.getStringExtra(C33180f.C33184d.f80620m);
        }
        return m164583j1(stringExtra);
    }

    /* renamed from: p0 */
    public int mo133532p0() {
        String stringExtra = this.f103050a.getStringExtra(C33180f.C33184d.f80619l);
        if (stringExtra == null) {
            if ("1".equals(this.f103050a.getStringExtra(C33180f.C33184d.f80621n))) {
                return 2;
            }
            stringExtra = this.f103050a.getStringExtra(C33180f.C33184d.f80620m);
        }
        return m164583j1(stringExtra);
    }

    @C0363p0
    /* renamed from: t0 */
    public byte[] mo133533t0() {
        return this.f103050a.getByteArrayExtra("rawData");
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 1, this.f103050a, i, false);
        C40820a.m166112b(parcel, a);
    }
}
