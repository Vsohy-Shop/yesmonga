package androidx.constraintlayout.core.motion.utils;

import com.google.firebase.installations.C33124s;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import kotlinx.serialization.json.C12412q;

/* renamed from: androidx.constraintlayout.core.motion.utils.w */
public class C16727w {

    /* renamed from: a */
    public static C16728a f42360a;

    /* renamed from: androidx.constraintlayout.core.motion.utils.w$a */
    public interface C16728a {
        /* renamed from: a */
        void mo49116a(String str);
    }

    /* renamed from: a */
    public static int m76354a(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* renamed from: c */
    public static void m76355c(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String substring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String str2 = ".(" + stackTraceElement.getFileName() + C33124s.f80355c + stackTraceElement.getLineNumber() + ")" + C12412q.f30348a.substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + substring;
        System.out.println(str2 + " " + str);
        C16728a aVar = f42360a;
        if (aVar != null) {
            aVar.mo49116a(str2 + " " + str);
        }
    }

    /* renamed from: d */
    public static void m76356d(String str, String str2) {
        PrintStream printStream = System.out;
        printStream.println(str + " : " + str2);
    }

    /* renamed from: e */
    public static void m76357e(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            str2 = str2 + " ";
            PrintStream printStream = System.out;
            printStream.println(str + str2 + (".(" + stackTrace[i2].getFileName() + C33124s.f80355c + stackTrace[i2].getLineNumber() + ") " + stackTrace[i2].getMethodName()) + str2);
        }
    }

    /* renamed from: f */
    public static void m76358f(String str, String str2) {
        PrintStream printStream = System.err;
        printStream.println(str + " : " + str2);
    }

    /* renamed from: g */
    public static int m76359g(float f, float f2, float f3, float f4) {
        int a = m76354a((int) (f * 255.0f));
        int a2 = m76354a((int) (f2 * 255.0f));
        return (a << 16) | (m76354a((int) (f4 * 255.0f)) << 24) | (a2 << 8) | m76354a((int) (f3 * 255.0f));
    }

    /* renamed from: h */
    public static void m76360h(C16728a aVar) {
        f42360a = aVar;
    }

    /* renamed from: i */
    public static void m76361i(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public int mo49115b(float[] fArr) {
        int a = m76354a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
        int a2 = m76354a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
        return (m76354a((int) (fArr[3] * 255.0f)) << 24) | (a << 16) | (a2 << 8) | m76354a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f));
    }
}
