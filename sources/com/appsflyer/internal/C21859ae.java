package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import androidx.compose.p004ui.graphics.vector.C15369g;
import com.appsflyer.AFLogger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.appsflyer.internal.ae */
public final class C21859ae {
    private static int AFInAppEventParameterName = 0;
    private static long AFInAppEventType = -4542319128240450229L;
    private static int AFKeystoreWrapper = 1;

    public static String AFInAppEventParameterName(Map<String, Object> map) {
        char c;
        StringBuilder sb = new StringBuilder();
        sb.append((String) map.get("appsflyerKey"));
        sb.append(map.get(values("ᔪ㋎嫒抖誮퉉塚ȍ⨧珑鯸ꏺ", 10211 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(map.get("uid"));
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append(map.get("installDate"));
        String obj3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj3);
        sb4.append(map.get("counter"));
        String obj4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj4);
        sb5.append(map.get("iaecounter"));
        String AFKeystoreWrapper2 = AFKeystoreWrapper(AFInAppEventType(sb5.toString()));
        int i = AFInAppEventParameterName + 13;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            c = 'V';
        } else {
            c = 16;
        }
        if (c != 'V') {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    public static String AFInAppEventType(String str) {
        String str2;
        int i = AFInAppEventParameterName + 53;
        AFKeystoreWrapper = i % 128;
        int i2 = i % 2;
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            str2 = AFKeystoreWrapper(instance.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to MD5");
            AFLogger.AFKeystoreWrapper(sb.toString(), e);
            str2 = null;
        }
        int i3 = AFKeystoreWrapper + 21;
        AFInAppEventParameterName = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    public static String AFKeystoreWrapper(String str) {
        int i = AFInAppEventParameterName + 41;
        AFKeystoreWrapper = i % 128;
        int i2 = i % 2;
        try {
            MessageDigest instance = MessageDigest.getInstance(CommonUtils.f79238a);
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            String AFKeystoreWrapper2 = AFKeystoreWrapper(instance.digest());
            int i3 = AFKeystoreWrapper + 75;
            AFInAppEventParameterName = i3 % 128;
            int i4 = i3 % 2;
            return AFKeystoreWrapper2;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.AFKeystoreWrapper(sb.toString(), e);
            return null;
        }
    }

    private static String valueOf(byte[] bArr) {
        char c;
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = AFKeystoreWrapper + 117;
        AFInAppEventParameterName = i % 128;
        int i2 = i % 2;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                c = 4;
            } else {
                c = C15369g.f37990p;
            }
            if (c != 4) {
                break;
            }
            sb.append(Integer.toString((bArr[i3] & 255) + 256, 16).substring(1));
            i3++;
            int i4 = AFInAppEventParameterName + 91;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
        }
        String obj = sb.toString();
        int i6 = AFKeystoreWrapper + 11;
        AFInAppEventParameterName = i6 % 128;
        if (i6 % 2 != 0) {
            z = true;
        }
        if (!z) {
            return obj;
        }
        throw null;
    }

    public static String values(String str) {
        String str2;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            str2 = valueOf(instance.digest());
            int i = AFKeystoreWrapper + 13;
            AFInAppEventParameterName = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.AFKeystoreWrapper(sb.toString(), e);
            str2 = null;
        }
        int i3 = AFKeystoreWrapper + 29;
        AFInAppEventParameterName = i3 % 128;
        if (i3 % 2 == 0) {
            return str2;
        }
        int i4 = 60 / 0;
        return str2;
    }

    public static String values(String str, String str2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            String lowerCase = valueOf(instance.doFinal(str.getBytes())).toLowerCase();
            int i = AFKeystoreWrapper + 99;
            AFInAppEventParameterName = i % 128;
            if ((i % 2 != 0 ? 'T' : 17) != 'T') {
                return lowerCase;
            }
            int i2 = 93 / 0;
            return lowerCase;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.valueOf(e.getMessage(), e);
            return e.getMessage();
        }
    }

    public static String AFInAppEventType(Map<String, Object> map) {
        String str = (String) map.get(values("ᔪ㋎嫒抖誮퉉塚ȍ⨧珑鯸ꏺ", TextUtils.getOffsetBefore("", 0) + 10211).intern());
        StringBuilder sb = new StringBuilder();
        sb.append(((String) map.get("appsflyerKey")).substring(0, 7));
        sb.append(((String) map.get("uid")).substring(0, 7));
        sb.append(str.substring(str.length() - 7));
        String AFKeystoreWrapper2 = AFKeystoreWrapper(sb.toString());
        int i = AFInAppEventParameterName + 9;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            int i2 = 87 / 0;
        }
        return AFKeystoreWrapper2;
    }

    private static String AFKeystoreWrapper(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (!(i >= length)) {
                int i2 = AFInAppEventParameterName + 107;
                AFKeystoreWrapper = i2 % 128;
                if (i2 % 2 != 0) {
                    formatter.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
                    i++;
                } else {
                    formatter.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
                    i += 58;
                }
            } else {
                String obj = formatter.toString();
                formatter.close();
                return obj;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String values(java.lang.String r6, int r7) {
        /*
            if (r6 == 0) goto L_0x0006
            char[] r6 = r6.toCharArray()
        L_0x0006:
            char[] r6 = (char[]) r6
            java.lang.Object r0 = com.appsflyer.internal.C21993do.AFInAppEventType
            monitor-enter(r0)
            com.appsflyer.internal.C21993do.values = r7     // Catch:{ all -> 0x0034 }
            int r7 = r6.length     // Catch:{ all -> 0x0034 }
            char[] r7 = new char[r7]     // Catch:{ all -> 0x0034 }
            r1 = 0
            com.appsflyer.internal.C21993do.AFKeystoreWrapper = r1     // Catch:{ all -> 0x0034 }
        L_0x0013:
            int r1 = com.appsflyer.internal.C21993do.AFKeystoreWrapper     // Catch:{ all -> 0x0034 }
            int r2 = r6.length     // Catch:{ all -> 0x0034 }
            if (r1 >= r2) goto L_0x002d
            char r2 = r6[r1]     // Catch:{ all -> 0x0034 }
            int r3 = com.appsflyer.internal.C21993do.values     // Catch:{ all -> 0x0034 }
            int r3 = r3 * r1
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch:{ all -> 0x0034 }
            long r4 = AFInAppEventType     // Catch:{ all -> 0x0034 }
            long r2 = r2 ^ r4
            int r2 = (int) r2     // Catch:{ all -> 0x0034 }
            char r2 = (char) r2     // Catch:{ all -> 0x0034 }
            r7[r1] = r2     // Catch:{ all -> 0x0034 }
            int r1 = com.appsflyer.internal.C21993do.AFKeystoreWrapper     // Catch:{ all -> 0x0034 }
            int r1 = r1 + 1
            com.appsflyer.internal.C21993do.AFKeystoreWrapper = r1     // Catch:{ all -> 0x0034 }
            goto L_0x0013
        L_0x002d:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0034 }
            r6.<init>(r7)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r6
        L_0x0034:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21859ae.values(java.lang.String, int):java.lang.String");
    }

    public static String AFKeystoreWrapper(String... strArr) {
        int i = AFKeystoreWrapper + 91;
        AFInAppEventParameterName = i % 128;
        boolean z = i % 2 != 0;
        String join = TextUtils.join("⁣", strArr);
        if (z) {
            int i2 = 39 / 0;
        }
        int i3 = AFInAppEventParameterName + 37;
        AFKeystoreWrapper = i3 % 128;
        if ((i3 % 2 == 0 ? 'N' : 'U') == 'U') {
            return join;
        }
        throw null;
    }
}
