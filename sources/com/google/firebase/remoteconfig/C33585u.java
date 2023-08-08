package com.google.firebase.remoteconfig;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.firebase.remoteconfig.u */
public final class C33585u {

    /* renamed from: a */
    public static final String f81728a = "https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch";

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.remoteconfig.u$a */
    public @interface C33586a {

        /* renamed from: k3 */
        public static final String f81729k3 = "experimentId";

        /* renamed from: l3 */
        public static final String f81730l3 = "variantId";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.remoteconfig.u$b */
    public @interface C33587b {

        /* renamed from: m3 */
        public static final String f81731m3 = "appInstanceId";

        /* renamed from: n3 */
        public static final String f81732n3 = "appInstanceIdToken";

        /* renamed from: o3 */
        public static final String f81733o3 = "appId";

        /* renamed from: p3 */
        public static final String f81734p3 = "countryCode";

        /* renamed from: q3 */
        public static final String f81735q3 = "languageCode";

        /* renamed from: r3 */
        public static final String f81736r3 = "platformVersion";

        /* renamed from: s3 */
        public static final String f81737s3 = "timeZone";

        /* renamed from: t3 */
        public static final String f81738t3 = "appVersion";

        /* renamed from: u3 */
        public static final String f81739u3 = "appBuild";

        /* renamed from: v3 */
        public static final String f81740v3 = "packageName";

        /* renamed from: w3 */
        public static final String f81741w3 = "sdkVersion";

        /* renamed from: x3 */
        public static final String f81742x3 = "analyticsUserProperties";

        /* renamed from: y3 */
        public static final String f81743y3 = "firstOpenTime";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.remoteconfig.u$c */
    public @interface C33588c {

        /* renamed from: A3 */
        public static final String f81744A3 = "experimentDescriptions";

        /* renamed from: B3 */
        public static final String f81745B3 = "personalizationMetadata";

        /* renamed from: C3 */
        public static final String f81746C3 = "state";

        /* renamed from: z3 */
        public static final String f81747z3 = "entries";
    }
}
