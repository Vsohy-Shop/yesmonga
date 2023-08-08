package androidx.work.impl;

import android.content.Context;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import com.urbanairship.iam.events.C9175a;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.b0 */
public final class C21103b0 {
    @C12579k

    /* renamed from: a */
    public static final C21103b0 f54475a = new C21103b0();

    @C11384m
    /* renamed from: d */
    public static final void m97691d(@C12579k Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C21103b0 b0Var = f54475a;
        if (b0Var.mo63213b(context).exists()) {
            C21377l.m98582e().mo63774a(C21136c0.f54583a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry next : b0Var.mo63215e(context).entrySet()) {
                File file = (File) next.getKey();
                File file2 = (File) next.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        C21377l.m98582e().mo63782l(C21136c0.f54583a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        str = "Migrated " + file + "to " + file2;
                    } else {
                        str = "Renaming " + file + " to " + file2 + " failed";
                    }
                    C21377l.m98582e().mo63774a(C21136c0.f54583a, str);
                }
            }
        }
    }

    @C12579k
    /* renamed from: a */
    public final File mo63212a(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        return mo63214c(context);
    }

    @C12579k
    /* renamed from: b */
    public final File mo63213b(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        File databasePath = context.getDatabasePath(C21136c0.f54584b);
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    @C0376v0(23)
    /* renamed from: c */
    public final File mo63214c(Context context) {
        return new File(C21100a.f54461a.mo63211a(context), C21136c0.f54584b);
    }

    @C12579k
    /* renamed from: e */
    public final Map<File, File> mo63215e(@C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        File b = mo63213b(context);
        File a = mo63212a(context);
        String[] a2 = C21136c0.f54585c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(a2.length), 16));
        for (String str : a2) {
            Pair a3 = C11078d1.m42659a(new File(b.getPath() + str), new File(a.getPath() + str));
            linkedHashMap.put(a3.mo21849e(), a3.mo21851f());
        }
        return C10977s0.m41474o0(linkedHashMap, C11078d1.m42659a(b, a));
    }
}
