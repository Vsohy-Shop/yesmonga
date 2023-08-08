package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.bl */
public final class C21927bl {
    private final int AFKeystoreWrapper;

    public C21927bl(int i) {
        this.AFKeystoreWrapper = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.BufferedOutputStream} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be A[Catch:{ Exception -> 0x0123, all -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appsflyer.internal.C21932bq<java.lang.String> valueOf(com.appsflyer.internal.C21846ab r12) throws java.io.IOException {
        /*
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0128 }
            java.lang.String r4 = "HTTP: url: "
            r3.<init>(r4)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r4 = r12.AFInAppEventParameterName     // Catch:{ Exception -> 0x0128 }
            r3.append(r4)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0128 }
            com.appsflyer.AFLogger.values(r3)     // Catch:{ Exception -> 0x0128 }
            byte[] r3 = r12.AFInAppEventType     // Catch:{ Exception -> 0x0128 }
            if (r3 == 0) goto L_0x0034
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0128 }
            java.lang.String r4 = "HTTP: data: "
            r3.<init>(r4)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0128 }
            byte[] r5 = r12.AFInAppEventType     // Catch:{ Exception -> 0x0128 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0128 }
            r3.append(r4)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0128 }
            com.appsflyer.AFLogger.values(r3)     // Catch:{ Exception -> 0x0128 }
        L_0x0034:
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x0128 }
            java.lang.String r4 = r12.AFInAppEventParameterName     // Catch:{ Exception -> 0x0128 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0128 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Exception -> 0x0128 }
            java.lang.Object r3 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r3)     // Catch:{ Exception -> 0x0128 }
            java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ Exception -> 0x0128 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0128 }
            java.lang.String r4 = r12.valueOf     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r3.setRequestMethod(r4)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            int r4 = r11.AFKeystoreWrapper     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            int r5 = r12.AFLogger$LogLevel     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r6 = -1
            if (r5 == r6) goto L_0x0054
            r4 = r5
        L_0x0054:
            r3.setConnectTimeout(r4)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r3.setReadTimeout(r4)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            boolean r4 = r12.AFKeystoreWrapper     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            if (r4 == 0) goto L_0x0061
            java.lang.String r4 = "application/octet-stream"
            goto L_0x0063
        L_0x0061:
            java.lang.String r4 = "application/json"
        L_0x0063:
            java.lang.String r5 = "Content-Type"
            r3.addRequestProperty(r5, r4)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.values     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
        L_0x0072:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            if (r5 == 0) goto L_0x008e
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r3.setRequestProperty(r6, r5)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            goto L_0x0072
        L_0x008e:
            byte[] r12 = r12.AFInAppEventType     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r4 = 1
            if (r12 == 0) goto L_0x00c2
            r3.setDoOutput(r4)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r5 = "Content-Length"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r6.<init>()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            int r7 = r12.length     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r6.append(r7)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r3.setRequestProperty(r5, r6)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00bb }
            java.io.OutputStream r6 = r3.getOutputStream()     // Catch:{ all -> 0x00bb }
            r5.<init>(r6)     // Catch:{ all -> 0x00bb }
            r5.write(r12)     // Catch:{ all -> 0x00b8 }
            r5.close()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            goto L_0x00c2
        L_0x00b8:
            r12 = move-exception
            r2 = r5
            goto L_0x00bc
        L_0x00bb:
            r12 = move-exception
        L_0x00bc:
            if (r2 == 0) goto L_0x00c1
            r2.close()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
        L_0x00c1:
            throw r12     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
        L_0x00c2:
            int r12 = r3.getResponseCode()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            int r5 = r12 / 100
            r6 = 2
            if (r5 != r6) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r4 = 0
        L_0x00cd:
            r8 = r4
            java.lang.String r6 = valueOf(r3, r8)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r5 = "HTTP: response code: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r4.append(r12)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r12 = " "
            r4.append(r12)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r12 = r3.getResponseMessage()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r4.append(r12)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r12 = r4.toString()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            com.appsflyer.AFLogger.values(r12)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r12 = "HTTP: response body: "
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.lang.String r12 = r12.concat(r4)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            com.appsflyer.AFLogger.values(r12)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            long r4 = r4 - r0
            com.appsflyer.internal.bi r10 = new com.appsflyer.internal.bi     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r10.<init>(r4)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            java.util.Map r12 = r3.getHeaderFields()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r9.<init>(r12)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r9.remove(r2)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            com.appsflyer.internal.bq r12 = new com.appsflyer.internal.bq     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            int r7 = r3.getResponseCode()     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0123, all -> 0x0120 }
            r3.disconnect()
            return r12
        L_0x0120:
            r12 = move-exception
            r2 = r3
            goto L_0x0139
        L_0x0123:
            r12 = move-exception
            r2 = r3
            goto L_0x0129
        L_0x0126:
            r12 = move-exception
            goto L_0x0139
        L_0x0128:
            r12 = move-exception
        L_0x0129:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0126 }
            long r3 = r3 - r0
            com.appsflyer.internal.bi r0 = new com.appsflyer.internal.bi     // Catch:{ all -> 0x0126 }
            r0.<init>(r3)     // Catch:{ all -> 0x0126 }
            com.appsflyer.internal.components.network.http.exceptions.HttpException r1 = new com.appsflyer.internal.components.network.http.exceptions.HttpException     // Catch:{ all -> 0x0126 }
            r1.<init>(r12, r0)     // Catch:{ all -> 0x0126 }
            throw r1     // Catch:{ all -> 0x0126 }
        L_0x0139:
            if (r2 == 0) goto L_0x013e
            r2.disconnect()
        L_0x013e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21927bl.valueOf(com.appsflyer.internal.ab):com.appsflyer.internal.bq");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0096  */
    @android.support.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String valueOf(java.net.HttpURLConnection r5, boolean r6) throws java.io.IOException {
        /*
            java.lang.String r0 = "Could not read connection response from: "
            r1 = 0
            if (r6 == 0) goto L_0x000a
            java.io.InputStream r6 = r5.getInputStream()     // Catch:{ IOException -> 0x0074, Exception -> 0x005a, all -> 0x0057 }
            goto L_0x000e
        L_0x000a:
            java.io.InputStream r6 = r5.getErrorStream()     // Catch:{ IOException -> 0x0074, Exception -> 0x005a, all -> 0x0057 }
        L_0x000e:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = ""
            return r5
        L_0x0013:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0074, Exception -> 0x005a, all -> 0x0057 }
            r2.<init>()     // Catch:{ IOException -> 0x0074, Exception -> 0x005a, all -> 0x0057 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0074, Exception -> 0x005a, all -> 0x0057 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0074, Exception -> 0x005a, all -> 0x0057 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0053, Exception -> 0x004f, all -> 0x004b }
            r6.<init>(r3)     // Catch:{ IOException -> 0x0053, Exception -> 0x004f, all -> 0x004b }
            r1 = 1
        L_0x0023:
            java.lang.String r4 = r6.readLine()     // Catch:{ IOException -> 0x0047, Exception -> 0x0043, all -> 0x0040 }
            if (r4 == 0) goto L_0x0035
            if (r1 != 0) goto L_0x0030
            r1 = 10
            r2.append(r1)     // Catch:{ IOException -> 0x0047, Exception -> 0x0043, all -> 0x0040 }
        L_0x0030:
            r2.append(r4)     // Catch:{ IOException -> 0x0047, Exception -> 0x0043, all -> 0x0040 }
            r1 = 0
            goto L_0x0023
        L_0x0035:
            java.lang.String r5 = r2.toString()     // Catch:{ IOException -> 0x0047, Exception -> 0x0043, all -> 0x0040 }
            r3.close()
            r6.close()
            return r5
        L_0x0040:
            r5 = move-exception
            r2 = r6
            goto L_0x004d
        L_0x0043:
            r1 = move-exception
            r2 = r6
            r6 = r1
            goto L_0x0051
        L_0x0047:
            r1 = move-exception
            r2 = r6
            r6 = r1
            goto L_0x0055
        L_0x004b:
            r5 = move-exception
            r2 = r1
        L_0x004d:
            r1 = r3
            goto L_0x008f
        L_0x004f:
            r6 = move-exception
            r2 = r1
        L_0x0051:
            r1 = r3
            goto L_0x005c
        L_0x0053:
            r6 = move-exception
            r2 = r1
        L_0x0055:
            r1 = r3
            goto L_0x0076
        L_0x0057:
            r5 = move-exception
            r2 = r1
            goto L_0x008f
        L_0x005a:
            r6 = move-exception
            r2 = r1
        L_0x005c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r3.<init>(r0)     // Catch:{ all -> 0x008e }
            java.net.URL r5 = r5.getURL()     // Catch:{ all -> 0x008e }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x008e }
            r3.append(r5)     // Catch:{ all -> 0x008e }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x008e }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r5, r6)     // Catch:{ all -> 0x008e }
            throw r6     // Catch:{ all -> 0x008e }
        L_0x0074:
            r6 = move-exception
            r2 = r1
        L_0x0076:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r3.<init>(r0)     // Catch:{ all -> 0x008e }
            java.net.URL r5 = r5.getURL()     // Catch:{ all -> 0x008e }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x008e }
            r3.append(r5)     // Catch:{ all -> 0x008e }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x008e }
            com.appsflyer.AFLogger.AFKeystoreWrapper(r5, r6)     // Catch:{ all -> 0x008e }
            throw r6     // Catch:{ all -> 0x008e }
        L_0x008e:
            r5 = move-exception
        L_0x008f:
            if (r1 == 0) goto L_0x0094
            r1.close()
        L_0x0094:
            if (r2 == 0) goto L_0x0099
            r2.close()
        L_0x0099:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21927bl.valueOf(java.net.HttpURLConnection, boolean):java.lang.String");
    }
}
