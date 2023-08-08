package com.google.android.gms.internal.gtm;

import android.content.Context;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.util.C40979g;
import com.google.android.gms.common.util.C40985k;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.gms.internal.gtm.g6 */
public final class C41276g6 extends Thread {

    /* renamed from: g */
    public static C41276g6 f104612g;

    /* renamed from: a */
    public final LinkedBlockingQueue<Runnable> f104613a = new LinkedBlockingQueue<>();

    /* renamed from: b */
    public volatile boolean f104614b = false;

    /* renamed from: c */
    public volatile boolean f104615c = false;

    /* renamed from: d */
    public volatile C41300h6 f104616d;

    /* renamed from: e */
    public final Context f104617e;

    /* renamed from: f */
    public final C40979g f104618f = C40985k.m166636d();

    public C41276g6(Context context) {
        super("GAThread");
        if (context != null) {
            this.f104617e = context.getApplicationContext();
        } else {
            this.f104617e = null;
        }
        start();
    }

    /* renamed from: b */
    public static C41276g6 m167531b(Context context) {
        if (f104612g == null) {
            f104612g = new C41276g6(context);
        }
        return f104612g;
    }

    /* renamed from: e */
    public final void mo135403e(Runnable runnable) {
        this.f104613a.add(runnable);
    }

    /* renamed from: f */
    public final void mo135404f(String str, @C0363p0 String str2, @C0363p0 String str3, @C0363p0 Map<String, String> map, @C0363p0 String str4) {
        this.f104613a.add(new C41252f6(this, this, this.f104618f.mo134768a(), str, str2, str3, map, str4, (byte[]) null));
    }

    public final void run() {
        String str;
        while (true) {
            try {
                Runnable take = this.f104613a.take();
                if (!this.f104614b) {
                    take.run();
                }
            } catch (InterruptedException e) {
                try {
                    C41493p6.m168151c(e.toString());
                } catch (Exception e2) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    PrintStream printStream = new PrintStream(byteArrayOutputStream);
                    e2.printStackTrace(printStream);
                    printStream.flush();
                    String str2 = new String(byteArrayOutputStream.toByteArray());
                    if (str2.length() != 0) {
                        str = "Error on Google TagManager Thread: ".concat(str2);
                    } else {
                        str = new String("Error on Google TagManager Thread: ");
                    }
                    C41493p6.m168149a(str);
                    C41493p6.m168149a("Google TagManager is shutting down.");
                    this.f104614b = true;
                }
            }
        }
    }
}
