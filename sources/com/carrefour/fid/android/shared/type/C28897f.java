package com.carrefour.fid.android.shared.type;

import com.carrefour.fid.android.shared.type.C28892e;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nResultState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResultState.kt\ncom/carrefour/fid/android/shared/type/ResultStateKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n288#2,2:38\n*S KotlinDebug\n*F\n+ 1 ResultState.kt\ncom/carrefour/fid/android/shared/type/ResultStateKt\n*L\n34#1:38,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.shared.type.f */
public final class C28897f {
    @C12580l
    /* renamed from: a */
    public static final <T> Throwable m119477a(@C12579k List<? extends C28892e<? extends T>> list) {
        Object obj;
        C28892e.C28893a aVar;
        C28892e.C28893a aVar2;
        Throwable th;
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C28892e eVar = (C28892e) obj;
            if (eVar instanceof C28892e.C28893a) {
                aVar2 = (C28892e.C28893a) eVar;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                th = aVar2.mo84083d();
            } else {
                th = null;
            }
            if (th != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (obj instanceof C28892e.C28893a) {
            aVar = (C28892e.C28893a) obj;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.mo84083d();
        }
        return null;
    }

    @C12580l
    /* renamed from: b */
    public static final <T> T m119478b(@C12579k C28892e<? extends T> eVar) {
        C28892e.C28895c cVar;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof C28892e.C28895c) {
            cVar = (C28892e.C28895c) eVar;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.mo84088d();
        }
        return null;
    }

    /* renamed from: c */
    public static final <T> boolean m119479c(@C12579k C28892e<? extends T> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if ((eVar instanceof C28892e.C28896d) || (eVar instanceof C28892e.C28894b)) {
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: d */
    public static final <T, R> C28892e<R> m119480d(@C12579k C28892e<? extends T> eVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        if (eVar instanceof C28892e.C28893a) {
            return new C28892e.C28893a(((C28892e.C28893a) eVar).mo84083d());
        }
        C28892e<R> eVar2 = C28892e.C28894b.f70781b;
        if (!Intrinsics.areEqual((Object) eVar, (Object) eVar2)) {
            if (eVar instanceof C28892e.C28895c) {
                eVar2 = new C28892e.C28895c<>(lVar.invoke(((C28892e.C28895c) eVar).mo84088d()));
            } else {
                C28892e.C28896d dVar = C28892e.C28896d.f70785b;
                if (Intrinsics.areEqual((Object) eVar, (Object) dVar)) {
                    return dVar;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return eVar2;
    }
}
