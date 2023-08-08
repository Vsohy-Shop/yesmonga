package com.carrefour.fid.android.shared.data.entities.extension;

import com.carrefour.fid.android.shared.p046io.NetWorkResponseThrowable;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import com.carrefour.fid.android.shared.p046io.ResponseThrowable;
import com.carrefour.fid.android.shared.p046io.UnexpectedResponseThrowable;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13091w;
import retrofit2.HttpException;

/* renamed from: com.carrefour.fid.android.shared.data.entities.extension.a */
public final class C28639a {
    /* renamed from: a */
    public static final Integer m118562a(String str) {
        String group;
        Matcher matcher = Pattern.compile("\"error_code\"\\s*:\\s*[\"]*(\\d+)[\"]*", 2).matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(group, "group(1)");
        return Integer.valueOf(Integer.parseInt(group));
    }

    /* renamed from: b */
    public static final String m118563b(String str) {
        Matcher matcher = Pattern.compile("\"message\"\\s*:\\s*\"([^\"]+)", 2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    @C12579k
    /* renamed from: c */
    public static final ResponseThrowable m118564c(@C12579k Throwable th) {
        boolean z;
        ResponseThrowable responseThrowable;
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof IOException) {
            z = true;
        } else {
            z = th instanceof NetworkException;
        }
        String str = "";
        if (z) {
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            responseThrowable = new NetWorkResponseThrowable(str);
        } else if (th instanceof HttpException) {
            HttpException httpException = (HttpException) th;
            int a = httpException.mo30431a();
            String c = httpException.mo30432c();
            if (c != null) {
                str = c;
            }
            responseThrowable = new ResponseThrowable(a, str);
        } else {
            String message2 = th.getMessage();
            if (message2 != null) {
                str = message2;
            }
            responseThrowable = new UnexpectedResponseThrowable(str);
        }
        return responseThrowable;
    }

    @C12579k
    /* renamed from: d */
    public static final <T> ResponseThrowable m118565d(@C12579k C13091w<T> wVar, @C12579k String str) {
        String string;
        int i;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "defaultMessage");
        ResponseBody e = wVar.mo30574e();
        if (e == null || (string = e.string()) == null) {
            return new ResponseThrowable(wVar.mo30573b(), str);
        }
        Integer a = m118562a(string);
        if (a != null) {
            i = a.intValue();
        } else {
            i = wVar.mo30573b();
        }
        String b = m118563b(string);
        if (b != null) {
            str = b;
        }
        return new ResponseThrowable(i, str);
    }
}
