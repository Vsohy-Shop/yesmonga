package com.google.firebase.remoteconfig.internal;

/* renamed from: com.google.firebase.remoteconfig.internal.p */
public class C33541p {

    /* renamed from: a */
    public static final String f81644a = "entry";

    /* renamed from: b */
    public static final String f81645b = "key";

    /* renamed from: c */
    public static final String f81646c = "value";

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068 A[Catch:{ IOException | XmlPullParserException -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0070 A[Catch:{ IOException | XmlPullParserException -> 0x0079 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> m135229a(android.content.Context r7, int r8) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
            if (r7 != 0) goto L_0x000c
            return r0
        L_0x000c:
            android.content.res.XmlResourceParser r7 = r7.getXml(r8)     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
            int r8 = r7.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L_0x0018:
            r5 = 1
            if (r8 == r5) goto L_0x0079
            r6 = 2
            if (r8 != r6) goto L_0x0023
            java.lang.String r2 = r7.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
            goto L_0x0074
        L_0x0023:
            r6 = 3
            if (r8 != r6) goto L_0x003d
            java.lang.String r8 = r7.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
            java.lang.String r2 = "entry"
            boolean r8 = r8.equals(r2)     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
            if (r8 == 0) goto L_0x003b
            if (r3 == 0) goto L_0x0039
            if (r4 == 0) goto L_0x0039
            r0.put(r3, r4)     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
        L_0x0039:
            r3 = r1
            r4 = r3
        L_0x003b:
            r2 = r1
            goto L_0x0074
        L_0x003d:
            r6 = 4
            if (r8 != r6) goto L_0x0074
            if (r2 == 0) goto L_0x0074
            int r8 = r2.hashCode()     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
            r6 = 106079(0x19e5f, float:1.48648E-40)
            if (r8 == r6) goto L_0x005b
            r6 = 111972721(0x6ac9171, float:6.4912916E-35)
            if (r8 == r6) goto L_0x0051
            goto L_0x0065
        L_0x0051:
            java.lang.String r8 = "value"
            boolean r8 = r2.equals(r8)     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
            if (r8 == 0) goto L_0x0065
            r8 = r5
            goto L_0x0066
        L_0x005b:
            java.lang.String r8 = "key"
            boolean r8 = r2.equals(r8)     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
            if (r8 == 0) goto L_0x0065
            r8 = 0
            goto L_0x0066
        L_0x0065:
            r8 = -1
        L_0x0066:
            if (r8 == 0) goto L_0x0070
            if (r8 == r5) goto L_0x006b
            goto L_0x0074
        L_0x006b:
            java.lang.String r4 = r7.getText()     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
            goto L_0x0074
        L_0x0070:
            java.lang.String r3 = r7.getText()     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
        L_0x0074:
            int r8 = r7.next()     // Catch:{ IOException | XmlPullParserException -> 0x0079 }
            goto L_0x0018
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C33541p.m135229a(android.content.Context, int):java.util.Map");
    }
}
