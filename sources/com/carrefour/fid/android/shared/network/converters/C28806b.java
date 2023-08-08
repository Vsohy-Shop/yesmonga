package com.carrefour.fid.android.shared.network.converters;

import androidx.compose.runtime.internal.C8567o;
import com.google.gson.C33614e;
import com.google.gson.C33708s;
import com.google.gson.reflect.C33707a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13015f;
import retrofit2.C13092x;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nDeEnvelopingConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeEnvelopingConverter.kt\ncom/carrefour/fid/android/shared/network/converters/DeEnvelopingConverter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,51:1\n1282#2,2:52\n*S KotlinDebug\n*F\n+ 1 DeEnvelopingConverter.kt\ncom/carrefour/fid/android/shared/network/converters/DeEnvelopingConverter\n*L\n43#1:52,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.network.converters.b */
public final class C28806b extends C13015f.C13016a {

    /* renamed from: b */
    public static final int f70604b = 8;
    @C12579k

    /* renamed from: a */
    public final C33614e f70605a;

    public C28806b(@C12579k C33614e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "gson");
        this.f70605a = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        kotlin.p010io.C11133b.m42950a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        throw r3;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m119227i(com.carrefour.fid.android.shared.network.converters.C28806b r1, java.lang.String r2, com.google.gson.C33708s r3, okhttp3.ResponseBody r4) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "$payloadName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "$adapter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "body"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.google.gson.e r1 = r1.f70605a
            java.io.Reader r4 = r4.charStream()
            com.google.gson.stream.a r1 = r1.mo97487v(r4)
            r1.beginObject()     // Catch:{ all -> 0x0040 }
        L_0x0021:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0040 }
            r0 = 0
            if (r4 == 0) goto L_0x003b
            java.lang.String r4 = r1.nextName()     // Catch:{ all -> 0x0040 }
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0037
            java.lang.Object r2 = r3.read(r1)     // Catch:{ all -> 0x0040 }
            goto L_0x003c
        L_0x0037:
            r1.skipValue()     // Catch:{ all -> 0x0040 }
            goto L_0x0021
        L_0x003b:
            r2 = r0
        L_0x003c:
            kotlin.p010io.C11133b.m42950a(r1, r0)
            return r2
        L_0x0040:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r3 = move-exception
            kotlin.p010io.C11133b.m42950a(r1, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.network.converters.C28806b.m119227i(com.carrefour.fid.android.shared.network.converters.b, java.lang.String, com.google.gson.s, okhttp3.ResponseBody):java.lang.Object");
    }

    @C12580l
    /* renamed from: d */
    public C13015f<ResponseBody, Object> mo30441d(@C12579k Type type, @C12579k Annotation[] annotationArr, @C12579k C13092x xVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotationArr, "annotations");
        Intrinsics.checkNotNullParameter(xVar, "retrofit");
        String h = mo83878h(annotationArr);
        if (h == null) {
            return null;
        }
        C33708s<?> p = this.f70605a.mo97481p(C33707a.get(type));
        Intrinsics.checkNotNullExpressionValue(p, "gson.getAdapter(TypeToken.get(type))");
        return new C28805a(this, h, p);
    }

    @C12579k
    /* renamed from: g */
    public final C33614e mo83877g() {
        return this.f70605a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0014  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo83878h(java.lang.annotation.Annotation[] r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0011
            int r1 = r6.length
            r2 = 0
        L_0x0005:
            if (r2 >= r1) goto L_0x0011
            r3 = r6[r2]
            boolean r4 = r3 instanceof com.carrefour.fid.android.shared.network.converters.C28807c
            if (r4 == 0) goto L_0x000e
            goto L_0x0012
        L_0x000e:
            int r2 = r2 + 1
            goto L_0x0005
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001a
            com.carrefour.fid.android.shared.network.converters.c r3 = (com.carrefour.fid.android.shared.network.converters.C28807c) r3
            java.lang.String r0 = r3.value()
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.network.converters.C28806b.mo83878h(java.lang.annotation.Annotation[]):java.lang.String");
    }
}
