package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.google.android.gms.common.C40924q;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C40783l1;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40861z;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.C33262n;
import javax.annotation.concurrent.GuardedBy;

@C40473a
@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.j */
public final class C40570j {

    /* renamed from: e */
    public static final Object f103427e = new Object();
    @C0363p0
    @GuardedBy("sLock")

    /* renamed from: f */
    public static C40570j f103428f;
    @C0363p0

    /* renamed from: a */
    public final String f103429a;

    /* renamed from: b */
    public final Status f103430b;

    /* renamed from: c */
    public final boolean f103431c;

    /* renamed from: d */
    public final boolean f103432d;

    @C40473a
    @C40974d0
    public C40570j(String str, boolean z) {
        this.f103429a = str;
        this.f103430b = Status.f103184g;
        this.f103431c = z;
        this.f103432d = !z;
    }

    @C40473a
    /* renamed from: b */
    public static C40570j m165137b(String str) {
        C40570j jVar;
        synchronized (f103427e) {
            jVar = f103428f;
            if (jVar == null) {
                throw new IllegalStateException("Initialize must be called before " + str + ".");
            }
        }
        return jVar;
    }

    @C40473a
    @C40974d0
    /* renamed from: c */
    public static void m165138c() {
        synchronized (f103427e) {
            f103428f = null;
        }
    }

    @C0363p0
    @C40473a
    /* renamed from: d */
    public static String m165139d() {
        return m165137b("getGoogleAppId").f103429a;
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public static Status m165140e(@C0359n0 Context context) {
        Status status;
        C40843u.m166203m(context, "Context must not be null.");
        synchronized (f103427e) {
            if (f103428f == null) {
                f103428f = new C40570j(context);
            }
            status = f103428f.f103430b;
        }
        return status;
    }

    @C40473a
    @C0359n0
    /* renamed from: f */
    public static Status m165141f(@C0359n0 Context context, @C0359n0 String str, boolean z) {
        C40843u.m166203m(context, "Context must not be null.");
        C40843u.m166199i(str, "App ID must be nonempty.");
        synchronized (f103427e) {
            C40570j jVar = f103428f;
            if (jVar != null) {
                Status a = jVar.mo133966a(str);
                return a;
            }
            C40570j jVar2 = new C40570j(str, z);
            f103428f = jVar2;
            Status status = jVar2.f103430b;
            return status;
        }
    }

    @C40473a
    /* renamed from: g */
    public static boolean m165142g() {
        C40570j b = m165137b("isMeasurementEnabled");
        if (!b.f103430b.mo133655p0() || !b.f103431c) {
            return false;
        }
        return true;
    }

    @C40473a
    /* renamed from: h */
    public static boolean m165143h() {
        return m165137b("isMeasurementExplicitlyDisabled").f103432d;
    }

    @C40473a
    @C40974d0
    /* renamed from: a */
    public Status mo133966a(String str) {
        String str2 = this.f103429a;
        if (str2 == null || str2.equals(str)) {
            return Status.f103184g;
        }
        String str3 = this.f103429a;
        return new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + str3 + "'.");
    }

    @C40473a
    @C40974d0
    public C40570j(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", C16717v.C16719b.f42179b, resources.getResourcePackageName(C40924q.C40926b.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z2 = integer == 0;
            z = integer == 0 ? false : z;
            this.f103432d = z2;
        } else {
            this.f103432d = false;
        }
        this.f103431c = z;
        String b = C40783l1.m165961b(context);
        b = b == null ? new C40861z(context).mo134516a(C33262n.f80886i) : b;
        if (TextUtils.isEmpty(b)) {
            this.f103430b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f103429a = null;
            return;
        }
        this.f103429a = b;
        this.f103430b = Status.f103184g;
    }
}
