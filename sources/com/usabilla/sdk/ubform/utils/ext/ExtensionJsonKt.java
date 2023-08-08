package com.usabilla.sdk.ubform.utils.ext;

import androidx.exifinterface.media.C19135a;
import com.usabilla.sdk.ubform.net.parser.C9875b;
import java.util.Map;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.json.JSONObject;

public final class ExtensionJsonKt {
    @C12579k

    /* renamed from: a */
    public static final C11677z f27856a = C10864b0.m38748c(ExtensionJsonKt$modelParserMap$2.f27857f);

    /* renamed from: a */
    public static final /* synthetic */ JSONObject m38312a(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    @C12579k
    /* renamed from: b */
    public static final Map<C11494d<?>, C9875b<?>> m38313b() {
        return (Map) f27856a.getValue();
    }

    /* renamed from: c */
    public static final /* synthetic */ String m38314c(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* renamed from: d */
    public static final /* synthetic */ <T> T m38315d(JSONObject jSONObject) {
        T t;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Map<C11494d<?>, C9875b<?>> b = m38313b();
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        C9875b bVar = b.get(C11342l0.m43547d(Object.class));
        if (bVar == null) {
            t = null;
        } else {
            t = bVar.mo20320a(jSONObject);
        }
        Intrinsics.reifiedOperationMarker(2, C19135a.f48928d5);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Parser not found");
    }
}
