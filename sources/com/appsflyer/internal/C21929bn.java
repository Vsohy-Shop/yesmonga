package com.appsflyer.internal;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.firebase.installations.remote.C33122c;

/* renamed from: com.appsflyer.internal.bn */
public final class C21929bn {
    private static long AFInAppEventParameterName = 8114088828766023008L;
    private static int AFInAppEventType = 1;
    private static int valueOf;

    @NonNull
    private static C21898ar AFInAppEventType(@NonNull C21896ap apVar, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        if (str == null) {
            return new C21898ar(apVar.AFInAppEventParameterName == C21963cq.DEFAULT, C21960cn.NA);
        }
        String intern = AFInAppEventType("◅奮泔ⱃ◶㐽똣摐遶箸ﲣ퇕件脷⤣齚շ풺鞠䓑ᨸ?㉖깷ꆷઠￛ擱眠ꔧ퍳㪽붡ዒ觳䀸?䑳韏傡藔㋳?鴡猢悿쮧㣗ꟲ똺〧ቲﶹ约叒죲͏ꬦᥖ蝱嚽ᆦ욢", (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) - 1).intern();
        if (apVar.AFInAppEventParameterName == C21963cq.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = values(new StringBuilder(str3).reverse().toString(), apVar.values, "android", C33122c.f80331m, str4).equals(str);
        return new C21898ar(equals, equals ? C21960cn.SUCCESS : C21960cn.FAILURE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        return r8.substring(0, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0036, code lost:
        if (r9 != 8) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0052, code lost:
        if (r8.length() < 12) goto L_0x0054;
     */
    @android.support.annotation.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String values(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            int r0 = valueOf
            int r0 = r0 + 11
            int r1 = r0 % 128
            AFInAppEventType = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 12
            java.lang.String r3 = ""
            r4 = 1
            r5 = 0
            r6 = 5
            r7 = 4
            if (r0 != 0) goto L_0x0039
            java.lang.String[] r0 = new java.lang.String[r7]
            r0[r5] = r9
            r0[r4] = r10
            r0[r7] = r11
            r0[r6] = r12
            r0[r7] = r3
            java.lang.String r9 = com.appsflyer.internal.C21859ae.AFKeystoreWrapper((java.lang.String[]) r0)
            java.lang.String r8 = com.appsflyer.internal.C21859ae.values((java.lang.String) r9, (java.lang.String) r8)
            int r9 = r8.length()
            r10 = 78
            r11 = 8
            if (r9 >= r10) goto L_0x0035
            r9 = 14
            goto L_0x0036
        L_0x0035:
            r9 = r11
        L_0x0036:
            if (r9 == r11) goto L_0x0069
            goto L_0x0054
        L_0x0039:
            java.lang.String[] r0 = new java.lang.String[r6]
            r0[r5] = r9
            r0[r4] = r10
            r0[r1] = r11
            r9 = 3
            r0[r9] = r12
            r0[r7] = r3
            java.lang.String r9 = com.appsflyer.internal.C21859ae.AFKeystoreWrapper((java.lang.String[]) r0)
            java.lang.String r8 = com.appsflyer.internal.C21859ae.values((java.lang.String) r9, (java.lang.String) r8)
            int r9 = r8.length()
            if (r9 >= r2) goto L_0x0069
        L_0x0054:
            int r9 = valueOf
            int r9 = r9 + r6
            int r10 = r9 % 128
            AFInAppEventType = r10
            int r9 = r9 % r1
            r10 = 26
            if (r9 != 0) goto L_0x0062
            r9 = r10
            goto L_0x0064
        L_0x0062:
            r9 = 75
        L_0x0064:
            if (r9 == r10) goto L_0x0067
            return r8
        L_0x0067:
            r8 = 0
            throw r8
        L_0x0069:
            java.lang.String r8 = r8.substring(r5, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21929bn.values(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r5 != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r5 != null) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041  */
    @android.support.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appsflyer.internal.C21898ar AFInAppEventParameterName(@android.support.annotation.NonNull com.appsflyer.internal.C21896ap r5, @android.support.annotation.Nullable java.lang.String r6, @android.support.annotation.NonNull java.lang.String r7, @android.support.annotation.NonNull java.lang.String r8) {
        /*
            r4 = this;
            int r0 = AFInAppEventType
            int r1 = r0 + 65
            int r2 = r1 % 128
            valueOf = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L_0x0012
            r1 = 3
            int r1 = r1 / r2
            if (r5 == 0) goto L_0x0036
            goto L_0x0014
        L_0x0012:
            if (r5 == 0) goto L_0x0036
        L_0x0014:
            r1 = 3
            if (r7 == 0) goto L_0x001a
            r3 = 96
            goto L_0x001b
        L_0x001a:
            r3 = r1
        L_0x001b:
            if (r3 == r1) goto L_0x0036
            int r0 = r0 + 71
            int r1 = r0 % 128
            valueOf = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0034
            r0 = 51
            if (r8 == 0) goto L_0x002d
            r1 = r0
            goto L_0x002f
        L_0x002d:
            r1 = 27
        L_0x002f:
            if (r1 == r0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            r0 = 1
            goto L_0x0037
        L_0x0034:
            r5 = 0
            throw r5
        L_0x0036:
            r0 = r2
        L_0x0037:
            if (r0 != 0) goto L_0x0041
            com.appsflyer.internal.ar r5 = new com.appsflyer.internal.ar
            com.appsflyer.internal.cn r6 = com.appsflyer.internal.C21960cn.INTERNAL_ERROR
            r5.<init>(r2, r6)
            return r5
        L_0x0041:
            com.appsflyer.internal.ar r5 = AFInAppEventType(r5, r6, r7, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21929bn.AFInAppEventParameterName(com.appsflyer.internal.ap, java.lang.String, java.lang.String, java.lang.String):com.appsflyer.internal.ar");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: char[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFInAppEventType(java.lang.String r8, int r9) {
        /*
            if (r8 == 0) goto L_0x0006
            char[] r8 = r8.toCharArray()
        L_0x0006:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.appsflyer.internal.C21990dk.AFInAppEventParameterName
            monitor-enter(r0)
            long r1 = AFInAppEventParameterName     // Catch:{ all -> 0x0042 }
            char[] r8 = com.appsflyer.internal.C21990dk.AFKeystoreWrapper(r1, r8, r9)     // Catch:{ all -> 0x0042 }
            r9 = 4
            com.appsflyer.internal.C21990dk.AFKeystoreWrapper = r9     // Catch:{ all -> 0x0042 }
        L_0x0014:
            int r1 = com.appsflyer.internal.C21990dk.AFKeystoreWrapper     // Catch:{ all -> 0x0042 }
            int r2 = r8.length     // Catch:{ all -> 0x0042 }
            if (r1 >= r2) goto L_0x0039
            int r1 = r1 + -4
            com.appsflyer.internal.C21990dk.AFInAppEventType = r1     // Catch:{ all -> 0x0042 }
            int r1 = com.appsflyer.internal.C21990dk.AFKeystoreWrapper     // Catch:{ all -> 0x0042 }
            char r2 = r8[r1]     // Catch:{ all -> 0x0042 }
            int r3 = r1 % 4
            char r3 = r8[r3]     // Catch:{ all -> 0x0042 }
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch:{ all -> 0x0042 }
            int r4 = com.appsflyer.internal.C21990dk.AFInAppEventType     // Catch:{ all -> 0x0042 }
            long r4 = (long) r4     // Catch:{ all -> 0x0042 }
            long r6 = AFInAppEventParameterName     // Catch:{ all -> 0x0042 }
            long r4 = r4 * r6
            long r2 = r2 ^ r4
            int r2 = (int) r2     // Catch:{ all -> 0x0042 }
            char r2 = (char) r2     // Catch:{ all -> 0x0042 }
            r8[r1] = r2     // Catch:{ all -> 0x0042 }
            int r1 = com.appsflyer.internal.C21990dk.AFKeystoreWrapper     // Catch:{ all -> 0x0042 }
            int r1 = r1 + 1
            com.appsflyer.internal.C21990dk.AFKeystoreWrapper = r1     // Catch:{ all -> 0x0042 }
            goto L_0x0014
        L_0x0039:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0042 }
            int r2 = r8.length     // Catch:{ all -> 0x0042 }
            int r2 = r2 - r9
            r1.<init>(r8, r9, r2)     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return r1
        L_0x0042:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21929bn.AFInAppEventType(java.lang.String, int):java.lang.String");
    }
}
