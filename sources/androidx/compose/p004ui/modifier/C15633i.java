package androidx.compose.p004ui.modifier;

import androidx.compose.p004ui.C8761g;
import com.google.firebase.remoteconfig.C33585u;
import com.google.firebase.remoteconfig.internal.C33541p;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nModifierLocalNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,220:1\n1#2:221\n11335#3:222\n11670#3,3:223\n37#4,2:226\n*S KotlinDebug\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNodeKt\n*L\n209#1:222\n209#1:223,3\n209#1:226,2\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.i */
public final class C15633i {
    @C8761g
    @C12579k
    /* renamed from: a */
    public static final C15631g m69516a() {
        return C15625b.f38768b;
    }

    @C8761g
    @C12579k
    /* renamed from: b */
    public static final <T> C15631g m69517b(@C12579k C15626c<T> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "key");
        return new C15639n(cVar);
    }

    @C8761g
    @C12579k
    /* renamed from: c */
    public static final <T> C15631g m69518c(@C12579k Pair<? extends C15626c<T>, ? extends T> pair) {
        Intrinsics.checkNotNullParameter(pair, C33541p.f81644a);
        C15639n nVar = new C15639n((C15626c) pair.mo21849e());
        nVar.mo44510c((C15626c) pair.mo21849e(), pair.mo21851f());
        return nVar;
    }

    @C8761g
    @C12579k
    /* renamed from: d */
    public static final C15631g m69519d(@C12579k C15626c<?>... cVarArr) {
        Intrinsics.checkNotNullParameter(cVarArr, "keys");
        ArrayList arrayList = new ArrayList(cVarArr.length);
        for (C15626c<?> a : cVarArr) {
            arrayList.add(C11078d1.m42659a(a, null));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        return new C15637l((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @C8761g
    @C12579k
    /* renamed from: e */
    public static final C15631g m69520e(@C12579k Pair<? extends C15626c<?>, ? extends Object>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, C33585u.C33588c.f81747z3);
        return new C15637l((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
