package androidx.constraintlayout.core.motion.utils;

/* renamed from: androidx.constraintlayout.core.motion.utils.v */
public interface C16717v {

    /* renamed from: a */
    public static final String f42130a = "CUSTOM";

    /* renamed from: b */
    public static final int f42131b = 1;

    /* renamed from: c */
    public static final int f42132c = 2;

    /* renamed from: d */
    public static final int f42133d = 4;

    /* renamed from: e */
    public static final int f42134e = 8;

    /* renamed from: f */
    public static final int f42135f = 100;

    /* renamed from: g */
    public static final int f42136g = 101;

    /* renamed from: androidx.constraintlayout.core.motion.utils.v$a */
    public interface C16718a {

        /* renamed from: A */
        public static final String f42137A = "rotationX";

        /* renamed from: B */
        public static final String f42138B = "rotationY";

        /* renamed from: C */
        public static final String f42139C = "rotationZ";

        /* renamed from: D */
        public static final String f42140D = "scaleX";

        /* renamed from: E */
        public static final String f42141E = "scaleY";

        /* renamed from: F */
        public static final String f42142F = "pivotX";

        /* renamed from: G */
        public static final String f42143G = "pivotY";

        /* renamed from: H */
        public static final String f42144H = "progress";

        /* renamed from: I */
        public static final String f42145I = "pathRotate";

        /* renamed from: J */
        public static final String f42146J = "easing";

        /* renamed from: K */
        public static final String f42147K = "CUSTOM";

        /* renamed from: L */
        public static final String f42148L = "frame";

        /* renamed from: M */
        public static final String f42149M = "target";

        /* renamed from: N */
        public static final String f42150N = "pivotTarget";

        /* renamed from: O */
        public static final String[] f42151O = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", f42148L, "target", f42150N};

        /* renamed from: a */
        public static final String f42152a = "KeyAttributes";

        /* renamed from: b */
        public static final int f42153b = 301;

        /* renamed from: c */
        public static final int f42154c = 302;

        /* renamed from: d */
        public static final int f42155d = 303;

        /* renamed from: e */
        public static final int f42156e = 304;

        /* renamed from: f */
        public static final int f42157f = 305;

        /* renamed from: g */
        public static final int f42158g = 306;

        /* renamed from: h */
        public static final int f42159h = 307;

        /* renamed from: i */
        public static final int f42160i = 308;

        /* renamed from: j */
        public static final int f42161j = 309;

        /* renamed from: k */
        public static final int f42162k = 310;

        /* renamed from: l */
        public static final int f42163l = 311;

        /* renamed from: m */
        public static final int f42164m = 312;

        /* renamed from: n */
        public static final int f42165n = 313;

        /* renamed from: o */
        public static final int f42166o = 314;

        /* renamed from: p */
        public static final int f42167p = 315;

        /* renamed from: q */
        public static final int f42168q = 316;

        /* renamed from: r */
        public static final int f42169r = 317;

        /* renamed from: s */
        public static final int f42170s = 318;

        /* renamed from: t */
        public static final String f42171t = "curveFit";

        /* renamed from: u */
        public static final String f42172u = "visibility";

        /* renamed from: v */
        public static final String f42173v = "alpha";

        /* renamed from: w */
        public static final String f42174w = "translationX";

        /* renamed from: x */
        public static final String f42175x = "translationY";

        /* renamed from: y */
        public static final String f42176y = "translationZ";

        /* renamed from: z */
        public static final String f42177z = "elevation";

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static int m76346a(java.lang.String r2) {
            /*
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1310311125: goto L_0x0101;
                    case -1249320806: goto L_0x00f5;
                    case -1249320805: goto L_0x00e9;
                    case -1249320804: goto L_0x00dd;
                    case -1225497657: goto L_0x00d1;
                    case -1225497656: goto L_0x00c5;
                    case -1225497655: goto L_0x00b9;
                    case -1001078227: goto L_0x00ad;
                    case -987906986: goto L_0x009f;
                    case -987906985: goto L_0x0091;
                    case -908189618: goto L_0x0083;
                    case -908189617: goto L_0x0076;
                    case -880905839: goto L_0x0069;
                    case -4379043: goto L_0x005c;
                    case 92909918: goto L_0x004f;
                    case 97692013: goto L_0x0042;
                    case 579057826: goto L_0x0035;
                    case 803192288: goto L_0x0028;
                    case 1167159411: goto L_0x001b;
                    case 1941332754: goto L_0x000e;
                    default: goto L_0x000b;
                }
            L_0x000b:
                r2 = r1
                goto L_0x010c
            L_0x000e:
                java.lang.String r0 = "visibility"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0017
                goto L_0x000b
            L_0x0017:
                r2 = 19
                goto L_0x010c
            L_0x001b:
                java.lang.String r0 = "pivotTarget"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0024
                goto L_0x000b
            L_0x0024:
                r2 = 18
                goto L_0x010c
            L_0x0028:
                java.lang.String r0 = "pathRotate"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0031
                goto L_0x000b
            L_0x0031:
                r2 = 17
                goto L_0x010c
            L_0x0035:
                java.lang.String r0 = "curveFit"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x003e
                goto L_0x000b
            L_0x003e:
                r2 = 16
                goto L_0x010c
            L_0x0042:
                java.lang.String r0 = "frame"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x004b
                goto L_0x000b
            L_0x004b:
                r2 = 15
                goto L_0x010c
            L_0x004f:
                java.lang.String r0 = "alpha"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0058
                goto L_0x000b
            L_0x0058:
                r2 = 14
                goto L_0x010c
            L_0x005c:
                java.lang.String r0 = "elevation"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0065
                goto L_0x000b
            L_0x0065:
                r2 = 13
                goto L_0x010c
            L_0x0069:
                java.lang.String r0 = "target"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0072
                goto L_0x000b
            L_0x0072:
                r2 = 12
                goto L_0x010c
            L_0x0076:
                java.lang.String r0 = "scaleY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x007f
                goto L_0x000b
            L_0x007f:
                r2 = 11
                goto L_0x010c
            L_0x0083:
                java.lang.String r0 = "scaleX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x008d
                goto L_0x000b
            L_0x008d:
                r2 = 10
                goto L_0x010c
            L_0x0091:
                java.lang.String r0 = "pivotY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x009b
                goto L_0x000b
            L_0x009b:
                r2 = 9
                goto L_0x010c
            L_0x009f:
                java.lang.String r0 = "pivotX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00a9
                goto L_0x000b
            L_0x00a9:
                r2 = 8
                goto L_0x010c
            L_0x00ad:
                java.lang.String r0 = "progress"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00b7
                goto L_0x000b
            L_0x00b7:
                r2 = 7
                goto L_0x010c
            L_0x00b9:
                java.lang.String r0 = "translationZ"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00c3
                goto L_0x000b
            L_0x00c3:
                r2 = 6
                goto L_0x010c
            L_0x00c5:
                java.lang.String r0 = "translationY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00cf
                goto L_0x000b
            L_0x00cf:
                r2 = 5
                goto L_0x010c
            L_0x00d1:
                java.lang.String r0 = "translationX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00db
                goto L_0x000b
            L_0x00db:
                r2 = 4
                goto L_0x010c
            L_0x00dd:
                java.lang.String r0 = "rotationZ"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00e7
                goto L_0x000b
            L_0x00e7:
                r2 = 3
                goto L_0x010c
            L_0x00e9:
                java.lang.String r0 = "rotationY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00f3
                goto L_0x000b
            L_0x00f3:
                r2 = 2
                goto L_0x010c
            L_0x00f5:
                java.lang.String r0 = "rotationX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00ff
                goto L_0x000b
            L_0x00ff:
                r2 = 1
                goto L_0x010c
            L_0x0101:
                java.lang.String r0 = "easing"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x010b
                goto L_0x000b
            L_0x010b:
                r2 = 0
            L_0x010c:
                switch(r2) {
                    case 0: goto L_0x0149;
                    case 1: goto L_0x0146;
                    case 2: goto L_0x0143;
                    case 3: goto L_0x0140;
                    case 4: goto L_0x013d;
                    case 5: goto L_0x013a;
                    case 6: goto L_0x0137;
                    case 7: goto L_0x0134;
                    case 8: goto L_0x0131;
                    case 9: goto L_0x012e;
                    case 10: goto L_0x012b;
                    case 11: goto L_0x0128;
                    case 12: goto L_0x0125;
                    case 13: goto L_0x0122;
                    case 14: goto L_0x011f;
                    case 15: goto L_0x011c;
                    case 16: goto L_0x0119;
                    case 17: goto L_0x0116;
                    case 18: goto L_0x0113;
                    case 19: goto L_0x0110;
                    default: goto L_0x010f;
                }
            L_0x010f:
                return r1
            L_0x0110:
                r2 = 302(0x12e, float:4.23E-43)
                return r2
            L_0x0113:
                r2 = 318(0x13e, float:4.46E-43)
                return r2
            L_0x0116:
                r2 = 316(0x13c, float:4.43E-43)
                return r2
            L_0x0119:
                r2 = 301(0x12d, float:4.22E-43)
                return r2
            L_0x011c:
                r2 = 100
                return r2
            L_0x011f:
                r2 = 303(0x12f, float:4.25E-43)
                return r2
            L_0x0122:
                r2 = 307(0x133, float:4.3E-43)
                return r2
            L_0x0125:
                r2 = 101(0x65, float:1.42E-43)
                return r2
            L_0x0128:
                r2 = 312(0x138, float:4.37E-43)
                return r2
            L_0x012b:
                r2 = 311(0x137, float:4.36E-43)
                return r2
            L_0x012e:
                r2 = 314(0x13a, float:4.4E-43)
                return r2
            L_0x0131:
                r2 = 313(0x139, float:4.39E-43)
                return r2
            L_0x0134:
                r2 = 315(0x13b, float:4.41E-43)
                return r2
            L_0x0137:
                r2 = 306(0x132, float:4.29E-43)
                return r2
            L_0x013a:
                r2 = 305(0x131, float:4.27E-43)
                return r2
            L_0x013d:
                r2 = 304(0x130, float:4.26E-43)
                return r2
            L_0x0140:
                r2 = 310(0x136, float:4.34E-43)
                return r2
            L_0x0143:
                r2 = 309(0x135, float:4.33E-43)
                return r2
            L_0x0146:
                r2 = 308(0x134, float:4.32E-43)
                return r2
            L_0x0149:
                r2 = 317(0x13d, float:4.44E-43)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C16717v.C16718a.m76346a(java.lang.String):int");
        }

        static int getType(int i) {
            if (i == 100) {
                return 2;
            }
            if (i == 101) {
                return 8;
            }
            switch (i) {
                case 301:
                case 302:
                    return 2;
                case 303:
                case 304:
                case 305:
                case 306:
                case 307:
                case 308:
                case 309:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 315:
                case f42168q /*316*/:
                    return 4;
                case f42169r /*317*/:
                case f42170s /*318*/:
                    return 8;
                default:
                    return -1;
            }
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.v$b */
    public interface C16719b {

        /* renamed from: a */
        public static final String f42178a = "Custom";

        /* renamed from: b */
        public static final String f42179b = "integer";

        /* renamed from: c */
        public static final String f42180c = "float";

        /* renamed from: d */
        public static final String f42181d = "color";

        /* renamed from: e */
        public static final String f42182e = "string";

        /* renamed from: f */
        public static final String f42183f = "boolean";

        /* renamed from: g */
        public static final String f42184g = "dimension";

        /* renamed from: h */
        public static final String f42185h = "refrence";

        /* renamed from: i */
        public static final String[] f42186i = {f42180c, "color", f42182e, f42183f, f42184g, f42185h};

        /* renamed from: j */
        public static final int f42187j = 900;

        /* renamed from: k */
        public static final int f42188k = 901;

        /* renamed from: l */
        public static final int f42189l = 902;

        /* renamed from: m */
        public static final int f42190m = 903;

        /* renamed from: n */
        public static final int f42191n = 904;

        /* renamed from: o */
        public static final int f42192o = 905;

        /* renamed from: p */
        public static final int f42193p = 906;

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static int m76347a(java.lang.String r2) {
            /*
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1095013018: goto L_0x004f;
                    case -891985903: goto L_0x0044;
                    case -710953590: goto L_0x0039;
                    case 64711720: goto L_0x002e;
                    case 94842723: goto L_0x0023;
                    case 97526364: goto L_0x0018;
                    case 1958052158: goto L_0x000d;
                    default: goto L_0x000b;
                }
            L_0x000b:
                r2 = r1
                goto L_0x0059
            L_0x000d:
                java.lang.String r0 = "integer"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0016
                goto L_0x000b
            L_0x0016:
                r2 = 6
                goto L_0x0059
            L_0x0018:
                java.lang.String r0 = "float"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0021
                goto L_0x000b
            L_0x0021:
                r2 = 5
                goto L_0x0059
            L_0x0023:
                java.lang.String r0 = "color"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x002c
                goto L_0x000b
            L_0x002c:
                r2 = 4
                goto L_0x0059
            L_0x002e:
                java.lang.String r0 = "boolean"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0037
                goto L_0x000b
            L_0x0037:
                r2 = 3
                goto L_0x0059
            L_0x0039:
                java.lang.String r0 = "refrence"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0042
                goto L_0x000b
            L_0x0042:
                r2 = 2
                goto L_0x0059
            L_0x0044:
                java.lang.String r0 = "string"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x004d
                goto L_0x000b
            L_0x004d:
                r2 = 1
                goto L_0x0059
            L_0x004f:
                java.lang.String r0 = "dimension"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0058
                goto L_0x000b
            L_0x0058:
                r2 = 0
            L_0x0059:
                switch(r2) {
                    case 0: goto L_0x006f;
                    case 1: goto L_0x006c;
                    case 2: goto L_0x0069;
                    case 3: goto L_0x0066;
                    case 4: goto L_0x0063;
                    case 5: goto L_0x0060;
                    case 6: goto L_0x005d;
                    default: goto L_0x005c;
                }
            L_0x005c:
                return r1
            L_0x005d:
                r2 = 900(0x384, float:1.261E-42)
                return r2
            L_0x0060:
                r2 = 901(0x385, float:1.263E-42)
                return r2
            L_0x0063:
                r2 = 902(0x386, float:1.264E-42)
                return r2
            L_0x0066:
                r2 = 904(0x388, float:1.267E-42)
                return r2
            L_0x0069:
                r2 = 906(0x38a, float:1.27E-42)
                return r2
            L_0x006c:
                r2 = 903(0x387, float:1.265E-42)
                return r2
            L_0x006f:
                r2 = 905(0x389, float:1.268E-42)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C16717v.C16719b.m76347a(java.lang.String):int");
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.v$c */
    public interface C16720c {

        /* renamed from: A */
        public static final String f42194A = "translationX";

        /* renamed from: B */
        public static final String f42195B = "translationY";

        /* renamed from: C */
        public static final String f42196C = "translationZ";

        /* renamed from: D */
        public static final String f42197D = "elevation";

        /* renamed from: E */
        public static final String f42198E = "rotationX";

        /* renamed from: F */
        public static final String f42199F = "rotationY";

        /* renamed from: G */
        public static final String f42200G = "rotationZ";

        /* renamed from: H */
        public static final String f42201H = "scaleX";

        /* renamed from: I */
        public static final String f42202I = "scaleY";

        /* renamed from: J */
        public static final String f42203J = "pivotX";

        /* renamed from: K */
        public static final String f42204K = "pivotY";

        /* renamed from: L */
        public static final String f42205L = "progress";

        /* renamed from: M */
        public static final String f42206M = "pathRotate";

        /* renamed from: N */
        public static final String f42207N = "easing";

        /* renamed from: O */
        public static final String f42208O = "waveShape";

        /* renamed from: P */
        public static final String f42209P = "customWave";

        /* renamed from: Q */
        public static final String f42210Q = "period";

        /* renamed from: R */
        public static final String f42211R = "offset";

        /* renamed from: S */
        public static final String f42212S = "phase";

        /* renamed from: T */
        public static final String[] f42213T = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", f42209P, "period", f42211R, f42212S};

        /* renamed from: a */
        public static final String f42214a = "KeyCycle";

        /* renamed from: b */
        public static final int f42215b = 401;

        /* renamed from: c */
        public static final int f42216c = 402;

        /* renamed from: d */
        public static final int f42217d = 403;

        /* renamed from: e */
        public static final int f42218e = 304;

        /* renamed from: f */
        public static final int f42219f = 305;

        /* renamed from: g */
        public static final int f42220g = 306;

        /* renamed from: h */
        public static final int f42221h = 307;

        /* renamed from: i */
        public static final int f42222i = 308;

        /* renamed from: j */
        public static final int f42223j = 309;

        /* renamed from: k */
        public static final int f42224k = 310;

        /* renamed from: l */
        public static final int f42225l = 311;

        /* renamed from: m */
        public static final int f42226m = 312;

        /* renamed from: n */
        public static final int f42227n = 313;

        /* renamed from: o */
        public static final int f42228o = 314;

        /* renamed from: p */
        public static final int f42229p = 315;

        /* renamed from: q */
        public static final int f42230q = 416;

        /* renamed from: r */
        public static final int f42231r = 420;

        /* renamed from: s */
        public static final int f42232s = 421;

        /* renamed from: t */
        public static final int f42233t = 422;

        /* renamed from: u */
        public static final int f42234u = 423;

        /* renamed from: v */
        public static final int f42235v = 424;

        /* renamed from: w */
        public static final int f42236w = 425;

        /* renamed from: x */
        public static final String f42237x = "curveFit";

        /* renamed from: y */
        public static final String f42238y = "visibility";

        /* renamed from: z */
        public static final String f42239z = "alpha";

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static int m76348a(java.lang.String r2) {
            /*
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1310311125: goto L_0x00c8;
                    case -1249320806: goto L_0x00bc;
                    case -1249320805: goto L_0x00b0;
                    case -1249320804: goto L_0x00a4;
                    case -1225497657: goto L_0x0098;
                    case -1225497656: goto L_0x008c;
                    case -1225497655: goto L_0x0081;
                    case -1001078227: goto L_0x0076;
                    case -987906986: goto L_0x0069;
                    case -987906985: goto L_0x005c;
                    case -908189618: goto L_0x004f;
                    case -908189617: goto L_0x0042;
                    case 92909918: goto L_0x0035;
                    case 579057826: goto L_0x0028;
                    case 803192288: goto L_0x001b;
                    case 1941332754: goto L_0x000e;
                    default: goto L_0x000b;
                }
            L_0x000b:
                r2 = r1
                goto L_0x00d3
            L_0x000e:
                java.lang.String r0 = "visibility"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0017
                goto L_0x000b
            L_0x0017:
                r2 = 15
                goto L_0x00d3
            L_0x001b:
                java.lang.String r0 = "pathRotate"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0024
                goto L_0x000b
            L_0x0024:
                r2 = 14
                goto L_0x00d3
            L_0x0028:
                java.lang.String r0 = "curveFit"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0031
                goto L_0x000b
            L_0x0031:
                r2 = 13
                goto L_0x00d3
            L_0x0035:
                java.lang.String r0 = "alpha"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x003e
                goto L_0x000b
            L_0x003e:
                r2 = 12
                goto L_0x00d3
            L_0x0042:
                java.lang.String r0 = "scaleY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x004b
                goto L_0x000b
            L_0x004b:
                r2 = 11
                goto L_0x00d3
            L_0x004f:
                java.lang.String r0 = "scaleX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0058
                goto L_0x000b
            L_0x0058:
                r2 = 10
                goto L_0x00d3
            L_0x005c:
                java.lang.String r0 = "pivotY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0065
                goto L_0x000b
            L_0x0065:
                r2 = 9
                goto L_0x00d3
            L_0x0069:
                java.lang.String r0 = "pivotX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0072
                goto L_0x000b
            L_0x0072:
                r2 = 8
                goto L_0x00d3
            L_0x0076:
                java.lang.String r0 = "progress"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x007f
                goto L_0x000b
            L_0x007f:
                r2 = 7
                goto L_0x00d3
            L_0x0081:
                java.lang.String r0 = "translationZ"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x008a
                goto L_0x000b
            L_0x008a:
                r2 = 6
                goto L_0x00d3
            L_0x008c:
                java.lang.String r0 = "translationY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0096
                goto L_0x000b
            L_0x0096:
                r2 = 5
                goto L_0x00d3
            L_0x0098:
                java.lang.String r0 = "translationX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00a2
                goto L_0x000b
            L_0x00a2:
                r2 = 4
                goto L_0x00d3
            L_0x00a4:
                java.lang.String r0 = "rotationZ"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00ae
                goto L_0x000b
            L_0x00ae:
                r2 = 3
                goto L_0x00d3
            L_0x00b0:
                java.lang.String r0 = "rotationY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00ba
                goto L_0x000b
            L_0x00ba:
                r2 = 2
                goto L_0x00d3
            L_0x00bc:
                java.lang.String r0 = "rotationX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00c6
                goto L_0x000b
            L_0x00c6:
                r2 = 1
                goto L_0x00d3
            L_0x00c8:
                java.lang.String r0 = "easing"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00d2
                goto L_0x000b
            L_0x00d2:
                r2 = 0
            L_0x00d3:
                switch(r2) {
                    case 0: goto L_0x0104;
                    case 1: goto L_0x0101;
                    case 2: goto L_0x00fe;
                    case 3: goto L_0x00fb;
                    case 4: goto L_0x00f8;
                    case 5: goto L_0x00f5;
                    case 6: goto L_0x00f2;
                    case 7: goto L_0x00ef;
                    case 8: goto L_0x00ec;
                    case 9: goto L_0x00e9;
                    case 10: goto L_0x00e6;
                    case 11: goto L_0x00e3;
                    case 12: goto L_0x00e0;
                    case 13: goto L_0x00dd;
                    case 14: goto L_0x00da;
                    case 15: goto L_0x00d7;
                    default: goto L_0x00d6;
                }
            L_0x00d6:
                return r1
            L_0x00d7:
                r2 = 402(0x192, float:5.63E-43)
                return r2
            L_0x00da:
                r2 = 416(0x1a0, float:5.83E-43)
                return r2
            L_0x00dd:
                r2 = 401(0x191, float:5.62E-43)
                return r2
            L_0x00e0:
                r2 = 403(0x193, float:5.65E-43)
                return r2
            L_0x00e3:
                r2 = 312(0x138, float:4.37E-43)
                return r2
            L_0x00e6:
                r2 = 311(0x137, float:4.36E-43)
                return r2
            L_0x00e9:
                r2 = 314(0x13a, float:4.4E-43)
                return r2
            L_0x00ec:
                r2 = 313(0x139, float:4.39E-43)
                return r2
            L_0x00ef:
                r2 = 315(0x13b, float:4.41E-43)
                return r2
            L_0x00f2:
                r2 = 306(0x132, float:4.29E-43)
                return r2
            L_0x00f5:
                r2 = 305(0x131, float:4.27E-43)
                return r2
            L_0x00f8:
                r2 = 304(0x130, float:4.26E-43)
                return r2
            L_0x00fb:
                r2 = 310(0x136, float:4.34E-43)
                return r2
            L_0x00fe:
                r2 = 309(0x135, float:4.33E-43)
                return r2
            L_0x0101:
                r2 = 308(0x134, float:4.32E-43)
                return r2
            L_0x0104:
                r2 = 420(0x1a4, float:5.89E-43)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C16717v.C16720c.m76348a(java.lang.String):int");
        }

        static int getType(int i) {
            if (i == 100) {
                return 2;
            }
            if (i == 101) {
                return 8;
            }
            if (i == 416) {
                return 4;
            }
            if (i == 420 || i == 421) {
                return 8;
            }
            switch (i) {
                case 304:
                case 305:
                case 306:
                case 307:
                case 308:
                case 309:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 315:
                    return 4;
                default:
                    switch (i) {
                        case 401:
                        case 402:
                            return 2;
                        case 403:
                            return 4;
                        default:
                            switch (i) {
                                case f42234u /*423*/:
                                case f42235v /*424*/:
                                case f42236w /*425*/:
                                    return 4;
                                default:
                                    return -1;
                            }
                    }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.v$d */
    public interface C16721d {

        /* renamed from: a */
        public static final String f42240a = "MotionScene";

        /* renamed from: b */
        public static final String f42241b = "defaultDuration";

        /* renamed from: c */
        public static final String f42242c = "layoutDuringTransition";

        /* renamed from: d */
        public static final int f42243d = 600;

        /* renamed from: e */
        public static final int f42244e = 601;

        /* renamed from: f */
        public static final String[] f42245f = {f42241b, f42242c};

        /* renamed from: a */
        static int m76349a(String str) {
            str.hashCode();
            if (!str.equals(f42241b)) {
                return !str.equals(f42242c) ? -1 : 601;
            }
            return 600;
        }

        static int getType(int i) {
            if (i != 600) {
                return i != 601 ? -1 : 1;
            }
            return 2;
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.v$e */
    public interface C16722e {

        /* renamed from: A */
        public static final int f42246A = 611;

        /* renamed from: B */
        public static final int f42247B = 612;

        /* renamed from: a */
        public static final String f42248a = "Motion";

        /* renamed from: b */
        public static final String f42249b = "Stagger";

        /* renamed from: c */
        public static final String f42250c = "PathRotate";

        /* renamed from: d */
        public static final String f42251d = "QuantizeMotionPhase";

        /* renamed from: e */
        public static final String f42252e = "TransitionEasing";

        /* renamed from: f */
        public static final String f42253f = "QuantizeInterpolator";

        /* renamed from: g */
        public static final String f42254g = "AnimateRelativeTo";

        /* renamed from: h */
        public static final String f42255h = "AnimateCircleAngleTo";

        /* renamed from: i */
        public static final String f42256i = "PathMotionArc";

        /* renamed from: j */
        public static final String f42257j = "DrawPath";

        /* renamed from: k */
        public static final String f42258k = "PolarRelativeTo";

        /* renamed from: l */
        public static final String f42259l = "QuantizeMotionSteps";

        /* renamed from: m */
        public static final String f42260m = "QuantizeInterpolatorType";

        /* renamed from: n */
        public static final String f42261n = "QuantizeInterpolatorID";

        /* renamed from: o */
        public static final String[] f42262o = {f42249b, f42250c, f42251d, f42252e, f42253f, f42254g, f42255h, f42256i, f42257j, f42258k, f42259l, f42260m, f42261n};

        /* renamed from: p */
        public static final int f42263p = 600;

        /* renamed from: q */
        public static final int f42264q = 601;

        /* renamed from: r */
        public static final int f42265r = 602;

        /* renamed from: s */
        public static final int f42266s = 603;

        /* renamed from: t */
        public static final int f42267t = 604;

        /* renamed from: u */
        public static final int f42268u = 605;

        /* renamed from: v */
        public static final int f42269v = 606;

        /* renamed from: w */
        public static final int f42270w = 607;

        /* renamed from: x */
        public static final int f42271x = 608;

        /* renamed from: y */
        public static final int f42272y = 609;

        /* renamed from: z */
        public static final int f42273z = 610;

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static int m76350a(java.lang.String r2) {
            /*
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -2033446275: goto L_0x009e;
                    case -1532277420: goto L_0x0092;
                    case -1529145600: goto L_0x0086;
                    case -1498310144: goto L_0x007b;
                    case -1030753096: goto L_0x0070;
                    case -762370135: goto L_0x0065;
                    case -232872051: goto L_0x005a;
                    case 1138491429: goto L_0x004f;
                    case 1539234834: goto L_0x0042;
                    case 1583722451: goto L_0x0035;
                    case 1639368448: goto L_0x0028;
                    case 1900899336: goto L_0x001b;
                    case 2109694967: goto L_0x000e;
                    default: goto L_0x000b;
                }
            L_0x000b:
                r2 = r1
                goto L_0x00a9
            L_0x000e:
                java.lang.String r0 = "PathMotionArc"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0017
                goto L_0x000b
            L_0x0017:
                r2 = 12
                goto L_0x00a9
            L_0x001b:
                java.lang.String r0 = "AnimateRelativeTo"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0024
                goto L_0x000b
            L_0x0024:
                r2 = 11
                goto L_0x00a9
            L_0x0028:
                java.lang.String r0 = "TransitionEasing"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0031
                goto L_0x000b
            L_0x0031:
                r2 = 10
                goto L_0x00a9
            L_0x0035:
                java.lang.String r0 = "QuantizeInterpolatorID"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x003e
                goto L_0x000b
            L_0x003e:
                r2 = 9
                goto L_0x00a9
            L_0x0042:
                java.lang.String r0 = "QuantizeInterpolatorType"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x004b
                goto L_0x000b
            L_0x004b:
                r2 = 8
                goto L_0x00a9
            L_0x004f:
                java.lang.String r0 = "PolarRelativeTo"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0058
                goto L_0x000b
            L_0x0058:
                r2 = 7
                goto L_0x00a9
            L_0x005a:
                java.lang.String r0 = "Stagger"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0063
                goto L_0x000b
            L_0x0063:
                r2 = 6
                goto L_0x00a9
            L_0x0065:
                java.lang.String r0 = "DrawPath"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x006e
                goto L_0x000b
            L_0x006e:
                r2 = 5
                goto L_0x00a9
            L_0x0070:
                java.lang.String r0 = "QuantizeInterpolator"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0079
                goto L_0x000b
            L_0x0079:
                r2 = 4
                goto L_0x00a9
            L_0x007b:
                java.lang.String r0 = "PathRotate"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0084
                goto L_0x000b
            L_0x0084:
                r2 = 3
                goto L_0x00a9
            L_0x0086:
                java.lang.String r0 = "QuantizeMotionSteps"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0090
                goto L_0x000b
            L_0x0090:
                r2 = 2
                goto L_0x00a9
            L_0x0092:
                java.lang.String r0 = "QuantizeMotionPhase"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x009c
                goto L_0x000b
            L_0x009c:
                r2 = 1
                goto L_0x00a9
            L_0x009e:
                java.lang.String r0 = "AnimateCircleAngleTo"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00a8
                goto L_0x000b
            L_0x00a8:
                r2 = 0
            L_0x00a9:
                switch(r2) {
                    case 0: goto L_0x00d1;
                    case 1: goto L_0x00ce;
                    case 2: goto L_0x00cb;
                    case 3: goto L_0x00c8;
                    case 4: goto L_0x00c5;
                    case 5: goto L_0x00c2;
                    case 6: goto L_0x00bf;
                    case 7: goto L_0x00bc;
                    case 8: goto L_0x00b9;
                    case 9: goto L_0x00b6;
                    case 10: goto L_0x00b3;
                    case 11: goto L_0x00b0;
                    case 12: goto L_0x00ad;
                    default: goto L_0x00ac;
                }
            L_0x00ac:
                return r1
            L_0x00ad:
                r2 = 607(0x25f, float:8.5E-43)
                return r2
            L_0x00b0:
                r2 = 605(0x25d, float:8.48E-43)
                return r2
            L_0x00b3:
                r2 = 603(0x25b, float:8.45E-43)
                return r2
            L_0x00b6:
                r2 = 612(0x264, float:8.58E-43)
                return r2
            L_0x00b9:
                r2 = 611(0x263, float:8.56E-43)
                return r2
            L_0x00bc:
                r2 = 609(0x261, float:8.53E-43)
                return r2
            L_0x00bf:
                r2 = 600(0x258, float:8.41E-43)
                return r2
            L_0x00c2:
                r2 = 608(0x260, float:8.52E-43)
                return r2
            L_0x00c5:
                r2 = 604(0x25c, float:8.46E-43)
                return r2
            L_0x00c8:
                r2 = 601(0x259, float:8.42E-43)
                return r2
            L_0x00cb:
                r2 = 610(0x262, float:8.55E-43)
                return r2
            L_0x00ce:
                r2 = 602(0x25a, float:8.44E-43)
                return r2
            L_0x00d1:
                r2 = 606(0x25e, float:8.49E-43)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C16717v.C16722e.m76350a(java.lang.String):int");
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.v$f */
    public interface C16723f {

        /* renamed from: a */
        public static final String f42274a = "dragscale";

        /* renamed from: b */
        public static final String f42275b = "dragthreshold";

        /* renamed from: c */
        public static final String f42276c = "maxvelocity";

        /* renamed from: d */
        public static final String f42277d = "maxacceleration";

        /* renamed from: e */
        public static final String f42278e = "springmass";

        /* renamed from: f */
        public static final String f42279f = "springstiffness";

        /* renamed from: g */
        public static final String f42280g = "springdamping";

        /* renamed from: h */
        public static final String f42281h = "springstopthreshold";

        /* renamed from: i */
        public static final String f42282i = "dragdirection";

        /* renamed from: j */
        public static final String f42283j = "touchanchorid";

        /* renamed from: k */
        public static final String f42284k = "touchanchorside";

        /* renamed from: l */
        public static final String f42285l = "rotationcenterid";

        /* renamed from: m */
        public static final String f42286m = "touchregionid";

        /* renamed from: n */
        public static final String f42287n = "limitboundsto";

        /* renamed from: o */
        public static final String f42288o = "movewhenscrollattop";

        /* renamed from: p */
        public static final String f42289p = "ontouchup";

        /* renamed from: q */
        public static final String[] f42290q = {"autoComplete", "autoCompleteToStart", "autoCompleteToEnd", "stop", C16680d.f41931i, "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd"};

        /* renamed from: r */
        public static final String f42291r = "springboundary";

        /* renamed from: s */
        public static final String[] f42292s = {C16680d.f41936n, "bounceStart", "bounceEnd", "bounceBoth"};

        /* renamed from: t */
        public static final String f42293t = "autocompletemode";

        /* renamed from: u */
        public static final String[] f42294u = {"continuousVelocity", "spring"};

        /* renamed from: v */
        public static final String f42295v = "nestedscrollflags";

        /* renamed from: w */
        public static final String[] f42296w = {"none", "disablePostScroll", "disableScroll", "supportScrollUp"};
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.v$g */
    public interface C16724g {

        /* renamed from: a */
        public static final String f42297a = "KeyPosition";

        /* renamed from: b */
        public static final String f42298b = "transitionEasing";

        /* renamed from: c */
        public static final String f42299c = "drawPath";

        /* renamed from: d */
        public static final String f42300d = "percentWidth";

        /* renamed from: e */
        public static final String f42301e = "percentHeight";

        /* renamed from: f */
        public static final String f42302f = "sizePercent";

        /* renamed from: g */
        public static final String f42303g = "percentX";

        /* renamed from: h */
        public static final String f42304h = "percentY";

        /* renamed from: i */
        public static final int f42305i = 501;

        /* renamed from: j */
        public static final int f42306j = 502;

        /* renamed from: k */
        public static final int f42307k = 503;

        /* renamed from: l */
        public static final int f42308l = 504;

        /* renamed from: m */
        public static final int f42309m = 505;

        /* renamed from: n */
        public static final int f42310n = 506;

        /* renamed from: o */
        public static final int f42311o = 507;

        /* renamed from: p */
        public static final int f42312p = 508;

        /* renamed from: q */
        public static final int f42313q = 509;

        /* renamed from: r */
        public static final int f42314r = 510;

        /* renamed from: s */
        public static final String[] f42315s = {"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static int m76351a(java.lang.String r2) {
            /*
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1812823328: goto L_0x004f;
                    case -1127236479: goto L_0x0044;
                    case -1017587252: goto L_0x0039;
                    case -827014263: goto L_0x002e;
                    case -200259324: goto L_0x0023;
                    case 428090547: goto L_0x0018;
                    case 428090548: goto L_0x000d;
                    default: goto L_0x000b;
                }
            L_0x000b:
                r2 = r1
                goto L_0x0059
            L_0x000d:
                java.lang.String r0 = "percentY"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0016
                goto L_0x000b
            L_0x0016:
                r2 = 6
                goto L_0x0059
            L_0x0018:
                java.lang.String r0 = "percentX"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0021
                goto L_0x000b
            L_0x0021:
                r2 = 5
                goto L_0x0059
            L_0x0023:
                java.lang.String r0 = "sizePercent"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x002c
                goto L_0x000b
            L_0x002c:
                r2 = 4
                goto L_0x0059
            L_0x002e:
                java.lang.String r0 = "drawPath"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0037
                goto L_0x000b
            L_0x0037:
                r2 = 3
                goto L_0x0059
            L_0x0039:
                java.lang.String r0 = "percentHeight"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0042
                goto L_0x000b
            L_0x0042:
                r2 = 2
                goto L_0x0059
            L_0x0044:
                java.lang.String r0 = "percentWidth"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x004d
                goto L_0x000b
            L_0x004d:
                r2 = 1
                goto L_0x0059
            L_0x004f:
                java.lang.String r0 = "transitionEasing"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0058
                goto L_0x000b
            L_0x0058:
                r2 = 0
            L_0x0059:
                switch(r2) {
                    case 0: goto L_0x006f;
                    case 1: goto L_0x006c;
                    case 2: goto L_0x0069;
                    case 3: goto L_0x0066;
                    case 4: goto L_0x0063;
                    case 5: goto L_0x0060;
                    case 6: goto L_0x005d;
                    default: goto L_0x005c;
                }
            L_0x005c:
                return r1
            L_0x005d:
                r2 = 507(0x1fb, float:7.1E-43)
                return r2
            L_0x0060:
                r2 = 506(0x1fa, float:7.09E-43)
                return r2
            L_0x0063:
                r2 = 505(0x1f9, float:7.08E-43)
                return r2
            L_0x0066:
                r2 = 502(0x1f6, float:7.03E-43)
                return r2
            L_0x0069:
                r2 = 504(0x1f8, float:7.06E-43)
                return r2
            L_0x006c:
                r2 = 503(0x1f7, float:7.05E-43)
                return r2
            L_0x006f:
                r2 = 501(0x1f5, float:7.02E-43)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C16717v.C16724g.m76351a(java.lang.String):int");
        }

        static int getType(int i) {
            if (i == 100) {
                return 2;
            }
            if (i == 101) {
                return 8;
            }
            switch (i) {
                case f42305i /*501*/:
                case 502:
                    return 8;
                case 503:
                case 504:
                case f42309m /*505*/:
                case f42310n /*506*/:
                case f42311o /*507*/:
                    return 4;
                case f42312p /*508*/:
                    return 2;
                default:
                    return -1;
            }
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.v$h */
    public interface C16725h {

        /* renamed from: a */
        public static final String f42316a = "Transitions";

        /* renamed from: b */
        public static final String f42317b = "duration";

        /* renamed from: c */
        public static final String f42318c = "from";

        /* renamed from: d */
        public static final String f42319d = "to";

        /* renamed from: e */
        public static final String f42320e = "pathMotionArc";

        /* renamed from: f */
        public static final String f42321f = "autoTransition";

        /* renamed from: g */
        public static final String f42322g = "motionInterpolator";

        /* renamed from: h */
        public static final String f42323h = "staggered";

        /* renamed from: i */
        public static final String f42324i = "transitionFlags";

        /* renamed from: j */
        public static final int f42325j = 700;

        /* renamed from: k */
        public static final int f42326k = 701;

        /* renamed from: l */
        public static final int f42327l = 702;

        /* renamed from: m */
        public static final int f42328m = 509;

        /* renamed from: n */
        public static final int f42329n = 704;

        /* renamed from: o */
        public static final int f42330o = 705;

        /* renamed from: p */
        public static final int f42331p = 706;

        /* renamed from: q */
        public static final int f42332q = 707;

        /* renamed from: r */
        public static final String[] f42333r = {"duration", "from", "to", f42320e, f42321f, f42322g, f42323h, "from", f42324i};

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static int m76352a(java.lang.String r2) {
            /*
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1996906958: goto L_0x005b;
                    case -1992012396: goto L_0x0050;
                    case -1357874275: goto L_0x0045;
                    case -1298065308: goto L_0x003a;
                    case 3707: goto L_0x002f;
                    case 3151786: goto L_0x0024;
                    case 1310733335: goto L_0x0019;
                    case 1839260940: goto L_0x000e;
                    default: goto L_0x000b;
                }
            L_0x000b:
                r2 = r1
                goto L_0x0065
            L_0x000e:
                java.lang.String r0 = "staggered"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0017
                goto L_0x000b
            L_0x0017:
                r2 = 7
                goto L_0x0065
            L_0x0019:
                java.lang.String r0 = "pathMotionArc"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0022
                goto L_0x000b
            L_0x0022:
                r2 = 6
                goto L_0x0065
            L_0x0024:
                java.lang.String r0 = "from"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x002d
                goto L_0x000b
            L_0x002d:
                r2 = 5
                goto L_0x0065
            L_0x002f:
                java.lang.String r0 = "to"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0038
                goto L_0x000b
            L_0x0038:
                r2 = 4
                goto L_0x0065
            L_0x003a:
                java.lang.String r0 = "autoTransition"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0043
                goto L_0x000b
            L_0x0043:
                r2 = 3
                goto L_0x0065
            L_0x0045:
                java.lang.String r0 = "motionInterpolator"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x004e
                goto L_0x000b
            L_0x004e:
                r2 = 2
                goto L_0x0065
            L_0x0050:
                java.lang.String r0 = "duration"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0059
                goto L_0x000b
            L_0x0059:
                r2 = 1
                goto L_0x0065
            L_0x005b:
                java.lang.String r0 = "transitionFlags"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0064
                goto L_0x000b
            L_0x0064:
                r2 = 0
            L_0x0065:
                switch(r2) {
                    case 0: goto L_0x007e;
                    case 1: goto L_0x007b;
                    case 2: goto L_0x0078;
                    case 3: goto L_0x0075;
                    case 4: goto L_0x0072;
                    case 5: goto L_0x006f;
                    case 6: goto L_0x006c;
                    case 7: goto L_0x0069;
                    default: goto L_0x0068;
                }
            L_0x0068:
                return r1
            L_0x0069:
                r2 = 706(0x2c2, float:9.9E-43)
                return r2
            L_0x006c:
                r2 = 509(0x1fd, float:7.13E-43)
                return r2
            L_0x006f:
                r2 = 701(0x2bd, float:9.82E-43)
                return r2
            L_0x0072:
                r2 = 702(0x2be, float:9.84E-43)
                return r2
            L_0x0075:
                r2 = 704(0x2c0, float:9.87E-43)
                return r2
            L_0x0078:
                r2 = 705(0x2c1, float:9.88E-43)
                return r2
            L_0x007b:
                r2 = 700(0x2bc, float:9.81E-43)
                return r2
            L_0x007e:
                r2 = 707(0x2c3, float:9.91E-43)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C16717v.C16725h.m76352a(java.lang.String):int");
        }

        static int getType(int i) {
            if (i == 509) {
                return 2;
            }
            switch (i) {
                case 700:
                    return 2;
                case f42326k /*701*/:
                case 702:
                    return 8;
                default:
                    switch (i) {
                        case f42330o /*705*/:
                        case f42332q /*707*/:
                            return 8;
                        case 706:
                            return 4;
                        default:
                            return -1;
                    }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.v$i */
    public interface C16726i {

        /* renamed from: a */
        public static final String f42334a = "KeyTrigger";

        /* renamed from: b */
        public static final String f42335b = "viewTransitionOnCross";

        /* renamed from: c */
        public static final String f42336c = "viewTransitionOnPositiveCross";

        /* renamed from: d */
        public static final String f42337d = "viewTransitionOnNegativeCross";

        /* renamed from: e */
        public static final String f42338e = "postLayout";

        /* renamed from: f */
        public static final String f42339f = "triggerSlack";

        /* renamed from: g */
        public static final String f42340g = "triggerCollisionView";

        /* renamed from: h */
        public static final String f42341h = "triggerCollisionId";

        /* renamed from: i */
        public static final String f42342i = "triggerID";

        /* renamed from: j */
        public static final String f42343j = "positiveCross";

        /* renamed from: k */
        public static final String f42344k = "negativeCross";

        /* renamed from: l */
        public static final String f42345l = "triggerReceiver";

        /* renamed from: m */
        public static final String f42346m = "CROSS";

        /* renamed from: n */
        public static final String[] f42347n = {"viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS"};

        /* renamed from: o */
        public static final int f42348o = 301;

        /* renamed from: p */
        public static final int f42349p = 302;

        /* renamed from: q */
        public static final int f42350q = 303;

        /* renamed from: r */
        public static final int f42351r = 304;

        /* renamed from: s */
        public static final int f42352s = 305;

        /* renamed from: t */
        public static final int f42353t = 306;

        /* renamed from: u */
        public static final int f42354u = 307;

        /* renamed from: v */
        public static final int f42355v = 308;

        /* renamed from: w */
        public static final int f42356w = 309;

        /* renamed from: x */
        public static final int f42357x = 310;

        /* renamed from: y */
        public static final int f42358y = 311;

        /* renamed from: z */
        public static final int f42359z = 312;

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static int m76353a(java.lang.String r2) {
            /*
                r2.hashCode()
                int r0 = r2.hashCode()
                r1 = -1
                switch(r0) {
                    case -1594793529: goto L_0x0090;
                    case -966421266: goto L_0x0084;
                    case -786670827: goto L_0x0079;
                    case -648752941: goto L_0x006e;
                    case -638126837: goto L_0x0063;
                    case -76025313: goto L_0x0058;
                    case -9754574: goto L_0x004d;
                    case 64397344: goto L_0x0042;
                    case 364489912: goto L_0x0035;
                    case 1301930599: goto L_0x0028;
                    case 1401391082: goto L_0x001b;
                    case 1535404999: goto L_0x000e;
                    default: goto L_0x000b;
                }
            L_0x000b:
                r2 = r1
                goto L_0x009b
            L_0x000e:
                java.lang.String r0 = "triggerReceiver"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0017
                goto L_0x000b
            L_0x0017:
                r2 = 11
                goto L_0x009b
            L_0x001b:
                java.lang.String r0 = "postLayout"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0024
                goto L_0x000b
            L_0x0024:
                r2 = 10
                goto L_0x009b
            L_0x0028:
                java.lang.String r0 = "viewTransitionOnCross"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0031
                goto L_0x000b
            L_0x0031:
                r2 = 9
                goto L_0x009b
            L_0x0035:
                java.lang.String r0 = "triggerSlack"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x003e
                goto L_0x000b
            L_0x003e:
                r2 = 8
                goto L_0x009b
            L_0x0042:
                java.lang.String r0 = "CROSS"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x004b
                goto L_0x000b
            L_0x004b:
                r2 = 7
                goto L_0x009b
            L_0x004d:
                java.lang.String r0 = "viewTransitionOnNegativeCross"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0056
                goto L_0x000b
            L_0x0056:
                r2 = 6
                goto L_0x009b
            L_0x0058:
                java.lang.String r0 = "triggerCollisionView"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0061
                goto L_0x000b
            L_0x0061:
                r2 = 5
                goto L_0x009b
            L_0x0063:
                java.lang.String r0 = "negativeCross"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x006c
                goto L_0x000b
            L_0x006c:
                r2 = 4
                goto L_0x009b
            L_0x006e:
                java.lang.String r0 = "triggerID"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0077
                goto L_0x000b
            L_0x0077:
                r2 = 3
                goto L_0x009b
            L_0x0079:
                java.lang.String r0 = "triggerCollisionId"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0082
                goto L_0x000b
            L_0x0082:
                r2 = 2
                goto L_0x009b
            L_0x0084:
                java.lang.String r0 = "viewTransitionOnPositiveCross"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x008e
                goto L_0x000b
            L_0x008e:
                r2 = 1
                goto L_0x009b
            L_0x0090:
                java.lang.String r0 = "positiveCross"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x009a
                goto L_0x000b
            L_0x009a:
                r2 = 0
            L_0x009b:
                switch(r2) {
                    case 0: goto L_0x00c0;
                    case 1: goto L_0x00bd;
                    case 2: goto L_0x00ba;
                    case 3: goto L_0x00b7;
                    case 4: goto L_0x00b4;
                    case 5: goto L_0x00b1;
                    case 6: goto L_0x00ae;
                    case 7: goto L_0x00ab;
                    case 8: goto L_0x00a8;
                    case 9: goto L_0x00a5;
                    case 10: goto L_0x00a2;
                    case 11: goto L_0x009f;
                    default: goto L_0x009e;
                }
            L_0x009e:
                return r1
            L_0x009f:
                r2 = 311(0x137, float:4.36E-43)
                return r2
            L_0x00a2:
                r2 = 304(0x130, float:4.26E-43)
                return r2
            L_0x00a5:
                r2 = 301(0x12d, float:4.22E-43)
                return r2
            L_0x00a8:
                r2 = 305(0x131, float:4.27E-43)
                return r2
            L_0x00ab:
                r2 = 312(0x138, float:4.37E-43)
                return r2
            L_0x00ae:
                r2 = 303(0x12f, float:4.25E-43)
                return r2
            L_0x00b1:
                r2 = 306(0x132, float:4.29E-43)
                return r2
            L_0x00b4:
                r2 = 310(0x136, float:4.34E-43)
                return r2
            L_0x00b7:
                r2 = 308(0x134, float:4.32E-43)
                return r2
            L_0x00ba:
                r2 = 307(0x133, float:4.3E-43)
                return r2
            L_0x00bd:
                r2 = 302(0x12e, float:4.23E-43)
                return r2
            L_0x00c0:
                r2 = 309(0x135, float:4.33E-43)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C16717v.C16726i.m76353a(java.lang.String):int");
        }
    }

    /* renamed from: a */
    int mo48818a(String str);

    /* renamed from: b */
    boolean mo48820b(int i, int i2);

    /* renamed from: c */
    boolean mo48822c(int i, float f);

    /* renamed from: d */
    boolean mo48824d(int i, boolean z);

    /* renamed from: e */
    boolean mo48826e(int i, String str);
}
