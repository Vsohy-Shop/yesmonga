package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.appcompat.widget.C0696c;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.util.C33443k;
import com.google.firebase.perf.util.StorageUnit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.perf.session.gauges.i */
public class C33409i {

    /* renamed from: e */
    public static final C33363a f81199e = C33363a.m134449e();

    /* renamed from: a */
    public final Runtime f81200a;

    /* renamed from: b */
    public final ActivityManager f81201b;

    /* renamed from: c */
    public final ActivityManager.MemoryInfo f81202c;

    /* renamed from: d */
    public final Context f81203d;

    public C33409i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    /* renamed from: a */
    public int mo96816a() {
        return C33443k.m134838d(StorageUnit.BYTES.mo96887r(this.f81202c.totalMem));
    }

    /* renamed from: b */
    public int mo96817b() {
        return C33443k.m134838d(StorageUnit.BYTES.mo96887r(this.f81200a.maxMemory()));
    }

    /* renamed from: c */
    public int mo96818c() {
        return C33443k.m134838d(StorageUnit.MEGABYTES.mo96887r((long) this.f81201b.getMemoryClass()));
    }

    @C0344h1
    /* renamed from: d */
    public int mo96819d(String str) {
        BufferedReader bufferedReader;
        String readLine;
        int i;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return 0;
                }
            } while (!readLine.startsWith("MemTotal"));
            Matcher matcher = Pattern.compile("\\d+").matcher(readLine);
            if (matcher.find()) {
                i = Integer.parseInt(matcher.group());
            } else {
                i = 0;
            }
            bufferedReader.close();
            return i;
        } catch (IOException e) {
            f81199e.mo96439l("Unable to read '" + str + "' file: " + e.getMessage());
        } catch (NumberFormatException e2) {
            f81199e.mo96439l("Unable to parse '" + str + "' file: " + e2.getMessage());
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @C0344h1
    public C33409i(Runtime runtime, Context context) {
        this.f81200a = runtime;
        this.f81203d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C0696c.f2306r);
        this.f81201b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f81202c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
