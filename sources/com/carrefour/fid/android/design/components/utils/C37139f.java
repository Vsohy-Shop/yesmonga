package com.carrefour.fid.android.design.components.utils;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 String.kt\ncom/carrefour/fid/android/design/components/utils/StringKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1064#2,2:53\n1099#2,3:57\n1747#3,2:55\n1749#3:60\n*S KotlinDebug\n*F\n+ 1 String.kt\ncom/carrefour/fid/android/design/components/utils/StringKt\n*L\n33#1:53,2\n33#1:57,3\n33#1:55,2\n33#1:60\n*E\n"})
/* renamed from: com.carrefour.fid.android.design.components.utils.f */
public final class C37139f {
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m152213a(@org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k java.lang.String r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "cardNumber"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = r0
        L_0x000c:
            int r2 = r7.length()
            r3 = 1
            if (r1 >= r2) goto L_0x0022
            char r2 = r7.charAt(r1)
            boolean r2 = java.lang.Character.isDigit(r2)
            if (r2 != 0) goto L_0x001f
            r1 = r0
            goto L_0x0023
        L_0x001f:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0022:
            r1 = r3
        L_0x0023:
            if (r1 == 0) goto L_0x00ac
            java.util.Set r1 = kotlin.text.StringsKt___StringsKt.toSet(r7)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x003a
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x003a
        L_0x0038:
            r1 = r0
            goto L_0x006f
        L_0x003a:
            java.util.Iterator r1 = r1.iterator()
        L_0x003e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r1.next()
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r4 = r0
            r5 = r4
        L_0x0050:
            int r6 = r7.length()
            if (r4 >= r6) goto L_0x0066
            char r6 = r7.charAt(r4)
            if (r6 != r2) goto L_0x005e
            r6 = r3
            goto L_0x005f
        L_0x005e:
            r6 = r0
        L_0x005f:
            if (r6 == 0) goto L_0x0063
            int r5 = r5 + 1
        L_0x0063:
            int r4 = r4 + 1
            goto L_0x0050
        L_0x0066:
            r2 = 3
            if (r5 < r2) goto L_0x006b
            r2 = r3
            goto L_0x006c
        L_0x006b:
            r2 = r0
        L_0x006c:
            if (r2 == 0) goto L_0x003e
            r1 = r3
        L_0x006f:
            if (r1 != 0) goto L_0x00ac
            r1 = 2
            r2 = 0
            boolean r4 = kotlin.text.C11622t.startsWith$default(r8, r7, r0, r1, r2)
            if (r4 != 0) goto L_0x00ac
            boolean r8 = kotlin.text.C11622t.endsWith$default(r8, r7, r0, r1, r2)
            if (r8 == 0) goto L_0x0080
            goto L_0x00ac
        L_0x0080:
            int r8 = r7.length()
            int r8 = r8 - r1
            r1 = r0
        L_0x0086:
            if (r1 >= r8) goto L_0x00ab
            char r2 = r7.charAt(r1)
            int r4 = r1 + 1
            char r5 = r7.charAt(r4)
            int r1 = r1 + 2
            char r1 = r7.charAt(r1)
            int r6 = r2 + 1
            if (r6 != r5) goto L_0x00a0
            int r6 = r5 + 1
            if (r6 == r1) goto L_0x00a8
        L_0x00a0:
            int r2 = r2 + -1
            if (r2 != r5) goto L_0x00a9
            int r5 = r5 + -1
            if (r5 != r1) goto L_0x00a9
        L_0x00a8:
            return r0
        L_0x00a9:
            r1 = r4
            goto L_0x0086
        L_0x00ab:
            return r3
        L_0x00ac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.utils.C37139f.m152213a(java.lang.String, java.lang.String):boolean");
    }

    @C12580l
    /* renamed from: b */
    public static final SpannableStringBuilder m152214b(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str2, "textToBold");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(!C11622t.isBlank(str2))) {
            return spannableStringBuilder.append(str);
        }
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        int length = str2.length() + indexOf$default;
        spannableStringBuilder.append(str);
        if (indexOf$default < 0 || length < 0 || indexOf$default < 0 || length < 0) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf$default, length, 0);
        return spannableStringBuilder;
    }

    @C12579k
    /* renamed from: c */
    public static final String m152215c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("[[,]\\[\\][ ]]").mo23336m(str, "");
    }
}
