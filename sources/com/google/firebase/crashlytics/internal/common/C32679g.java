package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.firebase.crashlytics.internal.common.g */
public class C32679g {

    /* renamed from: a */
    public static final AtomicLong f79305a = new AtomicLong(0);

    /* renamed from: b */
    public static String f79306b;

    public C32679g(C32730v vVar) {
        byte[] bArr = new byte[10];
        mo94875e(bArr);
        mo94874d(bArr);
        mo94873c(bArr);
        String G = CommonUtils.m131917G(vVar.mo95029a());
        String y = CommonUtils.m131943y(bArr);
        Locale locale = Locale.US;
        f79306b = String.format(locale, "%s%s%s%s", new Object[]{y.substring(0, 12), y.substring(12, 16), y.subSequence(16, 20), G.substring(0, 12)}).toUpperCase(locale);
    }

    /* renamed from: a */
    public static byte[] m131977a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    public static byte[] m131978b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    public final void mo94873c(byte[] bArr) {
        byte[] b = m131978b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: d */
    public final void mo94874d(byte[] bArr) {
        byte[] b = m131978b(f79305a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: e */
    public final void mo94875e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a = m131977a(time / 1000);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m131978b(time % 1000);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f79306b;
    }
}
