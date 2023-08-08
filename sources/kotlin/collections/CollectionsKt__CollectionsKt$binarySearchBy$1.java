package kotlin.collections;

import kotlin.C11076d0;
import kotlin.comparisons.C11006g;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"T", "", "K", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,471:1\n*E\n"})
public final class CollectionsKt__CollectionsKt$binarySearchBy$1 extends Lambda implements C11300l<T, Integer> {
    final /* synthetic */ K $key;
    final /* synthetic */ C11300l<T, K> $selector;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionsKt__CollectionsKt$binarySearchBy$1(C11300l<? super T, ? extends K> lVar, K k) {
        super(1);
        this.$selector = lVar;
        this.$key = k;
    }

    @C12579k
    /* renamed from: a */
    public final Integer invoke(T t) {
        return Integer.valueOf(C11006g.m42424l((Comparable) this.$selector.invoke(t), this.$key));
    }
}
