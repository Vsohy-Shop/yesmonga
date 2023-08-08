package com.usabilla.sdk.ubform.utils;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class CustomVariablesUtilsKt {
    /* renamed from: a */
    public static final /* synthetic */ String m38268a(Map map) {
        Intrinsics.checkNotNullParameter(map, "customVariables");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            arrayList.add(sb.toString());
        }
        return CollectionsKt___CollectionsKt.m40639h3(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, CustomVariablesUtilsKt$customVariablesToString$2.f27824f, 31, (Object) null);
    }
}
