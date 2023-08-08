package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import com.google.android.material.internal.C31395g;
import java.util.Map;

/* renamed from: com.appsflyer.internal.cu */
public final class C21970cu extends C21962cp {
    public C21970cu(Runnable runnable) {
        super(C31395g.f75892b, runnable);
    }

    public final void AFInAppEventParameterName(Context context) {
        valueOf(context, new C21903av<Map<String, Object>>(context, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") {
            private static void AFInAppEventParameterName(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex != -1) {
                    long j = cursor.getLong(columnIndex);
                    if (j != 0) {
                        map.put(str, Long.valueOf(j));
                    }
                }
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bd, code lost:
                if (r2 != null) goto L_0x00d3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d1, code lost:
                if (r2 == null) goto L_0x00d6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d3, code lost:
                r2.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d6, code lost:
                r0 = r10.AFInAppEventType.getPackageManager().resolveContentProvider(r10.AFKeystoreWrapper, 128).packageName;
                r10.valueOf.AFInAppEventType.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.C21845aa.AFInAppEventParameterName(r10.AFInAppEventType, r0)));
                r10.valueOf.AFInAppEventType.put("api_ver_name", com.appsflyer.internal.C21845aa.values(r10.AFInAppEventType, r0));
                r10.valueOf.AFInAppEventType();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0111, code lost:
                return r10.valueOf.AFInAppEventType;
             */
            /* renamed from: values */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.util.Map<java.lang.String, java.lang.Object> valueOf() {
                /*
                    r10 = this;
                    java.lang.String r0 = "FEATURE_NOT_SUPPORTED"
                    java.lang.String r1 = "response"
                    r2 = 0
                    android.content.Context r3 = r10.AFInAppEventType     // Catch:{ Exception -> 0x00c2 }
                    android.content.ContentResolver r4 = r3.getContentResolver()     // Catch:{ Exception -> 0x00c2 }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r5 = "content://"
                    r3.<init>(r5)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r5 = r10.AFKeystoreWrapper     // Catch:{ Exception -> 0x00c2 }
                    r3.append(r5)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00c2 }
                    android.net.Uri r5 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x00c2 }
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00c2 }
                    if (r2 == 0) goto L_0x00b4
                    boolean r3 = r2.moveToFirst()     // Catch:{ Exception -> 0x00c2 }
                    if (r3 == 0) goto L_0x00ac
                    com.appsflyer.internal.cu r3 = com.appsflyer.internal.C21970cu.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r3 = r3.AFInAppEventType     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "OK"
                    r3.put(r1, r4)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = "referrer"
                    com.appsflyer.internal.cu r4 = com.appsflyer.internal.C21970cu.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventType     // Catch:{ Exception -> 0x00c2 }
                    valueOf(r3, r4, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = "click_ts"
                    com.appsflyer.internal.cu r4 = com.appsflyer.internal.C21970cu.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventType     // Catch:{ Exception -> 0x00c2 }
                    AFInAppEventParameterName(r3, r4, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = "install_begin_ts"
                    com.appsflyer.internal.cu r4 = com.appsflyer.internal.C21970cu.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventType     // Catch:{ Exception -> 0x00c2 }
                    AFInAppEventParameterName(r3, r4, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = "install_end_ts"
                    com.appsflyer.internal.cu r4 = com.appsflyer.internal.C21970cu.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventType     // Catch:{ Exception -> 0x00c2 }
                    AFInAppEventParameterName(r3, r4, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = "organic_keywords"
                    com.appsflyer.internal.cu r4 = com.appsflyer.internal.C21970cu.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventType     // Catch:{ Exception -> 0x00c2 }
                    valueOf(r3, r4, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r3 = "attr_type"
                    com.appsflyer.internal.cu r4 = com.appsflyer.internal.C21970cu.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventType     // Catch:{ Exception -> 0x00c2 }
                    valueOf(r3, r4, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x00c2 }
                    r3.<init>()     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "instant"
                    int r5 = r2.getColumnIndex(r4)     // Catch:{ Exception -> 0x00c2 }
                    r6 = -1
                    if (r5 == r6) goto L_0x008d
                    java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x00c2 }
                    if (r5 == 0) goto L_0x008d
                    boolean r5 = java.lang.Boolean.parseBoolean(r5)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x00c2 }
                    r3.put(r4, r5)     // Catch:{ Exception -> 0x00c2 }
                L_0x008d:
                    java.lang.String r4 = "click_server_ts"
                    AFInAppEventParameterName(r4, r3, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "install_begin_server_ts"
                    AFInAppEventParameterName(r4, r3, r2)     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "install_version"
                    valueOf(r4, r3, r2)     // Catch:{ Exception -> 0x00c2 }
                    boolean r4 = r3.isEmpty()     // Catch:{ Exception -> 0x00c2 }
                    if (r4 != 0) goto L_0x00bd
                    com.appsflyer.internal.cu r4 = com.appsflyer.internal.C21970cu.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventType     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r5 = "custom"
                    r4.put(r5, r3)     // Catch:{ Exception -> 0x00c2 }
                    goto L_0x00bd
                L_0x00ac:
                    com.appsflyer.internal.cu r3 = com.appsflyer.internal.C21970cu.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r3 = r3.AFInAppEventType     // Catch:{ Exception -> 0x00c2 }
                    r3.put(r1, r0)     // Catch:{ Exception -> 0x00c2 }
                    goto L_0x00bd
                L_0x00b4:
                    com.appsflyer.internal.cu r3 = com.appsflyer.internal.C21970cu.this     // Catch:{ Exception -> 0x00c2 }
                    java.util.Map<java.lang.String, java.lang.Object> r3 = r3.AFInAppEventType     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r4 = "SERVICE_UNAVAILABLE"
                    r3.put(r1, r4)     // Catch:{ Exception -> 0x00c2 }
                L_0x00bd:
                    if (r2 == 0) goto L_0x00d6
                    goto L_0x00d3
                L_0x00c0:
                    r0 = move-exception
                    goto L_0x0112
                L_0x00c2:
                    r3 = move-exception
                    com.appsflyer.internal.cu r4 = com.appsflyer.internal.C21970cu.this     // Catch:{ all -> 0x00c0 }
                    java.util.Map<java.lang.String, java.lang.Object> r4 = r4.AFInAppEventType     // Catch:{ all -> 0x00c0 }
                    r4.put(r1, r0)     // Catch:{ all -> 0x00c0 }
                    java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x00c0 }
                    com.appsflyer.AFLogger.AFKeystoreWrapper(r0, r3)     // Catch:{ all -> 0x00c0 }
                    if (r2 == 0) goto L_0x00d6
                L_0x00d3:
                    r2.close()
                L_0x00d6:
                    android.content.Context r0 = r10.AFInAppEventType
                    android.content.pm.PackageManager r0 = r0.getPackageManager()
                    java.lang.String r1 = r10.AFKeystoreWrapper
                    r2 = 128(0x80, float:1.794E-43)
                    android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r1, r2)
                    java.lang.String r0 = r0.packageName
                    com.appsflyer.internal.cu r1 = com.appsflyer.internal.C21970cu.this
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r1.AFInAppEventType
                    android.content.Context r2 = r10.AFInAppEventType
                    long r2 = com.appsflyer.internal.C21845aa.AFInAppEventParameterName((android.content.Context) r2, (java.lang.String) r0)
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    java.lang.String r3 = "api_ver"
                    r1.put(r3, r2)
                    com.appsflyer.internal.cu r1 = com.appsflyer.internal.C21970cu.this
                    java.util.Map<java.lang.String, java.lang.Object> r1 = r1.AFInAppEventType
                    android.content.Context r2 = r10.AFInAppEventType
                    java.lang.String r0 = com.appsflyer.internal.C21845aa.values(r2, r0)
                    java.lang.String r2 = "api_ver_name"
                    r1.put(r2, r0)
                    com.appsflyer.internal.cu r0 = com.appsflyer.internal.C21970cu.this
                    r0.AFInAppEventType()
                    com.appsflyer.internal.cu r0 = com.appsflyer.internal.C21970cu.this
                    java.util.Map<java.lang.String, java.lang.Object> r0 = r0.AFInAppEventType
                    return r0
                L_0x0112:
                    if (r2 == 0) goto L_0x0117
                    r2.close()
                L_0x0117:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C21970cu.C219713.valueOf():java.util.Map");
            }

            private static void valueOf(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                    map.put(str, string);
                }
            }
        });
    }
}
