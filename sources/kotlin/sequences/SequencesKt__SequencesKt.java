package kotlin.sequences;

import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11078d1;
import kotlin.C11665v0;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.C11045c;
import kotlin.internal.C11110f;
import kotlin.internal.C11112h;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public class SequencesKt__SequencesKt extends C11565r {

    @C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n*L\n1#1,680:1\n*E\n"})
    /* renamed from: kotlin.sequences.SequencesKt__SequencesKt$a */
    public static final class C11534a implements C11559m<T> {

        /* renamed from: a */
        public final /* synthetic */ C11289a<Iterator<T>> f28664a;

        public C11534a(C11289a<? extends Iterator<? extends T>> aVar) {
            this.f28664a = aVar;
        }

        @C12579k
        public Iterator<T> iterator() {
            return this.f28664a.invoke();
        }
    }

    @C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,680:1\n30#2:681\n*E\n"})
    /* renamed from: kotlin.sequences.SequencesKt__SequencesKt$b */
    public static final class C11535b implements C11559m<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterator f28665a;

        public C11535b(Iterator it) {
            this.f28665a = it;
        }

        @C12579k
        public Iterator<T> iterator() {
            return this.f28665a;
        }
    }

    @C11110f
    /* renamed from: d */
    public static final <T> C11559m<T> m44587d(C11289a<? extends Iterator<? extends T>> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "iterator");
        return new C11534a(aVar);
    }

    @C12579k
    /* renamed from: e */
    public static final <T> C11559m<T> m44588e(@C12579k Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return m44589f(new C11535b(it));
    }

    @C12579k
    /* renamed from: f */
    public static final <T> C11559m<T> m44589f(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (mVar instanceof C11540a) {
            return mVar;
        }
        return new C11540a(mVar);
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C11559m<T> m44590g() {
        return C11548g.f28709a;
    }

    @C12579k
    /* renamed from: h */
    public static final <T, C, R> C11559m<R> m44591h(@C12579k C11559m<? extends T> mVar, @C12579k C11304p<? super Integer, ? super T, ? extends C> pVar, @C12579k C11300l<? super C, ? extends Iterator<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "source");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        Intrinsics.checkNotNullParameter(lVar, "iterator");
        return C11563q.m44902b(new SequencesKt__SequencesKt$flatMapIndexed$1(mVar, pVar, lVar, (C11045c<? super SequencesKt__SequencesKt$flatMapIndexed$1>) null));
    }

    @C12579k
    /* renamed from: i */
    public static final <T> C11559m<T> m44592i(@C12579k C11559m<? extends C11559m<? extends T>> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m44593j(mVar, SequencesKt__SequencesKt$flatten$1.f28666f);
    }

    /* renamed from: j */
    public static final <T, R> C11559m<R> m44593j(C11559m<? extends T> mVar, C11300l<? super T, ? extends Iterator<? extends R>> lVar) {
        if (mVar instanceof C11574w) {
            return ((C11574w) mVar).mo23290e(lVar);
        }
        return new C11551i(mVar, SequencesKt__SequencesKt$flatten$3.f28668f, lVar);
    }

    @C11314h(name = "flattenSequenceOfIterable")
    @C12579k
    /* renamed from: k */
    public static final <T> C11559m<T> m44594k(@C12579k C11559m<? extends Iterable<? extends T>> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m44593j(mVar, SequencesKt__SequencesKt$flatten$2.f28667f);
    }

    @C11112h
    @C12579k
    /* renamed from: l */
    public static final <T> C11559m<T> m44595l(@C12580l T t, @C12579k C11300l<? super T, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "nextFunction");
        if (t == null) {
            return C11548g.f28709a;
        }
        return new C11553j(new SequencesKt__SequencesKt$generateSequence$2(t), lVar);
    }

    @C12579k
    /* renamed from: m */
    public static final <T> C11559m<T> m44596m(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "nextFunction");
        return m44589f(new C11553j(aVar, new SequencesKt__SequencesKt$generateSequence$1(aVar)));
    }

    @C12579k
    /* renamed from: n */
    public static final <T> C11559m<T> m44597n(@C12579k C11289a<? extends T> aVar, @C12579k C11300l<? super T, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(aVar, "seedFunction");
        Intrinsics.checkNotNullParameter(lVar, "nextFunction");
        return new C11553j(aVar, lVar);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: o */
    public static final <T> C11559m<T> m44598o(@C12579k C11559m<? extends T> mVar, @C12579k C11289a<? extends C11559m<? extends T>> aVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        return C11563q.m44902b(new SequencesKt__SequencesKt$ifEmpty$1(mVar, aVar, (C11045c<? super SequencesKt__SequencesKt$ifEmpty$1>) null));
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: p */
    public static final <T> C11559m<T> m44599p(C11559m<? extends T> mVar) {
        return mVar == null ? m44590g() : mVar;
    }

    @C12579k
    /* renamed from: q */
    public static final <T> C11559m<T> m44600q(@C12579k T... tArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m44590g();
        }
        return ArraysKt___ArraysKt.m39956l6(tArr);
    }

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: r */
    public static final <T> C11559m<T> m44601r(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m44602s(mVar, Random.f28564a);
    }

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: s */
    public static final <T> C11559m<T> m44602s(@C12579k C11559m<? extends T> mVar, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        return C11563q.m44902b(new SequencesKt__SequencesKt$shuffled$1(mVar, random, (C11045c<? super SequencesKt__SequencesKt$shuffled$1>) null));
    }

    @C12579k
    /* renamed from: t */
    public static final <T, R> Pair<List<T>, List<R>> m44603t(@C12579k C11559m<? extends Pair<? extends T, ? extends R>> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : mVar) {
            arrayList.add(pair.mo21849e());
            arrayList2.add(pair.mo21851f());
        }
        return C11078d1.m42659a(arrayList, arrayList2);
    }
}
