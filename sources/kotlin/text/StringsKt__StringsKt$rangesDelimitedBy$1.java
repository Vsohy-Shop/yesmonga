package kotlin.text;

import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "", "currentIndex", "Lkotlin/Pair;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/Pair;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
public final class StringsKt__StringsKt$rangesDelimitedBy$1 extends Lambda implements C11304p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
    final /* synthetic */ char[] $delimiters;
    final /* synthetic */ boolean $ignoreCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$rangesDelimitedBy$1(char[] cArr, boolean z) {
        super(2);
        this.$delimiters = cArr;
        this.$ignoreCase = z;
    }

    @C12580l
    /* renamed from: a */
    public final Pair<Integer, Integer> mo23360a(@C12579k CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "$this$$receiver");
        int indexOfAny = StringsKt__StringsKt.indexOfAny(charSequence, this.$delimiters, i, this.$ignoreCase);
        if (indexOfAny < 0) {
            return null;
        }
        return C11078d1.m42659a(Integer.valueOf(indexOfAny), 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo23360a((CharSequence) obj, ((Number) obj2).intValue());
    }
}
