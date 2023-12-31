package com.google.zxing;

import com.google.zxing.aztec.C34632c;
import com.google.zxing.common.C34710b;
import com.google.zxing.datamatrix.C34729b;
import com.google.zxing.oned.C34776a0;
import com.google.zxing.oned.C34777b;
import com.google.zxing.oned.C34780e;
import com.google.zxing.oned.C34782g;
import com.google.zxing.oned.C34784i;
import com.google.zxing.oned.C34786k;
import com.google.zxing.oned.C34789n;
import com.google.zxing.oned.C34823t;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.pdf417.C34833d;
import com.google.zxing.qrcode.C34857b;
import java.util.Map;

/* renamed from: com.google.zxing.g */
public final class C34754g implements C34774n {

    /* renamed from: com.google.zxing.g$a */
    public static /* synthetic */ class C34755a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f84227a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.BarcodeFormat[] r0 = com.google.zxing.BarcodeFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f84227a = r0
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.EAN_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f84227a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.UPC_E     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f84227a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.EAN_13     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f84227a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.UPC_A     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f84227a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.QR_CODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f84227a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODE_39     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f84227a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODE_93     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f84227a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODE_128     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f84227a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.ITF     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f84227a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.PDF_417     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f84227a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODABAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f84227a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f84227a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.AZTEC     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.C34754g.C34755a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public C34710b mo102422a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        C34774n nVar;
        switch (C34755a.f84227a[barcodeFormat.ordinal()]) {
            case 1:
                nVar = new C34786k();
                break;
            case 2:
                nVar = new C34776a0();
                break;
            case 3:
                nVar = new C34784i();
                break;
            case 4:
                nVar = new C34823t();
                break;
            case 5:
                nVar = new C34857b();
                break;
            case 6:
                nVar = new C34780e();
                break;
            case 7:
                nVar = new C34782g();
                break;
            case 8:
                nVar = new Code128Writer();
                break;
            case 9:
                nVar = new C34789n();
                break;
            case 10:
                nVar = new C34833d();
                break;
            case 11:
                nVar = new C34777b();
                break;
            case 12:
                nVar = new C34729b();
                break;
            case 13:
                nVar = new C34632c();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return nVar.mo102422a(str, barcodeFormat, i, i2, map);
    }

    /* renamed from: b */
    public C34710b mo102423b(String str, BarcodeFormat barcodeFormat, int i, int i2) throws WriterException {
        return mo102422a(str, barcodeFormat, i, i2, (Map<EncodeHintType, ?>) null);
    }
}
