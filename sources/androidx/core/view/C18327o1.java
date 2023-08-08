package androidx.core.view;

import android.view.MotionEvent;
import androidx.annotation.C0359n0;

/* renamed from: androidx.core.view.o1 */
public final class C18327o1 {
    @Deprecated

    /* renamed from: A */
    public static final int f46991A = 17;
    @Deprecated

    /* renamed from: B */
    public static final int f46992B = 18;
    @Deprecated

    /* renamed from: C */
    public static final int f46993C = 19;
    @Deprecated

    /* renamed from: D */
    public static final int f46994D = 20;
    @Deprecated

    /* renamed from: E */
    public static final int f46995E = 21;
    @Deprecated

    /* renamed from: F */
    public static final int f46996F = 22;
    @Deprecated

    /* renamed from: G */
    public static final int f46997G = 23;
    @Deprecated

    /* renamed from: H */
    public static final int f46998H = 24;
    @Deprecated

    /* renamed from: I */
    public static final int f46999I = 25;

    /* renamed from: J */
    public static final int f47000J = 26;

    /* renamed from: K */
    public static final int f47001K = 27;

    /* renamed from: L */
    public static final int f47002L = 28;
    @Deprecated

    /* renamed from: M */
    public static final int f47003M = 32;
    @Deprecated

    /* renamed from: N */
    public static final int f47004N = 33;
    @Deprecated

    /* renamed from: O */
    public static final int f47005O = 34;
    @Deprecated

    /* renamed from: P */
    public static final int f47006P = 35;
    @Deprecated

    /* renamed from: Q */
    public static final int f47007Q = 36;
    @Deprecated

    /* renamed from: R */
    public static final int f47008R = 37;
    @Deprecated

    /* renamed from: S */
    public static final int f47009S = 38;
    @Deprecated

    /* renamed from: T */
    public static final int f47010T = 39;
    @Deprecated

    /* renamed from: U */
    public static final int f47011U = 40;
    @Deprecated

    /* renamed from: V */
    public static final int f47012V = 41;
    @Deprecated

    /* renamed from: W */
    public static final int f47013W = 42;
    @Deprecated

    /* renamed from: X */
    public static final int f47014X = 43;
    @Deprecated

    /* renamed from: Y */
    public static final int f47015Y = 44;
    @Deprecated

    /* renamed from: Z */
    public static final int f47016Z = 45;
    @Deprecated

    /* renamed from: a */
    public static final int f47017a = 255;
    @Deprecated

    /* renamed from: a0 */
    public static final int f47018a0 = 46;
    @Deprecated

    /* renamed from: b */
    public static final int f47019b = 5;
    @Deprecated

    /* renamed from: b0 */
    public static final int f47020b0 = 47;
    @Deprecated

    /* renamed from: c */
    public static final int f47021c = 6;
    @Deprecated

    /* renamed from: c0 */
    public static final int f47022c0 = 1;
    @Deprecated

    /* renamed from: d */
    public static final int f47023d = 7;
    @Deprecated

    /* renamed from: e */
    public static final int f47024e = 8;
    @Deprecated

    /* renamed from: f */
    public static final int f47025f = 65280;
    @Deprecated

    /* renamed from: g */
    public static final int f47026g = 8;
    @Deprecated

    /* renamed from: h */
    public static final int f47027h = 9;
    @Deprecated

    /* renamed from: i */
    public static final int f47028i = 10;
    @Deprecated

    /* renamed from: j */
    public static final int f47029j = 0;
    @Deprecated

    /* renamed from: k */
    public static final int f47030k = 1;
    @Deprecated

    /* renamed from: l */
    public static final int f47031l = 2;
    @Deprecated

    /* renamed from: m */
    public static final int f47032m = 3;
    @Deprecated

    /* renamed from: n */
    public static final int f47033n = 4;
    @Deprecated

    /* renamed from: o */
    public static final int f47034o = 5;
    @Deprecated

    /* renamed from: p */
    public static final int f47035p = 6;
    @Deprecated

    /* renamed from: q */
    public static final int f47036q = 7;
    @Deprecated

    /* renamed from: r */
    public static final int f47037r = 8;
    @Deprecated

    /* renamed from: s */
    public static final int f47038s = 9;
    @Deprecated

    /* renamed from: t */
    public static final int f47039t = 10;
    @Deprecated

    /* renamed from: u */
    public static final int f47040u = 11;
    @Deprecated

    /* renamed from: v */
    public static final int f47041v = 12;
    @Deprecated

    /* renamed from: w */
    public static final int f47042w = 13;
    @Deprecated

    /* renamed from: x */
    public static final int f47043x = 14;
    @Deprecated

    /* renamed from: y */
    public static final int f47044y = 15;
    @Deprecated

    /* renamed from: z */
    public static final int f47045z = 16;

    @Deprecated
    /* renamed from: a */
    public static int m83030a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* renamed from: b */
    public static int m83031b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    /* renamed from: c */
    public static int m83032c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    /* renamed from: d */
    public static float m83033d(MotionEvent motionEvent, int i) {
        return motionEvent.getAxisValue(i);
    }

    @Deprecated
    /* renamed from: e */
    public static float m83034e(MotionEvent motionEvent, int i, int i2) {
        return motionEvent.getAxisValue(i, i2);
    }

    @Deprecated
    /* renamed from: f */
    public static int m83035f(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    @Deprecated
    /* renamed from: g */
    public static int m83036g(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @Deprecated
    /* renamed from: h */
    public static int m83037h(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* renamed from: i */
    public static int m83038i(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    @Deprecated
    /* renamed from: j */
    public static float m83039j(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    /* renamed from: k */
    public static float m83040k(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* renamed from: l */
    public static boolean m83041l(@C0359n0 MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
