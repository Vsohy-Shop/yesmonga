package kotlin.text;

import kotlin.C11097g2;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.text.m */
public class C11615m {
    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: a */
    public static final Appendable m45252a(Appendable appendable) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(10);
        Intrinsics.checkNotNullExpressionValue(append, "append('\\n')");
        return append;
    }

    @C12579k
    public static final <T extends Appendable> T append(@C12579k T t, @C12579k CharSequence... charSequenceArr) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(charSequenceArr, "value");
        for (CharSequence append : charSequenceArr) {
            t.append(append);
        }
        return t;
    }

    public static final <T> void appendElement(@C12579k Appendable appendable, T t, @C12580l C11300l<? super T, ? extends CharSequence> lVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t));
            return;
        }
        if (t == null) {
            z = true;
        } else {
            z = t instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }

    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    @C12579k
    public static final <T extends Appendable> T appendRange(@C12579k T t, @C12579k CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "value");
        T append = t.append(charSequence, i, i2);
        Intrinsics.checkNotNull(append, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return append;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: b */
    public static final Appendable m45253b(Appendable appendable, char c) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(c);
        Intrinsics.checkNotNullExpressionValue(append, "append(value)");
        Appendable append2 = append.append(10);
        Intrinsics.checkNotNullExpressionValue(append2, "append('\\n')");
        return append2;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: c */
    public static final Appendable m45254c(Appendable appendable, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(append, "append(value)");
        Appendable append2 = append.append(10);
        Intrinsics.checkNotNullExpressionValue(append2, "append('\\n')");
        return append2;
    }
}
