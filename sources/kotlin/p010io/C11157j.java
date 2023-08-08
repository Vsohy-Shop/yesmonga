package kotlin.p010io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1549#2:149\n1620#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
/* renamed from: kotlin.io.j */
public class C11157j {
    @C12579k
    /* renamed from: a */
    public static final File m43068a(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new File(m43070c(file));
    }

    /* renamed from: b */
    public static final int m43069b(String str) {
        char c;
        int indexOf$default;
        int indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, File.separatorChar, 0, false, 4, (Object) null);
        if (indexOf$default2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != (c = File.separatorChar) || (indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, c, 2, false, 4, (Object) null)) < 0) {
                return 1;
            }
            int indexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) str, File.separatorChar, indexOf$default + 1, false, 4, (Object) null);
            if (indexOf$default3 >= 0) {
                return indexOf$default3 + 1;
            }
            return str.length();
        } else if (indexOf$default2 > 0 && str.charAt(indexOf$default2 - 1) == ':') {
            return indexOf$default2 + 1;
        } else {
            if (indexOf$default2 != -1 || !StringsKt__StringsKt.endsWith$default((CharSequence) str, (char) C12361b.f30257h, false, 2, (Object) null)) {
                return 0;
            }
            return str.length();
        }
    }

    @C12579k
    /* renamed from: c */
    public static final String m43070c(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "path");
        String substring = path.substring(0, m43069b(path2));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d */
    public static final boolean m43071d(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        if (m43069b(path) > 0) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: e */
    public static final File m43072e(@C12579k File file, int i, int i2) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return m43073f(file).mo22614j(i, i2);
    }

    @C12579k
    /* renamed from: f */
    public static final C11147g m43073f(@C12579k File file) {
        boolean z;
        List list;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        int b = m43069b(path);
        String substring = path.substring(0, b);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(b);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            list = CollectionsKt__CollectionsKt.m40441E();
        } else {
            Iterable<String> split$default = StringsKt__StringsKt.split$default((CharSequence) substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(split$default, 10));
            for (String file2 : split$default) {
                arrayList.add(new File(file2));
            }
            list = arrayList;
        }
        return new C11147g(new File(substring), list);
    }
}
