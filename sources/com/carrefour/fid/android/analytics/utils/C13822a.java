package com.carrefour.fid.android.analytics.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11395k;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "legacy code : to be removed after refacto analytics ")
/* renamed from: com.carrefour.fid.android.analytics.utils.a */
public final class C13822a {
    @C12579k

    /* renamed from: a */
    public static final C13823a f33725a = new C13823a((DefaultConstructorMarker) null);

    @C11363r0({"SMAP\nParamsToTrackExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParamsToTrackExtractor.kt\ncom/carrefour/fid/android/analytics/utils/ParamsToTrackExtractor$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,21:1\n1855#2:22\n1856#2:25\n13579#3,2:23\n*S KotlinDebug\n*F\n+ 1 ParamsToTrackExtractor.kt\ncom/carrefour/fid/android/analytics/utils/ParamsToTrackExtractor$Companion\n*L\n10#1:22\n10#1:25\n11#1:23,2\n*E\n"})
    /* renamed from: com.carrefour.fid.android.analytics.utils.a$a */
    public static final class C13823a {
        public /* synthetic */ C13823a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final Map<String, String> mo32745a(@C12579k String[] strArr, @C12579k String str) {
            Intrinsics.checkNotNullParameter(strArr, "paramsToTrack");
            Intrinsics.checkNotNullParameter(str, "message");
            List<String> split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null);
            HashMap hashMap = new HashMap();
            for (String str2 : split$default) {
                for (String str3 : strArr) {
                    if (StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) str3, false, 2, (Object) null)) {
                        hashMap.put(str3, CollectionsKt___CollectionsKt.m40653k3(StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"="}, false, 0, 6, (Object) null)));
                    }
                }
            }
            return hashMap;
        }

        public C13823a() {
        }
    }

    @C12579k
    @C11384m
    /* renamed from: a */
    public static final Map<String, String> m58744a(@C12579k String[] strArr, @C12579k String str) {
        return f33725a.mo32745a(strArr, str);
    }
}
