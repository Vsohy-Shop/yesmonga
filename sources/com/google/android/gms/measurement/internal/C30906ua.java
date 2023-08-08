package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.C0348i1;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.carrefour.fid.android.shared.util.C28951s;
import com.google.android.gms.common.C40715h;
import com.google.android.gms.common.C40864j;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.common.util.C40981h;
import com.google.android.gms.common.wrappers.C41008d;
import com.google.android.gms.internal.measurement.C41864ae;
import com.google.android.gms.internal.measurement.C41977h1;
import com.google.android.gms.measurement.api.C30638a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.C32648f;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.urbanairship.AirshipConfigOptions;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.gms.measurement.internal.ua */
public final class C30906ua extends C30654a6 {

    /* renamed from: g */
    public static final String[] f74008g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    public static final String[] f74009h = {"_err"};

    /* renamed from: c */
    public SecureRandom f74010c;

    /* renamed from: d */
    public final AtomicLong f74011d = new AtomicLong(0);

    /* renamed from: e */
    public int f74012e;

    /* renamed from: f */
    public Integer f74013f = null;

    public C30906ua(C30731g5 g5Var) {
        super(g5Var);
    }

    /* renamed from: Y */
    public static boolean m124206Y(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(C32920e.f79928l);
    }

    /* renamed from: Z */
    public static boolean m124207Z(String str) {
        C40843u.m166198h(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public static boolean m124208a0(Context context) {
        ActivityInfo receiverInfo;
        C40843u.m166202l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: b0 */
    public static boolean m124209b0(Context context, boolean z) {
        C40843u.m166202l(context);
        return m124214k0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    /* renamed from: c0 */
    public static boolean m124210c0(String str) {
        if (f74009h[0].equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public static final boolean m124211f0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    @C40974d0
    /* renamed from: g0 */
    public static final boolean m124212g0(String str) {
        C40843u.m166202l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: j0 */
    public static boolean m124213j0(String str, String[] strArr) {
        C40843u.m166202l(strArr);
        for (String a : strArr) {
            if (C30882sa.m124169a(str, a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k0 */
    public static boolean m124214k0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @C40974d0
    /* renamed from: s0 */
    public static long m124215s0(byte[] bArr) {
        boolean z;
        C40843u.m166202l(bArr);
        int length = bArr.length;
        int i = 0;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166208r(z);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    /* renamed from: t */
    public static MessageDigest m124216t() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: v */
    public static ArrayList m124217v(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzac = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzac.f74147a);
            bundle.putString("origin", zzac.f74148b);
            bundle.putLong(C30638a.C30639a.f73204m, zzac.f74150d);
            bundle.putString("name", zzac.f74149c.f74168b);
            C30680c6.m123534b(bundle, C40843u.m166202l(zzac.f74149c.mo87644M()));
            bundle.putBoolean(C30638a.C30639a.f73205n, zzac.f74151e);
            String str = zzac.f74152f;
            if (str != null) {
                bundle.putString(C30638a.C30639a.f73195d, str);
            }
            zzaw zzaw = zzac.f74153g;
            if (zzaw != null) {
                bundle.putString(C30638a.C30639a.f73197f, zzaw.f74163a);
                zzau zzau = zzaw.f74164b;
                if (zzau != null) {
                    bundle.putBundle(C30638a.C30639a.f73198g, zzau.mo87634W());
                }
            }
            bundle.putLong(C30638a.C30639a.f73196e, zzac.f74154v);
            zzaw zzaw2 = zzac.f74155w;
            if (zzaw2 != null) {
                bundle.putString(C30638a.C30639a.f73199h, zzaw2.f74163a);
                zzau zzau2 = zzaw2.f74164b;
                if (zzau2 != null) {
                    bundle.putBundle(C30638a.C30639a.f73200i, zzau2.mo87634W());
                }
            }
            bundle.putLong(C30638a.C30639a.f73206o, zzac.f74149c.f74169c);
            bundle.putLong(C30638a.C30639a.f73201j, zzac.f74156x);
            zzaw zzaw3 = zzac.f74157y;
            if (zzaw3 != null) {
                bundle.putString(C30638a.C30639a.f73202k, zzaw3.f74163a);
                zzau zzau3 = zzaw3.f74164b;
                if (zzau3 != null) {
                    bundle.putBundle(C30638a.C30639a.f73203l, zzau3.mo87634W());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @C0348i1
    /* renamed from: y */
    public static void m124218y(C30903u7 u7Var, Bundle bundle, boolean z) {
        if (!(bundle == null || u7Var == null)) {
            if (!bundle.containsKey("_sc") || z) {
                String str = u7Var.f73993a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = u7Var.f73994b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", u7Var.f73995c);
                return;
            }
            z = false;
        }
        if (bundle != null && u7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: A */
    public final void mo87501A(Parcelable[] parcelableArr, int i, boolean z) {
        C40843u.m166202l(parcelableArr);
        for (Bundle bundle : parcelableArr) {
            int i2 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m124207Z(str) && !m124213j0(str, C30719f6.f73388d) && (i2 = i2 + 1) > i) {
                    if (z) {
                        this.f74136a.mo86903d().mo87490s().mo87465c("Param can't contain more than " + i + " item-scoped custom parameters", this.f74136a.mo87101D().mo87411e(str), this.f74136a.mo87101D().mo87408b(bundle));
                        m124211f0(bundle, 28);
                    } else {
                        this.f74136a.mo86903d().mo87490s().mo87465c("Param cannot contain item-scoped custom parameters", this.f74136a.mo87101D().mo87411e(str), this.f74136a.mo87101D().mo87408b(bundle));
                        m124211f0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    /* renamed from: B */
    public final void mo87502B(C30911v3 v3Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(v3Var.f74021d.keySet())) {
            if (m124207Z(str) && (i2 = i2 + 1) > i) {
                this.f74136a.mo86903d().mo87490s().mo87465c("Event can't contain more than " + i + " params", this.f74136a.mo87101D().mo87410d(v3Var.f74018a), this.f74136a.mo87101D().mo87408b(v3Var.f74021d));
                m124211f0(v3Var.f74021d, 5);
                v3Var.f74021d.remove(str);
            }
        }
    }

    /* renamed from: C */
    public final void mo87503C(C30894ta taVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m124211f0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        taVar.mo86905a(str, "_err", bundle);
    }

    /* renamed from: D */
    public final void mo87504D(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                this.f74136a.mo86903d().mo87495x().mo87465c("Not putting event parameter. Invalid value type. name, type", this.f74136a.mo87101D().mo87411e(str), str2);
            }
        }
    }

    /* renamed from: E */
    public final void mo87505E(C41977h1 h1Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(C28515a1.f68703k, z);
        try {
            h1Var.mo136499s6(bundle);
        } catch (RemoteException e) {
            this.f74136a.mo86903d().mo87494w().mo87464b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: F */
    public final void mo87506F(C41977h1 h1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(C28515a1.f68703k, arrayList);
        try {
            h1Var.mo136499s6(bundle);
        } catch (RemoteException e) {
            this.f74136a.mo86903d().mo87494w().mo87464b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: G */
    public final void mo87507G(C41977h1 h1Var, Bundle bundle) {
        try {
            h1Var.mo136499s6(bundle);
        } catch (RemoteException e) {
            this.f74136a.mo86903d().mo87494w().mo87464b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: H */
    public final void mo87508H(C41977h1 h1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(C28515a1.f68703k, bArr);
        try {
            h1Var.mo136499s6(bundle);
        } catch (RemoteException e) {
            this.f74136a.mo86903d().mo87494w().mo87464b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: I */
    public final void mo87509I(C41977h1 h1Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(C28515a1.f68703k, i);
        try {
            h1Var.mo136499s6(bundle);
        } catch (RemoteException e) {
            this.f74136a.mo86903d().mo87494w().mo87464b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: J */
    public final void mo87510J(C41977h1 h1Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(C28515a1.f68703k, j);
        try {
            h1Var.mo136499s6(bundle);
        } catch (RemoteException e) {
            this.f74136a.mo86903d().mo87494w().mo87464b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: K */
    public final void mo87511K(C41977h1 h1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(C28515a1.f68703k, str);
        try {
            h1Var.mo136499s6(bundle);
        } catch (RemoteException e) {
            this.f74136a.mo86903d().mo87494w().mo87464b("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: L */
    public final void mo87512L(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        String str4;
        int i3;
        int i4;
        String str5;
        int i5;
        String str6;
        int i6;
        String str7 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            C30725g z2 = this.f74136a.mo87130z();
            C41864ae.m169689b();
            String str8 = null;
            if (!z2.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73489B0) || !z2.f74136a.mo87110N().mo87524X(231100000, true)) {
                i = 0;
            } else {
                i = 35;
            }
            int i7 = 0;
            for (String str9 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str9)) {
                    if (!z) {
                        i6 = mo87533o0(str9);
                    } else {
                        i6 = 0;
                    }
                    if (i6 == 0) {
                        i6 = mo87531n0(str9);
                    }
                    i2 = i6;
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    if (i2 == 3) {
                        str6 = str9;
                    } else {
                        str6 = str8;
                    }
                    mo87547x(bundle, i2, str9, str9, str6);
                    bundle2.remove(str9);
                    i3 = i;
                    str4 = str8;
                } else {
                    if (mo87522V(bundle2.get(str9))) {
                        this.f74136a.mo86903d().mo87495x().mo87466d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str7, str3, str9);
                        i5 = 22;
                        str5 = str9;
                        i4 = i;
                    } else {
                        String str10 = str3;
                        str5 = str9;
                        i4 = i;
                        i5 = mo87515O(str, str2, str9, bundle2.get(str9), bundle, list, z, false);
                    }
                    if (i5 != 0 && !"_ev".equals(str5)) {
                        mo87547x(bundle, i5, str5, str5, bundle2.get(str5));
                        bundle2.remove(str5);
                    } else if (m124207Z(str5) && !m124213j0(str5, C30719f6.f73388d)) {
                        int i8 = i7 + 1;
                        if (!mo87524X(231100000, true)) {
                            this.f74136a.mo86903d().mo87490s().mo87465c("Item array not supported on client's version of Google Play Services (Android Only)", this.f74136a.mo87101D().mo87410d(str7), this.f74136a.mo87101D().mo87408b(bundle2));
                            m124211f0(bundle2, 23);
                            bundle2.remove(str5);
                            i3 = i4;
                        } else {
                            i3 = i4;
                            if (i8 > i3) {
                                C41864ae.m169689b();
                                str4 = null;
                                if (this.f74136a.mo87130z().mo87070B((String) null, C30742h3.f73489B0)) {
                                    this.f74136a.mo86903d().mo87490s().mo87465c("Item can't contain more than " + i3 + " item-scoped custom params", this.f74136a.mo87101D().mo87410d(str7), this.f74136a.mo87101D().mo87408b(bundle2));
                                    m124211f0(bundle2, 28);
                                    bundle2.remove(str5);
                                } else {
                                    this.f74136a.mo86903d().mo87490s().mo87465c("Item cannot contain custom parameters", this.f74136a.mo87101D().mo87410d(str7), this.f74136a.mo87101D().mo87408b(bundle2));
                                    m124211f0(bundle2, 23);
                                    bundle2.remove(str5);
                                }
                                i7 = i8;
                            }
                        }
                        str4 = null;
                        i7 = i8;
                    }
                    i3 = i4;
                    str4 = null;
                }
                i = i3;
                str8 = str4;
            }
        }
    }

    /* renamed from: M */
    public final boolean mo87513M(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m124212g0(str)) {
                return true;
            }
            if (this.f74136a.mo87125q()) {
                this.f74136a.mo86903d().mo87490s().mo87464b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C30899u3.m124186z(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f74136a.mo87125q()) {
                this.f74136a.mo86903d().mo87490s().mo87463a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (m124212g0(str2)) {
            return true;
        } else {
            this.f74136a.mo86903d().mo87490s().mo87464b("Invalid admob_app_id. Analytics disabled.", C30899u3.m124186z(str2));
            return false;
        }
    }

    /* renamed from: N */
    public final boolean mo87514N(String str, int i, String str2) {
        if (str2 == null) {
            this.f74136a.mo86903d().mo87490s().mo87464b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.f74136a.mo86903d().mo87490s().mo87466d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    @androidx.annotation.C0348i1
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo87515O(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            r13 = this;
            r7 = r13
            r8 = r16
            r0 = r17
            r1 = r18
            r13.mo86866h()
            boolean r2 = r13.mo87522V(r0)
            java.lang.String r3 = "param"
            r4 = 0
            if (r2 == 0) goto L_0x00ac
            if (r21 == 0) goto L_0x00a9
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.C30719f6.f73387c
            boolean r2 = m124213j0(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            com.google.android.gms.measurement.internal.g5 r2 = r7.f74136a
            com.google.android.gms.measurement.internal.d9 r2 = r2.mo87108L()
            r2.mo86866h()
            r2.mo86890i()
            boolean r5 = r2.mo87020B()
            if (r5 != 0) goto L_0x0033
            goto L_0x0045
        L_0x0033:
            com.google.android.gms.measurement.internal.g5 r2 = r2.f74136a
            com.google.android.gms.measurement.internal.ua r2 = r2.mo87110N()
            int r2 = r2.mo87537q0()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L_0x0045
            r0 = 25
            return r0
        L_0x0045:
            com.google.android.gms.measurement.internal.g5 r2 = r7.f74136a
            r2.mo87130z()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0053
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x005e
        L_0x0053:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x00ac
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x005e:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x00ac
            com.google.android.gms.measurement.internal.g5 r9 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r9 = r9.mo86903d()
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo87495x()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            r9.mo87466d(r10, r3, r8, r5)
            com.google.android.gms.measurement.internal.g5 r5 = r7.f74136a
            r5.mo87130z()
            r5 = 17
            if (r2 == 0) goto L_0x008e
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r9 = r2.length
            if (r9 <= r6) goto L_0x00a7
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a7
        L_0x008e:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a7
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r9 = r2.size()
            if (r9 <= r6) goto L_0x00a7
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r6)
            r9.<init>(r2)
            r1.putParcelableArrayList(r8, r9)
        L_0x00a7:
            r9 = r5
            goto L_0x00ad
        L_0x00a9:
            r0 = 21
            return r0
        L_0x00ac:
            r9 = r4
        L_0x00ad:
            boolean r1 = m124206Y(r15)
            if (r1 != 0) goto L_0x00c2
            boolean r1 = m124206Y(r16)
            if (r1 == 0) goto L_0x00ba
            goto L_0x00c2
        L_0x00ba:
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            r1.mo87130z()
            r1 = 100
            goto L_0x00c9
        L_0x00c2:
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            r1.mo87130z()
            r1 = 256(0x100, float:3.59E-43)
        L_0x00c9:
            boolean r1 = r13.mo87517Q(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00d0
            return r9
        L_0x00d0:
            if (r21 == 0) goto L_0x0160
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e7
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo87512L(r1, r2, r3, r4, r5, r6)
            goto L_0x015f
        L_0x00e7:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x011e
            r10 = r0
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r11 = r10.length
            r12 = r4
        L_0x00f0:
            if (r12 >= r11) goto L_0x015f
            r0 = r10[r12]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x010c
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r1 = r1.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87495x()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.mo87465c(r2, r0, r8)
            goto L_0x0160
        L_0x010c:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo87512L(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x00f0
        L_0x011e:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0160
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r11 = r10.size()
            r12 = r4
        L_0x012a:
            if (r12 >= r11) goto L_0x015f
            java.lang.Object r0 = r10.get(r12)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x014d
            com.google.android.gms.measurement.internal.g5 r1 = r7.f74136a
            com.google.android.gms.measurement.internal.u3 r1 = r1.mo86903d()
            com.google.android.gms.measurement.internal.s3 r1 = r1.mo87495x()
            if (r0 == 0) goto L_0x0145
            java.lang.Class r0 = r0.getClass()
            goto L_0x0147
        L_0x0145:
            java.lang.String r0 = "null"
        L_0x0147:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.mo87465c(r2, r0, r8)
            goto L_0x0160
        L_0x014d:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.mo87512L(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x012a
        L_0x015f:
            return r9
        L_0x0160:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30906ua.mo87515O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: P */
    public final boolean mo87516P(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f74136a.mo86903d().mo87490s().mo87464b("Name is required and can't be null. Type", str);
            return false;
        }
        C40843u.m166202l(str2);
        String[] strArr3 = f74008g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f74136a.mo86903d().mo87490s().mo87465c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m124213j0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m124213j0(str2, strArr2)) {
            return true;
        }
        this.f74136a.mo86903d().mo87490s().mo87465c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* renamed from: Q */
    public final boolean mo87517Q(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.f74136a.mo86903d().mo87495x().mo87466d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: R */
    public final boolean mo87518R(String str, String str2) {
        if (str2 == null) {
            this.f74136a.mo86903d().mo87490s().mo87464b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f74136a.mo86903d().mo87490s().mo87464b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f74136a.mo86903d().mo87490s().mo87465c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f74136a.mo86903d().mo87490s().mo87465c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: S */
    public final boolean mo87519S(String str, String str2) {
        if (str2 == null) {
            this.f74136a.mo86903d().mo87490s().mo87464b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f74136a.mo86903d().mo87490s().mo87464b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f74136a.mo86903d().mo87490s().mo87465c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f74136a.mo86903d().mo87490s().mo87465c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    @C0348i1
    /* renamed from: T */
    public final boolean mo87520T(String str) {
        mo86866h();
        if (C41008d.m166715a(this.f74136a.mo86902c()).mo134779a(str) == 0) {
            return true;
        }
        this.f74136a.mo86903d().mo87488q().mo87464b("Permission not granted", str);
        return false;
    }

    /* renamed from: U */
    public final boolean mo87521U(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = this.f74136a.mo87130z().mo87088u();
        this.f74136a.mo86901b();
        return u.equals(str);
    }

    /* renamed from: V */
    public final boolean mo87522V(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    @C40974d0
    /* renamed from: W */
    public final boolean mo87523W(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo f = C41008d.m166715a(context).mo134784f(str, 64);
            if (f == null || (signatureArr = f.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            this.f74136a.mo86903d().mo87489r().mo87464b("Error obtaining certificate", e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            this.f74136a.mo86903d().mo87489r().mo87464b("Package name not found", e2);
            return true;
        }
    }

    /* renamed from: X */
    public final boolean mo87524X(int i, boolean z) {
        Boolean J = this.f74136a.mo87108L().mo87026J();
        if (mo87537q0() >= i / 1000) {
            return true;
        }
        if (J == null) {
            return false;
        }
        if (!J.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    public final boolean mo87525d0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C40843u.m166202l(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        } else if (!isEmpty || !isEmpty2) {
            if (!isEmpty) {
                if (TextUtils.isEmpty(str4)) {
                    return false;
                }
                if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                    return true;
                }
                return false;
            } else if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            } else {
                return false;
            }
        } else if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (!TextUtils.isEmpty(str4)) {
                return true;
            }
            return false;
        } else if (!str3.equals(str4)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e0 */
    public final byte[] mo87526e0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: h0 */
    public final int mo87527h0(String str) {
        if ("_ldl".equals(str)) {
            this.f74136a.mo87130z();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f74136a.mo87130z();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.f74136a.mo87130z();
            return 100;
        } else {
            this.f74136a.mo87130z();
            return 36;
        }
    }

    @C0348i1
    /* renamed from: i */
    public final void mo86871i() {
        mo86866h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f74136a.mo86903d().mo87494w().mo87463a("Utils falling back to Random for random id");
            }
        }
        this.f74011d.set(nextLong);
    }

    /* renamed from: i0 */
    public final Object mo87528i0(int i, Object obj, boolean z, boolean z2) {
        long j;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            if (true != ((Boolean) obj).booleanValue()) {
                j = 0;
            } else {
                j = 1;
            }
            return Long.valueOf(j);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return mo87538r(obj.toString(), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle w0 = mo87546w0((Bundle) parcelable);
                    if (!w0.isEmpty()) {
                        arrayList.add(w0);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: j */
    public final boolean mo86872j() {
        return true;
    }

    /* renamed from: l0 */
    public final int mo87529l0(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = mo87517Q("user property referrer", str, mo87527h0(str), obj);
        } else {
            z = mo87517Q("user property", str, mo87527h0(str), obj);
        }
        if (z) {
            return 0;
        }
        return 7;
    }

    /* renamed from: m0 */
    public final int mo87530m0(String str) {
        if (!mo87518R("event", str)) {
            return 2;
        }
        if (!mo87516P("event", C30706e6.f73358a, C30706e6.f73359b, str)) {
            return 13;
        }
        this.f74136a.mo87130z();
        if (!mo87514N("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: n0 */
    public final int mo87531n0(String str) {
        if (!mo87518R("event param", str)) {
            return 3;
        }
        if (!mo87516P("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f74136a.mo87130z();
        if (!mo87514N("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: o */
    public final Object mo87532o(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.f74136a.mo87130z();
            return mo87528i0(256, obj, true, true);
        }
        if (m124206Y(str)) {
            this.f74136a.mo87130z();
        } else {
            this.f74136a.mo87130z();
            i = 100;
        }
        return mo87528i0(i, obj, false, true);
    }

    /* renamed from: o0 */
    public final int mo87533o0(String str) {
        if (!mo87519S("event param", str)) {
            return 3;
        }
        if (!mo87516P("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f74136a.mo87130z();
        if (!mo87514N("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: p */
    public final Object mo87534p(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return mo87528i0(mo87527h0(str), obj, true, false);
        }
        return mo87528i0(mo87527h0(str), obj, false, false);
    }

    /* renamed from: p0 */
    public final int mo87535p0(String str) {
        if (!mo87518R("user property", str)) {
            return 6;
        }
        if (!mo87516P("user property", C30732g6.f73458a, (String[]) null, str)) {
            return 15;
        }
        this.f74136a.mo87130z();
        if (!mo87514N("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* renamed from: q */
    public final String mo87536q() {
        byte[] bArr = new byte[16];
        mo87542u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* renamed from: q0 */
    public final int mo87537q0() {
        if (this.f74013f == null) {
            this.f74013f = Integer.valueOf(C40715h.m165670i().mo134221b(this.f74136a.mo86902c()) / 1000);
        }
        return this.f74013f.intValue();
    }

    /* renamed from: r */
    public final String mo87538r(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: r0 */
    public final int mo87539r0(int i) {
        return C40715h.m165670i().mo134209k(this.f74136a.mo86902c(), C40864j.f103985a);
    }

    /* renamed from: s */
    public final URL mo87540s(long j, String str, String str2, long j2) {
        try {
            C40843u.m166198h(str2);
            C40843u.m166198h(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{76003L, Integer.valueOf(mo87537q0())}), str2, str, Long.valueOf(j2)});
            if (str.equals(this.f74136a.mo87130z().mo87089v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f74136a.mo86903d().mo87489r().mo87464b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: t0 */
    public final long mo87541t0() {
        long andIncrement;
        long j;
        if (this.f74011d.get() == 0) {
            synchronized (this.f74011d) {
                long nextLong = new Random(System.nanoTime() ^ this.f74136a.mo86900a().mo134768a()).nextLong();
                int i = this.f74012e + 1;
                this.f74012e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f74011d) {
            this.f74011d.compareAndSet(-1, 1);
            andIncrement = this.f74011d.getAndIncrement();
        }
        return andIncrement;
    }

    @C0348i1
    @EnsuresNonNull({"this.secureRandom"})
    /* renamed from: u */
    public final SecureRandom mo87542u() {
        mo86866h();
        if (this.f74010c == null) {
            this.f74010c = new SecureRandom();
        }
        return this.f74010c;
    }

    /* renamed from: u0 */
    public final long mo87543u0(long j, long j2) {
        return (j + (j2 * AirshipConfigOptions.f87111Y)) / 86400000;
    }

    /* renamed from: v0 */
    public final Bundle mo87544v0(Uri uri, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Uri uri2 = uri;
        if (uri2 != null) {
            try {
                if (uri.isHierarchical()) {
                    str8 = uri2.getQueryParameter(C28951s.f70971h);
                    str7 = uri2.getQueryParameter(C28951s.f70969f);
                    str6 = uri2.getQueryParameter(C28951s.f70970g);
                    str5 = uri2.getQueryParameter("gclid");
                    str4 = uri2.getQueryParameter("utm_id");
                    str3 = uri2.getQueryParameter("dclid");
                    str2 = uri2.getQueryParameter("srsltid");
                    if (z) {
                        str = uri2.getQueryParameter("sfmc_id");
                    } else {
                        str = null;
                    }
                } else {
                    str8 = null;
                    str7 = null;
                    str6 = null;
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str8) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && (!z || TextUtils.isEmpty(str))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str8)) {
                    bundle.putString("campaign", str8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("source", str7);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("medium", str6);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("gclid", str5);
                }
                String queryParameter = uri2.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString(FirebaseAnalytics.C32532b.f78927O, queryParameter);
                }
                String queryParameter2 = uri2.getQueryParameter(C28951s.f70972i);
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri2.getQueryParameter(FirebaseAnalytics.C32532b.f78929Q);
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString(FirebaseAnalytics.C32532b.f78929Q, queryParameter3);
                }
                String queryParameter4 = uri2.getQueryParameter(FirebaseAnalytics.C32532b.f78930R);
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString(FirebaseAnalytics.C32532b.f78930R, queryParameter4);
                }
                String queryParameter5 = uri2.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("campaign_id", str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("dclid", str3);
                }
                String queryParameter6 = uri2.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri2.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri2.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("srsltid", str2);
                }
                if (z && !TextUtils.isEmpty(str)) {
                    bundle.putString("sfmc_id", str);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.f74136a.mo86903d().mo87494w().mo87464b("Install referrer url isn't a hierarchical URI", e);
                return null;
            }
        } else {
            return null;
        }
    }

    @C0348i1
    /* renamed from: w */
    public final void mo87545w(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f74136a.mo86903d().mo87494w().mo87464b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* renamed from: w0 */
    public final Bundle mo87546w0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object o = mo87532o(next, bundle.get(next));
                if (o == null) {
                    this.f74136a.mo86903d().mo87495x().mo87464b("Param value can't be null", this.f74136a.mo87101D().mo87411e(next));
                } else {
                    mo87504D(bundle2, next, o);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: x */
    public final void mo87547x(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m124211f0(bundle, i)) {
            this.f74136a.mo87130z();
            bundle.putString("_ev", mo87538r(str, 40, true));
            if (obj != null) {
                C40843u.m166202l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) obj.toString().length());
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108 A[SYNTHETIC] */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo87548x0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            r20 = this;
            r9 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.C30706e6.f73361d
            boolean r13 = m124213j0(r10, r0)
            if (r11 == 0) goto L_0x010d
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.g5 r0 = r9.f74136a
            com.google.android.gms.measurement.internal.g r0 = r0.mo87130z()
            int r8 = r0.mo87080m()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r23.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x0030:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0049
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r2 = r17
            goto L_0x0059
        L_0x0049:
            if (r25 != 0) goto L_0x0050
            int r0 = r9.mo87533o0(r7)
            goto L_0x0052
        L_0x0050:
            r0 = r17
        L_0x0052:
            if (r0 != 0) goto L_0x0058
            int r0 = r9.mo87531n0(r7)
        L_0x0058:
            r2 = r0
        L_0x0059:
            if (r2 == 0) goto L_0x006f
            r0 = 3
            if (r2 != r0) goto L_0x0060
            r5 = r7
            goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            r0 = r20
            r1 = r15
            r3 = r7
            r4 = r7
            r0.mo87547x(r1, r2, r3, r4, r5)
            r15.remove(r7)
            r14 = r8
            goto L_0x0108
        L_0x006f:
            java.lang.Object r4 = r11.get(r7)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r7
            r5 = r15
            r6 = r24
            r19 = r7
            r7 = r25
            r14 = r8
            r8 = r13
            int r2 = r0.mo87515O(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 17
            if (r2 != r0) goto L_0x009a
            r2 = 17
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0 = r20
            r1 = r15
            r3 = r19
            r4 = r19
            r0.mo87547x(r1, r2, r3, r4, r5)
            goto L_0x00bc
        L_0x009a:
            if (r2 == 0) goto L_0x00bc
            java.lang.String r0 = "_ev"
            r6 = r19
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00be
            r0 = 21
            if (r2 != r0) goto L_0x00ac
            r3 = r10
            goto L_0x00ad
        L_0x00ac:
            r3 = r6
        L_0x00ad:
            java.lang.Object r5 = r11.get(r6)
            r0 = r20
            r1 = r15
            r4 = r6
            r0.mo87547x(r1, r2, r3, r4, r5)
            r15.remove(r6)
            goto L_0x0108
        L_0x00bc:
            r6 = r19
        L_0x00be:
            boolean r0 = m124207Z(r6)
            if (r0 == 0) goto L_0x0108
            int r0 = r18 + 1
            if (r0 <= r14) goto L_0x0106
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.g5 r2 = r9.f74136a
            com.google.android.gms.measurement.internal.u3 r2 = r2.mo86903d()
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo87490s()
            com.google.android.gms.measurement.internal.g5 r3 = r9.f74136a
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo87101D()
            java.lang.String r3 = r3.mo87410d(r10)
            com.google.android.gms.measurement.internal.g5 r4 = r9.f74136a
            com.google.android.gms.measurement.internal.p3 r4 = r4.mo87101D()
            java.lang.String r4 = r4.mo87408b(r11)
            r2.mo87465c(r1, r3, r4)
            r1 = 5
            m124211f0(r15, r1)
            r15.remove(r6)
        L_0x0106:
            r18 = r0
        L_0x0108:
            r8 = r14
            goto L_0x0030
        L_0x010b:
            r14 = r15
            goto L_0x010e
        L_0x010d:
            r14 = 0
        L_0x010e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C30906ua.mo87548x0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* renamed from: y0 */
    public final zzaw mo87549y0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo87530m0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString(C32648f.f79204c, str3);
            Bundle x0 = mo87548x0(str, str2, bundle3, C40981h.m166622c(C32648f.f79204c), true);
            if (z) {
                x0 = mo87546w0(x0);
            }
            C40843u.m166202l(x0);
            return new zzaw(str2, new zzau(x0), str3, j);
        }
        this.f74136a.mo86903d().mo87489r().mo87464b("Invalid conditional property event name", this.f74136a.mo87101D().mo87412f(str2));
        throw new IllegalArgumentException();
    }

    /* renamed from: z */
    public final void mo87550z(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    this.f74136a.mo87110N().mo87504D(bundle, next, bundle2.get(next));
                }
            }
        }
    }
}
