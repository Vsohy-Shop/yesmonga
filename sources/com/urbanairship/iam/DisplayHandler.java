package com.urbanairship.iam;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.C35518b;
import com.urbanairship.automation.C8928r;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.json.JsonValue;

public class DisplayHandler implements Parcelable {
    @C0359n0
    public static final Parcelable.Creator<DisplayHandler> CREATOR = new C9120a();

    /* renamed from: a */
    public final String f24663a;

    /* renamed from: b */
    public final boolean f24664b;

    /* renamed from: c */
    public final JsonValue f24665c;

    /* renamed from: d */
    public final JsonValue f24666d;

    /* renamed from: com.urbanairship.iam.DisplayHandler$a */
    public class C9120a implements Parcelable.Creator<DisplayHandler> {
        @C0359n0
        /* renamed from: a */
        public DisplayHandler createFromParcel(@C0359n0 Parcel parcel) {
            boolean z;
            try {
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                JsonValue C = JsonValue.m34960C(parcel.readString());
                JsonValue C2 = JsonValue.m34960C(parcel.readString());
                if (readString == null) {
                    readString = "";
                }
                return new DisplayHandler(readString, z, C, C2);
            } catch (Exception e) {
                C36059m.m148411g(e, "failed to create display handler", new Object[0]);
                JsonValue jsonValue = JsonValue.f25436b;
                return new DisplayHandler("", false, jsonValue, jsonValue);
            }
        }

        @C0359n0
        /* renamed from: b */
        public DisplayHandler[] newArray(int i) {
            return new DisplayHandler[i];
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DisplayHandler(@C0359n0 String str, boolean z, @C0359n0 JsonValue jsonValue, @C0359n0 JsonValue jsonValue2) {
        this.f24663a = str;
        this.f24664b = z;
        this.f24665c = jsonValue;
        this.f24666d = jsonValue2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo18163a(C9175a aVar) {
        if (this.f24664b) {
            C35518b d = mo18166d();
            if (d == null) {
                C36059m.m148409e("Takeoff not called. Unable to add event for schedule: %s", this.f24663a);
                return;
            }
            aVar.mo18407r(this.f24665c).mo18410u(this.f24666d).mo18406o(d);
        }
    }

    /* renamed from: b */
    public void mo18164b() {
        C8928r e = mo18168e();
        if (e == null) {
            C36059m.m148409e("Takeoff not called. Unable to cancel displays for schedule: %s", this.f24663a);
            return;
        }
        e.mo17610f(this.f24663a);
    }

    /* renamed from: c */
    public void mo18165c(@C0359n0 C9163c0 c0Var, long j) {
        C8928r e = mo18168e();
        if (e == null) {
            C36059m.m148409e("Takeoff not called. Unable to finish display for schedule: %s", this.f24663a);
            return;
        }
        e.mo17598V().mo18563I(this.f24663a, c0Var, j);
        mo18171h(c0Var);
        if (c0Var.mo18375e() != null && "cancel".equals(c0Var.mo18375e().mo18260l())) {
            e.mo17610f(this.f24663a);
        }
    }

    @C0363p0
    /* renamed from: d */
    public final C35518b mo18166d() {
        if (UAirship.m146184O() || UAirship.m146182M()) {
            return UAirship.m146188Y().mo106221g();
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    @C0363p0
    /* renamed from: e */
    public final C8928r mo18168e() {
        if (UAirship.m146184O() || UAirship.m146182M()) {
            return C8928r.m33148s0();
        }
        return null;
    }

    /* renamed from: f */
    public String mo18169f() {
        return this.f24663a;
    }

    /* renamed from: g */
    public boolean mo18170g(@C0359n0 Context context) {
        Autopilot.m146142e(context);
        C8928r e = mo18168e();
        if (e != null) {
            return e.mo17598V().mo18576q(this.f24663a);
        }
        C36059m.m148409e("Takeoff not called. Unable to request display lock.", new Object[0]);
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public void mo18171h(@C0359n0 C9163c0 c0Var) {
        C8928r e = mo18168e();
        if (e == null) {
            C36059m.m148409e("Takeoff not called. Unable to finish display for schedule: %s", this.f24663a);
            return;
        }
        e.mo17598V().mo18556B(this.f24663a, c0Var);
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeString(this.f24663a);
        parcel.writeInt(this.f24664b ? 1 : 0);
        parcel.writeString(this.f24665c.toString());
        parcel.writeString(this.f24666d.toString());
    }
}
