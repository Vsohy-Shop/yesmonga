package com.urbanairship;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.base.C9002b;
import com.urbanairship.push.PushProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.w */
public class C36078w {

    /* renamed from: d */
    public static final String f89158d = "com.urbanairship.push.fcm.FcmPushProvider";

    /* renamed from: e */
    public static final String f89159e = "com.urbanairship.push.adm.AdmPushProvider";

    /* renamed from: f */
    public static final String f89160f = "com.urbanairship.push.hms.HmsPushProvider";

    /* renamed from: a */
    public final List<PushProvider> f89161a = new ArrayList();

    /* renamed from: b */
    public final List<PushProvider> f89162b = new ArrayList();

    /* renamed from: c */
    public final AirshipConfigOptions f89163c;

    /* renamed from: com.urbanairship.w$a */
    public static class C36079a implements C9002b<C36078w> {

        /* renamed from: a */
        public final Context f89164a;

        /* renamed from: b */
        public final AirshipConfigOptions f89165b;

        /* renamed from: c */
        public C36078w f89166c = null;

        public C36079a(Context context, AirshipConfigOptions airshipConfigOptions) {
            this.f89164a = context;
            this.f89165b = airshipConfigOptions;
        }

        @C0363p0
        /* renamed from: a */
        public synchronized C36078w get() {
            if (this.f89166c == null) {
                this.f89166c = C36078w.m148510j(this.f89164a, this.f89165b);
            }
            return this.f89166c;
        }
    }

    @C0344h1
    public C36078w(@C0359n0 AirshipConfigOptions airshipConfigOptions) {
        this.f89163c = airshipConfigOptions;
    }

    /* renamed from: i */
    public static C9002b<C36078w> m148509i(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions) {
        return new C36079a(context, airshipConfigOptions);
    }

    @C0359n0
    /* renamed from: j */
    public static C36078w m148510j(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions) {
        C36078w wVar = new C36078w(airshipConfigOptions);
        wVar.mo107885g(context);
        return wVar;
    }

    /* renamed from: a */
    public final List<String> mo107879a() {
        ArrayList arrayList = new ArrayList();
        if (this.f89163c.f87137j.contains("FCM")) {
            arrayList.add(f89158d);
        }
        if (this.f89163c.f87137j.contains(AirshipConfigOptions.f87119g0)) {
            arrayList.add(f89159e);
        }
        if (this.f89163c.f87137j.contains(AirshipConfigOptions.f87121i0)) {
            arrayList.add(f89160f);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r6 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0018 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:? A[ExcHandler: ClassNotFoundException (unused java.lang.ClassNotFoundException), SYNTHETIC, Splitter:B:8:0x0027] */
    @androidx.annotation.C0359n0
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.urbanairship.push.PushProvider> mo107880b() {
        /*
            r10 = this;
            java.lang.String r0 = "Unable to create provider %s"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.urbanairship.AirshipConfigOptions r2 = r10.f89163c
            com.urbanairship.push.PushProvider r2 = r2.f87138k
            if (r2 == 0) goto L_0x0010
            r1.add(r2)
        L_0x0010:
            java.util.List r2 = r10.mo107879a()
            java.util.Iterator r2 = r2.iterator()
        L_0x0018:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = 1
            r6 = 0
            java.lang.Class r7 = java.lang.Class.forName(r3)     // Catch:{ InstantiationException -> 0x004b, IllegalAccessException -> 0x003f, ClassNotFoundException -> 0x0018 }
            java.lang.Object r7 = r7.newInstance()     // Catch:{ InstantiationException -> 0x004b, IllegalAccessException -> 0x003f, ClassNotFoundException -> 0x0018 }
            com.urbanairship.push.PushProvider r7 = (com.urbanairship.push.PushProvider) r7     // Catch:{ InstantiationException -> 0x004b, IllegalAccessException -> 0x003f, ClassNotFoundException -> 0x0018 }
            java.lang.String r6 = "Found provider: %s"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ InstantiationException -> 0x003d, IllegalAccessException -> 0x003b, ClassNotFoundException -> 0x0018 }
            r8[r4] = r7     // Catch:{ InstantiationException -> 0x003d, IllegalAccessException -> 0x003b, ClassNotFoundException -> 0x0018 }
            com.urbanairship.C36059m.m148419o(r6, r8)     // Catch:{ InstantiationException -> 0x003d, IllegalAccessException -> 0x003b, ClassNotFoundException -> 0x0018 }
            goto L_0x0056
        L_0x003b:
            r6 = move-exception
            goto L_0x0043
        L_0x003d:
            r6 = move-exception
            goto L_0x004f
        L_0x003f:
            r7 = move-exception
            r9 = r7
            r7 = r6
            r6 = r9
        L_0x0043:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r3
            com.urbanairship.C36059m.m148411g(r6, r0, r5)
            goto L_0x0056
        L_0x004b:
            r7 = move-exception
            r9 = r7
            r7 = r6
            r6 = r9
        L_0x004f:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r3
            com.urbanairship.C36059m.m148411g(r6, r0, r5)
        L_0x0056:
            if (r7 != 0) goto L_0x0059
            goto L_0x0018
        L_0x0059:
            r1.add(r7)
            goto L_0x0018
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.C36078w.mo107880b():java.util.List");
    }

    @C0359n0
    /* renamed from: c */
    public List<PushProvider> mo107881c() {
        return Collections.unmodifiableList(this.f89162b);
    }

    @C0363p0
    /* renamed from: d */
    public PushProvider mo107882d() {
        if (!this.f89162b.isEmpty()) {
            return this.f89162b.get(0);
        }
        if (!this.f89161a.isEmpty()) {
            return this.f89161a.get(0);
        }
        return null;
    }

    @C0363p0
    /* renamed from: e */
    public PushProvider mo107883e(int i) {
        for (PushProvider next : this.f89162b) {
            if (next.getPlatform() == i) {
                return next;
            }
        }
        for (PushProvider next2 : this.f89161a) {
            if (next2.getPlatform() == i) {
                return next2;
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: f */
    public PushProvider mo107884f(int i, @C0359n0 String str) {
        for (PushProvider next : this.f89161a) {
            if (i == next.getPlatform() && str.equals(next.getClass().toString())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final void mo107885g(@C0359n0 Context context) {
        List<PushProvider> b = mo107880b();
        if (b.isEmpty()) {
            C36059m.m148421q("No push providers found!. Make sure to install either `urbanairship-fcm` or `urbanairship-adm`.", new Object[0]);
            return;
        }
        for (PushProvider next : b) {
            if (mo107886h(next) && next.isSupported(context)) {
                this.f89161a.add(next);
                if (next.isAvailable(context)) {
                    this.f89162b.add(next);
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean mo107886h(PushProvider pushProvider) {
        if (pushProvider instanceof AirshipVersionInfo) {
            AirshipVersionInfo airshipVersionInfo = (AirshipVersionInfo) pushProvider;
            if (!UAirship.m146181I().equals(airshipVersionInfo.getAirshipVersion())) {
                C36059m.m148409e("Provider: %s version %s does not match the SDK version %s. Make sure all Airship dependencies are the same version.", pushProvider, airshipVersionInfo.getAirshipVersion(), UAirship.m146181I());
                return false;
            }
        }
        String deliveryType = pushProvider.getDeliveryType();
        deliveryType.hashCode();
        char c = 65535;
        switch (deliveryType.hashCode()) {
            case 96426:
                if (deliveryType.equals(PushProvider.f25852a)) {
                    c = 0;
                    break;
                }
                break;
            case 101200:
                if (deliveryType.equals("fcm")) {
                    c = 1;
                    break;
                }
                break;
            case 103438:
                if (deliveryType.equals(PushProvider.f25854c)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (pushProvider.getPlatform() != 1) {
                    C36059m.m148409e("Invalid Provider: %s. ADM delivery is only available for Amazon platforms.", pushProvider);
                    return false;
                }
                break;
            case 1:
            case 2:
                if (pushProvider.getPlatform() != 2) {
                    C36059m.m148409e("Invalid Provider: %s. %s delivery is only available for Android platforms.", pushProvider.getDeliveryType(), pushProvider);
                    return false;
                }
                break;
        }
        return true;
    }
}
