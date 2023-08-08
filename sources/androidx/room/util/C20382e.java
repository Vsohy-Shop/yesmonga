package androidx.room.util;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11314h(name = "StringUtil")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.util.e */
public final class C20382e {
    @C12579k
    @C11287e

    /* renamed from: a */
    public static final String[] f52562a = new String[0];

    /* renamed from: a */
    public static final void m95155a(@C12579k StringBuilder sb, int i) {
        Intrinsics.checkNotNullParameter(sb, "builder");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m95156b() {
    }

    @C12580l
    /* renamed from: c */
    public static final String m95157c(@C12580l List<Integer> list) {
        if (list != null) {
            return CollectionsKt___CollectionsKt.m40639h3(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null);
        }
        return null;
    }

    @C12579k
    /* renamed from: d */
    public static final StringBuilder m95158d() {
        return new StringBuilder();
    }

    @C12580l
    /* renamed from: e */
    public static final List<Integer> m95159e(@C12580l String str) {
        List<String> split$default;
        Integer num;
        if (str == null || (split$default = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{','}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String parseInt : split$default) {
            try {
                num = Integer.valueOf(Integer.parseInt(parseInt));
            } catch (NumberFormatException unused) {
                num = null;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }
}
