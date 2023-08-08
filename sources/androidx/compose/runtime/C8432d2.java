package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8423g;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.usabilla.sdk.ubform.net.C9851c;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,346:1\n1162#2:347\n1182#2:370\n1161#2,2:371\n460#3,11:348\n460#3,11:359\n48#3:373\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n*L\n311#1:347\n334#1:370\n334#1:371,2\n312#1:348,11\n316#1:359,11\n343#1:373\n*E\n"})
/* renamed from: androidx.compose.runtime.d2 */
public final /* synthetic */ class C8432d2 {
    @C12579k

    /* renamed from: a */
    public static final C8543g2<Integer> f22795a = new C8543g2<>();
    @C12579k

    /* renamed from: b */
    public static final C8543g2<C8423g<Pair<C11300l<C8404a0<?>, C11079d2>, C11300l<C8404a0<?>, C11079d2>>>> f22796b = new C8543g2<>();

    @C12579k
    /* renamed from: c */
    public static final <T> C8578k2<T> m30440c(@C12579k C8410b2<T> b2Var, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(b2Var, "policy");
        Intrinsics.checkNotNullParameter(aVar, "calculation");
        return new DerivedSnapshotState(aVar, b2Var);
    }

    @C12579k
    /* renamed from: d */
    public static final <T> C8578k2<T> m30441d(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "calculation");
        return new DerivedSnapshotState(aVar, (C8410b2) null);
    }

    /* renamed from: e */
    public static final <R> R m30442e(C8404a0<?> a0Var, C11289a<? extends R> aVar) {
        C8423g gVar = (C8423g) f22796b.mo16131a();
        int i = 0;
        if (gVar == null) {
            gVar = new C8423g(new Pair[0], 0);
        }
        int h0 = gVar.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = gVar.mo15462d0();
            int i2 = 0;
            do {
                ((C11300l) ((Pair) d0[i2]).mo21846a()).invoke(a0Var);
                i2++;
            } while (i2 < h0);
        }
        try {
            R invoke = aVar.invoke();
            C11322b0.m43481d(1);
            int h02 = gVar.mo15469h0();
            if (h02 > 0) {
                Object[] d02 = gVar.mo15462d0();
                do {
                    ((C11300l) ((Pair) d02[i]).mo21847b()).invoke(a0Var);
                    i++;
                } while (i < h02);
            }
            C11322b0.m43480c(1);
            return invoke;
        } catch (Throwable th) {
            C11322b0.m43481d(1);
            int h03 = gVar.mo15469h0();
            if (h03 > 0) {
                Object[] d03 = gVar.mo15462d0();
                do {
                    ((C11300l) ((Pair) d03[i]).mo21847b()).invoke(a0Var);
                    i++;
                } while (i < h03);
            }
            C11322b0.m43480c(1);
            throw th;
        }
    }

    /* renamed from: f */
    public static final <R> void m30443f(@C12579k C11300l<? super C8578k2<?>, C11079d2> lVar, @C12579k C11300l<? super C8578k2<?>, C11079d2> lVar2, @C12579k C11289a<? extends R> aVar) {
        Intrinsics.checkNotNullParameter(lVar, "start");
        Intrinsics.checkNotNullParameter(lVar2, C9851c.f26941l);
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        C8543g2<C8423g<Pair<C11300l<C8404a0<?>, C11079d2>, C11300l<C8404a0<?>, C11079d2>>>> g2Var = f22796b;
        C8423g a = g2Var.mo16131a();
        if (a == null) {
            a = new C8423g(new Pair[16], 0);
            g2Var.mo16132b(a);
        }
        try {
            a.mo15463e(C11078d1.m42659a(lVar, lVar2));
            aVar.invoke();
        } finally {
            a.mo15437D0(a.mo15469h0() - 1);
        }
    }
}
