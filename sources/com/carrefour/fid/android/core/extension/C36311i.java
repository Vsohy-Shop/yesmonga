package com.carrefour.fid.android.core.extension;

import com.carrefour.fid.android.core.p057io.CheckoutAppServerError;
import com.carrefour.fid.android.core.p057io.CheckoutError;
import com.carrefour.fid.android.core.p057io.CheckoutResponseThrowable;
import com.carrefour.fid.android.data.entities.ServiceStationsTicketCardResponse;
import com.carrefour.fid.android.shared.p046io.GazStationResponseThrowable;
import com.carrefour.fid.android.shared.p046io.ResponseThrowable;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.gson.C33614e;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

@C11363r0({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\ncom/carrefour/fid/android/core/extension/ResponseKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1549#2:85\n1620#2,3:86\n*S KotlinDebug\n*F\n+ 1 Response.kt\ncom/carrefour/fid/android/core/extension/ResponseKt\n*L\n24#1:85\n24#1:86,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.core.extension.i */
public final class C36311i {
    /* renamed from: a */
    public static final Integer m148965a(String str) {
        String group;
        Matcher matcher = Pattern.compile("\"error_code\"\\s*:\\s*[\"]*(\\d+)[\"]*", 2).matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(group, "group(1)");
        return Integer.valueOf(Integer.parseInt(group));
    }

    /* renamed from: b */
    public static final String m148966b(String str) {
        Matcher matcher = Pattern.compile("\"message\"\\s*:\\s*\"([^\"]+)", 2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    @C12580l
    /* renamed from: c */
    public static final <T> CheckoutAppServerError m148967c(@C12579k C13091w<T> wVar) {
        Reader reader;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (wVar.mo30574e() == null) {
            return null;
        }
        try {
            C33614e eVar = new C33614e();
            ResponseBody e = wVar.mo30574e();
            if (e != null) {
                reader = e.charStream();
            } else {
                reader = null;
            }
            return (CheckoutAppServerError) eVar.mo97477l(reader, CheckoutAppServerError.class);
        } catch (Exception e2) {
            C28935i.m119705e(C28935i.f70940a, "Checkout response server error deserialization " + e2, (Throwable) null, 0, 6, (Object) null);
            return null;
        }
    }

    @C12579k
    /* renamed from: d */
    public static final <T> CheckoutResponseThrowable m148968d(@C12579k C13091w<T> wVar, @C12579k String str, @C12580l String str2) {
        List list;
        String str3;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "message");
        CheckoutAppServerError c = m148967c(wVar);
        if (c != null) {
            List<CheckoutError> subErrors = c.getSubErrors();
            if (subErrors != null) {
                Iterable<CheckoutError> iterable = subErrors;
                list = new ArrayList(C10978t.m41495Y(iterable, 10));
                for (CheckoutError message : iterable) {
                    String message2 = message.getMessage();
                    if (message2 == null) {
                        message2 = new String();
                    }
                    list.add(message2);
                }
            } else {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
            List list2 = list;
            String message3 = c.getMessage();
            if (message3 == null) {
                str3 = str;
            } else {
                str3 = message3;
            }
            return new CheckoutResponseThrowable(list2, str3, str2, c.getErrorCode(), c.getPaymentMethod());
        }
        return new CheckoutResponseThrowable(CollectionsKt__CollectionsKt.m40441E(), str, str2, new String(), new String());
    }

    /* renamed from: e */
    public static /* synthetic */ CheckoutResponseThrowable m148969e(C13091w wVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = new String();
        }
        return m148968d(wVar, str, str2);
    }

    @C12579k
    /* renamed from: f */
    public static final <T> GazStationResponseThrowable m148970f(@C12579k C13091w<T> wVar) {
        Reader reader;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (wVar.mo30574e() == null) {
            return new GazStationResponseThrowable((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }
        try {
            C33614e eVar = new C33614e();
            ResponseBody e = wVar.mo30574e();
            if (e != null) {
                reader = e.charStream();
            } else {
                reader = null;
            }
            ServiceStationsTicketCardResponse serviceStationsTicketCardResponse = (ServiceStationsTicketCardResponse) eVar.mo97477l(reader, ServiceStationsTicketCardResponse.class);
            return new GazStationResponseThrowable(serviceStationsTicketCardResponse.getErrorCode(), serviceStationsTicketCardResponse.getMoreInformation());
        } catch (Exception e2) {
            C28935i.m119705e(C28935i.f70940a, "ServiceStations response server error deserialization " + e2, (Throwable) null, 0, 6, (Object) null);
            return new GazStationResponseThrowable((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        }
    }

    @C12579k
    /* renamed from: g */
    public static final <T> ResponseThrowable m148971g(@C12579k C13091w<T> wVar, @C12579k String str) {
        String string;
        int i;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "defaultMessage");
        ResponseBody e = wVar.mo30574e();
        if (e == null || (string = e.string()) == null) {
            return new ResponseThrowable(wVar.mo30573b(), str);
        }
        Integer a = m148965a(string);
        if (a != null) {
            i = a.intValue();
        } else {
            i = wVar.mo30573b();
        }
        String b = m148966b(string);
        if (b != null) {
            str = b;
        }
        return new ResponseThrowable(i, str);
    }
}
