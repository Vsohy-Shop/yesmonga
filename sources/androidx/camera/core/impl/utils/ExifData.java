package androidx.camera.core.impl.utils;

import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.core.util.C18001r;
import androidx.exifinterface.media.C19135a;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class ExifData {

    /* renamed from: c */
    public static final String f4287c = "ExifData";

    /* renamed from: d */
    public static final boolean f4288d = false;

    /* renamed from: e */
    public static final String[] f4289e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: f */
    public static final String f4290f = "ExifIFDPointer";

    /* renamed from: g */
    public static final String f4291g = "GPSInfoIFDPointer";

    /* renamed from: h */
    public static final String f4292h = "InteroperabilityIFDPointer";

    /* renamed from: i */
    public static final String f4293i = "SubIFDPointer";

    /* renamed from: j */
    public static final C1563g[] f4294j;

    /* renamed from: k */
    public static final C1563g[] f4295k;

    /* renamed from: l */
    public static final C1563g[] f4296l;

    /* renamed from: m */
    public static final C1563g[] f4297m = {new C1563g("SubIFDPointer", 330, 4), new C1563g("ExifIFDPointer", 34665, 4), new C1563g("GPSInfoIFDPointer", 34853, 4), new C1563g("InteroperabilityIFDPointer", 40965, 4)};

    /* renamed from: n */
    public static final C1563g[] f4298n;

    /* renamed from: o */
    public static final C1563g[][] f4299o;

    /* renamed from: p */
    public static final int f4300p = 0;

    /* renamed from: q */
    public static final int f4301q = 1;

    /* renamed from: r */
    public static final int f4302r = 2;

    /* renamed from: s */
    public static final int f4303s = 3;

    /* renamed from: t */
    public static final HashSet<String> f4304t = new HashSet<>(Arrays.asList(new String[]{C19135a.f49068v0, C19135a.f49059u0, C19135a.f48703E1}));

    /* renamed from: u */
    public static final int f4305u = 1000;

    /* renamed from: a */
    public final List<Map<String, C1522e>> f4306a;

    /* renamed from: b */
    public final ByteOrder f4307b;

    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    /* renamed from: androidx.camera.core.impl.utils.ExifData$a */
    public static /* synthetic */ class C1508a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4311a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4312b;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode[] r0 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4312b = r0
                r1 = 1
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r2 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.AUTO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4312b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r3 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.MANUAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState[] r2 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f4311a = r2
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r3 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.READY     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f4311a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r2 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.NONE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f4311a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r1 = androidx.camera.core.impl.CameraCaptureMetaData.FlashState.FIRED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifData.C1508a.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.ExifData$b */
    public static final class C1509b {

        /* renamed from: c */
        public static final Pattern f4313c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d */
        public static final Pattern f4314d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e */
        public static final Pattern f4315e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f */
        public static final int f4316f = 19;

        /* renamed from: g */
        public static final List<HashMap<String, C1563g>> f4317g = Collections.list(new C1510a());

        /* renamed from: a */
        public final List<Map<String, C1522e>> f4318a = Collections.list(new C1511b());

        /* renamed from: b */
        public final ByteOrder f4319b;

        /* renamed from: androidx.camera.core.impl.utils.ExifData$b$a */
        public class C1510a implements Enumeration<HashMap<String, C1563g>> {

            /* renamed from: a */
            public int f4320a = 0;

            /* renamed from: a */
            public HashMap<String, C1563g> nextElement() {
                HashMap<String, C1563g> hashMap = new HashMap<>();
                for (C1563g gVar : ExifData.f4299o[this.f4320a]) {
                    hashMap.put(gVar.f4463b, gVar);
                }
                this.f4320a++;
                return hashMap;
            }

            public boolean hasMoreElements() {
                return this.f4320a < ExifData.f4299o.length;
            }
        }

        /* renamed from: androidx.camera.core.impl.utils.ExifData$b$b */
        public class C1511b implements Enumeration<Map<String, C1522e>> {

            /* renamed from: a */
            public int f4321a = 0;

            public C1511b() {
            }

            /* renamed from: a */
            public Map<String, C1522e> nextElement() {
                this.f4321a++;
                return new HashMap();
            }

            public boolean hasMoreElements() {
                return this.f4321a < ExifData.f4299o.length;
            }
        }

        /* renamed from: androidx.camera.core.impl.utils.ExifData$b$c */
        public class C1512c implements Enumeration<Map<String, C1522e>> {

            /* renamed from: a */
            public final Enumeration<Map<String, C1522e>> f4323a;

            public C1512c() {
                this.f4323a = Collections.enumeration(C1509b.this.f4318a);
            }

            /* renamed from: a */
            public Map<String, C1522e> nextElement() {
                return new HashMap(this.f4323a.nextElement());
            }

            public boolean hasMoreElements() {
                return this.f4323a.hasMoreElements();
            }
        }

        public C1509b(@C0359n0 ByteOrder byteOrder) {
            this.f4319b = byteOrder;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            java.lang.Double.parseDouble(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
            return new android.util.Pair<>(12, -1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
            return new android.util.Pair<>(2, -1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013c */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.util.Pair<java.lang.Integer, java.lang.Integer> m6329b(java.lang.String r10) {
            /*
                java.lang.String r0 = ","
                boolean r1 = r10.contains(r0)
                r2 = 0
                r3 = 1
                r4 = 2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r6 = -1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                if (r1 == 0) goto L_0x00a6
                java.lang.String[] r10 = r10.split(r0, r6)
                r0 = r10[r2]
                android.util.Pair r0 = m6329b(r0)
                java.lang.Object r1 = r0.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                if (r1 != r4) goto L_0x0029
                return r0
            L_0x0029:
                int r1 = r10.length
                if (r3 >= r1) goto L_0x00a5
                r1 = r10[r3]
                android.util.Pair r1 = m6329b(r1)
                java.lang.Object r2 = r1.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r4 = r0.first
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x004d
                java.lang.Object r2 = r1.second
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r4 = r0.first
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x004b
                goto L_0x004d
            L_0x004b:
                r2 = r6
                goto L_0x0055
            L_0x004d:
                java.lang.Object r2 = r0.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
            L_0x0055:
                java.lang.Object r4 = r0.second
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                if (r4 == r6) goto L_0x0080
                java.lang.Object r4 = r1.first
                java.lang.Integer r4 = (java.lang.Integer) r4
                java.lang.Object r8 = r0.second
                boolean r4 = r4.equals(r8)
                if (r4 != 0) goto L_0x0077
                java.lang.Object r1 = r1.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Object r4 = r0.second
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x0080
            L_0x0077:
                java.lang.Object r1 = r0.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                goto L_0x0081
            L_0x0080:
                r1 = r6
            L_0x0081:
                if (r2 != r6) goto L_0x008b
                if (r1 != r6) goto L_0x008b
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            L_0x008b:
                if (r2 != r6) goto L_0x0097
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.<init>(r1, r7)
                goto L_0x00a2
            L_0x0097:
                if (r1 != r6) goto L_0x00a2
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0.<init>(r1, r7)
            L_0x00a2:
                int r3 = r3 + 1
                goto L_0x0029
            L_0x00a5:
                return r0
            L_0x00a6:
                java.lang.String r0 = "/"
                boolean r1 = r10.contains(r0)
                r8 = 0
                if (r1 == 0) goto L_0x0105
                java.lang.String[] r10 = r10.split(r0, r6)
                int r0 = r10.length
                if (r0 != r4) goto L_0x00ff
                r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x00ff }
                double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
                long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
                r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x00ff }
                double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x00ff }
                long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
                int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                r4 = 10
                if (r10 < 0) goto L_0x00f5
                int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r10 >= 0) goto L_0x00d0
                goto L_0x00f5
            L_0x00d0:
                r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                r0 = 5
                if (r10 > 0) goto L_0x00eb
                int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r10 <= 0) goto L_0x00dd
                goto L_0x00eb
            L_0x00dd:
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
                r10.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
                return r10
            L_0x00eb:
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
                return r10
            L_0x00f5:
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
                return r10
            L_0x00ff:
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            L_0x0105:
                long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013c }
                int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                r3 = 4
                if (r2 < 0) goto L_0x0124
                r8 = 65535(0xffff, double:3.23786E-319)
                int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r0 > 0) goto L_0x0124
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                r1 = 3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x0124:
                if (r2 >= 0) goto L_0x0132
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                r1 = 9
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x0132:
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x013c:
                java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014b }
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014b }
                r0 = 12
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014b }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014b }
                return r10
            L_0x014b:
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifData.C1509b.m6329b(java.lang.String):android.util.Pair");
        }

        @C0359n0
        /* renamed from: a */
        public ExifData mo5339a() {
            ArrayList list = Collections.list(new C1512c());
            if (!((Map) list.get(1)).isEmpty()) {
                mo5342e(C19135a.f49077w0, String.valueOf(0), list);
                mo5342e(C19135a.f48907b0, "0230", list);
                mo5342e(C19135a.f48955h0, "1,2,3,0", list);
                mo5342e(C19135a.f48783N0, String.valueOf(0), list);
                mo5342e(C19135a.f48792O0, String.valueOf(0), list);
                mo5342e(C19135a.f48915c0, "0100", list);
                mo5342e(C19135a.f48864W0, String.valueOf(2), list);
                mo5342e(C19135a.f48900a1, String.valueOf(3), list);
                mo5342e(C19135a.f48908b1, String.valueOf(1), list);
                mo5342e(C19135a.f48924d1, String.valueOf(0), list);
                mo5342e(C19135a.f48964i1, String.valueOf(0), list);
                mo5342e(C19135a.f48980k1, String.valueOf(0), list);
                mo5342e(C19135a.f48988l1, String.valueOf(0), list);
                mo5342e(C19135a.f48996m1, String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                mo5342e(C19135a.f49087x1, "2300", list);
                mo5342e(C19135a.f48748J1, "K", list);
                mo5342e(C19135a.f48766L1, C19135a.f48928d5, list);
                mo5342e(C19135a.f48784N1, C19135a.f48928d5, list);
                mo5342e(C19135a.f48847U1, C19135a.f48928d5, list);
                mo5342e(C19135a.f48865W1, "K", list);
            }
            return new ExifData(this.f4319b, list);
        }

        @C0359n0
        /* renamed from: c */
        public C1509b mo5340c(@C0359n0 String str) {
            mo5343f(str, (String) null, this.f4318a);
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C1509b mo5341d(@C0359n0 String str, @C0359n0 String str2) {
            mo5343f(str, str2, this.f4318a);
            return this;
        }

        /* renamed from: e */
        public final void mo5342e(@C0359n0 String str, @C0359n0 String str2, @C0359n0 List<Map<String, C1522e>> list) {
            for (Map<String, C1522e> containsKey : list) {
                if (containsKey.containsKey(str)) {
                    return;
                }
            }
            mo5343f(str, str2, list);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x018a, code lost:
            if (r7 != r0) goto L_0x02de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0225, code lost:
            r5 = r6;
            r15 = 1;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo5343f(@androidx.annotation.C0359n0 java.lang.String r18, @androidx.annotation.C0363p0 java.lang.String r19, @androidx.annotation.C0359n0 java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.C1522e>> r20) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                r3 = r20
                java.lang.String r4 = "DateTime"
                boolean r4 = r4.equals(r0)
                java.lang.String r5 = " : "
                java.lang.String r6 = "Invalid value for "
                java.lang.String r7 = "ExifData"
                if (r4 != 0) goto L_0x0026
                java.lang.String r4 = "DateTimeOriginal"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0026
                java.lang.String r4 = "DateTimeDigitized"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x006d
            L_0x0026:
                if (r2 == 0) goto L_0x006d
                java.util.regex.Pattern r4 = f4314d
                java.util.regex.Matcher r4 = r4.matcher(r2)
                boolean r4 = r4.find()
                java.util.regex.Pattern r8 = f4315e
                java.util.regex.Matcher r8 = r8.matcher(r2)
                boolean r8 = r8.find()
                int r9 = r19.length()
                r10 = 19
                if (r9 != r10) goto L_0x0054
                if (r4 != 0) goto L_0x0049
                if (r8 != 0) goto L_0x0049
                goto L_0x0054
            L_0x0049:
                if (r8 == 0) goto L_0x006d
                java.lang.String r4 = "-"
                java.lang.String r8 = ":"
                java.lang.String r2 = r2.replaceAll(r4, r8)
                goto L_0x006d
            L_0x0054:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r6)
                r3.append(r0)
                r3.append(r5)
                r3.append(r2)
                java.lang.String r0 = r3.toString()
                androidx.camera.core.C1417i2.m5924n(r7, r0)
                return
            L_0x006d:
                java.lang.String r4 = "ISOSpeedRatings"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0077
                java.lang.String r0 = "PhotographicSensitivity"
            L_0x0077:
                r4 = r0
                r0 = 2
                r8 = 1
                if (r2 == 0) goto L_0x0124
                java.util.HashSet<java.lang.String> r9 = androidx.camera.core.impl.utils.ExifData.f4304t
                boolean r9 = r9.contains(r4)
                if (r9 == 0) goto L_0x0124
                java.lang.String r9 = "GPSTimeStamp"
                boolean r9 = r4.equals(r9)
                if (r9 == 0) goto L_0x00fc
                java.util.regex.Pattern r9 = f4313c
                java.util.regex.Matcher r9 = r9.matcher(r2)
                boolean r10 = r9.find()
                if (r10 != 0) goto L_0x00b1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                r0.append(r4)
                r0.append(r5)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                androidx.camera.core.C1417i2.m5924n(r7, r0)
                return
            L_0x00b1:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = r9.group(r8)
                java.lang.Object r5 = androidx.core.util.C18001r.m81775l(r5)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                r2.append(r5)
                java.lang.String r5 = "/1,"
                r2.append(r5)
                java.lang.String r6 = r9.group(r0)
                java.lang.Object r6 = androidx.core.util.C18001r.m81775l(r6)
                java.lang.String r6 = (java.lang.String) r6
                int r6 = java.lang.Integer.parseInt(r6)
                r2.append(r6)
                r2.append(r5)
                r5 = 3
                java.lang.String r5 = r9.group(r5)
                java.lang.Object r5 = androidx.core.util.C18001r.m81775l(r5)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                r2.append(r5)
                java.lang.String r5 = "/1"
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                goto L_0x0124
            L_0x00fc:
                double r9 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x010a }
                androidx.camera.core.impl.utils.h r11 = new androidx.camera.core.impl.utils.h     // Catch:{ NumberFormatException -> 0x010a }
                r11.<init>(r9)     // Catch:{ NumberFormatException -> 0x010a }
                java.lang.String r2 = r11.toString()     // Catch:{ NumberFormatException -> 0x010a }
                goto L_0x0124
            L_0x010a:
                r0 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r6)
                r3.append(r4)
                r3.append(r5)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                androidx.camera.core.C1417i2.m5925o(r7, r2, r0)
                return
            L_0x0124:
                r5 = 0
                r6 = r5
            L_0x0126:
                androidx.camera.core.impl.utils.g[][] r7 = androidx.camera.core.impl.utils.ExifData.f4299o
                int r7 = r7.length
                if (r6 >= r7) goto L_0x02e7
                java.util.List<java.util.HashMap<java.lang.String, androidx.camera.core.impl.utils.g>> r7 = f4317g
                java.lang.Object r7 = r7.get(r6)
                java.util.HashMap r7 = (java.util.HashMap) r7
                java.lang.Object r7 = r7.get(r4)
                androidx.camera.core.impl.utils.g r7 = (androidx.camera.core.impl.utils.C1563g) r7
                if (r7 == 0) goto L_0x02de
                if (r2 != 0) goto L_0x0148
                java.lang.Object r7 = r3.get(r6)
                java.util.Map r7 = (java.util.Map) r7
                r7.remove(r4)
                goto L_0x02de
            L_0x0148:
                android.util.Pair r9 = m6329b(r2)
                int r10 = r7.f4464c
                java.lang.Object r11 = r9.first
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                r12 = -1
                if (r10 == r11) goto L_0x018d
                int r10 = r7.f4464c
                java.lang.Object r11 = r9.second
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                if (r10 != r11) goto L_0x0166
                goto L_0x018d
            L_0x0166:
                int r10 = r7.f4465d
                if (r10 == r12) goto L_0x0183
                java.lang.Object r11 = r9.first
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                if (r10 == r11) goto L_0x0180
                int r10 = r7.f4465d
                java.lang.Object r9 = r9.second
                java.lang.Integer r9 = (java.lang.Integer) r9
                int r9 = r9.intValue()
                if (r10 != r9) goto L_0x0183
            L_0x0180:
                int r7 = r7.f4465d
                goto L_0x018f
            L_0x0183:
                int r7 = r7.f4464c
                if (r7 == r8) goto L_0x018f
                r9 = 7
                if (r7 == r9) goto L_0x018f
                if (r7 != r0) goto L_0x02de
                goto L_0x018f
            L_0x018d:
                int r7 = r7.f4464c
            L_0x018f:
                java.lang.String r9 = "/"
                java.lang.String r10 = ","
                switch(r7) {
                    case 1: goto L_0x02ce;
                    case 2: goto L_0x02be;
                    case 3: goto L_0x0296;
                    case 4: goto L_0x026e;
                    case 5: goto L_0x0229;
                    case 6: goto L_0x0196;
                    case 7: goto L_0x02be;
                    case 8: goto L_0x0196;
                    case 9: goto L_0x0200;
                    case 10: goto L_0x01bf;
                    case 11: goto L_0x0196;
                    case 12: goto L_0x0198;
                    default: goto L_0x0196;
                }
            L_0x0196:
                goto L_0x02de
            L_0x0198:
                java.lang.String[] r7 = r2.split(r10, r12)
                int r9 = r7.length
                double[] r9 = new double[r9]
                r10 = r5
            L_0x01a0:
                int r11 = r7.length
                if (r10 >= r11) goto L_0x01ae
                r11 = r7[r10]
                double r11 = java.lang.Double.parseDouble(r11)
                r9[r10] = r11
                int r10 = r10 + 1
                goto L_0x01a0
            L_0x01ae:
                java.lang.Object r7 = r3.get(r6)
                java.util.Map r7 = (java.util.Map) r7
                java.nio.ByteOrder r10 = r1.f4319b
                androidx.camera.core.impl.utils.e r9 = androidx.camera.core.impl.utils.C1522e.m6419c(r9, r10)
                r7.put(r4, r9)
                goto L_0x02de
            L_0x01bf:
                java.lang.String[] r7 = r2.split(r10, r12)
                int r10 = r7.length
                androidx.camera.core.impl.utils.h[] r10 = new androidx.camera.core.impl.utils.C1564h[r10]
                r11 = r5
            L_0x01c7:
                int r13 = r7.length
                if (r11 >= r13) goto L_0x01ee
                r13 = r7[r11]
                java.lang.String[] r13 = r13.split(r9, r12)
                androidx.camera.core.impl.utils.h r14 = new androidx.camera.core.impl.utils.h
                r15 = r13[r5]
                double r0 = java.lang.Double.parseDouble(r15)
                long r0 = (long) r0
                r13 = r13[r8]
                r15 = r9
                double r8 = java.lang.Double.parseDouble(r13)
                long r8 = (long) r8
                r14.<init>(r0, r8)
                r10[r11] = r14
                int r11 = r11 + 1
                r9 = r15
                r0 = 2
                r8 = 1
                r1 = r17
                goto L_0x01c7
            L_0x01ee:
                java.lang.Object r0 = r3.get(r6)
                java.util.Map r0 = (java.util.Map) r0
                r1 = r17
                java.nio.ByteOrder r7 = r1.f4319b
                androidx.camera.core.impl.utils.e r7 = androidx.camera.core.impl.utils.C1522e.m6423g(r10, r7)
                r0.put(r4, r7)
                goto L_0x0225
            L_0x0200:
                java.lang.String[] r0 = r2.split(r10, r12)
                int r7 = r0.length
                int[] r7 = new int[r7]
                r8 = r5
            L_0x0208:
                int r9 = r0.length
                if (r8 >= r9) goto L_0x0216
                r9 = r0[r8]
                int r9 = java.lang.Integer.parseInt(r9)
                r7[r8] = r9
                int r8 = r8 + 1
                goto L_0x0208
            L_0x0216:
                java.lang.Object r0 = r3.get(r6)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r8 = r1.f4319b
                androidx.camera.core.impl.utils.e r7 = androidx.camera.core.impl.utils.C1522e.m6421e(r7, r8)
                r0.put(r4, r7)
            L_0x0225:
                r5 = r6
                r15 = 1
                goto L_0x02e0
            L_0x0229:
                r15 = r9
                java.lang.String[] r0 = r2.split(r10, r12)
                int r7 = r0.length
                androidx.camera.core.impl.utils.h[] r7 = new androidx.camera.core.impl.utils.C1564h[r7]
                r8 = r5
            L_0x0232:
                int r9 = r0.length
                if (r8 >= r9) goto L_0x025b
                r9 = r0[r8]
                r10 = r15
                java.lang.String[] r9 = r9.split(r10, r12)
                androidx.camera.core.impl.utils.h r11 = new androidx.camera.core.impl.utils.h
                r13 = r9[r5]
                double r13 = java.lang.Double.parseDouble(r13)
                long r13 = (long) r13
                r15 = 1
                r9 = r9[r15]
                r16 = r6
                double r5 = java.lang.Double.parseDouble(r9)
                long r5 = (long) r5
                r11.<init>(r13, r5)
                r7[r8] = r11
                int r8 = r8 + 1
                r15 = r10
                r6 = r16
                r5 = 0
                goto L_0x0232
            L_0x025b:
                r5 = r6
                r15 = 1
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r6 = r1.f4319b
                androidx.camera.core.impl.utils.e r6 = androidx.camera.core.impl.utils.C1522e.m6428l(r7, r6)
                r0.put(r4, r6)
                goto L_0x02e0
            L_0x026e:
                r5 = r6
                r15 = r8
                java.lang.String[] r0 = r2.split(r10, r12)
                int r6 = r0.length
                long[] r6 = new long[r6]
                r7 = 0
            L_0x0278:
                int r8 = r0.length
                if (r7 >= r8) goto L_0x0286
                r8 = r0[r7]
                long r8 = java.lang.Long.parseLong(r8)
                r6[r7] = r8
                int r7 = r7 + 1
                goto L_0x0278
            L_0x0286:
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r7 = r1.f4319b
                androidx.camera.core.impl.utils.e r6 = androidx.camera.core.impl.utils.C1522e.m6426j(r6, r7)
                r0.put(r4, r6)
                goto L_0x02e0
            L_0x0296:
                r5 = r6
                r15 = r8
                java.lang.String[] r0 = r2.split(r10, r12)
                int r6 = r0.length
                int[] r6 = new int[r6]
                r7 = 0
            L_0x02a0:
                int r8 = r0.length
                if (r7 >= r8) goto L_0x02ae
                r8 = r0[r7]
                int r8 = java.lang.Integer.parseInt(r8)
                r6[r7] = r8
                int r7 = r7 + 1
                goto L_0x02a0
            L_0x02ae:
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r7 = r1.f4319b
                androidx.camera.core.impl.utils.e r6 = androidx.camera.core.impl.utils.C1522e.m6430n(r6, r7)
                r0.put(r4, r6)
                goto L_0x02e0
            L_0x02be:
                r5 = r6
                r15 = r8
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                androidx.camera.core.impl.utils.e r6 = androidx.camera.core.impl.utils.C1522e.m6424h(r2)
                r0.put(r4, r6)
                goto L_0x02e0
            L_0x02ce:
                r5 = r6
                r15 = r8
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                androidx.camera.core.impl.utils.e r6 = androidx.camera.core.impl.utils.C1522e.m6417a(r2)
                r0.put(r4, r6)
                goto L_0x02e0
            L_0x02de:
                r5 = r6
                r15 = r8
            L_0x02e0:
                int r6 = r5 + 1
                r8 = r15
                r0 = 2
                r5 = 0
                goto L_0x0126
            L_0x02e7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifData.C1509b.mo5343f(java.lang.String, java.lang.String, java.util.List):void");
        }

        @C0359n0
        /* renamed from: g */
        public C1509b mo5344g(long j) {
            return mo5341d(C19135a.f49059u0, String.valueOf(((double) j) / ((double) TimeUnit.SECONDS.toNanos(1))));
        }

        @C0359n0
        /* renamed from: h */
        public C1509b mo5345h(@C0359n0 CameraCaptureMetaData.FlashState flashState) {
            int i;
            if (flashState == CameraCaptureMetaData.FlashState.UNKNOWN) {
                return this;
            }
            int i2 = C1508a.f4311a[flashState.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 32;
            } else if (i2 != 3) {
                C1417i2.m5924n(ExifData.f4287c, "Unknown flash state: " + flashState);
                return this;
            } else {
                i = 1;
            }
            if ((i & 1) == 1) {
                mo5341d(C19135a.f48792O0, String.valueOf(4));
            }
            return mo5341d(C19135a.f48801P0, String.valueOf(i));
        }

        @C0359n0
        /* renamed from: i */
        public C1509b mo5346i(float f) {
            return mo5341d(C19135a.f48819R0, new C1564h((long) (f * 1000.0f), 1000).toString());
        }

        @C0359n0
        /* renamed from: j */
        public C1509b mo5347j(int i) {
            return mo5341d(C19135a.f49094y, String.valueOf(i));
        }

        @C0359n0
        /* renamed from: k */
        public C1509b mo5348k(int i) {
            return mo5341d(C19135a.f49085x, String.valueOf(i));
        }

        @C0359n0
        /* renamed from: l */
        public C1509b mo5349l(int i) {
            return mo5341d(C19135a.f48675B0, String.valueOf(3)).mo5341d(C19135a.f49104z0, String.valueOf(Math.min(65535, i)));
        }

        @C0359n0
        /* renamed from: m */
        public C1509b mo5350m(float f) {
            return mo5341d(C19135a.f49068v0, String.valueOf(f));
        }

        @C0359n0
        /* renamed from: n */
        public C1509b mo5351n(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                C1417i2.m5924n(ExifData.f4287c, "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            return mo5341d(C19135a.f48683C, String.valueOf(i2));
        }

        @C0359n0
        /* renamed from: o */
        public C1509b mo5352o(@C0359n0 WhiteBalanceMode whiteBalanceMode) {
            String str;
            int i = C1508a.f4312b[whiteBalanceMode.ordinal()];
            if (i == 1) {
                str = String.valueOf(0);
            } else if (i != 2) {
                str = null;
            } else {
                str = String.valueOf(1);
            }
            return mo5341d(C19135a.f48940f1, str);
        }
    }

    static {
        C1563g[] gVarArr = {new C1563g(C19135a.f49085x, 256, 3, 4), new C1563g(C19135a.f49094y, 257, 3, 4), new C1563g(C19135a.f48863W, 271, 2), new C1563g(C19135a.f48872X, 272, 2), new C1563g(C19135a.f48683C, DefaultImageHeaderParser.f57426n, 3), new C1563g(C19135a.f48728H, 282, 5), new C1563g(C19135a.f48737I, 283, 5), new C1563g(C19135a.f48746J, 296, 3), new C1563g(C19135a.f48881Y, 305, 2), new C1563g(C19135a.f48845U, 306, 2), new C1563g(C19135a.f48719G, 531, 3), new C1563g("SubIFDPointer", 330, 4), new C1563g("ExifIFDPointer", 34665, 4), new C1563g("GPSInfoIFDPointer", 34853, 4)};
        f4294j = gVarArr;
        C1563g[] gVarArr2 = {new C1563g(C19135a.f49059u0, 33434, 5), new C1563g(C19135a.f49068v0, 33437, 5), new C1563g(C19135a.f49077w0, 34850, 3), new C1563g(C19135a.f49104z0, 34855, 3), new C1563g(C19135a.f48675B0, 34864, 3), new C1563g(C19135a.f48907b0, 36864, 2), new C1563g(C19135a.f48995m0, 36867, 2), new C1563g(C19135a.f49003n0, 36868, 2), new C1563g(C19135a.f48955h0, 37121, 7), new C1563g(C19135a.f48729H0, 37377, 10), new C1563g(C19135a.f48738I0, 37378, 5), new C1563g(C19135a.f48747J0, 37379, 10), new C1563g(C19135a.f48756K0, 37380, 10), new C1563g(C19135a.f48765L0, 37381, 5), new C1563g(C19135a.f48783N0, 37383, 3), new C1563g(C19135a.f48792O0, 37384, 3), new C1563g(C19135a.f48801P0, 37385, 3), new C1563g(C19135a.f48819R0, 37386, 5), new C1563g(C19135a.f49035r0, 37520, 2), new C1563g(C19135a.f49043s0, 37521, 2), new C1563g(C19135a.f49051t0, 37522, 2), new C1563g(C19135a.f48915c0, 40960, 7), new C1563g(C19135a.f48923d0, 40961, 3), new C1563g(C19135a.f48939f0, 40962, 3, 4), new C1563g(C19135a.f48947g0, 40963, 3, 4), new C1563g("InteroperabilityIFDPointer", 40965, 4), new C1563g(C19135a.f48864W0, 41488, 3), new C1563g(C19135a.f48891Z0, 41495, 3), new C1563g(C19135a.f48900a1, 41728, 7), new C1563g(C19135a.f48908b1, 41729, 7), new C1563g(C19135a.f48924d1, 41985, 3), new C1563g(C19135a.f48932e1, 41986, 3), new C1563g(C19135a.f48940f1, 41987, 3), new C1563g(C19135a.f48964i1, 41990, 3), new C1563g(C19135a.f48980k1, 41992, 3), new C1563g(C19135a.f48988l1, 41993, 3), new C1563g(C19135a.f48996m1, 41994, 3)};
        f4295k = gVarArr2;
        C1563g[] gVarArr3 = {new C1563g(C19135a.f49087x1, 0, 1), new C1563g(C19135a.f49096y1, 1, 2), new C1563g(C19135a.f49105z1, 2, 5, 10), new C1563g(C19135a.f48667A1, 3, 2), new C1563g(C19135a.f48676B1, 4, 5, 10), new C1563g(C19135a.f48685C1, 5, 1), new C1563g(C19135a.f48694D1, 6, 5), new C1563g(C19135a.f48703E1, 7, 5), new C1563g(C19135a.f48748J1, 12, 2), new C1563g(C19135a.f48766L1, 14, 2), new C1563g(C19135a.f48784N1, 16, 2), new C1563g(C19135a.f48847U1, 23, 2), new C1563g(C19135a.f48865W1, 25, 2)};
        f4296l = gVarArr3;
        C1563g[] gVarArr4 = {new C1563g(C19135a.f48925d2, 1, 2)};
        f4298n = gVarArr4;
        f4299o = new C1563g[][]{gVarArr, gVarArr2, gVarArr3, gVarArr4};
    }

    public ExifData(ByteOrder byteOrder, List<Map<String, C1522e>> list) {
        boolean z;
        if (list.size() == f4299o.length) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81778o(z, "Malformed attributes list. Number of IFDs mismatch.");
        this.f4307b = byteOrder;
        this.f4306a = list;
    }

    @C0359n0
    /* renamed from: a */
    public static C1509b m6324a() {
        return new C1509b(ByteOrder.BIG_ENDIAN).mo5341d(C19135a.f48683C, String.valueOf(1)).mo5341d(C19135a.f48728H, "72/1").mo5341d(C19135a.f48737I, "72/1").mo5341d(C19135a.f48746J, String.valueOf(2)).mo5341d(C19135a.f48719G, String.valueOf(1)).mo5341d(C19135a.f48863W, Build.MANUFACTURER).mo5341d(C19135a.f48872X, Build.MODEL);
    }

    @C0363p0
    /* renamed from: b */
    public String mo5335b(@C0359n0 String str) {
        C1522e e = mo5338e(str);
        if (e != null) {
            if (!f4304t.contains(str)) {
                return e.mo5430q(this.f4307b);
            }
            if (str.equals(C19135a.f48703E1)) {
                int i = e.f4363a;
                if (i == 5 || i == 10) {
                    C1564h[] hVarArr = (C1564h[]) e.mo5431r(this.f4307b);
                    if (hVarArr == null || hVarArr.length != 3) {
                        C1417i2.m5924n(f4287c, "Invalid GPS Timestamp array. array=" + Arrays.toString(hVarArr));
                        return null;
                    }
                    return String.format(Locale.US, "%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) hVarArr[0].mo5517b()) / ((float) hVarArr[0].mo5516a()))), Integer.valueOf((int) (((float) hVarArr[1].mo5517b()) / ((float) hVarArr[1].mo5516a()))), Integer.valueOf((int) (((float) hVarArr[2].mo5517b()) / ((float) hVarArr[2].mo5516a())))});
                }
                C1417i2.m5924n(f4287c, "GPS Timestamp format is not rational. format=" + e.f4363a);
                return null;
            }
            try {
                return Double.toString(e.mo5428o(this.f4307b));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @C0359n0
    /* renamed from: c */
    public Map<String, C1522e> mo5336c(int i) {
        int length = f4299o.length;
        C18001r.m81770g(i, 0, length, "Invalid IFD index: " + i + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f4306a.get(i);
    }

    @C0359n0
    /* renamed from: d */
    public ByteOrder mo5337d() {
        return this.f4307b;
    }

    @C0363p0
    /* renamed from: e */
    public final C1522e mo5338e(@C0359n0 String str) {
        if (C19135a.f49095y0.equals(str)) {
            str = C19135a.f49104z0;
        }
        for (int i = 0; i < f4299o.length; i++) {
            C1522e eVar = (C1522e) this.f4306a.get(i).get(str);
            if (eVar != null) {
                return eVar;
            }
        }
        return null;
    }
}
