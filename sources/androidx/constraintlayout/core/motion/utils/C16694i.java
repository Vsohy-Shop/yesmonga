package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.C16655a;
import androidx.constraintlayout.core.motion.CustomAttribute;
import java.io.PrintStream;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.motion.utils.i */
public class C16694i {

    /* renamed from: androidx.constraintlayout.core.motion.utils.i$a */
    public static class C16695a {

        /* renamed from: d */
        public static final int f41996d = 999;

        /* renamed from: a */
        public int[] f41997a = new int[101];

        /* renamed from: b */
        public CustomAttribute[] f41998b = new CustomAttribute[101];

        /* renamed from: c */
        public int f41999c;

        public C16695a() {
            mo49038b();
        }

        /* renamed from: a */
        public void mo49037a(int i, CustomAttribute customAttribute) {
            if (this.f41998b[i] != null) {
                mo49041e(i);
            }
            this.f41998b[i] = customAttribute;
            int[] iArr = this.f41997a;
            int i2 = this.f41999c;
            this.f41999c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        /* renamed from: b */
        public void mo49038b() {
            Arrays.fill(this.f41997a, 999);
            Arrays.fill(this.f41998b, (Object) null);
            this.f41999c = 0;
        }

        /* renamed from: c */
        public void mo49039c() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f41997a, this.f41999c)));
            System.out.print("K: [");
            for (int i = 0; i < this.f41999c; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(mo49043g(i));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        /* renamed from: d */
        public int mo49040d(int i) {
            return this.f41997a[i];
        }

        /* renamed from: e */
        public void mo49041e(int i) {
            this.f41998b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f41999c;
                if (i2 < i4) {
                    int[] iArr = this.f41997a;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.f41999c = i4 - 1;
                    return;
                }
            }
        }

        /* renamed from: f */
        public int mo49042f() {
            return this.f41999c;
        }

        /* renamed from: g */
        public CustomAttribute mo49043g(int i) {
            return this.f41998b[this.f41997a[i]];
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.i$b */
    public static class C16696b {

        /* renamed from: d */
        public static final int f42000d = 999;

        /* renamed from: a */
        public int[] f42001a = new int[101];

        /* renamed from: b */
        public C16655a[] f42002b = new C16655a[101];

        /* renamed from: c */
        public int f42003c;

        public C16696b() {
            mo49045b();
        }

        /* renamed from: a */
        public void mo49044a(int i, C16655a aVar) {
            if (this.f42002b[i] != null) {
                mo49048e(i);
            }
            this.f42002b[i] = aVar;
            int[] iArr = this.f42001a;
            int i2 = this.f42003c;
            this.f42003c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        /* renamed from: b */
        public void mo49045b() {
            Arrays.fill(this.f42001a, 999);
            Arrays.fill(this.f42002b, (Object) null);
            this.f42003c = 0;
        }

        /* renamed from: c */
        public void mo49046c() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f42001a, this.f42003c)));
            System.out.print("K: [");
            for (int i = 0; i < this.f42003c; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(mo49050g(i));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        /* renamed from: d */
        public int mo49047d(int i) {
            return this.f42001a[i];
        }

        /* renamed from: e */
        public void mo49048e(int i) {
            this.f42002b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f42003c;
                if (i2 < i4) {
                    int[] iArr = this.f42001a;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.f42003c = i4 - 1;
                    return;
                }
            }
        }

        /* renamed from: f */
        public int mo49049f() {
            return this.f42003c;
        }

        /* renamed from: g */
        public C16655a mo49050g(int i) {
            return this.f42002b[this.f42001a[i]];
        }
    }

    /* renamed from: androidx.constraintlayout.core.motion.utils.i$c */
    public static class C16697c {

        /* renamed from: d */
        public static final int f42004d = 999;

        /* renamed from: a */
        public int[] f42005a = new int[101];

        /* renamed from: b */
        public float[][] f42006b = new float[101][];

        /* renamed from: c */
        public int f42007c;

        public C16697c() {
            mo49052b();
        }

        /* renamed from: a */
        public void mo49051a(int i, float[] fArr) {
            if (this.f42006b[i] != null) {
                mo49055e(i);
            }
            this.f42006b[i] = fArr;
            int[] iArr = this.f42005a;
            int i2 = this.f42007c;
            this.f42007c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        /* renamed from: b */
        public void mo49052b() {
            Arrays.fill(this.f42005a, 999);
            Arrays.fill(this.f42006b, (Object) null);
            this.f42007c = 0;
        }

        /* renamed from: c */
        public void mo49053c() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f42005a, this.f42007c)));
            System.out.print("K: [");
            for (int i = 0; i < this.f42007c; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(Arrays.toString(mo49057g(i)));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        /* renamed from: d */
        public int mo49054d(int i) {
            return this.f42005a[i];
        }

        /* renamed from: e */
        public void mo49055e(int i) {
            this.f42006b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.f42007c;
                if (i2 < i4) {
                    int[] iArr = this.f42005a;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.f42007c = i4 - 1;
                    return;
                }
            }
        }

        /* renamed from: f */
        public int mo49056f() {
            return this.f42007c;
        }

        /* renamed from: g */
        public float[] mo49057g(int i) {
            return this.f42006b[this.f42005a[i]];
        }
    }
}
