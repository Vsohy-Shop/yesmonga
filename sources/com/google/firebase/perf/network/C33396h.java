package com.google.firebase.perf.network;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.metrics.C33381i;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* renamed from: com.google.firebase.perf.network.h */
public final class C33396h {

    /* renamed from: a */
    public static final Pattern f81166a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    /* renamed from: a */
    public static Long m134672a(@C0359n0 HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C33363a.m134449e().mo96429a("The content-length value is not a valid number");
            return null;
        }
    }

    /* renamed from: b */
    public static String m134673b(@C0359n0 HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    /* renamed from: c */
    public static boolean m134674c(@C0363p0 String str) {
        return str == null || !f81166a.matcher(str).matches();
    }

    /* renamed from: d */
    public static void m134675d(C33381i iVar) {
        if (!iVar.mo96539h()) {
            iVar.mo96547q();
        }
        iVar.mo96534b();
    }
}
