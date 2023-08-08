package androidx.constraintlayout.core.parser;

public class CLParser {

    /* renamed from: d */
    public static boolean f42373d = false;

    /* renamed from: a */
    public String f42374a;

    /* renamed from: b */
    public boolean f42375b = false;

    /* renamed from: c */
    public int f42376c;

    public enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    /* renamed from: androidx.constraintlayout.core.parser.CLParser$a */
    public static /* synthetic */ class C16731a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42385a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.parser.CLParser$TYPE[] r0 = androidx.constraintlayout.core.parser.CLParser.TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42385a = r0
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42385a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42385a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42385a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f42385a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.KEY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f42385a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.parser.CLParser.C16731a.<clinit>():void");
        }
    }

    public CLParser(String str) {
        this.f42374a = str;
    }

    /* renamed from: d */
    public static C16738f m76375d(String str) throws CLParsingException {
        return new CLParser(str).mo49130c();
    }

    /* renamed from: a */
    public final C16735c mo49128a(C16735c cVar, int i, TYPE type, boolean z, char[] cArr) {
        C16735c cVar2;
        if (f42373d) {
            System.out.println("CREATE " + type + " at " + cArr[i]);
        }
        switch (C16731a.f42385a[type.ordinal()]) {
            case 1:
                cVar2 = C16738f.m76449M0(cArr);
                break;
            case 2:
                cVar2 = C16733a.m76387k0(cArr);
                break;
            case 3:
                cVar2 = C16740g.m76453j0(cArr);
                break;
            case 4:
                cVar2 = C16737e.m76442j0(cArr);
                break;
            case 5:
                cVar2 = C16736d.m76436k0(cArr);
                break;
            case 6:
                cVar2 = CLToken.m76380j0(cArr);
                break;
            default:
                cVar2 = null;
                break;
        }
        i++;
        if (cVar2 == null) {
            return null;
        }
        cVar2.mo49176e0(this.f42376c);
        if (z) {
            cVar2.mo49177f0((long) i);
        }
        if (cVar instanceof C16734b) {
            cVar2.mo49173X((C16734b) cVar);
        }
        return cVar2;
    }

    /* renamed from: b */
    public final C16735c mo49129b(int i, char c, C16735c cVar, char[] cArr) throws CLParsingException {
        if (c == 9 || c == 10 || c == 13 || c == ' ') {
            return cVar;
        }
        if (c == '\"' || c == '\'') {
            if (cVar instanceof C16738f) {
                return mo49128a(cVar, i, TYPE.KEY, true, cArr);
            }
            return mo49128a(cVar, i, TYPE.STRING, true, cArr);
        } else if (c != '[') {
            if (c != ']') {
                if (c == '{') {
                    return mo49128a(cVar, i, TYPE.OBJECT, true, cArr);
                } else if (c != '}') {
                    switch (c) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return mo49128a(cVar, i, TYPE.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            return cVar;
                        case '/':
                            int i2 = i + 1;
                            if (i2 >= cArr.length || cArr[i2] != '/') {
                                return cVar;
                            }
                            this.f42375b = true;
                            return cVar;
                        default:
                            if (!(cVar instanceof C16734b) || (cVar instanceof C16738f)) {
                                return mo49128a(cVar, i, TYPE.KEY, true, cArr);
                            }
                            C16735c a = mo49128a(cVar, i, TYPE.TOKEN, true, cArr);
                            CLToken cLToken = (CLToken) a;
                            if (cLToken.mo49138n0(c, (long) i)) {
                                return a;
                            }
                            throw new CLParsingException("incorrect token <" + c + "> at line " + this.f42376c, cLToken);
                    }
                }
            }
            cVar.mo49174Y((long) (i - 1));
            C16735c i3 = cVar.mo49179i();
            i3.mo49174Y((long) i);
            return i3;
        } else {
            return mo49128a(cVar, i, TYPE.ARRAY, true, cArr);
        }
    }

    /* renamed from: c */
    public C16738f mo49130c() throws CLParsingException {
        char[] charArray = this.f42374a.toCharArray();
        int length = charArray.length;
        int i = 1;
        this.f42376c = 1;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            char c = charArray[i2];
            if (c == '{') {
                break;
            }
            if (c == 10) {
                this.f42376c++;
            }
            i2++;
        }
        if (i2 != -1) {
            C16738f M0 = C16738f.m76449M0(charArray);
            M0.mo49176e0(this.f42376c);
            M0.mo49177f0((long) i2);
            int i3 = i2 + 1;
            C16735c cVar = M0;
            while (i3 < length) {
                char c2 = charArray[i3];
                if (c2 == 10) {
                    this.f42376c += i;
                }
                if (this.f42375b) {
                    if (c2 == 10) {
                        this.f42375b = z;
                    } else {
                        continue;
                        i3++;
                        i = 1;
                        z = false;
                    }
                }
                if (cVar == null) {
                    break;
                }
                if (cVar.mo49170M()) {
                    cVar = mo49129b(i3, c2, cVar, charArray);
                } else if (cVar instanceof C16738f) {
                    if (c2 == '}') {
                        cVar.mo49174Y((long) (i3 - 1));
                    } else {
                        cVar = mo49129b(i3, c2, cVar, charArray);
                    }
                } else if (!(cVar instanceof C16733a)) {
                    boolean z2 = cVar instanceof C16740g;
                    if (z2) {
                        long j = cVar.f42401b;
                        if (charArray[(int) j] == c2) {
                            cVar.mo49177f0(j + 1);
                            cVar.mo49174Y((long) (i3 - 1));
                        }
                    } else {
                        if (cVar instanceof CLToken) {
                            CLToken cLToken = (CLToken) cVar;
                            if (!cLToken.mo49138n0(c2, (long) i3)) {
                                throw new CLParsingException("parsing incorrect token " + cLToken.mo49178h() + " at line " + this.f42376c, cLToken);
                            }
                        }
                        if ((cVar instanceof C16736d) || z2) {
                            long j2 = cVar.f42401b;
                            char c3 = charArray[(int) j2];
                            if ((c3 == '\'' || c3 == '\"') && c3 == c2) {
                                cVar.mo49177f0(j2 + 1);
                                cVar.mo49174Y((long) (i3 - 1));
                            }
                        }
                        if (!cVar.mo49170M() && (c2 == '}' || c2 == ']' || c2 == ',' || c2 == ' ' || c2 == 9 || c2 == 13 || c2 == 10 || c2 == ':')) {
                            long j3 = (long) (i3 - 1);
                            cVar.mo49174Y(j3);
                            if (c2 == '}' || c2 == ']') {
                                cVar = cVar.mo49179i();
                                cVar.mo49174Y(j3);
                                if (cVar instanceof C16736d) {
                                    cVar = cVar.mo49179i();
                                    cVar.mo49174Y(j3);
                                }
                            }
                        }
                    }
                } else if (c2 == ']') {
                    cVar.mo49174Y((long) (i3 - 1));
                } else {
                    cVar = mo49129b(i3, c2, cVar, charArray);
                }
                if (cVar.mo49170M() && (!(cVar instanceof C16736d) || ((C16736d) cVar).f42397v.size() > 0)) {
                    cVar = cVar.mo49179i();
                }
                i3++;
                i = 1;
                z = false;
            }
            while (cVar != null && !cVar.mo49170M()) {
                if (cVar instanceof C16740g) {
                    cVar.mo49177f0((long) (((int) cVar.f42401b) + 1));
                }
                cVar.mo49174Y((long) (length - 1));
                cVar = cVar.mo49179i();
            }
            if (f42373d) {
                System.out.println("Root: " + M0.mo49134i0());
            }
            return M0;
        }
        throw new CLParsingException("invalid json content", (C16735c) null);
    }
}
