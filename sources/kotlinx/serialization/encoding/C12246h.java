package kotlinx.serialization.encoding;

import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Collection;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.encoding.h */
public final class C12246h {
    /* renamed from: a */
    public static final void m49064a(@C12579k C12244g gVar, @C12579k C12217f fVar, int i, @C12579k C11300l<? super C12239d, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C12239d j = gVar.mo24913j(fVar, i);
        lVar.invoke(j);
        j.mo24907c(fVar);
    }

    /* renamed from: b */
    public static final <E> void m49065b(@C12579k C12244g gVar, @C12579k C12217f fVar, @C12579k Collection<? extends E> collection, @C12579k C11305q<? super C12239d, ? super Integer, ? super E, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(qVar, C28534f.f69159i0);
        C12239d j = gVar.mo24913j(fVar, collection.size());
        int i = 0;
        for (Object next : collection) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            qVar.invoke(j, Integer.valueOf(i), next);
            i = i2;
        }
        j.mo24907c(fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m49066c(@org.jetbrains.annotations.C12579k kotlinx.serialization.encoding.C12244g r1, @org.jetbrains.annotations.C12579k kotlinx.serialization.descriptors.C12217f r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super kotlinx.serialization.encoding.C12239d, kotlin.C11079d2> r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlinx.serialization.encoding.d r1 = r1.mo24906b(r2)
            r0 = 1
            r3.invoke(r1)     // Catch:{ all -> 0x0021 }
            kotlin.jvm.internal.C11322b0.m43481d(r0)
            r1.mo24907c(r2)
            kotlin.jvm.internal.C11322b0.m43480c(r0)
            return
        L_0x0021:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r1 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r0)
            kotlin.jvm.internal.C11322b0.m43480c(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.encoding.C12246h.m49066c(kotlinx.serialization.encoding.g, kotlinx.serialization.descriptors.f, kotlin.jvm.functions.l):void");
    }
}
