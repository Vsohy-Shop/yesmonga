package kotlinx.serialization.builtins;

import androidx.exifinterface.media.C19135a;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.C11400l1;
import kotlin.C11419p1;
import kotlin.C11531s;
import kotlin.C11588t1;
import kotlin.C11679z1;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.C11324c0;
import kotlin.jvm.internal.C11332g0;
import kotlin.jvm.internal.C11341l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11354n;
import kotlin.jvm.internal.C11358p;
import kotlin.jvm.internal.C11359p0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.C11369u;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.C12200d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12273g0;
import kotlinx.serialization.internal.C12275h;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12284k;
import kotlinx.serialization.internal.C12287l;
import kotlinx.serialization.internal.C12289l1;
import kotlinx.serialization.internal.C12291m0;
import kotlinx.serialization.internal.C12296o;
import kotlinx.serialization.internal.C12297o0;
import kotlinx.serialization.internal.C12299p;
import kotlinx.serialization.internal.C12304q1;
import kotlinx.serialization.internal.C12307r1;
import kotlinx.serialization.internal.C12308s;
import kotlinx.serialization.internal.C12309s0;
import kotlinx.serialization.internal.C12310s1;
import kotlinx.serialization.internal.C12311t;
import kotlinx.serialization.internal.C12312t0;
import kotlinx.serialization.internal.C12320v1;
import kotlinx.serialization.internal.C12321w;
import kotlinx.serialization.internal.C12323w1;
import kotlinx.serialization.internal.C12324x;
import kotlinx.serialization.internal.C12326x1;
import kotlinx.serialization.internal.C12330y1;
import kotlinx.serialization.internal.C12332z0;
import kotlinx.serialization.internal.C12333z1;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.builtins.a */
public final class C12197a {
    @C12579k
    /* renamed from: A */
    public static final C12248g<Double> m48795A(@C12579k C11369u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return C12311t.f30119a;
    }

    @C12579k
    /* renamed from: B */
    public static final C12248g<Float> m48796B(@C12579k C11377x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return C12324x.f30145a;
    }

    @C12579k
    /* renamed from: C */
    public static final C12248g<Integer> m48797C(@C12579k C11324c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return C12276h0.f30067a;
    }

    @C12579k
    /* renamed from: D */
    public static final C12248g<Long> m48798D(@C12579k C11332g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        return C12312t0.f30121a;
    }

    @C12579k
    /* renamed from: E */
    public static final C12248g<Short> m48799E(@C12579k C11359p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        return C12307r1.f30113a;
    }

    @C12579k
    /* renamed from: F */
    public static final C12248g<String> m48800F(@C12579k C11368t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return C12310s1.f30117a;
    }

    @C12200d
    @C12579k
    /* renamed from: a */
    public static final <T, E extends T> C12248g<E[]> m48801a(@C12579k C11494d<T> dVar, @C12579k C12248g<E> gVar) {
        Intrinsics.checkNotNullParameter(dVar, "kClass");
        Intrinsics.checkNotNullParameter(gVar, "elementSerializer");
        return new C12289l1(dVar, gVar);
    }

    @C12200d
    /* renamed from: b */
    public static final /* synthetic */ <T, E extends T> C12248g<E[]> m48802b(C12248g<E> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "elementSerializer");
        Intrinsics.reifiedOperationMarker(4, C19135a.f48928d5);
        return m48801a(C11342l0.m43547d(Object.class), gVar);
    }

    @C12579k
    /* renamed from: c */
    public static final C12248g<boolean[]> m48803c() {
        return C12275h.f30066c;
    }

    @C12579k
    /* renamed from: d */
    public static final C12248g<byte[]> m48804d() {
        return C12284k.f30079c;
    }

    @C12579k
    /* renamed from: e */
    public static final C12248g<char[]> m48805e() {
        return C12296o.f30093c;
    }

    @C12579k
    /* renamed from: f */
    public static final C12248g<double[]> m48806f() {
        return C12308s.f30115c;
    }

    @C12579k
    /* renamed from: g */
    public static final C12248g<float[]> m48807g() {
        return C12321w.f30142c;
    }

    @C12579k
    /* renamed from: h */
    public static final C12248g<int[]> m48808h() {
        return C12273g0.f30064c;
    }

    @C12579k
    /* renamed from: i */
    public static final <T> C12248g<List<T>> m48809i(@C12579k C12248g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "elementSerializer");
        return new C12269f(gVar);
    }

    @C12579k
    /* renamed from: j */
    public static final C12248g<long[]> m48810j() {
        return C12309s0.f30116c;
    }

    @C12579k
    /* renamed from: k */
    public static final <K, V> C12248g<Map.Entry<K, V>> m48811k(@C12579k C12248g<K> gVar, @C12579k C12248g<V> gVar2) {
        Intrinsics.checkNotNullParameter(gVar, "keySerializer");
        Intrinsics.checkNotNullParameter(gVar2, "valueSerializer");
        return new MapEntrySerializer(gVar, gVar2);
    }

    @C12579k
    /* renamed from: l */
    public static final <K, V> C12248g<Map<K, V>> m48812l(@C12579k C12248g<K> gVar, @C12579k C12248g<V> gVar2) {
        Intrinsics.checkNotNullParameter(gVar, "keySerializer");
        Intrinsics.checkNotNullParameter(gVar2, "valueSerializer");
        return new C12291m0(gVar, gVar2);
    }

    @C12579k
    /* renamed from: m */
    public static final <K, V> C12248g<Pair<K, V>> m48813m(@C12579k C12248g<K> gVar, @C12579k C12248g<V> gVar2) {
        Intrinsics.checkNotNullParameter(gVar, "keySerializer");
        Intrinsics.checkNotNullParameter(gVar2, "valueSerializer");
        return new PairSerializer(gVar, gVar2);
    }

    @C12579k
    /* renamed from: n */
    public static final <T> C12248g<Set<T>> m48814n(@C12579k C12248g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "elementSerializer");
        return new C12297o0(gVar);
    }

    @C12579k
    /* renamed from: o */
    public static final C12248g<short[]> m48815o() {
        return C12304q1.f30108c;
    }

    @C12579k
    /* renamed from: p */
    public static final <A, B, C> C12248g<Triple<A, B, C>> m48816p(@C12579k C12248g<A> gVar, @C12579k C12248g<B> gVar2, @C12579k C12248g<C> gVar3) {
        Intrinsics.checkNotNullParameter(gVar, "aSerializer");
        Intrinsics.checkNotNullParameter(gVar2, "bSerializer");
        Intrinsics.checkNotNullParameter(gVar3, "cSerializer");
        return new TripleSerializer(gVar, gVar2, gVar3);
    }

    @C12579k
    /* renamed from: q */
    public static final <T> C12248g<T> m48817q(@C12579k C12248g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar.getDescriptor().mo24821b()) {
            return gVar;
        }
        return new C12332z0(gVar);
    }

    /* renamed from: r */
    public static /* synthetic */ void m48818r(C12248g gVar) {
    }

    @C11531s
    @C12200d
    @C12579k
    /* renamed from: s */
    public static final C12248g<C11400l1> m48819s(@C12579k C11400l1.C11401a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return C12320v1.f30140a;
    }

    @C11531s
    @C12200d
    @C12579k
    /* renamed from: t */
    public static final C12248g<C11419p1> m48820t(@C12579k C11419p1.C11420a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return C12323w1.f30143a;
    }

    @C11531s
    @C12200d
    @C12579k
    /* renamed from: u */
    public static final C12248g<C11588t1> m48821u(@C12579k C11588t1.C11589a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return C12326x1.f30147a;
    }

    @C11531s
    @C12200d
    @C12579k
    /* renamed from: v */
    public static final C12248g<C11679z1> m48822v(@C12579k C11679z1.C11680a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return C12330y1.f30151a;
    }

    @C12579k
    /* renamed from: w */
    public static final C12248g<C11079d2> m48823w(@C12579k C11079d2 d2Var) {
        Intrinsics.checkNotNullParameter(d2Var, "<this>");
        return C12333z1.f30155b;
    }

    @C12579k
    /* renamed from: x */
    public static final C12248g<Boolean> m48824x(@C12579k C11341l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return C12278i.f30070a;
    }

    @C12579k
    /* renamed from: y */
    public static final C12248g<Byte> m48825y(@C12579k C11354n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return C12287l.f30083a;
    }

    @C12579k
    /* renamed from: z */
    public static final C12248g<Character> m48826z(@C12579k C11358p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        return C12299p.f30095a;
    }
}
