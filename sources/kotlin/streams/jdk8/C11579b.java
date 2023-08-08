package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.C11665v0;
import kotlin.collections.C10956m;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "StreamsKt")
/* renamed from: kotlin.streams.jdk8.b */
public final class C11579b {

    @C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n31#2:681\n*E\n"})
    /* renamed from: kotlin.streams.jdk8.b$a */
    public static final class C11580a implements C11559m<T> {

        /* renamed from: a */
        public final /* synthetic */ Stream f28774a;

        public C11580a(Stream stream) {
            this.f28774a = stream;
        }

        @C12579k
        public Iterator<T> iterator() {
            Iterator<T> it = this.f28774a.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator()");
            return it;
        }
    }

    @C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n39#2:681\n*E\n"})
    /* renamed from: kotlin.streams.jdk8.b$b */
    public static final class C11581b implements C11559m<Integer> {

        /* renamed from: a */
        public final /* synthetic */ IntStream f28775a;

        public C11581b(IntStream intStream) {
            this.f28775a = intStream;
        }

        @C12579k
        public Iterator<Integer> iterator() {
            PrimitiveIterator.OfInt it = this.f28775a.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator()");
            return it;
        }
    }

    @C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n47#2:681\n*E\n"})
    /* renamed from: kotlin.streams.jdk8.b$c */
    public static final class C11582c implements C11559m<Long> {

        /* renamed from: a */
        public final /* synthetic */ LongStream f28776a;

        public C11582c(LongStream longStream) {
            this.f28776a = longStream;
        }

        @C12579k
        public Iterator<Long> iterator() {
            PrimitiveIterator.OfLong it = this.f28776a.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator()");
            return it;
        }
    }

    @C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n55#2:681\n*E\n"})
    /* renamed from: kotlin.streams.jdk8.b$d */
    public static final class C11583d implements C11559m<Double> {

        /* renamed from: a */
        public final /* synthetic */ DoubleStream f28777a;

        public C11583d(DoubleStream doubleStream) {
            this.f28777a = doubleStream;
        }

        @C12579k
        public Iterator<Double> iterator() {
            PrimitiveIterator.OfDouble it = this.f28777a.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator()");
            return it;
        }
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: b */
    public static final C11559m<Double> m44943b(@C12579k DoubleStream doubleStream) {
        Intrinsics.checkNotNullParameter(doubleStream, "<this>");
        return new C11583d(doubleStream);
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: c */
    public static final C11559m<Integer> m44944c(@C12579k IntStream intStream) {
        Intrinsics.checkNotNullParameter(intStream, "<this>");
        return new C11581b(intStream);
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: d */
    public static final C11559m<Long> m44945d(@C12579k LongStream longStream) {
        Intrinsics.checkNotNullParameter(longStream, "<this>");
        return new C11582c(longStream);
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: e */
    public static final <T> C11559m<T> m44946e(@C12579k Stream<T> stream) {
        Intrinsics.checkNotNullParameter(stream, "<this>");
        return new C11580a(stream);
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: f */
    public static final <T> Stream<T> m44947f(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Stream<T> stream = StreamSupport.stream(new C11578a(mVar), 16, false);
        Intrinsics.checkNotNullExpressionValue(stream, "stream({ Spliterators.sp…literator.ORDERED, false)");
        return stream;
    }

    /* renamed from: g */
    public static final Spliterator m44948g(C11559m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(mVar.iterator(), 16);
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: h */
    public static final List<Double> m44949h(@C12579k DoubleStream doubleStream) {
        Intrinsics.checkNotNullParameter(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray()");
        return C10956m.m41262p(array);
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: i */
    public static final List<Integer> m44950i(@C12579k IntStream intStream) {
        Intrinsics.checkNotNullParameter(intStream, "<this>");
        int[] array = intStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray()");
        return C10956m.m41276r(array);
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: j */
    public static final List<Long> m44951j(@C12579k LongStream longStream) {
        Intrinsics.checkNotNullParameter(longStream, "<this>");
        long[] array = longStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray()");
        return C10956m.m41283s(array);
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: k */
    public static final <T> List<T> m44952k(@C12579k Stream<T> stream) {
        Intrinsics.checkNotNullParameter(stream, "<this>");
        Object collect = stream.collect(Collectors.toList());
        Intrinsics.checkNotNullExpressionValue(collect, "collect(Collectors.toList<T>())");
        return (List) collect;
    }
}
