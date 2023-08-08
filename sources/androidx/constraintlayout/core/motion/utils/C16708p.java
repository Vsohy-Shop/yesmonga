package androidx.constraintlayout.core.motion.utils;

import com.google.firebase.installations.C33124s;
import java.io.PrintStream;

/* renamed from: androidx.constraintlayout.core.motion.utils.p */
public class C16708p implements C16710r {

    /* renamed from: l */
    public static final double f42059l = Double.MAX_VALUE;

    /* renamed from: a */
    public double f42060a = 0.5d;

    /* renamed from: b */
    public boolean f42061b = false;

    /* renamed from: c */
    public double f42062c;

    /* renamed from: d */
    public double f42063d;

    /* renamed from: e */
    public double f42064e;

    /* renamed from: f */
    public float f42065f;

    /* renamed from: g */
    public float f42066g;

    /* renamed from: h */
    public float f42067h;

    /* renamed from: i */
    public float f42068i;

    /* renamed from: j */
    public float f42069j;

    /* renamed from: k */
    public int f42070k = 0;

    /* renamed from: a */
    public float mo49083a() {
        return 0.0f;
    }

    /* renamed from: b */
    public float mo49084b(float f) {
        return this.f42067h;
    }

    /* renamed from: c */
    public String mo49085c(String str, float f) {
        return null;
    }

    /* renamed from: d */
    public boolean mo49086d() {
        double d = ((double) this.f42066g) - this.f42063d;
        double d2 = this.f42062c;
        double d3 = (double) this.f42067h;
        if (Math.sqrt((((d3 * d3) * ((double) this.f42068i)) + ((d2 * d) * d)) / d2) <= ((double) this.f42069j)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo49087e(double d) {
        double d2 = this.f42062c;
        double d3 = this.f42060a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.f42068i)) * d) * 4.0d)) + 1.0d);
        double d4 = d / ((double) sqrt);
        int i = 0;
        while (i < sqrt) {
            float f = this.f42066g;
            double d5 = this.f42063d;
            float f2 = this.f42067h;
            double d6 = d2;
            float f3 = this.f42068i;
            double d7 = d3;
            double d8 = ((double) f2) + ((((((-d2) * (((double) f) - d5)) - (((double) f2) * d3)) / ((double) f3)) * d4) / 2.0d);
            double d9 = ((((-((((double) f) + ((d4 * d8) / 2.0d)) - d5)) * d6) - (d8 * d7)) / ((double) f3)) * d4;
            float f4 = (float) (((double) f2) + d9);
            this.f42067h = f4;
            float f5 = (float) (((double) f) + ((((double) f2) + (d9 / 2.0d)) * d4));
            this.f42066g = f5;
            int i2 = this.f42070k;
            if (i2 > 0) {
                if (f5 < 0.0f && (i2 & 1) == 1) {
                    this.f42066g = -f5;
                    this.f42067h = -f4;
                }
                float f6 = this.f42066g;
                if (f6 > 1.0f && (i2 & 2) == 2) {
                    this.f42066g = 2.0f - f6;
                    this.f42067h = -this.f42067h;
                }
            }
            i++;
            d2 = d6;
            d3 = d7;
        }
    }

    /* renamed from: f */
    public float mo49088f() {
        double d = this.f42062c;
        return ((float) (((-d) * (((double) this.f42066g) - this.f42063d)) - (this.f42060a * ((double) this.f42067h)))) / this.f42068i;
    }

    /* renamed from: g */
    public void mo49089g(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        PrintStream printStream = System.out;
        printStream.println((".(" + stackTraceElement.getFileName() + C33124s.f80355c + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ") + str);
    }

    public float getInterpolation(float f) {
        mo49087e((double) (f - this.f42065f));
        this.f42065f = f;
        return this.f42066g;
    }

    /* renamed from: h */
    public void mo49091h(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.f42063d = (double) f2;
        this.f42060a = (double) f6;
        this.f42061b = false;
        this.f42066g = f;
        this.f42064e = (double) f3;
        this.f42062c = (double) f5;
        this.f42068i = f4;
        this.f42069j = f7;
        this.f42070k = i;
        this.f42065f = 0.0f;
    }
}
