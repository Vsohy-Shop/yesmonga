package androidx.work.impl.workers;

import androidx.work.C21377l;
import androidx.work.impl.model.C21229i;
import androidx.work.impl.model.C21230j;
import androidx.work.impl.model.C21239o;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21273x;
import androidx.work.impl.model.C21275z;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.work.impl.workers.d */
public final class C21366d {
    @C12579k

    /* renamed from: a */
    public static final String f55097a;

    static {
        String i = C21377l.m98584i("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(i, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f55097a = i;
    }

    /* renamed from: c */
    public static final String m98528c(C21249u uVar, String str, Integer num, String str2) {
        return 10 + uVar.f54804a + "\t " + uVar.f54806c + "\t " + num + "\t " + uVar.f54805b.name() + "\t " + str + "\t " + str2 + 9;
    }

    /* renamed from: d */
    public static final String m98529d(C21239o oVar, C21275z zVar, C21230j jVar, List<C21249u> list) {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t " + "Job Id" + "\t State\t Unique Name\t Tags\t");
        for (C21249u uVar : list) {
            C21229i a = jVar.mo63424a(C21273x.m98280a(uVar));
            if (a != null) {
                num = Integer.valueOf(a.f54776c);
            } else {
                num = null;
            }
            sb.append(m98528c(uVar, CollectionsKt___CollectionsKt.m40639h3(oVar.mo63443b(uVar.f54804a), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null), num, CollectionsKt___CollectionsKt.m40639h3(zVar.mo63383a(uVar.f54804a), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null)));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
