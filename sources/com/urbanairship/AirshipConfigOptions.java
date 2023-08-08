package com.urbanairship;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0351j1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import com.urbanairship.push.PushProvider;
import com.urbanairship.util.C9655i0;
import com.urbanairship.util.C9669o0;
import com.urbanairship.util.C9678s0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;

public class AirshipConfigOptions {
    @C0359n0

    /* renamed from: G */
    public static final String f87093G = "in_app_automation";
    @C0359n0

    /* renamed from: H */
    public static final String f87094H = "tags_and_attributes";
    @C0359n0

    /* renamed from: I */
    public static final String f87095I = "message_center";
    @C0359n0

    /* renamed from: J */
    public static final String f87096J = "analytics";
    @C0359n0

    /* renamed from: K */
    public static final String f87097K = "push";
    @C0359n0

    /* renamed from: L */
    public static final String f87098L = "chat";
    @C0359n0

    /* renamed from: M */
    public static final String f87099M = "contacts";
    @C0359n0

    /* renamed from: N */
    public static final String f87100N = "location";
    @C0359n0

    /* renamed from: O */
    public static final String f87101O = "none";
    @C0359n0

    /* renamed from: P */
    public static final String f87102P = "all";

    /* renamed from: Q */
    public static final String f87103Q = "https://device-api.asnapieu.com/";

    /* renamed from: R */
    public static final String f87104R = "https://combine.asnapieu.com/";

    /* renamed from: S */
    public static final String f87105S = "https://remote-data.asnapieu.com/";

    /* renamed from: T */
    public static final String f87106T = "https://wallet-api.asnapieu.com";

    /* renamed from: U */
    public static final String f87107U = "https://device-api.urbanairship.com/";

    /* renamed from: V */
    public static final String f87108V = "https://combine.urbanairship.com/";

    /* renamed from: W */
    public static final String f87109W = "https://remote-data.urbanairship.com/";

    /* renamed from: X */
    public static final String f87110X = "https://wallet-api.urbanairship.com";

    /* renamed from: Y */
    public static final long f87111Y = 60000;

    /* renamed from: Z */
    public static final long f87112Z = 86400000;

    /* renamed from: a0 */
    public static final int f87113a0 = 6;

    /* renamed from: b0 */
    public static final int f87114b0 = 3;

    /* renamed from: c0 */
    public static final long f87115c0 = 86400000;

    /* renamed from: d0 */
    public static final Pattern f87116d0 = Pattern.compile("^[a-zA-Z0-9\\-_]{22}$");
    @C0359n0

    /* renamed from: e0 */
    public static final String f87117e0 = "US";
    @C0359n0

    /* renamed from: f0 */
    public static final String f87118f0 = "EU";
    @C0359n0

    /* renamed from: g0 */
    public static final String f87119g0 = "ADM";
    @C0359n0

    /* renamed from: h0 */
    public static final String f87120h0 = "FCM";
    @C0359n0

    /* renamed from: i0 */
    public static final String f87121i0 = "HMS";
    @C0363p0

    /* renamed from: A */
    public final String f87122A;

    /* renamed from: B */
    public final boolean f87123B;

    /* renamed from: C */
    public final boolean f87124C;
    @C0363p0

    /* renamed from: D */
    public final String f87125D;
    @C0363p0

    /* renamed from: E */
    public final String f87126E;
    @C0363p0

    /* renamed from: F */
    public final boolean f87127F;
    @C0359n0

    /* renamed from: a */
    public final String f87128a;
    @C0359n0

    /* renamed from: b */
    public final String f87129b;
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: c */
    public final String f87130c;
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: d */
    public final String f87131d;
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: e */
    public final String f87132e;
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: f */
    public final String f87133f;
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: g */
    public final String f87134g;
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: h */
    public final String f87135h;
    @C0363p0

    /* renamed from: i */
    public final Uri f87136i;
    @C0359n0

    /* renamed from: j */
    public final List<String> f87137j;
    @C0363p0

    /* renamed from: k */
    public final PushProvider f87138k;
    @C0359n0

    /* renamed from: l */
    public final List<String> f87139l;
    @C0359n0

    /* renamed from: m */
    public final List<String> f87140m;
    @C0359n0

    /* renamed from: n */
    public final List<String> f87141n;

    /* renamed from: o */
    public final boolean f87142o;

    /* renamed from: p */
    public final long f87143p;

    /* renamed from: q */
    public final int f87144q;

    /* renamed from: r */
    public final boolean f87145r;

    /* renamed from: s */
    public final boolean f87146s;

    /* renamed from: t */
    public final boolean f87147t;
    @Deprecated

    /* renamed from: u */
    public final boolean f87148u;

    /* renamed from: v */
    public final int f87149v;

    /* renamed from: w */
    public final boolean f87150w;
    @C0375v

    /* renamed from: x */
    public final int f87151x;
    @C0375v

    /* renamed from: y */
    public final int f87152y;
    @C0354l

    /* renamed from: z */
    public final int f87153z;

    public static class ConfigException extends Exception {
        public ConfigException(@C0359n0 String str, @C0363p0 Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: com.urbanairship.AirshipConfigOptions$b */
    public static final class C35437b {

        /* renamed from: A0 */
        public static final String f87154A0 = "developmentFcmSenderId";

        /* renamed from: B0 */
        public static final String f87155B0 = "customPushProvider";

        /* renamed from: C0 */
        public static final String f87156C0 = "appStoreUri";

        /* renamed from: D0 */
        public static final String f87157D0 = "site";

        /* renamed from: E0 */
        public static final String f87158E0 = "dataCollectionOptInEnabled";

        /* renamed from: F0 */
        public static final String f87159F0 = "extendedBroadcastsEnabled";

        /* renamed from: G0 */
        public static final String f87160G0 = "suppressAllowListError";

        /* renamed from: H0 */
        public static final String f87161H0 = "requireInitialRemoteConfigEnabled";

        /* renamed from: I0 */
        public static final String f87162I0 = "enabledFeatures";

        /* renamed from: J0 */
        public static final String f87163J0 = "initialConfigUrl";

        /* renamed from: K0 */
        public static final String f87164K0 = "isPromptForPermissionOnUserNotificationsEnabled";

        /* renamed from: O */
        public static final String f87165O = "airshipconfig.properties";

        /* renamed from: P */
        public static final String f87166P = "AirshipConfigOptions";

        /* renamed from: Q */
        public static final String f87167Q = "appKey";

        /* renamed from: R */
        public static final String f87168R = "appSecret";

        /* renamed from: S */
        public static final String f87169S = "productionAppKey";

        /* renamed from: T */
        public static final String f87170T = "productionAppSecret";

        /* renamed from: U */
        public static final String f87171U = "developmentAppKey";

        /* renamed from: V */
        public static final String f87172V = "developmentAppSecret";

        /* renamed from: W */
        public static final String f87173W = "hostURL";

        /* renamed from: X */
        public static final String f87174X = "deviceUrl";

        /* renamed from: Y */
        public static final String f87175Y = "analyticsServer";

        /* renamed from: Z */
        public static final String f87176Z = "analyticsUrl";

        /* renamed from: a0 */
        public static final String f87177a0 = "remoteDataURL";

        /* renamed from: b0 */
        public static final String f87178b0 = "remoteDataUrl";

        /* renamed from: c0 */
        public static final String f87179c0 = "chatUrl";

        /* renamed from: d0 */
        public static final String f87180d0 = "chatSocketUrl";

        /* renamed from: e0 */
        public static final String f87181e0 = "gcmSender";

        /* renamed from: f0 */
        public static final String f87182f0 = "allowedTransports";

        /* renamed from: g0 */
        public static final String f87183g0 = "urlAllowList";

        /* renamed from: h0 */
        public static final String f87184h0 = "urlAllowListScopeJavaScriptInterface";

        /* renamed from: i0 */
        public static final String f87185i0 = "urlAllowListScopeOpenUrl";

        /* renamed from: j0 */
        public static final String f87186j0 = "inProduction";

        /* renamed from: k0 */
        public static final String f87187k0 = "analyticsEnabled";

        /* renamed from: l0 */
        public static final String f87188l0 = "backgroundReportingIntervalMS";

        /* renamed from: m0 */
        public static final String f87189m0 = "developmentLogLevel";

        /* renamed from: n0 */
        public static final String f87190n0 = "productionLogLevel";

        /* renamed from: o0 */
        public static final String f87191o0 = "logLevel";

        /* renamed from: p0 */
        public static final String f87192p0 = "autoLaunchApplication";

        /* renamed from: q0 */
        public static final String f87193q0 = "channelCreationDelayEnabled";

        /* renamed from: r0 */
        public static final String f87194r0 = "channelCaptureEnabled";

        /* renamed from: s0 */
        public static final String f87195s0 = "notificationIcon";

        /* renamed from: t0 */
        public static final String f87196t0 = "notificationLargeIcon";

        /* renamed from: u0 */
        public static final String f87197u0 = "notificationAccentColor";

        /* renamed from: v0 */
        public static final String f87198v0 = "walletUrl";

        /* renamed from: w0 */
        public static final String f87199w0 = "notificationChannel";

        /* renamed from: x0 */
        public static final String f87200x0 = "fcmFirebaseAppName";

        /* renamed from: y0 */
        public static final String f87201y0 = "fcmSenderId";

        /* renamed from: z0 */
        public static final String f87202z0 = "productionFcmSenderId";

        /* renamed from: A */
        public int f87203A = 0;

        /* renamed from: B */
        public String f87204B;

        /* renamed from: C */
        public String f87205C;

        /* renamed from: D */
        public PushProvider f87206D;

        /* renamed from: E */
        public Uri f87207E;

        /* renamed from: F */
        public boolean f87208F;

        /* renamed from: G */
        public boolean f87209G;

        /* renamed from: H */
        public String f87210H = AirshipConfigOptions.f87117e0;

        /* renamed from: I */
        public int f87211I = 255;

        /* renamed from: J */
        public boolean f87212J = false;

        /* renamed from: K */
        public boolean f87213K = true;

        /* renamed from: L */
        public String f87214L;

        /* renamed from: M */
        public String f87215M;

        /* renamed from: N */
        public boolean f87216N = true;

        /* renamed from: a */
        public String f87217a;

        /* renamed from: b */
        public String f87218b;

        /* renamed from: c */
        public String f87219c;

        /* renamed from: d */
        public String f87220d;

        /* renamed from: e */
        public String f87221e;

        /* renamed from: f */
        public String f87222f;

        /* renamed from: g */
        public String f87223g;

        /* renamed from: h */
        public String f87224h;

        /* renamed from: i */
        public String f87225i;

        /* renamed from: j */
        public String f87226j;

        /* renamed from: k */
        public String f87227k;

        /* renamed from: l */
        public List<String> f87228l = new ArrayList(Arrays.asList(new String[]{AirshipConfigOptions.f87119g0, "FCM", AirshipConfigOptions.f87121i0}));

        /* renamed from: m */
        public List<String> f87229m = new ArrayList();

        /* renamed from: n */
        public List<String> f87230n = new ArrayList();

        /* renamed from: o */
        public List<String> f87231o = new ArrayList();

        /* renamed from: p */
        public Boolean f87232p = null;

        /* renamed from: q */
        public boolean f87233q = true;

        /* renamed from: r */
        public long f87234r = 86400000;

        /* renamed from: s */
        public Integer f87235s;

        /* renamed from: t */
        public Integer f87236t;

        /* renamed from: u */
        public Integer f87237u;

        /* renamed from: v */
        public boolean f87238v = true;

        /* renamed from: w */
        public boolean f87239w = false;

        /* renamed from: x */
        public boolean f87240x = true;

        /* renamed from: y */
        public int f87241y;

        /* renamed from: z */
        public int f87242z;

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: A0 */
        public C35437b mo106142A0(@C0363p0 String str) {
            this.f87225i = str;
            return this;
        }

        @C0359n0
        /* renamed from: B0 */
        public C35437b mo106143B0(boolean z) {
            this.f87213K = z;
            return this;
        }

        @C0359n0
        /* renamed from: C0 */
        public C35437b mo106144C0(@C0359n0 String str) {
            this.f87210H = str;
            return this;
        }

        @C0359n0
        /* renamed from: D0 */
        public C35437b mo106145D0(boolean z) {
            this.f87212J = z;
            return this;
        }

        @C0359n0
        /* renamed from: E0 */
        public C35437b mo106146E0(@C0363p0 String[] strArr) {
            this.f87229m.clear();
            if (strArr != null) {
                this.f87229m.addAll(Arrays.asList(strArr));
            }
            return this;
        }

        @C0359n0
        /* renamed from: F0 */
        public C35437b mo106147F0(@C0363p0 String[] strArr) {
            this.f87230n.clear();
            if (strArr != null) {
                this.f87230n.addAll(Arrays.asList(strArr));
            }
            return this;
        }

        @C0359n0
        /* renamed from: G0 */
        public C35437b mo106148G0(@C0363p0 String[] strArr) {
            this.f87231o.clear();
            if (strArr != null) {
                this.f87231o.addAll(Arrays.asList(strArr));
            }
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: H0 */
        public C35437b mo106149H0(@C0359n0 String str) {
            this.f87204B = str;
            return this;
        }

        @C0359n0
        /* renamed from: I0 */
        public C35437b mo106150I0(@C0359n0 Context context, @C0351j1 int i) throws Exception {
            C9678s0 s0Var = null;
            try {
                s0Var = C9678s0.m36243l(context, i, f87166P);
                mo106155N(context, s0Var);
                if (s0Var != null) {
                    s0Var.close();
                }
                return this;
            } catch (Exception e) {
                throw new ConfigException("Unable to apply config from xml.", e);
            } catch (Throwable th) {
                if (s0Var != null) {
                    s0Var.close();
                }
                throw th;
            }
        }

        @C0359n0
        /* renamed from: J0 */
        public C35437b mo106151J0(@C0359n0 Context context) throws ConfigException {
            return mo106152K0(context, f87165O);
        }

        @C0359n0
        /* renamed from: K0 */
        public C35437b mo106152K0(@C0359n0 Context context, @C0359n0 String str) throws ConfigException {
            try {
                mo106155N(context, C9655i0.m36167e(context, str));
                return this;
            } catch (Exception e) {
                throw new ConfigException("Unable to apply config from file " + str, e);
            }
        }

        @C0359n0
        /* renamed from: L0 */
        public C35437b mo106153L0(@C0359n0 Context context, @C0359n0 Properties properties) throws ConfigException {
            try {
                mo106155N(context, C9655i0.m36168h(context, properties));
                return this;
            } catch (Exception e) {
                throw new ConfigException("Unable to apply config.", e);
            }
        }

        @C0359n0
        /* renamed from: M */
        public C35437b mo106154M(@C0359n0 Context context, @C0351j1 int i) {
            try {
                mo106150I0(context, i);
            } catch (Exception e) {
                C36059m.m148410f(e);
            }
            return this;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo106155N(android.content.Context r9, com.urbanairship.util.C9660l r10) {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L_0x0002:
                int r2 = r10.getCount()
                if (r1 >= r2) goto L_0x047c
                r2 = 1
                java.lang.String r3 = r10.getName(r1)     // Catch:{ Exception -> 0x046a }
                if (r3 != 0) goto L_0x0011
                goto L_0x0478
            L_0x0011:
                int r4 = r3.hashCode()     // Catch:{ Exception -> 0x046a }
                r5 = 3
                r6 = 6
                r7 = -1
                switch(r4) {
                    case -2131444128: goto L_0x024d;
                    case -1829910004: goto L_0x0242;
                    case -1776171144: goto L_0x0238;
                    case -1720015653: goto L_0x022d;
                    case -1666958035: goto L_0x0222;
                    case -1653850041: goto L_0x0217;
                    case -1597596356: goto L_0x020c;
                    case -1565695247: goto L_0x0201;
                    case -1565320553: goto L_0x01f7;
                    case -1554123216: goto L_0x01eb;
                    case -1411093378: goto L_0x01e0;
                    case -1387253559: goto L_0x01d4;
                    case -1285301710: goto L_0x01c8;
                    case -1266098791: goto L_0x01bd;
                    case -1249058386: goto L_0x01b1;
                    case -1106202922: goto L_0x01a5;
                    case -1049518103: goto L_0x0199;
                    case -956504956: goto L_0x018d;
                    case -874660855: goto L_0x0181;
                    case -516160866: goto L_0x0175;
                    case -398391045: goto L_0x0169;
                    case -361592578: goto L_0x015d;
                    case -318159706: goto L_0x0151;
                    case -187695495: goto L_0x0145;
                    case -116200981: goto L_0x0139;
                    case -93122203: goto L_0x012d;
                    case 3530567: goto L_0x0121;
                    case 24145854: goto L_0x0115;
                    case 25200441: goto L_0x010a;
                    case 233293225: goto L_0x00fe;
                    case 282201398: goto L_0x00f3;
                    case 290002134: goto L_0x00e7;
                    case 476084841: goto L_0x00db;
                    case 739105527: goto L_0x00cf;
                    case 770975322: goto L_0x00c3;
                    case 988154272: goto L_0x00b7;
                    case 1065256263: goto L_0x00ab;
                    case 1098683047: goto L_0x00a0;
                    case 1465076406: goto L_0x0094;
                    case 1485559857: goto L_0x0089;
                    case 1505552078: goto L_0x007d;
                    case 1579823829: goto L_0x0071;
                    case 1611189252: goto L_0x0065;
                    case 1779744152: goto L_0x0059;
                    case 1790788391: goto L_0x004d;
                    case 1855914712: goto L_0x0041;
                    case 1958618687: goto L_0x0035;
                    case 1958619711: goto L_0x0029;
                    case 1995731616: goto L_0x001d;
                    default: goto L_0x001b;
                }     // Catch:{ Exception -> 0x046a }
            L_0x001b:
                goto L_0x0258
            L_0x001d:
                java.lang.String r4 = "logLevel"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 26
                goto L_0x0259
            L_0x0029:
                java.lang.String r4 = "remoteDataUrl"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 11
                goto L_0x0259
            L_0x0035:
                java.lang.String r4 = "remoteDataURL"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 10
                goto L_0x0259
            L_0x0041:
                java.lang.String r4 = "urlAllowList"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 18
                goto L_0x0259
            L_0x004d:
                java.lang.String r4 = "productionFcmSenderId"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 37
                goto L_0x0259
            L_0x0059:
                java.lang.String r4 = "notificationChannel"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 34
                goto L_0x0259
            L_0x0065:
                java.lang.String r4 = "notificationIcon"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 30
                goto L_0x0259
            L_0x0071:
                java.lang.String r4 = "fcmFirebaseAppName"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 38
                goto L_0x0259
            L_0x007d:
                java.lang.String r4 = "notificationAccentColor"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 32
                goto L_0x0259
            L_0x0089:
                java.lang.String r4 = "appSecret"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = r2
                goto L_0x0259
            L_0x0094:
                java.lang.String r4 = "walletUrl"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 33
                goto L_0x0259
            L_0x00a0:
                java.lang.String r4 = "hostURL"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = r6
                goto L_0x0259
            L_0x00ab:
                java.lang.String r4 = "enableUrlWhitelisting"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 39
                goto L_0x0259
            L_0x00b7:
                java.lang.String r4 = "fcmSenderId"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 35
                goto L_0x0259
            L_0x00c3:
                java.lang.String r4 = "requireInitialRemoteConfigEnabled"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 46
                goto L_0x0259
            L_0x00cf:
                java.lang.String r4 = "chatUrl"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 13
                goto L_0x0259
            L_0x00db:
                java.lang.String r4 = "analyticsServer"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 8
                goto L_0x0259
            L_0x00e7:
                java.lang.String r4 = "suppressAllowListError"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 45
                goto L_0x0259
            L_0x00f3:
                java.lang.String r4 = "developmentAppSecret"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 5
                goto L_0x0259
            L_0x00fe:
                java.lang.String r4 = "notificationLargeIcon"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 31
                goto L_0x0259
            L_0x010a:
                java.lang.String r4 = "deviceUrl"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 7
                goto L_0x0259
            L_0x0115:
                java.lang.String r4 = "inProduction"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 21
                goto L_0x0259
            L_0x0121:
                java.lang.String r4 = "site"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 42
                goto L_0x0259
            L_0x012d:
                java.lang.String r4 = "developmentFcmSenderId"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 36
                goto L_0x0259
            L_0x0139:
                java.lang.String r4 = "backgroundReportingIntervalMS"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 23
                goto L_0x0259
            L_0x0145:
                java.lang.String r4 = "productionLogLevel"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 25
                goto L_0x0259
            L_0x0151:
                java.lang.String r4 = "gcmSender"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 15
                goto L_0x0259
            L_0x015d:
                java.lang.String r4 = "channelCaptureEnabled"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 29
                goto L_0x0259
            L_0x0169:
                java.lang.String r4 = "developmentLogLevel"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 24
                goto L_0x0259
            L_0x0175:
                java.lang.String r4 = "enabledFeatures"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 48
                goto L_0x0259
            L_0x0181:
                java.lang.String r4 = "analyticsUrl"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 9
                goto L_0x0259
            L_0x018d:
                java.lang.String r4 = "chatSocketUrl"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 14
                goto L_0x0259
            L_0x0199:
                java.lang.String r4 = "initialConfigUrl"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 12
                goto L_0x0259
            L_0x01a5:
                java.lang.String r4 = "extendedBroadcastsEnabled"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 44
                goto L_0x0259
            L_0x01b1:
                java.lang.String r4 = "autoLaunchApplication"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 27
                goto L_0x0259
            L_0x01bd:
                java.lang.String r4 = "developmentAppKey"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 4
                goto L_0x0259
            L_0x01c8:
                java.lang.String r4 = "allowedTransports"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 16
                goto L_0x0259
            L_0x01d4:
                java.lang.String r4 = "urlAllowListScopeOpenUrl"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 20
                goto L_0x0259
            L_0x01e0:
                java.lang.String r4 = "appKey"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = r0
                goto L_0x0259
            L_0x01eb:
                java.lang.String r4 = "urlAllowListScopeJavaScriptInterface"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 19
                goto L_0x0259
            L_0x01f7:
                java.lang.String r4 = "productionAppKey"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 2
                goto L_0x0259
            L_0x0201:
                java.lang.String r4 = "dataCollectionOptInEnabled"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 43
                goto L_0x0259
            L_0x020c:
                java.lang.String r4 = "customPushProvider"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 40
                goto L_0x0259
            L_0x0217:
                java.lang.String r4 = "whitelist"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 17
                goto L_0x0259
            L_0x0222:
                java.lang.String r4 = "isPromptForPermissionOnUserNotificationsEnabled"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 47
                goto L_0x0259
            L_0x022d:
                java.lang.String r4 = "analyticsEnabled"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 22
                goto L_0x0259
            L_0x0238:
                java.lang.String r4 = "productionAppSecret"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = r5
                goto L_0x0259
            L_0x0242:
                java.lang.String r4 = "appStoreUri"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 41
                goto L_0x0259
            L_0x024d:
                java.lang.String r4 = "channelCreationDelayEnabled"
                boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0258
                r4 = 28
                goto L_0x0259
            L_0x0258:
                r4 = r7
            L_0x0259:
                switch(r4) {
                    case 0: goto L_0x0462;
                    case 1: goto L_0x045a;
                    case 2: goto L_0x0452;
                    case 3: goto L_0x044a;
                    case 4: goto L_0x0442;
                    case 5: goto L_0x043a;
                    case 6: goto L_0x0430;
                    case 7: goto L_0x0430;
                    case 8: goto L_0x0426;
                    case 9: goto L_0x0426;
                    case 10: goto L_0x041c;
                    case 11: goto L_0x041c;
                    case 12: goto L_0x0413;
                    case 13: goto L_0x0409;
                    case 14: goto L_0x03fe;
                    case 15: goto L_0x03f6;
                    case 16: goto L_0x03ed;
                    case 17: goto L_0x03dd;
                    case 18: goto L_0x03d4;
                    case 19: goto L_0x03cb;
                    case 20: goto L_0x03c2;
                    case 21: goto L_0x03ac;
                    case 22: goto L_0x03a1;
                    case 23: goto L_0x0396;
                    case 24: goto L_0x0389;
                    case 25: goto L_0x037c;
                    case 26: goto L_0x036f;
                    case 27: goto L_0x0364;
                    case 28: goto L_0x0359;
                    case 29: goto L_0x034e;
                    case 30: goto L_0x0345;
                    case 31: goto L_0x033c;
                    case 32: goto L_0x0331;
                    case 33: goto L_0x0326;
                    case 34: goto L_0x031d;
                    case 35: goto L_0x0314;
                    case 36: goto L_0x0314;
                    case 37: goto L_0x0314;
                    case 38: goto L_0x030b;
                    case 39: goto L_0x0302;
                    case 40: goto L_0x02e4;
                    case 41: goto L_0x02d7;
                    case 42: goto L_0x02ca;
                    case 43: goto L_0x02c1;
                    case 44: goto L_0x02b8;
                    case 45: goto L_0x02af;
                    case 46: goto L_0x02a6;
                    case 47: goto L_0x029d;
                    case 48: goto L_0x025e;
                    default: goto L_0x025c;
                }
            L_0x025c:
                goto L_0x0478
            L_0x025e:
                int r4 = r10.mo19610c(r3, r7)     // Catch:{ Exception -> 0x0263 }
                goto L_0x0264
            L_0x0263:
                r4 = r7
            L_0x0264:
                if (r4 == r7) goto L_0x026f
                int[] r3 = new int[r2]     // Catch:{ Exception -> 0x046a }
                r3[r0] = r4     // Catch:{ Exception -> 0x046a }
                r8.mo106180m0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x026f:
                java.lang.String[] r4 = r10.mo19612f(r3)     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x0282
                int r3 = r8.mo106160S(r4)     // Catch:{ Exception -> 0x046a }
                int[] r4 = new int[r2]     // Catch:{ Exception -> 0x046a }
                r4[r0] = r3     // Catch:{ Exception -> 0x046a }
                r8.mo106180m0(r4)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0282:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x046a }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x046a }
                r5.<init>()     // Catch:{ Exception -> 0x046a }
                java.lang.String r6 = "Unable to parse enableFeatures: "
                r5.append(r6)     // Catch:{ Exception -> 0x046a }
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                r5.append(r3)     // Catch:{ Exception -> 0x046a }
                java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x046a }
                r4.<init>(r3)     // Catch:{ Exception -> 0x046a }
                throw r4     // Catch:{ Exception -> 0x046a }
            L_0x029d:
                boolean r3 = r10.mo19609b(r3, r2)     // Catch:{ Exception -> 0x046a }
                r8.mo106185r0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x02a6:
                boolean r3 = r10.mo19609b(r3, r0)     // Catch:{ Exception -> 0x046a }
                r8.mo106143B0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x02af:
                boolean r3 = r10.mo19609b(r3, r0)     // Catch:{ Exception -> 0x046a }
                r8.mo106145D0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x02b8:
                boolean r3 = r10.mo19609b(r3, r0)     // Catch:{ Exception -> 0x046a }
                r8.mo106181n0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x02c1:
                boolean r3 = r10.mo19609b(r3, r0)     // Catch:{ Exception -> 0x046a }
                r8.mo106175h0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x02ca:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                java.lang.String r3 = com.urbanairship.AirshipConfigOptions.m146046f(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106144C0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x02d7:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106167Z(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x02e4:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                java.lang.String r4 = "Missing custom push provider class name"
                com.urbanairship.util.C9654i.m36166b(r3, r4)     // Catch:{ Exception -> 0x046a }
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x046a }
                java.lang.Class<com.urbanairship.push.PushProvider> r4 = com.urbanairship.push.PushProvider.class
                java.lang.Class r3 = r3.asSubclass(r4)     // Catch:{ Exception -> 0x046a }
                java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x046a }
                com.urbanairship.push.PushProvider r3 = (com.urbanairship.push.PushProvider) r3     // Catch:{ Exception -> 0x046a }
                r8.mo106174g0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0302:
                java.lang.String r3 = "Parameter enableUrlWhitelisting has been removed. See urlAllowListScopeJavaScriptBridge and urlAllowListScopeOpen instead."
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x046a }
                com.urbanairship.C36059m.m148409e(r3, r4)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x030b:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106182o0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0314:
                java.lang.String r3 = "Support for Sender ID override has been removed. Configure a FirebaseApp and use fcmFirebaseAppName instead."
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x046a }
                com.urbanairship.C36059m.m148409e(r3, r4)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x031d:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106188u0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0326:
                java.lang.String r4 = r8.f87204B     // Catch:{ Exception -> 0x046a }
                java.lang.String r3 = r10.mo19618k(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106149H0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0331:
                int r4 = r8.f87203A     // Catch:{ Exception -> 0x046a }
                int r3 = r10.mo19617j(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106187t0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x033c:
                int r3 = r10.mo19616i(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106190w0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0345:
                int r3 = r10.mo19616i(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106189v0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x034e:
                boolean r4 = r8.f87240x     // Catch:{ Exception -> 0x046a }
                boolean r3 = r10.mo19609b(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106170c0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0359:
                boolean r4 = r8.f87239w     // Catch:{ Exception -> 0x046a }
                boolean r3 = r10.mo19609b(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106171d0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0364:
                boolean r4 = r8.f87238v     // Catch:{ Exception -> 0x046a }
                boolean r3 = r10.mo19609b(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106168a0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x036f:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                int r3 = com.urbanairship.C36059m.m148415k(r3, r6)     // Catch:{ Exception -> 0x046a }
                r8.mo106186s0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x037c:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                int r3 = com.urbanairship.C36059m.m148415k(r3, r6)     // Catch:{ Exception -> 0x046a }
                r8.mo106193z0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0389:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                int r3 = com.urbanairship.C36059m.m148415k(r3, r5)     // Catch:{ Exception -> 0x046a }
                r8.mo106178k0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0396:
                long r4 = r8.f87234r     // Catch:{ Exception -> 0x046a }
                long r3 = r10.mo19608a(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106169b0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x03a1:
                boolean r4 = r8.f87233q     // Catch:{ Exception -> 0x046a }
                boolean r3 = r10.mo19609b(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106163V(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x03ac:
                java.lang.Boolean r4 = r8.f87232p     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x03b8
                boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x046a }
                if (r4 == 0) goto L_0x03b8
                r4 = r2
                goto L_0x03b9
            L_0x03b8:
                r4 = r0
            L_0x03b9:
                boolean r3 = r10.mo19609b(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106183p0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x03c2:
                java.lang.String[] r3 = r10.mo19612f(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106148G0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x03cb:
                java.lang.String[] r3 = r10.mo19612f(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106147F0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x03d4:
                java.lang.String[] r3 = r10.mo19612f(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106146E0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x03dd:
                java.lang.String r4 = "Parameter whitelist is deprecated and will be removed in a future version of the SDK. Use urlAllowList instead."
                java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x046a }
                com.urbanairship.C36059m.m148409e(r4, r5)     // Catch:{ Exception -> 0x046a }
                java.lang.String[] r3 = r10.mo19612f(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106146E0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x03ed:
                java.lang.String[] r3 = r10.mo19612f(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106162U(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x03f6:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x046a }
                java.lang.String r4 = "gcmSender no longer supported. Please use fcmSender or remove it to allow the Airship SDK to pull from the google-services.json."
                r3.<init>(r4)     // Catch:{ Exception -> 0x046a }
                throw r3     // Catch:{ Exception -> 0x046a }
            L_0x03fe:
                java.lang.String r4 = r8.f87226j     // Catch:{ Exception -> 0x046a }
                java.lang.String r3 = r10.mo19618k(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106172e0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0409:
                java.lang.String r4 = r8.f87227k     // Catch:{ Exception -> 0x046a }
                java.lang.String r3 = r10.mo19618k(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106173f0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0413:
                r4 = 0
                java.lang.String r3 = r10.mo19618k(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106184q0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x041c:
                java.lang.String r4 = r8.f87225i     // Catch:{ Exception -> 0x046a }
                java.lang.String r3 = r10.mo19618k(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106142A0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0426:
                java.lang.String r4 = r8.f87224h     // Catch:{ Exception -> 0x046a }
                java.lang.String r3 = r10.mo19618k(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106164W(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0430:
                java.lang.String r4 = r8.f87223g     // Catch:{ Exception -> 0x046a }
                java.lang.String r3 = r10.mo19618k(r3, r4)     // Catch:{ Exception -> 0x046a }
                r8.mo106179l0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x043a:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106177j0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0442:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106176i0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x044a:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106192y0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0452:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106191x0(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x045a:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106166Y(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x0462:
                java.lang.String r3 = r10.mo19611d(r3)     // Catch:{ Exception -> 0x046a }
                r8.mo106165X(r3)     // Catch:{ Exception -> 0x046a }
                goto L_0x0478
            L_0x046a:
                r3 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r4 = r10.getName(r1)
                r2[r0] = r4
                java.lang.String r4 = "Unable to set config field '%s' due to invalid configuration value."
                com.urbanairship.C36059m.m148411g(r3, r4, r2)
            L_0x0478:
                int r1 = r1 + 1
                goto L_0x0002
            L_0x047c:
                java.lang.Boolean r10 = r8.f87232p
                if (r10 != 0) goto L_0x0483
                r8.mo106161T(r9)
            L_0x0483:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.AirshipConfigOptions.C35437b.mo106155N(android.content.Context, com.urbanairship.util.l):void");
        }

        @C0359n0
        /* renamed from: O */
        public C35437b mo106156O(@C0359n0 Context context) {
            return mo106157P(context, f87165O);
        }

        @C0359n0
        /* renamed from: P */
        public C35437b mo106157P(@C0359n0 Context context, @C0359n0 String str) {
            try {
                mo106152K0(context, str);
            } catch (Exception e) {
                C36059m.m148410f(e);
            }
            return this;
        }

        @C0359n0
        /* renamed from: Q */
        public C35437b mo106158Q(@C0359n0 Context context, @C0359n0 Properties properties) {
            try {
                mo106155N(context, C9655i0.m36168h(context, properties));
            } catch (Exception e) {
                C36059m.m148410f(e);
            }
            return this;
        }

        @C0359n0
        /* renamed from: R */
        public AirshipConfigOptions mo106159R() {
            if (this.f87229m.isEmpty() && this.f87231o.isEmpty() && !this.f87212J) {
                C36059m.m148409e("The airship config options is missing URL allow list rules for SCOPE_OPEN. By default only Airship, YouTube, mailto, sms, and tel URLs will be allowed.To suppress this error, specify allow list rules by providing rules for urlAllowListScopeOpenUrl or urlAllowList. Alternatively you can suppress this error and keep the default rules by using the flag suppressAllowListError. For more information, see https://docs.airship.com/platform/android/getting-started/#url-allow-list.", new Object[0]);
            }
            if (this.f87232p == null) {
                this.f87232p = Boolean.FALSE;
            }
            String str = this.f87219c;
            if (str != null && str.equals(this.f87221e)) {
                C36059m.m148421q("Production App Key matches Development App Key", new Object[0]);
            }
            String str2 = this.f87220d;
            if (str2 != null && str2.equals(this.f87222f)) {
                C36059m.m148421q("Production App Secret matches Development App Secret", new Object[0]);
            }
            if (this.f87208F) {
                C36059m.m148421q("dataCollectionOptInEnabled is deprecated. Use enabledFeatures instead.", new Object[0]);
                if (this.f87211I == 255) {
                    this.f87211I = 0;
                }
            }
            return new AirshipConfigOptions(this);
        }

        /* renamed from: S */
        public final int mo106160S(@C0359n0 String[] strArr) {
            int i = 0;
            for (String str : strArr) {
                if (str != null && !str.isEmpty()) {
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1693017210:
                            if (str.equals("analytics")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -567451565:
                            if (str.equals(AirshipConfigOptions.f87099M)) {
                                c = 1;
                                break;
                            }
                            break;
                        case -63122353:
                            if (str.equals(AirshipConfigOptions.f87093G)) {
                                c = 2;
                                break;
                            }
                            break;
                        case 96673:
                            if (str.equals("all")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 3052376:
                            if (str.equals("chat")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3452698:
                            if (str.equals("push")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 536871821:
                            if (str.equals("message_center")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 965553573:
                            if (str.equals(AirshipConfigOptions.f87094H)) {
                                c = 7;
                                break;
                            }
                            break;
                        case 1901043637:
                            if (str.equals("location")) {
                                c = 8;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            i |= 16;
                            break;
                        case 1:
                            i |= 64;
                            break;
                        case 2:
                            i |= 1;
                            break;
                        case 3:
                            i |= 255;
                            break;
                        case 4:
                            i |= 8;
                            break;
                        case 5:
                            i |= 4;
                            break;
                        case 6:
                            i |= 2;
                            break;
                        case 7:
                            i |= 32;
                            break;
                        case 8:
                            i |= 128;
                            break;
                    }
                }
            }
            return i;
        }

        @C0359n0
        /* renamed from: T */
        public C35437b mo106161T(@C0359n0 Context context) {
            boolean z;
            try {
                if (!((Boolean) Class.forName(context.getPackageName() + ".BuildConfig").getField("DEBUG").get((Object) null)).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                this.f87232p = Boolean.valueOf(z);
            } catch (Exception unused) {
                C36059m.m148421q("AirshipConfigOptions - Unable to determine the build mode. Defaulting to debug.", new Object[0]);
                this.f87232p = Boolean.FALSE;
            }
            return this;
        }

        @C0359n0
        /* renamed from: U */
        public C35437b mo106162U(@C0363p0 String[] strArr) {
            this.f87228l.clear();
            if (strArr != null) {
                this.f87228l.addAll(Arrays.asList(strArr));
            }
            return this;
        }

        @C0359n0
        /* renamed from: V */
        public C35437b mo106163V(boolean z) {
            this.f87233q = z;
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: W */
        public C35437b mo106164W(@C0359n0 String str) {
            this.f87224h = str;
            return this;
        }

        @C0359n0
        /* renamed from: X */
        public C35437b mo106165X(@C0363p0 String str) {
            this.f87217a = str;
            return this;
        }

        @C0359n0
        /* renamed from: Y */
        public C35437b mo106166Y(@C0363p0 String str) {
            this.f87218b = str;
            return this;
        }

        @C0359n0
        /* renamed from: Z */
        public C35437b mo106167Z(@C0363p0 Uri uri) {
            this.f87207E = uri;
            return this;
        }

        @C0359n0
        /* renamed from: a0 */
        public C35437b mo106168a0(boolean z) {
            this.f87238v = z;
            return this;
        }

        @C0359n0
        /* renamed from: b0 */
        public C35437b mo106169b0(long j) {
            this.f87234r = j;
            return this;
        }

        @C0359n0
        /* renamed from: c0 */
        public C35437b mo106170c0(boolean z) {
            this.f87240x = z;
            return this;
        }

        @C0359n0
        /* renamed from: d0 */
        public C35437b mo106171d0(boolean z) {
            this.f87239w = z;
            return this;
        }

        @C0359n0
        /* renamed from: e0 */
        public C35437b mo106172e0(@C0359n0 String str) {
            this.f87226j = str;
            return this;
        }

        @C0359n0
        /* renamed from: f0 */
        public C35437b mo106173f0(@C0359n0 String str) {
            this.f87227k = str;
            return this;
        }

        @C0359n0
        /* renamed from: g0 */
        public C35437b mo106174g0(@C0363p0 PushProvider pushProvider) {
            this.f87206D = pushProvider;
            return this;
        }

        @C0359n0
        @Deprecated
        /* renamed from: h0 */
        public C35437b mo106175h0(boolean z) {
            this.f87208F = z;
            return this;
        }

        @C0359n0
        /* renamed from: i0 */
        public C35437b mo106176i0(@C0363p0 String str) {
            this.f87221e = str;
            return this;
        }

        @C0359n0
        /* renamed from: j0 */
        public C35437b mo106177j0(@C0363p0 String str) {
            this.f87222f = str;
            return this;
        }

        @C0359n0
        /* renamed from: k0 */
        public C35437b mo106178k0(int i) {
            this.f87235s = Integer.valueOf(i);
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: l0 */
        public C35437b mo106179l0(@C0359n0 String str) {
            this.f87223g = str;
            return this;
        }

        @C0359n0
        /* renamed from: m0 */
        public C35437b mo106180m0(int... iArr) {
            this.f87211I = C36075v.m148496b(iArr);
            return this;
        }

        @C0359n0
        /* renamed from: n0 */
        public C35437b mo106181n0(boolean z) {
            this.f87209G = z;
            return this;
        }

        @C0359n0
        /* renamed from: o0 */
        public C35437b mo106182o0(@C0363p0 String str) {
            this.f87214L = str;
            return this;
        }

        @C0359n0
        /* renamed from: p0 */
        public C35437b mo106183p0(boolean z) {
            this.f87232p = Boolean.valueOf(z);
            return this;
        }

        @C0359n0
        /* renamed from: q0 */
        public C35437b mo106184q0(@C0363p0 String str) {
            this.f87215M = str;
            return this;
        }

        @C0359n0
        /* renamed from: r0 */
        public C35437b mo106185r0(boolean z) {
            this.f87216N = z;
            return this;
        }

        @C0359n0
        /* renamed from: s0 */
        public C35437b mo106186s0(int i) {
            this.f87237u = Integer.valueOf(i);
            return this;
        }

        @C0359n0
        /* renamed from: t0 */
        public C35437b mo106187t0(@C0354l int i) {
            this.f87203A = i;
            return this;
        }

        @C0359n0
        /* renamed from: u0 */
        public C35437b mo106188u0(@C0363p0 String str) {
            this.f87205C = str;
            return this;
        }

        @C0359n0
        /* renamed from: v0 */
        public C35437b mo106189v0(@C0375v int i) {
            this.f87241y = i;
            return this;
        }

        @C0359n0
        /* renamed from: w0 */
        public C35437b mo106190w0(@C0375v int i) {
            this.f87242z = i;
            return this;
        }

        @C0359n0
        /* renamed from: x0 */
        public C35437b mo106191x0(@C0363p0 String str) {
            this.f87219c = str;
            return this;
        }

        @C0359n0
        /* renamed from: y0 */
        public C35437b mo106192y0(@C0363p0 String str) {
            this.f87220d = str;
            return this;
        }

        @C0359n0
        /* renamed from: z0 */
        public C35437b mo106193z0(int i) {
            this.f87236t = Integer.valueOf(i);
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.AirshipConfigOptions$c */
    public @interface C35438c {
    }

    /* renamed from: b */
    public static int m146042b(Integer... numArr) {
        for (Integer num : numArr) {
            if (num != null) {
                return num.intValue();
            }
        }
        return 0;
    }

    @C0359n0
    /* renamed from: c */
    public static String m146043c(@C0359n0 String... strArr) {
        for (String str : strArr) {
            if (!C9669o0.m36224e(str)) {
                return str;
            }
        }
        return "";
    }

    @C0363p0
    /* renamed from: d */
    public static String m146044d(@C0359n0 String... strArr) {
        for (String str : strArr) {
            if (!C9669o0.m36224e(str)) {
                return str;
            }
        }
        return null;
    }

    @C0359n0
    /* renamed from: e */
    public static C35437b m146045e() {
        return new C35437b();
    }

    @C0359n0
    /* renamed from: f */
    public static String m146046f(String str) {
        if (f87118f0.equalsIgnoreCase(str)) {
            return f87118f0;
        }
        if (f87117e0.equalsIgnoreCase(str)) {
            return f87117e0;
        }
        throw new IllegalArgumentException("Invalid site: " + str);
    }

    /* renamed from: g */
    public void mo106141g() {
        String str;
        if (this.f87123B) {
            str = "production";
        } else {
            str = "development";
        }
        Pattern pattern = f87116d0;
        if (!pattern.matcher(this.f87128a).matches()) {
            throw new IllegalArgumentException("AirshipConfigOptions: " + this.f87128a + " is not a valid " + str + " app key");
        } else if (pattern.matcher(this.f87129b).matches()) {
            long j = this.f87143p;
            if (j < f87111Y) {
                C36059m.m148421q("AirshipConfigOptions - The backgroundReportingIntervalMS %s may decrease battery life.", Long.valueOf(j));
            } else if (j > 86400000) {
                C36059m.m148421q("AirshipConfigOptions - The backgroundReportingIntervalMS %s may provide less detailed analytic reports.", Long.valueOf(j));
            }
        } else {
            throw new IllegalArgumentException("AirshipConfigOptions: " + this.f87129b + " is not a valid " + str + " app secret");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AirshipConfigOptions(@androidx.annotation.C0359n0 com.urbanairship.AirshipConfigOptions.C35437b r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Boolean r0 = r7.f87232p
            boolean r0 = r0.booleanValue()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0055
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r5 = r7.f87219c
            r0[r4] = r5
            java.lang.String r5 = r7.f87217a
            r0[r3] = r5
            java.lang.String r0 = m146043c(r0)
            r6.f87128a = r0
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r5 = r7.f87220d
            r0[r4] = r5
            java.lang.String r5 = r7.f87218b
            r0[r3] = r5
            java.lang.String r0 = m146043c(r0)
            r6.f87129b = r0
            java.lang.Integer[] r0 = new java.lang.Integer[r1]
            java.lang.Integer r1 = r7.f87236t
            r0[r4] = r1
            java.lang.Integer r1 = r7.f87237u
            r0[r3] = r1
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            int r0 = m146042b(r0)
            r6.f87144q = r0
            goto L_0x0097
        L_0x0055:
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r5 = r7.f87221e
            r0[r4] = r5
            java.lang.String r5 = r7.f87217a
            r0[r3] = r5
            java.lang.String r0 = m146043c(r0)
            r6.f87128a = r0
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r5 = r7.f87222f
            r0[r4] = r5
            java.lang.String r5 = r7.f87218b
            r0[r3] = r5
            java.lang.String r0 = m146043c(r0)
            r6.f87129b = r0
            java.lang.Integer[] r0 = new java.lang.Integer[r1]
            java.lang.Integer r5 = r7.f87235s
            r0[r4] = r5
            java.lang.Integer r5 = r7.f87237u
            r0[r3] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            int r0 = m146042b(r0)
            r6.f87144q = r0
        L_0x0097:
            java.lang.String r0 = r7.f87210H
            int r1 = r0.hashCode()
            r5 = 2224(0x8b0, float:3.116E-42)
            if (r1 == r5) goto L_0x00b2
            r5 = 2718(0xa9e, float:3.809E-42)
            if (r1 == r5) goto L_0x00a8
            goto L_0x00bc
        L_0x00a8:
            java.lang.String r1 = "US"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00bc
            r0 = r3
            goto L_0x00bd
        L_0x00b2:
            java.lang.String r1 = "EU"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00bc
            r0 = r4
            goto L_0x00bd
        L_0x00bc:
            r0 = -1
        L_0x00bd:
            if (r0 == 0) goto L_0x0124
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r1 = r7.f87223g
            r0[r4] = r1
            java.lang.String r1 = "https://device-api.urbanairship.com/"
            r0[r3] = r1
            java.lang.String r0 = m146043c(r0)
            r6.f87130c = r0
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r1 = r7.f87224h
            r0[r4] = r1
            java.lang.String r1 = "https://combine.urbanairship.com/"
            r0[r3] = r1
            java.lang.String r0 = m146043c(r0)
            r6.f87131d = r0
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r1 = r7.f87225i
            r0[r4] = r1
            java.lang.String r1 = "https://remote-data.urbanairship.com/"
            r0[r3] = r1
            java.lang.String r0 = m146043c(r0)
            r6.f87132e = r0
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r1 = r7.f87204B
            r0[r4] = r1
            java.lang.String r1 = "https://wallet-api.urbanairship.com"
            r0[r3] = r1
            java.lang.String r0 = m146043c(r0)
            r6.f87133f = r0
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r1 = r7.f87227k
            r0[r4] = r1
            java.lang.String r0 = m146043c(r0)
            r6.f87134g = r0
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r1 = r7.f87226j
            r0[r4] = r1
            java.lang.String r0 = m146043c(r0)
            r6.f87135h = r0
            goto L_0x0188
        L_0x0124:
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r1 = r7.f87223g
            r0[r4] = r1
            java.lang.String r1 = "https://device-api.asnapieu.com/"
            r0[r3] = r1
            java.lang.String r0 = m146043c(r0)
            r6.f87130c = r0
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r1 = r7.f87224h
            r0[r4] = r1
            java.lang.String r1 = "https://combine.asnapieu.com/"
            r0[r3] = r1
            java.lang.String r0 = m146043c(r0)
            r6.f87131d = r0
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r1 = r7.f87225i
            r0[r4] = r1
            java.lang.String r1 = "https://remote-data.asnapieu.com/"
            r0[r3] = r1
            java.lang.String r0 = m146043c(r0)
            r6.f87132e = r0
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r1 = r7.f87204B
            r0[r4] = r1
            java.lang.String r1 = "https://wallet-api.asnapieu.com"
            r0[r3] = r1
            java.lang.String r0 = m146043c(r0)
            r6.f87133f = r0
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r1 = r7.f87227k
            r0[r4] = r1
            java.lang.String r0 = m146043c(r0)
            r6.f87134g = r0
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.String r1 = r7.f87226j
            r0[r4] = r1
            java.lang.String r0 = m146043c(r0)
            r6.f87135h = r0
        L_0x0188:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r7.f87228l
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r6.f87137j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r7.f87229m
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r6.f87139l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r7.f87230n
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r6.f87140m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r7.f87231o
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r6.f87141n = r0
            java.lang.Boolean r0 = r7.f87232p
            boolean r0 = r0.booleanValue()
            r6.f87123B = r0
            boolean r0 = r7.f87233q
            r6.f87142o = r0
            long r0 = r7.f87234r
            r6.f87143p = r0
            boolean r0 = r7.f87238v
            r6.f87145r = r0
            boolean r0 = r7.f87239w
            r6.f87146s = r0
            boolean r0 = r7.f87240x
            r6.f87147t = r0
            int r0 = r7.f87241y
            r6.f87151x = r0
            int r0 = r7.f87242z
            r6.f87152y = r0
            int r0 = r7.f87203A
            r6.f87153z = r0
            java.lang.String r0 = r7.f87205C
            r6.f87122A = r0
            com.urbanairship.push.PushProvider r0 = r7.f87206D
            r6.f87138k = r0
            android.net.Uri r0 = r7.f87207E
            r6.f87136i = r0
            boolean r0 = r7.f87208F
            r6.f87148u = r0
            int r0 = r7.f87211I
            r6.f87149v = r0
            boolean r0 = r7.f87209G
            r6.f87150w = r0
            boolean r0 = r7.f87213K
            r6.f87124C = r0
            java.lang.String r0 = r7.f87214L
            r6.f87125D = r0
            java.lang.String r0 = r7.f87215M
            r6.f87126E = r0
            boolean r7 = r7.f87216N
            r6.f87127F = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.AirshipConfigOptions.<init>(com.urbanairship.AirshipConfigOptions$b):void");
    }
}
